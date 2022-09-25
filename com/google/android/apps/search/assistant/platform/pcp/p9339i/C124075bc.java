package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123781j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.Set;
import java.util.concurrent.Callable;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bc */
/* compiled from: PG */
public final /* synthetic */ class C124075bc implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C124081bi f342695a;

    /* renamed from: b */
    public final /* synthetic */ Set f342696b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f342697c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f342698d;

    /* renamed from: e */
    public final /* synthetic */ Optional f342699e;

    /* renamed from: f */
    public final /* synthetic */ C58526ih f342700f;

    public /* synthetic */ C124075bc(C124081bi biVar, Set set, C58485gu guVar, C60870cx cxVar, Optional optional, C58526ih ihVar) {
        this.f342695a = biVar;
        this.f342696b = set;
        this.f342697c = guVar;
        this.f342698d = cxVar;
        this.f342699e = optional;
        this.f342700f = ihVar;
    }

    public final Object call() {
        C124081bi biVar = this.f342695a;
        Set set = this.f342696b;
        C58485gu guVar = this.f342697c;
        C60870cx cxVar = this.f342698d;
        Optional optional = this.f342699e;
        C58526ih ihVar = this.f342700f;
        set.addAll(guVar);
        Instant a = biVar.f342716h.mo57444a();
        for (C123781j jVar : (Set) C60856cj.m92909r(cxVar)) {
            C123744bk bkVar = jVar.f341942b;
            if (bkVar == null) {
                bkVar = C123744bk.f341804l;
            }
            int intValue = C124089bo.m203513a(Integer.valueOf(bkVar.f341810e)).intValue();
            long longValue = ((Long) optional.map(new C124070ay(biVar, intValue)).orElseGet(new C124071az(biVar, intValue))).longValue();
            if (longValue != -1) {
                C63042fg fgVar = jVar.f341944d;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                if (!C62950b.m95474e(fgVar).isAfter(a.minus(Duration.ofMinutes(longValue)))) {
                }
            }
            set.remove(Integer.valueOf(intValue));
            C123744bk bkVar2 = jVar.f341942b;
            if (bkVar2 == null) {
                bkVar2 = C123744bk.f341804l;
            }
            if (!bkVar2.f341812g.equals("no_data_from_source")) {
                ihVar.mo55373c(jVar);
            }
        }
        return new C124101c(ihVar.mo55486f(), C58528ij.m90006F(set));
    }
}
