package com.google.android.libraries.lens.view.textoverlay;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.common.text.selection.p2009ui.C24178s;
import com.google.android.libraries.lens.common.text.selection.p2009ui.TextSelectionView;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.p */
/* compiled from: PG */
public final /* synthetic */ class C28083p implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C28093z f76438a;

    public /* synthetic */ C28083p(C28093z zVar) {
        this.f76438a = zVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C28093z zVar = this.f76438a;
        C58833ax axVar = (C58833ax) obj;
        if (zVar.f76456i != null || axVar.mo56113h()) {
            if (zVar.f76456i == null) {
                zVar.mo33555g();
            }
            if (axVar.mo56113h()) {
                zVar.mo33556h();
                return;
            }
            zVar.mo33552c().setVisibility(8);
            zVar.f76461n = true;
            C24178s sVar = zVar.f76456i;
            sVar.f66071d = null;
            sVar.mo29637c();
            TextSelectionView textSelectionView = sVar.f66073f;
            textSelectionView.setBackground((Drawable) null);
            textSelectionView.mo29566g();
            zVar.f76461n = false;
            zVar.f76460m.clear();
            return;
        }
        zVar.f76460m.clear();
    }
}
