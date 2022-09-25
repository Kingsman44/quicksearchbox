package com.google.android.apps.gsa.assistant.settings.features.p560an;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90088em;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.logging.p2185ve.C28310af;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.an.a */
/* compiled from: PG */
public final class C10175a extends Fragment {

    /* renamed from: a */
    public h f34583a;

    /* renamed from: b */
    public C28310af f34584b;

    /* renamed from: c */
    public C90021c f34585c;

    public final void onActivityResult(int i, int i2, Intent intent) {
        C0167am activity;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int i;
        C73778a.m108339b(this);
        View view = new View(getContext());
        if (getArguments() == null) {
            str = null;
        } else {
            str = getArguments().getString("assistant_settings_privacy_screen_id");
        }
        int i2 = 526;
        if (str == null) {
            i = 526;
        } else {
            i = Integer.parseInt(str);
        }
        if (i != 526) {
            i2 = i;
        } else if (this.f34585c.mo79746e(C90088em.f250535b)) {
            this.f34584b.mo33806b(view, 71826).mo33808a();
        } else {
            C28295m.m52919e(view, new C28292j(71826));
            C89949q.m146521e(C28285c.m52874a(view, 61687), false);
        }
        Account a = this.f34583a.a();
        a.getClass();
        startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", i2).putExtra("extra.accountName", a.name).addFlags(524288), 1);
        return view;
    }
}
