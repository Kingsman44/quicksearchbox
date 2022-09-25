package com.google.android.apps.search.googleapp.compliance.p10147d;

import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.googleapp.compliance.d.l */
/* compiled from: PG */
public final /* synthetic */ class C133636l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133637m f364028a;

    public /* synthetic */ C133636l(C133637m mVar) {
        this.f364028a = mVar;
    }

    public final C60870cx apply(Object obj) {
        C133637m mVar = this.f364028a;
        C61366ah ahVar = (C61366ah) obj;
        for (String startsWith : ahVar.f165945a.mo55277g(C61362ad.m93870b("Set-Cookie"))) {
            if (startsWith.startsWith("NID=")) {
                mVar.f364034f.mo19974a(C37182a.f98087gA.mo40805c(C62722b.OK));
                return C47633f.m84733g(C60856cj.m92900i(ahVar));
            }
        }
        ((C59052c) ((C59052c) C133637m.f364029a.mo56226d()).mo56372aa(40067)).mo56386p("Zwieback cookie missing from setprefs call");
        return C47633f.m84733g(C60856cj.m92899h(new C133626b("No Zwieback in set-cookie header.")));
    }
}
