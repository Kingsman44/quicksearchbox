package com.google.android.apps.search.googleapp.tabs.manager;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.incognito.p10333i.C136353h;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139771l;
import com.google.android.apps.search.googleapp.p10527u.C139776q;
import com.google.android.apps.search.googleapp.p10527u.C139777r;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139712d;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.ai */
/* compiled from: PG */
public final /* synthetic */ class C139727ai implements C139771l {

    /* renamed from: a */
    public final /* synthetic */ AccountId f379802a;

    /* renamed from: b */
    public final /* synthetic */ C38553h f379803b;

    public /* synthetic */ C139727ai(C38553h hVar, AccountId accountId) {
        this.f379803b = hVar;
        this.f379802a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo111217a(C139770k kVar) {
        C139712d dVar;
        C38553h hVar = this.f379803b;
        AccountId accountId = this.f379802a;
        if (hVar.f101930a) {
            C139776q qVar = (C139776q) C139777r.f379893c.createBuilder();
            C139779t tVar = C139779t.TABS;
            qVar.copyOnWrite();
            C139777r rVar = (C139777r) qVar.instance;
            rVar.f379896b = tVar.f379907i;
            rVar.f379895a |= 1;
            return C136353h.m221535a(accountId, (C139777r) qVar.build());
        }
        C139747n nVar = (C139747n) C139748o.f379849d.createBuilder();
        if (kVar.f379884a == 5) {
            dVar = (C139712d) kVar.f379885b;
        } else {
            dVar = C139712d.f379748d;
        }
        nVar.copyOnWrite();
        C139748o oVar = (C139748o) nVar.instance;
        dVar.getClass();
        oVar.f379852b = dVar;
        oVar.f379851a |= 1;
        nVar.copyOnWrite();
        C139748o oVar2 = (C139748o) nVar.instance;
        oVar2.f379851a |= 2;
        oVar2.f379853c = true;
        return C139720ac.m227166a(accountId, (C139748o) nVar.build());
    }
}
