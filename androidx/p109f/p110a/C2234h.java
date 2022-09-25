package androidx.p109f.p110a;

import androidx.p060c.C0984n;
import java.util.ArrayList;

/* renamed from: androidx.f.a.h */
/* compiled from: PG */
public final class C2234h {

    /* renamed from: j */
    private static final ThreadLocal f6295j = new ThreadLocal();

    /* renamed from: a */
    public final C0984n f6296a = new C0984n(0);

    /* renamed from: b */
    final ArrayList f6297b = new ArrayList();

    /* renamed from: c */
    public final C2228b f6298c = new C2228b(this);

    /* renamed from: d */
    public final Runnable f6299d = new C2227a(this);

    /* renamed from: e */
    long f6300e = 0;

    /* renamed from: f */
    public boolean f6301f = false;

    /* renamed from: g */
    public float f6302g = 1.0f;

    /* renamed from: h */
    public final C2233g f6303h;

    /* renamed from: i */
    public C2231e f6304i;

    public C2234h(C2233g gVar) {
        this.f6303h = gVar;
    }

    /* renamed from: a */
    static C2234h m6125a() {
        ThreadLocal threadLocal = f6295j;
        if (threadLocal.get() == null) {
            threadLocal.set(new C2234h(new C2233g()));
        }
        return (C2234h) threadLocal.get();
    }
}
