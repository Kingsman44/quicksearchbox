package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.graphics.drawable.Drawable;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.go */
/* compiled from: PG */
public final class C108380go implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ OpaToggleCard f301444a;

    public C108380go(OpaToggleCard opaToggleCard) {
        this.f301444a = opaToggleCard;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        OpaToggleCard opaToggleCard = this.f301444a;
        opaToggleCard.f300935d.setImageDrawable(opaToggleCard.getContext().getDrawable(R.drawable.opa_assistant_logo));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f301444a.f300935d.setImageDrawable((Drawable) obj);
    }
}
