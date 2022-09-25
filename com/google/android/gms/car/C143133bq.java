package com.google.android.gms.car;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.car.bq */
/* compiled from: PG */
public final class C143133bq {

    /* renamed from: a */
    private static final List f388193a = Collections.unmodifiableList(Arrays.asList(new String[]{"com.google.android.projection.bumblebee", "com.google.android.projection.gearhead"}));

    /* renamed from: a */
    public static Context m232184a(Context context) {
        String str;
        boolean z = !"user".equals(Build.TYPE);
        String packageName = context.getPackageName();
        List list = f388193a;
        if (list.contains(packageName)) {
            str = context.getPackageName();
        } else {
            ComponentName resolveActivity = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.CAR_DOCK").resolveActivity(context.getPackageManager());
            if (resolveActivity != null && list.contains(resolveActivity.getPackageName())) {
                try {
                    String packageName2 = resolveActivity.getPackageName();
                    C143160cp.m232264a(context, packageName2, z);
                    str = packageName2;
                } catch (PackageManager.NameNotFoundException | SecurityException unused) {
                }
            }
            ArrayList arrayList = null;
            for (String str2 : f388193a) {
                try {
                    C143160cp.m232264a(context, str2, z);
                    str = str2;
                } catch (PackageManager.NameNotFoundException e) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(e);
                }
            }
            IllegalStateException illegalStateException = new IllegalStateException("Android Auto is not installed!");
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(illegalStateException, new Object[]{(Exception) arrayList.get(i)});
                    } catch (Exception unused2) {
                    }
                }
            }
            throw illegalStateException;
        }
        if (context.getPackageName().equals(str)) {
            return context;
        }
        try {
            return context.createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalStateException("NameNotFoundException looking up ".concat(String.valueOf(str)), e2);
        }
    }
}
