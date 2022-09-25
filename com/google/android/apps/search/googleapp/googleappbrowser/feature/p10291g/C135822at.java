package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import com.google.android.libraries.appactions.serviceengine.api.C147873f;
import com.google.android.libraries.appactions.serviceengine.api.C147874g;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.at */
/* compiled from: PG */
final class C135822at implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C135824av f369944a;

    public C135822at(C135824av avVar) {
        this.f369944a = avVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C135824av.f369951a.mo56226d()).mo56382g(th)).mo56372aa(40625)).mo56386p("Error occurred while executing suggestion. Check PortSE connection?");
        C147874g gVar = this.f369944a.f369953c;
        if (gVar != null) {
            gVar.mo111400b(C37182a.f98141hB.mo40806d(), C62722b.INTERNAL);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((C147873f) obj).mo124529a() != C52235kf.OK) {
            ((C59052c) ((C59052c) C135824av.f369951a.mo56226d()).mo56372aa(40627)).mo56386p("Error occurred while executing suggestion.");
        }
        C147874g gVar = this.f369944a.f369953c;
        if (gVar != null) {
            gVar.mo111400b(C37182a.f98141hB.mo40806d(), C62722b.OK);
        }
    }
}
