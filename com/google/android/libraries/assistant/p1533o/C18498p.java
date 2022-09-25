package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.o.p */
/* compiled from: PG */
public final class C18498p {

    /* renamed from: a */
    public final C18495m f52443a;

    public C18498p(C18495m mVar) {
        this.f52443a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C18496n mo24011a() {
        C62942bv build = this.f52443a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C18496n) build;
    }

    /* renamed from: b */
    public final /* synthetic */ C62883b mo24012b() {
        List unmodifiableList = Collections.unmodifiableList(((C18496n) this.f52443a.instance).f52441b);
        C69664n.m101060f(unmodifiableList, "_builder.getHeaderList()");
        return new C62883b(unmodifiableList);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo24013c(C18505w wVar) {
        C69664n.m101061g(wVar, "value");
        this.f52443a.mo24008d(wVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo24014d(int i, C18505w wVar) {
        C69664n.m101061g(wVar, "value");
        C18495m mVar = this.f52443a;
        mVar.copyOnWrite();
        C18496n nVar = (C18496n) mVar.instance;
        C18496n nVar2 = C18496n.f52438d;
        wVar.getClass();
        nVar.mo24010b();
        nVar.f52441b.set(i, wVar);
    }
}
