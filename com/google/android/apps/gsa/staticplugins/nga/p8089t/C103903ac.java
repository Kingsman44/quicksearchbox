package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80608c;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80609d;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80610e;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80617l;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80624s;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ac */
/* compiled from: PG */
public final /* synthetic */ class C103903ac implements Function {

    /* renamed from: a */
    public final /* synthetic */ C103908ah f289218a;

    /* renamed from: b */
    public final /* synthetic */ boolean f289219b;

    public /* synthetic */ C103903ac(C103908ah ahVar, boolean z) {
        this.f289218a = ahVar;
        this.f289219b = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C103908ah ahVar = this.f289218a;
        boolean z = this.f289219b;
        String str = (String) obj;
        C80617l lVar = ahVar.f289224a;
        if (z) {
            return (C80627v) ((Optional) Optional.ofNullable((C80627v) lVar.f221295b.get(str)).map(C80609d.f221285a).orElseGet(new C80610e(str))).orElse(C80627v.UNRECOGNIZED);
        }
        return (C80627v) C80624s.m128250c(str).map(C80608c.f221284a).orElse(C80627v.UNRECOGNIZED);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
