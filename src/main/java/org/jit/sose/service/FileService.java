package org.jit.sose.service;

import org.jit.sose.dto.FileDto;

import java.util.List;

public interface FileService {

    //查找某一用户所有状态的文件
    List<FileDto> queryPersonAll(String fileNewName, String fileOwner);

    //查询某一用户的某一种状态的文件
    List<FileDto> selectByFileStatus(String username, String fileStatus);

    //查找某一用户的所有文件信息
    List<FileDto> fileLitByPeron(String username,String fileStatus);

    //上传文件信息
    boolean upFile(FileDto fileDto);

    //按文件名(原名)查找匹配文件
    List<FileDto> selectByFileOriginalName(String fileOriginalName, String fileOwner,String fileStatus);

    //删除文件名某一个文件(逻辑删除)
    boolean deleteFileByName(String fileNewName,String fileOwner,String fileStatus);

    //按文件名(新名)查找匹配文件
    FileDto selectByFileNewName(String fileOriginalName,String fileOwner,String fileStatus);

}
