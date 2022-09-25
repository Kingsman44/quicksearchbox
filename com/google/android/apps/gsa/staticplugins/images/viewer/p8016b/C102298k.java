package com.google.android.apps.gsa.staticplugins.images.viewer.p8016b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102265d;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102286y;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.b.k */
/* compiled from: PG */
public final class C102298k implements C23113i {

    /* renamed from: a */
    private final C102296i f285412a;

    public C102298k(C102296i iVar) {
        this.f285412a = iVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SuperViewerEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("viewerShown")) {
                ((C102265d) ((C102286y) this.f285412a).f285397a).f285341c.mo28730f(true, false);
            }
        }
    }
}
