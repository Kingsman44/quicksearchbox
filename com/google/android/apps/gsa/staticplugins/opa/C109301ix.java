package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89128d;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ix */
/* compiled from: PG */
public final /* synthetic */ class C109301ix implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C109316jg f304482a;

    public /* synthetic */ C109301ix(C109316jg jgVar) {
        this.f304482a = jgVar;
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
        C109316jg jgVar = this.f304482a;
        C89128d dVar = (C89128d) obj;
        if (dVar.mo83101b().f136458l) {
            return true;
        }
        return jgVar.f304500a.add(C80884a.m128737b(dVar.mo83101b().f136451e, Locale.ROOT));
    }
}
