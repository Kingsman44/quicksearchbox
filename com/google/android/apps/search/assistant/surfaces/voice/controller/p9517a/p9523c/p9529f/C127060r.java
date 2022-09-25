package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127487q;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.r */
/* compiled from: PG */
public final class C127060r {

    /* renamed from: a */
    private final C127044b f349882a;

    public C127060r(C127044b bVar) {
        this.f349882a = bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C127045c mo107908a() {
        C62942bv build = this.f349882a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C127045c) build;
    }

    /* renamed from: b */
    public final void mo107909b(C127487q qVar) {
        C69664n.m101061g(qVar, "value");
        C127044b bVar = this.f349882a;
        bVar.copyOnWrite();
        C127045c cVar = (C127045c) bVar.instance;
        C127045c cVar2 = C127045c.f349832d;
        qVar.getClass();
        cVar.f349836c = qVar;
        cVar.f349834a |= 1;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo107910c(String str) {
        C69664n.m101061g(str, "value");
        C127044b bVar = this.f349882a;
        bVar.copyOnWrite();
        C127045c cVar = (C127045c) bVar.instance;
        C127045c cVar2 = C127045c.f349832d;
        str.getClass();
        cVar.mo107906a();
        cVar.f349835b.add(str);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo107911d(Iterable iterable) {
        C69664n.m101061g(iterable, "values");
        C127044b bVar = this.f349882a;
        bVar.copyOnWrite();
        C127045c cVar = (C127045c) bVar.instance;
        C127045c cVar2 = C127045c.f349832d;
        cVar.mo107906a();
        C62947c.addAll(iterable, (List) cVar.f349835b);
    }

    /* renamed from: e */
    public final void mo107912e() {
        List unmodifiableList = Collections.unmodifiableList(((C127045c) this.f349882a.instance).f349835b);
        C69664n.m101060f(unmodifiableList, "_builder.getAdditionalLocalesList()");
        new C62883b(unmodifiableList);
    }
}
