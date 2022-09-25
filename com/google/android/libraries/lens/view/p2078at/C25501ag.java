package com.google.android.libraries.lens.view.p2078at;

import android.content.Context;
import android.os.Build;

/* renamed from: com.google.android.libraries.lens.view.at.ag */
/* compiled from: PG */
public final /* synthetic */ class C25501ag {
    /* renamed from: a */
    public static String m46966a(Context context) {
        return (Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 33) ? "android.permission.READ_EXTERNAL_STORAGE" : "android.permission.READ_MEDIA_IMAGES";
    }
}
