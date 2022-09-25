package com.google.android.apps.gsa.searchplate;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import com.google.android.apps.gsa.searchplate.p6963a.C88896f;
import com.google.android.apps.gsa.searchplate.p6966d.C88929a;
import com.google.android.apps.gsa.searchplate.p6966d.C88940l;
import com.google.android.apps.gsa.searchplate.p6966d.C88941m;
import com.google.android.googlequicksearchbox.R;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.searchplate.n */
/* compiled from: PG */
public final class C88951n extends C88896f implements Animator.AnimatorListener {

    /* renamed from: a */
    public final C88941m f240979a;

    /* renamed from: b */
    public final View f240980b;

    /* renamed from: c */
    public C88893c f240981c;

    /* renamed from: d */
    public int f240982d = 0;

    /* renamed from: e */
    private int f240983e;

    /* renamed from: f */
    private float f240984f;

    public C88951n(View view, ImageView imageView) {
        this.f240980b = view;
        view.setOnClickListener(new C88949l(this));
        view.setContentDescription(view.getResources().getString(R.string.accessibility_feed_button));
        HashMap hashMap = new HashMap();
        hashMap.put(C88941m.m144560c("SUPERG", C88950m.m144581a(2)), new C88929a(new Point(2, 4), new Point(0, 7), R.drawable.g_glass_sprite_sheet_glass_frame));
        hashMap.put(C88941m.m144560c(C88950m.m144581a(2), "SUPERG"), new C88929a(new Point(0, 0), new Point(2, 4), R.drawable.g_glass_sprite_sheet_superg_frame));
        hashMap.put("*SUPERG", new C88929a(new Point(2, 4), new Point(2, 4), R.drawable.g_glass_sprite_sheet_superg_frame));
        hashMap.put("*".concat(C88950m.m144581a(2)), new C88929a(new Point(0, 0), new Point(0, 0), R.drawable.g_glass_sprite_sheet_glass_frame));
        hashMap.put("*EMPTY", new C88929a(new Point(1, 7), new Point(1, 7), 0));
        C88941m mVar = new C88941m(imageView, hashMap, this);
        this.f240979a = mVar;
        mVar.f240942l = 16;
    }

    /* renamed from: a */
    public final void mo81837a(int i, int i2, boolean z) {
        boolean z2 = this.f240980b.getResources().getBoolean(R.bool.is_short_screen);
        this.f240983e = i;
        if ((i2 & 8) != 0 && i == 4) {
            if (z2) {
                i = 4;
            } else {
                mo82836l(2, !z);
                return;
            }
        }
        if (i == 5 || i == 6 || i == 1) {
            mo82836l(1, !z);
        } else if (i == 4) {
            mo82835i(this.f240984f);
        }
    }

    /* renamed from: c */
    public final void mo82744c(C88893c cVar) {
        this.f240981c = cVar;
    }

    /* renamed from: i */
    public final void mo82835i(float f) {
        if (this.f240983e == 4) {
            if (f < 0.095f) {
                mo82836l(1, true);
            } else {
                mo82836l(2, true);
            }
        }
        this.f240984f = f;
    }

    /* renamed from: j */
    public final void mo82750j(Bundle bundle) {
        if (bundle.containsKey("NavigationSuperGComponent.headerscroll")) {
            this.f240984f = bundle.getFloat("NavigationSuperGComponent.headerscroll");
        }
    }

    /* renamed from: k */
    public final void mo82751k(Bundle bundle) {
        bundle.putFloat("NavigationSuperGComponent.headerscroll", this.f240984f);
    }

    /* renamed from: l */
    public final void mo82836l(int i, boolean z) {
        int a;
        int i2 = this.f240982d;
        if (i2 != i) {
            C88941m mVar = this.f240979a;
            String a2 = C88950m.m144581a(i2);
            String a3 = C88950m.m144581a(i);
            if (mVar.f240938h.isStarted()) {
                mVar.f240938h.cancel();
            }
            C88940l lVar = (C88940l) mVar.f240936f.get(C88941m.m144560c(a2, a3));
            if (mVar.f240943m) {
                if (lVar == null) {
                    C88940l b = mVar.mo82821b(a3);
                    if (!(b == null || b.mo82808c() == null)) {
                        mVar.mo82822d(b.mo82808c());
                    }
                } else if (!z || !mVar.f240937g.isShown()) {
                    mVar.mo82822d(lVar.mo82807b());
                    if (mVar.f240935e != null) {
                        ValueAnimator valueAnimator = mVar.f240938h;
                    }
                } else {
                    mVar.f240940j = mVar.mo82820a(lVar.mo82807b()) - mVar.mo82820a(lVar.mo82808c());
                    mVar.f240938h.setFloatValues(new float[]{0.0f, 1.0f});
                    mVar.f240938h.setDuration((long) (mVar.f240940j * mVar.f240942l));
                    mVar.f240939i = lVar.mo82808c();
                    mVar.f240938h.start();
                }
            } else if (lVar == null) {
                C88940l b2 = mVar.mo82821b(a3);
                if (!(b2 == null || b2.mo82806a() == 0)) {
                    ImageView imageView = mVar.f240937g;
                    imageView.setImageDrawable(imageView.getResources().getDrawable(b2.mo82806a()));
                }
            } else if (!(lVar.mo82806a() == 0 || (a = lVar.mo82806a()) == 0)) {
                ImageView imageView2 = mVar.f240937g;
                imageView2.setImageDrawable(imageView2.getResources().getDrawable(a));
            }
            mVar.f240941k = a3;
            this.f240982d = i;
            if (mo82837m()) {
                this.f240980b.setClickable(true);
                this.f240980b.setImportantForAccessibility(1);
                View view = this.f240980b;
                view.setContentDescription(view.getResources().getString(R.string.accessibility_feed_button));
                return;
            }
            this.f240980b.setImportantForAccessibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo82837m() {
        return this.f240982d == 1;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
