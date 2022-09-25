package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p888a.p889a;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13045g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13049k;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13050l;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13124af;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13125ag;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13126ah;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13127ai;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13133ao;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13134ap;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13135aq;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13136ar;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13137as;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.C13138at;
import com.google.apps.tiktok.cache.C46386ax;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import java.util.HashSet;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C13112i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C123746bm f40649a;

    public /* synthetic */ C13112i(C123746bm bmVar) {
        this.f40649a = bmVar;
    }

    public final Object apply(Object obj) {
        C13048j jVar;
        C123746bm bmVar = this.f40649a;
        C58833ax axVar = (C58833ax) obj;
        C13049k kVar = (C13049k) C13050l.f40509d.createBuilder();
        C13045g gVar = (C13045g) C13048j.f40502e.createBuilder();
        if (bmVar == null) {
            jVar = (C13048j) gVar.build();
        } else {
            HashSet hashSet = new HashSet();
            Collection.EL.stream(bmVar.f341820a).filter(C13133ao.f40715a).flatMap(C13134ap.f40716a).flatMap(C13135aq.f40717a).filter(new C13136ar(hashSet)).forEach(new C13137as(gVar, hashSet));
            Collection.EL.stream(bmVar.f341820a).filter(C13138at.f40721a).flatMap(C13124af.f40705a).flatMap(C13125ag.f40706a).filter(new C13126ah(hashSet)).forEach(new C13127ai(gVar, hashSet));
            jVar = (C13048j) gVar.build();
        }
        kVar.copyOnWrite();
        C13050l lVar = (C13050l) kVar.instance;
        jVar.getClass();
        lVar.f40512b = jVar;
        lVar.f40511a |= 1;
        return new C46386ax((C13050l) kVar.build());
    }
}
