package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a;

import com.google.android.libraries.home.coreui.devicetile.C23659ae;
import com.google.android.libraries.home.coreui.devicetile.model.C23738m;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c.a.c */
/* compiled from: PG */
public final class C129150c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C23659ae f354775a;

    public C129150c(C23659ae aeVar) {
        this.f354775a = aeVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C129152e.f354781a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(38231));
        cVar.mo56386p("Parameter set request failed");
        this.f354775a.mo29010a(C23738m.FAIL);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f354775a.mo29010a(C23738m.OK);
    }
}
