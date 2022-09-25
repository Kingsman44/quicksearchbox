package com.google.android.apps.gsa.shared.p7148ui.header;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.p7916ek.C100543a;
import com.google.android.apps.gsa.staticplugins.p7916ek.C100544b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.progress.C28585k;
import com.google.android.libraries.material.progress.C28589o;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.c */
/* compiled from: PG */
final class C90690c implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C90691d f253663a;

    public C90690c(C90691d dVar) {
        this.f253663a = dVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a.ordinal() == 4) {
            C90691d dVar = this.f253663a;
            if (!dVar.f253667d) {
                C58833ax axVar = (C58833ax) dVar.f253665b.mo27525b();
                if (!axVar.mo56113h()) {
                    C58976aa aaVar = C58975e.f156826a;
                } else if (!dVar.f253667d) {
                    C100543a aVar = (C100543a) axVar.mo56107c();
                    Context context = dVar.f253664a;
                    Resources resources = context.getResources();
                    int color = resources.getColor(R.color.quantum_googblue400);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.material_progress_bar_top_margin);
                    layoutParams.bottomMargin = resources.getDimensionPixelOffset(R.dimen.material_progress_bar_bottom_margin);
                    MaterialProgressBar materialProgressBar = new MaterialProgressBar(context);
                    materialProgressBar.setIndeterminate(true);
                    materialProgressBar.mo34161d(context, (AttributeSet) null, 0, 2132151267);
                    materialProgressBar.mo34163f(color);
                    if (materialProgressBar.f77691b != 0) {
                        ((C28585k) materialProgressBar.getProgressDrawable()).setGrowMode(0);
                    }
                    if (materialProgressBar.f77690a != 0) {
                        ((C28589o) materialProgressBar.getIndeterminateDrawable()).setGrowMode(0);
                    }
                    materialProgressBar.mo34159b();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.material_progress_bar_height);
                    materialProgressBar.f77692c = dimensionPixelSize;
                    if (materialProgressBar.f77691b != 0) {
                        ((C28585k) materialProgressBar.getProgressDrawable()).setBarHeight(dimensionPixelSize);
                    }
                    if (materialProgressBar.f77690a != 0) {
                        ((C28589o) materialProgressBar.getIndeterminateDrawable()).setBarHeight(dimensionPixelSize);
                    }
                    materialProgressBar.mo34162e();
                    materialProgressBar.setLayoutParams(layoutParams);
                    C100544b bVar = new C100544b(materialProgressBar);
                    dVar.f253670g.mo82675h(bVar);
                    dVar.f253671h = bVar.f281127c;
                    View view = dVar.f253671h;
                    if (view != null) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(view.getLayoutParams());
                        layoutParams2.gravity = 80;
                        layoutParams2.topMargin = 0;
                        layoutParams2.bottomMargin = dVar.f253669f;
                        dVar.f253671h.setLayoutParams(layoutParams2);
                        dVar.f253668e.addView(dVar.f253671h);
                        View view2 = dVar.f253671h;
                        view2.setPadding(dVar.f253666c, view2.getPaddingTop(), dVar.f253666c, dVar.f253671h.getPaddingBottom());
                    }
                    dVar.f253667d = true;
                    C58976aa aaVar2 = C58975e.f156826a;
                }
            }
        }
    }
}
