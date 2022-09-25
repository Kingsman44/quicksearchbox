package com.google.android.material.checkbox;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C1929b;
import androidx.p198v.p199a.p200a.C4244c;

/* renamed from: com.google.android.material.checkbox.a */
/* compiled from: PG */
final class C44587a extends C4244c {

    /* renamed from: b */
    final /* synthetic */ MaterialCheckBox f116087b;

    public C44587a(MaterialCheckBox materialCheckBox) {
        this.f116087b = materialCheckBox;
    }

    /* renamed from: b */
    public final void mo8946b(Drawable drawable) {
        ColorStateList colorStateList = this.f116087b.f116067a;
        if (colorStateList != null) {
            C1929b.m5226g(drawable, colorStateList);
        }
    }

    /* renamed from: c */
    public final void mo8947c(Drawable drawable) {
        MaterialCheckBox materialCheckBox = this.f116087b;
        ColorStateList colorStateList = materialCheckBox.f116067a;
        if (colorStateList != null) {
            C1929b.m5225f(drawable, colorStateList.getColorForState(materialCheckBox.f116069c, colorStateList.getDefaultColor()));
        }
    }
}
