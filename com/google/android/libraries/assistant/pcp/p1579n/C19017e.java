package com.google.android.libraries.assistant.pcp.p1579n;

import com.google.assistant.p3803ag.p3809c.C49108gt;
import com.google.assistant.p3803ag.p3809c.C49109gu;
import com.google.assistant.p3803ag.p3809c.C49111gw;
import com.google.assistant.p3994s.p3995a.C53306j;
import java.util.List;
import p3186j$.util.function.IntFunction;

/* renamed from: com.google.android.libraries.assistant.pcp.n.e */
/* compiled from: PG */
public final /* synthetic */ class C19017e implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ List f53397a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f53398b;

    public /* synthetic */ C19017e(List list, C53306j jVar) {
        this.f53397a = list;
        this.f53398b = jVar;
    }

    public final Object apply(int i) {
        List list = this.f53397a;
        C53306j jVar = this.f53398b;
        C49108gt gtVar = (C49108gt) C49109gu.f127011f.createBuilder();
        C49111gw gwVar = (C49111gw) list.get(i);
        gtVar.copyOnWrite();
        C49109gu guVar = (C49109gu) gtVar.instance;
        gwVar.getClass();
        guVar.f127014b = gwVar;
        guVar.f127013a |= 1;
        gtVar.copyOnWrite();
        C49109gu guVar2 = (C49109gu) gtVar.instance;
        guVar2.f127016d = jVar.f139793X;
        guVar2.f127013a |= 4;
        String valueOf = String.valueOf(i);
        gtVar.copyOnWrite();
        C49109gu guVar3 = (C49109gu) gtVar.instance;
        valueOf.getClass();
        guVar3.f127013a |= 2;
        guVar3.f127015c = valueOf;
        return (C49109gu) gtVar.build();
    }
}
