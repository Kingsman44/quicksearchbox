package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bu */
/* compiled from: PG */
final class C114824bu extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ View f318595a;

    /* renamed from: b */
    final /* synthetic */ C114839ci f318596b;

    public C114824bu(C114839ci ciVar, View view) {
        this.f318596b = ciVar;
        this.f318595a = view;
    }

    public final void getOutline(View view, Outline outline) {
        Drawable background = this.f318595a.getBackground();
        if (background == null) {
            C59104x d = C114839ci.f318614a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSAnimationUtils");
            ((C59052c) ((C59052c) d).mo56372aa(29575)).mo56386p("#setUpCardShadowV2(): card view background is null.");
            return;
        }
        outline.setRoundRect(background.copyBounds(), (float) this.f318596b.f318615b.getResources().getDimensionPixelSize(R.dimen.zero_state_card_corner_radius));
    }
}
