package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.databinding.C0118a;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C58979ad;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.aa */
/* compiled from: PG */
public final /* synthetic */ class C33268aa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C33272ae f89218a;

    public /* synthetic */ C33268aa(C33272ae aeVar) {
        this.f89218a = aeVar;
    }

    public final void onClick(View view) {
        C33182g gVar;
        C33272ae aeVar = this.f89218a;
        C51941eu euVar = aeVar.f89231b;
        if (euVar == null || (gVar = aeVar.f89232c) == null || aeVar.f89234e == null) {
            C0118a.m96d(C33272ae.f89230a.mo56226d(), "Failed to handle onClick due to invalid args", 51035, C58979ad.SMALL);
            return;
        }
        aeVar.f89234e.mo38366c("FA ContactSelection", C33272ae.m61871a(euVar, gVar.mo38576a(), C52479tg.f137757d));
    }
}
