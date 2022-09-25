package p5488io.grpc;

import java.io.InputStream;

/* renamed from: io.grpc.db */
/* compiled from: PG */
final class C70331db {

    /* renamed from: a */
    private final C70294cw f187475a;

    /* renamed from: b */
    private final Object f187476b;

    /* renamed from: c */
    private volatile byte[] f187477c;

    public C70331db(C70294cw cwVar, Object obj) {
        this.f187475a = cwVar;
        this.f187476b = obj;
    }

    /* renamed from: a */
    public static C70294cw m102571a(C70297cz czVar) {
        Class<C70294cw> cls = C70294cw.class;
        return cls.isInstance(czVar.f187372c) ? cls.cast(czVar.f187372c) : null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final InputStream mo62022b() {
        return this.f187475a.mo61753a(this.f187476b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final byte[] mo62023c() {
        if (this.f187477c == null) {
            synchronized (this) {
                if (this.f187477c == null) {
                    this.f187477c = C70334de.m102578l(mo62022b());
                }
            }
        }
        return this.f187477c;
    }
}
