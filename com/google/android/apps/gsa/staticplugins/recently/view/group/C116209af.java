package com.google.android.apps.gsa.staticplugins.recently.view.group;

import android.os.Bundle;
import android.view.ScaleGestureDetector;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116187p;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116129b;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116130c;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.view.group.af */
/* compiled from: PG */
final class C116209af extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a */
    final /* synthetic */ RecentlyView f322247a;

    /* renamed from: b */
    private float f322248b;

    /* renamed from: c */
    private float f322249c = 1.0f;

    public C116209af(RecentlyView recentlyView) {
        this.f322247a = recentlyView;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C116226r rVar = this.f322247a.f322230r;
        if (rVar == null) {
            return false;
        }
        float scaleFactor = ((scaleGestureDetector.getScaleFactor() - 4.0f) * 0.5f) + 1.0f;
        this.f322249c = scaleFactor;
        if (rVar.f322290k.mo124175a() > 1.0f && scaleFactor > 1.0f) {
            scaleFactor = ((scaleFactor - 4.0f) * 0.2f) + 1.0f;
        }
        float a = ((rVar.f322290k.mo124175a() + 1.0f) * scaleFactor) - 4.0f;
        if (a < 0.0f) {
            a = 0.0f;
        }
        C58485gu guVar = rVar.f322282c;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C116214f) guVar.get(i)).f322264m.mo124186l(0.0f);
        }
        rVar.f322290k.mo124186l(a);
        float focusX = scaleGestureDetector.getFocusX();
        float f = this.f322248b;
        RecentlyView recentlyView = this.f322247a;
        recentlyView.mo102581n(recentlyView.mo102562a(-(focusX - f)));
        this.f322248b = focusX;
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C116226r e;
        if (((Boolean) this.f322247a.f322228p.mo18622m()).booleanValue() || (e = this.f322247a.mo102567e(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY())) == null || e.f322282c.size() <= 1) {
            return false;
        }
        this.f322247a.f322231s.mo18619f(true);
        float focusX = scaleGestureDetector.getFocusX();
        this.f322248b = focusX;
        e.f322293n = this.f322247a.mo102563b(e, focusX);
        this.f322247a.f322230r = e;
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        RecentlyView recentlyView = this.f322247a;
        C116226r rVar = recentlyView.f322230r;
        if (rVar != null) {
            rVar.f322290k.mo124179e(true != recentlyView.f322226n.mo102424f(rVar.f322281b) ? 0.0f : 1.0f);
            RecentlyView recentlyView2 = this.f322247a;
            C116187p pVar = recentlyView2.f322194C;
            if (pVar != null) {
                int i = recentlyView2.f322230r.f322281b;
                boolean z = this.f322249c > 1.0f;
                C116129b bVar = pVar.f322158a;
                Bundle bundle = new Bundle();
                bundle.putInt("groupIndex", Integer.valueOf(i).intValue());
                bundle.putBoolean("expanded", Boolean.valueOf(z).booleanValue());
                ((C116130c) bVar).f322041a.mo28345s("onGroupPinched_int_boolean", "RecentlyEventsDispatcher", bundle);
            }
            RecentlyView recentlyView3 = this.f322247a;
            recentlyView3.f322230r = null;
            recentlyView3.f322231s.mo18619f(false);
            RecentlyView recentlyView4 = this.f322247a;
            recentlyView4.f322232t = true;
            recentlyView4.postDelayed(new C116206ac(recentlyView4), 100);
        }
    }
}
