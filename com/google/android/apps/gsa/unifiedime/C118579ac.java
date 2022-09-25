package com.google.android.apps.gsa.unifiedime;

import android.content.Context;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.Hypothesis;
import com.google.android.apps.gsa.shared.util.p7159c.C90892az;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.voiceime.C118691c;
import com.google.android.apps.gsa.voiceime.C118694f;
import com.google.android.apps.gsa.voiceime.C118695g;
import com.google.android.apps.gsa.voiceime.C118696h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.unifiedime.ac */
/* compiled from: PG */
public final class C118579ac {

    /* renamed from: a */
    public static final C59071e f330820a = C59071e.m91332i("com.google.android.apps.gsa.unifiedime.ac");

    /* renamed from: b */
    public static final C58528ij f330821b = C58528ij.m90012L(Integer.valueOf(C89885b.RECOGNIZER_SPEECH_TIMEOUT.f246280a), Integer.valueOf(C89885b.RECOGNIZER_NO_MATCH.f246280a), Integer.valueOf(C89885b.RECOGNIZER_NO_MATCH_FROM_NETWORK.f246280a));

    /* renamed from: c */
    public final Context f330822c;

    /* renamed from: d */
    public final C68214a f330823d;

    /* renamed from: e */
    public final C68214a f330824e;

    /* renamed from: f */
    public final C68214a f330825f;

    /* renamed from: g */
    public final C68214a f330826g;

    /* renamed from: h */
    public final C68214a f330827h;

    /* renamed from: i */
    public final C68214a f330828i;

    /* renamed from: j */
    public final C68214a f330829j;

    /* renamed from: k */
    public final C68214a f330830k;

    /* renamed from: l */
    public final C68214a f330831l;

    /* renamed from: m */
    public final C118696h f330832m;

    /* renamed from: n */
    public final String f330833n;

    /* renamed from: o */
    public C118695g f330834o;

    /* renamed from: p */
    public String f330835p = "en-001";

    /* renamed from: q */
    boolean f330836q = true;

    /* renamed from: r */
    public boolean f330837r;

    /* renamed from: s */
    C60870cx f330838s;

    /* renamed from: t */
    public final C90908be f330839t = new C118577aa(this);

    /* renamed from: u */
    public C118595m f330840u;

    public C118579ac(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C118696h hVar, String str) {
        this.f330822c = context;
        this.f330823d = aVar;
        this.f330824e = aVar2;
        this.f330825f = aVar3;
        this.f330826g = aVar4;
        this.f330827h = aVar5;
        this.f330828i = aVar6;
        this.f330829j = aVar7;
        this.f330830k = aVar8;
        this.f330831l = aVar9;
        this.f330832m = hVar;
        this.f330833n = str;
    }

    /* renamed from: a */
    static C118600r m196872a(List list, String str, String str2, boolean z) {
        boolean z2 = !list.isEmpty();
        if (z2) {
            str = ((Hypothesis) list.get(0)).f253055a;
        }
        C118605w wVar = (C118605w) C118606x.f330892g.createBuilder();
        wVar.copyOnWrite();
        C118606x xVar = (C118606x) wVar.instance;
        str.getClass();
        xVar.f330894a |= 1;
        xVar.f330895b = str;
        wVar.copyOnWrite();
        C118606x xVar2 = (C118606x) wVar.instance;
        xVar2.f330894a |= 2;
        xVar2.f330896c = z2;
        wVar.copyOnWrite();
        C118606x xVar3 = (C118606x) wVar.instance;
        str2.getClass();
        xVar3.f330894a |= 4;
        xVar3.f330897d = str2;
        if (z2 && !z) {
            C58976aa aaVar = C58975e.f156826a;
            C58485gu guVar = ((Hypothesis) list.get(0)).f253057c;
            int size = guVar.size();
            if (size > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < size; i++) {
                    Hypothesis.Span span = (Hypothesis.Span) guVar.get(i);
                    int size2 = span.f253062e.size();
                    if (size2 > 0) {
                        C118586d[] dVarArr = new C118586d[size2];
                        for (int i2 = 0; i2 < size2; i2++) {
                            C118576a aVar = (C118576a) C118586d.f330853e.createBuilder();
                            String str3 = (String) span.f253062e.get(i2);
                            aVar.copyOnWrite();
                            C118586d dVar = (C118586d) aVar.instance;
                            str3.getClass();
                            dVar.f330855a |= 1;
                            dVar.f330856b = str3;
                            C118585c cVar = C118585c.RECOGNITION;
                            aVar.copyOnWrite();
                            C118586d dVar2 = (C118586d) aVar.instance;
                            dVar2.f330858d = cVar.f330852d;
                            dVar2.f330855a |= 4;
                            dVarArr[i2] = (C118586d) aVar.build();
                        }
                        C118587e eVar = (C118587e) C118588f.f330859e.createBuilder();
                        eVar.mo103773a(Arrays.asList(dVarArr));
                        int i3 = span.f253060c;
                        eVar.copyOnWrite();
                        C118588f fVar = (C118588f) eVar.instance;
                        fVar.f330861a |= 1;
                        fVar.f330862b = i3;
                        int i4 = span.f253061d;
                        eVar.copyOnWrite();
                        C118588f fVar2 = (C118588f) eVar.instance;
                        fVar2.f330861a |= 2;
                        fVar2.f330863c = i4;
                        arrayList.add((C118588f) eVar.build());
                    }
                    int asInt = Collection.EL.stream(arrayList).mapToInt(C118608z.f330900a).max().getAsInt();
                    C118589g gVar = (C118589g) C118590h.f330865d.createBuilder();
                    gVar.copyOnWrite();
                    C118590h hVar = (C118590h) gVar.instance;
                    hVar.f330867a |= 1;
                    hVar.f330869c = asInt;
                    gVar.mo103774a(arrayList);
                    C118590h hVar2 = (C118590h) gVar.build();
                    wVar.copyOnWrite();
                    C118606x xVar4 = (C118606x) wVar.instance;
                    hVar2.getClass();
                    xVar4.f330899f = hVar2;
                    xVar4.f330894a |= 8;
                }
            }
            C118606x xVar5 = (C118606x) wVar.build();
        }
        C118599q qVar = (C118599q) C118600r.f330881b.createBuilder();
        qVar.copyOnWrite();
        C118600r rVar = (C118600r) qVar.instance;
        C118606x xVar6 = (C118606x) wVar.build();
        xVar6.getClass();
        C62971cq cqVar = rVar.f330883a;
        if (!cqVar.mo58948c()) {
            rVar.f330883a = C62942bv.mutableCopy(cqVar);
        }
        rVar.f330883a.add(xVar6);
        return (C118600r) qVar.build();
    }

    /* renamed from: b */
    public final void mo103764b() {
        if (this.f330834o != null) {
            C58976aa aaVar = C58975e.f156826a;
            C118695g gVar = this.f330834o;
            gVar.f331095c = false;
            gVar.mo103879a(new C90892az("TranscriptionClient#cancel", new C118691c(gVar)));
            gVar.f331093a.mo85150o(new C118694f(gVar), 100);
        }
        C60870cx cxVar = this.f330838s;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }

    /* renamed from: c */
    public final void mo103765c() {
        this.f330840u = null;
        C60870cx cxVar = this.f330838s;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        this.f330836q = true;
    }
}
