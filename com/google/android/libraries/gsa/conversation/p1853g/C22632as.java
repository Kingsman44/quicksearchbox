package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.android.libraries.gsa.conversation.p1855h.C22714r;
import com.google.android.libraries.gsa.conversation.p1855h.C22715s;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.gsa.conversation.g.as */
/* compiled from: PG */
public final /* synthetic */ class C22632as implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C22654bn f62342a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f62343b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f62344c;

    /* renamed from: d */
    public final /* synthetic */ long f62345d;

    /* renamed from: e */
    public final /* synthetic */ C22618ae f62346e;

    public /* synthetic */ C22632as(C22654bn bnVar, C60870cx cxVar, C58485gu guVar, long j, C22618ae aeVar) {
        this.f62342a = bnVar;
        this.f62343b = cxVar;
        this.f62344c = guVar;
        this.f62345d = j;
        this.f62346e = aeVar;
    }

    public final Object call() {
        C22654bn bnVar = this.f62342a;
        C60870cx cxVar = this.f62343b;
        C58485gu guVar = this.f62344c;
        long j = this.f62345d;
        C22618ae aeVar = this.f62346e;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        boolean z = true;
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C58833ax e2 = bnVar.mo27765e((C22666j) guVar.get(i), j);
            if (e2.mo56113h()) {
                C22715s sVar = (C22715s) e2.mo56107c();
                e.mo55395g(sVar);
                if (sVar.mo27848c() == C22714r.SUCCESS) {
                    C52236kg kgVar = sVar.mo27849d().f136654b;
                    if (kgVar == null) {
                        kgVar = C52236kg.f137089d;
                    }
                    C52235kf a = C52235kf.m86549a(kgVar.f137092b);
                    if (a == null) {
                        a = C52235kf.OK;
                    }
                    z2 |= a != C52235kf.IGNORE;
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            bnVar.mo27772n(aeVar, !bnVar.f62416n && z2, booleanValue);
        }
        return e.mo55394f();
    }
}
