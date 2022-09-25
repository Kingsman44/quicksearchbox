package com.google.android.apps.search.googleapp.saves.savefeature.p10392a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.saves.p10388b.C137230y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57595bl;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57597bn;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57643df;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.e */
/* compiled from: PG */
public final /* synthetic */ class C137263e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137274p f373433a;

    /* renamed from: b */
    public final /* synthetic */ C57595bl f373434b;

    public /* synthetic */ C137263e(C137274p pVar, C57595bl blVar) {
        this.f373433a = pVar;
        this.f373434b = blVar;
    }

    public final C60870cx apply(Object obj) {
        C57643df dfVar;
        C137274p pVar = this.f373433a;
        C57597bn bnVar = (C57597bn) obj;
        C57663x xVar = this.f373434b.f153867b;
        if (xVar == null) {
            xVar = C57663x.f153984d;
        }
        String str = xVar.f153986a == 4 ? (String) xVar.f153987b : BuildConfig.FLAVOR;
        C57569am amVar = bnVar.f153873a;
        if (amVar == null) {
            amVar = C57569am.f153797f;
        }
        C137230y yVar = pVar.f373454f;
        if (amVar.f153799a == 9) {
            dfVar = (C57643df) amVar.f153800b;
        } else {
            dfVar = C57643df.f153945e;
        }
        return C60922j.m93044g(yVar.mo113596d(str, dfVar), C47810es.m84963c(new C137264f(bnVar)), pVar.f373458j);
    }
}
