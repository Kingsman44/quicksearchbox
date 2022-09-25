package com.google.android.apps.gsa.staticplugins.opa.p8174ab.p8177c;

import android.accounts.Account;
import com.google.android.apps.gsa.p6487s3.producers.C84305d;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92443g;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92446c;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92448e;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92455l;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4552o.amo;
import com.google.p4449cd.p4456g.C57981b;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;
import com.google.speech.p5208h.C66550ag;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66678l;
import dagger.C68214a;
import java.util.concurrent.Future;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ab.c.i */
/* compiled from: PG */
final class C105996i implements C92439c {

    /* renamed from: a */
    private final C64308b f295923a;

    /* renamed from: b */
    private final C90931ca f295924b;

    /* renamed from: c */
    private final Future f295925c;

    /* renamed from: d */
    private final Future f295926d;

    /* renamed from: e */
    private final C92455l f295927e;

    /* renamed from: f */
    private final String f295928f = "explicit-automation";

    /* renamed from: g */
    private final C86124t f295929g;

    public C105996i(C64308b bVar, C90931ca caVar, C89994f fVar, String str, C92302a aVar, C92461a aVar2, C86124t tVar, C84600b bVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        C90931ca caVar2 = caVar;
        this.f295923a = bVar;
        this.f295924b = caVar2;
        this.f295929g = tVar;
        this.f295925c = caVar2.mo85138c(new C92446c((C89037bh) aVar3.mo27525b(), (C89045bp) aVar4.mo27525b()));
        this.f295926d = caVar2.mo85138c(new C92448e(fVar, str, aVar2, (String) null, (amo) null, (String) null, (String) null));
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_VOICE_SEARCH_LO);
        d.mo41493b(Duration.ofDays(1));
        this.f295927e = new C92455l(new C105995h(caVar, aVar, fVar, bVar2.mo78367a(d.mo41492a()), aVar5), caVar, aVar, fVar, (Account) null, (String) null, (C66595bu) null);
    }

    /* renamed from: a */
    public final C57981b mo87118a() {
        return new C92443g(this.f295924b, new C84305d(this.f295925c, this.f295926d, this.f295927e.f257883a, (C66678l) null, (C66550ag) null, C90719ac.f253778a.f253779b.nextLong(), this.f295928f, this.f295929g), new C105994g(this.f295923a));
    }

    /* renamed from: b */
    public final void mo87119b() {
        this.f295925c.cancel(true);
        this.f295926d.cancel(true);
        this.f295927e.mo87155a();
    }

    /* renamed from: c */
    public final void mo87120c() {
        this.f295927e.mo87156b();
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo87121d() {
        return false;
    }
}
