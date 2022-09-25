package androidx.p054b.p055a.p056a;

import java.util.concurrent.Executor;

/* renamed from: androidx.b.a.a.b */
/* compiled from: PG */
public final class C0883b extends C0886e {

    /* renamed from: a */
    public static final Executor f2956a = new C0882a();

    /* renamed from: c */
    private static volatile C0883b f2957c;

    /* renamed from: b */
    public final C0886e f2958b;

    /* renamed from: d */
    private final C0886e f2959d;

    private C0883b() {
        C0885d dVar = new C0885d();
        this.f2959d = dVar;
        this.f2958b = dVar;
    }

    /* renamed from: a */
    public static C0883b m2768a() {
        if (f2957c != null) {
            return f2957c;
        }
        synchronized (C0883b.class) {
            if (f2957c == null) {
                f2957c = new C0883b();
            }
        }
        return f2957c;
    }

    /* renamed from: b */
    public final boolean mo3495b() {
        throw null;
    }
}
