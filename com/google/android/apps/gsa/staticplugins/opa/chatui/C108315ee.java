package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.app.AlertDialog;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ee */
/* compiled from: PG */
public final /* synthetic */ class C108315ee implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108317eg f301314a;

    public /* synthetic */ C108315ee(C108317eg egVar) {
        this.f301314a = egVar;
    }

    public final void onClick(View view) {
        C108317eg egVar = this.f301314a;
        String F = egVar.f301320d.mo79659F();
        if (F == null) {
            egVar.dismiss();
            ((C59052c) ((C59052c) C108321ej.f301321a.mo56226d()).mo56372aa(23993)).mo56386p("#showDeleteConfirmationOrDelete: user not logged in!");
        } else if (egVar.f301319c.getBoolean("opa_has_previous_deletions_prefix_".concat(F), false)) {
            egVar.mo96767a(F);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(egVar.getActivity());
            builder.setTitle(R.string.opa_delete_confirmation_title);
            builder.setMessage(R.string.opa_delete_confirmation_message);
            builder.setPositiveButton(R.string.delete, new C108313ec(egVar, F));
            builder.setNegativeButton(R.string.cancel, C108314ed.f301313a);
            builder.show();
        }
    }
}
