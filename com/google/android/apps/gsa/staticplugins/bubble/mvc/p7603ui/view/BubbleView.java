package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.p097i.C1967b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97235u;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BubbleView */
/* compiled from: PG */
public class BubbleView extends FrameLayout {

    /* renamed from: a */
    public Runnable f271645a;

    /* renamed from: b */
    private C1967b f271646b;

    /* renamed from: c */
    private int f271647c = 0;

    public BubbleView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo90609a(C1967b bVar) {
        this.f271646b = bVar;
        this.f271647c = getContext().getResources().getConfiguration().orientation;
    }

    public final void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        if (this.f271646b != null && configuration.orientation != this.f271647c) {
            this.f271647c = configuration.orientation;
            this.f271646b.mo3353a(Integer.valueOf(configuration.orientation));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f271645a;
        if (runnable != null) {
            ((C97235u) runnable).f271641a.mo90522j();
        }
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
