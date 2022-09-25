package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.shared.i.a;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.e */
/* compiled from: PG */
public final class C9695e extends C9713w {

    /* renamed from: a */
    public C86124t f33503a;

    /* renamed from: b */
    public SharedPreferences f33504b;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.fragment_debug_section, viewGroup, false);
        inflate.findViewById(R.id.settings_nexus_debug_header).c("Debug Options");
        int i = ItemView.a;
        ItemView findViewById = inflate.findViewById(R.id.settings_nexus_debug_synastry);
        int i2 = 8;
        findViewById.setVisibility(true != this.f33503a.mo79746e(C90014bt.f247587jv) ? 8 : 0);
        findViewById.p("Synastry");
        findViewById.t().setChecked(a.b(context));
        findViewById.t().setOnCheckedChangeListener(new C9693c(this));
        ItemView findViewById2 = inflate.findViewById(R.id.settings_nexus_debug_hotword);
        if (true == this.f33503a.mo79746e(C90082eg.f249872O)) {
            i2 = 0;
        }
        findViewById2.setVisibility(i2);
        findViewById2.p("Debug Hotword");
        findViewById2.t().setOnCheckedChangeListener(new C9694d(this));
        findViewById2.t().setChecked(this.f33504b.getBoolean("speech_hotword_toast_debug", false));
        return inflate;
    }
}
