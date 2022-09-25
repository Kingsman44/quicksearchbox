package androidx.work;

import androidx.work.impl.C4538c;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.work.e */
/* compiled from: PG */
public final class C4409e {

    /* renamed from: a */
    public final Executor f14061a;

    /* renamed from: b */
    public final Executor f14062b;

    /* renamed from: c */
    public final C4405bb f14063c;

    /* renamed from: d */
    public final C4640u f14064d;

    /* renamed from: e */
    public final C4392ap f14065e;

    /* renamed from: f */
    public final C4637r f14066f;

    /* renamed from: g */
    public final String f14067g;

    /* renamed from: h */
    public final int f14068h;

    /* renamed from: i */
    public final int f14069i;

    /* renamed from: j */
    public final int f14070j;

    public C4409e(C4407c cVar) {
        Executor executor = cVar.f14053a;
        if (executor == null) {
            this.f14061a = m12598a(false);
        } else {
            this.f14061a = executor;
        }
        Executor executor2 = cVar.f14055c;
        if (executor2 == null) {
            this.f14062b = m12598a(true);
        } else {
            this.f14062b = executor2;
        }
        C4405bb bbVar = cVar.f14054b;
        if (bbVar == null) {
            this.f14063c = C4405bb.m12594c();
        } else {
            this.f14063c = bbVar;
        }
        this.f14064d = new C4639t();
        C4392ap apVar = cVar.f14056d;
        this.f14065e = apVar == null ? new C4538c() : apVar;
        this.f14068h = cVar.f14059g;
        this.f14069i = Integer.MAX_VALUE;
        this.f14070j = cVar.f14060h;
        this.f14066f = cVar.f14057e;
        this.f14067g = cVar.f14058f;
    }

    /* renamed from: a */
    private static final Executor m12598a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new C4403b(z));
    }
}
