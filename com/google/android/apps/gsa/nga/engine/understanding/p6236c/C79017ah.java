package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.d.a.j;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import java.util.EnumMap;
import p3186j$.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.ah */
/* compiled from: PG */
final class C79017ah implements Predicate {

    /* renamed from: a */
    final EnumMap f217306a = new EnumMap(C80080z.class);

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        C80047aa aaVar;
        j jVar = (j) obj;
        if (jVar.a == 1) {
            aaVar = (C80047aa) jVar.b;
        } else {
            aaVar = C80047aa.f219655i;
        }
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        if (((Integer) Map.EL.compute(this.f217306a, a, C79016ag.f217305a)).intValue() <= 1) {
            return true;
        }
        return false;
    }
}
