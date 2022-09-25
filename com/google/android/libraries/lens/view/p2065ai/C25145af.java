package com.google.android.libraries.lens.view.p2065ai;

import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0631et;
import android.view.MenuItem;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25514at;
import com.google.android.libraries.lens.view.p2092c.C25699a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.ai.af */
/* compiled from: PG */
public final /* synthetic */ class C25145af implements C0631et {

    /* renamed from: a */
    public final /* synthetic */ C25147ah f68464a;

    public /* synthetic */ C25145af(C25147ah ahVar) {
        this.f68464a = ahVar;
    }

    /* renamed from: a */
    public final boolean mo2855a(MenuItem menuItem) {
        int i;
        C25147ah ahVar = this.f68464a;
        int i2 = ((C0480t) menuItem).f1682a;
        if (i2 == 1) {
            ahVar.mo30286b(R.string.lens_overflow_menu_impressum_url);
            return true;
        } else if (i2 == 2) {
            C47393f.m84236g(new C25514at("Popup Menu"), ahVar.f68467b);
            return true;
        } else if (i2 == 3) {
            C47393f.m84236g(new C25184v(), ahVar.f68467b);
            return true;
        } else {
            if (i2 == 5) {
                i = R.string.lens_overflow_menu_privacy_policy_url;
            } else if (i2 == 4) {
                i = R.string.lens_overflow_menu_terms_of_service_url;
            } else if (i2 != 6) {
                return false;
            } else {
                ahVar.f68475j.mo30251a(C118575h.PLUGIN_LENS, C118569b.LENS_APP_SHORTCUT_MENU_CLICKED, 1);
                if (ahVar.f68477l) {
                    ((C19567d) ahVar.f68476k.f68258j.mo6453a()).mo24822a(1, new Object[0]);
                }
                ((C25699a) ahVar.f68474i.mo27525b()).mo30828a();
                return true;
            }
            ahVar.mo30286b(i);
            return true;
        }
    }
}
