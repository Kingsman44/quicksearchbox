package com.google.android.libraries.notifications.platform.entrypoints.job;

import android.content.Context;
import androidx.work.C4632m;
import androidx.work.C4643x;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.android.apps.gsa.binaries.satin.app.C74201oq;
import com.google.android.libraries.notifications.platform.entrypoints.job.p2316a.p2317a.C30101c;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2313e.C30090a;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class GnpWorker extends CoroutineWorker {

    /* renamed from: g */
    public C30101c f81422g;

    /* renamed from: h */
    private final WorkerParameters f81423h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GnpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C69664n.m101061g(context, "appContext");
        C69664n.m101061g(workerParameters, "workerParams");
        this.f81423h = workerParameters;
    }

    /* renamed from: c */
    public final Object mo9298c(C69577g gVar) {
        C69464a aVar = (C69464a) C30090a.m55914a(this.f13999c).mo35488eA().get(GnpWorker.class);
        if (aVar != null) {
            Object b = aVar.mo17428b();
            C69664n.m101059e(b, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.internal.inject.Injector<com.google.android.libraries.notifications.platform.entrypoints.job.GnpWorker>");
            C30101c cVar = (C30101c) ((C74201oq) b).f207203a.b.f200504ko.mo17428b();
            this.f81422g = cVar;
            if (cVar == null) {
                C69664n.m101065k("gnpWorkerHandler");
                cVar = null;
            }
            C4632m mVar = this.f81423h.f13989b;
            C69664n.m101060f(mVar, "workerParams.inputData");
            return cVar.mo35489a(mVar, this.f81423h.f13991d, gVar);
        }
        C30058b.m55796h("GnpWorker", "Failed to inject dependencies.", new Object[0]);
        return new C4643x(C4632m.f14549a);
    }
}
