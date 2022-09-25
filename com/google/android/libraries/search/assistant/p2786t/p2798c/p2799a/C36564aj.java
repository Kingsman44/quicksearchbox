package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36527a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36603f;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36604g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36536h;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36539k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36540l;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36541m;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36542n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C36564aj implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C36568an f95362a;

    /* renamed from: b */
    public final /* synthetic */ C36604g f95363b;

    public /* synthetic */ C36564aj(C36568an anVar, C36604g gVar) {
        this.f95362a = anVar;
        this.f95363b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C36568an anVar = this.f95362a;
        C36527a aVar = (C36527a) this.f95363b;
        C36603f fVar = aVar.f95302a;
        C58485gu guVar = aVar.f95303b;
        C36540l lVar = (C36540l) C36541m.f95314d.createBuilder();
        lVar.copyOnWrite();
        C36541m mVar = (C36541m) lVar.instance;
        mVar.f95318c = fVar;
        mVar.f95316a |= 2;
        C36608k kVar = anVar.f95372c;
        lVar.copyOnWrite();
        C36541m mVar2 = (C36541m) lVar.instance;
        mVar2.f95317b = kVar;
        mVar2.f95316a |= 1;
        C36541m mVar3 = (C36541m) lVar.build();
        if (guVar.isEmpty()) {
            C36536h hVar = anVar.f95370a;
            C36539k kVar2 = (C36539k) C36542n.f95319e.createBuilder();
            kVar2.copyOnWrite();
            C36542n nVar = (C36542n) kVar2.instance;
            mVar3.getClass();
            nVar.f95323c = mVar3;
            nVar.f95322b = 1;
            kVar2.copyOnWrite();
            C36542n nVar2 = (C36542n) kVar2.instance;
            nVar2.f95321a |= 1;
            nVar2.f95324d = true;
            return C60922j.m93044g(hVar.mo40215b((C36542n) kVar2.build()), C47810es.m84963c(C36565ak.f95364a), C60826bg.f164896a);
        }
        boolean z = false;
        C36536h b = anVar.mo40222b((C36476g) guVar.get(0));
        C36539k kVar3 = (C36539k) C36542n.f95319e.createBuilder();
        kVar3.copyOnWrite();
        C36542n nVar3 = (C36542n) kVar3.instance;
        mVar3.getClass();
        nVar3.f95323c = mVar3;
        nVar3.f95322b = 1;
        if (guVar.size() == 1) {
            z = true;
        }
        kVar3.copyOnWrite();
        C36542n nVar4 = (C36542n) kVar3.instance;
        nVar4.f95321a |= 1;
        nVar4.f95324d = z;
        C60870cx b2 = b.mo40215b((C36542n) kVar3.build());
        for (int i = 1; i < guVar.size(); i++) {
            b2 = C60922j.m93045h(b2, C47810es.m84966f(new C36566al(anVar, guVar, i)), anVar.f95371b);
        }
        return C60922j.m93044g(b2, C47810es.m84963c(C36565ak.f95364a), C60826bg.f164896a);
    }
}
