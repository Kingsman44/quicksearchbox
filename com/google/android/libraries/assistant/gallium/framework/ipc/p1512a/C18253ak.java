package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p5127o.C65670ay;
import com.google.protos.p5127o.C65674bb;
import com.google.protos.p5127o.C65680f;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65693s;
import com.google.protos.p5127o.C65699y;
import java.util.logging.Level;
import p3186j$.util.Optional;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.ak */
/* compiled from: PG */
public final class C18253ak {

    /* renamed from: a */
    public static final C59071e f51818a = C59071e.m91332i("com.google.android.libraries.assistant.gallium.framework.ipc.a.ak");

    /* renamed from: a */
    public static GalliumIpc m35562a(Optional optional, String str) {
        return (GalliumIpc) optional.orElseThrow(new C18248af(str));
    }

    /* renamed from: b */
    public static C60870cx m35563b(GalliumIpc galliumIpc, String str, C65682h hVar, C65699y yVar) {
        C18238f fVar = new C18238f();
        C62940bt btVar = C65674bb.f178443d;
        C65670ay ayVar = (C65670ay) C65674bb.f178442c.createBuilder();
        ayVar.copyOnWrite();
        C65674bb bbVar = (C65674bb) ayVar.instance;
        bbVar.f178446b = 3;
        bbVar.f178445a |= 1;
        fVar.f51797a.mo58885m(btVar, (C65674bb) ayVar.build());
        return C60922j.m93045h(galliumIpc.mo23657a(C18231d.f51786a, hVar, str, yVar, "type.googleapis.com/gallium.Status", C63070h.f170215c.getParserForType(), fVar), C47810es.m84966f(C18249ag.f51812a), galliumIpc.f51694g);
    }

    /* renamed from: c */
    public static C60870cx m35564c(C65693s sVar, GalliumIpc galliumIpc, C65682h hVar, String str) {
        C18238f fVar = new C18238f();
        C62940bt btVar = C65674bb.f178443d;
        C65670ay ayVar = (C65670ay) C65674bb.f178442c.createBuilder();
        ayVar.copyOnWrite();
        C65674bb bbVar = (C65674bb) ayVar.instance;
        bbVar.f178446b = 2;
        bbVar.f178445a |= 1;
        fVar.f51797a.mo58885m(btVar, (C65674bb) ayVar.build());
        C65680f fVar2 = C18231d.f51786a;
        C63070h hVar2 = sVar.f178489b;
        if (hVar2 == null) {
            hVar2 = C63070h.f170215c;
        }
        C63088z zVar = hVar2.f170218b;
        C63070h hVar3 = sVar.f178489b;
        if (hVar3 == null) {
            hVar3 = C63070h.f170215c;
        }
        return C60922j.m93045h(galliumIpc.mo23665m(fVar2, hVar, str, zVar, hVar3.f170217a, fVar.mo23735a()), C47810es.m84966f(C18247ae.f51810a), galliumIpc.f51694g);
    }

    /* renamed from: d */
    public static Status m35565d(C65699y yVar) {
        Status fromCodeValue = Status.fromCodeValue(yVar.f178503b);
        return !yVar.f178504c.isEmpty() ? fromCodeValue.withDescription(yVar.f178504c) : fromCodeValue;
    }

    /* renamed from: e */
    public static void m35566e(C60870cx cxVar, String str, Level level, C70862aj ajVar) {
        C18250ah ahVar = new C18250ah(str, level, ajVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(ahVar), C60826bg.f164896a);
    }
}
