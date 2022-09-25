package com.google.android.libraries.lens.view.gallery.p2111d;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.common.RoundedImageView;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.ap */
/* compiled from: PG */
public final class C26354ap {

    /* renamed from: a */
    public final C28306ab f71644a;

    /* renamed from: b */
    public final float f71645b;

    /* renamed from: c */
    private final LayoutInflater f71646c;

    /* renamed from: d */
    private final float f71647d;

    /* renamed from: e */
    private final int f71648e;

    /* renamed from: f */
    private final boolean f71649f;

    public C26354ap(LayoutInflater layoutInflater, C28306ab abVar, int i) {
        this.f71646c = layoutInflater;
        this.f71644a = abVar;
        this.f71648e = i;
        Resources resources = layoutInflater.getContext().getResources();
        this.f71647d = resources.getDimension(R.dimen.lens_gallery_rounded_corner_outer_radius);
        this.f71645b = resources.getDimension(R.dimen.lens_gallery_rounded_corner_radius);
        this.f71649f = resources.getConfiguration().getLayoutDirection() != 1 ? false : true;
    }

    /* renamed from: a */
    public final View mo31549a(int i, ViewGroup viewGroup) {
        return this.f71646c.inflate(i, viewGroup, false);
    }

    /* renamed from: b */
    public final void mo31550b(int i, View view, int i2) {
        C28313c a = this.f71644a.f76990a.mo33805a(C28427h.m53115a(i));
        a.mo33858f(C28375ak.m53059a((long) i2));
        this.f71644a.mo33802c(view, a);
    }

    /* renamed from: c */
    public final void mo31551c(int i, View view) {
        this.f71644a.mo33802c(view, this.f71644a.f76990a.mo33805a(C28427h.m53115a(i)));
    }

    /* renamed from: d */
    public final void mo31552d(RoundedImageView roundedImageView, int i, int i2) {
        float f;
        int i3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = this.f71645b;
        int min = Math.min(this.f71648e, i2);
        int i4 = i % min;
        int i5 = i / min;
        int i6 = (i2 - 1) / min;
        int i7 = 0;
        if (i5 == 0) {
            if (i4 == 0) {
                if (this.f71649f) {
                    f5 = this.f71647d;
                    f4 = f6;
                } else {
                    f4 = this.f71647d;
                    f5 = f6;
                }
                i3 = 0;
            } else {
                f4 = f6;
                i3 = i4;
                f5 = f4;
            }
            if (i3 == min - 1) {
                if (this.f71649f) {
                    f4 = this.f71647d;
                } else {
                    f5 = this.f71647d;
                }
            }
            f = f5;
            f2 = f4;
            i5 = 0;
        } else {
            f = f6;
            i3 = i4;
            f2 = f;
        }
        if (i5 == i6) {
            if (i3 != 0) {
                f3 = f6;
                i7 = i3;
            } else if (this.f71649f) {
                f3 = this.f71647d;
            } else {
                float f7 = f6;
                f6 = this.f71647d;
                f3 = f7;
            }
            if (i7 == min - 1) {
                if (this.f71649f) {
                    f6 = this.f71647d;
                } else {
                    f3 = this.f71647d;
                }
            }
        } else {
            f3 = f6;
        }
        roundedImageView.mo17754z().mo30897a(f2, f, f6, f3);
    }
}
