package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.widget.Toast;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.g */
/* compiled from: PG */
public final /* synthetic */ class C96231g implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C96431q f269358a;

    /* renamed from: b */
    public final /* synthetic */ C22869e f269359b;

    public /* synthetic */ C96231g(C96431q qVar, C22869e eVar) {
        this.f269358a = qVar;
        this.f269359b = eVar;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C96431q qVar = this.f269358a;
        C22869e eVar = this.f269359b;
        if (abVar.mo122491j()) {
            C58976aa aaVar = C58975e.f156826a;
            qVar.f269767g.mo28212l("AcctLink", eVar);
            return;
        }
        C59104x d = C96431q.f269762b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AccLinkFrag");
        ((C59052c) ((C59052c) d).mo56372aa(16928)).mo56386p("#RecordConsentCallback(): Audit recording failed.");
        Toast.makeText(qVar.getActivity(), R.string.error_unreliable_network, 0).show();
    }
}
