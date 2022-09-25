package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.view.View;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.be */
/* compiled from: PG */
public final /* synthetic */ class C9690be implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C9692bg f33486a;

    /* renamed from: b */
    public final /* synthetic */ C89062r f33487b;

    public /* synthetic */ C9690be(C9692bg bgVar, C89062r rVar) {
        this.f33486a = bgVar;
        this.f33487b = rVar;
    }

    public final void run() {
        View findViewById;
        C9692bg bgVar = this.f33486a;
        boolean a = this.f33487b.mo83040a();
        View view = bgVar.getView();
        if (view != null && (findViewById = view.findViewById(R.id.settings_nexus_speech_output)) != null) {
            findViewById.setEnabled(a);
        }
    }
}
