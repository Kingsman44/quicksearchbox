package com.google.android.libraries.geller.portable.database;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
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
import com.google.protos.p4985f.p5030q.p5032b.C65016aa;
import com.google.protos.p4985f.p5030q.p5032b.C65018ac;
import com.google.protos.p4985f.p5030q.p5032b.C65019ad;
import com.google.protos.p4985f.p5030q.p5032b.C65059f;
import com.google.protos.p5129p.p5131b.C65786bq;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.geller.portable.database.s */
/* compiled from: PG */
public final /* synthetic */ class C21971s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C65019ad f60598a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f60599b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f60600c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f60601d;

    /* renamed from: e */
    public final /* synthetic */ C42876ab f60602e;

    public /* synthetic */ C21971s(C65019ad adVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C42876ab abVar) {
        this.f60598a = adVar;
        this.f60599b = axVar;
        this.f60600c = axVar2;
        this.f60601d = axVar3;
        this.f60602e = abVar;
    }

    public final C60870cx apply(Object obj) {
        int i;
        int i2;
        long j;
        C65019ad adVar = this.f60598a;
        C58833ax axVar = this.f60599b;
        C58833ax axVar2 = this.f60600c;
        C58833ax axVar3 = this.f60601d;
        C42876ab abVar = this.f60602e;
        HashMap hashMap = new HashMap(Collections.unmodifiableMap(((C65786bq) obj).f178836a));
        int i3 = adVar.f176074a;
        long j2 = 0;
        if (i3 == 1) {
            C62971cq<C65059f> cqVar = ((C65016aa) adVar.f176075b).f176067a;
            C58480gp e = C58485gu.m89837e();
            C58480gp e2 = C58485gu.m89837e();
            for (C65059f fVar : cqVar) {
                int i4 = fVar.f176182a;
                if ((i4 & 2) != 0) {
                    e.mo55395g(fVar);
                } else if ((i4 & 1) != 0) {
                    e2.mo55395g(Long.valueOf(fVar.f176183b));
                }
            }
            C58485gu f = e.mo55394f();
            int i5 = ((C58724pq) f).f156474d;
            long j3 = 0;
            int i6 = 0;
            while (i6 < i5) {
                C65059f fVar2 = (C65059f) f.get(i6);
                if ((fVar2.f176182a & 1) != 0) {
                    i2 = i6;
                    i = i5;
                    j = C21977y.m41212k(hashMap, fVar2.f176184c, fVar2.f176183b, axVar, axVar2, axVar3);
                } else {
                    i2 = i6;
                    i = i5;
                    j = C21977y.m41211j(hashMap, fVar2.f176184c, axVar, axVar2, axVar3);
                }
                j3 += j;
                i6 = i2 + 1;
                i5 = i;
            }
            j2 = j3 + C21977y.m41213l(hashMap, e2.mo55394f(), axVar, axVar2, axVar3);
        } else if (i3 == 2) {
            C65018ac acVar = (C65018ac) adVar.f176075b;
            C62964ck<Long> ckVar = acVar.f176070a;
            C62971cq<String> cqVar2 = acVar.f176071b;
            if (ckVar.isEmpty() && cqVar2.isEmpty()) {
                for (String j4 : hashMap.keySet()) {
                    j2 += C21977y.m41211j(hashMap, j4, axVar, axVar2, axVar3);
                }
            } else if (ckVar.isEmpty()) {
                for (String j5 : cqVar2) {
                    j2 += C21977y.m41211j(hashMap, j5, axVar, axVar2, axVar3);
                }
            } else if (cqVar2.isEmpty()) {
                j2 = C21977y.m41213l(hashMap, ckVar, axVar, axVar2, axVar3);
            } else if (!cqVar2.isEmpty() && !ckVar.isEmpty()) {
                for (String str : cqVar2) {
                    long j6 = j2;
                    for (Long longValue : ckVar) {
                        j6 += C21977y.m41212k(hashMap, str, longValue.longValue(), axVar, axVar2, axVar3);
                    }
                    j2 = j6;
                }
            }
        }
        return C60922j.m93044g(C60838bs.m92859i(C21977y.m41214m(abVar, hashMap, Long.valueOf(j2))), C47810es.m84963c(C21972t.f60603a), C60826bg.f164896a);
    }
}
