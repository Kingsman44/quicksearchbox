package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136453f;
import com.google.apps.tiktok.tracing.C47759cx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3694d.C47603c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.w */
/* compiled from: PG */
public final class C136520w implements Interpolator {

    /* renamed from: a */
    public int f371648a;

    /* renamed from: b */
    public Optional f371649b = Optional.empty();

    /* renamed from: c */
    private final C136521x f371650c;

    /* renamed from: d */
    private final C136453f f371651d;

    /* renamed from: e */
    private final C47770dh f371652e;

    public C136520w(C136521x xVar, C136453f fVar, C47770dh dhVar) {
        this.f371650c = xVar;
        this.f371651d = fVar;
        this.f371652e = dhVar;
    }

    /* renamed from: a */
    public final void mo113129a() {
        C59071e eVar = C136521x.f371653a;
        this.f371651d.mo113057a(String.format(Locale.US, "endAnimation: finalX = %d", new Object[]{Integer.valueOf(this.f371648a)}));
        this.f371649b = Optional.empty();
        this.f371650c.mo113148p(this.f371648a);
        C136521x xVar = this.f371650c;
        if (xVar.f371662G) {
            xVar.f371662G = false;
            int i = xVar.f371670g;
            if (i == 0) {
                xVar.mo113137e();
            } else if (i == xVar.f371667d.getMeasuredWidth()) {
                xVar.mo113139g();
            }
        }
    }

    /* renamed from: b */
    public final void mo113130b() {
        this.f371649b.ifPresent(C136518u.f371646a);
    }

    /* renamed from: c */
    public final void mo113131c(int i, int i2) {
        mo113130b();
        this.f371648a = i;
        if (i2 > 0) {
            C136521x xVar = this.f371650c;
            C47770dh dhVar = this.f371652e;
            Property property = C136521x.f371654b;
            C69664n.m101061g(dhVar, "<this>");
            C69664n.m101061g(property, "property");
            ObjectAnimator duration = ObjectAnimator.ofInt(xVar, new C47603c(dhVar, property, property.getType(), property.getName()), new int[]{i}).setDuration((long) i2);
            this.f371649b = Optional.m71637of(duration);
            duration.setInterpolator(this);
            duration.addListener(new C47759cx(this.f371652e, new C136519v(this), "SlidingPanel animator listener"));
            duration.start();
            return;
        }
        mo113129a();
    }

    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
