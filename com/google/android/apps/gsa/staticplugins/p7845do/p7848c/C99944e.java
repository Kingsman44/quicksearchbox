package com.google.android.apps.gsa.staticplugins.p7845do.p7848c;

import androidx.cardview.widget.CardView;
import com.google.android.apps.gsa.staticplugins.p7845do.p7847b.C99938d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.c.e */
/* compiled from: PG */
public final /* synthetic */ class C99944e implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99947h f279584a;

    public /* synthetic */ C99944e(C99947h hVar) {
        this.f279584a = hVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C99947h hVar = this.f279584a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C99938d dVar = C99938d.INTERNAL_ERROR;
            int ordinal = ((C99938d) axVar.mo56107c()).ordinal();
            if (ordinal == 0) {
                hVar.mo91683e(R.string.silky_tab_internal_error_message);
            } else if (ordinal == 1) {
                hVar.mo91683e(R.string.silky_tab_connection_error_message);
            }
        } else if (((CardView) hVar.f279590d.findViewById(R.id.error_card)).getVisibility() == 0) {
            hVar.f279590d.findViewById(R.id.error_layout).setVisibility(8);
            hVar.f279588b.setVisibility(0);
        }
    }
}
