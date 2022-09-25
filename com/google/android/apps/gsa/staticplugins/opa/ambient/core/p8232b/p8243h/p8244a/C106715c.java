package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.p8244a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106712a;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import com.google.protobuf.MessageLite;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.h.a.c */
/* compiled from: PG */
public final /* synthetic */ class C106715c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106717e f297416a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f297417b;

    public /* synthetic */ C106715c(C106717e eVar, MessageLite messageLite) {
        this.f297416a = eVar;
        this.f297417b = messageLite;
    }

    public final Object apply(Object obj) {
        C106717e eVar = this.f297416a;
        MessageLite messageLite = this.f297417b;
        C58480gp e = C58485gu.m89837e();
        for (C65768az azVar : ((C65033ar) obj).f176113a) {
            try {
                C63010eb parserForType = messageLite.getParserForType();
                C63070h hVar = azVar.f178799e;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                MessageLite messageLite2 = (MessageLite) parserForType.mo59011j(hVar.f170218b, C62921ba.m95368a());
                C65139d dVar = azVar.f178796b;
                if (dVar == null) {
                    dVar = C65139d.f176307e;
                }
                e.mo55395g(new C106712a(messageLite2, dVar.f176310b));
            } catch (C62974ct e2) {
                ((C58970a) ((C58970a) ((C58970a) eVar.f297421a.mo56225c()).mo56382g(e2)).mo56372aa(23185)).mo56386p("Invalid element read from Geller.");
            }
        }
        return e.mo55394f();
    }
}
