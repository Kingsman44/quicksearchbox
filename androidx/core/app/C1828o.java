package androidx.core.app;

import android.app.Activity;
import android.content.Intent;

/* renamed from: androidx.core.app.o */
/* compiled from: PG */
public final class C1828o {
    /* renamed from: a */
    static Intent m5007a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    /* renamed from: b */
    public static boolean m5008b(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }

    /* renamed from: c */
    public static boolean m5009c(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
