package com.google.android.material.p3508e;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C1924a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3512i.C44693c;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.material.e.a */
/* compiled from: PG */
public final class C44654a {

    /* renamed from: c */
    private static final int f116336c = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a */
    public final boolean f116337a;

    /* renamed from: b */
    public final int f116338b;

    /* renamed from: d */
    private final int f116339d;

    /* renamed from: e */
    private final int f116340e;

    /* renamed from: f */
    private final float f116341f;

    public C44654a(Context context) {
        boolean d = C44693c.m79228d(context, R.attr.elevationOverlayEnabled, false);
        int c = C44535e.m78720c(context, R.attr.elevationOverlayColor, 0);
        int c2 = C44535e.m78720c(context, R.attr.elevationOverlayAccentColor, 0);
        int c3 = C44535e.m78720c(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f116337a = d;
        this.f116339d = c;
        this.f116340e = c2;
        this.f116338b = c3;
        this.f116341f = f;
    }

    /* renamed from: b */
    public final int mo47887b(int i, float f) {
        return (!this.f116337a || C1924a.m5189h(i, PrivateKeyType.INVALID) != this.f116338b) ? i : mo47886a(i, f);
    }

    /* renamed from: a */
    public final int mo47886a(int i, float f) {
        int i2;
        float f2 = this.f116341f;
        float min = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int d = C44535e.m78721d(C1924a.m5189h(i, PrivateKeyType.INVALID), this.f116339d, min);
        if (min > 0.0f && (i2 = this.f116340e) != 0) {
            d = C1924a.m5188g(C1924a.m5189h(i2, f116336c), d);
        }
        return C1924a.m5189h(d, alpha);
    }
}
