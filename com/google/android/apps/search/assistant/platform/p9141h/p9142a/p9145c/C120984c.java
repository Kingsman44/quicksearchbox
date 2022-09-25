package com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c;

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

/* renamed from: com.google.android.apps.search.assistant.platform.h.a.c.c */
/* compiled from: PG */
public class C120984c extends C70723a {
    public C120984c() {
        this(C69586p.f185991a);
    }

    /* renamed from: c */
    public Object mo105017c(C120989h hVar) {
        throw null;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = C120982a.f336339a;
        if (euVar == null) {
            synchronized (C120982a.class) {
                euVar = C120982a.f336339a;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.search.assistant.platform.settingsdata.changenotification.proto.ChangeNotificationListenerService");
                    etVar.mo62433a(C120982a.m200279a());
                    euVar = new C70716eu(etVar);
                    C120982a.f336339a = euVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        C70710eo.m103395c(C70735al.m103425c(this.f188460t, C120982a.m200279a(), new C120983b(this)), str, hashMap);
        return C70710eo.m103393a(str, euVar, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120984c(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "coroutineContext");
    }
}
