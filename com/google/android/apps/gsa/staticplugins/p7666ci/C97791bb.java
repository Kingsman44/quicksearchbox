package com.google.android.apps.gsa.staticplugins.p7666ci;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bb */
/* compiled from: PG */
public final /* synthetic */ class C97791bb implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C97811bv f273042a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f273043b;

    /* renamed from: c */
    public final /* synthetic */ C71207aq f273044c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f273045d;

    /* renamed from: e */
    public final /* synthetic */ C2164c f273046e;

    public /* synthetic */ C97791bb(C97811bv bvVar, C58833ax axVar, C71207aq aqVar, C53306j jVar, C2164c cVar) {
        this.f273042a = bvVar;
        this.f273043b = axVar;
        this.f273044c = aqVar;
        this.f273045d = jVar;
        this.f273046e = cVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C97811bv bvVar = this.f273042a;
        C58833ax axVar = this.f273043b;
        C71207aq aqVar = this.f273044c;
        C53306j jVar = this.f273045d;
        C2164c cVar = this.f273046e;
        Exception exc = (Exception) obj;
        if (axVar.mo56113h()) {
            bvVar.f273138s.mo103702e(axVar, aqVar, 3, jVar, C97811bv.f273112d);
        }
        C59104x d = C97811bv.f273109a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(exc)).mo56372aa(30292)).mo56386p("#getOnDeviceMediaProactiveData failed.");
        cVar.mo5437b(C58836b.f156633a);
    }
}
