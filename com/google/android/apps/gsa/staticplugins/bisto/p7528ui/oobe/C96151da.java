package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58817ah;
import dagger.C68214a;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.da */
/* compiled from: PG */
public final /* synthetic */ class C96151da implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96153dc f269168a;

    public /* synthetic */ C96151da(C96153dc dcVar) {
        this.f269168a = dcVar;
    }

    public final Object apply(Object obj) {
        C96153dc dcVar = this.f269168a;
        CancellationException cancellationException = (CancellationException) obj;
        if (!dcVar.f269174d) {
            dcVar.f269174d = true;
            if (dcVar.f269173c != null) {
                C68214a aVar = dcVar.f269172b;
                Drawable drawable = aVar != null ? (Drawable) aVar.mo27525b() : null;
                dcVar.f269173c.f228724c.mo77494d(5, false);
                LegacyOpaStandardPage legacyOpaStandardPage = dcVar.f269173c;
                legacyOpaStandardPage.f228724c.mo77491a(drawable, C84018m.m133906a(dcVar.f269171a, legacyOpaStandardPage));
            }
        }
        return C118826c.f331422a;
    }
}
