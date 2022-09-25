package androidx.p111g.p113b;

import android.text.Editable;
import androidx.p111g.p112a.C2257e;

/* renamed from: androidx.g.b.d */
/* compiled from: PG */
final class C2261d extends Editable.Factory {

    /* renamed from: a */
    private static final Object f6352a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f6353b;

    /* renamed from: c */
    private static Class f6354c;

    private C2261d() {
        try {
            f6354c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static Editable.Factory m6175a() {
        if (f6353b == null) {
            synchronized (f6352a) {
                if (f6353b == null) {
                    f6353b = new C2261d();
                }
            }
        }
        return f6353b;
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f6354c;
        if (cls != null) {
            return new C2257e(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
