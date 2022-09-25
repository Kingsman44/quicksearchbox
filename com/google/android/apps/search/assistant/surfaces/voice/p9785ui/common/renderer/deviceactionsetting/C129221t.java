package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.widget.Switch;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.t */
/* compiled from: PG */
class C129221t implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C129223v f354955a;

    public C129221t(C129223v vVar) {
        this.f354955a = vVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C59104x c = C129223v.f354958a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SettingNativeToggleCard");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(38149)).mo56386p("Failed to query toggle status.");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18078b(Object obj) {
        Boolean bool = (Boolean) obj;
        C58976aa aaVar = C58975e.f156826a;
        C129219r rVar = this.f354955a.f354959b;
        rVar.getClass();
        Switch switchR = (Switch) rVar.requireView().findViewById(R.id.assistant_setting_toggle);
        if (!this.f354955a.f354963f.f136794d) {
            switchR.setClickable(false);
        } else {
            switchR.setChecked(bool.booleanValue());
        }
    }

    /* renamed from: c */
    public final void mo18079c() {
    }
}
