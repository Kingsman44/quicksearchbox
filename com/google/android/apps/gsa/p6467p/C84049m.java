package com.google.android.apps.gsa.p6467p;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;

/* renamed from: com.google.android.apps.gsa.p.m */
/* compiled from: PG */
public final /* synthetic */ class C84049m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C91097g f228934a;

    /* renamed from: b */
    public final /* synthetic */ C84041e f228935b;

    public /* synthetic */ C84049m(C91097g gVar, C84041e eVar) {
        this.f228934a = gVar;
        this.f228935b = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C91097g gVar = this.f228934a;
        C84041e eVar = this.f228935b;
        Void voidR = (Void) obj;
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.SEARCH);
        C136127h.m221196a(intent, l.mo112766a());
        gVar.mo65089a(intent);
        eVar.mo77503a();
    }
}
