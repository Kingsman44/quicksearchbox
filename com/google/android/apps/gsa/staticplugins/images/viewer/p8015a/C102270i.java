package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.search.core.p6813n.C86183b;
import com.google.android.apps.gsa.search.p6489a.p6490a.C84336a;
import com.google.android.apps.gsa.search.p6489a.p6490a.C84337b;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.images.p8013a.C102254d;
import com.google.android.apps.gsa.staticplugins.images.p8013a.C102260j;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102288a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102291d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.i */
/* compiled from: PG */
public final class C102270i extends C23056g implements C102288a {

    /* renamed from: a */
    public final C102291d f285354a;

    /* renamed from: b */
    public final C22871g f285355b;

    /* renamed from: c */
    public final Context f285356c;

    /* renamed from: d */
    public final C86183b f285357d;

    /* renamed from: e */
    public final C90464f f285358e;

    /* renamed from: f */
    public final C102283v f285359f;

    /* renamed from: g */
    public final C102254d f285360g;

    /* renamed from: h */
    public final C91097g f285361h;

    /* renamed from: i */
    public final C102284w f285362i;

    /* renamed from: j */
    public final C22871g f285363j;

    /* renamed from: k */
    public final C84336a f285364k;

    /* renamed from: l */
    public final C84337b f285365l;

    /* renamed from: m */
    public final C102260j f285366m;

    /* renamed from: n */
    public final C102285x f285367n;

    /* renamed from: o */
    public final C91189au f285368o;

    /* renamed from: p */
    public boolean f285369p = false;

    /* renamed from: q */
    private final C102275n f285370q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102270i(C23052c cVar, C102291d dVar, C22871g gVar, Context context, C86183b bVar, C90464f fVar, C102254d dVar2, C91097g gVar2, C22871g gVar3, C84336a aVar, C84337b bVar2, C102260j jVar, C102283v vVar, C102284w wVar, C102275n nVar, C102285x xVar, C91189au auVar) {
        super(cVar);
        this.f285354a = dVar;
        this.f285355b = gVar;
        this.f285356c = context;
        this.f285357d = bVar;
        this.f285358e = fVar;
        this.f285360g = dVar2;
        this.f285361h = gVar2;
        this.f285363j = gVar3;
        this.f285364k = aVar;
        this.f285365l = bVar2;
        this.f285366m = jVar;
        this.f285359f = vVar;
        this.f285362i = wVar;
        this.f285370q = nVar;
        this.f285367n = xVar;
        this.f285368o = auVar;
    }

    /* renamed from: j */
    public static final boolean m169517j(C64629b bVar) {
        if (!bVar.f175193f || (bVar.f175188a & 4) == 0) {
            return false;
        }
        C65930h hVar = bVar.f175189b;
        if (hVar == null) {
            hVar = C65930h.f179300i;
        }
        C62940bt r0 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r0);
        return hVar.f169962ag.mo58857o(r0.f169971d);
    }

    /* renamed from: e */
    public final int mo93048e() {
        return ((C64629b) ((C102262a) this.f285354a).f285330a.f63720e).f175190c;
    }

    /* renamed from: f */
    public final void mo93049f() {
        C65949b a = this.f285370q.mo93052a(mo93048e());
        C65926d dVar = a.f179371b;
        if (dVar == null) {
            dVar = C65926d.f179289b;
        }
        if (dVar.f179291a.size() > 0) {
            ((C102262a) this.f285354a).f285332c.mo28730f(a, false);
        } else {
            ((C102262a) this.f285354a).f285331b.mo28730f(true, false);
        }
    }

    /* renamed from: h */
    public final void mo93050h(Query query) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH");
        intent.setClassName("com.google.android.googlequicksearchbox", e.b());
        intent.putExtra("velvet-query", query);
        intent.putExtra("commit-query", true);
        this.f285361h.mo65089a(intent);
    }

    /* renamed from: i */
    public final void mo93051i(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f285361h.mo65089a(Intent.createChooser(intent, (CharSequence) null));
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004f, code lost:
        if (r7.f169962ag.mo58857o(r3.f169971d) == false) goto L_0x0053;
     */
    /* renamed from: iD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28439iD(com.google.android.libraries.gsa.monet.shared.ProtoParcelable r7) {
        /*
            r6 = this;
            com.google.protos.d.a.a.a.a.a.a.a.b r0 = com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b.f175186i
            com.google.protobuf.eb r0 = r0.getParserForType()
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()
            r2 = 1
            com.google.protobuf.bv r7 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r7, r0, r1, r2)
            com.google.protos.d.a.a.a.a.a.a.a.b r7 = (com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b) r7
            r7.getClass()
            com.google.android.apps.gsa.staticplugins.images.viewer.b.d r0 = r6.f285354a
            com.google.android.apps.gsa.staticplugins.images.viewer.a.a r0 = (com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102262a) r0
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = r0.f285330a
            com.google.protobuf.bn r1 = r7.toBuilder()
            com.google.protos.d.a.a.a.a.a.a.a.a r1 = (com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64628a) r1
            boolean r3 = m169517j(r7)
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.protos.d.a.a.a.a.a.a.a.b r4 = (com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b) r4
            int r5 = r4.f175188a
            r5 = r5 | 8
            r4.f175188a = r5
            r4.f175192e = r3
            boolean r3 = r7.f175193f
            r4 = 0
            if (r3 == 0) goto L_0x0052
            com.google.protos.w.a.a.h r7 = r7.f175189b
            if (r7 != 0) goto L_0x003e
            com.google.protos.w.a.a.h r7 = com.google.protos.p5146w.p5147a.p5148a.C65930h.f179300i
        L_0x003e:
            com.google.protobuf.bt r3 = com.google.protos.p5146w.p5147a.p5148a.C65935m.f179324d
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r7.mo58887l(r3)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r7 = r7.mo58857o(r3)
            if (r7 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.protos.d.a.a.a.a.a.a.a.b r7 = (com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b) r7
            int r3 = r7.f175188a
            r3 = r3 | 16
            r7.f175188a = r3
            r7.f175193f = r2
            com.google.protobuf.bv r7 = r1.build()
            com.google.protos.d.a.a.a.a.a.a.a.b r7 = (com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b) r7
            r0.mo28730f(r7, r4)
            com.google.android.apps.gsa.staticplugins.images.viewer.b.d r7 = r6.f285354a
            com.google.android.apps.gsa.staticplugins.images.viewer.a.a r7 = (com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102262a) r7
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r7 = r7.f285331b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r7.mo28730f(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102270i.mo28439iD(com.google.android.libraries.gsa.monet.shared.ProtoParcelable):void");
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        if (!((C65949b) ((C102262a) this.f285354a).f285332c.f63720e).equals(C65949b.f179368e)) {
            this.f285369p = true;
        }
    }
}
