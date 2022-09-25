package com.google.android.apps.gsa.staticplugins.fedass.p7941c.p7942a;

import com.google.android.apps.gsa.staticplugins.fedass.p7941c.p7943b.C100818b;
import com.google.android.apps.gsa.staticplugins.fedass.p7947f.C100848a;
import com.google.android.libraries.geller.C21768d;
import com.google.android.libraries.geller.C21877g;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p5129p.p5130a.C65712ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.c.a.c */
/* compiled from: PG */
public final class C100815c implements C100848a {

    /* renamed from: a */
    public static final C59071e f281767a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.c.a.c");

    /* renamed from: b */
    public final int f281768b;

    /* renamed from: c */
    public C21877g f281769c;

    /* renamed from: d */
    private final C32160b f281770d;

    /* renamed from: e */
    private final C100818b f281771e;

    public C100815c(C100818b bVar, C32160b bVar2, int i) {
        this.f281771e = bVar;
        this.f281770d = bVar2;
        this.f281768b = i;
    }

    /* renamed from: a */
    public final C60870cx mo92066a(String str, byte[] bArr, byte[] bArr2) {
        C59104x b = f281767a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NluCollAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(19560)).mo56386p("initialize()");
        try {
            C62921ba a = C62921ba.m95368a();
            C60870cx b2 = this.f281771e.mo92071b();
            C60870cx b3 = this.f281770d.mo37974b();
            return C47638k.m84753d(b2, b3).mo51521b(new C100814b(this, b3, b2, (C65712ak) C62942bv.parseFrom((C62942bv) C65712ak.f178531c, bArr2, a)), C60826bg.f164896a);
        } catch (C62974ct e) {
            C59104x c = f281767a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NluCollAdapter");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19561)).mo56386p("Trying to parse invalid inputs.");
            return C60856cj.m92900i(false);
        }
    }

    /* renamed from: b */
    public final C60870cx mo92067b() {
        C60870cx cxVar;
        C59104x b = f281767a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NluCollAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(19563)).mo56386p("next()");
        C21877g gVar = this.f281769c;
        if (gVar.mo27170b()) {
            cxVar = C60856cj.m92900i(false);
        } else if (!gVar.f60369a.isEmpty()) {
            cxVar = C60856cj.m92900i(true);
        } else {
            cxVar = C47633f.m84733g(gVar.mo27169a(5)).mo51515h(new C21768d(gVar), gVar.f60370b);
        }
        return C47633f.m84733g(cxVar).mo51516i(new C100813a(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo92068c(int i) {
        C59104x b = f281767a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NluCollAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(19564)).mo56387q("request() with [%d] examples.", i);
        return this.f281769c.mo27169a(i);
    }

    public final void close() {
        C59104x b = f281767a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NluCollAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(19565)).mo56386p("close()");
    }
}
