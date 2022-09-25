package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl;

import android.support.p033v7.p040e.C0429k;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62971cq;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.j */
/* compiled from: PG */
final class C128975j implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128973i f354395a;

    public C128975j(C128973i iVar) {
        this.f354395a = iVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C51986gl glVar = (C51986gl) obj;
        C69664n.m101061g(glVar, "args");
        C128970f fVar = this.f354395a.f354387e;
        C62971cq cqVar = glVar.f136424b;
        C69664n.m101060f(cqVar, "args.suggestionsList");
        C58485gu b = C58479go.m89810b(cqVar);
        C69664n.m101061g(b, "value");
        C0429k.m1383a(new C128969e(fVar, b), true).mo1399b(fVar);
        fVar.f354377f = b;
    }
}
