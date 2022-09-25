package com.google.android.material.chip;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.google.android.material.chip.c */
/* compiled from: PG */
final class C44593c extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ Chip f116120a;

    public C44593c(Chip chip) {
        this.f116120a = chip;
    }

    public final void getOutline(View view, Outline outline) {
        C44596f fVar = this.f116120a.f116093d;
        if (fVar != null) {
            fVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
