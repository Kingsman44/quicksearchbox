package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: androidx.core.app.l */
/* compiled from: PG */
public final class C1825l {
    /* renamed from: a */
    public static int m5001a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* renamed from: b */
    public static AppOpsManager m5002b(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    /* renamed from: c */
    public static String m5003c(Context context) {
        return context.getOpPackageName();
    }
}
