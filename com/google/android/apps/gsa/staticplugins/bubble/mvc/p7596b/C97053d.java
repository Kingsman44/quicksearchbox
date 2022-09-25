package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b;

import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b.C96983a;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b.C96984b;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b.C96985c;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b.C96988f;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97015t;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97043f;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a.C97028c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.b.d */
/* compiled from: PG */
public final class C97053d extends C97063n {

    /* renamed from: a */
    public final C97054e f271191a;

    public C97053d(C22871g gVar, C97043f fVar, C97028c cVar, C97064o oVar, C97054e eVar) {
        super(gVar, fVar, cVar, oVar, eVar, C97052c.f271190a);
        this.f271191a = eVar;
    }

    /* renamed from: a */
    public static C96988f m160642a(C97015t tVar) {
        C96983a aVar = (C96983a) C96988f.f271047c.createBuilder();
        C96984b bVar = (C96984b) C96985c.f271040d.createBuilder();
        C63088z zVar = tVar.f271120d;
        bVar.copyOnWrite();
        C96985c cVar = (C96985c) bVar.instance;
        zVar.getClass();
        cVar.f271042a |= 1;
        cVar.f271043b = zVar;
        C63088z zVar2 = tVar.f271121e;
        bVar.copyOnWrite();
        C96985c cVar2 = (C96985c) bVar.instance;
        zVar2.getClass();
        cVar2.f271042a |= 2;
        cVar2.f271044c = zVar2;
        aVar.copyOnWrite();
        C96988f fVar = (C96988f) aVar.instance;
        C96985c cVar3 = (C96985c) bVar.build();
        cVar3.getClass();
        fVar.f271050b = cVar3;
        fVar.f271049a = 2;
        return (C96988f) aVar.build();
    }

    /* renamed from: b */
    public final void mo90419b(C97015t tVar) {
        this.f271191a.f271152a = true;
        C96988f a = m160642a(tVar);
        if (!super.mo90426g()) {
            ((C59052c) ((C59052c) C97063n.f271202b.mo56226d()).mo56372aa(18358)).mo56386p("updateRequest: Should not be called when not polling.");
        } else if (a == null) {
            ((C59052c) ((C59052c) C97063n.f271202b.mo56226d()).mo56372aa(18357)).mo56386p("updateRequest: called with a null request, ignoring");
        } else {
            if (!a.equals(this.f271210i)) {
                this.f271210i = a;
            }
            mo90423d();
        }
    }
}
