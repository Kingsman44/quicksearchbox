package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9566r;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127294n;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32828bw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32829bx;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32831bz;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.r.a */
/* compiled from: PG */
public final class C127258a implements C127369n {

    /* renamed from: a */
    public static final C32836cd f350461a;

    /* renamed from: b */
    public static final C32836cd f350462b;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38301d(C32831bz.SCREENSHOT);
        a.mo38319b(a2.mo38298a());
        f350461a = a.mo38318a();
        C32835cc ccVar2 = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar2, "newBuilder()");
        C32838cf a3 = C69664n.m101061g(ccVar2, "builder");
        a3.mo38320c();
        C32788aj ajVar2 = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar2, "newBuilder()");
        C32798at a4 = C69664n.m101061g(ajVar2, "builder");
        a4.mo38301d(C32831bz.ASSIST_DATA);
        a3.mo38319b(a4.mo38298a());
        f350462b = a3.mo38318a();
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a = C69664n.m101061g(auVar, "builder");
        C32828bw bwVar = (C32828bw) C32829bx.f88025c.createBuilder();
        C69664n.m101060f(bwVar, "newBuilder()");
        C69664n.m101061g(bwVar, "builder");
        C127294n nVar = iVar.f350567e;
        if (nVar == null) {
            nVar = C127294n.f350576c;
        }
        C34053bp bpVar = nVar.f350579b;
        if (bpVar == null) {
            bpVar = C34053bp.f90753a;
        }
        C69664n.m101060f(bpVar, "queryContext.triggeringInfo.invocationToken");
        C69664n.m101061g(bpVar, "value");
        bwVar.copyOnWrite();
        C32829bx bxVar = (C32829bx) bwVar.instance;
        bpVar.getClass();
        bxVar.f88028b = bpVar;
        bxVar.f88027a |= 1;
        C62942bv build = bwVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C32829bx bxVar2 = (C32829bx) build;
        C69664n.m101061g(bxVar2, "value");
        C32799au auVar2 = a.f87983a;
        auVar2.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar2.instance;
        bxVar2.getClass();
        awVar.f87981b = bxVar2;
        awVar.f87980a = 5;
        return C60856cj.m92900i(a.mo38302a());
    }
}
