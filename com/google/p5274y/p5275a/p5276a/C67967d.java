package com.google.p5274y.p5275a.p5276a;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.y.a.a.d */
/* compiled from: PG */
public final class C67967d {

    /* renamed from: a */
    private static final C67965b f184188a = C67965b.f184182b;

    /* renamed from: a */
    public static C67965b m98227a(PackageManager packageManager, String str) {
        packageManager.getClass();
        str.getClass();
        Intent intent = new Intent("com.google.android.build.data.Properties");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 787072);
        if (queryIntentServices.isEmpty()) {
            return f184188a;
        }
        if (queryIntentServices.size() <= 1) {
            int i = queryIntentServices.get(0).serviceInfo.metaData.getInt("com.google.android.build.data.properties");
            if (i == 0) {
                return f184188a;
            }
            try {
                return (C67965b) C62942bv.parseFrom((C62942bv) C67965b.f184182b, packageManager.getResourcesForApplication(str).openRawResource(i), C62921ba.f169869a);
            } catch (PackageManager.NameNotFoundException unused) {
                return f184188a;
            }
        } else {
            throw new IOException("Failed to resolve target AndroidBuildData");
        }
    }
}
