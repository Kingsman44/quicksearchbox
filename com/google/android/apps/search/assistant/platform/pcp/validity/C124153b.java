package com.google.android.apps.search.assistant.platform.pcp.validity;

import com.google.android.libraries.assistant.contexttrigger.C17626c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48909k;
import com.google.assistant.p3803ag.p3807b.p3808a.C48910l;
import com.google.assistant.p3803ag.p3807b.p3808a.C48912n;
import com.google.assistant.p3803ag.p3807b.p3808a.C48913o;
import com.google.assistant.p3803ag.p3807b.p3808a.C48916r;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48918t;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.validity.b */
/* compiled from: PG */
public final /* synthetic */ class C124153b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124166o f342856a;

    /* renamed from: b */
    public final /* synthetic */ C48918t f342857b;

    /* renamed from: c */
    public final /* synthetic */ C48952az f342858c;

    /* renamed from: d */
    public final /* synthetic */ long f342859d;

    /* renamed from: e */
    public final /* synthetic */ C48904f f342860e;

    /* renamed from: f */
    public final /* synthetic */ AccountId f342861f;

    /* renamed from: g */
    public final /* synthetic */ String f342862g;

    public /* synthetic */ C124153b(C124166o oVar, C48918t tVar, C48952az azVar, long j, C48904f fVar, AccountId accountId, String str) {
        this.f342856a = oVar;
        this.f342857b = tVar;
        this.f342858c = azVar;
        this.f342859d = j;
        this.f342860e = fVar;
        this.f342861f = accountId;
        this.f342862g = str;
    }

    public final C60870cx apply(Object obj) {
        C124166o oVar = this.f342856a;
        C48918t tVar = this.f342857b;
        C48952az azVar = this.f342858c;
        long j = this.f342859d;
        C48904f fVar = this.f342860e;
        AccountId accountId = this.f342861f;
        String str = this.f342862g;
        String str2 = (String) obj;
        C48916r rVar = (C48916r) C48917s.f126578f.createBuilder();
        str2.getClass();
        tVar.copyOnWrite();
        C48919u uVar = (C48919u) tVar.instance;
        C48919u uVar2 = C48919u.f126586g;
        uVar.f126588a |= 2;
        uVar.f126590c = str2;
        C48919u uVar3 = (C48919u) tVar.build();
        rVar.copyOnWrite();
        C48917s sVar = (C48917s) rVar.instance;
        uVar3.getClass();
        sVar.f126581b = uVar3;
        sVar.f126580a |= 1;
        rVar.copyOnWrite();
        C48917s sVar2 = (C48917s) rVar.instance;
        azVar.getClass();
        sVar2.f126582c = azVar;
        sVar2.f126580a |= 2;
        C48909k kVar = (C48909k) C48913o.f126569d.createBuilder();
        C48910l lVar = (C48910l) C48912n.f126565c.createBuilder();
        long d = C62948a.m95453d(oVar.f342905k);
        lVar.copyOnWrite();
        C48912n nVar = (C48912n) lVar.instance;
        nVar.f126567a = 1;
        nVar.f126568b = Long.valueOf(j + d);
        kVar.copyOnWrite();
        C48913o oVar2 = (C48913o) kVar.instance;
        C48912n nVar2 = (C48912n) lVar.build();
        nVar2.getClass();
        oVar2.f126573c = nVar2;
        oVar2.f126571a |= 2;
        rVar.copyOnWrite();
        C48917s sVar3 = (C48917s) rVar.instance;
        C48913o oVar3 = (C48913o) kVar.build();
        oVar3.getClass();
        sVar3.f126584e = oVar3;
        sVar3.f126580a |= 8;
        rVar.copyOnWrite();
        C48917s sVar4 = (C48917s) rVar.instance;
        fVar.getClass();
        sVar4.f126583d = fVar;
        sVar4.f126580a |= 4;
        ((C58970a) ((C58970a) oVar.f342909o.mo56224b()).mo56372aa(35437)).mo56389s("Delayed expiration time: %s", oVar.f342905k);
        C60870cx b = C17626c.m34919a(oVar.f342896b, accountId).mo23443b((C48917s) rVar.build());
        C60856cj.m92911t(b, C47810es.m84974n(new C124162k(oVar, str)), C60826bg.f164896a);
        return b;
    }
}
