package com.google.android.libraries.assistant.pcp.p1579n;

import com.google.android.libraries.assistant.pcp.p1578m.C18982l;
import com.google.android.libraries.assistant.pcp.p1578m.C18983m;
import com.google.android.libraries.assistant.pcp.p1578m.C18988r;
import com.google.android.libraries.assistant.pcp.p1578m.C18989s;
import com.google.assistant.p3803ag.p3809c.C49111gw;
import com.google.assistant.p3994s.p3995a.C53306j;
import java.util.List;
import p3186j$.util.Optional;
import p3186j$.util.function.IntFunction;

/* renamed from: com.google.android.libraries.assistant.pcp.n.g */
/* compiled from: PG */
public final /* synthetic */ class C19019g implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ C19023k f53401a;

    /* renamed from: b */
    public final /* synthetic */ Optional f53402b;

    /* renamed from: c */
    public final /* synthetic */ List f53403c;

    public /* synthetic */ C19019g(C19023k kVar, Optional optional, List list) {
        this.f53401a = kVar;
        this.f53402b = optional;
        this.f53403c = list;
    }

    public final Object apply(int i) {
        C19023k kVar = this.f53401a;
        Optional optional = this.f53402b;
        List list = this.f53403c;
        C18982l lVar = (C18982l) C18983m.f53340e.createBuilder();
        C18988r rVar = (C18988r) C18989s.f53353f.createBuilder();
        int a = kVar.f53409a.mo24245a().mo24070a();
        rVar.copyOnWrite();
        C18989s sVar = (C18989s) rVar.instance;
        sVar.f53355a |= 1;
        sVar.f53356b = a;
        String d = kVar.mo24254d();
        rVar.copyOnWrite();
        C18989s sVar2 = (C18989s) rVar.instance;
        sVar2.f53355a |= 2;
        sVar2.f53357c = d;
        rVar.copyOnWrite();
        C18989s sVar3 = (C18989s) rVar.instance;
        sVar3.f53358d = ((C53306j) optional.get()).f139793X;
        sVar3.f53355a |= 4;
        String valueOf = String.valueOf(i);
        rVar.copyOnWrite();
        C18989s sVar4 = (C18989s) rVar.instance;
        valueOf.getClass();
        sVar4.f53355a |= 8;
        sVar4.f53359e = valueOf;
        C18989s sVar5 = (C18989s) rVar.build();
        lVar.copyOnWrite();
        C18983m mVar = (C18983m) lVar.instance;
        sVar5.getClass();
        mVar.f53343b = sVar5;
        mVar.f53342a |= 1;
        C49111gw gwVar = (C49111gw) list.get(i);
        lVar.copyOnWrite();
        C18983m mVar2 = (C18983m) lVar.instance;
        gwVar.getClass();
        mVar2.f53345d = gwVar;
        mVar2.f53342a |= 4;
        return (C18983m) lVar.build();
    }
}
