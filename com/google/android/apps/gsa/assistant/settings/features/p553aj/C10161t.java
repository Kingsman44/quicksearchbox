package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.widget.CompoundButton;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.t */
/* compiled from: PG */
public final /* synthetic */ class C10161t implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10166y f34547a;

    public /* synthetic */ C10161t(C10166y yVar) {
        this.f34547a = yVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10166y yVar = this.f34547a;
        C58976aa aaVar = C58975e.f156826a;
        if (z && yVar.f34568p) {
            yVar.f34568p = false;
            yVar.f34566n.b(false);
        }
        yVar.f34554b.mo18290b(z);
        yVar.mo18307d();
    }
}
