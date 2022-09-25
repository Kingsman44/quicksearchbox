package com.google.android.libraries.lens.view.common.bottompanelscrollview;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.support.p033v7.widget.LinearLayoutManager;
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
public final class BottomPanelScrollView extends C25740h implements C47231d, C47413b {

    /* renamed from: a */
    public C25735c f69978a;

    /* renamed from: b */
    private final TypedArray f69979b;

    @Deprecated
    public BottomPanelScrollView(Context context) {
        super(context);
        this.f69979b = null;
        m47519f();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    private final void m47519f() {
        if (this.f69978a == null) {
            try {
                C25737e eVar = (C25737e) mo30895d().mo17653jN();
                C25733a aVar = new C25733a(this);
                C47240i.m84036c(aVar);
                try {
                    C25735c H = eVar.mo30893H();
                    this.f69978a = H;
                    if (H == null) {
                        C47240i.m84035b(aVar);
                    }
                    TypedArray typedArray = this.f69979b;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    this.f69978a.f69988e = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f69978a == null) {
                        C47240i.m84035b(aVar);
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
        return this.f69979b;
    }

    /* renamed from: b */
    public final C25735c mo17754z() {
        C25735c cVar = this.f69978a;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m47519f();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        m47519f();
        C25735c cVar = this.f69978a;
        if (cVar.f69983b >= 0) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == 0) {
                i3 = cVar.f69983b;
                mode = LinearLayoutManager.INVALID_OFFSET;
            } else {
                i3 = Math.min(cVar.f69983b, View.MeasureSpec.getSize(i));
            }
            i = View.MeasureSpec.makeMeasureSpec(i3, mode);
        }
        super.onMeasure(i, i2);
        cVar.mo30892a(cVar.f69982a.getScrollY());
    }

    public BottomPanelScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69979b = context.obtainStyledAttributes(attributeSet, C25739g.f69989a);
    }

    public BottomPanelScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69979b = context.obtainStyledAttributes(attributeSet, C25739g.f69989a, i, 0);
    }

    public BottomPanelScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f69979b = context.obtainStyledAttributes(attributeSet, C25739g.f69989a, i, i2);
    }

    public BottomPanelScrollView(C47274n nVar) {
        super(nVar);
        this.f69979b = null;
        m47519f();
    }
}
