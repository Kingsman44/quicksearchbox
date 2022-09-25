package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.av.aq;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.as */
/* compiled from: PG */
public final /* synthetic */ class C101655as implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C101661ay f283666a;

    public /* synthetic */ C101655as(C101661ay ayVar) {
        this.f283666a = ayVar;
    }

    public final void onClick(View view) {
        C101661ay ayVar = this.f283666a;
        dn dnVar = ayVar.f283671c;
        String str = ayVar.f283670b;
        aq createBuilder = ar.f.createBuilder();
        C45595b bVar = C45595b.GOOGLE_ASSISTANT_ANDROID_SLA_DEVICE_OOBE_ENROLLMENT;
        createBuilder.copyOnWrite();
        ar arVar = createBuilder.instance;
        arVar.b = bVar.f119929nK;
        arVar.a |= 1;
        dnVar.s(str, true, createBuilder.build());
        C47393f.m84236g(new C101783w(), ayVar.f283669a);
    }
}
