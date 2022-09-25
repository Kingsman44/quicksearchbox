package com.airbnb.lottie.p234a.p235a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.p240b.C4865h;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4958c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.o */
/* compiled from: PG */
public final class C4796o implements C4795n, C4802a, C4793l {

    /* renamed from: a */
    private final Path f15241a = new Path();

    /* renamed from: b */
    private final String f15242b;

    /* renamed from: c */
    private final C4825ac f15243c;

    /* renamed from: d */
    private final boolean f15244d;

    /* renamed from: e */
    private final C4807f f15245e;

    /* renamed from: f */
    private final C4807f f15246f;

    /* renamed from: g */
    private final C4807f f15247g;

    /* renamed from: h */
    private final C4807f f15248h;

    /* renamed from: i */
    private final C4807f f15249i;

    /* renamed from: j */
    private final C4807f f15250j;

    /* renamed from: k */
    private final C4807f f15251k;

    /* renamed from: l */
    private final C4784c f15252l = new C4784c();

    /* renamed from: m */
    private boolean f15253m;

    /* renamed from: n */
    private final int f15254n;

    public C4796o(C4825ac acVar, C4878b bVar, C4865h hVar) {
        this.f15243c = acVar;
        this.f15242b = hVar.f15484a;
        int i = hVar.f15493j;
        this.f15254n = i;
        this.f15244d = hVar.f15492i;
        C4807f a = hVar.f15485b.mo9797a();
        this.f15245e = a;
        C4807f a2 = hVar.f15486c.mo9797a();
        this.f15246f = a2;
        C4807f a3 = hVar.f15487d.mo9797a();
        this.f15247g = a3;
        C4807f a4 = hVar.f15489f.mo9797a();
        this.f15249i = a4;
        C4807f a5 = hVar.f15491h.mo9797a();
        this.f15251k = a5;
        if (i == 1) {
            this.f15248h = hVar.f15488e.mo9797a();
            this.f15250j = hVar.f15490g.mo9797a();
        } else {
            this.f15248h = null;
            this.f15250j = null;
        }
        bVar.mo9811h(a);
        bVar.mo9811h(a2);
        bVar.mo9811h(a3);
        bVar.mo9811h(a4);
        bVar.mo9811h(a5);
        if (i == 1) {
            bVar.mo9811h(this.f15248h);
            bVar.mo9811h(this.f15250j);
        }
        a.mo9740g(this);
        a2.mo9740g(this);
        a3.mo9740g(this);
        a4.mo9740g(this);
        a5.mo9740g(this);
        if (i == 1) {
            this.f15248h.mo9740g(this);
            this.f15250j.mo9740g(this);
        }
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        C4807f fVar;
        C4807f fVar2;
        C4807f fVar3;
        if (obj == C4829ag.f15390u) {
            fVar = this.f15245e;
        } else if (obj == C4829ag.f15391v) {
            fVar = this.f15247g;
        } else if (obj == C4829ag.f15381l) {
            fVar = this.f15246f;
        } else if (obj == C4829ag.f15392w && (fVar3 = this.f15248h) != null) {
            fVar3.f15301d = cVar;
            return;
        } else if (obj == C4829ag.f15393x) {
            fVar = this.f15249i;
        } else if (obj == C4829ag.f15394y && (fVar2 = this.f15250j) != null) {
            fVar2.f15301d = cVar;
            return;
        } else if (obj == C4829ag.f15395z) {
            fVar = this.f15251k;
        } else {
            return;
        }
        fVar.f15301d = cVar;
    }

    /* renamed from: d */
    public final void mo9717d() {
        this.f15253m = false;
        this.f15243c.invalidateSelf();
    }

