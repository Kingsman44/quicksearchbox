package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a;

import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.a.a */
/* compiled from: PG */
public final class C106847a implements Predicate {

    /* renamed from: a */
    final /* synthetic */ C106856b f297723a;

    public C106847a(C106856b bVar) {
        this.f297723a = bVar;
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
        String h = ((C130701b) obj).mo109797h();
        try {
            this.f297723a.f297738a.getPackageManager().getPackageInfo(h, 0);
            if (this.f297723a.f297738a.getPackageManager().getLaunchIntentForPackage(h) != null) {
                return true;
            }
            this.f297723a.mo95688a("App is not launchable: %s", h);
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f297723a.mo95688a("App is not installed: %s", h);
            return false;
        }
    }
}
