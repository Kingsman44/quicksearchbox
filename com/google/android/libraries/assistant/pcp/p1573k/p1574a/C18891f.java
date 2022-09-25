package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import com.google.protos.p5124m.p5125a.C65603f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.f */
/* compiled from: PG */
public final /* synthetic */ class C18891f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C18893h f53170a;

    public /* synthetic */ C18891f(C18893h hVar) {
        this.f53170a = hVar;
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
        return ((C65603f) this.f53170a.f53173a.mo17428b()).f178307a.contains(((ComponentName) obj).getPackageName());
    }
}
