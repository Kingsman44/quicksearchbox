package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.d */
/* compiled from: PG */
public abstract class C105761d extends C8849b implements C105767e {
    public C105761d() {
        super("com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.IMinimizeUiUpdatesObserver");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo94962a();
        } else if (i != 2) {
            return false;
        } else {
            mo94963b();
        }
        return true;
    }
}
