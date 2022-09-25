package com.google.android.apps.gsa.shared.p7122o;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87782dj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87783dk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87784dl;
import com.google.android.libraries.elements.interfaces.C21245ao;
import com.google.android.libraries.elements.interfaces.C21295ck;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.shared.o.c */
/* compiled from: PG */
public final /* synthetic */ class C90439c implements C21245ao {

    /* renamed from: a */
    public final /* synthetic */ C90441e f252651a;

    /* renamed from: b */
    public final /* synthetic */ String f252652b;

    /* renamed from: c */
    public final /* synthetic */ C57696b f252653c;

    public /* synthetic */ C90439c(C90441e eVar, String str, C57696b bVar) {
        this.f252651a = eVar;
        this.f252652b = str;
        this.f252653c = bVar;
    }

    /* renamed from: a */
    public final void mo25926a(View view, C21295ck ckVar) {
        C90441e eVar = this.f252651a;
        String str = this.f252652b;
        C57696b bVar = this.f252653c;
        C88489j jVar = new C88489j(C87739bu.ELEMENTS_LOG_CLICK);
        C62940bt btVar = C87782dj.f237560a;
        C87783dk dkVar = (C87783dk) C87784dl.f237561d.createBuilder();
        dkVar.copyOnWrite();
        C87784dl dlVar = (C87784dl) dkVar.instance;
        str.getClass();
        dlVar.f237563a |= 1;
        dlVar.f237564b = str;
        String str2 = bVar.f154148i;
        dkVar.copyOnWrite();
        C87784dl dlVar2 = (C87784dl) dkVar.instance;
        str2.getClass();
        dlVar2.f237563a |= 2;
        dlVar2.f237565c = str2;
        jVar.mo82014b(btVar, (C87784dl) dkVar.build());
        eVar.f252658b.mo81961c(jVar.mo82013a());
    }
}
