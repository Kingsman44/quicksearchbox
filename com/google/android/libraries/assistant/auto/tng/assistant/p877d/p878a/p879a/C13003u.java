package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.u */
/* compiled from: PG */
public final class C13003u {

    /* renamed from: a */
    private final C13000r f40408a;

    public C13003u(C13000r rVar) {
        this.f40408a = rVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C13001s mo20868a() {
        C62942bv build = this.f40408a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C13001s) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo20869b(Iterable iterable) {
        C69664n.m101061g(iterable, "values");
        C13000r rVar = this.f40408a;
        rVar.copyOnWrite();
        C13001s sVar = (C13001s) rVar.instance;
        C13001s sVar2 = C13001s.f40405b;
        C62971cq cqVar = sVar.f40407a;
        if (!cqVar.mo58948c()) {
            sVar.f40407a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) sVar.f40407a);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20870c() {
        List unmodifiableList = Collections.unmodifiableList(((C13001s) this.f40408a.instance).f40407a);
        C69664n.m101060f(unmodifiableList, "_builder.getDisplayedRecsOnSideCardList()");
        new C62883b(unmodifiableList);
    }
}
