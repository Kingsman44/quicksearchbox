package com.google.android.apps.search.googleapp.saves.savefeature.p10392a;

import com.google.android.apps.search.googleapp.saves.p10388b.C137230y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57637d;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57643df;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.d */
/* compiled from: PG */
public final /* synthetic */ class C137261d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137274p f373431a;

    /* renamed from: b */
    public final /* synthetic */ C57637d f373432b;

    public /* synthetic */ C137261d(C137274p pVar, C57637d dVar) {
        this.f373431a = pVar;
        this.f373432b = dVar;
    }

    public final C60870cx apply(Object obj) {
        C57643df dfVar;
        C137274p pVar = this.f373431a;
        C57637d dVar = this.f373432b;
        Void voidR = (Void) obj;
        C62971cq<C57569am> cqVar = dVar.f153938a;
        ArrayList arrayList = new ArrayList();
        for (C57569am amVar : cqVar) {
            C137230y yVar = pVar.f373454f;
            if (amVar.f153799a == 9) {
                dfVar = (C57643df) amVar.f153800b;
            } else {
                dfVar = C57643df.f153945e;
            }
            arrayList.add(yVar.mo113593a(dfVar));
        }
        C60870cx a = C47638k.m84750a(arrayList).mo51520a(C137268j.f373441a, pVar.f373458j);
        C137267i iVar = new C137267i(dVar);
        return C60922j.m93044g(a, C47810es.m84963c(iVar), pVar.f373458j);
    }
}
