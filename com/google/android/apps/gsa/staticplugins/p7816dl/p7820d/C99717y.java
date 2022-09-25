package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99687l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.y */
/* compiled from: PG */
public final /* synthetic */ class C99717y implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99692ab f279050a;

    public /* synthetic */ C99717y(C99692ab abVar) {
        this.f279050a = abVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C99692ab abVar = this.f279050a;
        C58833ax axVar = (C58833ax) obj;
        View findViewById = abVar.f278972e.findViewById(R.id.minus_one_container);
        View findViewById2 = abVar.f278972e.findViewById(R.id.loading_ui_container);
        View findViewById3 = findViewById2.findViewById(R.id.loading_view);
        View findViewById4 = findViewById2.findViewById(R.id.error_view);
        if (axVar.mo56113h()) {
            C99687l lVar = C99687l.READY;
            int ordinal = ((C99687l) axVar.mo56107c()).ordinal();
            if (ordinal == 0) {
                findViewById.setVisibility(0);
                findViewById2.setVisibility(8);
            } else if (ordinal == 1) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
                findViewById3.setVisibility(0);
                findViewById4.setVisibility(8);
            } else if (ordinal == 2) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
                findViewById3.setVisibility(8);
                findViewById4.setVisibility(0);
            }
        }
    }
}
