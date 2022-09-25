package com.google.android.apps.search.googleapp.customtabs.features.appactions;

import com.google.android.libraries.appactions.serviceengine.api.C147873f;
import com.google.android.libraries.appactions.serviceengine.api.C147874g;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.x */
/* compiled from: PG */
final class C133805x implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C133806y f364450a;

    public C133805x(C133806y yVar) {
        this.f364450a = yVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C133806y.f364451a.mo56226d()).mo56382g(th)).mo56372aa(40135)).mo56386p("Error occurred while executing suggestion. Check PortSE connection?");
        C147874g gVar = this.f364450a.f364453c;
        if (gVar != null) {
            gVar.mo111400b(C37182a.f98141hB.mo40806d(), C62722b.INTERNAL);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((C147873f) obj).mo124529a() != C52235kf.OK) {
            ((C59052c) ((C59052c) C133806y.f364451a.mo56226d()).mo56372aa(40137)).mo56386p("Error occurred while executing suggestion.");
        }
        C147874g gVar = this.f364450a.f364453c;
        if (gVar != null) {
            gVar.mo111400b(C37182a.f98141hB.mo40806d(), C62722b.OK);
        }
    }
}
