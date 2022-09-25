package com.google.android.apps.search.assistant.platform.p9141h.p9165i;

import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121144b;
import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121146d;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import java.util.Set;
import p3186j$.util.Collection;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.h.i.j */
/* compiled from: PG */
final class C121157j extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Set f336636a;

    /* renamed from: b */
    final /* synthetic */ boolean f336637b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121157j(Set set, boolean z) {
        super(1);
        this.f336636a = set;
        this.f336637b = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C121146d dVar = (C121146d) obj;
        C69664n.m101061g(dVar, "settings");
        C62934bn builder = dVar.toBuilder();
        C69664n.m101060f(builder, "settings.toBuilder()");
        C121144b bVar = (C121144b) builder;
        Collection.EL.stream(this.f336636a).forEach(new C121156i(bVar, this.f336637b));
        C62942bv build = bVar.build();
        C69664n.m101060f(build, "builder.build()");
        return (C121146d) build;
    }
}
