package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import com.google.assistant.p3739a.p3740a.C48098ce;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.p */
/* compiled from: PG */
public final /* synthetic */ class C94998p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95005w f265766a;

    /* renamed from: b */
    public final /* synthetic */ C95004v f265767b;

    /* renamed from: c */
    public final /* synthetic */ C95007y f265768c;

    /* renamed from: d */
    public final /* synthetic */ C48098ce f265769d;

    public /* synthetic */ C94998p(C95005w wVar, C95004v vVar, C95007y yVar, C48098ce ceVar) {
        this.f265766a = wVar;
        this.f265767b = vVar;
        this.f265768c = yVar;
        this.f265769d = ceVar;
    }

    public final void run() {
        C95005w wVar = this.f265766a;
        C95004v vVar = this.f265767b;
        C95007y yVar = this.f265768c;
        C48098ce ceVar = this.f265769d;
        if (vVar == C95004v.WAITING_FOR_FINAL_RECOGNIZED_TEXT) {
            wVar.mo88911b((C95007y) null, C95004v.WAITING_FOR_QUERY_RESPONSE);
            yVar.mo88811b((String) null);
            return;
        }
        yVar.mo88815f(ceVar);
        wVar.mo88910a();
    }
}
