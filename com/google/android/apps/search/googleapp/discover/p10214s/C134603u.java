package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C63042fg;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.u */
/* compiled from: PG */
public final class C134603u {

    /* renamed from: a */
    public final C134553ar f366557a;

    public C134603u(C134553ar arVar) {
        this.f366557a = arVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C134556au mo111831a() {
        C62942bv build = this.f366557a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C134556au) build;
    }

    /* renamed from: b */
    public final C134558aw mo111832b() {
        C134558aw awVar = ((C134556au) this.f366557a.instance).f366438b;
        if (awVar == null) {
            awVar = C134558aw.f366443h;
        }
        C69664n.m101060f(awVar, "_builder.getStructure()");
        return awVar;
    }

    /* renamed from: c */
    public final void mo111833c(C63042fg fgVar) {
        C69664n.m101061g(fgVar, "value");
        C134553ar arVar = this.f366557a;
        arVar.copyOnWrite();
        C134556au auVar = (C134556au) arVar.instance;
        C134556au auVar2 = C134556au.f366435f;
        fgVar.getClass();
        auVar.f366440d = fgVar;
        auVar.f366437a |= 8;
    }

    /* renamed from: d */
    public final void mo111834d(C134555at atVar) {
        C69664n.m101061g(atVar, "value");
        C134553ar arVar = this.f366557a;
        arVar.copyOnWrite();
        C134556au auVar = (C134556au) arVar.instance;
        C134556au auVar2 = C134556au.f366435f;
        auVar.f366439c = atVar.f366434f;
        auVar.f366437a |= 2;
    }

    /* renamed from: e */
    public final void mo111835e(C134558aw awVar) {
        C69664n.m101061g(awVar, "value");
        C134553ar arVar = this.f366557a;
        arVar.copyOnWrite();
        C134556au auVar = (C134556au) arVar.instance;
        C134556au auVar2 = C134556au.f366435f;
        awVar.getClass();
        auVar.f366438b = awVar;
        auVar.f366437a |= 1;
    }
}
