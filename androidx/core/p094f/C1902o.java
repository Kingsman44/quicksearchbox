package androidx.core.p094f;

import android.content.Context;
import android.os.UserManager;

/* renamed from: androidx.core.f.o */
/* compiled from: PG */
public final class C1902o {
    /* renamed from: a */
    public static boolean m5170a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
