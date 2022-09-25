package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a;

import java.util.HashMap;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5526f.C70723a;
import p5488io.grpc.p5526f.C70735al;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.f.a.r */
/* compiled from: PG */
public class C127604r extends C70723a {
    public C127604r() {
        this(C69586p.f185991a);
    }

    /* renamed from: b */
    public Object mo108145b(C127597k kVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C127602p.f351303a;
        if (euVar == null) {
            synchronized (C127602p.class) {
                euVar = C127602p.f351303a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.settings.api.SettingsChangeService");
                    etVar.mo62433a(C127602p.m208600a());
                    euVar = new C70716eu(etVar);
                    C127602p.f351303a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C127602p.m208600a(), new C127603q(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127604r(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
