package com.google.android.libraries.appactions.p11035a;

import com.google.android.libraries.appactions.p11035a.p11036a.C147817b;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.appactions.a.d */
/* compiled from: PG */
public final /* synthetic */ class C147836d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C147839g f398850a;

    /* renamed from: b */
    public final /* synthetic */ String f398851b;

    /* renamed from: c */
    public final /* synthetic */ String f398852c;

    /* renamed from: d */
    public final /* synthetic */ String f398853d;

    public /* synthetic */ C147836d(C147839g gVar, String str, String str2, String str3) {
        this.f398850a = gVar;
        this.f398851b = str;
        this.f398852c = str2;
        this.f398853d = str3;
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
        C147839g gVar = this.f398850a;
        return Collection.EL.stream(gVar.f398859b.mo124502a(this.f398851b, ((C147817b) obj).mo124481d())).anyMatch(new C147815a(this.f398852c, this.f398853d));
    }
}
