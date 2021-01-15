package com.shengde.e3mall.controller;

import com.shengde.content.service.ContentCateGoryService;
import com.shengde.e3mall.common.pojo.EasyUITreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 内容分类管理
 */
public class ContentCatController {

    @Autowired
    ContentCateGoryService contentCateGoryService;

    @RequestMapping("/content/category/list")
    @ResponseBody
    public List<EasyUITreeNode> getContentCatList(@RequestParam(name = "id",defaultValue = "0") int parentId){
        List<EasyUITreeNode> list = contentCateGoryService.getContentCatList(parentId);
        return list;
    }

}
