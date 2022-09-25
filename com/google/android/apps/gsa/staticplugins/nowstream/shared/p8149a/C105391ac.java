package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.a.ac */
/* compiled from: PG */
public final class C105391ac implements C23113i {

    /* renamed from: a */
    private final C105389aa f294018a;

    public C105391ac(C105389aa aaVar) {
        this.f294018a = aaVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SnackbarEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onActionClicked")) {
                this.f294018a.mo94701e();
            }
        }
    }
}
