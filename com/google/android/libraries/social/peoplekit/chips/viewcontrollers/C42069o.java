package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.o */
/* compiled from: PG */
public final class C42069o extends BitmapDrawable {

    /* renamed from: a */
    private final Drawable f109962a;

    /* renamed from: b */
    private final Paint f109963b;

    /* renamed from: c */
    private final int f109964c;

    /* renamed from: d */
    private final int f109965d;

    /* renamed from: e */
    private final int f109966e;

    /* renamed from: f */
    private final int f109967f;

    public C42069o(Context context) {
        this.f109964c = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_ood_drawable_size);
        this.f109965d = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_ood_drawable_circle_radius_size);
        this.f109966e = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_avatar_size);
        this.f109967f = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_start_padding);
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_gm_ic_domain_disabled_vd_theme_24);
        this.f109962a = c;
        c.mutate();
        C1929b.m5225f(c, C1878d.m5128a(context, R.color.google_grey800));
        C1929b.m5227h(c, PorterDuff.Mode.SRC_IN);
        Paint paint = new Paint();
        this.f109963b = paint;
        paint.setAntiAlias(true);
        paint.setColor(C1878d.m5128a(context, R.color.google_yellow500));
    }

    public final void draw(Canvas canvas) {
        float f = ((float) this.f109966e) / 2.0f;
        canvas.drawCircle(f, f, (float) this.f109965d, this.f109963b);
        Drawable drawable = this.f109962a;
        int i = this.f109967f;
        int i2 = this.f109964c + i;
        drawable.setBounds(i, i, i2, i2);
        this.f109962a.draw(canvas);
    }
}
