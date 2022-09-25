package androidx.camera.core.p069a;

import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.a.be */
/* compiled from: PG */
public final /* synthetic */ class C1318be implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ List f3787a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledExecutorService f3788b;

    /* renamed from: c */
    public final /* synthetic */ Executor f3789c;

    public /* synthetic */ C1318be(List list, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f3787a = list;
        this.f3788b = scheduledExecutorService;
        this.f3789c = executor;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        List list = this.f3787a;
        ScheduledExecutorService scheduledExecutorService = this.f3788b;
        Executor executor = this.f3789c;
        C60870cx d = C1263l.m3432d(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new C1316bc(executor, d, cVar), 5000, TimeUnit.MILLISECONDS);
        cVar.mo5436a(new C1317bd(d), executor);
        C1263l.m3436h(d, new C1319bf(cVar, schedule), executor);
        return "surfaceList";
    }
}
