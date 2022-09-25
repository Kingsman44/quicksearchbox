package com.google.android.apps.search.assistant.verticals.automation.routines.p10031f.p10032a;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a.C131843d;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10025c.C131856e;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10025c.C131857f;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131871n;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131872o;
import com.google.android.gms.location.C144870aa;
import com.google.android.gms.location.C144877ah;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3861at.afy;
import com.google.assistant.p3879aw.p3881b.C50601d;
import com.google.assistant.p3879aw.p3881b.C50602e;
import com.google.assistant.p3879aw.p3881b.C50603f;
import com.google.assistant.p3879aw.p3881b.C50605h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.ArrayList;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.f.a.k */
/* compiled from: PG */
public final /* synthetic */ class C131890k implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C131893n f360152a;

    /* renamed from: b */
    public final /* synthetic */ C131872o f360153b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f360154c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f360155d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f360156e;

    /* renamed from: f */
    public final /* synthetic */ C50605h f360157f;

    public /* synthetic */ C131890k(C131893n nVar, C131872o oVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C50605h hVar) {
        this.f360152a = nVar;
        this.f360153b = oVar;
        this.f360154c = cxVar;
        this.f360155d = cxVar2;
        this.f360156e = cxVar3;
        this.f360157f = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        boolean z;
        C50602e eVar;
        Optional optional;
        float f;
        long j;
        long j2;
        long j3;
        Optional optional2;
        C131893n nVar = this.f360152a;
        C131872o oVar = this.f360153b;
        C60870cx cxVar = this.f360154c;
        C60870cx cxVar2 = this.f360155d;
        C60870cx cxVar3 = this.f360156e;
        C50605h hVar = this.f360157f;
        C131871n nVar2 = oVar.f360118c;
        if (nVar2 == null) {
            nVar2 = C131871n.f360106g;
        }
        try {
            C131857f.m214333b(nVar2);
            z = true;
        } catch (RuntimeException unused) {
            z = false;
        }
        afy afy = (afy) C60856cj.m92909r(cxVar);
        C131843d dVar = nVar.f360161b.f360071e;
        if (dVar == null) {
            dVar = C131843d.f360054e;
        }
        String str = (String) C60856cj.m92909r(cxVar2);
        String str2 = afy.f129191b;
        C58079k kVar = (C58079k) C60856cj.m92909r(cxVar3);
        C50603f fVar = hVar.f131670b;
        if (fVar == null) {
            fVar = C50603f.f131661e;
        }
        if (fVar.f131664b == 3) {
            eVar = (C50602e) fVar.f131665c;
        } else {
            eVar = C50602e.f131657b;
        }
        int a = C50601d.m85859a(eVar.f131659a);
        if (a == 0) {
            a = 1;
        }
        if (z) {
            optional = Optional.m71637of(nVar2);
        } else {
            optional = Optional.empty();
        }
        C144870aa aaVar = new C144870aa();
        aaVar.mo120366d(C131856e.m214331a(str, str2, optional));
        double d = kVar.f155252a;
        double d2 = kVar.f155253b;
        if (optional.isPresent()) {
            f = ((C131871n) optional.get()).f360109b;
        } else {
            f = dVar.f360056a;
        }
        C144870aa aaVar2 = aaVar;
        aaVar.mo120364b(d, d2, f);
        if (optional.isPresent()) {
            C62910ar arVar = ((C131871n) optional.get()).f360110c;
            if (arVar == null) {
                arVar = C62910ar.f169858c;
            }
            j = C62948a.m95453d(arVar);
        } else {
            C62910ar arVar2 = dVar.f360057b;
            if (arVar2 == null) {
                arVar2 = C62910ar.f169858c;
            }
            j = C62948a.m95453d(arVar2);
        }
        aaVar2.mo120365c(j);
        aaVar2.f391809a = a + -1 != 1 ? 2 : 4;
        if (optional.isPresent()) {
            C62910ar arVar3 = ((C131871n) optional.get()).f360111d;
            if (arVar3 == null) {
                arVar3 = C62910ar.f169858c;
            }
            j2 = C62948a.m95453d(arVar3);
        } else {
            C62910ar arVar4 = dVar.f360058c;
            if (arVar4 == null) {
                arVar4 = C62910ar.f169858c;
            }
            j2 = C62948a.m95453d(arVar4);
        }
        aaVar2.f391810b = (int) j2;
        if (optional.isPresent()) {
            C62910ar arVar5 = ((C131871n) optional.get()).f360112e;
            if (arVar5 == null) {
                arVar5 = C62910ar.f169858c;
            }
            j3 = C62948a.m95453d(arVar5);
        } else {
            C62910ar arVar6 = dVar.f360059d;
            if (arVar6 == null) {
                arVar6 = C62910ar.f169858c;
            }
            j3 = C62948a.m95453d(arVar6);
        }
        aaVar2.f391811c = (int) j3;
        ParcelableGeofence a2 = aaVar2.mo120363a();
        String.format(Locale.US, "id:%s lat:%f lng:%f rad:%f exp:%d typ:%d res:%d del:%d", new Object[]{a2.f391867a, Double.valueOf(a2.f391870d), Double.valueOf(a2.f391871e), Float.valueOf(a2.f391872f), Long.valueOf(a2.f391868b), Integer.valueOf(a2.f391873g), Integer.valueOf(a2.f391874h), Integer.valueOf(a2.f391875i)});
        if (z) {
            optional2 = Optional.m71637of(nVar2);
        } else {
            optional2 = Optional.empty();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        return C47633f.m84733g(nVar.f360165f.f360081a.mo41567a(C144877ah.m235475b(arrayList, (!optional2.isPresent() || !((C131871n) optional2.get()).f360113f) ? 0 : 6), nVar.f360162c, C39226b.TAG_ASSISTANT_ROUTINES)).mo51515h(new C131880a(afy), nVar.f360163d);
    }
}
