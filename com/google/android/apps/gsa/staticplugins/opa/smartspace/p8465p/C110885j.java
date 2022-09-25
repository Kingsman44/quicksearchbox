package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83768k;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83769l;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83771n;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.j */
/* compiled from: PG */
final class C110885j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ List f308901a;

    /* renamed from: b */
    final /* synthetic */ List f308902b;

    /* renamed from: c */
    final /* synthetic */ Instant f308903c;

    /* renamed from: d */
    final /* synthetic */ C110886k f308904d;

    public C110885j(C110886k kVar, List list, List list2, Instant instant) {
        this.f308904d = kVar;
        this.f308901a = list;
        this.f308902b = list2;
        this.f308903c = instant;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f308902b.addAll(this.f308901a);
        ((C58970a) ((C58970a) this.f308904d.f308909e.mo56226d()).mo56372aa(26816)).mo56386p("Failed to get current displayed flight status, and skipped quality logging.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Map map = (Map) Collection.EL.stream(((C83771n) obj).f228326a).collect(Collectors.groupingBy(C110884i.f308900a));
        for (C83769l lVar : this.f308901a) {
            long j = lVar.f228320b;
            boolean z = lVar.f228322d;
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                List list = (List) map.get(valueOf);
                list.getClass();
                C83769l lVar2 = (C83769l) list.get(0);
                List list2 = this.f308902b;
                C83768k kVar = (C83768k) lVar.toBuilder();
                long j2 = lVar2.f228321c;
                kVar.copyOnWrite();
                C83769l lVar3 = (C83769l) kVar.instance;
                lVar3.f228319a |= 2;
                lVar3.f228321c = j2;
                list2.add((C83769l) kVar.build());
                if (z && !lVar2.f228322d) {
                    this.f308904d.f308908d.mo109924av(Duration.between(Instant.ofEpochMilli(lVar2.f228321c), this.f308903c));
                    this.f308904d.f308908d.mo109867C("GET_BOARDING_PASS_FROM_LATER_UPDATES");
                }
            } else {
                this.f308902b.add(lVar);
                this.f308904d.f308908d.mo109867C(true != z ? "NO_BOARDING_PASS_IN_ORIGINAL_UPDATE" : "HAS_BOARDING_PASS_IN_ORIGINAL_UPDATE");
                if (z) {
                    this.f308904d.f308908d.mo109924av(Duration.ZERO);
                }
                if ((lVar.f228319a & 8) != 0) {
                    this.f308904d.f308908d.mo109925aw(Duration.between(this.f308903c, Instant.ofEpochMilli(lVar.f228323e)));
                }
            }
        }
    }
}
