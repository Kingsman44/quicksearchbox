package com.google.android.libraries.lens.view.common;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import com.google.apps.tiktok.p3674l.p3681e.C47413b;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class RoundedImageView extends C25746h implements C47231d, C47413b {

    /* renamed from: a */
    public C25742d f69975a;

    /* renamed from: b */
    private final TypedArray f69976b;

    @Deprecated
    public RoundedImageView(Context context) {
        super(context);
        this.f69976b = null;
        m47515f();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    private final void m47515f() {
        if (this.f69975a == null) {
            try {
                C25744f fVar = (C25744f) mo30901d().mo17653jN();
                C25741c cVar = new C25741c(this);
                C47240i.m84036c(cVar);
                try {
                    C25742d G = fVar.mo30899G();
                    this.f69975a = G;
                    if (G == null) {
                        C47240i.m84035b(cVar);
                    }
                    TypedArray typedArray = this.f69976b;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    this.f69975a.f70001i = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f69975a == null) {
                        C47240i.m84035b(cVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* renamed from: a */
    public final TypedArray mo30879a() {
        return this.f69976b;
    }

    /* renamed from: b */
    public final C25742d mo17754z() {
        C25742d dVar = this.f69975a;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public final void draw(Canvas canvas) {
        m47515f();
        C25742d dVar = this.f69975a;
        float f = dVar.f69995c;
        if (f == 0.0f && dVar.f69996d == 0.0f && dVar.f69998f == 0.0f && dVar.f69997e == 0.0f) {
            super.draw(canvas);
            return;
        }
        if (dVar.f70000h) {
            float f2 = dVar.f69996d;
            float f3 = dVar.f69997e;
            float f4 = dVar.f69998f;
            dVar.f69994b.rewind();
            dVar.f69994b.addRoundRect(new RectF(0.0f, 0.0f, (float) dVar.f69993a.getWidth(), (float) dVar.f69993a.getHeight()), new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            dVar.f70000h = false;
        }
        canvas.save();
        canvas.clipPath(dVar.f69994b);
        super.draw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m47515f();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        m47515f();
        C25742d dVar = this.f69975a;
        if (dVar.f69999g == -1.0f) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i)) * dVar.f69999g), View.MeasureSpec.getMode(i)));
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        m47515f();
        C25742d dVar = this.f69975a;
        dVar.f70000h = true;
        dVar.f69993a.invalidate();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69976b = context.obtainStyledAttributes(attributeSet, C25732b.f69977a);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69976b = context.obtainStyledAttributes(attributeSet, C25732b.f69977a, i, 0);
    }

    public RoundedImageView(C47274n nVar) {
        super(nVar);
        this.f69976b = null;
        m47515f();
    }
}
