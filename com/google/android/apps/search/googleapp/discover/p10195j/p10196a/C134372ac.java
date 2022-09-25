package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.gsa.h.f.a.b;
import com.google.android.apps.gsa.h.f.a.c;
import com.google.android.apps.gsa.h.f.a.d;
import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134708f;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134710h;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.p375ai.p378b.C7799kj;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57107v;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64180ab;
import com.google.protos.youtube.elements.C66059au;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.ac */
/* compiled from: PG */
public final class C134372ac implements C21312s {

    /* renamed from: a */
    private final C133939b f366023a;

    public C134372ac(C133939b bVar) {
        C69664n.m101061g(bVar, "actionApi");
        this.f366023a = bVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        C62940bt btVar = C64180ab.f173525c;
        C69664n.m101060f(btVar, "moreStoriesLegacyCommand");
        return btVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64180ab abVar = (C64180ab) obj;
        C69664n.m101061g(abVar, "command");
        C69664n.m101061g(rVar, "eventData");
        C133939b bVar = this.f366023a;
        C57107v vVar = abVar.f173527a;
        if (vVar == null) {
            vVar = C57107v.f152446c;
        }
        C69664n.m101060f(vVar, "command.moreStoriesLegacyData");
        C69664n.m101061g(vVar, "data");
        if (bVar.f364813v) {
            C47393f.m84236g(C134710h.f366829a, bVar.f364794c);
            C47393f.m84236g(C134708f.m218539a(), bVar.f364794c);
        } else {
            bVar.f364810s.mo111908d(C134720e.MORE_STORIES_TAPPED);
            b bVar2 = bVar.f364801j;
            c createBuilder = d.r.createBuilder();
            C69664n.m101060f(createBuilder, "newBuilder()");
            C69664n.m101061g(createBuilder, "builder");
            String str = vVar.f152448a;
            C69664n.m101060f(str, "data.title");
            C69664n.m101061g(str, "value");
            createBuilder.copyOnWrite();
            d dVar = createBuilder.instance;
            str.getClass();
            dVar.a |= 4;
            dVar.d = str;
            C7799kj kjVar = vVar.f152449b;
            if (kjVar == null) {
                kjVar = C7799kj.f27263h;
            }
            C69664n.m101060f(kjVar, "data.interest");
            C69664n.m101061g(kjVar, "value");
            createBuilder.copyOnWrite();
            d dVar2 = createBuilder.instance;
            kjVar.getClass();
            dVar2.c = kjVar;
            dVar2.a |= 2;
            boolean a = C133933a.m217248a(bVar.f364794c.getContext());
            createBuilder.copyOnWrite();
            d dVar3 = createBuilder.instance;
            dVar3.a |= 16384;
            dVar3.q = a;
            createBuilder.copyOnWrite();
            d dVar4 = createBuilder.instance;
            dVar4.a |= 128;
            dVar4.j = true;
            d build = createBuilder.build();
            C69664n.m101060f(build, "_builder.build()");
            bVar2.mo41490e(build);
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar5 = C70101a.f186847o;
        return aVar;
    }
}
