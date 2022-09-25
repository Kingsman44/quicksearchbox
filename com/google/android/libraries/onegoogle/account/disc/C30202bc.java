package com.google.android.libraries.onegoogle.account.disc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.FrameLayout;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30891t;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30894w;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30895x;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.ain;
import com.google.common.p4552o.aip;
import com.google.common.p4552o.aiq;
import com.google.common.p4552o.air;
import com.google.protobuf.C62940bt;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.bc */
/* compiled from: PG */
public final class C30202bc {

    /* renamed from: i */
    private static final Property f81649i = new C30201bb(Integer.class);

    /* renamed from: a */
    public final RingView f81650a;

    /* renamed from: b */
    public final RingFrameLayout f81651b;

    /* renamed from: c */
    public final int f81652c;

    /* renamed from: d */
    public final int f81653d;

    /* renamed from: e */
    public C28353e f81654e;

    /* renamed from: f */
    public C30897z f81655f;

    /* renamed from: g */
    public boolean f81656g = true;

    /* renamed from: h */
    public C58833ax f81657h = C58836b.f156633a;

    /* renamed from: j */
    private final int f81658j;

    /* renamed from: k */
    private AnimatorSet f81659k = new AnimatorSet();

    public C30202bc(RingView ringView, int i, int i2, RingFrameLayout ringFrameLayout) {
        this.f81650a = ringView;
        this.f81651b = ringFrameLayout;
        C30197ay ayVar = new C30197ay(ringView.getResources());
        int round = Math.round(ayVar.mo35654a(i));
        this.f81658j = round;
        int c = ayVar.mo35656c(i);
        this.f81652c = c;
        int i3 = (i2 - c) / 2;
        this.f81653d = i3;
        ringView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        ringView.setPadding(i3, i3, i3, i3);
        ringView.f81593b = round;
        ringView.f81594c = c / 2;
        ringView.f81592a.setStrokeWidth((float) (round + round));
        ringView.mo35617a();
        ringFrameLayout.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo35661a(C58833ax axVar, boolean z) {
        Drawable drawable;
        if (this.f81659k.isRunning()) {
            this.f81659k.cancel();
        }
        C28353e eVar = null;
        if (!axVar.mo56113h()) {
            this.f81656g = true;
            drawable = null;
        } else {
            C30192at atVar = (C30192at) axVar.mo56107c();
            if (atVar.mo35647c() != null) {
                this.f81656g = true;
                atVar.mo35647c();
                C30197ay ayVar = new C30197ay(this.f81650a.getResources());
                Objects.requireNonNull(ayVar);
                drawable = new C30188ap(new C30196ax(ayVar));
            } else if (atVar.mo35645a() != null) {
                this.f81656g = false;
                C58838bb.m90884s(this.f81650a.getPaddingTop() == this.f81653d, "The ring diameter may only be manually set on RingViewHolder if the RingContent has a scalableRingDrawableFactory");
                drawable = atVar.mo35645a().mo35649a(this.f81658j);
            } else {
                throw new IllegalStateException("RingContent must have a ring drawable factory.");
            }
        }
        C58480gp e = C58485gu.m89837e();
        if (this.f81650a.getDrawable() != null) {
            ObjectAnimator duration = ObjectAnimator.ofInt(this.f81650a, f81649i, new int[]{this.f81658j, -1}).setDuration(200);
            duration.addListener(new C30198az(this));
            e.mo55395g(duration);
        }
        if (drawable != null) {
            ObjectAnimator duration2 = ObjectAnimator.ofInt(this.f81650a, f81649i, new int[]{-1, this.f81658j}).setDuration(200);
            duration2.addListener(new C30200ba(this, axVar, drawable));
            e.mo55395g(duration2);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(e.mo55394f());
        this.f81659k = animatorSet;
        if (!z || this.f81650a.getDrawable() == drawable) {
            this.f81659k.setDuration(0);
        }
        this.f81659k.start();
        if (axVar.mo56113h()) {
            C30192at atVar2 = (C30192at) axVar.mo56107c();
            if (atVar2.mo35648d() != 0) {
                C62940bt btVar = C30891t.f83295a;
                C30894w wVar = (C30894w) C30895x.f83301c.createBuilder();
                aiq aiq = (aiq) air.f158830f.createBuilder();
                ain ain = (ain) aip.f158826c.createBuilder();
                int d = atVar2.mo35648d();
                ain.copyOnWrite();
                aip aip = (aip) ain.instance;
                int i = d - 1;
                if (d != 0) {
                    aip.f158829b = i;
                    aip.f158828a |= 1;
                    aiq.copyOnWrite();
                    air air = (air) aiq.instance;
                    aip aip2 = (aip) ain.build();
                    aip2.getClass();
                    air.f158836d = aip2;
                    air.f158833a |= 8;
                    wVar.copyOnWrite();
                    C30895x xVar = (C30895x) wVar.instance;
                    air air2 = (air) aiq.build();
                    air2.getClass();
                    xVar.f83304b = air2;
                    xVar.f83303a |= 1;
                    eVar = new C28353e(btVar, (C30895x) wVar.build());
                } else {
                    throw null;
                }
            }
        }
        this.f81654e = eVar;
        C30897z zVar = this.f81655f;
        if (zVar != null) {
            this.f81651b.mo35632lk(zVar);
            C28353e eVar2 = this.f81654e;
            if (eVar2 != null) {
                this.f81651b.mo35631c(this.f81655f, eVar2);
            } else {
                this.f81651b.mo35630b(this.f81655f);
            }
        }
    }
}
