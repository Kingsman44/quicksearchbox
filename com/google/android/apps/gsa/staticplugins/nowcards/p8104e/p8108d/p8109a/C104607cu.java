package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.sidekick.main.p7205h.C91417d;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91437s;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7206a.C91405d;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104472h;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104501ar;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104529y;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104530z;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23278b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23279c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7664fj;
import com.google.p375ai.p378b.C7665fk;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cu */
/* compiled from: PG */
public final class C104607cu extends C23056g {

    /* renamed from: a */
    public final C104472h f291222a;

    /* renamed from: b */
    public C58833ax f291223b;

    /* renamed from: c */
    private final C91417d f291224c;

    /* renamed from: d */
    private final C23278b f291225d;

    /* renamed from: e */
    private final C91437s f291226e;

    /* renamed from: f */
    private final C91405d f291227f;

    /* renamed from: g */
    private C58833ax f291228g;

    public C104607cu(C23052c cVar, C104472h hVar, C91417d dVar, C91437s sVar, C91405d dVar2, C23279c cVar2) {
        super(cVar);
        C58836b bVar = C58836b.f156633a;
        this.f291223b = bVar;
        this.f291228g = bVar;
        this.f291222a = hVar;
        this.f291224c = dVar;
        this.f291226e = sVar;
        this.f291227f = dVar2;
        this.f291225d = cVar2.mo28756a(cVar);
    }

