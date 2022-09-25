package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.C37035f;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a.C37026b;
import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a.C37028d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.ac */
/* compiled from: PG */
public final class C124392ac implements C32597b {

    /* renamed from: b */
    private static final C59071e f343314b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.c.a.ac");

    /* renamed from: a */
    public final C37026b f343315a;

    /* renamed from: c */
    private final C37035f f343316c;

    /* renamed from: d */
    private final Executor f343317d;

    /* renamed from: e */
    private final C32836cd f343318e;

    public C124392ac(C37035f fVar, Executor executor, C37026b bVar) {
        this.f343316c = fVar;
        this.f343317d = executor;
        this.f343315a = bVar;
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = true;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        int i = bVar.f96455p;
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        arVar.f87975a = 3;
        arVar.f87976b = Integer.valueOf(i);
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        this.f343318e = (C32836cd) ccVar.build();
        ((C59052c) ((C59052c) f343314b.mo56226d()).mo56372aa(37043)).mo56386p("PkgContextDataProvider initialized");
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return this.f343318e;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        Object obj;
        C60870cx cxVar;
        C62940bt r0 = C62942bv.checkIsLite(C37028d.f96457d);
        beVar.mo58887l(r0);
        Object l = beVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C37028d dVar = (C37028d) obj;
        ((C59052c) ((C59052c) f343314b.mo56224b()).mo56372aa(37042)).mo56386p("Fetching PKG context names");
        if ((dVar.f96459a & 2) != 0) {
            cxVar = this.f343316c.mo40546b(this.f343315a, dVar.f96460b);
        } else {
            cxVar = this.f343316c.mo40545a(this.f343315a);
        }
        C124390aa aaVar = new C124390aa(this);
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(aaVar), this.f343317d);
        C124391ab abVar = C124391ab.f343313a;
        return C60922j.m93044g(g, C47810es.m84963c(abVar), this.f343317d);
    }
}
