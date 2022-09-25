package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.ac */
/* compiled from: PG */
public final /* synthetic */ class C116439ac implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C116446aj f322874a;

    public /* synthetic */ C116439ac(C116446aj ajVar) {
        this.f322874a = ajVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C116446aj ajVar = this.f322874a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            ConfirmationTray confirmationTray = ajVar.f322887e;
            String str = (String) axVar.mo56107c();
            confirmationTray.f322854c.setText(str);
            CharSequence text = confirmationTray.getResources().getText(R.string.save_saved_to);
            confirmationTray.f322853b.setText(text);
            confirmationTray.f322854c.setVisibility(0);
            confirmationTray.f322852a.setVisibility(0);
            String valueOf = String.valueOf(text);
            confirmationTray.announceForAccessibility(valueOf + " " + str);
            return;
        }
        ConfirmationTray confirmationTray2 = ajVar.f322887e;
        confirmationTray2.f322853b.setText(confirmationTray2.getResources().getText(R.string.save_in_progress));
        confirmationTray2.f322854c.setVisibility(8);
        confirmationTray2.f322852a.setVisibility(8);
    }
}
