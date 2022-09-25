package androidx.camera.core.p069a;

import androidx.camera.core.p069a.p070a.p072b.C1255d;
import androidx.p104d.p105a.C2164c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* renamed from: androidx.camera.core.a.bf */
/* compiled from: PG */
final class C1319bf implements C1255d {

    /* renamed from: a */
    final /* synthetic */ C2164c f3790a;

    /* renamed from: b */
    final /* synthetic */ ScheduledFuture f3791b;

    public C1319bf(C2164c cVar, ScheduledFuture scheduledFuture) {
        this.f3790a = cVar;
        this.f3791b = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
        this.f3790a.mo5437b(Collections.unmodifiableList(Collections.emptyList()));
        this.f3791b.cancel(true);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        this.f3790a.mo5437b(new ArrayList((List) obj));
        this.f3791b.cancel(true);
    }
}
