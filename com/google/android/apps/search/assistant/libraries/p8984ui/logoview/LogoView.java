package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

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
import androidx.core.graphics.C1924a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a.C119442a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a.C119443b;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a.C119444c;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119464c;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8987c.C119466a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8987c.C119467b;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8987c.C119468c;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8987c.C119469d;
import com.google.android.apps.search.assistant.surfaces.roti.home.C126811bt;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.LogoView */
/* compiled from: PG */
public final class LogoView extends View implements TimeAnimator.TimeListener, C119458an {

    /* renamed from: g */
    public static final /* synthetic */ int f332958g = 0;

    /* renamed from: a */
    public final C119463b f332959a;

    /* renamed from: b */
    public int f332960b;

    /* renamed from: c */
    public int f332961c;

    /* renamed from: d */
    public final C119459ao f332962d;

    /* renamed from: e */
    public int f332963e;

    /* renamed from: f */
    public C126811bt f332964f;

    /* renamed from: h */
    private final TimeAnimator f332965h;

    /* renamed from: i */
    private final C119466a f332966i;

    /* renamed from: j */
    private final C119468c f332967j;

    /* renamed from: k */
    private final AnimatorSet f332968k;

    /* renamed from: l */
    private final Paint f332969l;

    /* renamed from: m */
    private final Paint f332970m;

    /* renamed from: n */
    private float f332971n;

    /* renamed from: o */
    private boolean f332972o;

    static {
        new C119441a();
        new C119461b();
    }

    public LogoView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public static C119462a m198175a() {
        C119444c cVar = new C119444c(80.0f, 1000.0f);
        C119444c cVar2 = new C119444c(320.0f, 40.0f);
        return new C119462a(cVar, new C119442a(360.0f), new C119444c(80.0f, 160.0f), cVar2, new C119444c(160.0f, 1000.0f), new C119443b(1000.0f), new C119443b(160.0f), new C119443b(160.0f), new C119443b(320.0f), new C119443b(80.0f));
    }

