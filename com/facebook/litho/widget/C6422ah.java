package com.facebook.litho.widget;

import android.view.ViewTreeObserver;
import com.facebook.yoga.C6570f;

/* renamed from: com.facebook.litho.widget.ah */
/* compiled from: PG */
final class C6422ah implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ C6423ai f19065a;

    /* renamed from: b */
    final /* synthetic */ C6424aj f19066b;

    /* renamed from: c */
    final /* synthetic */ C6570f f19067c;

    public C6422ah(C6423ai aiVar, C6424aj ajVar, C6570f fVar) {
        this.f19065a = aiVar;
        this.f19066b = ajVar;
        this.f19067c = fVar;
    }

    public final boolean onPreDraw() {
        this.f19065a.getViewTreeObserver().removeOnPreDrawListener(this);
        int i = this.f19066b.f19075a;
        if (i == -1) {
            if (this.f19067c == C6570f.RTL) {
                this.f19065a.fullScroll(66);
            }
            this.f19066b.f19075a = this.f19065a.getScrollX();
            return true;
        }
        this.f19065a.setScrollX(i);
        return true;
    }
}
