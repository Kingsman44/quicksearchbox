package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.app.C0356aq;
import android.support.p033v7.app.C0383d;
import android.support.p033v7.app.C0395p;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.assistant.settings.shared.ui.PageDescriptionView;
import com.google.android.apps.gsa.assistant.shared.cc;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.l */
/* compiled from: PG */
public final class C9702l extends C9715y {

    /* renamed from: a */
    public h f33528a;

    /* renamed from: b */
    public C86124t f33529b;

    /* renamed from: c */
    public C68214a f33530c;

    /* renamed from: d */
    public C68214a f33531d;

    /* renamed from: e */
    public String f33532e;

    /* renamed from: f */
    private static String m24418f(String str, String str2, String str3) {
        return str + str2 + "_" + str3;
    }

    /* renamed from: b */
    public final void mo17970b(View view) {
        ItemView findViewById = view.findViewById(R.id.settings_nexus_dreamliner_dock_ambient_display_toggle);
        Switch t = findViewById.t();
        Account a = this.f33528a.a();
        if (a != null && this.f33532e != null) {
            t.setChecked(((SharedPreferences) this.f33530c.mo27525b()).getBoolean(m24418f("ambient_display_enabled_", a.name, this.f33532e), false));
            findViewById.setEnabled(((cc) this.f33531d.mo27525b()).c(a, this.f33532e));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("device_id");
            this.f33532e = string;
            if (string == null) {
                this.f33532e = arguments.getString("assistant_device_id");
            }
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0167am activity = getActivity();
        if (activity instanceof C0395p) {
            C0356aq aqVar = (C0356aq) ((C0395p) activity).mo1322k();
            aqVar.mo1163P();
            C0383d dVar = aqVar.f1215o;
            if (dVar != null) {
                dVar.mo1227E();
                dVar.mo1244o(BuildConfig.FLAVOR);
            }
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_nexus_dreamliner_dock_content, (ViewGroup) null, false);
        PageDescriptionView findViewById = inflate.findViewById(R.id.settings_nexus_dreamliner_dock_page_description);
        findViewById.e(R.string.assistant_settings_dreamliner_dock_page_name);
        findViewById.c(R.string.assistant_settings_dreamliner_dock_page_description);
        ItemView findViewById2 = inflate.findViewById(R.id.settings_nexus_dreamliner_dock_trusted);
        findViewById2.p(findViewById2.f(R.string.dreamliner_dock_trusted_item_title));
        findViewById2.o(Html.fromHtml(getResources().getString(R.string.dreamliner_dock_trusted_item_summary)));
        findViewById2.d().setLinksClickable(true);
        findViewById2.d().setMovementMethod(LinkMovementMethod.getInstance());
        Account a = this.f33528a.a();
        if (!(this.f33532e == null || a == null)) {
            ((Switch) inflate.findViewById(R.id.itemview_control_switch)).setChecked(((cc) this.f33531d.mo27525b()).c(a, this.f33532e));
        }
        ItemView findViewById3 = inflate.findViewById(R.id.settings_nexus_dreamliner_dock_pf_toggle);
        findViewById3.p(findViewById3.f(R.string.dreamliner_dock_photo_frame_toggle_item_title));
        findViewById3.o(findViewById3.f(R.string.dreamliner_dock_photo_frame_toggle_item_summary));
        ItemView findViewById4 = inflate.findViewById(R.id.settings_nexus_dreamliner_dock_pf);
        Switch t = findViewById3.t();
        Account a2 = this.f33528a.a();
        if (!(a2 == null || this.f33532e == null)) {
            String f = m24418f("opa_pf_enabled_", a2.name, this.f33532e);
            t.setChecked(((SharedPreferences) this.f33530c.mo27525b()).getBoolean(f, false));
            t.setOnCheckedChangeListener(new C9700j(this, f, findViewById4));
        }
        ItemView findViewById5 = inflate.findViewById(R.id.settings_nexus_dreamliner_dock_pf);
        findViewById5.h(R.drawable.quantum_ic_photo_library_grey600_48);
        findViewById5.p(findViewById5.f(R.string.dreamliner_dock_photo_frame_item_title));
        Account a3 = this.f33528a.a();
        if (!(a3 == null || this.f33532e == null)) {
            findViewById5.setEnabled(((SharedPreferences) this.f33530c.mo27525b()).getBoolean(m24418f("opa_pf_enabled_", a3.name, this.f33532e), false));
        }
        findViewById5.setOnClickListener(new C9698h(this));
        ((Switch) inflate.findViewById(R.id.itemview_control_switch)).setOnCheckedChangeListener(new C9699i(this, this.f33528a.a(), inflate));
        if (this.f33529b.mo79746e(C90014bt.f247167bz)) {
            ItemView findViewById6 = inflate.findViewById(R.id.settings_nexus_dreamliner_dock_ambient_display_toggle);
            findViewById6.setVisibility(0);
            findViewById6.p(findViewById6.f(R.string.nexus_device_dreamliner_ambient_display_setting_title));
            findViewById6.o(findViewById6.f(R.string.nexus_device_dreamliner_ambient_display_setting_summary));
            findViewById6.d().setLinksClickable(true);
            findViewById6.d().setMovementMethod(LinkMovementMethod.getInstance());
            Switch t2 = findViewById6.t();
            Account a4 = this.f33528a.a();
            if (!(a4 == null || this.f33532e == null)) {
                t2.setOnCheckedChangeListener(new C9701k(this, m24418f("ambient_display_enabled_", a4.name, this.f33532e), findViewById6));
            }
            mo17970b(inflate);
        }
        return inflate;
    }
}
