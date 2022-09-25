package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.s */
/* compiled from: PG */
public final class C127489s {

    /* renamed from: a */
    private final C127486p f351006a;

    public C127489s(C127486p pVar) {
        this.f351006a = pVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C127487q mo108089a() {
        C62942bv build = this.f351006a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C127487q) build;
    }

    /* renamed from: b */
    public final C62883b mo108090b() {
        List unmodifiableList = Collections.unmodifiableList(((C127487q) this.f351006a.instance).f351005b);
        C69664n.m101060f(unmodifiableList, "_builder.getPreferredLocalesList()");
        return new C62883b(unmodifiableList);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo108091c(C62883b bVar, Iterable iterable) {
        C69664n.m101061g(bVar, "<this>");
        C127486p pVar = this.f351006a;
        pVar.copyOnWrite();
        C127487q qVar = (C127487q) pVar.instance;
        C127487q qVar2 = C127487q.f351002c;
        C62971cq cqVar = qVar.f351005b;
        if (!cqVar.mo58948c()) {
            qVar.f351005b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) qVar.f351005b);
    }

    /* renamed from: d */
    public final void mo108092d(String str) {
        C69664n.m101061g(str, "value");
        C127486p pVar = this.f351006a;
        pVar.copyOnWrite();
        C127487q qVar = C127487q.f351002c;
        str.getClass();
        ((C127487q) pVar.instance).f351004a = str;
    }
}
