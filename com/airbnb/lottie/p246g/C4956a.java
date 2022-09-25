package com.airbnb.lottie.p246g;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C4964k;

/* renamed from: com.airbnb.lottie.g.a */
/* compiled from: PG */
public class C4956a {

    /* renamed from: a */
    private final C4964k f15730a;

    /* renamed from: b */
    public final Object f15731b;

    /* renamed from: c */
    public Object f15732c;

    /* renamed from: d */
    public final Interpolator f15733d;

    /* renamed from: e */
    public final Interpolator f15734e;

    /* renamed from: f */
    public final Interpolator f15735f;

    /* renamed from: g */
    public final float f15736g;

    /* renamed from: h */
    public Float f15737h;

    /* renamed from: i */
    public float f15738i;

    /* renamed from: j */
    public float f15739j;

    /* renamed from: k */
    public int f15740k;

    /* renamed from: l */
    public int f15741l;

    /* renamed from: m */
    public PointF f15742m;

    /* renamed from: n */
    public PointF f15743n;

    /* renamed from: o */
    private float f15744o;

    /* renamed from: p */
    private float f15745p;

    public C4956a(C4964k kVar, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.f15738i = -3987645.8f;
        this.f15739j = -3987645.8f;
        this.f15740k = 784923401;
        this.f15741l = 784923401;
        this.f15744o = Float.MIN_VALUE;
        this.f15745p = Float.MIN_VALUE;
        this.f15742m = null;
        this.f15743n = null;
        this.f15730a = kVar;
        this.f15731b = obj;
        this.f15732c = obj2;
        this.f15733d = interpolator;
        this.f15734e = null;
        this.f15735f = null;
        this.f15736g = f;
        this.f15737h = f2;
    }

    public C4956a(C4964k kVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.f15738i = -3987645.8f;
        this.f15739j = -3987645.8f;
        this.f15740k = 784923401;
        this.f15741l = 784923401;
        this.f15744o = Float.MIN_VALUE;
        this.f15745p = Float.MIN_VALUE;
        this.f15742m = null;
        this.f15743n = null;
        this.f15730a = kVar;
        this.f15731b = obj;
        this.f15732c = obj2;
        this.f15733d = null;
        this.f15734e = interpolator;
        this.f15735f = interpolator2;
        this.f15736g = f;
        this.f15737h = null;
    }

    protected C4956a(C4964k kVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f15738i = -3987645.8f;
        this.f15739j = -3987645.8f;
        this.f15740k = 784923401;
        this.f15741l = 784923401;
        this.f15744o = Float.MIN_VALUE;
        this.f15745p = Float.MIN_VALUE;
        this.f15742m = null;
        this.f15743n = null;
        this.f15730a = kVar;
        this.f15731b = obj;
        this.f15732c = obj2;
        this.f15733d = interpolator;
        this.f15734e = interpolator2;
        this.f15735f = interpolator3;
        this.f15736g = f;
        this.f15737h = f2;
    }

    public C4956a(Object obj) {
        this.f15738i = -3987645.8f;
        this.f15739j = -3987645.8f;
        this.f15740k = 784923401;
        this.f15741l = 784923401;
        this.f15744o = Float.MIN_VALUE;
        this.f15745p = Float.MIN_VALUE;
        this.f15742m = null;
        this.f15743n = null;
        this.f15730a = null;
        this.f15731b = obj;
        this.f15732c = obj;
        this.f15733d = null;
        this.f15734e = null;
        this.f15735f = null;
        this.f15736g = Float.MIN_VALUE;
        this.f15737h = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: b */
    public final float mo9895b() {
        if (this.f15730a == null) {
            return 1.0f;
        }
        float f = this.f15745p;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        if (this.f15737h == null) {
            this.f15745p = 1.0f;
            return 1.0f;
        }
        float c = mo9896c();
        float floatValue = this.f15737h.floatValue();
        float f2 = this.f15736g;
        C4964k kVar = this.f15730a;
        float f3 = ((floatValue - f2) / (kVar.f15761j - kVar.f15760i)) + c;
        this.f15745p = f3;
        return f3;
    }

    /* renamed from: c */
    public final float mo9896c() {
        C4964k kVar = this.f15730a;
        if (kVar == null) {
            return 0.0f;
        }
        float f = this.f15744o;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float f2 = this.f15736g;
        float f3 = kVar.f15760i;
        float f4 = (f2 - f3) / (kVar.f15761j - f3);
        this.f15744o = f4;
        return f4;
    }

    /* renamed from: d */
    public final boolean mo9897d(float f) {
        return f >= mo9896c() && f < mo9895b();
    }

    /* renamed from: e */
    public final boolean mo9898e() {
        return this.f15733d == null && this.f15734e == null && this.f15735f == null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15731b);
        String valueOf2 = String.valueOf(this.f15732c);
        float f = this.f15736g;
        Float f2 = this.f15737h;
        String valueOf3 = String.valueOf(this.f15733d);
        return "Keyframe{startValue=" + valueOf + ", endValue=" + valueOf2 + ", startFrame=" + f + ", endFrame=" + f2 + ", interpolator=" + valueOf3 + "}";
    }
}
