package com.google.android.libraries.lens.view.session;

import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.ap */
/* compiled from: PG */
public final /* synthetic */ class C27753ap implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C56241av f75755a;

    /* renamed from: b */
    public final /* synthetic */ C25333i f75756b;

    public /* synthetic */ C27753ap(C56241av avVar, C25333i iVar) {
        this.f75755a = avVar;
        this.f75756b = iVar;
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
        C56241av avVar = this.f75755a;
        C25333i iVar = this.f75756b;
        C56224ae aeVar = (C56224ae) obj;
        int i = C27761ax.f75765b;
        C56224ae aeVar2 = avVar.f149797e;
        if (aeVar2 == null) {
            aeVar2 = C56224ae.f149753h;
        }
        return C28185a.m52694l(aeVar2, aeVar, iVar);
    }
}
