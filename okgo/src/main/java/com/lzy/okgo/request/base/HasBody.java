/*
 * Copyright 2016 jeasonlzy(廖子尧)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lzy.okgo.request.base;

import com.lzy.okgo.model.HttpParams;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.List;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * ================================================
 * 作    者：jeasonlzy（廖子尧）Github地址：https://github.com/jeasonlzy
 * 版    本：1.0
 * 创建日期：16/8/9
 * 描    述：表示当前请求是否具有请求体
 * 修订历史：
 * ================================================
 */
public interface HasBody<R> {

    R isMultipart(boolean isMultipart);

    R isSpliceUrl(boolean isSpliceUrl);

    R params(String key, File file, boolean... isReplace);

    R params(String key, File file, String fileName, boolean... isReplace);

    R params(String key, File file, String fileName, MediaType contentType, boolean... isReplace);

    R paramsFileMap(Map<String, File> params, boolean... isReplace);

    R paramsFileList(String key, List<File> files, boolean... isReplace);

    R paramsFileWrapperList(String key, List<HttpParams.FileWrapper> fileWrappers, boolean... isReplace);

    R paramsQuery(String key, String value, boolean... isReplace);

    R paramsQuery(String key, int value, boolean... isReplace);

    R paramsQuery(String key, float value, boolean... isReplace);

    R paramsQuery(String key, double value, boolean... isReplace);

    R paramsQuery(String key, long value, boolean... isReplace);

    R paramsQuery(String key, char value, boolean... isReplace);

    R paramsQuery(String key, boolean value, boolean... isReplace);

    R paramsQueryStringMap(Map<String, String> params, boolean... isReplace);

    R paramsQueryStringList(String key, List<String> values, boolean... isReplace);

    R upString(String string);

    R upString(String string, MediaType mediaType);

    R upJson(String json);

    R upJson(JSONObject jsonObject);

    R upJson(JSONArray jsonArray);

    R upBytes(byte[] bs);

    R upBytes(byte[] bs, MediaType mediaType);

    R upFile(File file);

    R upFile(File file, MediaType mediaType);

    R upRequestBody(RequestBody requestBody);
}
