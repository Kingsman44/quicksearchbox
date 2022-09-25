package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.p2818a;

import android.accounts.Account;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36724ar;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.C50365uj;
import com.google.assistant.p3861at.C50366uk;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3861at.aef;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C36699i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36701k f95596a;

    /* renamed from: b */
    public final /* synthetic */ C36724ar f95597b;

    public /* synthetic */ C36699i(C36701k kVar, C36724ar arVar) {
        this.f95596a = kVar;
        this.f95597b = arVar;
    }

    public final C60870cx apply(Object obj) {
        C36701k kVar = this.f95596a;
        C36724ar arVar = this.f95597b;
        Account account = (Account) obj;
        C36624a aVar = kVar.f95600a;
        acw acw = (acw) acx.f128971H.createBuilder();
        if ((arVar.f95684a & 2) != 0) {
            C50365uj ujVar = (C50365uj) C50366uk.f131111d.createBuilder();
            int a = aef.m85735a(arVar.f95685b);
            if (a == 0) {
                a = 1;
            }
            ujVar.copyOnWrite();
            C50366uk ukVar = (C50366uk) ujVar.instance;
            ukVar.f131114b = a - 1;
            ukVar.f131113a |= 1;
            C63088z zVar = arVar.f95686c;
            ujVar.copyOnWrite();
            C50366uk ukVar2 = (C50366uk) ujVar.instance;
            zVar.getClass();
            ukVar2.f131113a |= 2;
            ukVar2.f131115c = zVar;
            acw.copyOnWrite();
            acx acx = (acx) acw.instance;
            C50366uk ukVar3 = (C50366uk) ujVar.build();
            ukVar3.getClass();
            acx.f129001r = ukVar3;
            acx.f128984a |= 1048576;
        }
        return C60922j.m93045h(aVar.mo40254r(account, (acx) acw.build()), C47810es.m84966f(C36692b.f95583a), C60826bg.f164896a);
    }
}
