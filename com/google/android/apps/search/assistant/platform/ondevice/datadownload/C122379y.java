package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.y */
/* compiled from: PG */
public final /* synthetic */ class C122379y implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C122379y f339291a = new C122379y();

    private /* synthetic */ C122379y() {
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
        return ((Optional) obj).isPresent();
    }
}
