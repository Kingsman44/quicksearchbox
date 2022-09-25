package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.webview.C87260f;
import com.google.android.apps.gsa.shared.p7066m.C90117fo;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.bd */
/* compiled from: PG */
public final /* synthetic */ class C118141bd implements C118161bx {

    /* renamed from: a */
    public final /* synthetic */ C118152bo f327901a;

    /* renamed from: b */
    public final /* synthetic */ C87260f f327902b;

    public /* synthetic */ C118141bd(C118152bo boVar, C87260f fVar) {
        this.f327901a = boVar;
        this.f327902b = fVar;
    }

    /* renamed from: a */
    public final void mo103558a() {
        C118152bo boVar = this.f327901a;
        C87260f fVar = this.f327902b;
        C59104x c = C118152bo.f327920a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaWebViewPool");
        ((C59052c) ((C59052c) c).mo56372aa(33831)).mo56386p("JavaScript evaluation timed out!");
        C90875ai.m148465b(C118124an.f327871a, fVar.mo80875a(), boVar.f327927f, "Kill process on JS timeout").mo85223a(C118125ao.f327872a);
        boVar.f327927f.mo28213m("Kill process on JS timeout", boVar.f327924c.mo79743a(C90117fo.f250753i), C118126ap.f327873a);
    }
}
