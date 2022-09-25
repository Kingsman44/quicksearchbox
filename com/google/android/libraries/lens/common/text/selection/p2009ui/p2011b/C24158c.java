package com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Magnifier;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24146d;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.b.c */
/* compiled from: PG */
public final class C24158c {

    /* renamed from: a */
    public final ViewGroup f65995a;

    /* renamed from: b */
    public final C24161f f65996b;

    /* renamed from: c */
    public final C24157b f65997c;

    /* renamed from: d */
    public boolean f65998d;

    /* renamed from: e */
    private final View f65999e;

    public C24158c(View view, ViewGroup viewGroup) {
        this.f65999e = view;
        this.f65995a = viewGroup;
        C24161f fVar = new C24161f(view.getContext());
        this.f65996b = fVar;
        fVar.setId(R.id.lens_magnifier_widget);
        fVar.getContext().getResources();
        Magnifier magnifier = new Magnifier(fVar);
        fVar.f66002a = (float) magnifier.getWidth();
        fVar.f66003b = (float) magnifier.getHeight();
        fVar.f66004c = ((float) magnifier.getDefaultVerticalSourceToMagnifierOffset()) + (fVar.f66003b / 2.0f);
        fVar.f66005d = magnifier.getZoom();
        fVar.f66006e = magnifier.getCornerRadius();
        this.f65997c = new C24157b(fVar);
    }

    /* renamed from: a */
    public final void mo29586a(PointF pointF, C24146d dVar) {
        if (!this.f65998d) {
            C24161f fVar = this.f65996b;
            View view = this.f65999e;
            ViewGroup viewGroup = this.f65995a;
            fVar.setAlpha(0.0f);
            viewGroup.addView(fVar);
            fVar.f66007f = view;
            fVar.getLayoutParams().height = -1;
            fVar.getLayoutParams().width = -1;
            this.f65998d = true;
        }
        C24157b bVar = this.f65997c;
        if (bVar.f65982c && (dVar.mo29558i() != bVar.f65994o || ((float) dVar.mo29549b()) != bVar.f65992m || ((float) dVar.mo29550c()) != bVar.f65993n)) {
            if (bVar.f65981b.isRunning()) {
                long currentPlayTime = bVar.f65981b.getCurrentPlayTime();
                bVar.f65981b.cancel();
                if (currentPlayTime > 0) {
                    bVar.mo29585a(Math.min(1.0f, ((float) currentPlayTime) / 100.0f));
                }
                bVar.f65983d = bVar.f65986g;
                bVar.f65984e = bVar.f65987h;
                bVar.f65985f = bVar.f65988i;
            } else {
                bVar.f65983d = bVar.f65989j;
                bVar.f65984e = bVar.f65990k;
                bVar.f65985f = bVar.f65991l;
            }
            bVar.f65981b.start();
        } else if (!bVar.f65981b.isRunning()) {
            bVar.f65980a.mo29596b(pointF, dVar.mo29548a(), dVar.mo29558i());
        }
        bVar.f65989j = pointF.x;
        bVar.f65990k = pointF.y;
        bVar.f65991l = dVar.mo29548a();
        bVar.f65992m = (float) dVar.mo29549b();
        bVar.f65993n = (float) dVar.mo29550c();
        bVar.f65994o = dVar.mo29558i();
        bVar.f65982c = true;
    }
}
