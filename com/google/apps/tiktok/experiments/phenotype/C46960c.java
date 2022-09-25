package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.c */
/* compiled from: PG */
final class C46960c implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C46905a f122458a;

    /* renamed from: b */
    final /* synthetic */ String f122459b;

    public C46960c(C46905a aVar, String str) {
        this.f122458a = aVar;
        this.f122459b = str;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        List<C46108a> list = (List) obj;
        C69664n.m101060f(list, "accounts");
        C46905a aVar = this.f122458a;
        String str = this.f122459b;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C46108a aVar2 : list) {
            AccountId a = aVar2.mo50209a();
            C69664n.m101060f(a, "it.id()");
            C46215j b = aVar2.mo50210b();
            C69664n.m101060f(b, "it.info()");
            arrayList.add(aVar.mo50909b(str, a, b));
        }
        return C47068v.m83725a(arrayList);
    }
}
