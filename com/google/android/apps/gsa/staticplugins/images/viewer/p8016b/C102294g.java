package com.google.android.apps.gsa.staticplugins.images.viewer.p8016b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.b.g */
/* compiled from: PG */
public final class C102294g implements C23113i {

    /* renamed from: a */
    private final C102292e f285410a;

    public C102294g(C102292e eVar) {
        this.f285410a = eVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("ImageViewerEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onIndexChanged_int")) {
                this.f285410a.mo93055h(Integer.valueOf(pVar.f63472a.getInt("newIndex")).intValue());
            }
        }
    }
}
