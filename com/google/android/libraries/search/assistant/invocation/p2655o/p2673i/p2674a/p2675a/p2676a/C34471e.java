package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.bisto.C89686y;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.C33499c;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34134g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34137j;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34577m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71506bj;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71594u;
import kotlinx.coroutines.p5574b.C71598y;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.e */
/* compiled from: PG */
public final class C34471e implements C89686y, C33499c, C34461ad {

    /* renamed from: a */
    public static final C59071e f91591a = C59071e.m91331h();

    /* renamed from: b */
    public final C34486t f91592b;

    /* renamed from: c */
    private final C34137j f91593c;

    /* renamed from: d */
    private final C34577m f91594d;

    /* renamed from: e */
    private final C89606ad f91595e;

    /* renamed from: f */
    private final C71422aw f91596f;

    /* renamed from: g */
    private final C71548cy f91597g;

    /* renamed from: h */
    private final C71587n f91598h;

    /* renamed from: i */
    private volatile C71643cp f91599i;

    public C34471e(C34137j jVar, C34577m mVar, C34486t tVar, C89606ad adVar, C71422aw awVar) {
        C69664n.m101061g(tVar, "externalConsumerConfigurationFlow");
        C69664n.m101061g(adVar, "hotwordHelper");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f91593c = jVar;
        this.f91594d = mVar;
        this.f91592b = tVar;
        this.f91595e = adVar;
        this.f91596f = awVar;
        C71548cy b = C71574dx.m104480b(false);
        this.f91597g = b;
        this.f91598h = C71521by.m104365c(b);
    }

    /* renamed from: a */
    public final void mo39364a() {
        Object e;
        C59052c cVar = (C59052c) f91591a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.BistoHotwordStatus");
        cVar.mo56379ah(new C59094n(51394));
        cVar.mo56386p("Bisto hotword starting, activating external hotword consumer.");
        C71548cy cyVar = this.f91597g;
        do {
            e = cyVar.mo62784e();
            ((Boolean) e).booleanValue();
        } while (!cyVar.mo62808g(e, true));
    }

    /* renamed from: b */
    public final void mo39365b() {
        Object e;
        C59052c cVar = (C59052c) f91591a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.BistoHotwordStatus");
        cVar.mo56379ah(new C59094n(51395));
        cVar.mo56386p("Bisto hotword stopping, stopping external hotword consumer.");
        C71548cy cyVar = this.f91597g;
        do {
            e = cyVar.mo62784e();
            ((Boolean) e).booleanValue();
        } while (!cyVar.mo62808g(e, false));
    }

    /* renamed from: c */
    public final Object mo38908c(C69577g gVar) {
        return C71663i.m104690c(this.f91593c.mo39228b(C34134g.HDM), gVar);
    }

    /* renamed from: d */
    public final Object mo38909d(C69577g gVar) {
        Object e;
        C59052c cVar = (C59052c) f91591a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.BistoHotwordStatus");
        cVar.mo56379ah(new C59094n(51393));
        cVar.mo56386p("VIS shutting down, unregistering Bisto hotword listener.");
        this.f91595e.mo83473s(this);
        C71643cp cpVar = this.f91599i;
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
        this.f91599i = null;
        C71548cy cyVar = this.f91597g;
        do {
            e = cyVar.mo62784e();
            ((Boolean) e).booleanValue();
        } while (!cyVar.mo62808g(e, false));
        return C69788q.f186170a;
    }

    /* renamed from: e */
    public final Object mo38910e(C33497h hVar, C69577g gVar) {
        C59052c cVar = (C59052c) f91591a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.BistoHotwordStatus");
        cVar.mo56379ah(new C59094n(51392));
        cVar.mo56386p("VIS ready, registering Bisto hotword listener.");
        this.f91595e.mo83461g(this);
        C71643cp cpVar = this.f91599i;
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
        this.f91599i = C71594u.m104517d(C71477ah.m104295b(C71536cm.m104384b(C71536cm.m104384b(C71471ab.m104286a(C71598y.m104523c(C71506bj.m104339e(this.f91594d, new C34457a((C69577g) null, this)))), new C34468b((C69577g) null)), new C34469c(this, (C69577g) null)), new C34470d(this, (C69577g) null)), this.f91596f);
        return C69788q.f186170a;
    }

    /* renamed from: f */
    public final C71587n mo39359f() {
        return this.f91598h;
    }

    /* renamed from: g */
    public final void mo39366g(C34485s sVar) {
        C59052c cVar = (C59052c) f91591a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.BistoHotwordStatus");
        cVar.mo56379ah(new C59094n(51396));
        cVar.mo56389s("Updating Bisto HotwordInformation: %s", sVar);
        C89606ad adVar = this.f91595e;
        adVar.mo83467m(true);
        if (sVar == null || sVar.f91642c.f91570c == null) {
            adVar.mo83466l((String) null);
            adVar.mo83470p(false);
            adVar.mo83469o(false);
            adVar.mo83464j((byte[]) null);
            adVar.mo83468n((SpeakerIdModel) null);
            adVar.mo83471q(false);
            return;
        }
        adVar.mo83466l(sVar.f91641b);
        adVar.mo83470p(sVar.f91642c.f91568a);
        adVar.mo83469o(sVar.f91642c.f91569b);
        adVar.mo83464j(sVar.f91642c.f91570c);
        adVar.mo83468n(sVar.f91642c.f91571d);
        adVar.mo83471q(sVar.f91643d);
    }
}
