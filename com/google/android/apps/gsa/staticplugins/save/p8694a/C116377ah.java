package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.ah */
/* compiled from: PG */
final class C116377ah implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C116381al f322709a;

    public C116377ah(C116381al alVar) {
        this.f322709a = alVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C116381al.f322713a.mo56225c()).mo56382g(th)).mo56372aa(31785)).mo56386p("Unable to fetch lists.");
        this.f322709a.mo102675q(th, 720910);
        C116381al alVar = this.f322709a;
        alVar.mo102679u(alVar.f322716d.getString(R.string.save_save_network_error), true);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        this.f322709a.mo102681w();
    }
}
