package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.p10278a;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.a.c */
/* compiled from: PG */
final class C135639c implements C58817ah {

    /* renamed from: a */
    public static final C135639c f369469a = new C135639c();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C135647k kVar = (C135647k) obj;
        C69664n.m101060f(kVar, "data");
        C62934bn builder = kVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C135646j jVar = (C135646j) builder;
        C69664n.m101061g(jVar, "builder");
        int i = kVar.f369486b;
        jVar.copyOnWrite();
        C135647k kVar2 = (C135647k) jVar.instance;
        kVar2.f369485a |= 1;
        kVar2.f369486b = i + 1;
        C62942bv build = jVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C135647k) build;
    }
}
