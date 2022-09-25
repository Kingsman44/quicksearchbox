package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4017at.p4082j.p4083a.C54316at;
import com.google.p4017at.p4082j.p4083a.C54317au;
import com.google.p4017at.p4082j.p4083a.C54318av;
import com.google.p4017at.p4082j.p4083a.C54319aw;
import com.google.p4017at.p4082j.p4083a.C54383ci;
import com.google.p4017at.p4082j.p4083a.C54384cj;
import com.google.p4017at.p4082j.p4083a.C54385ck;
import com.google.p4017at.p4082j.p4083a.C54388cn;
import com.google.p4017at.p4082j.p4083a.C54393cs;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import java.util.Collection;
import java.util.Map;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.b.a.m */
/* compiled from: PG */
final class C140000m extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140002o f380519a;

    /* renamed from: b */
    final /* synthetic */ Map f380520b;

    /* renamed from: c */
    final /* synthetic */ C139988a f380521c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140000m(C140002o oVar, Map map, C139988a aVar) {
        super(1);
        this.f380519a = oVar;
        this.f380520b = map;
        this.f380521c = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C140003p pVar = (C140003p) obj;
        C69664n.m101061g(pVar, "results");
        if (pVar.f380525a.isEmpty()) {
            return C60856cj.m92900i(pVar);
        }
        C140002o oVar = this.f380519a;
        Map map = pVar.f380525a;
        C54316at atVar = (C54316at) C54319aw.f142692b.createBuilder();
        C69664n.m101060f(atVar, "newBuilder()");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Collection<String> collection = (Collection) entry.getValue();
            C54317au auVar = (C54317au) C54318av.f142688c.createBuilder();
            C54393cs csVar = (C54393cs) C54394ct.f142866c.createBuilder();
            csVar.copyOnWrite();
            str.getClass();
            ((C54394ct) csVar.instance).f142869b = str;
            auVar.copyOnWrite();
            C54394ct ctVar = (C54394ct) csVar.build();
            ctVar.getClass();
            ((C54318av) auVar.instance).f142690a = ctVar;
            if (!collection.isEmpty()) {
                C54384cj cjVar = (C54384cj) C54385ck.f142847b.createBuilder();
                C69664n.m101060f(cjVar, "newBuilder()");
                for (String a : collection) {
                    cjVar.mo54112a(a);
                }
                C54383ci ciVar = (C54383ci) C54388cn.f142853d.createBuilder();
                ciVar.copyOnWrite();
                C54388cn cnVar = (C54388cn) ciVar.instance;
                C54385ck ckVar = (C54385ck) cjVar.build();
                ckVar.getClass();
                cnVar.f142856b = ckVar;
                cnVar.f142855a = 2;
                auVar.copyOnWrite();
                C54388cn cnVar2 = (C54388cn) ciVar.build();
                cnVar2.getClass();
                ((C54318av) auVar.instance).f142691b = cnVar2;
            }
            atVar.mo54087a(auVar);
        }
        return C140989k.m228945c(C140989k.m228945c(oVar.f380524b.mo115641a((C54319aw) atVar.build()), new C139998k(oVar)), new C139999l(this.f380519a, this.f380520b, this.f380521c));
    }
}
