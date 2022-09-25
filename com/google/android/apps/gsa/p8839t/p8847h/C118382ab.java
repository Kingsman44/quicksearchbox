package com.google.android.apps.gsa.p8839t.p8847h;

import com.bumptech.glide.p291h.C5622i;
import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.t.h.ab */
/* compiled from: PG */
public final /* synthetic */ class C118382ab implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328604a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f328605b;

    public /* synthetic */ C118382ab(C118426bs bsVar, C53306j jVar) {
        this.f328604a = bsVar;
        this.f328605b = jVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C118426bs bsVar = this.f328604a;
        C53306j jVar = this.f328605b;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (C58833ax axVar : (List) obj) {
            if (axVar == null || !axVar.mo56113h()) {
                ((C58970a) ((C58970a) bsVar.f328686g.mo56226d()).mo56372aa(6975)).mo56386p("#getOnDeviceMediaRecommendationMapFromOnDeviceMediaItems(): NULL or empty");
            } else {
                ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6976)).mo56386p("#getOnDeviceMediaRecommendationMapFromOnDeviceMediaItems() success");
                arrayList.add(C60922j.m93044g(C118443s.m196634b((C18913ab) axVar.mo56107c(), bsVar.f328697r, 3, bsVar.f328699t, bsVar.f328694o, jVar == C53306j.AMBIENT_ASSISTANT), C47810es.m84963c(new C118418bk(hashMap, axVar)), C5622i.f16960b));
            }
        }
        return bsVar.f328694o.mo28209i(C60856cj.m92896e(arrayList), "fetchOnDeviceMediaRecommendations", new C118419bl(hashMap));
    }
}
