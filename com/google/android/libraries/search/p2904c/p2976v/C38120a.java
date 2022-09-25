package com.google.android.libraries.search.p2904c.p2976v;

import android.content.Context;
import android.os.Process;

/* renamed from: com.google.android.libraries.search.c.v.a */
/* compiled from: PG */
public final class C38120a {
    /* renamed from: a */
    public static boolean m67297a(Context context) {
        return context.getPackageManager().checkPermission("android.permission.CAPTURE_AUDIO_HOTWORD", context.getPackageName()) == 0;
    }

    /* renamed from: b */
    public static boolean m67298b(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (RuntimeException unused) {
        }
    }
}
