package com.google.android.libraries.onegoogle.account.disc;

import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.ay */
/* compiled from: PG */
public final class C30197ay {

    /* renamed from: a */
    private final int f81640a;

    /* renamed from: b */
    private final int f81641b;

    /* renamed from: c */
    private final int f81642c;

    /* renamed from: d */
    private final int f81643d;

    public C30197ay(Resources resources) {
        this.f81640a = resources.getDimensionPixelSize(R.dimen.og_apd_large_ring_width);
        this.f81641b = resources.getDimensionPixelSize(R.dimen.og_apd_small_ring_width);
        this.f81642c = resources.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_large_ring);
        this.f81643d = resources.getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_small_ring);
    }

    /* renamed from: d */
    private final float m56132d(int i, int i2, int i3) {
        int i4;
        if (i >= i2) {
            i4 = this.f81640a;
        } else if (i <= i3) {
            i4 = this.f81641b;
        } else {
            int i5 = this.f81641b;
            return ((float) i5) + (((float) (this.f81640a - i5)) * (((float) (i - i3)) / ((float) (i2 - i3))));
        }
        return (float) i4;
    }

    /* renamed from: a */
    public final float mo35654a(int i) {
        return m56132d(i, this.f81642c, this.f81643d);
    }

    /* renamed from: b */
    public final float mo35655b(int i) {
        return m56132d(i, mo35656c(this.f81642c), mo35656c(this.f81643d));
    }

    /* renamed from: c */
    public final int mo35656c(int i) {
        return i + Math.round(mo35654a(i) * 4.0f) + 2;
    }
}
