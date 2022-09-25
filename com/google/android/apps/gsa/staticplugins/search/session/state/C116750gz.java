package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gz */
/* compiled from: PG */
public final /* synthetic */ class C116750gz implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f323845a;

    /* renamed from: b */
    public final /* synthetic */ int f323846b;

    public /* synthetic */ C116750gz(int i, int i2) {
        this.f323845a = i;
        this.f323846b = i2;
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
        int i = this.f323845a;
        int i2 = this.f323846b;
        Integer num = (Integer) obj;
        C59071e eVar = C116755hd.f323854a;
        return (i & num.intValue()) != (num.intValue() & i2);
    }
}
