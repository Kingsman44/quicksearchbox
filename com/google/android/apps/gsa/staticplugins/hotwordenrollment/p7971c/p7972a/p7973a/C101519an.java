package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92399e;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92400f;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.an */
/* compiled from: PG */
public final class C101519an {

    /* renamed from: a */
    public static final C59071e f283327a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.an");

    /* renamed from: b */
    public final C68214a f283328b;

    /* renamed from: c */
    public final C92371d f283329c;

    /* renamed from: d */
    public final C90743b f283330d;

    /* renamed from: e */
    public final C22871g f283331e;

    /* renamed from: f */
    public final C89859i f283332f;

    /* renamed from: g */
    public final C90929bz f283333g;

    /* renamed from: h */
    private final C92400f f283334h;

    public C101519an(C92371d dVar, C68214a aVar, C90743b bVar, C22871g gVar, C89859i iVar, C90929bz bzVar, C92400f fVar) {
        this.f283329c = dVar;
        this.f283328b = aVar;
        this.f283330d = bVar;
        this.f283331e = gVar;
        this.f283332f = iVar;
        this.f283333g = bzVar;
        this.f283334h = fVar;
    }

    /* renamed from: a */
    public final void mo92378a(C90584f fVar, C92399e eVar, SettableFuture settableFuture, String str, boolean z, Account account, C66595bu buVar, C90908be beVar) {
        SettableFuture settableFuture2 = settableFuture;
        this.f283333g.mo85142g(this.f283334h.mo87044b(fVar, z, str, eVar, account, buVar), new C101517al(this, settableFuture, beVar));
    }
}
