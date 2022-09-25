package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.speech.tts.Voice;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.n */
/* compiled from: PG */
public final /* synthetic */ class C95199n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f266341a;

    public /* synthetic */ C95199n(String str) {
        this.f266341a = str;
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
        String str = this.f266341a;
        Voice voice = (Voice) obj;
        C59071e eVar = C95210y.f266359j;
        return voice != null && !voice.isNetworkConnectionRequired() && C58890d.m90988c(voice.getName()).contains(C58890d.m90988c(str));
    }
}
