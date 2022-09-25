package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92509c;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92286w;
import com.google.android.libraries.assistant.soda.speakerid.p1613a.C19373k;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.speech.p5218j.C66980gp;
import com.google.speech.p5218j.C66981gq;
import com.google.speech.p5218j.C66984gt;
import com.google.speech.p5218j.C66985gu;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.o */
/* compiled from: PG */
public final class C92409o implements C19373k {

    /* renamed from: a */
    private final Context f257705a;

    /* renamed from: b */
    private final C89994f f257706b;

    /* renamed from: c */
    private final C29409fd f257707c;

    /* renamed from: d */
    private final C42813k f257708d;

    /* renamed from: e */
    private final C92286w f257709e;

    /* renamed from: f */
    private final C86124t f257710f;

    public C92409o(Context context, C89994f fVar, C29409fd fdVar, C42813k kVar, C92286w wVar, C86124t tVar) {
        this.f257705a = context;
        this.f257706b = fVar;
        this.f257707c = fdVar;
        this.f257708d = kVar;
        this.f257709e = wVar;
        this.f257710f = tVar;
    }

    /* renamed from: a */
    public final int mo24516a() {
        return (int) this.f257710f.mo79743a(C90082eg.f250005cO);
    }

    /* renamed from: b */
    public final int mo24517b() {
        return (int) this.f257710f.mo79743a(C90082eg.f250006cP);
    }

    /* renamed from: c */
    public final C58833ax mo24518c() {
        String a = C92509c.m152171a(mo24520e().toLanguageTag(), this.f257706b.mo83827p(), this.f257705a, this.f257707c, this.f257708d, this.f257710f.mo79746e(C90082eg.f250020cd));
        if (a.isEmpty()) {
            return C58836b.f156633a;
        }
        C66984gt gtVar = (C66984gt) C66985gu.f182075h.createBuilder();
        C66980gp gpVar = (C66980gp) C66981gq.f182064g.createBuilder();
        gpVar.copyOnWrite();
        C66981gq gqVar = (C66981gq) gpVar.instance;
        a.getClass();
        gqVar.f182067b = 6;
        gqVar.f182068c = a;
        gtVar.mo59757b((C66981gq) gpVar.build());
        return C58833ax.m90834k((C66985gu) gtVar.build());
    }

    /* renamed from: d */
    public final C58833ax mo24519d() {
        return this.f257709e.mo86965a(mo24520e().toLanguageTag());
    }

    /* renamed from: e */
    public final Locale mo24520e() {
        return Locale.forLanguageTag(this.f257706b.mo83863Z());
    }

    /* renamed from: f */
    public final boolean mo24521f() {
        return this.f257706b.mo83823l();
    }
}
