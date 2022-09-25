package com.google.android.libraries.lens.view.textoverlay;

import android.graphics.PointF;
import android.view.View;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.common.text.selection.p2009ui.C24178s;
import com.google.android.libraries.lens.common.text.selection.p2009ui.TextSelectionView;
import com.google.android.libraries.lens.view.p2078at.C25518ax;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.o */
/* compiled from: PG */
public final /* synthetic */ class C28082o implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C28093z f76437a;

    public /* synthetic */ C28082o(C28093z zVar) {
        this.f76437a = zVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        PointF pointF;
        C28093z zVar = this.f76437a;
        View view = zVar.f76449b.getView();
        view.getClass();
        C25518ax.m46997e((C58833ax) obj, view);
        C24178s sVar = zVar.f76456i;
        if (sVar != null) {
            TextSelectionView textSelectionView = sVar.f66073f;
            C58833ax axVar = (C58833ax) sVar.f66076i.f76446a.f76450c.f76417e.mo3842a();
            float f = axVar.mo56113h() ? ((C25518ax) axVar.mo56107c()).f69480b : 1.0f;
            C28091x xVar = sVar.f66076i;
            C58833ax axVar2 = (C58833ax) xVar.f76446a.f76450c.f76417e.mo3842a();
            if (axVar2.mo56113h()) {
                View view2 = xVar.f76446a.f76449b.getView();
                view2.getClass();
                View view3 = xVar.f76446a.f76449b.getView();
                view3.getClass();
                pointF = new PointF(((float) view2.getWidth()) * ((C25518ax) axVar2.mo56107c()).f69479a.x, ((float) view3.getHeight()) * ((C25518ax) axVar2.mo56107c()).f69479a.y);
            } else {
                pointF = new PointF(0.0f, 0.0f);
            }
            textSelectionView.f65957j = f;
            textSelectionView.f65958k.set(pointF);
            textSelectionView.mo29567h(f);
            textSelectionView.mo29568i();
        }
    }
}
