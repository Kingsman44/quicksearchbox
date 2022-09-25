package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

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
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.j */
/* compiled from: PG */
public final class C42033j extends BitmapDrawable {

    /* renamed from: a */
    private final Drawable f109824a;

    /* renamed from: b */
    private final Paint f109825b;

    /* renamed from: c */
    private final int f109826c;

    public C42033j(Context context, int i, int i2, int i3) {
        this.f109826c = i2;
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.peoplekit_default_avatar);
        this.f109824a = c;
        c.mutate();
        c.setAlpha(i3);
        C1929b.m5225f(c, C1878d.m5128a(context, R.color.quantum_white_100));
        C1929b.m5227h(c, PorterDuff.Mode.SRC_IN);
        Paint paint = new Paint();
        this.f109825b = paint;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setAlpha(PrivateKeyType.INVALID);
    }

    public final void draw(Canvas canvas) {
        float f = (float) (this.f109826c / 2);
        canvas.drawCircle(f, f, f, this.f109825b);
        Drawable drawable = this.f109824a;
        int i = this.f109826c;
        drawable.setBounds(0, 0, i, i);
        this.f109824a.draw(canvas);
    }
}
