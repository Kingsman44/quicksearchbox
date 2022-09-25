package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58838bb;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.k */
/* compiled from: PG */
public final /* synthetic */ class C131911k implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131921u f360186a;

    public /* synthetic */ C131911k(C131921u uVar) {
        this.f360186a = uVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        C131921u uVar = this.f360186a;
        ParcelableGeofence parcelableGeofence = (ParcelableGeofence) obj;
        C46325t tVar = uVar.f360207c;
        String str2 = parcelableGeofence.f391867a;
        int indexOf = str2.indexOf("#routines#");
        int indexOf2 = str2.indexOf("#routines_standalone#");
        boolean z = true;
        boolean z2 = indexOf > 0 && indexOf + 10 < str2.length();
        if (z2 == (indexOf2 > 0 && indexOf2 + 21 < str2.length())) {
            z = false;
        }
        C58838bb.m90880o(z, "The Geofence ID '%s' does not contain either the '%s' (for prod use) or the '%s' (for standalone app) delimiter at a valid index", str2, "#routines#", "#routines_standalone#");
        if (z2) {
            str = str2.substring(0, indexOf);
        } else {
            str = str2.substring(0, indexOf2);
        }
        return C47633f.m84733g(C47633f.m84733g(tVar.mo50283c("google", str)).mo51516i(new C131901a(uVar), uVar.f360209e)).mo51516i(new C131912l(uVar, parcelableGeofence), uVar.f360209e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
