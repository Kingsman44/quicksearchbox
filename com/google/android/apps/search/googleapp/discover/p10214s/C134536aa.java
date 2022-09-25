package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.aa */
/* compiled from: PG */
public final class C134536aa {

    /* renamed from: a */
    private final C134537ab f366375a;

    public C134536aa(C134537ab abVar) {
        this.f366375a = abVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C134538ac mo111811a() {
        C62942bv build = this.f366375a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C134538ac) build;
    }

    /* renamed from: b */
    public final C134560ay mo111812b() {
        C134560ay ayVar = ((C134538ac) this.f366375a.instance).f366380c;
        if (ayVar == null) {
            ayVar = C134560ay.f366453g;
        }
        C69664n.m101060f(ayVar, "_builder.getStreamContent()");
        return ayVar;
    }

    /* renamed from: c */
    public final C134573bk mo111813c() {
        C134573bk bkVar = ((C134538ac) this.f366375a.instance).f366379b;
        if (bkVar == null) {
            bkVar = C134573bk.f366497h;
        }
        C69664n.m101060f(bkVar, "_builder.getStreamStructure()");
        return bkVar;
    }

    /* renamed from: d */
    public final void mo111814d(C134560ay ayVar) {
        C69664n.m101061g(ayVar, "value");
        C134537ab abVar = this.f366375a;
        abVar.copyOnWrite();
        C134538ac acVar = (C134538ac) abVar.instance;
        C134538ac acVar2 = C134538ac.f366376d;
        ayVar.getClass();
        acVar.f366380c = ayVar;
        acVar.f366378a |= 2;
    }

    /* renamed from: e */
    public final void mo111815e(C134573bk bkVar) {
        C69664n.m101061g(bkVar, "value");
        C134537ab abVar = this.f366375a;
        abVar.copyOnWrite();
        C134538ac acVar = (C134538ac) abVar.instance;
        C134538ac acVar2 = C134538ac.f366376d;
        bkVar.getClass();
        acVar.f366379b = bkVar;
        acVar.f366378a |= 1;
    }
}
