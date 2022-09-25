package com.google.android.libraries.geller.portable.database;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5030q.p5032b.C65059f;
import com.google.protos.p4985f.p5030q.p5032b.C65066m;
import com.google.protos.p4985f.p5030q.p5032b.C65070q;
import com.google.protos.p4985f.p5030q.p5032b.C65071r;
import com.google.protos.p5129p.p5131b.C65783bn;
import com.google.protos.p5129p.p5131b.C65786bq;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.geller.portable.database.w */
/* compiled from: PG */
public final /* synthetic */ class C21975w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C65071r f60606a;

    /* renamed from: b */
    public final /* synthetic */ String f60607b;

    /* renamed from: c */
    public final /* synthetic */ C42876ab f60608c;

    public /* synthetic */ C21975w(C65071r rVar, String str, C42876ab abVar) {
        this.f60606a = rVar;
        this.f60607b = str;
        this.f60608c = abVar;
    }

    public final C60870cx apply(Object obj) {
        long j;
        C65071r rVar = this.f60606a;
        String str = this.f60607b;
        C42876ab abVar = this.f60608c;
        HashMap hashMap = new HashMap(Collections.unmodifiableMap(((C65786bq) obj).f178836a));
        int i = rVar.f176211b;
        long j2 = 0;
        if (i == 1) {
            C62971cq<C65059f> cqVar = ((C65066m) rVar.f176212c).f176199a;
            C58480gp e = C58485gu.m89837e();
            C58480gp e2 = C58485gu.m89837e();
            for (C65059f fVar : cqVar) {
                int i2 = fVar.f176182a;
                if ((i2 & 2) != 0) {
                    e.mo55395g(fVar);
                } else if ((i2 & 1) != 0) {
                    e2.mo55395g(Long.valueOf(fVar.f176183b));
                }
            }
            C58485gu f = e.mo55394f();
            int i3 = ((C58724pq) f).f156474d;
            for (int i4 = 0; i4 < i3; i4++) {
                C65059f fVar2 = (C65059f) f.get(i4);
                if ((fVar2.f176182a & 1) != 0) {
                    j = C21977y.m41209h(hashMap, fVar2.f176184c, fVar2.f176183b);
                } else {
                    j = (long) ((C65783bn) hashMap.remove(fVar2.f176184c)).f178831a.size();
                }
                j2 += j;
            }
            j2 += C21977y.m41210i(hashMap, e2.mo55394f());
        } else if (i == 2) {
            C65070q qVar = (C65070q) rVar.f176212c;
            C62964ck<Long> ckVar = qVar.f176206a;
            C62971cq<String> cqVar2 = qVar.f176207b;
            if (ckVar.isEmpty() && cqVar2.isEmpty()) {
                j2 = C21977y.m41208g(hashMap, str);
            } else if (ckVar.isEmpty()) {
                for (String remove : cqVar2) {
                    j2 += (long) ((C65783bn) hashMap.remove(remove)).f178831a.size();
                }
            } else if (cqVar2.isEmpty()) {
                j2 = C21977y.m41210i(hashMap, ckVar);
            } else if (!cqVar2.isEmpty() && !ckVar.isEmpty()) {
                for (String str2 : cqVar2) {
                    for (Long longValue : ckVar) {
                        j2 += C21977y.m41209h(hashMap, str2, longValue.longValue());
                    }
                }
            }
        } else if (i == 4 && ((Boolean) rVar.f176212c).booleanValue()) {
            j2 = C21977y.m41208g(hashMap, str);
        }
        return C60922j.m93044g(C60838bs.m92859i(C21977y.m41214m(abVar, hashMap, Long.valueOf(j2))), C47810es.m84963c(C21968p.f60595a), C60826bg.f164896a);
    }
}
