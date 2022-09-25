package com.google.knowledge.p4661a.p4662a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.knowledge.a.a.f */
/* compiled from: PG */
public final class C61744f {

    /* renamed from: a */
    private final C61751m f166790a;

    public C61744f(C61751m mVar) {
        this.f166790a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C61752n mo58177a() {
        C62942bv build = this.f166790a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C61752n) build;
    }

    /* renamed from: b */
    public final void mo58178b(String str) {
        C61751m mVar = this.f166790a;
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        C61752n nVar2 = C61752n.f166808f;
        nVar.f166810a |= 4;
        nVar.f166811b = str;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo58179c(C61746h hVar) {
        C69664n.m101061g(hVar, "value");
        this.f166790a.mo58185d(hVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo58180d() {
        List unmodifiableList = Collections.unmodifiableList(((C61752n) this.f166790a.instance).f166812c);
        C69664n.m101060f(unmodifiableList, "_builder.getArgumentList()");
        new C62883b(unmodifiableList);
    }
}
