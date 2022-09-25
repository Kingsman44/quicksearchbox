package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9290f.C122878e;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.p1503a.p1504a.C18193d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5127o.C65677c;
import com.google.protos.p5127o.C65678d;
import com.google.protos.p5127o.C65680f;
import com.google.protos.p5127o.C65681g;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65690p;
import com.google.protos.p5127o.C65691q;
import com.google.protos.p5127o.C65693s;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70857ae;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.ad */
/* compiled from: PG */
public final class C18246ad implements C70857ae {

    /* renamed from: a */
    public static final C59071e f51805a = C59071e.m91332i("com.google.android.libraries.assistant.gallium.framework.ipc.a.ad");

    /* renamed from: b */
    public final C70716eu f51806b;

    /* renamed from: c */
    private final String f51807c;

    /* renamed from: d */
    private final C70338di f51808d;

    /* renamed from: e */
    private final C122878e f51809e;

    public C18246ad(C70716eu euVar, String str, C70338di diVar, C122878e eVar) {
        this.f51806b = euVar;
        this.f51807c = str;
        this.f51808d = diVar;
        this.f51809e = eVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo20119b(Object obj, C70862aj ajVar) {
        C65693s sVar = (C65693s) obj;
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        String str = this.f51806b.f188456a;
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = str;
        if (!C58837ba.m90859h(this.f51807c)) {
            String str2 = this.f51807c;
            kVar.copyOnWrite();
            C65686l lVar2 = (C65686l) kVar.instance;
            str2.getClass();
            lVar2.f178472a |= 2;
            lVar2.f178474c = str2;
        }
        C65677c cVar = (C65677c) C65678d.f178449e.createBuilder();
        C65681g gVar = (C65681g) C65682h.f178459f.createBuilder();
        gVar.copyOnWrite();
        C65682h hVar = (C65682h) gVar.instance;
        C65686l lVar3 = (C65686l) kVar.build();
        lVar3.getClass();
        hVar.f178462b = lVar3;
        hVar.f178461a |= 1;
        cVar.copyOnWrite();
        C65678d dVar = (C65678d) cVar.instance;
        C65682h hVar2 = (C65682h) gVar.build();
        hVar2.getClass();
        dVar.f178452b = hVar2;
        dVar.f178451a |= 1;
        String b = C70338di.m102601b(this.f51808d.f187497b);
        cVar.copyOnWrite();
        C65678d dVar2 = (C65678d) cVar.instance;
        b.getClass();
        dVar2.f178451a |= 2;
        dVar2.f178453c = b;
        C65690p pVar = (C65690p) C65691q.f178480e.createBuilder();
        C65680f fVar = C18231d.f51786a;
        pVar.copyOnWrite();
        C65691q qVar = (C65691q) pVar.instance;
        fVar.getClass();
        qVar.f178484c = fVar;
        qVar.f178483b = 2;
        cVar.copyOnWrite();
        C65678d dVar3 = (C65678d) cVar.instance;
        C65691q qVar2 = (C65691q) pVar.build();
        qVar2.getClass();
        dVar3.f178454d = qVar2;
        dVar3.f178451a |= 4;
        C18193d.m35416a(C60922j.m93045h(this.f51809e.mo105772a(), C47810es.m84966f(new C18243aa(this, (C65678d) cVar.build(), sVar)), C60826bg.f164896a), new C18244ab(ajVar), new C18245ac(ajVar), C60826bg.f164896a);
    }
}
