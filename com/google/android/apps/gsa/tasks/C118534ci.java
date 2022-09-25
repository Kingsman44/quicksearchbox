package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.search.core.p6494aa.p6497b.C84390b;
import com.google.common.base.C58838bb;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.tasks.ci */
/* compiled from: PG */
public final class C118534ci extends C118533ch {

    /* renamed from: a */
    private final C118827a f329123a;

    /* renamed from: b */
    private final C68214a f329124b;

    public C118534ci(C118827a aVar, C68214a aVar2) {
        this.f329123a = aVar;
        this.f329124b = aVar2;
    }

    /* renamed from: a */
    public final void mo103737a() {
        ((C84390b) this.f329124b.mo27525b()).f229647a.mo104028b();
    }

    /* renamed from: b */
    public final void mo103738b(C118575h hVar, long j) {
        this.f329123a.mo77944g(C118569b.BACKGROUND_TASK_COUNT, hVar).mo104025g(j);
    }

    /* renamed from: c */
    public final void mo103739c(C118575h hVar, C118522by byVar, long j) {
        C118569b bVar = C118569b.BACKGROUND_TASK_DURATION_MILLIS;
        C118575h a = C118532cg.m196778a(byVar);
        C58838bb.m90868c(j > 0);
        C118837d.m197250d(this.f329123a.mo77945h(bVar, a, hVar), j);
    }

    /* renamed from: d */
    public final void mo103740d(C118522by byVar, long j) {
        this.f329123a.mo77945h(C118569b.BACKGROUND_TASK_COUNT, C118532cg.m196778a(byVar), C118575h.VBT_ROOT_MAX_SEQUENTIAL_EXEC_COUNT).mo104025g(j);
    }

    /* renamed from: e */
    public final void mo103741e(C118575h hVar, long j) {
        boolean z = j > 0;
        C118569b bVar = C118569b.BACKGROUND_TASK_SCHEDULE_MILLIS;
        C58838bb.m90868c(z);
        C118837d.m197250d(this.f329123a.mo77944g(bVar, hVar), j);
    }

    /* renamed from: f */
    public final void mo103742f(C118522by byVar) {
        this.f329123a.mo77945h(C118569b.BACKGROUND_TASK_STOP_COUNT, C118532cg.m196778a(byVar), C118575h.VBT_ROOT_TASK_STOPPED).mo104025g(1);
    }

    /* renamed from: g */
    public final void mo103743g(C118522by byVar, long j) {
        this.f329123a.mo77945h(C118569b.BACKGROUND_TASK_EXTRAS_SIZE_BYTES, C118532cg.m196778a(byVar), C118575h.VBT_ROOT_EXTRAS_SIZE).mo104025g(j);
    }

    /* renamed from: h */
    public final void mo103744h() {
        ((C84390b) this.f329124b.mo27525b()).mo77951c();
    }
}
