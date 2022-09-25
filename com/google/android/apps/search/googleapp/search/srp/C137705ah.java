package com.google.android.apps.search.googleapp.search.srp;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ah */
/* compiled from: PG */
public final /* synthetic */ class C137705ah implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ C137711an f374539a;

    public /* synthetic */ C137705ah(C137711an anVar) {
        this.f374539a = anVar;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        C137711an anVar = this.f374539a;
        Uri parse = Uri.parse(lVar.f113296b);
        if (!anVar.f374552G) {
            C58838bb.m90868c(anVar.f374592k.mo113404j(parse));
        } else {
            C58838bb.m90868c(anVar.f374592k.mo113403i(parse));
        }
        C137542d c = anVar.f374600s.mo113808c(parse, true != anVar.f374602u.mo114010a(parse) ? 3 : 4, C133933a.m217248a(anVar.f374585d));
        c.getClass();
        anVar.mo113921k(c);
    }
}