    /* renamed from: h */
    private final C58833ax m173146h(C7681g gVar) {
        if (!this.f291228g.mo56113h()) {
            return C58836b.f156633a;
        }
        for (C7664fj fjVar : ((C7665fk) this.f291228g.mo56107c()).f26615c) {
            C7681g a = C7681g.m22802a(fjVar.f26609g);
            if (a == null) {
                a = C7681g.INVALID;
            }
            if (a.equals(gVar)) {
                return C58833ax.m90834k(fjVar);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: e */
    public final void mo94272e(C7681g gVar) {
        if (!this.f291228g.mo56113h()) {
            mo94273f(C58836b.f156633a);
            return;
        }
        C58833ax h = m173146h(gVar);
        if (!h.mo56113h() || ((C7664fj) h.mo56107c()).f26608f.size() <= 0) {
            mo94273f(C58836b.f156633a);
            return;
        }
        this.f63405W.mo28433w(C91405d.class, this.f291227f);
        this.f63405W.mo28433w(C104606ct.class, new C104603cq(this));
        C104529y yVar = (C104529y) C104530z.f290737d.createBuilder();
        C7665fk fkVar = (C7665fk) ((C7664fj) h.mo56107c()).f26608f.get(0);
        yVar.copyOnWrite();
        C104530z zVar = (C104530z) yVar.instance;
        fkVar.getClass();
        zVar.f290740b = fkVar;
        zVar.f290739a |= 1;
        boolean z = ((C7664fj) h.mo56107c()).f26606d;
        yVar.copyOnWrite();
        C104530z zVar2 = (C104530z) yVar.instance;
        zVar2.f290739a |= 2;
        zVar2.f290741c = z;
        ((C104589cc) this.f291222a).f291131a.mo28623d(mo28494O("TYPE_FOLLOW_UP_SURVEY"), C23245b.m43556a((C104530z) yVar.build()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.google.android.apps.gsa.sidekick.main.h.d.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94273f(com.google.common.base.C58833ax r10) {
        /*
            r9 = this;
            com.google.common.base.ax r0 = r9.f291223b
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x0038
            com.google.ai.b.g r10 = com.google.p375ai.p378b.C7681g.LIKE_CARD
            com.google.common.base.ax r10 = r9.m173146h(r10)
            boolean r0 = r10.mo56113h()
            if (r0 != 0) goto L_0x0017
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
            goto L_0x0032
        L_0x0017:
            java.lang.Object r0 = r10.mo56107c()
            com.google.ai.b.fj r0 = (com.google.p375ai.p378b.C7664fj) r0
            int r0 = r0.f26603a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0030
            java.lang.Object r10 = r10.mo56107c()
            com.google.ai.b.fj r10 = (com.google.p375ai.p378b.C7664fj) r10
            java.lang.String r10 = r10.f26607e
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x0032
        L_0x0030:
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
        L_0x0032:
            com.google.android.apps.gsa.sidekick.main.h.s r0 = r9.f291226e
            r0.mo85791a(r10)
            return
        L_0x0038:
            com.google.common.base.ax r0 = r9.f291223b
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cs r0 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104605cs) r0
            com.google.android.apps.gsa.sidekick.main.h.d.a r0 = r0.mo94265a()
            boolean r1 = r10.mo56113h()
            if (r1 == 0) goto L_0x0065
            com.google.common.base.ax r0 = r9.f291223b
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cs r0 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104605cs) r0
            com.google.android.apps.gsa.sidekick.main.h.d.a r0 = r0.mo94265a()
            if (r0 != 0) goto L_0x0060
            java.lang.Object r10 = r10.mo56107c()
            r0 = r10
            com.google.android.apps.gsa.sidekick.main.h.d.a r0 = (com.google.android.apps.gsa.sidekick.main.p7205h.p7209d.C91418a) r0
            goto L_0x0065
        L_0x0060:
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cr r0 = new com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cr
            r0.<init>(r9, r10)
        L_0x0065:
            r8 = r0
            com.google.android.apps.gsa.sidekick.main.h.d r1 = r9.f291224c
            com.google.common.base.ax r10 = r9.f291223b
            java.lang.Object r10 = r10.mo56107c()
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cs r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104605cs) r10
            com.google.android.libraries.gsa.monet.service.g r2 = r10.mo94266b()
            com.google.common.base.ax r10 = r9.f291223b
            java.lang.Object r10 = r10.mo56107c()
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cs r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104605cs) r10
            com.google.ai.b.hj r3 = r10.mo94267c()
            com.google.common.base.ax r10 = r9.f291223b
            java.lang.Object r10 = r10.mo56107c()
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cs r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104605cs) r10
            boolean r4 = r10.mo94269e()
            com.google.common.base.ax r10 = r9.f291223b
            java.lang.Object r10 = r10.mo56107c()
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cs r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104605cs) r10
            boolean r5 = r10.mo94271g()
            com.google.common.base.ax r10 = r9.f291223b
            java.lang.Object r10 = r10.mo56107c()
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cs r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104605cs) r10
            boolean r6 = r10.mo94270f()
            com.google.common.base.ax r10 = r9.f291223b
            java.lang.Object r10 = r10.mo56107c()
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cs r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104605cs) r10
            java.lang.String r7 = r10.mo94268d()
            r1.mo85763a(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104607cu.mo94273f(com.google.common.base.ax):void");
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C104501ar arVar = (C104501ar) C23245b.m43557b(protoParcelable, C104501ar.f290649d.getParserForType(), C62921ba.m95368a(), true);
        arVar.getClass();
        C7718hj hjVar = arVar.f290652b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        if ((hjVar.f26961b & 8) != 0) {
            C7718hj hjVar2 = arVar.f290652b;
            if (hjVar2 == null) {
                hjVar2 = C7718hj.f26927af;
            }
            C7665fk fkVar = hjVar2.f26942N;
            if (fkVar == null) {
                fkVar = C7665fk.f26611e;
            }
            this.f291228g = C58833ax.m90834k(fkVar);
        } else if ((((C7718hj) arVar.f290653c.get(0)).f26961b & 8) != 0) {
            C7665fk fkVar2 = ((C7718hj) arVar.f290653c.get(0)).f26942N;
            if (fkVar2 == null) {
                fkVar2 = C7665fk.f26611e;
            }
            this.f291228g = C58833ax.m90834k(fkVar2);
        }
        this.f63405W.mo28433w(C91417d.class, new C104601co(this));
        this.f63405W.mo28433w(C91405d.class, this.f291227f);
        C23278b bVar = this.f291225d;
        bVar.mo28754e("MODULES", mo28494O("TYPE_VOICE_OF_GOOGLE"), C23245b.m43556a(arVar), bVar.f63752b.f63757a.f63585a.mo28704b());
        ((C104656ep) this.f291225d.f63752b.f63757a.mo28637b()).f291440d = new C104602cp(this);
        this.f63405W.mo28418A(C91405d.class);
    }
}
