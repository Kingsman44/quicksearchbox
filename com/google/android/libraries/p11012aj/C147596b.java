package com.google.android.libraries.p11012aj;

import android.app.Application;
import android.os.Process;

/* renamed from: com.google.android.libraries.aj.b */
/* compiled from: PG */
public final class C147596b {

    /* renamed from: a */
    private static String f398401a;

    /* renamed from: b */
    private static Boolean f398402b;

    /* renamed from: a */
    public static boolean m240670a() {
        if (f398402b == null) {
            f398402b = Boolean.valueOf(Process.isApplicationUid(Process.myUid()));
        }
        return f398402b.booleanValue();
    }

    /* renamed from: b */
    public static String m240671b() {
        String str = f398401a;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        f398401a = processName;
        return processName;
    }
}
