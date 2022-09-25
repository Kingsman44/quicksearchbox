package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87340w;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90276e;
import com.google.android.apps.gsa.shared.p7066m.C89967af;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90994c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91800g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91801h;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91809p;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105438h;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.be */
/* compiled from: PG */
public final class C105210be extends C23056g implements C90276e, C91007g {

    /* renamed from: a */
    private static final C59071e f293451a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.a.be");

    /* renamed from: b */
    private final C105438h f293452b;

    /* renamed from: c */
    private final C105419b f293453c;

    /* renamed from: d */
    private final C90998g f293454d;

    /* renamed from: e */
    private final C84474e f293455e;

    /* renamed from: f */
    private final C86124t f293456f;

    /* renamed from: g */
    private final C84486a f293457g;

    public C105210be(C23052c cVar, C105438h hVar, C105419b bVar, C21370a aVar, C84474e eVar, C84486a aVar2, C86124t tVar) {
        super(cVar);
        this.f293452b = hVar;
        this.f293453c = bVar;
        this.f293455e = eVar;
        this.f293457g = aVar2;
        this.f293456f = tVar;
        this.f293454d = new C90994c(aVar, 20);
        cVar.mo28430t(C87348a.class);
        cVar.mo28433w(C87334q.class, C87340w.m141302a((C23186f) hVar.mo94599b(), C90229e.MINUS_ONE));
    }

    /* renamed from: a */
    public final void mo83980a(boolean z) {
        if (((Boolean) ((C23251a) this.f293452b.mo94602e()).f63720e).booleanValue() != z) {
            ((C23251a) this.f293452b.mo94602e()).mo28730f(Boolean.valueOf(z), false);
            this.f293453c.mo94783e(z);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        this.f293454d.mo85271g(fVar, "MinusOne Events", (C90997f) null, false);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91809p pVar = (C91809p) C23245b.m43557b(protoParcelable, C91809p.f256048e.getParserForType(), C62921ba.m95368a(), true);
        if (pVar == null) {
            pVar = C91809p.f256048e;
        }
        ((C23251a) this.f293452b.mo94601d()).mo28730f(Boolean.valueOf(pVar.f256052c), false);
        C91800g gVar = (C91800g) C91801h.f256011n.createBuilder();
        gVar.copyOnWrite();
        C91801h hVar = (C91801h) gVar.instance;
        hVar.f256013a |= 2;
        hVar.f256014b = true;
        gVar.copyOnWrite();
        C91801h hVar2 = (C91801h) gVar.instance;
        hVar2.f256013a |= 4;
        hVar2.f256015c = true;
        boolean z = pVar.f256051b;
        gVar.copyOnWrite();
        C91801h hVar3 = (C91801h) gVar.instance;
        hVar3.f256013a |= 8;
        hVar3.f256016d = z;
        boolean z2 = pVar.f256052c;
        gVar.copyOnWrite();
        C91801h hVar4 = (C91801h) gVar.instance;
        hVar4.f256013a |= 16;
        hVar4.f256017e = z2;
        gVar.copyOnWrite();
        C91801h hVar5 = (C91801h) gVar.instance;
        hVar5.f256013a |= 64;
        hVar5.f256020h = "and.gsa.monet.minus1";
        boolean z3 = pVar.f256053d;
        gVar.copyOnWrite();
        C91801h hVar6 = (C91801h) gVar.instance;
        hVar6.f256013a |= 512;
        hVar6.f256023k = z3;
        ((C23186f) this.f293452b.mo94600c()).mo28624e("TYPE_MINUS_ONE_FEED_RECYCLER", C23245b.m43556a((C91801h) gVar.build()));
        if (this.f293455e.mo78092af()) {
            boolean l = this.f293457g.mo78205l();
            boolean m = this.f293457g.mo78206m();
            boolean ah = this.f293455e.mo78094ah();
            if (!this.f293456f.mo79746e(C89967af.f246500b)) {
                ((C59052c) ((C59052c) f293451a.mo56226d()).mo56372aa(22256)).mo56359L("Classic minus one created in TNG. [hsExp=%b moExp=%b gaFlag=%b", Boolean.valueOf(l), Boolean.valueOf(m), Boolean.valueOf(ah));
            }
        }
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C105419b bVar = this.f293453c;
        int i = 1;
        if (true == ((Boolean) ((C23251a) this.f293452b.mo94601d()).f63720e).booleanValue()) {
            i = 2;
        }
        bVar.f294039f = i;
        bVar.mo94780b();
        this.f293453c.mo94783e(((Boolean) ((C23251a) this.f293452b.mo94602e()).f63720e).booleanValue());
    }
}
