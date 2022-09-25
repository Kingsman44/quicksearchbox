package androidx.emoji.widget;

import android.text.Editable;

/* renamed from: androidx.emoji.widget.d */
/* compiled from: PG */
final class C2220d extends Editable.Factory {

    /* renamed from: a */
    private static final Object f6274a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f6275b;

    /* renamed from: c */
    private static Class f6276c;

    private C2220d() {
        try {
            f6276c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static Editable.Factory m6114a() {
        if (f6275b == null) {
            synchronized (f6274a) {
                if (f6275b == null) {
                    f6275b = new C2220d();
                }
            }
        }
        return f6275b;
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f6276c;
        if (cls != null) {
            return new C2226j(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
