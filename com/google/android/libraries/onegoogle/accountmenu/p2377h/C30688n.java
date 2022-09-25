package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.popovercontainer.C31036ak;
import com.google.android.libraries.onegoogle.popovercontainer.C31057s;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.n */
/* compiled from: PG */
public final /* synthetic */ class C30688n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31036ak f82839a;

    public /* synthetic */ C30688n(C31036ak akVar) {
        this.f82839a = akVar;
    }

    public final void run() {
        C31036ak akVar = this.f82839a;
        C19559g.m37304c();
        ExpandableDialogView expandableDialogView = akVar.f83604h;
        if (expandableDialogView != null) {
            View findViewById = expandableDialogView.findViewById(R.id.og_container_disable_content_view);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(C31057s.f83647a);
        }
    }
}
