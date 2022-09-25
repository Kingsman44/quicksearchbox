package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import com.google.p343ac.p357d.C6663e;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.et */
/* compiled from: PG */
final class C47035et implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C47038ew f122606a;

    /* renamed from: b */
    final /* synthetic */ String f122607b;

    public C47035et(C47038ew ewVar, String str) {
        this.f122606a = ewVar;
        this.f122607b = str;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        C46108a aVar = (C46108a) obj;
        C69664n.m101061g(aVar, "account");
        C47038ew ewVar = this.f122606a;
        C46983cw cwVar = ewVar.f122614b;
        String str = this.f122607b;
        C47034es esVar = new C47034es(ewVar, aVar);
        String a = cwVar.f122510g.mo50923a(str);
        return cwVar.mo50961a((C60930r) ((Map) cwVar.f122509f.mo27525b()).get(a), esVar, a, (C6663e) ((Map) cwVar.f122505b.mo27525b()).get(a));
    }
}
