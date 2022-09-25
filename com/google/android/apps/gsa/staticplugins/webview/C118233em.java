package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22872h;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.em */
/* compiled from: PG */
public final /* synthetic */ class C118233em implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328234a;

    /* renamed from: b */
    public final /* synthetic */ C85452b f328235b;

    /* renamed from: c */
    public final /* synthetic */ long f328236c;

    public /* synthetic */ C118233em(C118248fa faVar, C85452b bVar, long j) {
        this.f328234a = faVar;
        this.f328235b = bVar;
        this.f328236c = j;
    }

    public final void run() {
        C118248fa faVar = this.f328234a;
        C85452b bVar = this.f328235b;
        C118241eu euVar = new C118241eu(faVar, faVar.mo103651C(bVar).f327788G.f235736a, this.f328236c);
        if (!C22872h.m42744d(C86593a.class)) {
            faVar.f328279h.mo28212l("sendAttachWebViewEventForConfig", euVar);
        } else {
            euVar.run();
        }
    }
}
