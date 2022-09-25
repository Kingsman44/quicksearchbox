package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assist.p506e.C9408a;
import com.google.android.apps.gsa.assist.p506e.C9409b;
import com.google.android.apps.gsa.assistant.settings.shared.ai;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.u */
/* compiled from: PG */
public final class C9711u extends C9716z {

    /* renamed from: a */
    public C86124t f33541a;

    /* renamed from: b */
    public C9388a f33542b;

    /* renamed from: c */
    public C9408a f33543c;

    /* renamed from: d */
    public SensorManager f33544d;

    /* renamed from: e */
    public C9325m f33545e;

    /* renamed from: f */
    public C9409b f33546f;

    /* renamed from: g */
    public C68214a f33547g;

    /* renamed from: h */
    private ItemView f33548h;

    /* renamed from: i */
    private ItemView f33549i;

    /* renamed from: a */
    public final void mo17978a() {
        boolean a = this.f33545e.mo17534a();
        boolean e = this.f33542b.mo17583e();
        this.f33548h.setEnabled(a);
        ItemView itemView = this.f33549i;
        boolean z = false;
        if (e && a) {
            z = true;
        }
        itemView.setEnabled(z);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_general_section, viewGroup, false);
        int i = ItemView.a;
        ItemView findViewById = inflate.findViewById(R.id.settings_nexus_screen_context);
        ItemView findViewById2 = inflate.findViewById(R.id.settings_nexus_donate_screenshot);
        this.f33548h = findViewById;
        this.f33549i = findViewById2;
        if (this.f33542b.mo17584f()) {
            findViewById.t().setVisibility(8);
            findViewById.setOnClickListener(new C9706p(this));
        } else {
            Switch t = findViewById.t();
            t.setChecked(this.f33542b.mo17583e());
            t.setOnCheckedChangeListener(new C9705o(this));
        }
        Switch t2 = findViewById2.t();
        t2.setChecked(this.f33542b.mo17582d());
        t2.setOnCheckedChangeListener(new C9710t(this));
        mo17978a();
        ItemView findViewById3 = inflate.findViewById(R.id.settings_nexus_notifications);
        ItemView findViewById4 = inflate.findViewById(R.id.settings_nexus_notifications_button);
        if (findViewById3 != null) {
            findViewById3.u(0);
            findViewById3.setVisibility(8);
        }
        if (findViewById4 != null) {
            findViewById4.setVisibility(0);
            findViewById4.setOnClickListener(new C9709s(this));
        }
        ItemView findViewById5 = inflate.findViewById(R.id.settings_nexus_active_edge);
        int i2 = true != C58557jl.m90138s(this.f33544d.getSensorList(-1), C9707q.f33537a) ? 8 : 0;
        C58976aa aaVar = C58975e.f156826a;
        findViewById5.setVisibility(i2);
        findViewById5.setOnClickListener(new C9708r(this));
        ItemView findViewById6 = inflate.findViewById(R.id.settings_nexus_opa_chat_head);
        if (!this.f33541a.mo79746e(C90037cp.f248405M) || !this.f33541a.mo79746e(C90037cp.f248402J)) {
            findViewById6.setVisibility(8);
        } else {
            findViewById6.setVisibility(0);
            findViewById6.t().setChecked(((ai) this.f33547g.mo27525b()).c());
            findViewById6.t().setOnCheckedChangeListener(new C9703m(this));
        }
        ItemView findViewById7 = inflate.findViewById(R.id.settings_entry_point_button);
        if (!this.f33541a.mo79746e(C90037cp.f248415W)) {
            findViewById7.setVisibility(8);
        } else if (findViewById7 != null) {
            findViewById7.setVisibility(0);
            findViewById7.setOnClickListener(new C9704n(this));
        }
        return inflate;
    }
}
