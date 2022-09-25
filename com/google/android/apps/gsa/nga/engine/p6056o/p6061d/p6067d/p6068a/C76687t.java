package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b.p6065a.C76627c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.C76692c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6075h.C76719b;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76741a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76746f;
import com.google.android.apps.gsa.nga.engine.recognition.C77551ad;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122444ci;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122459n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4985f.p5030q.C65189ew;
import com.google.protos.p4985f.p5030q.C65190ex;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.d.a.t */
/* compiled from: PG */
public final class C76687t implements C76692c {

    /* renamed from: a */
    public static final C58974d f211973a = C58974d.m91136j();

    /* renamed from: b */
    public final C76719b f211974b;

    /* renamed from: c */
    public final C76685r f211975c;

    /* renamed from: d */
    public final C76746f f211976d;

    /* renamed from: e */
    public final C47770dh f211977e;

    /* renamed from: f */
    public final C22871g f211978f;

    /* renamed from: g */
    public C60870cx f211979g = null;

    /* renamed from: h */
    public C60870cx f211980h = null;

    /* renamed from: i */
    public final List f211981i = new ArrayList();

    /* renamed from: j */
    public final C76689v f211982j;

    /* renamed from: k */
    public final C76627c f211983k;

    /* renamed from: l */
    private final C76741a f211984l;

    public C76687t(C76719b bVar, C76685r rVar, C76689v vVar, C76627c cVar, C76741a aVar, C76746f fVar, C47770dh dhVar, C90821bm bmVar) {
        this.f211974b = bVar;
        this.f211975c = rVar;
        this.f211982j = vVar;
        this.f211983k = cVar;
        this.f211984l = aVar;
        this.f211976d = fVar;
        this.f211977e = dhVar;
        this.f211978f = bmVar.mo85163a(C76686s.class);
    }

    /* renamed from: e */
    private final C60870cx m123289e(C74965n nVar, C122461p pVar, C60870cx cxVar, C58485gu guVar, int i) {
        C60870cx j = this.f211978f.mo28210j(cxVar, "[NGA] FulfillmentGrpcServiceImpl starting fulfill", new C76672e(this, nVar, pVar, guVar, i));
        this.f211984l.mo72316a(j, "fulfillment", Optional.m71637of(nVar.mo71336k()));
        return j;
    }

    /* renamed from: a */
    public final C60870cx mo72291a(C74965n nVar, Iterable iterable) {
        C122459n nVar2 = (C122459n) C122461p.f339487e.createBuilder();
        C65189ew ewVar = (C65189ew) C65190ex.f176421b.createBuilder();
        ewVar.mo59349a(iterable);
        nVar2.copyOnWrite();
        C122461p pVar = (C122461p) nVar2.instance;
        C65190ex exVar = (C65190ex) ewVar.build();
        exVar.getClass();
        pVar.f339491c = exVar;
        pVar.f339490b = 2;
        return m123289e(nVar, (C122461p) nVar2.build(), this.f211975c.mo72289a(nVar, Optional.empty(), Optional.m71637of(iterable)), C58485gu.m89845m(), nVar.mo71349x());
    }

    /* renamed from: b */
    public final C60870cx mo72292b(C74965n nVar, String str, C58485gu guVar, C77551ad adVar) {
        C122459n nVar2 = (C122459n) C122461p.f339487e.createBuilder();
        C122444ci ciVar = (C122444ci) C122445cj.f339450b.createBuilder();
        ciVar.copyOnWrite();
        str.getClass();
        ((C122445cj) ciVar.instance).f339452a = str;
        nVar2.copyOnWrite();
        C122461p pVar = (C122461p) nVar2.instance;
        C122445cj cjVar = (C122445cj) ciVar.build();
        cjVar.getClass();
        pVar.f339491c = cjVar;
        pVar.f339490b = 1;
        return m123289e(nVar, (C122461p) nVar2.build(), this.f211975c.mo72289a(nVar, Optional.m71637of(adVar), Optional.empty()), guVar, nVar.mo71349x());
    }

    /* renamed from: c */
    public final void mo72293c() {
        this.f211978f.mo28212l("[NGA] FulfillmentGrpcServiceImpl destroy", new C76682o(this));
    }

    /* renamed from: d */
    public final void mo72294d() {
        this.f211978f.mo28212l("[NGA] FulfillmentGrpcServiceImpl initialize", new C76679l(this));
    }
}
