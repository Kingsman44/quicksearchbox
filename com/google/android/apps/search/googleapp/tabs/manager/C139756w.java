package com.google.android.apps.search.googleapp.tabs.manager;

import android.support.p031v4.app.C0167am;
import android.view.MenuItem;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.tracing.C47752cq;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.w */
/* compiled from: PG */
public final /* synthetic */ class C139756w implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C139720ac f379861a;

    /* renamed from: b */
    public final /* synthetic */ C28439i f379862b;

    public /* synthetic */ C139756w(C139720ac acVar, C28439i iVar) {
        this.f379861a = acVar;
        this.f379862b = iVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C139720ac acVar = this.f379861a;
        acVar.f379781n.mo33853c(C28442l.m53142h().mo33894a(), this.f379862b);
        C0167am requireActivity = acVar.f379770c.requireActivity();
        C44581b bVar = new C44581b(requireActivity, 0);
        bVar.f1347a.f1326g = requireActivity.getString(R.string.googleapp_tabs_manager_close_all_tabs_dialog_confirmation_message);
        bVar.mo47599r(requireActivity.getString(17039360), C139757x.f379863a);
        bVar.mo47602u(requireActivity.getString(R.string.googleapp_tabs_manager_close_all_tabs_dialog_confirmation_button_label), new C47752cq(acVar.f379776i, "Clicked confirmation to close all tabs.", new C139758y(acVar)));
        bVar.create().show();
        return true;
    }
}
