package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.e */
/* compiled from: PG */
final class C33264e extends Drawable.ConstantState {

    /* renamed from: a */
    private final Drawable.ConstantState f88983a;

    public C33264e(Drawable.ConstantState constantState) {
        this.f88983a = constantState;
    }

    public final int getChangingConfigurations() {
        return this.f88983a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        return newDrawable((Resources) null, (Resources.Theme) null);
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        return new RoundCornerDynamicIconProgressDrawable(((DrawableWrapper) this.f88983a.newDrawable(resources, theme)).getDrawable());
    }
}
