package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import com.google.android.libraries.search.assistant.p2868z.p2869a.C37165c;
import com.google.android.libraries.search.assistant.p2868z.p2869a.C37168f;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.aew;
import com.google.assistant.p3861at.aey;
import com.google.assistant.p3861at.aft;
import com.google.assistant.p3861at.afu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.d */
/* compiled from: PG */
public final /* synthetic */ class C131904d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C131921u f360175a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f360176b;

    /* renamed from: c */
    public final /* synthetic */ String f360177c;

    public /* synthetic */ C131904d(C131921u uVar, AccountId accountId, String str) {
        this.f360175a = uVar;
        this.f360176b = accountId;
        this.f360177c = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C131921u uVar = this.f360175a;
        AccountId accountId = this.f360176b;
        String str = this.f360177c;
        C37165c fJ = uVar.mo110346a(accountId).mo110349fJ();
        C37168f fVar = new C37168f();
        acu acu = (acu) acv.f128920X.createBuilder();
        aft aft = (aft) afu.f129178e.createBuilder();
        aft.copyOnWrite();
        afu afu = (afu) aft.instance;
        str.getClass();
        C62971cq cqVar = afu.f129181b;
        if (!cqVar.mo58948c()) {
            afu.f129181b = C62942bv.mutableCopy(cqVar);
        }
        afu.f129181b.add(str);
        aft.mo53358a(1);
        aft.mo53358a(5);
        aew aew = (aew) aey.f129137e.createBuilder();
        aew.copyOnWrite();
        aey aey = (aey) aew.instance;
        aey.f129142d = 2;
        aey.f129139a |= 8;
        aey aey2 = (aey) aew.build();
        aft.copyOnWrite();
        afu afu2 = (afu) aft.instance;
        aey2.getClass();
        afu2.f129183d = aey2;
        afu2.f129180a |= 2048;
        afu afu3 = (afu) aft.build();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        afu3.getClass();
        acv.f128958n = afu3;
        acv.f128945a |= 32768;
        fVar.mo40666b((acv) acu.build());
        fVar.mo40667c(C131921u.class.getSimpleName());
        return fJ.mo40669a(fVar.mo40665a());
    }
}
