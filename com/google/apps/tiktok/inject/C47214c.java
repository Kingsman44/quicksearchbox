package com.google.apps.tiktok.inject;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.apps.tiktok.inject.c */
/* compiled from: PG */
public final /* synthetic */ class C47214c {
    /* renamed from: a */
    public static boolean m83984a(Intent intent, Context context) {
        return intent.getPackage() != null && intent.getPackage().equals(context.getPackageName());
    }
}
