package com.google.android.libraries.appactions.p11035a;

import com.google.android.libraries.appactions.p11035a.p11036a.C147819d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.appactions.a.a */
/* compiled from: PG */
public final /* synthetic */ class C147815a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f398795a;

    /* renamed from: b */
    public final /* synthetic */ String f398796b;

    public /* synthetic */ C147815a(String str, String str2) {
        this.f398795a = str;
        this.f398796b = str2;
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
        C147819d dVar = (C147819d) obj;
        return dVar.mo124487b().equals(this.f398795a) && dVar.mo124486a().equals(this.f398796b);
    }
}
