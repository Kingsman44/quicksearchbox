package com.google.android.apps.gsa.staticplugins.p8770t.p8773c;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90224d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.t.c.b */
/* compiled from: PG */
final class C117461b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C90224d f326018a;

    /* renamed from: b */
    final /* synthetic */ C117462c f326019b;

    public C117461b(C117462c cVar, C90224d dVar) {
        this.f326019b = cVar;
        this.f326018a = dVar;
    }

    public final void onGlobalLayout() {
        C117462c cVar = this.f326019b;
        C90208n a = C90208n.m146767a(this.f326018a.f252057f);
        if (a == null) {
            a = C90208n.UNKNOWN_TAB;
        }
        if (cVar.f326021b.mo56113h()) {
            View findViewWithTag = ((Activity) cVar.f326021b.mo56107c()).getWindow().getDecorView().findViewWithTag(a);
            if (findViewWithTag == null) {
                C59104x d = C117462c.f326020a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BottomTooltipRenderer");
                ((C59052c) ((C59052c) d).mo56372aa(18238)).mo56389s("Unable to find the view with tag: %s", a);
                int i = C90755l.f253831a;
                cVar.mo103313e(cVar.f326024e, 8);
                return;
            }
            float x = findViewWithTag.getX() + ((float) (findViewWithTag.getWidth() / 2));
            View view = cVar.f326025f;
            view.setX(x - ((float) (view.getMeasuredWidth() / 2)));
            int dimensionPixelSize = cVar.f326022c.getResources().getDimensionPixelSize(R.dimen.tooltip_screen_padding);
            int width = cVar.f326023d.getWidth();
            float measuredWidth = (float) (cVar.f326026g.getMeasuredWidth() / 2);
            float f = ((float) (width - (dimensionPixelSize + dimensionPixelSize))) - (measuredWidth + measuredWidth);
            float f2 = (x - measuredWidth) - ((float) dimensionPixelSize);
            if (f2 < 0.0f) {
                f = 0.0f;
            } else if (f2 <= f) {
                f = f2;
            }
            cVar.f326026g.setX(f);
            cVar.mo103313e(cVar.f326024e, 0);
        }
    }
}
