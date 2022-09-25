package com.google.android.apps.search.googleapp.saves.p10388b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58819aj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57616cf;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57618ch;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57643df;
import java.util.HashMap;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.g */
/* compiled from: PG */
public final /* synthetic */ class C137212g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137230y f373330a;

    /* renamed from: b */
    public final /* synthetic */ C57616cf f373331b;

    public /* synthetic */ C137212g(C137230y yVar, C57616cf cfVar) {
        this.f373330a = yVar;
        this.f373331b = cfVar;
    }

    public final C60870cx apply(Object obj) {
        C57643df dfVar;
        C137230y yVar = this.f373330a;
        C57616cf cfVar = this.f373331b;
        int size = cfVar.f153907a.size();
        if (size == 0) {
            return C60866ct.f164955a;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < size; i++) {
            C57569am amVar = ((C57618ch) cfVar.f153907a.get(i)).f153911a;
            if (amVar == null) {
                amVar = C57569am.f153797f;
            }
            if (amVar.f153799a == 9) {
                dfVar = (C57643df) amVar.f153800b;
            } else {
                dfVar = C57643df.f153945e;
            }
            C137230y.m223008g(dfVar, new C137209d(hashMap));
        }
        C60870cx g = yVar.f373361b.mo50347g(hashMap);
        C58819aj ajVar = new C58819aj((Object) null);
        return C60922j.m93044g(g, C47810es.m84963c(ajVar), yVar.f373364e);
    }
}
