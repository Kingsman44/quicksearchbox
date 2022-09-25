package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52351on;
import com.google.assistant.p3897e.p3921j.afn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.a.j */
/* compiled from: PG */
final class C126932j implements C119908e {

    /* renamed from: a */
    private static final C59071e f349463a = C59071e.m91331h();

    /* renamed from: b */
    private final C69464a f349464b;

    /* renamed from: c */
    private final C51809dy f349465c;

    public C126932j(C69464a aVar, C51809dy dyVar) {
        C69664n.m101061g(aVar, "performer");
        C69664n.m101061g(dyVar, "clientOp");
        this.f349464b = aVar;
        this.f349465c = dyVar;
    }

    /* renamed from: a */
    public final C60870cx mo104299a() {
        try {
            C60870cx a = ((C35472h) this.f349464b.mo17428b()).mo20766a(this.f349465c);
            C69664n.m101060f(a, "{\n      performer.get().perform(clientOp)\n    }");
            return a;
        } catch (Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) f349463a.mo56225c()).mo56382g(th);
            String str = this.f349465c.f135936b;
            cVar.mo56379ah(new C59094n(37301));
            cVar.mo56389s("Failed to execute client op [%s]", str);
            C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
            C69664n.m101060f(dzVar, "newBuilder()");
            C52351on a2 = C69664n.m101061g(dzVar, "builder");
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C69664n.m101060f(kdVar, "newBuilder()");
            afn a3 = C69664n.m101061g(kdVar, "builder");
            a3.mo53687b(C52235kf.INTERNAL);
            a2.mo53842b(a3.mo53686a());
            return C60856cj.m92900i(a2.mo53841a());
        }
    }

    /* renamed from: b */
    public final void mo104300b() {
    }
}
