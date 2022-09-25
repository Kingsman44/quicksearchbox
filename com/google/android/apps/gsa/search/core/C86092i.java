package com.google.android.apps.gsa.search.core;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.ArrayMap;
import androidx.core.content.p090a.C1846a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.i */
/* compiled from: PG */
public final class C86092i {

    /* renamed from: a */
    private static final C59071e f232692a = C59071e.m91332i("com.google.android.apps.gsa.search.core.i");

    /* renamed from: a */
    public static Map m138434a(PackageManager packageManager, String[] strArr) {
        PackageInfo packageInfo;
        ArrayMap arrayMap = new ArrayMap();
        int length = strArr.length;
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            try {
                packageInfo = packageManager.getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException e) {
                ((C59052c) ((C59052c) ((C59052c) f232692a.mo56226d()).mo56382g(e)).mo56372aa(7383)).mo56389s("Exception while fetching versionCode for package[%s].", str);
                packageInfo = null;
            }
            if (packageInfo != null) {
                arrayMap.put(str, Long.valueOf(C1846a.m5060a(packageInfo)));
            } else {
                ((C59052c) ((C59052c) f232692a.mo56226d()).mo56372aa(7382)).mo56389s("Failed to fetch versionCode for package[%s].", str);
            }
        }
        return arrayMap;
    }
}
