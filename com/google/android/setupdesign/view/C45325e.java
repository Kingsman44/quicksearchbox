package com.google.android.setupdesign.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: com.google.android.setupdesign.view.e */
/* compiled from: PG */
final class C45325e extends LayerDrawable {

    /* renamed from: a */
    public ColorStateList f118448a = null;

    public C45325e(Drawable drawable) {
        super(new Drawable[]{drawable});
    }

    /* renamed from: a */
    public static C45325e m80807a(Drawable drawable) {
        if (drawable instanceof C45325e) {
            return (C45325e) drawable;
        }
        return new C45325e(drawable.mutate());
    }

    /* renamed from: b */
    public final boolean mo49300b() {
        ColorStateList colorStateList = this.f118448a;
        if (colorStateList == null) {
            return false;
        }
        setColorFilter(colorStateList.getColorForState(getState(), 0), PorterDuff.Mode.SRC_IN);
        return true;
    }

    public final boolean isStateful() {
        return true;
    }

    public final boolean setState(int[] iArr) {
        return super.setState(iArr) || mo49300b();
    }
}