    /* renamed from: g */
    private final float m198176g() {
        return (float) ((getHeight() - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: h */
    private final float m198177h() {
        return (float) ((getWidth() - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: i */
    private final void m198178i(Canvas canvas, C119469d dVar) {
        this.f332969l.setStyle(Paint.Style.STROKE);
        this.f332969l.setStrokeCap(dVar.f333074g);
        this.f332969l.setStrokeWidth(dVar.f333072e);
        canvas.drawPath(dVar.f333070c, this.f332969l);
        this.f332969l.setStrokeWidth(dVar.f333073f);
        canvas.drawPath(dVar.f333071d, this.f332969l);
    }

    /* renamed from: j */
    private final void m198179j() {
        C119463b bVar = this.f332959a;
        this.f332971n = Math.min(m198177h() / bVar.f333054k, m198176g() / bVar.f333055l);
    }

    /* renamed from: b */
    public final void mo104342b() {
        if (!this.f332965h.isStarted() && this.f332972o) {
            this.f332965h.start();
        }
    }

    /* renamed from: c */
    public final void mo104343c(boolean z) {
        if (this.f332965h != null && this.f332972o != z) {
            this.f332972o = z;
            if (z) {
                if (!(this.f332960b == 255 && this.f332961c == 0)) {
                    this.f332962d.mo104368b();
                }
                this.f332965h.setTimeListener(this);
                return;
            }
            this.f332968k.cancel();
            this.f332965h.setTimeListener((TimeAnimator.TimeListener) null);
            this.f332965h.end();
            this.f332962d.f333018a.pause();
        }
    }

    /* renamed from: d */
    public final void mo104344d(float f, float f2) {
        C119463b bVar = this.f332959a;
        if (f <= 0.0f || f2 <= 0.0f) {
            throw new IllegalArgumentException("Width and height cannot be 0 or below");
        }
        bVar.f333054k = f;
        bVar.f333055l = f2;
        m198179j();
        invalidate();
    }

    /* renamed from: f */
    public final void mo104346f(C119473g gVar) {
        C119459ao aoVar = this.f332962d;
        aoVar.f333026i.put(2, gVar);
        if (aoVar.f333027j == 2 && gVar != null) {
            gVar.mo104399a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo104343c(isShown());
        this.f332962d.f333022e = this;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo104343c(false);
        this.f332962d.f333022e = null;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Iterator it;
        Canvas canvas2 = canvas;
        canvas.save();
        float f = 2.0f;
        canvas2.translate(((float) getPaddingLeft()) + (m198177h() / 2.0f), ((float) getPaddingTop()) + (m198176g() / 2.0f));
        Iterator it2 = this.f332959a.iterator();
        while (it2.hasNext()) {
            C119462a aVar = (C119462a) it2.next();
            Paint paint = this.f332969l;
            float f2 = aVar.f333040j.f332975c;
            paint.setColor(f2 > 0.999f ? aVar.f333041k : f2 < 0.001f ? aVar.f333042l : C1924a.m5186e(aVar.f333042l, aVar.f333041k, f2));
            this.f332969l.setAlpha(PrivateKeyType.INVALID);
            float f3 = aVar.f333031a.f332975c;
            float f4 = this.f332959a.f333051h.f333056a.f332975c;
            float f5 = aVar.f333032b.f332975c;
            float f6 = aVar.f333034d.f332975c;
            float f7 = aVar.f333035e.f332975c;
            double d = (double) (f4 + f5);
            float cos = (((float) Math.cos(d)) * f3) + f6;
            float sin = (f3 * ((float) Math.sin(d))) + f7;
            if (aVar.mo104379f()) {
                float f8 = aVar.f333039i.f332975c;
                this.f332967j.mo104395f();
                C119463b bVar = this.f332959a;
                if (aVar == bVar.f333045b) {
                    C119468c cVar = this.f332967j;
                    cVar.mo104394a(cVar.f333070c, C119467b.f333061a, 7.0f, -1.0f, f8);
                    cVar.f333072e = f8 + f8 + 4.0f;
                    cVar.f333074g = Paint.Cap.ROUND;
                } else if (aVar == bVar.f333046c) {
                    C119468c cVar2 = this.f332967j;
                    cVar2.mo104394a(cVar2.f333070c, C119467b.f333062b, 14.0f, -1.0f, f8);
                    cVar2.f333072e = (-2.0f * f8) + 4.0f;
                    cVar2.f333074g = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                } else if (aVar == bVar.f333047d) {
                    C119468c cVar3 = this.f332967j;
                    cVar3.mo104394a(cVar3.f333070c, C119467b.f333063c, 5.0f, -1.0f, f8);
                    cVar3.f333072e = (-2.0f * f8) + 4.0f;
                    cVar3.f333074g = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                } else if (aVar == bVar.f333048e) {
                    C119468c cVar4 = this.f332967j;
                    cVar4.mo104394a(cVar4.f333070c, C119467b.f333064d, 4.0f, 10.0f, f8);
                    cVar4.f333072e = (-2.0f * f8) + 4.0f;
                    cVar4.f333074g = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                }
                this.f332967j.mo104396g(cos, sin, this.f332971n);
                m198178i(canvas2, this.f332967j);
            } else {
                float f9 = aVar.f333038h.f332975c;
                if (f9 > 0.001f) {
                    float f10 = aVar.f333037g.f332975c;
                    this.f332966i.mo104395f();
                    C119463b bVar2 = this.f332959a;
                    if (aVar == bVar2.f333045b) {
                        C119466a aVar2 = this.f332966i;
                        float b = C119466a.m198273b(f9);
                        float a = C119466a.m198272a(f10, f9);
                        float f11 = ((0.66999996f * f9) + 1.0f) * a;
                        float e = C119466a.m198275e(f11, f9);
                        float f12 = e + (((e * 1.08f) - e) * f9);
                        float f13 = (a - f11) + (((e - f12) / f) * f9);
                        aVar2.f333072e = f12;
                        aVar2.f333074g = Paint.Cap.BUTT;
                        if (b > 0.0f) {
                            C119466a.m198274c(aVar2.f333068a, f11, 0.97f);
                            aVar2.f333068a.offset(0.0f, f13);
                            aVar2.f333070c.addArc(aVar2.f333068a, 88.0f, 184.0f);
                            C119466a.m198274c(aVar2.f333068a, f11, 1.0f);
                            aVar2.f333068a.offset(0.0f, f13);
                            aVar2.f333070c.addArc(aVar2.f333068a, 88.0f, 184.0f);
                            float f14 = f11 + f13;
                            aVar2.f333070c.moveTo(0.0f, f14);
                            aVar2.f333070c.cubicTo(f11 * 0.83f, f14, f11 * 0.99f, (0.3f * f11) + f13, f11 * 0.93f, (-0.05f * f11) + f13);
                            C119466a.m198274c(aVar2.f333068a, f11, 1.0f);
                            aVar2.f333068a.offset(0.0f, f13);
                            aVar2.f333070c.addArc(aVar2.f333068a, 270.0f, 90.0f - (46.0f * b));
                            float f15 = f11 * 1.08f;
                            float f16 = f13 + 0.42f;
                            aVar2.f333070c.moveTo(f15 - ((f11 * 1.06f) * b), f16);
                            aVar2.f333070c.lineTo(f15, f16);
                        } else {
                            aVar2.f333070c.addCircle(0.0f, f13, f11, Path.Direction.CW);
                        }
                    } else if (aVar == bVar2.f333046c) {
                        this.f332966i.mo104393d(f9, f10);
                    } else if (aVar == bVar2.f333047d) {
                        this.f332966i.mo104393d(f9, f10);
                    } else if (aVar == bVar2.f333049f) {
                        C119466a aVar3 = this.f332966i;
                        float b2 = C119466a.m198273b(f9);
                        float a2 = C119466a.m198272a(f10, f9);
                        float e2 = C119466a.m198275e(a2, f9);
                        aVar3.f333074g = Paint.Cap.BUTT;
                        aVar3.f333072e = e2;
                        if (b2 > 0.0f) {
                            aVar3.f333072e = e2 / 2.0f;
                            C119466a.m198274c(aVar3.f333068a, a2, 0.92f);
                            float f17 = e2 / 4.0f;
                            aVar3.f333068a.inset(f17, f17);
                            aVar3.f333070c.addOval(aVar3.f333068a, Path.Direction.CW);
                            float f18 = (e2 * -2.0f) / 4.0f;
                            aVar3.f333068a.inset(f18 * 0.9f, f18);
                            aVar3.f333068a.offset(-0.4f, 0.0f);
                            aVar3.f333070c.addOval(aVar3.f333068a, Path.Direction.CW);
                            aVar3.f333068a.offset(0.5f, 0.0f);
                            aVar3.f333070c.addArc(aVar3.f333068a, 88.0f, 184.0f);
                            float min = Math.min(b2 / 0.1f, 1.0f);
                            float f19 = (b2 - 44.8f) / 0.9f;
                            aVar3.f333073f = e2 * 1.05f;
                            if (min > 0.0f) {
                                float f20 = 0.9f * a2;
                                aVar3.f333071d.moveTo(f20, -1.17f * a2 * min);
                                aVar3.f333071d.lineTo(f20, 1.21f * a2 * min);
                            }
                            if (f19 > 0.0f) {
                                C119466a.m198274c(aVar3.f333068a, a2, 0.925f);
                                aVar3.f333068a.offset(-0.14f, a2 * 1.15f);
                                aVar3.f333071d.addArc(aVar3.f333068a, -2.0f, f19 * 158.0f);
                            }
                        } else {
                            aVar3.f333070c.addCircle(0.0f, 0.0f, a2, Path.Direction.CW);
                        }
                    } else if (aVar == bVar2.f333048e) {
                        C119466a aVar4 = this.f332966i;
                        aVar4.f333072e = f10 * 4.0f * ((-0.35000002f * f9) + 1.0f);
                        if (f9 > 0.66f) {
                            aVar4.f333074g = Paint.Cap.SQUARE;
                        } else {
                            aVar4.f333074g = Paint.Cap.ROUND;
                        }
                        aVar4.f333070c.moveTo(0.0f, -10.46f * f9);
                        aVar4.f333070c.lineTo(0.0f, 4.19f * f9);
                    } else if (aVar == bVar2.f333050g) {
                        C119466a aVar5 = this.f332966i;
                        float b3 = C119466a.m198273b(f9);
                        float a3 = C119466a.m198272a(f10, f9);
                        aVar5.f333072e = C119466a.m198275e(a3, f9);
                        aVar5.f333074g = Paint.Cap.BUTT;
                        if (b3 > 0.0f) {
                            C119466a.m198274c(aVar5.f333068a, a3, 0.9f);
                            aVar5.f333070c.addArc(aVar5.f333068a, 88.0f, 184.0f);
                            C119466a.m198274c(aVar5.f333068a, a3, 0.94f);
                            aVar5.f333070c.addArc(aVar5.f333068a, 88.0f, 184.0f);
                            C119466a.m198274c(aVar5.f333068a, a3, 1.05f);
                            aVar5.f333070c.addArc(aVar5.f333068a, 33.0f, 57.0f);
                            float f21 = 393.0f - (b3 * 48.0f);
                            C119466a.m198274c(aVar5.f333068a, a3, 0.89f);
                            aVar5.f333070c.addArc(aVar5.f333068a, 270.0f, -270.0f + f21);
                            double radians = Math.toRadians((double) ((-173.0f + f21) - 0.40625f));
                            double radians2 = Math.toRadians((double) (f21 - 0.40625f));
                            double d2 = (double) (a3 * 1.15f);
                            double d3 = (double) ((float) radians);
                            double cos2 = Math.cos(d3);
                            double sin2 = Math.sin(d3);
                            double d4 = (double) ((float) radians2);
                            double cos3 = Math.cos(d4);
                            double sin3 = Math.sin(d4);
                            Path path = aVar5.f333071d;
                            Double.isNaN(d2);
                            it = it2;
                            Double.isNaN(d2);
                            path.moveTo((float) (d2 * cos2), (float) (sin2 * d2));
                            Path path2 = aVar5.f333071d;
                            Double.isNaN(d2);
                            Double.isNaN(d2);
                            path2.lineTo((float) (d2 * cos3), (float) (d2 * sin3));
                            aVar5.f333073f = aVar5.f333072e * 0.85f;
                        } else {
                            it = it2;
                            aVar5.f333070c.addCircle(0.0f, 0.0f, a3, Path.Direction.CW);
                        }
                        this.f332966i.mo104396g(cos, sin + (f9 * 0.6f), this.f332971n);
                        m198178i(canvas2, this.f332966i);
                        it2 = it;
                        f = 2.0f;
                    }
                    it = it2;
                    this.f332966i.mo104396g(cos, sin + (f9 * 0.6f), this.f332971n);
                    m198178i(canvas2, this.f332966i);
                    it2 = it;
                    f = 2.0f;
                } else {
                    Iterator it3 = it2;
                    float f22 = aVar.f333036f.f332975c;
                    if (f22 < -0.001f || f22 > 0.001f) {
                        f = 2.0f;
                        this.f332969l.setStrokeWidth(aVar.f333033c.f332975c * this.f332971n);
                        this.f332969l.setStyle(Paint.Style.STROKE);
                        this.f332969l.setStrokeCap(Paint.Cap.ROUND);
                        float f23 = aVar.f333036f.f332975c;
                        float f24 = this.f332971n;
                        float f25 = cos * f24;
                        canvas.drawLine(f25, (sin - f23) * f24, f25, (sin + f23) * f24, this.f332969l);
                    } else {
                        float f26 = aVar.f333033c.f332975c;
                        float f27 = aVar.f333037g.f332975c;
                        this.f332969l.setStyle(Paint.Style.FILL);
                        float f28 = this.f332971n;
                        f = 2.0f;
                        canvas2.drawCircle(cos * f28, sin * f28, ((f26 * f27) / 2.0f) * f28, this.f332969l);
                    }
                    it2 = it3;
                }
            }
        }
        setAlpha(this.f332959a.f333052i.f332975c);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m198179j();
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        for (long min = Math.min(100, j2); min > 0; min -= 10) {
            C119463b bVar = this.f332959a;
            long min2 = Math.min(min, 10);
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C119462a aVar = (C119462a) it.next();
                aVar.f333031a.mo104360f(min2);
                aVar.f333032b.mo104360f(min2);
                aVar.f333033c.mo104360f(min2);
                aVar.f333034d.mo104360f(min2);
                aVar.f333035e.mo104360f(min2);
                aVar.f333036f.mo104360f(min2);
                aVar.f333038h.mo104360f(min2);
                aVar.f333039i.mo104360f(min2);
                aVar.f333037g.mo104360f(min2);
                aVar.f333040j.mo104360f(min2);
            }
            C119464c cVar = bVar.f333051h;
            if (cVar.f333058c) {
                cVar.f333057b.mo104360f(min2);
                cVar.f333056a.mo104359e(cVar.f333056a.f332975c + (cVar.f333057b.f332975c * (Math.min((float) min2, 50.0f) / 1000.0f)));
            } else {
                cVar.f333056a.mo104360f(min2);
            }
            bVar.f333052i.mo104360f(min2);
        }
        C119463b bVar2 = this.f332959a;
        Iterator it2 = bVar2.iterator();
        while (true) {
            if (it2.hasNext()) {
                C119462a aVar2 = (C119462a) it2.next();
                if (aVar2.f333031a.f332977e) {
                    if (aVar2.f333032b.f332977e) {
                        if (aVar2.f333033c.f332977e) {
                            if (aVar2.f333034d.f332977e) {
                                if (aVar2.f333035e.f332977e) {
                                    if (aVar2.f333036f.f332977e) {
                                        if (aVar2.f333038h.f332977e) {
                                            if (aVar2.f333039i.f332977e) {
                                                if (aVar2.f333037g.f332977e) {
                                                    if (!aVar2.f333040j.f332977e) {
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
                    break;
                }
            } else {
                C119464c cVar2 = bVar2.f333051h;
                if (!cVar2.f333058c && cVar2.f333056a.f332977e && bVar2.f333052i.f332977e) {
                    this.f332965h.end();
                    if (this.f332962d.f333027j == 6 && this.f332960b != 255) {
                        this.f332968k.start();
                    }
                }
            }
        }
        this.f332968k.cancel();
        this.f332961c = PrivateKeyType.INVALID;
        this.f332960b = 0;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        mo104343c(isShown());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f332960b = 0;
        this.f332961c = PrivateKeyType.INVALID;
        this.f332972o = true;
        this.f332963e = 0;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f332968k = animatorSet;
        this.f332966i = new C119466a();
        this.f332967j = new C119468c();
        Paint paint = new Paint();
        this.f332969l = paint;
        Paint paint2 = new Paint();
        this.f332970m = paint2;
        C119463b bVar = r6;
        C119463b bVar2 = new C119463b(context, m198175a(), m198175a(), m198175a(), m198175a(), m198175a(), m198175a(), new C119464c(new C119442a(80.0f), new C119443b(80.0f)), new C119443b(1000.0f));
        this.f332959a = bVar;
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f332965h = timeAnimator;
        this.f332962d = new C119459ao(bVar, new TimeAnimator(), this, new C119460ap());
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, PrivateKeyType.INVALID});
        ofInt.setDuration(100);
        ofInt.addUpdateListener(new C119465c(this, ofInt));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{PrivateKeyType.INVALID, 0});
        ofInt2.setDuration(100);
        ofInt2.addUpdateListener(new C119470d(this, ofInt2));
        animatorSet.playSequentially(new Animator[]{ofInt, ofInt2});
        animatorSet.addListener(new C119471e());
        paint.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        timeAnimator.setTimeListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0110, code lost:
        if (r0 != com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119460ap.m198252b(r13)) goto L_0x0112;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104345e(int r13, boolean r14) {
        /*
            r12 = this;
            r12.f332963e = r13
            boolean r0 = r12.f332972o
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000d
            if (r14 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r0 = 0
            goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            com.google.android.apps.search.assistant.libraries.ui.logoview.ao r3 = r12.f332962d
            int r4 = r3.f333027j
            if (r13 != r4) goto L_0x001a
            int r4 = r3.f333028k
            if (r4 != 0) goto L_0x001a
            goto L_0x0115
        L_0x001a:
            int r4 = r3.f333028k
            if (r13 == r4) goto L_0x0115
            r3.f333028k = r13
            java.util.ArrayDeque r13 = r3.f333021d
            r13.clear()
            com.google.android.apps.search.assistant.libraries.ui.logoview.ap r13 = r3.f333020c
            int r13 = r3.f333027j
            int r13 = com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119460ap.m198254d(r13)
            com.google.android.apps.search.assistant.libraries.ui.logoview.ap r4 = r3.f333020c
            int r4 = r3.f333028k
            int r4 = com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119460ap.m198254d(r4)
            if (r13 == r4) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            if (r2 == 0) goto L_0x00b5
            java.util.Deque r5 = r3.mo104367a(r13)
            java.util.Deque r4 = r3.mo104367a(r4)
        L_0x0043:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0066
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0066
            java.lang.Object r6 = r5.getFirst()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r7 = r4.getFirst()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0066
            r5.removeFirst()
            r4.removeFirst()
            goto L_0x0043
        L_0x0066:
            java.util.Iterator r5 = r5.descendingIterator()
        L_0x006a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0086
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.ArrayDeque r7 = r3.f333021d
            com.google.android.apps.search.assistant.libraries.ui.logoview.ap r8 = r3.f333020c
            com.google.android.apps.search.assistant.libraries.ui.logoview.al r6 = com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119460ap.m198252b(r6)
            r7.addLast(r6)
            goto L_0x006a
        L_0x0086:
            java.util.Iterator r4 = r4.iterator()
        L_0x008a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a6
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.ArrayDeque r6 = r3.f333021d
            com.google.android.apps.search.assistant.libraries.ui.logoview.ap r7 = r3.f333020c
            com.google.android.apps.search.assistant.libraries.ui.logoview.al r5 = com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119460ap.m198251a(r5)
            r6.addLast(r5)
            goto L_0x008a
        L_0x00a6:
            com.google.android.apps.search.assistant.libraries.ui.logoview.al r4 = r3.f333025h
            java.util.ArrayDeque r5 = r3.f333021d
            java.lang.Object r5 = r5.getFirst()
            if (r4 != r5) goto L_0x00b5
            java.util.ArrayDeque r4 = r3.f333021d
            r4.pollFirst()
        L_0x00b5:
            java.util.ArrayDeque r4 = r3.f333021d
            com.google.android.apps.search.assistant.libraries.ui.logoview.ap r5 = r3.f333020c
            int r5 = r3.f333028k
            com.google.android.apps.search.assistant.libraries.ui.logoview.al r5 = com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119460ap.m198253c(r5)
            r4.addLast(r5)
            if (r0 == 0) goto L_0x00f4
        L_0x00c4:
            java.util.ArrayDeque r13 = r3.f333021d
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x00f1
            java.util.ArrayDeque r13 = r3.f333021d
            java.lang.Object r13 = r13.removeFirst()
            com.google.android.apps.search.assistant.libraries.ui.logoview.al r13 = (com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119456al) r13
            r3.mo104369c(r13)
            r4 = 0
            r3.f333024g = r4
            r3.f333023f = r4
            com.google.android.apps.search.assistant.libraries.ui.logoview.al r6 = r3.f333025h
            r7 = 0
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.apps.search.assistant.libraries.ui.logoview.b.b r11 = r3.f333019b
            r6.mo104365c(r7, r9, r11)
            com.google.android.apps.search.assistant.libraries.ui.logoview.b.b r13 = r3.f333019b
            r13.mo104386e()
            goto L_0x00c4
        L_0x00f1:
            r3.f333029l = r1
            goto L_0x0115
        L_0x00f4:
            android.animation.TimeAnimator r0 = r3.f333018a
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L_0x0112
            if (r2 == 0) goto L_0x0112
            com.google.android.apps.search.assistant.libraries.ui.logoview.al r0 = r3.f333025h
            com.google.android.apps.search.assistant.libraries.ui.logoview.ap r1 = r3.f333020c
            com.google.android.apps.search.assistant.libraries.ui.logoview.al r1 = com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119460ap.m198251a(r13)
            if (r0 == r1) goto L_0x0115
            com.google.android.apps.search.assistant.libraries.ui.logoview.al r0 = r3.f333025h
            com.google.android.apps.search.assistant.libraries.ui.logoview.ap r1 = r3.f333020c
            com.google.android.apps.search.assistant.libraries.ui.logoview.al r13 = com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119460ap.m198252b(r13)
            if (r0 == r13) goto L_0x0115
        L_0x0112:
            r3.mo104370d()
        L_0x0115:
            boolean r13 = r12.f332972o
            if (r13 == 0) goto L_0x0121
            if (r14 == 0) goto L_0x0120
            com.google.android.apps.search.assistant.libraries.ui.logoview.ao r13 = r12.f332962d
            r13.mo104368b()
        L_0x0120:
            return
        L_0x0121:
            com.google.android.apps.search.assistant.libraries.ui.logoview.ao r13 = r12.f332962d
            android.animation.TimeAnimator r13 = r13.f333018a
            r13.pause()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.p8984ui.logoview.LogoView.mo104345e(int, boolean):void");
    }
}
