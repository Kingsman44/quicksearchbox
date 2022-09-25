package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92399e;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.common.util.concurrent.SettableFuture;
import com.google.speech.p5208h.C66595bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.am */
/* compiled from: PG */
final class C101518am extends C90888av {

    /* renamed from: a */
    final /* synthetic */ int f283320a;

    /* renamed from: b */
    final /* synthetic */ C90584f f283321b;

    /* renamed from: c */
    final /* synthetic */ C92399e f283322c;

    /* renamed from: d */
    final /* synthetic */ SettableFuture f283323d;

    /* renamed from: e */
    final /* synthetic */ String f283324e;

    /* renamed from: f */
    final /* synthetic */ Account f283325f;

    /* renamed from: g */
    final /* synthetic */ C101519an f283326g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101518am(C101519an anVar, int i, C90584f fVar, C92399e eVar, SettableFuture settableFuture, String str, Account account) {
        super("UtterancesReadyRetryRunnalbe", 1, 0);
        this.f283326g = anVar;
        this.f283320a = i;
        this.f283321b = fVar;
        this.f283322c = eVar;
        this.f283323d = settableFuture;
        this.f283324e = str;
        this.f283325f = account;
    }

    public final void run() {
        C101518am amVar;
        int i = this.f283320a;
        if (i > 0) {
            amVar = new C101518am(this.f283326g, i - 1, this.f283321b, this.f283322c, this.f283323d, this.f283324e, this.f283325f);
        } else {
            amVar = null;
        }
        boolean f = C92408n.m151744f((C90021c) this.f283326g.f283328b.mo27525b(), this.f283326g.f283330d.mo85090c());
        C101519an anVar = this.f283326g;
        anVar.mo92378a(this.f283321b, this.f283322c, this.f283323d, this.f283324e, f, this.f283325f, (C66595bu) anVar.f283329c.mo87020a().mo56111f(), amVar);
    }
}
