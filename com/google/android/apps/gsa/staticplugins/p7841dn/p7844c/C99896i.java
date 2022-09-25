package com.google.android.apps.gsa.staticplugins.p7841dn.p7844c;

import androidx.cardview.widget.CardView;
import com.google.android.apps.gsa.staticplugins.p7841dn.p7843b.C99886d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.c.i */
/* compiled from: PG */
public final /* synthetic */ class C99896i implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99898k f279447a;

    public /* synthetic */ C99896i(C99898k kVar) {
        this.f279447a = kVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C99898k kVar = this.f279447a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C99886d dVar = C99886d.INTERNAL_ERROR;
            int ordinal = ((C99886d) axVar.mo56107c()).ordinal();
            if (ordinal == 0) {
                kVar.mo91659e(R.string.silk_pane_internal_error_message);
            } else if (ordinal == 1) {
                kVar.mo91659e(R.string.silk_pane_connection_error_message);
            }
        } else if (((CardView) kVar.f279454f.findViewById(R.id.error_card)).getVisibility() == 0) {
            kVar.f279454f.findViewById(R.id.error_layout).setVisibility(8);
            kVar.f279451c.setVisibility(0);
        }
    }
}
