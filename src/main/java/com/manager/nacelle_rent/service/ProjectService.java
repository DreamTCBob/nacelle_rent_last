package com.manager.nacelle_rent.service;

import com.alibaba.fastjson.JSONObject;
import com.manager.nacelle_rent.entity.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface ProjectService {
    List<Project> getProjectList(int flag);
    List<Project> getProjectListByKey(String keyWord, int flag, int pageNum);
    List<Project> getProjectByVague(String subString);
    List<JSONObject> getProjectListAll();
    List<JSONObject> getProjectList2(int flag);
    JSONObject getAllProjectByAdmin(String userId);
    List<JSONObject> getStoreList(int flag);
    List<JSONObject> getAlarmInfo(int type, String value);
    List<JSONObject> getElectricBoxStop(int type, String value);
    List<JSONObject> getPlaneGraphInfo(String projectId, String buildingNum, int type);
    List<User> getUserList(String projectId);
    ElectricBoxState getBoxLog(String deviceId);
    String getBasketList(String projectId);
    String getWorkerList(String projectId);
    JSONObject getProjectDetail(String projectId) throws Exception;
    boolean checkProject(String projectId);
    boolean editProjectDepartment(String projectId,String adminAreaId,String adminProjectId);
    String increaseBox(String projectId, String boxId);
    String increaseWorker(String projectId, String userId);
//    String getProjectId(String userId);
    String getProjectIdByAdmin(String userId);
    String pushConfigurationList(Map<String, String> list);
    String handleConfigurationList(Map<String, String> list);
    String getConfigurationList(String projectId);
    boolean beginWork(String projectId, String userId, String boxId);
    boolean endWork(String projectId,String userId, String boxId);
    int storageControl(String projectId, String deviceId, String managerId,String image, int storageState);
    int installApply(String projectId, int picNum, String managerId);
    int beginProject(String projectId, String storageList, String managerId);
    int prepareEnd(String projectId, String storageList);
    int applyEnd(String projectId, int picNum, String managerId);
    int createCompany(Map<String,String> map);
    int createExceptionBox(String deviceId, String projectId, String managerId, String reason);
    int createProjectSupInfo(ProjectSupInfo projectSupInfo);
    int createRepairBox(Map<String,String> repair);
    int createRepairEndBox(Map<String,String> repair);
    int createInstallInfo(String projectId, String userId, String deviceList);
    int uploadPlaneGraph(InputStream file, String projectId, int num , int type);
    int uploadPlaneGraphInfo(JSONObject info, String projectId, String buildingNum, int type);
    int deleteProject(String projectId);
    int getRepairBoxNum(String projectId);
    List<RepairBoxInfo> getRepairBox(String projectId);
    List<RepairBoxInfo> getRepairBoxOne(String deviceId);
    List<RepairBoxInfo> getRepairEndBoxOne(String deviceId);
    JSONObject getStoreInInfo(String projectId, String deviceId, String managerId);
    JSONObject getBeginWorkInfo(String projectId, int picNum, String managerId);
    JSONObject getStoreCertInfo(String projectId, int picNum, String managerId);
    JSONObject getEndWorkInfo(String projectId, int picNum, String managerId);
    JSONObject getStorageSum(int userFlag);
    JSONObject getStorageInfo(String deviceId);
    JSONObject getWorker(int type, String deviceId);
    int storageIn(String projectId, String deviceId);
}
