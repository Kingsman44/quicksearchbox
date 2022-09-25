package com.google.android.libraries.assistant.soda.speakerid.p1613a;

import android.content.Context;
import com.google.android.libraries.assistant.soda.speakerid.C19362a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5218j.C66838bp;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.soda.speakerid.a.j */
/* compiled from: PG */
public final class C19372j {

    /* renamed from: a */
    public static final C59071e f54209a = C59071e.m91332i("com.google.android.libraries.assistant.soda.speakerid.a.j");

    /* renamed from: b */
    public final Context f54210b;

    /* renamed from: c */
    public final C19362a f54211c;

    /* renamed from: d */
    public final C60887da f54212d;

    /* renamed from: e */
    public final C60888db f54213e;

    public C19372j(Context context, C19362a aVar, C60887da daVar, C60888db dbVar) {
        this.f54210b = context;
        this.f54211c = aVar;
        this.f54212d = daVar;
        this.f54213e = dbVar;
    }

    /* renamed from: e */
    private final C60870cx m36894e(C19373k kVar) {
        C19363a aVar = new C19363a(this, kVar);
        return C60856cj.m92904m(C47810es.m84978r(aVar), this.f54212d);
    }

    /* renamed from: a */
    public final C60870cx mo24512a(C19373k kVar) {
        C59104x b = f54209a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaEnrollmentClient");
        ((C59052c) ((C59052c) b).mo56372aa(47796)).mo56386p("#enroll");
        if (!this.f54211c.mo24505f()) {
            return mo24514c(kVar);
        }
        return C60922j.m93045h(m36894e(kVar), C47810es.m84966f(new C19367e(this)), this.f54212d);
    }

    /* renamed from: b */
    public final C60870cx mo24513b(C19373k kVar) {
        C59104x b = f54209a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaEnrollmentClient");
        ((C59052c) ((C59052c) b).mo56372aa(47797)).mo56386p("#getSpeakerIdModel");
        C60870cx c = mo24514c(kVar);
        C19369g gVar = new C19369g(this);
        return C60922j.m93044g(c, C47810es.m84963c(gVar), this.f54213e);
    }

    /* renamed from: c */
    public final C60870cx mo24514c(C19373k kVar) {
        C59071e eVar = f54209a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaEnrollmentClient");
        ((C59052c) ((C59052c) b).mo56372aa(47799)).mo56386p("#initialize");
        if (this.f54211c.mo24505f()) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaEnrollmentClient");
            ((C59052c) ((C59052c) b2).mo56372aa(47800)).mo56386p("#initialize - soda enrollment manager is already initialized.");
            return C60856cj.m92900i(C66838bp.f181748d);
        }
        C60870cx e = m36894e(kVar);
        C19362a aVar = this.f54211c;
        Objects.requireNonNull(aVar);
        C19370h hVar = new C19370h(aVar);
        return C60922j.m93045h(e, C47810es.m84966f(hVar), this.f54212d);
    }

    /* renamed from: d */
    public final C60870cx mo24515d(C19373k kVar, String str, Optional optional) {
        C59104x b = f54209a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaEnrollmentClient");
        ((C59052c) ((C59052c) b).mo56372aa(47801)).mo56386p("#updateUtterancesAndSpeakerModel");
        C60870cx c = mo24514c(kVar);
        C19364b bVar = new C19364b(this, str, optional);
        return C60922j.m93045h(c, C47810es.m84966f(bVar), this.f54212d);
    }
}
