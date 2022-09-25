package com.google.common.p4552o;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.common.o.qq */
/* compiled from: PG */
public final class C60454qq {

    /* renamed from: a */
    private final C59582aj f163601a;

    public C60454qq(C59582aj ajVar) {
        this.f163601a = ajVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C59687cb mo57093a() {
        C62942bv build = this.f163601a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C59687cb) build;
    }

    /* renamed from: b */
    public final void mo57094b(C59596at atVar) {
        C69664n.m101061g(atVar, "value");
        C59582aj ajVar = this.f163601a;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        cbVar.f160120be = atVar.f159810e;
        cbVar.f160123d |= 33554432;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo57095c(C59770f fVar) {
        C69664n.m101061g(fVar, "value");
        this.f163601a.mo57008e(fVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo57096d() {
        List unmodifiableList = Collections.unmodifiableList(((C59687cb) this.f163601a.instance).f160125f);
        C69664n.m101060f(unmodifiableList, "_builder.getErrorInfoList()");
        new C62883b(unmodifiableList);
    }
}
