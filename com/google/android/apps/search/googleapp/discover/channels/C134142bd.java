package com.google.android.apps.search.googleapp.discover.channels;

import com.google.p4017at.p4027c.p4028a.p4029a.C53839ae;
import com.google.p4017at.p4027c.p4028a.p4029a.C53861u;
import com.google.p4479cg.C58070b;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.bd */
/* compiled from: PG */
public final class C134142bd {
    /* renamed from: a */
    public static final C134152bn m217629a(C53861u uVar) {
        C134151bm bmVar = (C134151bm) C134152bn.f365440c.createBuilder();
        C69664n.m101060f(bmVar, "newBuilder()");
        C69664n.m101061g(bmVar, "builder");
        String str = uVar.f141352a;
        C69664n.m101060f(str, "image.url");
        C69664n.m101061g(str, "value");
        bmVar.copyOnWrite();
        C134152bn bnVar = (C134152bn) bmVar.instance;
        str.getClass();
        bnVar.f365442a |= 1;
        bnVar.f365443b = str;
        C62942bv build = bmVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C134152bn) build;
    }

    /* renamed from: b */
    public static final C134154bp m217630b(C53839ae aeVar) {
        C134153bo boVar = (C134153bo) C134154bp.f365444e.createBuilder();
        C69664n.m101060f(boVar, "newBuilder()");
        C69664n.m101061g(boVar, "builder");
        C58070b bVar = aeVar.f141306a;
        if (bVar != null) {
            boVar.copyOnWrite();
            C134154bp bpVar = (C134154bp) boVar.instance;
            bpVar.f365447b = bVar;
            bpVar.f365446a |= 1;
        }
        C58070b bVar2 = aeVar.f141307b;
        if (bVar2 != null) {
            boVar.copyOnWrite();
            C134154bp bpVar2 = (C134154bp) boVar.instance;
            bpVar2.f365448c = bVar2;
            bpVar2.f365446a |= 2;
        }
        C53861u uVar = aeVar.f141308c;
        if (uVar != null) {
            C134152bn a = m217629a(uVar);
            C69664n.m101061g(a, "value");
            boVar.copyOnWrite();
            C134154bp bpVar3 = (C134154bp) boVar.instance;
            a.getClass();
            bpVar3.f365449d = a;
            bpVar3.f365446a |= 4;
        }
        C62942bv build = boVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C134154bp) build;
    }
}
