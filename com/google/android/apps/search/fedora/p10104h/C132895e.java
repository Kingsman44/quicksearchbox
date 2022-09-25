package com.google.android.apps.search.fedora.p10104h;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100746l;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100750p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.h.e */
/* compiled from: PG */
public final /* synthetic */ class C132895e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132899i f362534a;

    /* renamed from: b */
    public final /* synthetic */ boolean f362535b;

    /* renamed from: c */
    public final /* synthetic */ C63042fg f362536c;

    public /* synthetic */ C132895e(C132899i iVar, boolean z, C63042fg fgVar) {
        this.f362534a = iVar;
        this.f362535b = z;
        this.f362536c = fgVar;
    }

    public final C60870cx apply(Object obj) {
        C132899i iVar = this.f362534a;
        boolean z = this.f362535b;
        C63042fg fgVar = this.f362536c;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) C132899i.f362538a.mo56226d()).mo56372aa(39879)).mo56386p("Got invalid Google account.");
            return C60866ct.f164955a;
        }
        C47633f g = C47633f.m84733g(C60856cj.m92897f(((C100719ab) iVar.f362541d.mo17428b()).mo92025i((String) optional.get(), new C100746l(z)), ((C100719ab) iVar.f362541d.mo17428b()).mo92025i((String) optional.get(), new C100750p(fgVar))));
        C132898h hVar = new C132898h();
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(hVar), iVar.f362542e);
        return C60866ct.f164955a;
    }
}
