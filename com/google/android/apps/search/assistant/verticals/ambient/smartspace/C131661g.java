package com.google.android.apps.search.assistant.verticals.ambient.smartspace;

import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.g */
/* compiled from: PG */
public final /* synthetic */ class C131661g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131673i f359742a;

    public /* synthetic */ C131661g(C131673i iVar) {
        this.f359742a = iVar;
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
        C131673i iVar = this.f359742a;
        C50794cr a = C50794cr.m85938a(((C50818do) obj).f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return Collection.EL.stream(iVar.f359771a.f256571a).noneMatch(new C131667h(a));
    }
}
