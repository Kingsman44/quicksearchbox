package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.be */
/* compiled from: PG */
public final /* synthetic */ class C79195be implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f217661a;

    public /* synthetic */ C79195be(String str) {
        this.f217661a = str;
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
        C80053ag agVar;
        String str = this.f217661a;
        C80047aa aaVar = (C80047aa) obj;
        int i = C79204bn.f217670a;
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        if (!a.equals(C80080z.WEBREF)) {
            return false;
        }
        if (aaVar.f219657a == 10) {
            agVar = (C80053ag) aaVar.f219658b;
        } else {
            agVar = C80053ag.f219675f;
        }
        return agVar.f219679c.contains(str);
    }
}
