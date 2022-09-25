package com.google.android.apps.search.googleapp.discover.p10191i.p10192a.p10194b;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.LinearInterpolator;
import com.facebook.litho.C6279fv;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.googleapp.discover.i.a.b.c */
/* compiled from: PG */
public final class C134361c extends C6407q {
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: A */
    int f365987A;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: B */
    int f365988B;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: C */
    boolean f365989C;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: D */
    float f365990D;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    boolean f365991a;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    String f365992b;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: c */
    Animator.AnimatorListener f365993c;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: d */
    float f365994d;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: e */
    int f365995e;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: f */
    float f365996f;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: g */
    int f365997g;

    public C134361c() {
        super("ProgressBar");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo12793K() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        return new C134367i(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo12799R(C6411u uVar) {
        C6281fx fxVar = new C6281fx();
        fxVar.f18496a = new AtomicReference();
        ((C134360b) this.f18999v).f365986a = (AtomicReference) fxVar.f18496a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo12802V(C6411u uVar, Object obj) {
        C134367i iVar = (C134367i) obj;
        boolean z = this.f365991a;
        boolean z2 = this.f365989C;
        float f = this.f365990D;
        Animator.AnimatorListener animatorListener = this.f365993c;
        AtomicReference atomicReference = ((C134360b) this.f18999v).f365986a;
        if (z && z2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(iVar, C134367i.f366004a, new float[]{iVar.f366011h, 1.0f});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration((long) (f * 1000.0f * (1.0f - iVar.f366011h)));
            if (animatorListener != null) {
                ofFloat.addListener(animatorListener);
            }
            ofFloat.start();
            atomicReference.set(ofFloat);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        C134367i iVar = (C134367i) obj;
        String str = this.f365992b;
        int i = this.f365995e;
        int i2 = this.f365988B;
        float f = this.f365994d;
        float f2 = this.f365996f;
        int i3 = this.f365997g;
        int i4 = this.f365987A;
        boolean z = this.f365991a;
        if (iVar.f366007d != i3) {
            iVar.f366007d = i3;
            iVar.invalidate();
        }
        if (iVar.f366008e != i4) {
            iVar.f366008e = i4;
            iVar.invalidate();
        }
        boolean z2 = true;
        int applyDimension = (int) TypedValue.applyDimension(1, f2, iVar.getResources().getDisplayMetrics());
        if (iVar.f366005b != applyDimension) {
            iVar.f366005b = applyDimension;
            iVar.invalidate();
        }
        int applyDimension2 = (int) TypedValue.applyDimension(1, f, iVar.getResources().getDisplayMetrics());
        if (iVar.f366006c != applyDimension2) {
            iVar.f366006c = applyDimension2;
            iVar.invalidate();
        }
        C58838bb.m90868c(i > 0);
        if (iVar.f366009f != i) {
            iVar.f366009f = i;
            iVar.invalidate();
        }
        boolean z3 = i2 != iVar.f366010g;
        if (z3) {
            if (i2 < 0) {
                z2 = false;
            }
            C58838bb.m90868c(z2);
            int min = Math.min(i2, iVar.f366009f);
            if (iVar.f366010g != min) {
                iVar.f366010g = min;
                iVar.invalidate();
            }
        }
        if (!z) {
            iVar.mo111770a(1.0f);
        } else if (z3 || str == null || !str.equals(iVar.getTag(R.id.googleapp_element_key)) || !Boolean.TRUE.equals(iVar.getTag(R.id.googleapp_animation_enabled))) {
            iVar.mo111770a(0.0f);
        }
        iVar.setTag(R.id.googleapp_element_key, str);
        iVar.setTag(R.id.googleapp_animation_enabled, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aB */
    public final void mo12808aB(Object obj) {
        C134367i iVar = (C134367i) obj;
        AtomicReference atomicReference = ((C134360b) this.f18999v).f365986a;
        if (atomicReference.get() != null) {
            ((Animator) atomicReference.get()).removeAllListeners();
            ((Animator) atomicReference.get()).cancel();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo12812ac(C6279fv fvVar, C6279fv fvVar2) {
        ((C134360b) fvVar2).f365986a = ((C134360b) fvVar).f365986a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public final boolean mo12818ai() {
        return true;
    }

    /* renamed from: ao */
    public final int mo12824ao() {
        return 3;
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C134361c cVar = (C134361c) qVar;
        if (this.f365991a != cVar.f365991a) {
            return false;
        }
        String str = this.f365992b;
        if (str == null ? cVar.f365992b != null : !str.equals(cVar.f365992b)) {
            return false;
        }
        Animator.AnimatorListener animatorListener = this.f365993c;
        if (animatorListener == null ? cVar.f365993c == null : animatorListener.equals(cVar.f365993c)) {
            return Float.compare(this.f365994d, cVar.f365994d) == 0 && this.f365995e == cVar.f365995e && Float.compare(this.f365996f, cVar.f365996f) == 0 && this.f365997g == cVar.f365997g && this.f365987A == cVar.f365987A && this.f365988B == cVar.f365988B && this.f365989C == cVar.f365989C && Float.compare(this.f365990D, cVar.f365990D) == 0;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final /* synthetic */ C6279fv mo13319o() {
        return new C134360b();
    }
}
