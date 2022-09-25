package com.google.android.libraries.lens.view.onboarding;

import android.app.Dialog;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.common.bottompanelscrollview.BottomPanelScrollView;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.onboarding.ba */
/* compiled from: PG */
final class C27495ba implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C27493az f75196a;

    public C27495ba(C27493az azVar) {
        this.f75196a = azVar;
    }

    public final void onClick(View view) {
        C27493az azVar = this.f75196a;
        azVar.f75184e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        Dialog dialog = azVar.f75182c.getDialog();
        if (dialog != null) {
            ((BottomPanelScrollView) dialog.findViewById(R.id.lens_warm_welcome_container)).mo17754z().f69982a.pageScroll(130);
        }
    }
}
