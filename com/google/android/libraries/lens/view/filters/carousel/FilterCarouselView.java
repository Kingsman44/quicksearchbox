package com.google.android.libraries.lens.view.filters.carousel;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class FilterCarouselView extends C25970z implements C47231d {

    /* renamed from: a */
    public C25961q f70494a;

    @Deprecated
    public FilterCarouselView(Context context) {
        super(context);
        m47855e();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private final void m47855e() {
        if (this.f70494a == null) {
            try {
                C25963s sVar = (C25963s) mo31164b().mo17653jN();
                C25947c cVar = new C25947c(this);
                C47240i.m84036c(cVar);
                try {
                    C25961q K = sVar.mo31154K();
                    this.f70494a = K;
                    if (K == null) {
                        C47240i.m84035b(cVar);
                    }
                    this.f70494a.f70570o = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f70494a == null) {
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
    public final C25961q mo17754z() {
        C25961q qVar = this.f70494a;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m47855e();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View findViewByPosition;
        m47855e();
        C25961q qVar = this.f70494a;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (i5 = qVar.f70559l) != -1) {
            qVar.mo31146h(i5);
            FilterTooltip filterTooltip = qVar.f70551d;
            if (filterTooltip != null && filterTooltip.getVisibility() == 0 && qVar.f70561n.mo56113h() && (findViewByPosition = qVar.mo31143e().findViewByPosition(((Integer) qVar.f70561n.mo56107c()).intValue())) != null) {
                C25967w a = qVar.f70551d.mo17754z();
                a.f70581h = 0;
                a.mo31161b(findViewByPosition);
            }
            qVar.f70559l = -1;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        m47855e();
        C25961q qVar = this.f70494a;
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (!qVar.mo31153o()) {
                qVar.f70553f.mo31121a(((float) i) * 0.5f);
            }
            C25943a aVar = (C25943a) qVar.f70552e.mAdapter;
            aVar.getClass();
            if (i != aVar.f70508c) {
                aVar.f70508c = i;
                aVar.notifyItemChanged(0);
                aVar.notifyItemChanged(aVar.f70506a.f70648a.size() - 1);
            }
            if (i3 != 0) {
                qVar.f70559l = qVar.mo31142d(i3);
            }
        }
    }

    public FilterCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilterCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FilterCarouselView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public FilterCarouselView(C47274n nVar) {
        super(nVar);
        m47855e();
    }
}
