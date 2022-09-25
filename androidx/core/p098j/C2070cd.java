package androidx.core.p098j;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: androidx.core.j.cd */
/* compiled from: PG */
final class C2070cd {

    /* renamed from: a */
    public static Field f5969a;

    /* renamed from: b */
    public static Field f5970b;

    /* renamed from: c */
    public static Field f5971c;

    /* renamed from: d */
    public static boolean f5972d = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f5969a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f5970b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f5971c = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
