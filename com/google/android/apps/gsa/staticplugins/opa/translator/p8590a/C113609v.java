package com.google.android.apps.gsa.staticplugins.opa.translator.p8590a;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.a.v */
/* compiled from: PG */
final class C113609v implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C113613z f314544a;

    /* renamed from: b */
    private boolean f314545b;

    public C113609v(C113613z zVar) {
        this.f314544a = zVar;
    }

    public final void onGlobalLayout() {
        C113613z zVar = this.f314544a;
        if (zVar.f314584l != null && zVar.f314583k != null) {
            Rect rect = new Rect();
            this.f314544a.f314584l.getGlobalVisibleRect(rect);
            C113613z zVar2 = this.f314544a;
            boolean z = this.f314545b;
            boolean z2 = rect.bottom < Resources.getSystem().getDisplayMetrics().heightPixels - zVar2.f314581i;
            if (z2 != z) {
                if (z2) {
                    if (zVar2.f314584l != null && (zVar2.f314585m == C113610w.SOURCE_KEYBOARD_VIEW || zVar2.f314585m == C113610w.TARGET_KEYBOARD_VIEW)) {
                        C113613z.m188062g(zVar2.f314584l).setVisibility(8);
                    }
                } else if (zVar2.f314584l != null && (zVar2.f314585m == C113610w.SOURCE_KEYBOARD_VIEW || zVar2.f314585m == C113610w.TARGET_KEYBOARD_VIEW)) {
                    C113613z.m188062g(zVar2.f314584l).setVisibility(0);
                }
            }
            this.f314545b = z2;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C113613z.m188058c(this.f314544a.f314584l).getLayoutParams());
            layoutParams.addRule(12);
            layoutParams.bottomMargin = C113613z.m188062g(this.f314544a.f314584l).getHeight() + this.f314544a.f314583k.getResources().getDimensionPixelSize(R.dimen.interpreter_text_box_separator_height);
            C113613z.m188058c(this.f314544a.f314584l).setLayoutParams(layoutParams);
        }
    }
}
