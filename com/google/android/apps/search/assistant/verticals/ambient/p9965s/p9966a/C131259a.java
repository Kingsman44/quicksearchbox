package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9966a;

import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.a.a */
/* compiled from: PG */
public final /* synthetic */ class C131259a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131264f f358908a;

    public /* synthetic */ C131259a(C131264f fVar) {
        this.f358908a = fVar;
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
        C131264f fVar = this.f358908a;
        String h = ((C130701b) obj).mo109797h();
        try {
            fVar.f358913a.getPackageManager().getPackageInfo(h, 0);
            if (fVar.f358913a.getPackageManager().getLaunchIntentForPackage(h) == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
