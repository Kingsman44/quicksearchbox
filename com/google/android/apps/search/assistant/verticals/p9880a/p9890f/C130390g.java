package com.google.android.apps.search.assistant.verticals.p9880a.p9890f;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122468w;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9308c.C123209c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9308c.C123210d;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32488a;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32489b;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32490c;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32491d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5048z.p5049a.p5050a.C65387f;
import com.google.protos.p4985f.p5048z.p5049a.p5050a.C65392k;
import com.google.protos.p4985f.p5048z.p5049a.p5050a.C65395n;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.f.g */
/* compiled from: PG */
public final class C130390g implements C65395n {

    /* renamed from: a */
    public static final /* synthetic */ int f357325a = 0;

    /* renamed from: c */
    private final C123210d f357326c;

    public C130390g(C123210d dVar) {
        this.f357326c = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo59376a(C65387f fVar) {
        C60870cx a = this.f357326c.f340918a.mo105538a(C122468w.f339526b, C62912at.f169862a);
        C130384a aVar = new C130384a(fVar);
        return C60922j.m93044g(a, C47810es.m84963c(aVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo59377b(C65392k kVar) {
        C123210d dVar = this.f357326c;
        C32488a aVar = (C32488a) C32491d.f87062c.createBuilder();
        C32489b bVar = (C32489b) C32490c.f87059b.createBuilder();
        C62971cq cqVar = kVar.f177808a;
        bVar.copyOnWrite();
        C32490c cVar = (C32490c) bVar.instance;
        C62971cq cqVar2 = cVar.f87061a;
        if (!cqVar2.mo58948c()) {
            cVar.f87061a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) cVar.f87061a);
        aVar.copyOnWrite();
        C32491d dVar2 = (C32491d) aVar.instance;
        C32490c cVar2 = (C32490c) bVar.build();
        cVar2.getClass();
        dVar2.f87066b = cVar2;
        dVar2.f87065a |= 1;
        C32491d dVar3 = (C32491d) aVar.build();
        return C60922j.m93044g(C60922j.m93044g(dVar.f340918a.mo105538a(C122468w.f339527c, dVar3), C47810es.m84963c(new C123209c(dVar3)), C60826bg.f164896a), C47810es.m84963c(C130389f.f357324a), C60826bg.f164896a);
    }
}
