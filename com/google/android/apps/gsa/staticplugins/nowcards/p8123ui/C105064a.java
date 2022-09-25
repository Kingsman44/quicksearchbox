package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.google.android.apps.gsa.now.shared.p6421ui.C83413b;
import com.google.android.googlequicksearchbox.R;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.a */
/* compiled from: PG */
public final class C105064a {

    /* renamed from: a */
    private final Context f292783a;

    public C105064a(Context context) {
        this.f292783a = context;
    }

    /* renamed from: a */
    public final Drawable mo94505a(int i, int i2) {
        RippleDrawable rippleDrawable = (RippleDrawable) this.f292783a.getResources().getDrawable(R.drawable.qp_clickable_module_background);
        if (i2 != 3 || i != 6) {
            return rippleDrawable;
        }
        RippleDrawable rippleDrawable2 = (RippleDrawable) rippleDrawable.mutate();
        float[] fArr = new float[8];
        Arrays.fill(fArr, 0, 8, (float) C83413b.m132808a(this.f292783a));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(), new float[8]));
        shapeDrawable.getPaint().setColor(-1);
        rippleDrawable2.setDrawableByLayerId(16908334, shapeDrawable);
        return rippleDrawable2;
    }
}
