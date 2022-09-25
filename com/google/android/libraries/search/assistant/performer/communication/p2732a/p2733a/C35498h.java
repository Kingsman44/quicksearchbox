package com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a;

import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C35498h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C35505o f93223a;

    public /* synthetic */ C35498h(C35505o oVar) {
        this.f93223a = oVar;
    }

    public final void run() {
        C35505o oVar = this.f93223a;
        synchronized (oVar.f93231d) {
            if (!oVar.mo39680c()) {
                oVar.mo39679b();
                oVar.f93235h.f93243g.mo39707a(C62722b.DEADLINE_EXCEEDED);
            } else {
                throw new IllegalStateException("Call connect timeout future executed after call connected.");
            }
        }
    }
}
