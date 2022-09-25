package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.c */
/* compiled from: PG */
public final class C92397c implements C92376a {

    /* renamed from: a */
    public static final C59071e f257663a = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.enrollmentutils.c");

    /* renamed from: b */
    public final C89994f f257664b;

    /* renamed from: c */
    public final C86054o f257665c;

    /* renamed from: d */
    public final C68214a f257666d;

    /* renamed from: e */
    private final C68214a f257667e;

    /* renamed from: f */
    private final C68214a f257668f;

    /* renamed from: g */
    private final C68214a f257669g;

    public C92397c(C89994f fVar, C68214a aVar, C68214a aVar2, C86054o oVar, C68214a aVar3, C68214a aVar4) {
        this.f257664b = fVar;
        this.f257665c = oVar;
        this.f257668f = aVar2;
        this.f257669g = aVar;
        this.f257667e = aVar3;
        this.f257666d = aVar4;
    }

    /* renamed from: a */
    public final C60870cx mo87041a(C90584f fVar, boolean z, int i, C89784a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        SettableFuture settableFuture = new SettableFuture();
        ((C90929bz) this.f257669g.mo27525b()).mo85142g(((C92400f) this.f257668f.mo27525b()).mo87043a(fVar, z, this.f257664b.mo83863Z(), C92399e.ALL_UTTERANCES, this.f257665c.mo79668a(), (C66595bu) ((C92371d) this.f257667e.mo27525b()).mo87020a().mo56111f()), new C92396b(this, 3, fVar, aVar, settableFuture));
        return settableFuture;
    }
}
