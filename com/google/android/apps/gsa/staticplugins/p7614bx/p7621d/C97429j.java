package com.google.android.apps.gsa.staticplugins.p7614bx.p7621d;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.d.j */
/* compiled from: PG */
public final class C97429j implements C23113i {

    /* renamed from: a */
    private final C97427h f272076a;

    public C97429j(C97427h hVar) {
        this.f272076a = hVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("MenuPromotionsEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onAcceptClick")) {
                this.f272076a.mo90711e();
            } else if (str.equals("onPromotionImpression")) {
                this.f272076a.mo90712f();
            } else if (str.equals("onRejectClick")) {
                this.f272076a.mo90713h();
            }
        }
    }
}
