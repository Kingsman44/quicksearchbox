package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.d */
/* compiled from: PG */
public final /* synthetic */ class C36754d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C36755e f95767a;

    public /* synthetic */ C36754d(C36755e eVar) {
        this.f95767a = eVar;
    }

    public final void onClick(View view) {
        C36755e eVar = this.f95767a;
        eVar.f95777j.mo19974a(C37176a.f97292im);
        eVar.f95778k.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(eVar.f95771d.requireView().findViewById(R.id.assistant_oobe_empty_action_button)));
        eVar.f95780m.mo526b(AccountManager.newChooseAccountIntent((Account) null, (List) null, new String[]{"com.google"}, (String) null, (String) null, (String[]) null, (Bundle) null));
    }
}
