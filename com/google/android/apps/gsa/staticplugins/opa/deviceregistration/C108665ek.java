package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.handoff.AssistantHandoffActivity;
import com.google.assistant.p3861at.C50302sa;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ek */
/* compiled from: PG */
final class C108665ek implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C108666el f302232a;

    public C108665ek(C108666el elVar) {
        this.f302232a = elVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent;
        C108666el elVar = this.f302232a;
        String str = elVar.f302240h.f302272a.f130924e;
        C58833ax a = elVar.f302239g.mo77278a();
        C50302sa saVar = elVar.f302240h.f302272a.f130927h;
        if (saVar == null) {
            saVar = C50302sa.f130905e;
        }
        String str2 = saVar.f130907a;
        C50302sa saVar2 = elVar.f302240h.f302272a.f130927h;
        if (saVar2 == null) {
            saVar2 = C50302sa.f130905e;
        }
        C62971cq cqVar = saVar2.f130908b;
        if (!TextUtils.isEmpty(str2) && !cqVar.isEmpty() && a.mo56113h() && !TextUtils.isEmpty(((Account) a.mo56107c()).name)) {
            intent = new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.gdi.GdiControlActivity").putExtra("extra_service_id", str2).putExtra("extra_scopes", (String[]) cqVar.toArray(new String[0])).putExtra("extra_account", (Parcelable) a.mo56107c()).putExtra("extra_action_mode", 0).putExtra("extra_supports_app_flip", true);
        } else if (!TextUtils.isEmpty(str)) {
            intent = new Intent(elVar.f302233a, AssistantHandoffActivity.class).putExtra("return_url_param", "end_uri").putExtra("result_message_param", "status").putExtra("uri", str);
            elVar.f302240h.f302275d = true;
            if (a.mo56113h()) {
                intent.putExtra("account_name", ((Account) a.mo56107c()).name);
            }
        } else {
            return;
        }
        elVar.f302240h.f302275d = true;
        elVar.f302234b.startActivityForResult(intent, 1000);
    }
}
