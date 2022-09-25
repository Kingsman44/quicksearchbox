package com.google.android.apps.gsa.search.shared.overlay;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87625ad;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87643q;
import com.google.android.apps.gsa.searchplate.C88890a;
import com.google.android.apps.gsa.searchplate.p6965c.C88927a;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.i */
/* compiled from: PG */
public final class C87660i implements View.OnTouchListener {

    /* renamed from: j */
    private static final TimeInterpolator f236922j = new LinearInterpolator();

    /* renamed from: a */
    public final View f236923a;

    /* renamed from: b */
    public final C88890a f236924b;

    /* renamed from: c */
    public final ValueAnimator f236925c;

    /* renamed from: d */
    public int f236926d;

    /* renamed from: e */
    public int f236927e;

    /* renamed from: f */
    public boolean f236928f;

    /* renamed from: g */
    public boolean f236929g;

    /* renamed from: h */
    public boolean f236930h;

    /* renamed from: i */
    public final C87643q f236931i;

    /* renamed from: k */
    private final ValueAnimator f236932k;

    /* renamed from: l */
    private final int[] f236933l;

    public C87660i(View view, C88890a aVar, C87643q qVar, boolean z, boolean z2, int[] iArr) {
        this.f236923a = view;
        this.f236924b = aVar;
        this.f236931i = qVar;
        this.f236928f = z;
        this.f236929g = z2;
        this.f236933l = (int[]) iArr.clone();
        view.setOnTouchListener(this);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(aVar, "alpha", new int[]{0, PrivateKeyType.INVALID});
        this.f236932k = ofInt;
        TimeInterpolator timeInterpolator = f236922j;
        ofInt.setInterpolator(timeInterpolator);
        ofInt.setDuration(100);
        ofInt.addListener(new C87658g(this, aVar, view));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{0, PrivateKeyType.INVALID});
        this.f236925c = ofInt2;
        ofInt2.setInterpolator(timeInterpolator);
        ofInt2.setDuration(100);
        ofInt2.addUpdateListener(new C87657f(aVar));
        ofInt2.addListener(new C87659h(qVar));
    }

    /* renamed from: c */
    private final boolean m142587c(int i) {
        for (int i2 : this.f236933l) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo81854a() {
        if (this.f236930h) {
            this.f236923a.setVisibility(this.f236927e == 0 ? 8 : 0);
        }
    }

    /* renamed from: b */
    public final void mo81855b(boolean z) {
        this.f236927e = (m142587c(this.f236926d) || !this.f236928f) ? 0 : PrivateKeyType.INVALID;
        this.f236932k.cancel();
        if (!z || this.f236927e == this.f236924b.f240790b) {
            this.f236924b.setAlpha(this.f236927e);
            mo81854a();
        } else {
            if (this.f236930h) {
                this.f236923a.setVisibility(0);
            }
            this.f236932k.setIntValues(new int[]{this.f236927e});
            this.f236932k.start();
        }
        if (m142587c(this.f236926d) || !this.f236928f) {
            if (this.f236925c.isRunning()) {
                this.f236925c.cancel();
            }
            this.f236924b.mo82738c(0);
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (m142587c(this.f236926d) || motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (!this.f236929g && this.f236926d == 1) {
            return false;
        }
        if (!C88927a.m144527b(this.f236926d)) {
            C87625ad adVar = this.f236931i.f236902a;
            if (!adVar.f236796Z) {
                if (adVar.f236791U) {
                    adVar.mo17500a();
                } else {
                    adVar.f236773C.mo81935g();
                }
            }
        }
        return true;
    }
}
