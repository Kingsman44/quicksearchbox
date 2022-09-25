package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.preference.SwitchPreference;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92603b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.s */
/* compiled from: PG */
final class C92624s extends C92603b {

    /* renamed from: a */
    final /* synthetic */ C92625t f258520a;

    public C92624s(C92625t tVar) {
        this.f258520a = tVar;
    }

    /* renamed from: d */
    public final void mo87356d(boolean z) {
        C92625t tVar = this.f258520a;
        C58976aa aaVar = C58975e.f156826a;
        SwitchPreference switchPreference = tVar.f258521a;
        if (switchPreference == null) {
            return;
        }
        if (z) {
            switchPreference.setChecked(true);
            tVar.f258521a.setEnabled(false);
            return;
        }
        switchPreference.setEnabled(true);
    }
}
