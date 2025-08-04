package com.aliyun.oss.Service;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.config.OssProperties;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;
import java.util.UUID;

public class OssService {

    private final OSS ossClient;
    private final OssProperties ossProperties;

    public OssService(OssProperties ossProperties) {
        this.ossProperties = ossProperties;
        this.ossClient = new OSSClientBuilder().build(
                ossProperties.getEndpoint(),
                ossProperties.getKeyId(),
                ossProperties.getKeySecret()
        );
    }

    public String uploadFileAvatar(MultipartFile file) throws Exception {
        InputStream inputStream = file.getInputStream();
        String fileName = UUID.randomUUID().toString().replaceAll("-", "") + file.getOriginalFilename();

        ossClient.putObject(ossProperties.getBucketName(), fileName, inputStream);

        return "https://" + ossProperties.getBucketName() + "." + ossProperties.getEndpoint() + "/" + fileName;
    }

    public String downloadFile(String objectName) throws Exception {
        String localFile = "D://" + objectName;
        ossClient.getObject(new GetObjectRequest(ossProperties.getBucketName(), objectName), new File(localFile));
        return "文件下载完成";
    }
}
