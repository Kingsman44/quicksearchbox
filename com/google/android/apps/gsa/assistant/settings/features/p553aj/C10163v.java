package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58831av;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.v */
/* compiled from: PG */
public final /* synthetic */ class C10163v implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10166y f34549a;

    public /* synthetic */ C10163v(C10166y yVar) {
        this.f34549a = yVar;
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
        return this.f34549a.f34555c.j((String) C58831av.m90830c((String) ((Pair) obj).first, BuildConfig.FLAVOR));
    }
}
