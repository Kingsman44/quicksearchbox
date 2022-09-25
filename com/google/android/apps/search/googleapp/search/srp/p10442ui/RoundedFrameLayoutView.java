package com.google.android.apps.search.googleapp.search.srp.p10442ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import com.google.apps.tiktok.p3674l.p3681e.C47413b;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ui.RoundedFrameLayoutView */
/* compiled from: PG */
public final class RoundedFrameLayoutView extends C137898h implements C47231d, C47413b {

    /* renamed from: a */
    public C137893c f375185a;

    /* renamed from: b */
    private final TypedArray f375186b;

    @Deprecated
    public RoundedFrameLayoutView(Context context) {
        super(context);
        this.f375186b = null;
        m224194e();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private final void m224194e() {
        if (this.f375185a == null) {
            try {
                C137895e eVar = (C137895e) mo114033b().mo17653jN();
                C137892b bVar = new C137892b(this);
                C47240i.m84036c(bVar);
                try {
                    C137893c o = eVar.mo114031o();
                    this.f375185a = o;
                    if (o == null) {
                        C47240i.m84035b(bVar);
                    }
                    TypedArray typedArray = this.f375186b;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    this.f375185a.f375192d = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f375185a == null) {
                        C47240i.m84035b(bVar);
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
        return this.f375186b;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        m224194e();
        C137893c cVar = this.f375185a;
        canvas.clipPath(cVar.f375189a);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m224194e();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        m224194e();
        C137893c cVar = this.f375185a;
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = cVar.f375191c;
        float f = (float) i2;
        float f2 = cVar.f375190b;
        rectF.set(0.0f, f - (f2 + f2), (float) i, f);
        cVar.f375189a.reset();
        Path path = cVar.f375189a;
        RectF rectF2 = cVar.f375191c;
        float f3 = cVar.f375190b;
        path.addRoundRect(rectF2, f3, f3, Path.Direction.CCW);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C137893c cVar = this.f375185a;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public RoundedFrameLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f375186b = context.obtainStyledAttributes(attributeSet, C137891a.f375187a);
    }

    public RoundedFrameLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f375186b = context.obtainStyledAttributes(attributeSet, C137891a.f375187a, i, 0);
    }

    public RoundedFrameLayoutView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f375186b = context.obtainStyledAttributes(attributeSet, C137891a.f375187a, i, i2);
    }

    public RoundedFrameLayoutView(C47274n nVar) {
        super(nVar);
        this.f375186b = null;
        m224194e();
    }
}
