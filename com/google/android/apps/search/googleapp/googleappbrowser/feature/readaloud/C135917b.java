package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud;

import com.google.android.libraries.p11016ak.C147729k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.b */
/* compiled from: PG */
final class C135917b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f370172a;

    /* renamed from: b */
    final /* synthetic */ String f370173b;

    /* renamed from: c */
    final /* synthetic */ C135924c f370174c;

    public C135917b(C135924c cVar, long j, String str) {
        this.f370174c = cVar;
        this.f370172a = j;
        this.f370173b = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f370174c.mo112625b(C62722b.INTERNAL, false, this.f370172a);
        ((C59052c) ((C59052c) C135924c.f370187a.mo56225c()).mo56372aa(40634)).mo56386p("CheckUrl failure.");
        this.f370174c.f370188b.remove(this.f370173b);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C147729k kVar = (C147729k) obj;
        C135924c cVar = this.f370174c;
        C62722b bVar = C62722b.OK;
        boolean z = false;
        if (kVar != null && kVar.f398644a) {
            z = true;
        }
        cVar.mo112625b(bVar, z, this.f370172a);
        this.f370174c.f370188b.remove(this.f370173b);
    }
}
