package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80148bz;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80152ca;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.libraries.onegoogle.owners.C30976k;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.o */
/* compiled from: PG */
public final /* synthetic */ class C103733o implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C103733o f288888a = new C103733o();

    private /* synthetic */ C103733o() {
    }

    public final Object apply(Object obj) {
        C30976k kVar = (C30976k) obj;
        C80148bz bzVar = (C80148bz) C80152ca.f219945e.createBuilder();
        if (kVar != null) {
            String g = C58837ba.m90858g(kVar.mo36653d());
            bzVar.copyOnWrite();
            C80152ca caVar = (C80152ca) bzVar.instance;
            caVar.f219947a |= 2;
            caVar.f219949c = g;
            String a = kVar.mo36650a();
            bzVar.copyOnWrite();
            C80152ca caVar2 = (C80152ca) bzVar.instance;
            caVar2.f219947a |= 4;
            caVar2.f219950d = C58837ba.m90858g(a);
            if (!C58837ba.m90859h(kVar.mo36651b())) {
                String b = kVar.mo36651b();
                bzVar.copyOnWrite();
                C80152ca caVar3 = (C80152ca) bzVar.instance;
                b.getClass();
                caVar3.f219947a |= 1;
                caVar3.f219948b = b;
            } else if (!C58837ba.m90859h(kVar.mo36652c())) {
                String c = kVar.mo36652c();
                bzVar.copyOnWrite();
                C80152ca caVar4 = (C80152ca) bzVar.instance;
                c.getClass();
                caVar4.f219947a |= 1;
                caVar4.f219948b = c;
            }
        }
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        C80152ca caVar5 = (C80152ca) bzVar.build();
        caVar5.getClass();
        ddVar.f220291b = caVar5;
        ddVar.f220290a = 17;
        return (C80275dd) buVar.build();
    }
}
