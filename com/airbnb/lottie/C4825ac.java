package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.p237b.C4839a;
import com.airbnb.lottie.p237b.C4840b;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.C4891f;
import com.airbnb.lottie.p238c.p241c.C4879c;
import com.airbnb.lottie.p238c.p241c.C4882f;
import com.airbnb.lottie.p243e.C4935s;
import com.airbnb.lottie.p245f.C4946c;
import com.airbnb.lottie.p245f.C4947d;
import com.airbnb.lottie.p245f.C4948e;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4958c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.airbnb.lottie.ac */
/* compiled from: PG */
public final class C4825ac extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a */
    public C4964k f15341a;

    /* renamed from: b */
    public final C4948e f15342b;

    /* renamed from: c */
    public float f15343c;

    /* renamed from: d */
    public boolean f15344d;

    /* renamed from: e */
    public boolean f15345e;

    /* renamed from: f */
    public final ArrayList f15346f;

    /* renamed from: g */
    public C4840b f15347g;

    /* renamed from: h */
    public String f15348h;

    /* renamed from: i */
    public C4839a f15349i;

    /* renamed from: j */
    public boolean f15350j;

    /* renamed from: k */
    public C4879c f15351k;

    /* renamed from: l */
    public boolean f15352l;

    /* renamed from: m */
    private final Matrix f15353m = new Matrix();

    /* renamed from: n */
    private final ValueAnimator.AnimatorUpdateListener f15354n;

    /* renamed from: o */
    private int f15355o;

    /* renamed from: p */
    private boolean f15356p;

    public C4825ac() {
        C4948e eVar = new C4948e();
        this.f15342b = eVar;
        this.f15343c = 1.0f;
        this.f15344d = true;
        this.f15345e = false;
        this.f15346f = new ArrayList();
        C4978y yVar = new C4978y(this);
        this.f15354n = yVar;
        this.f15355o = PrivateKeyType.INVALID;
        this.f15352l = true;
        this.f15356p = false;
        eVar.addUpdateListener(yVar);
    }

    /* renamed from: n */
    private final boolean m13468n() {
        return this.f15344d || this.f15345e;
    }

    /* renamed from: o */
    private static final float m13469o(Rect rect) {
        return ((float) rect.width()) / ((float) rect.height());
    }

    /* renamed from: a */
    public final void mo9756a(C4890e eVar, Object obj, C4958c cVar) {
        List list;
        if (this.f15351k == null) {
            this.f15346f.add(new C4977x(this, eVar, obj, cVar));
            return;
        }
        if (eVar == C4890e.f15624a) {
            this.f15351k.mo9714a(obj, cVar);
        } else {
            C4891f fVar = eVar.f15625b;
            if (fVar != null) {
                fVar.mo9714a(obj, cVar);
            } else {
                if (this.f15351k == null) {
                    ((C4946c) C4947d.f15711a).mo9784a("Cannot resolve KeyPath. Composition is not set yet.", (Throwable) null);
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.f15351k.mo9718e(eVar, 0, arrayList, new C4890e(new String[0]));
                    list = arrayList;
                }
                for (int i = 0; i < list.size(); i++) {
                    ((C4890e) list.get(i)).f15625b.mo9714a(obj, cVar);
                }
                if (list.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == C4829ag.f15364C) {
            mo9773j(this.f15342b.mo9874d());
        }
    }

    /* renamed from: b */
    public final void mo9757b() {
        C4882f a = C4935s.m13680a(this.f15341a);
        C4964k kVar = this.f15341a;
        this.f15351k = new C4879c(this, a, kVar.f15758g, kVar);
    }

    /* renamed from: c */
    public final void mo9758c() {
        C4948e eVar = this.f15342b;
        if (eVar.f15719i) {
            eVar.mo9860a();
            eVar.mo9883i(true);
        }
        this.f15341a = null;
        this.f15351k = null;
        this.f15347g = null;
        C4948e eVar2 = this.f15342b;
        eVar2.f15718h = null;
        eVar2.f15716f = -2.14748365E9f;
        eVar2.f15717g = 2.14748365E9f;
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo9759d() {
        this.f15346f.clear();
        this.f15342b.mo9883i(true);
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        this.f15356p = false;
        C4964k kVar = this.f15341a;
        int i = -1;
        if (kVar == null || getBounds().isEmpty() || m13469o(getBounds()) == m13469o(kVar.f15759h)) {
            if (this.f15351k != null) {
                float f3 = this.f15343c;
                float min = Math.min(((float) canvas.getWidth()) / ((float) this.f15341a.f15759h.width()), ((float) canvas.getHeight()) / ((float) this.f15341a.f15759h.height()));
                if (f3 > min) {
                    f = this.f15343c / min;
                } else {
                    min = f3;
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width = ((float) this.f15341a.f15759h.width()) / 2.0f;
                    float height = ((float) this.f15341a.f15759h.height()) / 2.0f;
                    float f4 = width * min;
                    float f5 = height * min;
                    float f6 = this.f15343c;
                    canvas.translate((width * f6) - f4, (f6 * height) - f5);
                    canvas.scale(f, f, f4, f5);
                }
                this.f15353m.reset();
                this.f15353m.preScale(min, min);
                this.f15351k.mo9715b(canvas, this.f15353m, this.f15355o);
                if (i > 0) {
                    canvas.restoreToCount(i);
                }
            }
        } else if (this.f15351k != null) {
            Rect bounds = getBounds();
            float width2 = ((float) bounds.width()) / ((float) this.f15341a.f15759h.width());
            float height2 = ((float) bounds.height()) / ((float) this.f15341a.f15759h.height());
            if (this.f15352l) {
                float min2 = Math.min(width2, height2);
                if (min2 < 1.0f) {
                    f2 = 1.0f / min2;
                    width2 /= f2;
                    height2 /= f2;
                } else {
                    f2 = 1.0f;
                }
                if (f2 > 1.0f) {
                    i = canvas.save();
                    float width3 = ((float) bounds.width()) / 2.0f;
                    float height3 = ((float) bounds.height()) / 2.0f;
                    float f7 = width3 * min2;
                    float f8 = min2 * height3;
                    canvas.translate(width3 - f7, height3 - f8);
                    canvas.scale(f2, f2, f7, f8);
                }
            }
            this.f15353m.reset();
            this.f15353m.preScale(width2, height2);
            this.f15351k.mo9715b(canvas, this.f15353m, this.f15355o);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
        C4838b.m13493a();
    }

    /* renamed from: e */
    public final void mo9761e() {
        float f;
        if (this.f15351k == null) {
            this.f15346f.add(new C4979z(this));
            return;
        }
        if (m13468n() || this.f15342b.getRepeatCount() == 0) {
            C4948e eVar = this.f15342b;
            eVar.f15719i = true;
            boolean m = eVar.mo9888m();
            for (Animator.AnimatorListener onAnimationStart : eVar.f15708a) {
                onAnimationStart.onAnimationStart(eVar, m);
            }
            eVar.mo9886k((float) ((int) (eVar.mo9888m() ? eVar.mo9876e() : eVar.mo9877f())));
            eVar.f15713c = 0;
            eVar.f15715e = 0;
            eVar.mo9882h();
        }
        if (!m13468n()) {
            C4948e eVar2 = this.f15342b;
            if (eVar2.f15712b < 0.0f) {
                f = eVar2.mo9877f();
            } else {
                f = eVar2.mo9876e();
            }
            mo9763g((int) f);
            this.f15342b.mo9878g();
        }
    }

    /* renamed from: f */
    public final void mo9762f() {
        float f;
        float f2;
        if (this.f15351k == null) {
            this.f15346f.add(new C4823aa(this));
            return;
        }
        if (m13468n() || this.f15342b.getRepeatCount() == 0) {
            C4948e eVar = this.f15342b;
            eVar.f15719i = true;
            eVar.mo9882h();
            eVar.f15713c = 0;
            if (eVar.mo9888m() && eVar.f15714d == eVar.mo9877f()) {
                f2 = eVar.mo9876e();
            } else if (!eVar.mo9888m() && eVar.f15714d == eVar.mo9876e()) {
                f2 = eVar.mo9877f();
            }
            eVar.f15714d = f2;
        }
        if (!m13468n()) {
            C4948e eVar2 = this.f15342b;
            if (eVar2.f15712b < 0.0f) {
                f = eVar2.mo9877f();
            } else {
                f = eVar2.mo9876e();
            }
            mo9763g((int) f);
            this.f15342b.mo9878g();
        }
    }

    /* renamed from: g */
    public final void mo9763g(int i) {
        if (this.f15341a == null) {
            this.f15346f.add(new C4975v(this, i));
        } else {
            this.f15342b.mo9886k((float) i);
        }
    }

    public final int getAlpha() {
        return this.f15355o;
    }

    public final int getIntrinsicHeight() {
        C4964k kVar = this.f15341a;
        if (kVar == null) {
            return -1;
        }
        return (int) (((float) kVar.f15759h.height()) * this.f15343c);
    }

    public final int getIntrinsicWidth() {
        C4964k kVar = this.f15341a;
        if (kVar == null) {
            return -1;
        }
        return (int) (((float) kVar.f15759h.width()) * this.f15343c);
    }

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void mo9768h(int i, int i2) {
        if (this.f15341a == null) {
            this.f15346f.add(new C4973t(this, i, i2));
        } else {
            this.f15342b.mo9887l((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: i */
    public final void mo9769i(float f, float f2) {
        C4964k kVar = this.f15341a;
        if (kVar == null) {
            this.f15346f.add(new C4974u(this, f, f2));
            return;
        }
        float c = C4949f.m13709c(kVar.f15760i, kVar.f15761j, f);
        C4964k kVar2 = this.f15341a;
        mo9768h((int) c, (int) C4949f.m13709c(kVar2.f15760i, kVar2.f15761j, f2));
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void invalidateSelf() {
        if (!this.f15356p) {
            this.f15356p = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final boolean isRunning() {
        return mo9774k();
    }

    /* renamed from: j */
    public final void mo9773j(float f) {
        C4964k kVar = this.f15341a;
        if (kVar == null) {
            this.f15346f.add(new C4976w(this, f));
            return;
        }
        this.f15342b.mo9886k(C4949f.m13709c(kVar.f15760i, kVar.f15761j, f));
        C4838b.m13493a();
    }

    /* renamed from: k */
    public final boolean mo9774k() {
        C4948e eVar = this.f15342b;
        if (eVar == null) {
            return false;
        }
        return eVar.f15719i;
    }

    /* renamed from: l */
    public final boolean mo9775l(C4964k kVar) {
        float f;
        float f2;
        if (this.f15341a == kVar) {
            return false;
        }
        this.f15356p = false;
        mo9758c();
        this.f15341a = kVar;
        mo9757b();
        C4948e eVar = this.f15342b;
        C4964k kVar2 = eVar.f15718h;
        eVar.f15718h = kVar;
        if (kVar2 == null) {
            f2 = (float) ((int) Math.max(eVar.f15716f, kVar.f15760i));
            f = Math.min(eVar.f15717g, kVar.f15761j);
        } else {
            f2 = (float) ((int) kVar.f15760i);
            f = kVar.f15761j;
        }
        eVar.mo9887l(f2, (float) ((int) f));
        float f3 = eVar.f15714d;
        eVar.f15714d = 0.0f;
        eVar.mo9886k((float) ((int) f3));
        eVar.mo9864c();
        mo9773j(this.f15342b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f15346f).iterator();
        while (it.hasNext()) {
            C4824ab abVar = (C4824ab) it.next();
            if (abVar != null) {
                abVar.mo9755a();
            }
            it.remove();
        }
        this.f15346f.clear();
        C4834al alVar = kVar.f15752a;
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable((Drawable) null);
        imageView.setImageDrawable(this);
        return true;
    }

    /* renamed from: m */
    public final boolean mo9776m() {
        return this.f15341a.f15756e.mo3725d() > 0;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        this.f15355o = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        ((C4946c) C4947d.f15711a).mo9784a("Use addColorFilter instead.", (Throwable) null);
    }

    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            mo9761e();
        }
    }

    public final void stop() {
        this.f15346f.clear();
        this.f15342b.mo9878g();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
