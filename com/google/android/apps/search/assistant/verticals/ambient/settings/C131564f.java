package com.google.android.apps.search.assistant.verticals.ambient.settings;

import com.google.android.apps.gsa.assistant.settings.features.d.ak;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.f */
/* compiled from: PG */
public final /* synthetic */ class C131564f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131567i f359454a;

    /* renamed from: b */
    public final /* synthetic */ ak f359455b;

    public /* synthetic */ C131564f(C131567i iVar, ak akVar) {
        this.f359454a = iVar;
        this.f359455b = akVar;
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
        C131567i iVar = this.f359454a;
        ak akVar = this.f359455b;
        C50794cr a = C50794cr.m85938a(((C50818do) obj).f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return iVar.mo110191c(akVar, a);
    }
}
