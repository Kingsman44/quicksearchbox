package com.google.android.apps.gsa.staticplugins.settings;

import android.content.ComponentName;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.b */
/* compiled from: PG */
public final /* synthetic */ class C117310b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C117311c f325647a;

    public /* synthetic */ C117310b(C117311c cVar) {
        this.f325647a = cVar;
    }

    public final void run() {
        C117311c cVar = this.f325647a;
        C58976aa aaVar = C58975e.f156826a;
        ComponentName componentName = cVar.f325650c;
        boolean a = cVar.f325651d.mo103258a();
        try {
            int componentEnabledSetting = cVar.f325649b.getComponentEnabledSetting(componentName);
            int i = true != a ? 2 : 1;
            if (componentEnabledSetting != i) {
                cVar.f325649b.setComponentEnabledSetting(componentName, i, 1);
            }
        } catch (IllegalArgumentException e) {
            C59104x c = C117311c.f325648a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AssistantSettings");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(32817)).mo56386p("Couldn't find settings entry component!");
        }
    }
}
