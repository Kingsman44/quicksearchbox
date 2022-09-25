package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.widget.CompoundButton;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.u */
/* compiled from: PG */
final class C129222u implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ C129223v f354956a;

    /* renamed from: b */
    private final String f354957b;

    public C129222u(C129223v vVar, String str) {
        this.f354956a = vVar;
        this.f354957b = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str = true != z ? "0" : "1";
        C58976aa aaVar = C58975e.f156826a;
        this.f354956a.f354961d.mo108896d(str, this.f354957b);
    }
}
