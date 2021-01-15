package com.shengde.e3mall.service;

import com.shengde.e3mall.common.pojo.EasyUITreeNode;

import java.util.List;

public interface ItemCatService {

    List<EasyUITreeNode> getItemCatlist(int parentId);
}
