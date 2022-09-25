package com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a;

import com.google.android.libraries.search.assistant.p2828y.p2854o.C37043e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60922j;
import com.google.p4117aw.p4118a.p4119a.C54624b;
import com.google.p4117aw.p4118a.p4119a.C54631i;
import com.google.p4117aw.p4118a.p4119a.C54632j;
import com.google.p4117aw.p4118a.p4119a.C54633k;
import com.google.p4117aw.p4118a.p4119a.C54634l;
import com.google.p4117aw.p4118a.p4119a.C54635m;
import com.google.p4117aw.p4118a.p4119a.C54636n;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.y.o.a.a */
/* compiled from: PG */
public final /* synthetic */ class C37024a implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f96435a;

    /* renamed from: b */
    public final /* synthetic */ C37043e f96436b;

    /* renamed from: c */
    public final /* synthetic */ Executor f96437c;

    public /* synthetic */ C37024a(C58495hd hdVar, C37043e eVar, Executor executor) {
        this.f96435a = hdVar;
        this.f96436b = eVar;
        this.f96437c = executor;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C58495hd hdVar = this.f96435a;
        C37043e eVar = this.f96436b;
        Executor executor = this.f96437c;
        C59071e eVar2 = C37033d.f96469a;
        C54631i iVar = (C54631i) C54636n.f143450b.createBuilder();
        C58800sl lA = hdVar.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if (!C37033d.f96470b.containsKey(entry.getKey())) {
                ((C59052c) ((C59052c) C37033d.f96469a.mo56226d()).mo56372aa(52497)).mo56386p("Unexpected PkgContextDataType when creating PkgTopNamedEntitiesRequest.");
            } else {
                C54634l lVar = (C54634l) C54635m.f143445d.createBuilder();
                lVar.copyOnWrite();
                C54635m mVar = (C54635m) lVar.instance;
                mVar.f143448b = ((C54624b) Map.EL.getOrDefault(C37033d.f96470b, entry.getKey(), C54624b.UNSPECIFIED)).f143427v;
                mVar.f143447a |= 1;
                C54632j jVar = (C54632j) C54633k.f143441c.createBuilder();
                int intValue = ((Integer) entry.getValue()).intValue();
                jVar.copyOnWrite();
                C54633k kVar = (C54633k) jVar.instance;
                kVar.f143443a |= 1;
                kVar.f143444b = intValue;
                lVar.copyOnWrite();
                C54635m mVar2 = (C54635m) lVar.instance;
                C54633k kVar2 = (C54633k) jVar.build();
                kVar2.getClass();
                mVar2.f143449c = kVar2;
                mVar2.f143447a |= 2;
                iVar.mo54150a(lVar);
            }
        }
        return C60922j.m93044g(eVar.mo40585b((C54636n) iVar.build()), C47810es.m84963c(C37032c.f96468a), executor);
    }
}
