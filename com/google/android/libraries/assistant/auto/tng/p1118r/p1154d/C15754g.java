package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1161e.C15737d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.g */
/* compiled from: PG */
public final /* synthetic */ class C15754g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C15755h f46948a;

    /* renamed from: b */
    public final /* synthetic */ String f46949b;

    /* renamed from: c */
    public final /* synthetic */ int f46950c;

    public /* synthetic */ C15754g(C15755h hVar, String str, int i) {
        this.f46948a = hVar;
        this.f46949b = str;
        this.f46950c = i;
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
        return this.f46948a.mo22530a((C15737d) obj, this.f46949b, this.f46950c);
    }
}
