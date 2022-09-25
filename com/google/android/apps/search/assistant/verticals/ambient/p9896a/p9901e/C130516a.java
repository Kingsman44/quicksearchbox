package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9901e;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9959b.C131211a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9959b.C131214d;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131265b;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60944c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.ArrayList;
import java.util.Collection;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.e.a */
/* compiled from: PG */
public final /* synthetic */ class C130516a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130531p f357535a;

    /* renamed from: b */
    public final /* synthetic */ C50819dp f357536b;

    /* renamed from: c */
    public final /* synthetic */ Instant f357537c;

    /* renamed from: d */
    public final /* synthetic */ String f357538d;

    /* renamed from: e */
    public final /* synthetic */ int f357539e;

    public /* synthetic */ C130516a(C130531p pVar, C50819dp dpVar, Instant instant, int i, String str) {
        this.f357535a = pVar;
        this.f357536b = dpVar;
        this.f357537c = instant;
        this.f357539e = i;
        this.f357538d = str;
    }

    public final C60870cx apply(Object obj) {
        C130531p pVar = this.f357535a;
        C50819dp dpVar = this.f357536b;
        Instant instant = this.f357537c;
        int i = this.f357539e;
        String str = this.f357538d;
        C58485gu guVar = (C58485gu) obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!guVar.isEmpty()) {
            C50819dp dpVar2 = ((C131214d) guVar.get(0)).f358829b;
            if (dpVar2 == null) {
                dpVar2 = C50819dp.f132330b;
            }
            arrayList2.addAll(dpVar2.f132332a);
            arrayList.addAll((Collection) Collection.EL.stream(dpVar2.f132332a).map(C130525j.f357555a).collect(Collectors.toCollection(C130526k.f357556a)));
        }
        for (C50818do doVar : dpVar.f132332a) {
            for (C131265b a : pVar.f357569e) {
                a.mo110141a(doVar, arrayList2);
            }
            if (!arrayList.contains(Integer.valueOf(doVar.f132307d)) && C131251t.m213743k(doVar)) {
                Instant f = C131251t.m213742f(doVar);
                C131251t.m213744m(doVar);
                C130895ag agVar = pVar.f357574j;
                C50794cr a2 = C50794cr.m85938a(doVar.f132315l);
                if (a2 == null) {
                    a2 = C50794cr.UNDEFINED;
                }
                agVar.mo109899aH(a2.name(), Duration.between(f, instant));
            }
        }
        C38469m mVar = pVar.f357570f;
        C65753ak akVar = C65753ak.SMARTSPACE_CARD_UPDATE_RECORD;
        Instant a3 = pVar.f357575k.mo57444a();
        C131211a aVar = (C131211a) C131214d.f358826e.createBuilder();
        aVar.copyOnWrite();
        C131214d dVar = (C131214d) aVar.instance;
        dVar.f358830c = i - 1;
        dVar.f358828a |= 2;
        aVar.copyOnWrite();
        C131214d dVar2 = (C131214d) aVar.instance;
        dpVar.getClass();
        dVar2.f358829b = dpVar;
        dVar2.f358828a |= 1;
        aVar.copyOnWrite();
        C131214d dVar3 = (C131214d) aVar.instance;
        str.getClass();
        dVar3.f358828a |= 4;
        dVar3.f358831d = str;
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        azVar.f178795a |= 4;
        azVar.f178798d = BuildConfig.FLAVOR;
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long b = C60944c.m93089b(Duration.ofMillis(a3.toEpochMilli()));
        cVar.copyOnWrite();
        C65139d dVar4 = (C65139d) cVar.instance;
        dVar4.f176309a |= 1;
        dVar4.f176310b = b;
        cVar.copyOnWrite();
        C65139d dVar5 = (C65139d) cVar.instance;
        dVar5.f176309a |= 2;
        dVar5.f176311c = 0;
        cVar.copyOnWrite();
        C65139d dVar6 = (C65139d) cVar.instance;
        dVar6.f176309a |= 4;
        dVar6.f176312d = 0;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C65139d dVar7 = (C65139d) cVar.build();
        dVar7.getClass();
        azVar2.f178796b = dVar7;
        azVar2.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/com.google.android.apps.search.assistant.verticals.ambient.shared.storage.cardupdate.CardUpdateRecord";
        C63088z byteString = ((C131214d) aVar.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar3 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        azVar3.f178799e = hVar;
        azVar3.f178795a |= 8;
        return mVar.mo41434e(akVar, (C65768az) ayVar.build());
    }
}
