package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8419b.p8420a.C110045b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.b */
/* compiled from: PG */
public final class C9672b extends C9712v {

    /* renamed from: a */
    public C58833ax f33449a;

    /* renamed from: b */
    public h f33450b;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_am_chips_section, viewGroup, false);
        Account a = this.f33450b.a();
        if (a != null) {
            ItemView findViewById = inflate.findViewById(R.id.settings_am_chips_toggle);
            findViewById.t().setChecked(((C110045b) ((C58847bk) this.f33449a).f156646a).mo98332a(a.name));
            findViewById.t().setOnCheckedChangeListener(new C9644a(this, a));
        }
        return inflate;
    }
}
