package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ak */
/* compiled from: PG */
public final /* synthetic */ class C132592ak implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132606ay f361853a;

    public /* synthetic */ C132592ak(C132606ay ayVar) {
        this.f361853a = ayVar;
    }

    public final C60870cx apply(Object obj) {
        C132606ay ayVar = this.f361853a;
        if (!((Boolean) obj).booleanValue()) {
            C38683aa aaVar = ayVar.f361885b;
            C38725y d = C38726z.m68011d(C39226b.TAG_ASSISTANT_WIDGET);
            ((C38570a) d).f101954b = 1;
            C60870cx b = aaVar.mo41548b(d.mo41492a());
            C132594am amVar = C132594am.f361855a;
            return C60922j.m93044g(b, C47810es.m84963c(amVar), ayVar.f361888e);
        }
        ((C59052c) ((C59052c) C132606ay.f361884a.mo56226d()).mo56372aa(39738)).mo56386p("AADC is not granted");
        throw new C132574a();
    }
}
