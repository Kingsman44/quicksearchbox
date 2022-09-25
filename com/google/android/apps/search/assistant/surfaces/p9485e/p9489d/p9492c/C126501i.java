package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c;

import com.google.protobuf.C62961ch;
import com.google.protobuf.C63088z;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.Set;
import kotlinx.coroutines.C71803m;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.c.i */
/* compiled from: PG */
public final class C126501i implements C126505m {

    /* renamed from: a */
    public final Set f348396a;

    /* renamed from: b */
    public final Set f348397b;

    /* renamed from: c */
    public boolean f348398c;

    /* renamed from: d */
    private final C69585o f348399d;

    /* renamed from: e */
    private final C65599b f348400e;

    /* renamed from: f */
    private final C65599b f348401f;

    public C126501i(C69585o oVar, C65599b bVar, C65599b bVar2) {
        C69664n.m101061g(oVar, "backgroundContext");
        this.f348399d = oVar;
        this.f348400e = bVar;
        this.f348401f = bVar2;
        C62961ch chVar = bVar.f178301a;
        C69664n.m101060f(chVar, "disallowedActionTypeList.elementList");
        this.f348396a = C69540x.m100846ab(chVar);
        C62961ch chVar2 = bVar2.f178301a;
        C69664n.m101060f(chVar2, "inAppActionAllowList.elementList");
        this.f348397b = C69540x.m100846ab(chVar2);
    }

    /* renamed from: a */
    public final Object mo107623a(C63088z zVar, C69577g gVar) {
        return C71803m.m105040a(this.f348399d, new C126500h(zVar, this, (C69577g) null), gVar);
    }
}
