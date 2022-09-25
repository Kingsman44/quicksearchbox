package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: androidx.core.app.k */
/* compiled from: PG */
public final class C1824k {
    /* renamed from: a */
    static int m4997a(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* renamed from: b */
    public static int m4998b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* renamed from: c */
    public static Object m4999c(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    /* renamed from: d */
    public static String m5000d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
