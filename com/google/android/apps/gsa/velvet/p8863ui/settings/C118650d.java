package com.google.android.apps.gsa.velvet.p8863ui.settings;

import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118640c;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.d */
/* compiled from: PG */
public final /* synthetic */ class C118650d implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ List f331005a;

    /* renamed from: b */
    public final /* synthetic */ String f331006b;

    public /* synthetic */ C118650d(List list, String str) {
        this.f331005a = list;
        this.f331006b = str;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        return IntPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ IntPredicate mo19598or(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$or(this, intPredicate);
    }

    public final boolean test(int i) {
        List list = this.f331005a;
        String str = this.f331006b;
        C59071e eVar = SettingsActivity.f330929a;
        return ((C118640c) list.get(i)).f330979b.equals(str);
    }
}
