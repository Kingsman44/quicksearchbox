package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80512a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.as */
/* compiled from: PG */
public final class C83065as implements Function {

    /* renamed from: a */
    private final C83103v f226675a;

    /* renamed from: b */
    private final C83059am f226676b;

    public C83065as(C83103v vVar, C83059am amVar) {
        this.f226675a = vVar;
        this.f226676b = amVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C80513b bVar = (C80513b) obj;
        C80512a aVar = (C80512a) C80513b.f221014e.createBuilder();
        float f = bVar.f221018c;
        aVar.copyOnWrite();
        ((C80513b) aVar.instance).f221018c = f;
        C80515d a = C80515d.m128185a(bVar.f221019d);
        if (a == null) {
            a = C80515d.UNRECOGNIZED;
        }
        aVar.copyOnWrite();
        ((C80513b) aVar.instance).f221019d = a.getNumber();
        boolean z = true;
        boolean z2 = bVar.f221016a != null;
        Objects.requireNonNull(bVar);
        C83061ao aoVar = new C83061ao(bVar);
        Objects.requireNonNull(aVar);
        C83080bg.m132479c(z2, aoVar, new C83062ap(aVar), this.f226675a);
        if (bVar.f221017b == null) {
            z = false;
        }
        Objects.requireNonNull(bVar);
        C83063aq aqVar = new C83063aq(bVar);
        Objects.requireNonNull(aVar);
        C83080bg.m132479c(z, aqVar, new C83064ar(aVar), this.f226676b);
        return (C80513b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
