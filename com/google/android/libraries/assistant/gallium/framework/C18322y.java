package com.google.android.libraries.assistant.gallium.framework;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import com.google.protos.p5127o.C65697w;
import com.google.protos.p5127o.C65699y;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.y */
/* compiled from: PG */
public final /* synthetic */ class C18322y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C63010eb f51963a;

    public /* synthetic */ C18322y(C63010eb ebVar) {
        this.f51963a = ebVar;
    }

    public final C60870cx apply(Object obj) {
        C63070h hVar;
        C63010eb ebVar = this.f51963a;
        C65697w wVar = (C65697w) obj;
        int i = GalliumIpc.f51688h;
        int i2 = wVar.f178497a;
        if (i2 != 2) {
            if (i2 == 1) {
                hVar = (C63070h) wVar.f178498b;
            } else {
                hVar = C63070h.f170215c;
            }
            return C60856cj.m92900i(C18214ar.m35468a(hVar, ebVar, "Response"));
        }
        throw new C18218av((C65699y) wVar.f178498b);
    }
}
