package androidx.core.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.core.app.d */
/* compiled from: PG */
final class C1817d {
    /* renamed from: a */
    static boolean m4987a(Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    /* renamed from: b */
    static boolean m4988b(Activity activity, String str) {
        try {
            PackageManager packageManager = activity.getApplication().getPackageManager();
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(packageManager, new Object[]{str})).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
