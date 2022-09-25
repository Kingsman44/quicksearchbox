package com.google.android.apps.gsa.staticplugins.p7909eg;

import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88351yl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88352ym;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88353yn;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.o */
/* compiled from: PG */
final class C100524o extends C90888av {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f281045a;

    /* renamed from: b */
    final /* synthetic */ Query f281046b;

    /* renamed from: c */
    final /* synthetic */ C100528s f281047c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100524o(C100528s sVar, SettableFuture settableFuture, Query query) {
        super("S3 Synthesizer audio received", 1, 0);
        this.f281047c = sVar;
        this.f281045a = settableFuture;
        this.f281046b = query;
    }

    public final void run() {
        new C90873ag(this.f281045a, this.f281047c.f281060b, "ttsModeDeterminedAndEventBusUpdated", new C100522m(this)).mo85223a(new C100523n(this));
        C100528s sVar = this.f281047c;
        Query query = this.f281046b;
        C86775r rVar = sVar.f281061c.f233977l;
        if (rVar != null) {
            C88352ym ymVar = (C88352ym) C88353yn.f238937e.createBuilder();
            if (query.mo84364bx("tts-trigger")) {
                String bf = query.mo84347bf("tts-trigger");
                bf.getClass();
                ymVar.copyOnWrite();
                C88353yn ynVar = (C88353yn) ymVar.instance;
                ynVar.f238939a |= 4;
                ynVar.f238942d = bf;
            }
            C87684al alVar = new C87684al(C88244um.TTS_PLAYBACK_STARTED);
            alVar.mo81965b(C88351yl.f238936a, (C88353yn) ymVar.build());
            rVar.f234383e.mo80379b(alVar.mo81964a());
        }
    }
}
