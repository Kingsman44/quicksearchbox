package com.google.android.libraries.componentview.p1699f;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.android.libraries.componentview.services.application.C20614e;

/* renamed from: com.google.android.libraries.componentview.f.d */
/* compiled from: PG */
final class C20516d extends FrameLayout {

    /* renamed from: a */
    final /* synthetic */ C20517e f57632a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20516d(C20517e eVar, Context context) {
        super(context);
        this.f57632a = eVar;
        setClipChildren(false);
        setWillNotDraw(false);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
            this.f57632a.f57633a.mo57356n(new C19744c());
        } catch (Exception e) {
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.ON_DRAW_EXCEPTION);
            eVar.f57822b = "Failed to dispatch to draw view.";
            eVar.f57821a = e;
            C20520h.m38498c("ComponentView", eVar.mo25531a(), this.f57632a.f57635c.f57638a, new Object[0]);
        }
    }

    public final void draw(Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Exception e) {
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.ON_DRAW_EXCEPTION);
            eVar.f57822b = "Failed to draw view.";
            eVar.f57821a = e;
            C20520h.m38498c("ComponentView", eVar.mo25531a(), this.f57632a.f57635c.f57638a, new Object[0]);
        }
    }

    public final CharSequence getContentDescription() {
        return getChildCount() > 0 ? getChildAt(0).getContentDescription() : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e) {
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.ON_LAYOUT_EXCEPTION);
            eVar.f57822b = "Failed to layout view.";
            eVar.f57821a = e;
            C20520h.m38498c("ComponentView", eVar.mo25531a(), this.f57632a.f57635c.f57638a, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            setMeasuredDimension(0, 0);
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.ON_MEASURE_EXCEPTION);
            eVar.f57822b = "Failed to measure view.";
            eVar.f57821a = e;
            C20520h.m38498c("ComponentView", eVar.mo25531a(), this.f57632a.f57635c.f57638a, new Object[0]);
        }
    }
}
