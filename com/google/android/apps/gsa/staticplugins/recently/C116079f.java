package com.google.android.apps.gsa.staticplugins.recently;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1875j.C22832c;
import com.google.android.libraries.gsa.p1875j.C22845p;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.f */
/* compiled from: PG */
public final /* synthetic */ class C116079f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116093h f321875a;

    /* renamed from: b */
    public final /* synthetic */ C22832c f321876b;

    /* renamed from: c */
    public final /* synthetic */ String f321877c;

    public /* synthetic */ C116079f(C116093h hVar, C22832c cVar, String str) {
        this.f321875a = hVar;
        this.f321876b = cVar;
        this.f321877c = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116093h hVar = this.f321875a;
        C22832c cVar = this.f321876b;
        String str = this.f321877c;
        if (((Boolean) obj).booleanValue()) {
            long j = ((C22845p) cVar.instance).f62893b;
            cVar.copyOnWrite();
            C22845p pVar = (C22845p) cVar.instance;
            pVar.f62892a |= 128;
            pVar.f62899h = j;
        }
        hVar.f321896f.mo102436f((C22845p) cVar.build(), str);
    }
}
