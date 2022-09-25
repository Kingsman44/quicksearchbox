package com.google.android.libraries.p11016ak.p11019c.p11021b;

import android.speech.tts.Voice;
import p3186j$.util.function.Predicate;
import p5285d.p5290b.p5291a.p5292a.C68183bs;
import p5285d.p5290b.p5291a.p5292a.C68185bu;
import p5285d.p5290b.p5291a.p5292a.C68187bw;

/* renamed from: com.google.android.libraries.ak.c.b.p */
/* compiled from: PG */
public final /* synthetic */ class C147668p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C68183bs f398528a;

    public /* synthetic */ C147668p(C68183bs bsVar) {
        this.f398528a = bsVar;
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
        C68183bs bsVar = this.f398528a;
        Voice voice = (Voice) obj;
        String name = voice.getName();
        C68185bu buVar = bsVar.f184496b;
        if (buVar == null) {
            buVar = C68185bu.f184497d;
        }
        if (!name.equals(buVar.f184499a)) {
            return false;
        }
        String language = voice.getLocale().getLanguage();
        C68187bw bwVar = bsVar.f184495a;
        if (bwVar == null) {
            bwVar = C68187bw.f184502b;
        }
        return language.equals(bwVar.f184504a);
    }
}
