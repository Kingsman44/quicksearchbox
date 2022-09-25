package com.google.android.apps.gsa.staticplugins.p7391an.p7395d;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.d.f */
/* compiled from: PG */
public final class C93975f implements C23113i {

    /* renamed from: a */
    private final C93973d f262445a;

    public C93975f(C93973d dVar) {
        this.f262445a = dVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SrpDoodleHeaderEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onDoodleClicked")) {
                this.f262445a.mo88254e();
            } else if (str.equals("onLogoClicked")) {
                this.f262445a.mo88255f();
            }
        }
    }
}
