package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.p119j.p120a.p121a.C2300b;
import androidx.p198v.p199a.p200a.C4244c;
import com.google.android.material.p3505b.C44535e;

/* renamed from: com.google.android.material.progressindicator.m */
/* compiled from: PG */
final class C44855m extends C44864v {

    /* renamed from: a */
    public static final int[] f117027a = {0, 1350, 2700, 4050};

    /* renamed from: b */
    public static final int[] f117028b = {667, 2017, 3367, 4717};

    /* renamed from: c */
    public static final int[] f117029c = {1000, 2350, 3700, 5050};

    /* renamed from: m */
    private static final Property f117030m = new C44853k(Float.class);

    /* renamed from: n */
    private static final Property f117031n = new C44854l(Float.class);

    /* renamed from: d */
    public final C2300b f117032d;

    /* renamed from: e */
    public final C44849g f117033e;

    /* renamed from: f */
    public int f117034f = 0;

    /* renamed from: g */
    public float f117035g;

    /* renamed from: h */
    public float f117036h;

    /* renamed from: i */
    C4244c f117037i = null;

    /* renamed from: o */
    private ObjectAnimator f117038o;

    /* renamed from: p */
    private ObjectAnimator f117039p;

    public C44855m(C44856n nVar) {
        super(1);
        this.f117033e = nVar;
        this.f117032d = new C2300b();
    }

    /* renamed from: a */
    public final void mo48257a() {
        ObjectAnimator objectAnimator = this.f117038o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: b */
    public final void mo48258b(C4244c cVar) {
        this.f117037i = cVar;
    }

    /* renamed from: c */
    public final void mo48259c() {
        ObjectAnimator objectAnimator = this.f117039p;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f117064j.isVisible()) {
                this.f117039p.start();
            } else {
                mo48257a();
            }
        }
    }

    /* renamed from: d */
    public final void mo48260d() {
        if (this.f117038o == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f117030m, new float[]{0.0f, 1.0f});
            this.f117038o = ofFloat;
            ofFloat.setDuration(5400);
            this.f117038o.setInterpolator((TimeInterpolator) null);
            this.f117038o.setRepeatCount(-1);
            this.f117038o.addListener(new C44851i(this));
        }
        if (this.f117039p == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f117031n, new float[]{0.0f, 1.0f});
            this.f117039p = ofFloat2;
            ofFloat2.setDuration(333);
            this.f117039p.setInterpolator(this.f117032d);
            this.f117039p.addListener(new C44852j(this));
        }
        this.f117034f = 0;
        this.f117066l[0] = C44535e.m78718a(this.f117033e.f117017c[0], this.f117064j.f117060i);
        this.f117036h = 0.0f;
        this.f117038o.start();
    }

    /* renamed from: e */
    public final void mo48261e() {
        this.f117037i = null;
    }
}
