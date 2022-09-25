package com.google.android.libraries.lens.view.p2065ai;

import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.C0632eu;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2092c.C25699a;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47715f;

/* renamed from: com.google.android.libraries.lens.view.ai.ae */
/* compiled from: PG */
public final /* synthetic */ class C25144ae implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C25147ah f68463a;

    public /* synthetic */ C25144ae(C25147ah ahVar) {
        this.f68463a = ahVar;
    }

    public final void onClick(View view) {
        C25147ah ahVar = this.f68463a;
        C0632eu euVar = new C0632eu(ahVar.f68467b.getContext(), ahVar.f68486u, 0);
        C0477q qVar = euVar.f2394a;
        euVar.mo2856a().inflate(R.menu.overflow_menu, qVar);
        if (ahVar.f68483r) {
            qVar.add(0, 1, 0, R.string.lens_overflow_menu_impressum);
        }
        qVar.add(0, 2, 0, R.string.lens_overflow_menu_send_feedback);
        if (((C25699a) ahVar.f68474i.mo27525b()).mo30832e()) {
            qVar.add(0, 6, 0, R.string.lens_overflow_menu_add_to_homescreen);
        }
        if (ahVar.f68481p && ahVar.f68485t) {
            String string = ahVar.f68467b.getString(R.string.lens_donate_data_optin_title);
            if (ahVar.f68482q) {
                string = "[" + ahVar.f68467b.getString(R.string.lens_overflow_menu_donate_data_googlers) + "] " + string;
            }
            qVar.mo1650c(0, 3, 0, string).setCheckable(true).setChecked(ahVar.f68484s);
        }
        ahVar.f68467b.getView().getClass();
        qVar.add(0, 5, 0, R.string.lens_overflow_menu_privacy_policy);
        qVar.add(0, 4, 0, R.string.lens_overflow_menu_terms_of_service);
        euVar.f2396c = new C47715f(ahVar.f68480o, "MenuClickTrace", new C25145af(ahVar));
        euVar.f2395b.mo1539f();
        ahVar.f68469d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(ahVar.f68486u));
    }
}
