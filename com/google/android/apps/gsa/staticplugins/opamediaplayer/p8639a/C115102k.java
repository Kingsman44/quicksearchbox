package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8639a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.a.k */
/* compiled from: PG */
public final /* synthetic */ class C115102k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C89012aj f319498a;

    /* renamed from: b */
    public final /* synthetic */ C86124t f319499b;

    public /* synthetic */ C115102k(C89012aj ajVar, C86124t tVar) {
        this.f319498a = ajVar;
        this.f319499b = tVar;
    }

    public final C60870cx apply(Object obj) {
        C89012aj ajVar = this.f319498a;
        C86124t tVar = this.f319499b;
        String str = (String) obj;
        if (str != null) {
            return ajVar.mo27501m(tVar.mo79758x(C90125fw.f250907X), (int) tVar.mo79743a(C90125fw.f250908Y), (C70334de) null, str, 83);
        }
        throw new C70761fa(Status.f186909g, (C70334de) null, true);
    }
}
