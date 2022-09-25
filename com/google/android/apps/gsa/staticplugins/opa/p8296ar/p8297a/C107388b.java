package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8297a;

import com.google.android.apps.gsa.opa.p6443g.p6444a.C83680a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83690i;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83691j;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83692a;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83693b;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.a.b */
/* compiled from: PG */
public final class C107388b extends C83680a {

    /* renamed from: a */
    private static final C59071e f298881a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ar.a.b");

    /* renamed from: b */
    private final C83692a f298882b;

    /* renamed from: c */
    private final C83693b f298883c;

    public C107388b(C83692a aVar, C83693b bVar) {
        this.f298882b = aVar;
        this.f298883c = bVar;
    }

    /* renamed from: a */
    public final void mo77007a() {
        try {
            C90877ak.m148472f(this.f298883c.mo77015a());
        } catch (InterruptedException | ExecutionException e) {
            C59104x c = f298881a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PapiTestService");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25395)).mo56386p("Failed clearing Proactive API state.");
        }
    }

    /* renamed from: b */
    public final byte[] mo77008b() {
        C60870cx c = this.f298882b.mo77011c();
        C60870cx a = this.f298882b.mo77009a();
        C60870cx a2 = C60856cj.m92895d(c, a).mo57334a(new C107387a(a, c), C60826bg.f164896a);
        try {
            C83690i iVar = (C83690i) C83691j.f228128b.createBuilder();
            Iterable iterable = (Iterable) C90877ak.m148472f(a2);
            iVar.copyOnWrite();
            C83691j jVar = (C83691j) iVar.instance;
            C62971cq cqVar = jVar.f228130a;
            if (!cqVar.mo58948c()) {
                jVar.f228130a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(iterable, (List) jVar.f228130a);
            return ((C83691j) iVar.build()).toByteArray();
        } catch (InterruptedException | ExecutionException e) {
            C59104x c2 = f298881a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "PapiTestService");
            ((C59052c) ((C59052c) c2).mo56372aa(25396)).mo56389s("Cannot read journey state: %s", e.getMessage());
            return new byte[0];
        }
    }
}
