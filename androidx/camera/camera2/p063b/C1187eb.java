package androidx.camera.camera2.p063b;

import android.os.Handler;
import androidx.camera.camera2.p063b.p064a.p067c.C1048f;
import androidx.camera.camera2.p063b.p064a.p067c.C1049g;
import androidx.camera.camera2.p063b.p064a.p067c.C1060r;
import androidx.camera.core.p069a.C1347cg;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.camera2.b.eb */
/* compiled from: PG */
final class C1187eb {

    /* renamed from: a */
    public final Executor f3496a;

    /* renamed from: b */
    public final ScheduledExecutorService f3497b;

    /* renamed from: c */
    public final Handler f3498c;

    /* renamed from: d */
    public final C1151ct f3499d;

    /* renamed from: e */
    public final C1347cg f3500e;

    /* renamed from: f */
    public final C1347cg f3501f;

    /* renamed from: g */
    public final boolean f3502g;

    public C1187eb(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C1151ct ctVar, C1347cg cgVar, C1347cg cgVar2) {
        this.f3496a = executor;
        this.f3497b = scheduledExecutorService;
        this.f3498c = handler;
        this.f3499d = ctVar;
        this.f3500e = cgVar;
        this.f3501f = cgVar2;
        boolean z = true;
        if (!new C1049g(cgVar, cgVar2).mo3780b() && !new C1060r(cgVar).f3196a && !new C1048f(cgVar2).mo3778a()) {
            z = false;
        }
        this.f3502g = z;
    }
}
