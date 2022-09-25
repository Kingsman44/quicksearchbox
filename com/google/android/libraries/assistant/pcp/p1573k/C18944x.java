package com.google.android.libraries.assistant.pcp.p1573k;

import android.support.p031v4.media.MediaBrowserCompat;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.x */
/* compiled from: PG */
public final /* synthetic */ class C18944x implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18944x f53248a = new C18944x();

    private /* synthetic */ C18944x() {
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
        return ((MediaBrowserCompat.MediaItem) obj) != null;
    }
}
