package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.ag */
/* compiled from: PG */
public final class C9652ag extends C9646aa {

    /* renamed from: a */
    public bm f33390a;

    /* renamed from: b */
    public C9650ae f33391b;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f33391b.mo17927a(this.f33390a.w());
        View inflate = layoutInflater.inflate(R.layout.fragment_opa_user_enabled_setting, viewGroup, false);
        int i = ItemView.a;
        Switch t = inflate.findViewById(R.id.settings_nexus_opa_user_enabled).t();
        t.setChecked(this.f33390a.w());
        t.setOnCheckedChangeListener(new C9651af(this));
        return inflate;
    }
}
