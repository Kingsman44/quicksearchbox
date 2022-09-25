package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.x */
/* compiled from: PG */
public final /* synthetic */ class C102224x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C102226z f285232a;

    /* renamed from: b */
    public final /* synthetic */ View f285233b;

    public /* synthetic */ C102224x(C102226z zVar, View view) {
        this.f285232a = zVar;
        this.f285233b = view;
    }

    public final void run() {
        C102226z zVar = this.f285232a;
        View view = this.f285233b;
        if (view != null) {
            C101763c cVar = new C101763c();
            cVar.mo92556b(1);
            C47393f.m84237h(cVar.mo92555a(), view);
            return;
        }
        C59104x c = C102226z.f285236a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VMConsentFragmentPeer");
        C59052c cVar2 = (C59052c) c;
        cVar2.mo56380ai(C58979ad.FULL);
        ((C59052c) cVar2.mo56372aa(20637)).mo56389s("The cancel button should not be null! fragment.getView() is %s", zVar.f285238b.getView());
    }
}
