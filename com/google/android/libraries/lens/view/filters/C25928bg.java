package com.google.android.libraries.lens.view.filters;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.filters.bg */
/* compiled from: PG */
public final class C25928bg {

    /* renamed from: a */
    public final View f70430a;

    /* renamed from: b */
    public final C25225bd f70431b;

    /* renamed from: c */
    public final boolean f70432c;

    /* renamed from: d */
    public boolean f70433d;

    /* renamed from: e */
    public boolean f70434e;

    /* renamed from: f */
    public boolean f70435f;

    /* renamed from: g */
    public boolean f70436g;

    /* renamed from: h */
    public boolean f70437h;

    /* renamed from: i */
    public C60870cx f70438i;

    /* renamed from: j */
    public final C28443m f70439j;

    /* renamed from: k */
    private final C60888db f70440k;

    /* renamed from: l */
    private final ValueAnimator f70441l;

    public C25928bg(View view, Resources resources, C25225bd bdVar, boolean z, C60888db dbVar, C28310af afVar, C28443m mVar, C28306ab abVar) {
        this.f70430a = view;
        this.f70440k = dbVar;
        this.f70431b = bdVar;
        this.f70432c = z;
        this.f70439j = mVar;
        abVar.mo33801b(view, afVar.mo33805a(C28427h.m53115a(89847)));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.filter_carousel_focus_area_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.shutter_pulse_animation_end_width);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f70441l = ofFloat;
        ofFloat.setDuration(2000);
        ofFloat.addUpdateListener(new C25926be(view, (float) dimensionPixelSize, (float) dimensionPixelSize2));
        ofFloat.addListener(new C25927bf(view));
    }

    /* renamed from: a */
    public final void mo31081a() {
        C60870cx cxVar = this.f70438i;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f70438i = null;
        }
    }

    /* renamed from: c */
    public final void mo31083c() {
        if (!this.f70433d || !this.f70431b.mo30358n()) {
            return;
        }
        if ((!this.f70432c || (this.f70434e && this.f70436g)) && this.f70438i == null) {
            C60888db dbVar = this.f70440k;
            dbVar.getClass();
            this.f70438i = dbVar.mo29165e(new C25925bd(this), 1500, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo31084d(boolean z) {
        this.f70433d = z;
        if (z) {
            mo31083c();
            return;
        }
        mo31081a();
        mo31086f();
    }

    /* renamed from: e */
    public final void mo31085e(boolean z) {
        if (!this.f70441l.isRunning() && this.f70433d) {
            int i = 0;
            this.f70430a.setVisibility(0);
            ValueAnimator valueAnimator = this.f70441l;
            if (true == z) {
                i = 4;
            }
            valueAnimator.setRepeatCount(i);
            this.f70441l.start();
            if (z && !this.f70435f) {
                this.f70435f = true;
            }
        }
    }

    /* renamed from: f */
    public final void mo31086f() {
        if (this.f70441l.isRunning()) {
            this.f70441l.cancel();
        }
    }

    /* renamed from: b */
    public final void mo31082b() {
        if (this.f70432c) {
            if (!this.f70436g || this.f70437h) {
                mo31081a();
                mo31086f();
                return;
            }
            mo31083c();
        }
    }
}
