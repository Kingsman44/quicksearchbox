package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.common.p4522b.C58495hd;
import com.google.p440an.p441a.C8841h;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.co */
/* compiled from: PG */
public final /* synthetic */ class C113184co implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C113185cp f313505a;

    /* renamed from: b */
    public final /* synthetic */ C8841h f313506b;

    /* renamed from: c */
    public final /* synthetic */ C48580an f313507c;

    public /* synthetic */ C113184co(C113185cp cpVar, C8841h hVar, C48580an anVar) {
        this.f313505a = cpVar;
        this.f313506b = hVar;
        this.f313507c = anVar;
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
        C113185cp cpVar = this.f313505a;
        C8841h hVar = this.f313506b;
        C48580an anVar = this.f313507c;
        String str = (String) obj;
        if (C113185cp.m187205d(str, hVar, (C58495hd) cpVar.f313509a.get())) {
            return false;
        }
        C48580an anVar2 = C48580an.UNKNOWN;
        int ordinal = anVar.ordinal();
        return !(ordinal == 21 || ordinal == 23 || ordinal == 37) || !C113185cp.m187205d(str, hVar, (C58495hd) cpVar.f313510b.get());
    }
}
