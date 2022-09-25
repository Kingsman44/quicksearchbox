package androidx.core.p098j;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.core.j.ap */
/* compiled from: PG */
public abstract class C2022ap {

    /* renamed from: a */
    private final int f5935a;

    /* renamed from: b */
    private final Class f5936b;

    /* renamed from: c */
    private final int f5937c;

    /* renamed from: d */
    private final int f5938d;

    public C2022ap(int i, Class cls) {
        this(i, cls, 0, 28);
    }

    public C2022ap(int i, Class cls, int i2, int i3) {
        this.f5935a = i;
        this.f5936b = cls;
        this.f5938d = i2;
        this.f5937c = i3;
    }

    /* renamed from: f */
    static final boolean m5380f(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    /* renamed from: g */
    private final boolean m5381g() {
        return Build.VERSION.SDK_INT >= this.f5937c;
    }

    /* renamed from: a */
    public abstract Object mo5179a(View view);

    /* renamed from: b */
    public abstract void mo5180b(View view, Object obj);

    /* renamed from: c */
    public boolean mo5181c(Object obj, Object obj2) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Object mo5185d(View view) {
        if (m5381g()) {
            return mo5179a(view);
        }
        Object tag = view.getTag(this.f5935a);
        if (this.f5936b.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    /* renamed from: e */
    public final void mo5186e(View view, Object obj) {
        if (m5381g()) {
            mo5180b(view, obj);
        } else if (mo5181c(mo5185d(view), obj)) {
            C2043bi.m5514H(view);
            view.setTag(this.f5935a, obj);
            C2043bi.m5515I(view, this.f5938d);
        }
    }
}
