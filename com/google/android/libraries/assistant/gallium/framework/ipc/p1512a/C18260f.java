package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.android.libraries.assistant.gallium.framework.C18211ao;
import com.google.android.libraries.assistant.gallium.framework.C18214ar;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18219aw;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18297q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;
import com.google.protos.p4985f.p5030q.C65214fu;
import com.google.protos.p5127o.C65673ba;
import com.google.protos.p5127o.C65674bb;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65693s;
import com.google.protos.p5127o.C65695u;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70761fa;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.f */
/* compiled from: PG */
public final class C18260f implements C18204ah {

    /* renamed from: a */
    private final C18204ah f51827a;

    /* renamed from: b */
    private final C70888j f51828b;

    public C18260f(C18204ah ahVar, C70888j jVar) {
        this.f51827a = ahVar;
        this.f51828b = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        Object obj;
        C65695u uVar = sVar.f178490c;
        if (uVar == null) {
            uVar = C65695u.f178492a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C65674bb.f178443d);
        uVar.mo58887l(r0);
        if (uVar.f169962ag.mo58857o(r0.f169971d)) {
            C65695u uVar2 = sVar.f178490c;
            if (uVar2 == null) {
                uVar2 = C65695u.f178492a;
            }
            C62940bt r1 = C62942bv.checkIsLite(C65674bb.f178443d);
            uVar2.mo58887l(r1);
            Object l = uVar2.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj = r1.f169969b;
            } else {
                obj = r1.mo58889c(l);
            }
            int a = C65673ba.m96777a(((C65674bb) obj).f178446b);
            if (a == 0 || a != 2) {
                throw new C18218av(C18219aw.m35485c(3, "For Streaming requests, expecting only one initial request with StreamContext.type == INIT."));
            }
            C65682h hVar = (C65682h) C18214ar.m35469b(sVar, C65682h.f178459f.getParserForType());
            C70888j jVar = this.f51828b;
            C70335df d = C70338di.m102603d();
            d.f187487c = C70337dh.BIDI_STREAMING;
            d.f187488d = C70338di.m102602c(C65214fu.f176497a.f178473b, str);
            d.f187489e = true;
            d.f187485a = new C18251ai(mo23686d(str));
            d.f187486b = new C18252aj(mo23687e(str));
            C70862aj b = C70876o.m103761b(jVar.mo39510a(d.mo62040a(), C70851i.f189015a), C47686k.m84827a(new C18264j((GalliumIpc) dVar, hVar, str)), true);
            C18297q qVar = new C18297q();
            C70868g gVar = (C70868g) b;
            qVar.f51916a = C58833ax.m90834k(new C18257c(gVar));
            qVar.f51917b = C58833ax.m90834k(new C18258d(dVar, hVar, gVar));
            return C60856cj.m92900i(C18214ar.m35470c(dVar.mo23658b(hVar, qVar), "type.googleapis.com/gallium.Handle"));
        }
        ((C59052c) ((C59052c) C18265k.f51839a.mo56226d()).mo56372aa(47075)).mo56389s("Outgoing gRPC call: %s", str);
        C70888j jVar2 = this.f51828b;
        C70335df d2 = C70338di.m102603d();
        d2.f187487c = C70337dh.UNARY;
        d2.f187488d = C70338di.m102602c(C65214fu.f176497a.f178473b, str);
        d2.f187489e = true;
        d2.f187485a = new C18251ai(mo23686d(str));
        d2.f187486b = new C18252aj(mo23687e(str));
        C60870cx a2 = C70876o.m103760a(jVar2.mo39510a(d2.mo62040a(), C70851i.f189015a), sVar);
        C18259e eVar = C18259e.f51826a;
        return C60846c.m92879h(a2, C70761fa.class, C47810es.m84966f(eVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        return hVar;
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return C65214fu.f176497a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        return this.f51827a.mo23686d(str);
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        return this.f51827a.mo23687e(str);
    }
}
