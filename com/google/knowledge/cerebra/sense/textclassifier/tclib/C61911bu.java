package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.UserManager;
import android.view.textclassifier.TextClassifier;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bu */
/* compiled from: PG */
final class C61911bu extends C61923cf {

    /* renamed from: a */
    public final TextClassifier f167383a;

    public C61911bu(Context context, TextClassifier textClassifier) {
        Bundle bundle;
        textClassifier.getClass();
        this.f167383a = textClassifier;
        if (C61903bm.f167377a == null) {
            int i = C61902bl.f167376a;
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            Object systemService = applicationContext.getSystemService("user");
            if (systemService instanceof UserManager) {
                bundle = ((UserManager) systemService).getUserRestrictions();
            } else {
                bundle = new Bundle();
            }
            applicationContext.getClass();
            packageManager.getClass();
            bundle.getClass();
            C61903bm.f167377a = new C61903bm();
        }
    }
}
