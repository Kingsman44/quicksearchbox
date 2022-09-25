package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.google.common.p4522b.C58487gw;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.t.h.bp */
/* compiled from: PG */
public final /* synthetic */ class C118423bp implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f328675a;

    public /* synthetic */ C118423bp(Set set) {
        this.f328675a = set;
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
        C58487gw gwVar = C118426bs.f328679a;
        return !this.f328675a.contains((ComponentName) obj);
    }
}
