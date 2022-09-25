package androidx.camera.camera2.p063b;

import androidx.camera.camera2.p063b.p064a.p067c.C1051i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.camera2.b.bh */
/* compiled from: PG */
final class C1112bh {

    /* renamed from: a */
    public static final long f3303a = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: j */
    private static final long f3304j = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: b */
    public final int f3305b;

    /* renamed from: c */
    public final Executor f3306c;

    /* renamed from: d */
    public final C1217t f3307d;

    /* renamed from: e */
    public final C1051i f3308e;

    /* renamed from: f */
    public final boolean f3309f;

    /* renamed from: g */
    public long f3310g = f3304j;

    /* renamed from: h */
    final List f3311h = new ArrayList();

    /* renamed from: i */
    public final C1113bi f3312i = new C1110bf(this);

    public C1112bh(int i, Executor executor, C1217t tVar, boolean z, C1051i iVar) {
        this.f3305b = i;
        this.f3306c = executor;
        this.f3307d = tVar;
        this.f3309f = z;
        this.f3308e = iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3871a(C1113bi biVar) {
        this.f3311h.add(biVar);
    }
}
