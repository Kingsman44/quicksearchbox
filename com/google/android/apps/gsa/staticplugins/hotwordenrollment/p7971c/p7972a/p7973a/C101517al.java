package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.al */
/* compiled from: PG */
final class C101517al extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f283317a;

    /* renamed from: b */
    final /* synthetic */ C90908be f283318b;

    /* renamed from: c */
    final /* synthetic */ C101519an f283319c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101517al(C101519an anVar, SettableFuture settableFuture, C90908be beVar) {
        super("blockingCheckUtterancesReady", 1, 0);
        this.f283319c = anVar;
        this.f283317a = settableFuture;
        this.f283318b = beVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C101519an.f283327a.mo56225c()).mo56382g(th)).mo56372aa(20329)).mo56386p("Utterances not on server");
        this.f283319c.f283332f.mo83702b(C89849ae.VOICE_MATCH_UTTS_READY_CHECK_FAILED);
        this.f283317a.mo57356n(false);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C59052c) ((C59052c) C101519an.f283327a.mo56224b()).mo56372aa(20331)).mo56386p("Utterances ready on server!");
            this.f283319c.f283332f.mo83702b(C89849ae.VOICE_MATCH_UTTS_READY_CHECK_SUCCESS);
            this.f283317a.mo57356n(true);
        } else if (this.f283318b != null) {
            this.f283319c.f283332f.mo83702b(C89849ae.VOICE_MATCH_UTTS_READY_CHECK_RETRY);
            C101519an anVar = this.f283319c;
            anVar.f283333g.mo85137b(this.f283318b, ((C90021c) anVar.f283328b.mo27525b()).mo79743a(C90014bt.f247479ht));
        } else {
            ((C59052c) ((C59052c) C101519an.f283327a.mo56225c()).mo56372aa(20330)).mo56386p("Utterances not on server after retry exhausted!");
            this.f283319c.f283332f.mo83702b(C89849ae.VOICE_MATCH_UTTS_READY_CHECK_MAX_ATTEMPTS_REACHED);
            this.f283317a.mo57356n(false);
        }
    }
}
