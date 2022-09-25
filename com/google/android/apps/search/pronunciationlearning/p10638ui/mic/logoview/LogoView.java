package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141476a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10645c.C141480a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10645c.C141481b;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.LogoView */
/* compiled from: PG */
public final class LogoView extends C141496r implements C47231d {

    /* renamed from: a */
    private C141479c f383993a;

    @Deprecated
    public LogoView(Context context) {
        super(context);
        m229596e();
    }

    /* renamed from: e */
    private final void m229596e() {
        if (this.f383993a == null) {
            try {
                this.f383993a = ((C141482d) mo116509b().mo17653jN()).mo116499A();
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (!(context instanceof C47211g)) {
                    String cls = getClass().toString();
                    throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* renamed from: a */
    public final C141479c mo17754z() {
        C141479c cVar = this.f383993a;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m229596e();
        C141479c cVar = this.f383993a;
        cVar.mo116494d(cVar.f384035a.isShown());
        cVar.f384039e.f384075f = cVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m229596e();
        C141479c cVar = this.f383993a;
        cVar.mo116494d(false);
        cVar.f384039e.f384075f = null;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        m229596e();
        C141479c cVar = this.f383993a;
        canvas.save();
        canvas2.translate(((float) cVar.f384035a.getPaddingLeft()) + (cVar.mo116492b() / 2.0f), ((float) cVar.f384035a.getPaddingTop()) + (cVar.mo116491a() / 2.0f));
        if (cVar.f384041g > 0) {
            Iterator it = cVar.f384036b.iterator();
            while (it.hasNext()) {
                C141476a aVar = (C141476a) it.next();
                cVar.f384038d.setColor(aVar.f384019j);
                cVar.f384038d.setAlpha(PrivateKeyType.INVALID);
                float f = aVar.f384010a.f384006a.f383998b;
                float f2 = cVar.f384036b.f384026f.f384032a.f383996a.f384006a.f383998b;
                float f3 = aVar.f384011b.f383996a.f384006a.f383998b;
                float f4 = aVar.f384013d.f384006a.f383998b;
                float f5 = aVar.f384014e.f384006a.f383998b;
                double d = (double) (f2 + f3);
                float cos = (((float) Math.cos(d)) * f) + f4;
                float sin = (f * ((float) Math.sin(d))) + f5;
                if (aVar.mo116484b()) {
                    float f6 = aVar.f384018i.f383998b;
                    C141481b bVar = cVar.f384037c;
                    bVar.f384055b.reset();
                    bVar.f384056c.reset();
                    bVar.f384057d = 0.0f;
                    bVar.f384058e = 0.0f;
                    bVar.f384059f = Paint.Cap.ROUND;
                    C141477b bVar2 = cVar.f384036b;
                    if (aVar == bVar2.f384022b) {
                        C141481b bVar3 = cVar.f384037c;
                        bVar3.mo116498a(bVar3.f384055b, C141480a.f384047a, 7.0f, -1.0f, f6);
                        bVar3.f384057d = C141481b.m229621b(6.0f, f6);
                        bVar3.f384059f = Paint.Cap.ROUND;
                    } else if (aVar == bVar2.f384023c) {
                        C141481b bVar4 = cVar.f384037c;
                        bVar4.mo116498a(bVar4.f384055b, C141480a.f384048b, 14.0f, -1.0f, f6);
                        bVar4.f384057d = C141481b.m229621b(2.0f, f6);
                        bVar4.f384059f = f6 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    } else if (aVar == bVar2.f384024d) {
                        C141481b bVar5 = cVar.f384037c;
                        bVar5.mo116498a(bVar5.f384055b, C141480a.f384049c, 5.0f, -1.0f, f6);
                        bVar5.f384057d = C141481b.m229621b(2.0f, f6);
                        bVar5.f384059f = f6 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    } else if (aVar == bVar2.f384025e) {
                        C141481b bVar6 = cVar.f384037c;
                        bVar6.mo116498a(bVar6.f384055b, C141480a.f384050d, 4.0f, 10.0f, f6);
                        bVar6.f384057d = C141481b.m229621b(2.0f, f6);
                        bVar6.f384059f = f6 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    }
                    C141481b bVar7 = cVar.f384037c;
                    float f7 = cVar.f384042h;
                    bVar7.f384054a.reset();
                    bVar7.f384054a.preScale(f7, f7);
                    bVar7.f384054a.preTranslate(cos, sin);
                    bVar7.f384055b.transform(bVar7.f384054a);
                    bVar7.f384056c.transform(bVar7.f384054a);
                    bVar7.f384057d *= f7;
                    bVar7.f384058e *= f7;
                    C141481b bVar8 = cVar.f384037c;
                    cVar.f384038d.setStyle(Paint.Style.STROKE);
                    cVar.f384038d.setStrokeCap(bVar8.f384059f);
                    cVar.f384038d.setStrokeWidth(bVar8.f384057d);
                    canvas2.drawPath(bVar8.f384055b, cVar.f384038d);
                    cVar.f384038d.setStrokeWidth(bVar8.f384058e);
                    canvas2.drawPath(bVar8.f384056c, cVar.f384038d);
                } else {
                    float f8 = aVar.f384015f.f383998b;
                    if (f8 < -0.001f || f8 > 0.001f) {
                        cVar.f384038d.setStrokeWidth(aVar.f384012c.f384006a.f383998b * cVar.f384042h);
                        cVar.f384038d.setStyle(Paint.Style.STROKE);
                        cVar.f384038d.setStrokeCap(Paint.Cap.ROUND);
                        float f9 = aVar.f384015f.f383998b;
                        float f10 = cVar.f384042h;
                        float f11 = cos * f10;
                        canvas.drawLine(f11, (sin - f9) * f10, f11, (sin + f9) * f10, cVar.f384038d);
                    } else {
                        float f12 = aVar.f384012c.f384006a.f383998b;
                        float f13 = aVar.f384016g.f383998b;
                        cVar.f384038d.setStyle(Paint.Style.FILL);
                        float f14 = cVar.f384042h;
                        canvas2.drawCircle(cos * f14, sin * f14, ((f12 * f13) / 2.0f) * f14, cVar.f384038d);
                    }
                }
            }
            cVar.f384035a.setAlpha(cVar.f384036b.f384027g.f383998b);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m229596e();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m229596e();
        this.f383993a.mo116495e();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m229596e();
        C141479c cVar = this.f383993a;
        cVar.mo116494d(cVar.f384035a.isShown());
    }

    public LogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LogoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public LogoView(C47274n nVar) {
        super(nVar);
        m229596e();
    }
}
