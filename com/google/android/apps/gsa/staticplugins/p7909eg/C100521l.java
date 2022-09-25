package com.google.android.apps.gsa.staticplugins.p7909eg;

import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85386a;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88351yl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88352ym;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88353yn;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.l */
/* compiled from: PG */
public final /* synthetic */ class C100521l implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100528s f281040a;

    /* renamed from: b */
    public final /* synthetic */ C85386a f281041b;

    /* renamed from: c */
    public final /* synthetic */ Query f281042c;

    public /* synthetic */ C100521l(C100528s sVar, C85386a aVar, Query query) {
        this.f281040a = sVar;
        this.f281041b = aVar;
        this.f281042c = query;
    }

    public final void run() {
        C100528s sVar = this.f281040a;
        C85386a aVar = this.f281041b;
        Query query = this.f281042c;
        aVar.mo77892a();
        sVar.f281062f.mo80433g();
        C86775r rVar = sVar.f281061c.f233977l;
        if (rVar != null) {
            long d = sVar.f281063g.mo26872d();
            C88352ym ymVar = (C88352ym) C88353yn.f238937e.createBuilder();
            ymVar.copyOnWrite();
            C88353yn ynVar = (C88353yn) ymVar.instance;
            ynVar.f238939a |= 1;
            ynVar.f238940b = d;
            if (query.mo84364bx("tts-trigger")) {
                String bf = query.mo84347bf("tts-trigger");
                bf.getClass();
                ymVar.copyOnWrite();
                C88353yn ynVar2 = (C88353yn) ymVar.instance;
                ynVar2.f238939a |= 4;
                ynVar2.f238942d = bf;
            }
            C87684al alVar = new C87684al(C88244um.TTS_PLAYBACK_DONE);
            alVar.mo81965b(C88351yl.f238936a, (C88353yn) ymVar.build());
            rVar.f234383e.mo80379b(alVar.mo81964a());
        }
    }
}
