package com.google.android.material.chip;

import android.graphics.Typeface;
import com.google.android.material.p3512i.C44699i;

/* renamed from: com.google.android.material.chip.b */
/* compiled from: PG */
final class C44592b extends C44699i {

    /* renamed from: a */
    final /* synthetic */ Chip f116119a;

    public C44592b(Chip chip) {
        this.f116119a = chip;
    }

    /* renamed from: a */
    public final void mo47737a(int i) {
    }

    /* renamed from: b */
    public final void mo47738b(Typeface typeface, boolean z) {
        Chip chip = this.f116119a;
        C44596f fVar = chip.f116093d;
        chip.setText(fVar.f116180z ? fVar.f116161g : chip.getText());
        this.f116119a.requestLayout();
        this.f116119a.invalidate();
    }
}
