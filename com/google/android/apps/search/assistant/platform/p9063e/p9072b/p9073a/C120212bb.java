package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120810c;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120815h;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62971cq;
import com.google.speech.recognizer.p5233a.C67467o;
import com.google.speech.recognizer.p5233a.C67468p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.bb */
/* compiled from: PG */
final class C120212bb implements C17266e {

    /* renamed from: a */
    public final boolean f334533a;

    /* renamed from: b */
    public final boolean f334534b;

    /* renamed from: c */
    private final C120246cd f334535c;

    /* renamed from: d */
    private final C120227bq f334536d;

    /* renamed from: e */
    private final C60870cx f334537e;

    public C120212bb(C120246cd cdVar, C120227bq bqVar, boolean z, C119829bx bxVar, C60870cx cxVar) {
        this.f334535c = cdVar;
        this.f334536d = bqVar;
        this.f334533a = z;
        boolean z2 = false;
        if (bxVar.f333761d && !z) {
            z2 = true;
        }
        this.f334534b = z2;
        this.f334537e = cxVar;
    }

    /* renamed from: b */
    public static List m199159b(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C67467o oVar = (C67467o) C67468p.f183364g.createBuilder();
            oVar.copyOnWrite();
            C67468p pVar = (C67468p) oVar.instance;
            str.getClass();
            pVar.f183366a |= 1;
            pVar.f183367b = str;
            oVar.copyOnWrite();
            C67468p pVar2 = (C67468p) oVar.instance;
            pVar2.f183366a |= 8;
            pVar2.f183368c = 1.0f;
            arrayList.add((C67468p) oVar.build());
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List m199160d(C120811d dVar) {
        C120815h hVar;
        int i = dVar.f335967a;
        if (i == 1) {
            C62971cq cqVar = ((C120815h) dVar.f335968b).f335976c;
            if (!cqVar.isEmpty()) {
                return cqVar;
            }
            if (dVar.f335967a == 1) {
                hVar = (C120815h) dVar.f335968b;
            } else {
                hVar = C120815h.f335972f;
            }
            return new ArrayList(C58485gu.m89846n(hVar.f335975b));
        }
        throw new C120365ge(C120810c.m200013b(i), C120243ca.RECOGNITION_PASSTHROUGH);
    }

    /* renamed from: a */
    public final C60870cx mo23245a() {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f334534b) {
            this.f334536d.f334569a.mo19974a(C37176a.f96913be);
            i = 3;
        } else {
            this.f334536d.f334569a.mo19974a(C37176a.f96914bf);
            i = 2;
        }
        C60870cx cxVar = this.f334537e;
        C120207ay ayVar = new C120207ay(this, i);
        return C60922j.m93044g(cxVar, C47810es.m84963c(ayVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo23246c(Consumer consumer) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f334534b && !this.f334533a) {
            return C60866ct.f164955a;
        }
        C120246cd cdVar = this.f334535c;
        return cdVar.f334605a.mo38133a(new C120208az(this, consumer));
    }
}
