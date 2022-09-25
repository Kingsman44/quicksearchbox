package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.d.a.j;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.ae */
/* compiled from: PG */
public final /* synthetic */ class C79014ae implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79014ae f217303a = new C79014ae();

    private /* synthetic */ C79014ae() {
    }

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

    public final boolean test(Object obj) {
        C80047aa aaVar;
        j jVar = (j) obj;
        if (jVar.a == 1) {
            C80080z zVar = C80080z.UNKNOWN;
            if (jVar.a == 1) {
                aaVar = (C80047aa) jVar.b;
            } else {
                aaVar = C80047aa.f219655i;
            }
            C80080z a = C80080z.m128077a(aaVar.f219659c);
            if (a == null) {
                a = C80080z.UNRECOGNIZED;
            }
            int ordinal = a.ordinal();
            if (ordinal != 2 && ordinal != 3 && ordinal != 5 && ordinal != 14 && ordinal != 8 && ordinal != 9) {
                return false;
            }
            if ((jVar.a == 1 ? (C80047aa) jVar.b : C80047aa.f219655i).f219663g > 0.2d) {
                return true;
            }
        }
        return false;
    }
}
