package com.google.android.apps.gsa.staticplugins.images.viewer.p8016b;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.b.f */
/* compiled from: PG */
public final class C102293f implements C102292e {

    /* renamed from: a */
    private final C23112h f285409a;

    public C102293f(C23112h hVar) {
        this.f285409a = hVar;
    }

    /* renamed from: h */
    public final void mo93055h(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("newIndex", Integer.valueOf(i).intValue());
        this.f285409a.mo28345s("onIndexChanged_int", "ImageViewerEventsDispatcher", bundle);
    }
}
