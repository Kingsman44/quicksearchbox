package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bc */
/* compiled from: PG */
public final /* synthetic */ class C97792bc implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97811bv f273047a;

    /* renamed from: b */
    public final /* synthetic */ List f273048b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f273049c;

    public /* synthetic */ C97792bc(C97811bv bvVar, List list, C53306j jVar) {
        this.f273047a = bvVar;
        this.f273048b = list;
        this.f273049c = jVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C97811bv bvVar = this.f273047a;
        List list = this.f273048b;
        C53306j jVar = this.f273049c;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && C118426bs.m196609a((C118365g) axVar.mo56107c()) > 0) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(axVar);
        } else if (!list.isEmpty()) {
            return bvVar.f273126g.mo28209i(bvVar.f273142w.mo24216a(list, jVar), "Create recommendation for fallback app", C97797bh.f273057a);
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return C60856cj.m92900i(axVar);
        }
    }
}
