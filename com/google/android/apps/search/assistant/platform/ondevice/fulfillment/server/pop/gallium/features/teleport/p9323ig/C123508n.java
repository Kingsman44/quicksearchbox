package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import android.net.Uri;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.n */
/* compiled from: PG */
public final /* synthetic */ class C123508n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C123510p f341305a;

    /* renamed from: b */
    public final /* synthetic */ Uri f341306b;

    public /* synthetic */ C123508n(C123510p pVar, Uri uri) {
        this.f341305a = pVar;
        this.f341306b = uri;
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
        C123510p pVar = this.f341305a;
        Uri uri = this.f341306b;
        C123294ab abVar = pVar.f341314c;
        String host = ((Uri) obj).getHost();
        String host2 = uri.getHost();
        if (host == null || host2 == null) {
            return false;
        }
        if (host.equals(host2)) {
            return true;
        }
        C123331bl blVar = ((C123299ag) abVar).f341038c;
        return blVar.mo105989a(host).equals(blVar.mo105989a(host2));
    }
}
