package com.google.android.apps.gsa.speech.settingsui.hotword.base;

import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.base.e */
/* compiled from: PG */
public final /* synthetic */ class C92606e implements C89784a {

    /* renamed from: a */
    public final /* synthetic */ HotwordSettingsFragmentBase f258449a;

    public /* synthetic */ C92606e(HotwordSettingsFragmentBase hotwordSettingsFragmentBase) {
        this.f258449a = hotwordSettingsFragmentBase;
    }

    /* renamed from: a */
    public final void mo49086a(Object obj) {
        HotwordSettingsFragmentBase hotwordSettingsFragmentBase = this.f258449a;
        if (((Boolean) obj).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            C92597d dVar = hotwordSettingsFragmentBase.f258442g;
            if (dVar != null) {
                dVar.mo87376j();
                hotwordSettingsFragmentBase.f258442g.mo87374h();
            }
            hotwordSettingsFragmentBase.f258439d.mo87383b(true);
            hotwordSettingsFragmentBase.f258439d.mo87384c();
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        if (hotwordSettingsFragmentBase.mo87381f()) {
            hotwordSettingsFragmentBase.getActivity().onBackPressed();
        }
    }
}
