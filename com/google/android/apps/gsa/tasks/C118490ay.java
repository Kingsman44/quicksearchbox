package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.tasks.ay */
/* compiled from: PG */
public final /* synthetic */ class C118490ay implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118491az f328881a;

    public /* synthetic */ C118490ay(C118491az azVar) {
        this.f328881a = azVar;
    }

    public final void run() {
        C118491az azVar = this.f328881a;
        List d = azVar.mo103720d();
        if (d != null) {
            azVar.f328883a.mo103738b(C118575h.VBT_ROOT_TASK_AMOUNT_JOBSCHED, (long) d.size());
            azVar.f328883a.mo103737a();
        }
    }
}
