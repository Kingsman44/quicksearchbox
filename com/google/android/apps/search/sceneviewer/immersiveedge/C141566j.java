package com.google.android.apps.search.sceneviewer.immersiveedge;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.search.sceneviewer.immersiveedge.j */
/* compiled from: PG */
public final class C141566j {

    /* renamed from: a */
    public static final C58528ij f384241a = C58528ij.m90015O("demo1", "demo2", "demo3", "demo4", "demo5", "demo6", "demo7", "demo8", "demo9", "demo10");

    /* renamed from: a */
    public static boolean m229772a(String str) {
        String host;
        if (!TextUtils.isEmpty(str) && (host = Uri.parse("https://".concat(String.valueOf(str))).getHost()) != null && host.endsWith("streamplease.net")) {
            return true;
        }
        return false;
    }
}
