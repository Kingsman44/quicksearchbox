package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.t */
/* compiled from: PG */
public final /* synthetic */ class C77601t implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C77603v f213802a;

    /* renamed from: b */
    public final /* synthetic */ ac f213803b;

    public /* synthetic */ C77601t(C77603v vVar, ac acVar) {
        this.f213802a = vVar;
        this.f213803b = acVar;
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
        C77603v vVar = this.f213802a;
        boolean equals = ((C77557aj) obj).mo72638a().b().equals(this.f213803b);
        if (vVar.f213805a.mo74383i(vVar.f213806b.mo71417a().mo71465k())) {
            return false;
        }
        return equals;
    }
}
