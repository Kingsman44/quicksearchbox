package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.ao */
/* compiled from: PG */
public final class C97372ao extends C0260w {

    /* renamed from: a */
    public C97381j f271945a;

    public final Dialog onCreateDialog(Bundle bundle) {
        C44581b bVar = new C44581b(requireActivity(), R.style.restricted_account_logout_dialog);
        bVar.mo47604w(R.string.restricted_account_logout_dialog_title);
        bVar.f1347a.f1322c = R.drawable.quantum_gm_ic_info_outline_vd_theme_24;
        bVar.mo47597p(R.string.restricted_account_logout_dialog_description);
        bVar.mo47601t(R.string.restricted_account_logout_dialog_pos_button, new C97371an(this));
        bVar.f1347a.f1333n = false;
        return bVar.create();
    }
}
