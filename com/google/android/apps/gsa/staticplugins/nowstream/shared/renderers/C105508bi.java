package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91801h;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105426c;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.shared.C23234c;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23285a;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.C23310c;
import com.google.android.libraries.gsa.p1863e.C22802c;
import com.google.android.libraries.gsa.p1863e.C22803d;
import com.google.android.libraries.gsa.p1868g.p1869a.C22815a;
import com.google.android.libraries.gsa.p1868g.p1869a.C22816b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.bi */
/* compiled from: PG */
public final /* synthetic */ class C105508bi implements C23108e {

    /* renamed from: a */
    public static final /* synthetic */ C105508bi f294349a = new C105508bi();

    private /* synthetic */ C105508bi() {
    }

    /* renamed from: a */
    public final void mo28558a(C23117m mVar, C23110f fVar, ProtoParcelable protoParcelable) {
        C91801h hVar = (C91801h) C23245b.m43557b(protoParcelable, C91801h.f256011n.getParserForType(), C62921ba.m95368a(), true);
        hVar.getClass();
        new C105490ar(mVar, fVar).f294268a.mo28730f(true, false);
        C23310c cVar = new C23310c(mVar, C23234c.f63682a);
        C22815a aVar = (C22815a) C22816b.f62819k.createBuilder();
        boolean z = hVar.f256016d;
        aVar.copyOnWrite();
        C22816b bVar = (C22816b) aVar.instance;
        bVar.f62821a |= 64;
        bVar.f62828h = z;
        C23285a.m43665a("DOODLE_HEADER", new C23129y("doodlestatic", "TYPE_FEED_DOODLE_HEADER"), C23245b.m43556a((C22816b) aVar.build()), cVar, fVar);
        C23129y yVar = new C23129y("now_stream", "TYPE_NOW");
        C22802c cVar2 = (C22802c) C22803d.f62771k.createBuilder();
        int i = C105426c.f294058a.f28649u;
        cVar2.copyOnWrite();
        C22803d dVar = (C22803d) cVar2.instance;
        dVar.f62773a |= 32;
        dVar.f62777e = i;
        String str = hVar.f256020h;
        cVar2.copyOnWrite();
        C22803d dVar2 = (C22803d) cVar2.instance;
        str.getClass();
        dVar2.f62773a |= 256;
        dVar2.f62780h = str;
        C23285a.m43665a("NAME_NOW", yVar, C23245b.m43556a((C22803d) cVar2.build()), cVar, fVar);
    }
}