    /* renamed from: e */
    public final void mo9718e(C4890e eVar, int i, List list, C4890e eVar2) {
        C4949f.m13714h(eVar, i, list, eVar2, this);
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C4785d dVar = (C4785d) list.get(i);
            if (dVar instanceof C4801t) {
                C4801t tVar = (C4801t) dVar;
                if (tVar.f15290e == 1) {
                    this.f15252l.mo9720a(tVar);
                    tVar.mo9727a(this);
                }
            }
        }
    }

    /* renamed from: g */
    public final String mo9722g() {
        return this.f15242b;
    }

    /* renamed from: i */
    public final Path mo9724i() {
        float f;
        float f2;
        double d;
        float f3;
        float f4;
        float f5;
        boolean z;
        float f6;
        float f7;
        float f8;
        float f9;
        double d2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        double d3;
        double d4;
        double d5;
        if (this.f15253m) {
            return this.f15241a;
        }
        this.f15241a.reset();
        if (this.f15244d) {
            this.f15253m = true;
            return this.f15241a;
        }
        int i = this.f15254n;
        if (i != 0) {
            float f15 = 0.0f;
            if (i != 1) {
                double floor = Math.floor((double) ((Float) this.f15245e.mo9738e()).floatValue());
                double floatValue = (double) ((Float) this.f15247g.mo9738e()).floatValue();
                Double.isNaN(floatValue);
                double radians = Math.toRadians(floatValue - 0.0498046875d);
                double d6 = (double) ((int) floor);
                float floatValue2 = ((Float) this.f15251k.mo9738e()).floatValue() / 100.0f;
                float floatValue3 = ((Float) this.f15249i.mo9738e()).floatValue();
                double d7 = (double) floatValue3;
                double cos = Math.cos(radians);
                Double.isNaN(d7);
                float f16 = floatValue3;
                float f17 = (float) (d7 * cos);
                double sin = Math.sin(radians);
                Double.isNaN(d7);
                float f18 = (float) (d7 * sin);
                this.f15241a.moveTo(f17, f18);
                Double.isNaN(d6);
                double d8 = (double) ((float) (6.283185307179586d / d6));
                Double.isNaN(d8);
                double d9 = radians + d8;
                double ceil = Math.ceil(d6);
                double d10 = d8;
                float f19 = f18;
                float f20 = f17;
                int i2 = 0;
                while (((double) i2) < ceil) {
                    double cos2 = Math.cos(d9);
                    Double.isNaN(d7);
                    float f21 = (float) (cos2 * d7);
                    double sin2 = Math.sin(d9);
                    Double.isNaN(d7);
                    float f22 = (float) (sin2 * d7);
                    if (floatValue2 != f15) {
                        d5 = d7;
                        double atan2 = (double) ((float) (Math.atan2((double) f19, (double) f20) - 2.858407346410207d));
                        d4 = ceil;
                        d3 = d9;
                        double atan22 = (double) ((float) (Math.atan2((double) f22, (double) f21) - 2.858407346410207d));
                        float f23 = f16 * floatValue2 * 0.25f;
                        this.f15241a.cubicTo(f20 - (((float) Math.cos(atan2)) * f23), f19 - (((float) Math.sin(atan2)) * f23), f21 + (((float) Math.cos(atan22)) * f23), f22 + (f23 * ((float) Math.sin(atan22))), f21, f22);
                    } else {
                        d3 = d9;
                        d4 = ceil;
                        d5 = d7;
                        this.f15241a.lineTo(f21, f22);
                    }
                    Double.isNaN(d10);
                    d9 = d3 + d10;
                    i2++;
                    f20 = f21;
                    f19 = f22;
                    d7 = d5;
                    ceil = d4;
                    f15 = 0.0f;
                }
                PointF pointF = (PointF) this.f15246f.mo9738e();
                this.f15241a.offset(pointF.x, pointF.y);
                this.f15241a.close();
            } else {
                float floatValue4 = ((Float) this.f15245e.mo9738e()).floatValue();
                double floatValue5 = (double) ((Float) this.f15247g.mo9738e()).floatValue();
                Double.isNaN(floatValue5);
                double radians2 = Math.toRadians(floatValue5 - 0.0498046875d);
                double d11 = (double) floatValue4;
                Double.isNaN(d11);
                float f24 = (float) (6.283185307179586d / d11);
                float f25 = f24 / 2.0f;
                float f26 = floatValue4 - ((float) ((int) floatValue4));
                if (f26 != 0.0f) {
                    double d12 = (double) ((1.0f - f26) * f25);
                    Double.isNaN(d12);
                    radians2 += d12;
                }
                float floatValue6 = ((Float) this.f15249i.mo9738e()).floatValue();
                float floatValue7 = ((Float) this.f15248h.mo9738e()).floatValue();
                C4807f fVar = this.f15250j;
                float floatValue8 = fVar != null ? ((Float) fVar.mo9738e()).floatValue() / 100.0f : 0.0f;
                float floatValue9 = ((Float) this.f15251k.mo9738e()).floatValue() / 100.0f;
                if (f26 != 0.0f) {
                    float f27 = ((floatValue6 - floatValue7) * f26) + floatValue7;
                    double d13 = (double) f27;
                    double cos3 = Math.cos(radians2);
                    Double.isNaN(d13);
                    float f28 = f25;
                    float f29 = (float) (d13 * cos3);
                    double sin3 = Math.sin(radians2);
                    Double.isNaN(d13);
                    f3 = (float) (d13 * sin3);
                    this.f15241a.moveTo(f29, f3);
                    double d14 = (double) ((f24 * f26) / 2.0f);
                    Double.isNaN(d14);
                    d = radians2 + d14;
                    f = f27;
                    f2 = f29;
                    f4 = f28;
                } else {
                    float f30 = f25;
                    double d15 = (double) floatValue6;
                    double cos4 = Math.cos(radians2);
                    Double.isNaN(d15);
                    f2 = (float) (cos4 * d15);
                    double sin4 = Math.sin(radians2);
                    Double.isNaN(d15);
                    f3 = (float) (d15 * sin4);
                    this.f15241a.moveTo(f2, f3);
                    f4 = f30;
                    double d16 = (double) f4;
                    Double.isNaN(d16);
                    d = radians2 + d16;
                    f = 0.0f;
                }
                double ceil2 = Math.ceil(d11);
                double d17 = ceil2 + ceil2;
                float f31 = f4;
                float f32 = f3;
                float f33 = f2;
                boolean z2 = false;
                int i3 = 0;
                while (true) {
                    double d18 = (double) i3;
                    if (d18 >= d17) {
                        break;
                    }
                    float f34 = floatValue6;
                    if (true != z2) {
                        z = z2;
                        f5 = floatValue7;
                    } else {
                        z = z2;
                        f5 = f34;
                    }
                    float f35 = (f == 0.0f || d18 != d17 + -2.0d) ? f31 : (f24 * f26) / 2.0f;
                    if (f == 0.0f || d18 != d17 - 4.0d) {
                        f8 = f24;
                        f6 = f35;
                        f7 = f;
                        f9 = f5;
                    } else {
                        f8 = f24;
                        f6 = f35;
                        f9 = f;
                        f7 = f9;
                    }
                    double d19 = (double) f9;
                    double cos5 = Math.cos(d);
                    Double.isNaN(d19);
                    double d20 = d18;
                    float f36 = (float) (d19 * cos5);
                    double sin5 = Math.sin(d);
                    Double.isNaN(d19);
                    float f37 = (float) (d19 * sin5);
                    if (floatValue8 == 0.0f && floatValue9 == 0.0f) {
                        this.f15241a.lineTo(f36, f37);
                        d2 = d;
                        f12 = floatValue9;
                        f11 = floatValue7;
                        f10 = floatValue8;
                        f14 = f6;
                        f13 = f37;
                    } else {
                        float f38 = f32;
                        f12 = floatValue9;
                        f10 = floatValue8;
                        float f39 = f33;
                        f11 = floatValue7;
                        double atan23 = (double) ((float) (Math.atan2((double) f38, (double) f39) - 2.858407346410207d));
                        float cos6 = (float) Math.cos(atan23);
                        float sin6 = (float) Math.sin(atan23);
                        d2 = d;
                        float f40 = f38;
                        f13 = f37;
                        double atan24 = (double) ((float) (Math.atan2((double) f37, (double) f36) - 2.858407346410207d));
                        float cos7 = (float) Math.cos(atan24);
                        float sin7 = (float) Math.sin(atan24);
                        float f41 = true != z ? f12 : f10;
                        float f42 = true != z ? f10 : f12;
                        float f43 = (true != z ? f34 : f11) * f41 * 0.47829f;
                        float f44 = cos6 * f43;
                        float f45 = f43 * sin6;
                        float f46 = f5 * f42 * 0.47829f;
                        float f47 = cos7 * f46;
                        float f48 = f46 * sin7;
                        if (f26 != 0.0f) {
                            if (i3 == 0) {
                                f44 *= f26;
                                f45 *= f26;
                            } else if (d20 == d17 - 4.0d) {
                                f47 *= f26;
                                f48 *= f26;
                            }
                        }
                        this.f15241a.cubicTo(f39 - f44, f40 - f45, f36 + f47, f13 + f48, f36, f13);
                        f14 = f6;
                    }
                    double d21 = (double) f14;
                    Double.isNaN(d21);
                    d = d2 + d21;
                    z2 = !z;
                    i3++;
                    floatValue9 = f12;
                    floatValue7 = f11;
                    floatValue6 = f34;
                    f = f7;
                    f33 = f36;
                    f32 = f13;
                    f24 = f8;
                    floatValue8 = f10;
                }
                PointF pointF2 = (PointF) this.f15246f.mo9738e();
                this.f15241a.offset(pointF2.x, pointF2.y);
                this.f15241a.close();
            }
            this.f15241a.close();
            this.f15252l.mo9721b(this.f15241a);
            this.f15253m = true;
            return this.f15241a;
        }
        throw null;
    }
}
