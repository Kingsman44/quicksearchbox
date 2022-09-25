package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.graphics.drawable.GradientDrawable;
import androidx.p176n.p177a.C3796g;
import androidx.p176n.p177a.C3798i;
import androidx.p176n.p177a.C3799j;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ba */
/* compiled from: PG */
public final /* synthetic */ class C114644ba implements C3796g {

    /* renamed from: a */
    public final /* synthetic */ ZeroStateMediaController f318063a;

    public /* synthetic */ C114644ba(ZeroStateMediaController zeroStateMediaController) {
        this.f318063a = zeroStateMediaController;
    }

    /* renamed from: a */
    public final void mo8025a(C3798i iVar) {
        ZeroStateMediaController zeroStateMediaController = this.f318063a;
        if (iVar != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) zeroStateMediaController.f317933b.getResources().getDrawable(R.drawable.dm_media_card_background);
            gradientDrawable.setColor(iVar.mo8030a(C3799j.f12254b, zeroStateMediaController.f317933b.getResources().getColor(R.color.quantum_grey900)));
            zeroStateMediaController.f317934c.setBackground(gradientDrawable);
        }
    }
}
