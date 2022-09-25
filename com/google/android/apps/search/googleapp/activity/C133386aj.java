package com.google.android.apps.search.googleapp.activity;

import android.content.Intent;
import com.google.android.apps.search.googleapp.p10310h.C136126g;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import java.util.Collections;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.activity.aj */
/* compiled from: PG */
public final /* synthetic */ class C133386aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133387ak f363449a;

    /* renamed from: b */
    public final /* synthetic */ C133444w f363450b;

    /* renamed from: c */
    public final /* synthetic */ Intent f363451c;

    public /* synthetic */ C133386aj(C133387ak akVar, C133444w wVar, Intent intent) {
        this.f363449a = akVar;
        this.f363450b = wVar;
        this.f363451c = intent;
    }

    public final Object apply(Object obj) {
        C133387ak akVar = this.f363449a;
        C133444w wVar = this.f363450b;
        Intent intent = this.f363451c;
        AccountId accountId = (AccountId) obj;
        if (wVar != null && intent.getBooleanExtra("navigate_to_existing_homescreen_tab", false)) {
            C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
            C139779t tVar = C139779t.HOME_SCREEN;
            fVar.copyOnWrite();
            C139767h hVar = (C139767h) fVar.instance;
            hVar.f379872b = tVar.f379907i;
            hVar.f379871a |= 1;
            fVar.copyOnWrite();
            C139767h hVar2 = (C139767h) fVar.instance;
            hVar2.f379871a |= 32;
            hVar2.f379878h = true;
            wVar.mo111151h((C139767h) fVar.build());
        } else if (wVar != null && intent.getBooleanExtra("navigate_to_existing_search_tab", false)) {
            C139765f fVar2 = (C139765f) C139767h.f379869k.createBuilder();
            C139779t tVar2 = C139779t.SEARCH;
            fVar2.copyOnWrite();
            C139767h hVar3 = (C139767h) fVar2.instance;
            hVar3.f379872b = tVar2.f379907i;
            hVar3.f379871a |= 1;
            fVar2.copyOnWrite();
            C139767h hVar4 = (C139767h) fVar2.instance;
            hVar4.f379871a |= 32;
            hVar4.f379878h = true;
            Optional g = akVar.mo111118g(C136126g.m221189c(intent));
            if (g.isPresent()) {
                String str = ((C137418g) g.get()).f373770b;
                fVar2.copyOnWrite();
                C139767h hVar5 = (C139767h) fVar2.instance;
                str.getClass();
                hVar5.f379871a |= 8;
                hVar5.f379876f = str;
                fVar2.mo115229a(Collections.unmodifiableMap(((C137418g) g.get()).f373773e));
            }
            wVar.mo111151h((C139767h) fVar2.build());
        } else if (wVar == null || !intent.getBooleanExtra("navigate_to_existing_collections_tab", false)) {
            akVar.mo111119h(accountId, akVar.mo111117f());
        } else {
            C139765f fVar3 = (C139765f) C139767h.f379869k.createBuilder();
            C139779t tVar3 = C139779t.COLLECTIONS;
            fVar3.copyOnWrite();
            C139767h hVar6 = (C139767h) fVar3.instance;
            hVar6.f379872b = tVar3.f379907i;
            hVar6.f379871a |= 1;
            fVar3.copyOnWrite();
            C139767h hVar7 = (C139767h) fVar3.instance;
            hVar7.f379871a |= 32;
            hVar7.f379878h = true;
            wVar.mo111151h((C139767h) fVar3.build());
        }
        return true;
    }
}
