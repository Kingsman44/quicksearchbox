package com.google.android.apps.gsa.staticplugins.p7796dh.p7798b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.dh.b.c */
/* compiled from: PG */
public final class C99537c implements C23113i {

    /* renamed from: a */
    private final C99535a f278508a;

    public C99537c(C99535a aVar) {
        this.f278508a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SearchPlateTooltipEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onDismiss")) {
                this.f278508a.mo91486e();
            }
        }
    }
}
