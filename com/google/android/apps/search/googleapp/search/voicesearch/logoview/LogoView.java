package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a.C138811a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a.C138812b;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a.C138813c;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138825c;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10475c.C138827a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10475c.C138828b;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10475c.C138829c;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10475c.C138830d;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public final class LogoView extends View implements TimeAnimator.TimeListener, C138819af {

    /* renamed from: f */
    public static final /* synthetic */ int f377572f = 0;

    /* renamed from: a */
    public final C138824b f377573a;

    /* renamed from: b */
    public C138833f f377574b;

    /* renamed from: c */
    public int f377575c;

    /* renamed from: d */
    public int f377576d;

    /* renamed from: e */
    public boolean f377577e;

    /* renamed from: g */
    private final TimeAnimator f377578g;

    /* renamed from: h */
    private final C138827a f377579h;

    /* renamed from: i */
    private final C138829c f377580i;

    /* renamed from: j */
    private final AnimatorSet f377581j;

    /* renamed from: k */
    private final Paint f377582k;

    /* renamed from: l */
    private final Paint f377583l;

    /* renamed from: m */
    private float f377584m;

    /* renamed from: n */
    private final C138820ag f377585n;

    /* renamed from: o */
    private boolean f377586o;

    static {
        new C138810a();
        new C138822b();
    }

    public LogoView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public static C138823a m225454a() {
        C138813c cVar = new C138813c(80.0f, 1000.0f);
        C138813c cVar2 = new C138813c(320.0f, 40.0f);
        return new C138823a(cVar, new C138811a(360.0f), new C138813c(80.0f, 160.0f), cVar2, new C138813c(160.0f, 1000.0f), new C138812b(1000.0f), new C138812b(160.0f), new C138812b(160.0f), new C138812b(320.0f));
    }

    /* renamed from: g */
    private final float m225455g() {
        return (float) ((getHeight() - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: h */
    private final float m225456h() {
        return (float) ((getWidth() - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: i */
    private final void m225457i(Canvas canvas, C138830d dVar) {
        this.f377582k.setStyle(Paint.Style.STROKE);
        this.f377582k.setStrokeCap(dVar.f377675g);
        this.f377582k.setStrokeWidth(dVar.f377673e);
        canvas.drawPath(dVar.f377671c, this.f377582k);
        this.f377582k.setStrokeWidth(dVar.f377674f);
        canvas.drawPath(dVar.f377672d, this.f377582k);
    }

    /* renamed from: j */
    private final void m225458j() {
        C138824b bVar = this.f377573a;
        this.f377584m = Math.min(m225456h() / bVar.f377655k, m225455g() / bVar.f377656l);
    }

    /* renamed from: b */
    public final void mo114545b() {
        if (!this.f377578g.isStarted() && this.f377586o) {
            this.f377578g.start();
        }
    }

    /* renamed from: c */
    public final void mo114546c(boolean z) {
        if (this.f377578g != null && this.f377586o != z) {
            this.f377586o = z;
            if (z) {
                if (!(this.f377575c == 255 && this.f377576d == 0)) {
                    C138820ag agVar = this.f377585n;
                    if (agVar.f377621a.isStarted()) {
                        agVar.f377621a.resume();
                    } else {
                        agVar.f377621a.start();
                    }
                }
                this.f377578g.setTimeListener(this);
                return;
            }
            this.f377581j.cancel();
            this.f377578g.setTimeListener((TimeAnimator.TimeListener) null);
            this.f377578g.end();
            this.f377585n.f377621a.pause();
        }
    }

    /* renamed from: d */
    public final void mo114547d(float f, float f2) {
        C138824b bVar = this.f377573a;
        if (f <= 0.0f || f2 <= 0.0f) {
            throw new IllegalArgumentException("Width and height cannot be 0 or below");
        }
        bVar.f377655k = f;
        bVar.f377656l = f2;
        m225458j();
        invalidate();
    }

    /* renamed from: e */
    public final void mo114548e(C138835h hVar) {
        C138820ag agVar = this.f377585n;
        agVar.f377629i.put(2, hVar);
        if (agVar.f377630j == 2) {
            hVar.mo114600a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = false;
        if (isShown() && this.f377577e) {
            z = true;
        }
        mo114546c(z);
        this.f377585n.f377625e = this;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo114546c(false);
        this.f377585n.f377625e = null;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Iterator it;
        Canvas canvas2 = canvas;
        canvas.save();
        float f = 2.0f;
        canvas2.translate(((float) getPaddingLeft()) + (m225456h() / 2.0f), ((float) getPaddingTop()) + (m225455g() / 2.0f));
        if (this.f377576d > 0) {
            Iterator it2 = this.f377573a.iterator();
            while (it2.hasNext()) {
                C138823a aVar = (C138823a) it2.next();
                this.f377582k.setColor(aVar.f377643j);
                this.f377582k.setAlpha(PrivateKeyType.INVALID);
                float f2 = aVar.f377634a.f377589c;
                float f3 = this.f377573a.f377652h.f377657a.f377589c;
                float f4 = aVar.f377635b.f377589c;
                float f5 = aVar.f377637d.f377589c;
                float f6 = aVar.f377638e.f377589c;
                double d = (double) (f3 + f4);
                float cos = (((float) Math.cos(d)) * f2) + f5;
                float sin = (f2 * ((float) Math.sin(d))) + f6;
                if (aVar.mo114582g()) {
                    float f7 = aVar.f377642i.f377589c;
                    this.f377580i.mo114596f();
                    C138824b bVar = this.f377573a;
                    if (aVar == bVar.f377646b) {
                        C138829c cVar = this.f377580i;
                        cVar.mo114595a(cVar.f377671c, C138828b.f377662a, 7.0f, -1.0f, f7);
                        cVar.f377673e = f7 + f7 + 4.0f;
                        cVar.f377675g = Paint.Cap.ROUND;
                    } else if (aVar == bVar.f377647c) {
                        C138829c cVar2 = this.f377580i;
                        cVar2.mo114595a(cVar2.f377671c, C138828b.f377663b, 14.0f, -1.0f, f7);
                        cVar2.f377673e = (-2.0f * f7) + 4.0f;
                        cVar2.f377675g = f7 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    } else if (aVar == bVar.f377648d) {
                        C138829c cVar3 = this.f377580i;
                        cVar3.mo114595a(cVar3.f377671c, C138828b.f377664c, 5.0f, -1.0f, f7);
                        cVar3.f377673e = (-2.0f * f7) + 4.0f;
                        cVar3.f377675g = f7 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    } else if (aVar == bVar.f377649e) {
                        C138829c cVar4 = this.f377580i;
                        cVar4.mo114595a(cVar4.f377671c, C138828b.f377665d, 4.0f, 10.0f, f7);
                        cVar4.f377673e = (-2.0f * f7) + 4.0f;
                        cVar4.f377675g = f7 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    }
                    this.f377580i.mo114597g(cos, sin, this.f377584m);
                    m225457i(canvas2, this.f377580i);
                } else {
                    float f8 = aVar.f377641h.f377589c;
                    if (f8 > 0.001f) {
                        float f9 = aVar.f377640g.f377589c;
                        this.f377579h.mo114596f();
                        C138824b bVar2 = this.f377573a;
                        if (aVar == bVar2.f377646b) {
                            C138827a aVar2 = this.f377579h;
                            float b = C138827a.m225522b(f8);
                            float a = C138827a.m225521a(f9, f8);
                            float f10 = ((0.66999996f * f8) + 1.0f) * a;
                            float e = C138827a.m225524e(f10, f8);
                            float f11 = e + (((e * 1.08f) - e) * f8);
                            float f12 = (a - f10) + (((e - f11) / f) * f8);
                            aVar2.f377673e = f11;
                            aVar2.f377675g = Paint.Cap.BUTT;
                            if (b > 0.0f) {
                                C138827a.m225523c(aVar2.f377669a, f10, 0.97f);
                                aVar2.f377669a.offset(0.0f, f12);
                                aVar2.f377671c.addArc(aVar2.f377669a, 88.0f, 184.0f);
                                C138827a.m225523c(aVar2.f377669a, f10, 1.0f);
                                aVar2.f377669a.offset(0.0f, f12);
                                aVar2.f377671c.addArc(aVar2.f377669a, 88.0f, 184.0f);
                                float f13 = f10 + f12;
                                aVar2.f377671c.moveTo(0.0f, f13);
                                aVar2.f377671c.cubicTo(f10 * 0.83f, f13, f10 * 0.99f, (0.3f * f10) + f12, f10 * 0.93f, (-0.05f * f10) + f12);
                                C138827a.m225523c(aVar2.f377669a, f10, 1.0f);
                                aVar2.f377669a.offset(0.0f, f12);
                                aVar2.f377671c.addArc(aVar2.f377669a, 270.0f, 90.0f - (46.0f * b));
                                float f14 = f10 * 1.08f;
                                float f15 = f12 + 0.42f;
                                aVar2.f377671c.moveTo(f14 - ((f10 * 1.06f) * b), f15);
                                aVar2.f377671c.lineTo(f14, f15);
                            } else {
                                aVar2.f377671c.addCircle(0.0f, f12, f10, Path.Direction.CW);
                            }
                        } else if (aVar == bVar2.f377647c) {
                            this.f377579h.mo114594d(f8, f9);
                        } else if (aVar == bVar2.f377648d) {
                            this.f377579h.mo114594d(f8, f9);
                        } else if (aVar == bVar2.f377650f) {
                            C138827a aVar3 = this.f377579h;
                            float b2 = C138827a.m225522b(f8);
                            float a2 = C138827a.m225521a(f9, f8);
                            float e2 = C138827a.m225524e(a2, f8);
                            aVar3.f377675g = Paint.Cap.BUTT;
                            aVar3.f377673e = e2;
                            if (b2 > 0.0f) {
                                aVar3.f377673e = e2 / 2.0f;
                                C138827a.m225523c(aVar3.f377669a, a2, 0.92f);
                                float f16 = e2 / 4.0f;
                                aVar3.f377669a.inset(f16, f16);
                                aVar3.f377671c.addOval(aVar3.f377669a, Path.Direction.CW);
                                float f17 = (e2 * -2.0f) / 4.0f;
                                aVar3.f377669a.inset(f17 * 0.9f, f17);
                                aVar3.f377669a.offset(-0.4f, 0.0f);
                                aVar3.f377671c.addOval(aVar3.f377669a, Path.Direction.CW);
                                aVar3.f377669a.offset(0.5f, 0.0f);
                                aVar3.f377671c.addArc(aVar3.f377669a, 88.0f, 184.0f);
                                float min = Math.min(b2 / 0.1f, 1.0f);
                                float f18 = (b2 - 44.8f) / 0.9f;
                                aVar3.f377674f = e2 * 1.05f;
                                if (min > 0.0f) {
                                    float f19 = 0.9f * a2;
                                    aVar3.f377672d.moveTo(f19, -1.17f * a2 * min);
                                    aVar3.f377672d.lineTo(f19, 1.21f * a2 * min);
                                }
                                if (f18 > 0.0f) {
                                    C138827a.m225523c(aVar3.f377669a, a2, 0.925f);
                                    aVar3.f377669a.offset(-0.14f, a2 * 1.15f);
                                    aVar3.f377672d.addArc(aVar3.f377669a, -2.0f, f18 * 158.0f);
                                }
                            } else {
                                aVar3.f377671c.addCircle(0.0f, 0.0f, a2, Path.Direction.CW);
                            }
                        } else if (aVar == bVar2.f377649e) {
                            C138827a aVar4 = this.f377579h;
                            aVar4.f377673e = f9 * 4.0f * ((-0.35000002f * f8) + 1.0f);
                            if (f8 > 0.66f) {
                                aVar4.f377675g = Paint.Cap.SQUARE;
                            } else {
                                aVar4.f377675g = Paint.Cap.ROUND;
                            }
                            aVar4.f377671c.moveTo(0.0f, -10.46f * f8);
                            aVar4.f377671c.lineTo(0.0f, 4.19f * f8);
                        } else if (aVar == bVar2.f377651g) {
                            C138827a aVar5 = this.f377579h;
                            float b3 = C138827a.m225522b(f8);
                            float a3 = C138827a.m225521a(f9, f8);
                            aVar5.f377673e = C138827a.m225524e(a3, f8);
                            aVar5.f377675g = Paint.Cap.BUTT;
                            if (b3 > 0.0f) {
                                C138827a.m225523c(aVar5.f377669a, a3, 0.9f);
                                aVar5.f377671c.addArc(aVar5.f377669a, 88.0f, 184.0f);
                                C138827a.m225523c(aVar5.f377669a, a3, 0.94f);
                                aVar5.f377671c.addArc(aVar5.f377669a, 88.0f, 184.0f);
                                C138827a.m225523c(aVar5.f377669a, a3, 1.05f);
                                aVar5.f377671c.addArc(aVar5.f377669a, 33.0f, 57.0f);
                                float f20 = 393.0f - (b3 * 48.0f);
                                C138827a.m225523c(aVar5.f377669a, a3, 0.89f);
                                aVar5.f377671c.addArc(aVar5.f377669a, 270.0f, -270.0f + f20);
                                double radians = Math.toRadians((double) ((-173.0f + f20) - 0.40625f));
                                double radians2 = Math.toRadians((double) (f20 - 0.40625f));
                                double d2 = (double) (a3 * 1.15f);
                                double d3 = (double) ((float) radians);
                                double cos2 = Math.cos(d3);
                                double sin2 = Math.sin(d3);
                                double d4 = (double) ((float) radians2);
                                double cos3 = Math.cos(d4);
                                double sin3 = Math.sin(d4);
                                Path path = aVar5.f377672d;
                                Double.isNaN(d2);
                                it = it2;
                                Double.isNaN(d2);
                                path.moveTo((float) (d2 * cos2), (float) (sin2 * d2));
                                Path path2 = aVar5.f377672d;
                                Double.isNaN(d2);
                                Double.isNaN(d2);
                                path2.lineTo((float) (d2 * cos3), (float) (d2 * sin3));
                                aVar5.f377674f = aVar5.f377673e * 0.85f;
                            } else {
                                it = it2;
                                aVar5.f377671c.addCircle(0.0f, 0.0f, a3, Path.Direction.CW);
                            }
                            this.f377579h.mo114597g(cos, sin + (f8 * 0.6f), this.f377584m);
                            m225457i(canvas2, this.f377579h);
                            it2 = it;
                            f = 2.0f;
                        }
                        it = it2;
                        this.f377579h.mo114597g(cos, sin + (f8 * 0.6f), this.f377584m);
                        m225457i(canvas2, this.f377579h);
                        it2 = it;
                        f = 2.0f;
                    } else {
                        Iterator it3 = it2;
                        float f21 = aVar.f377639f.f377589c;
                        if (f21 < -0.001f || f21 > 0.001f) {
                            f = 2.0f;
                            this.f377582k.setStrokeWidth(aVar.f377636c.f377589c * this.f377584m);
                            this.f377582k.setStyle(Paint.Style.STROKE);
                            this.f377582k.setStrokeCap(Paint.Cap.ROUND);
                            float f22 = aVar.f377639f.f377589c;
                            float f23 = this.f377584m;
                            float f24 = cos * f23;
                            canvas.drawLine(f24, (sin - f22) * f23, f24, (sin + f22) * f23, this.f377582k);
                        } else {
                            float f25 = aVar.f377636c.f377589c;
                            float f26 = aVar.f377640g.f377589c;
                            this.f377582k.setStyle(Paint.Style.FILL);
                            float f27 = this.f377584m;
                            f = 2.0f;
                            canvas2.drawCircle(cos * f27, sin * f27, ((f25 * f26) / 2.0f) * f27, this.f377582k);
                        }
                        it2 = it3;
                    }
                }
            }
            setAlpha(this.f377573a.f377653i.f377589c);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m225458j();
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        for (long min = Math.min(100, j2); min > 0; min -= 10) {
            C138824b bVar = this.f377573a;
            long min2 = Math.min(min, 10);
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C138823a aVar = (C138823a) it.next();
                aVar.f377634a.mo114563f(min2);
                aVar.f377635b.mo114563f(min2);
                aVar.f377636c.mo114563f(min2);
                aVar.f377637d.mo114563f(min2);
                aVar.f377638e.mo114563f(min2);
                aVar.f377639f.mo114563f(min2);
                aVar.f377641h.mo114563f(min2);
                aVar.f377642i.mo114563f(min2);
                aVar.f377640g.mo114563f(min2);
            }
            C138825c cVar = bVar.f377652h;
            if (cVar.f377659c) {
                cVar.f377658b.mo114563f(min2);
                cVar.f377657a.mo114562e(cVar.f377657a.f377589c + (cVar.f377658b.f377589c * (Math.min((float) min2, 50.0f) / 1000.0f)));
            } else {
                cVar.f377657a.mo114563f(min2);
            }
            bVar.f377653i.mo114563f(min2);
        }
        C138824b bVar2 = this.f377573a;
        Iterator it2 = bVar2.iterator();
        while (true) {
            if (it2.hasNext()) {
                C138823a aVar2 = (C138823a) it2.next();
                if (aVar2.f377634a.f377591e) {
                    if (aVar2.f377635b.f377591e) {
                        if (aVar2.f377636c.f377591e) {
                            if (aVar2.f377637d.f377591e) {
                                if (aVar2.f377638e.f377591e) {
                                    if (aVar2.f377639f.f377591e) {
                                        if (aVar2.f377641h.f377591e) {
                                            if (aVar2.f377642i.f377591e) {
                                                if (!aVar2.f377640g.f377591e) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                C138825c cVar2 = bVar2.f377652h;
                if (!cVar2.f377659c && cVar2.f377657a.f377591e && bVar2.f377653i.f377591e) {
                    this.f377578g.end();
                    if (this.f377585n.f377630j == 6 && this.f377575c != 255) {
                        this.f377581j.start();
                    }
                }
            }
        }
        this.f377581j.cancel();
        this.f377576d = PrivateKeyType.INVALID;
        this.f377575c = 0;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        boolean z = false;
        if (isShown() && this.f377577e) {
            z = true;
        }
        mo114546c(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f377575c = 0;
        this.f377576d = PrivateKeyType.INVALID;
        this.f377586o = true;
        this.f377577e = true;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f377581j = animatorSet;
        this.f377579h = new C138827a();
        this.f377580i = new C138829c();
        Paint paint = new Paint();
        this.f377582k = paint;
        Paint paint2 = new Paint();
        this.f377583l = paint2;
        C138824b bVar = r6;
        C138824b bVar2 = new C138824b(context, m225454a(), m225454a(), m225454a(), m225454a(), m225454a(), m225454a(), new C138825c(new C138811a(80.0f), new C138812b(80.0f)), new C138812b(1000.0f));
        this.f377573a = bVar;
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f377578g = timeAnimator;
        this.f377585n = new C138820ag(bVar, new TimeAnimator(), this, new C138821ah());
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, PrivateKeyType.INVALID});
        ofInt.setDuration(100);
        ofInt.addUpdateListener(new C138826c(this, ofInt));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{PrivateKeyType.INVALID, 0});
        ofInt2.setDuration(100);
        ofInt2.addUpdateListener(new C138831d(this, ofInt2));
        animatorSet.playSequentially(new Animator[]{ofInt, ofInt2});
        animatorSet.addListener(new C138832e());
        paint.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        timeAnimator.setTimeListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0106, code lost:
        if (r0 != com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138821ah.m225502b(r3)) goto L_0x0108;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114549f(int r14) {
        /*
            r13 = this;
            boolean r0 = r13.f377586o
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ag r2 = r13.f377585n
            int r3 = r2.f377630j
            r4 = 0
            if (r14 != r3) goto L_0x0011
            int r3 = r2.f377631k
            if (r3 != 0) goto L_0x0011
            goto L_0x010b
        L_0x0011:
            int r3 = r2.f377631k
            if (r14 == r3) goto L_0x010b
            r2.f377631k = r14
            java.util.ArrayDeque r3 = r2.f377624d
            r3.clear()
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ah r3 = r2.f377623c
            int r3 = r2.f377630j
            int r3 = com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138821ah.m225504d(r3)
            int r5 = r2.f377631k
            int r5 = com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138821ah.m225504d(r5)
            if (r3 == r5) goto L_0x002e
            r6 = 1
            goto L_0x002f
        L_0x002e:
            r6 = 0
        L_0x002f:
            if (r6 == 0) goto L_0x00ab
            java.util.Deque r7 = r2.mo114570a(r3)
            java.util.Deque r5 = r2.mo114570a(r5)
        L_0x0039:
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x005c
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L_0x005c
            java.lang.Object r8 = r7.getFirst()
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r9 = r5.getFirst()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x005c
            r7.removeFirst()
            r5.removeFirst()
            goto L_0x0039
        L_0x005c:
            java.util.Iterator r7 = r7.descendingIterator()
        L_0x0060:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x007c
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.util.ArrayDeque r9 = r2.f377624d
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ah r10 = r2.f377623c
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ad r8 = com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138821ah.m225502b(r8)
            r9.addLast(r8)
            goto L_0x0060
        L_0x007c:
            java.util.Iterator r5 = r5.iterator()
        L_0x0080:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x009c
            java.lang.Object r7 = r5.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.util.ArrayDeque r8 = r2.f377624d
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ah r9 = r2.f377623c
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ad r7 = com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138821ah.m225501a(r7)
            r8.addLast(r7)
            goto L_0x0080
        L_0x009c:
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ad r5 = r2.f377628h
            java.util.ArrayDeque r7 = r2.f377624d
            java.lang.Object r7 = r7.getFirst()
            if (r5 != r7) goto L_0x00ab
            java.util.ArrayDeque r5 = r2.f377624d
            r5.pollFirst()
        L_0x00ab:
            java.util.ArrayDeque r5 = r2.f377624d
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ah r7 = r2.f377623c
            int r7 = r2.f377631k
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ad r7 = com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138821ah.m225503c(r7)
            r5.addLast(r7)
            if (r0 == 0) goto L_0x00ea
        L_0x00ba:
            java.util.ArrayDeque r0 = r2.f377624d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e7
            java.util.ArrayDeque r0 = r2.f377624d
            java.lang.Object r0 = r0.removeFirst()
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ad r0 = (com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138817ad) r0
            r2.mo114571b(r0)
            r5 = 0
            r2.f377627g = r5
            r2.f377626f = r5
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ad r7 = r2.f377628h
            r8 = 0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.b.b r12 = r2.f377622b
            r7.mo114568c(r8, r10, r12)
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.b.b r0 = r2.f377622b
            r0.mo114587d()
            goto L_0x00ba
        L_0x00e7:
            r2.f377632l = r4
            goto L_0x010b
        L_0x00ea:
            android.animation.TimeAnimator r0 = r2.f377621a
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L_0x0108
            if (r6 == 0) goto L_0x0108
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ad r0 = r2.f377628h
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ah r5 = r2.f377623c
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ad r5 = com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138821ah.m225501a(r3)
            if (r0 == r5) goto L_0x010b
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ad r0 = r2.f377628h
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ah r5 = r2.f377623c
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ad r3 = com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138821ah.m225502b(r3)
            if (r0 == r3) goto L_0x010b
        L_0x0108:
            r2.mo114572c()
        L_0x010b:
            boolean r0 = r13.f377586o
            if (r0 != 0) goto L_0x0116
            com.google.android.apps.search.googleapp.search.voicesearch.logoview.ag r0 = r13.f377585n
            android.animation.TimeAnimator r0 = r0.f377621a
            r0.pause()
        L_0x0116:
            r0 = 8
            if (r14 != r0) goto L_0x011e
            r13.setClickable(r4)
            return
        L_0x011e:
            r13.setClickable(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.logoview.LogoView.mo114549f(int):void");
    }
}
