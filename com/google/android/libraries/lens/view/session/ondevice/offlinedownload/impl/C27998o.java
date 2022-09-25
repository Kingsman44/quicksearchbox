package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.common.p4526f.p4527a.C58974d;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.o */
/* compiled from: PG */
public final /* synthetic */ class C27998o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C27998o f76200a = new C27998o();

    private /* synthetic */ C27998o() {
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
        C58974d dVar = OfflineDownloadManagerImpl.f76145a;
        return ((Map.Entry) obj).getValue() == C28005v.DOWNLOAD_TYPE_BACKGROUND;
    }
}
