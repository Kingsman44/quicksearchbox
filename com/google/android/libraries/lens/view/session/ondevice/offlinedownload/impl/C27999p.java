package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.view.utils.C28136y;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.p */
/* compiled from: PG */
public final /* synthetic */ class C27999p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C27999p f76201a = new C27999p();

    private /* synthetic */ C27999p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58974d dVar = OfflineDownloadManagerImpl.f76145a;
        return C28136y.m52430a((Locale) ((Map.Entry) obj).getKey());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
