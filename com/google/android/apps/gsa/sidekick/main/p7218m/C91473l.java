package com.google.android.apps.gsa.sidekick.main.p7218m;

import com.google.android.apps.gsa.sidekick.main.entry.C91307al;
import com.google.android.apps.gsa.sidekick.main.entry.C91319ax;
import com.google.android.apps.gsa.sidekick.main.entry.C91326bd;
import com.google.android.apps.gsa.sidekick.main.entry.C91327be;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.shared.C91716e;
import com.google.android.apps.gsa.sidekick.shared.C91729f;
import com.google.android.apps.gsa.sidekick.shared.util.C91977ba;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C7799kj;
import java.util.ArrayList;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.sidekick.main.m.l */
/* compiled from: PG */
public final class C91473l {

    /* renamed from: a */
    public static final C59071e f255137a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.m.l");

    /* renamed from: b */
    public final C91729f f255138b;

    /* renamed from: c */
    public final List f255139c = new ArrayList();

    /* renamed from: d */
    public final C22871g f255140d;

    /* renamed from: e */
    public final C69464a f255141e;

    /* renamed from: f */
    public C7799kj f255142f;

    /* renamed from: g */
    public C60870cx f255143g;

    /* renamed from: h */
    public C91471j f255144h;

    /* renamed from: i */
    public int f255145i;

    /* renamed from: j */
    public C7744ii f255146j;

    /* renamed from: k */
    private final C91376f f255147k;

    /* renamed from: l */
    private final C91319ax f255148l;

    /* renamed from: m */
    private final C58833ax f255149m;

    /* renamed from: n */
    private final C22871g f255150n;

    /* renamed from: o */
    private final C91977ba f255151o;

    public C91473l(C91729f fVar, C91376f fVar2, C91319ax axVar, C22871g gVar, C22871g gVar2, C58833ax axVar2, C69464a aVar) {
        this.f255138b = fVar;
        this.f255147k = fVar2;
        this.f255148l = axVar;
        this.f255150n = gVar;
        this.f255140d = gVar2;
        this.f255149m = axVar2;
        this.f255141e = aVar;
        this.f255151o = new C91977ba(CardRenderingContext.f118455a);
    }

    /* renamed from: c */
    private final void m149610c(C7744ii iiVar, C91716e eVar) {
        this.f255150n.mo28212l("SecondScreenEntryProvid#toMainThread", new C91470i(this, iiVar));
    }

    /* renamed from: b */
    public final void mo85821b(C91326bd bdVar) {
        C7744ii iiVar = this.f255146j;
        if (iiVar != null) {
            this.f255146j = new C91327be((C91307al) this.f255141e.mo17428b(), bdVar).mo86655l(iiVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p375ai.p378b.C7744ii mo85820a(com.google.android.apps.gsa.sidekick.shared.C91716e r7) {
        /*
            r6 = this;
            r0 = 0
            r6.f255143g = r0
            r6.f255144h = r0
            r1 = 1
            if (r7 == 0) goto L_0x00d2
            com.google.ai.b.hn r2 = r7.mo86028e()
            if (r2 == 0) goto L_0x00d2
            com.google.ai.b.hn r2 = r7.mo86028e()
            r2.getClass()
            com.google.android.apps.gsa.sidekick.shared.util.ba r3 = r6.f255151o
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r4 = r7.mo86026c()
            r3.f256478a = r4
            com.google.android.apps.gsa.sidekick.main.entry.ax r3 = r6.f255148l
            com.google.protobuf.cq r4 = r2.f26996b
            int r4 = r4.size()
            r5 = 0
            if (r4 == 0) goto L_0x005f
            com.google.protobuf.cq r4 = r2.f26996b
            java.lang.Object r4 = r4.get(r5)
            com.google.ai.b.ii r4 = (com.google.p375ai.p378b.C7744ii) r4
            int r4 = r4.f27056a
            r4 = r4 & r1
            if (r4 == 0) goto L_0x005f
            com.google.protobuf.bn r4 = r2.toBuilder()
            com.google.ai.b.hm r4 = (com.google.p375ai.p378b.C7721hm) r4
            com.google.protobuf.cq r2 = r2.f26996b
            java.lang.Object r2 = r2.get(r5)
            com.google.ai.b.ii r2 = (com.google.p375ai.p378b.C7744ii) r2
            com.google.ai.b.ii r2 = r3.mo85611b(r2)
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.ai.b.hn r3 = (com.google.p375ai.p378b.C7722hn) r3
            r2.getClass()
            r3.mo16945a()
            com.google.protobuf.cq r3 = r3.f26996b
            r3.set(r5, r2)
            com.google.protobuf.bv r2 = r4.build()
            com.google.ai.b.hn r2 = (com.google.p375ai.p378b.C7722hn) r2
        L_0x005f:
            com.google.protobuf.cq r3 = r2.f26996b
            int r3 = r3.size()
            if (r3 == 0) goto L_0x00c5
            com.google.common.o.l.t r0 = r7.mo86027d()
            if (r0 == 0) goto L_0x009d
            com.google.protobuf.cq r1 = r2.f26996b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x009d
            com.google.android.apps.gsa.sidekick.main.entry.bi r1 = new com.google.android.apps.gsa.sidekick.main.entry.bi
            r1.<init>(r0)
            com.google.protobuf.cq r0 = r2.f26996b
            java.util.List r0 = r1.mo86656m(r0)
            com.google.protobuf.bn r1 = r2.toBuilder()
            com.google.ai.b.hm r1 = (com.google.p375ai.p378b.C7721hm) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.ai.b.hn r2 = (com.google.p375ai.p378b.C7722hn) r2
            com.google.protobuf.cq r3 = com.google.p375ai.p378b.C7722hn.emptyProtobufList()
            r2.f26996b = r3
            r1.mo16944a(r0)
            com.google.protobuf.bv r0 = r1.build()
            r2 = r0
            com.google.ai.b.hn r2 = (com.google.p375ai.p378b.C7722hn) r2
        L_0x009d:
            com.google.protobuf.cq r0 = r2.f26996b
            java.lang.Object r0 = r0.get(r5)
            com.google.ai.b.ii r0 = (com.google.p375ai.p378b.C7744ii) r0
            com.google.common.base.ax r1 = r6.f255149m
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x00bd
            com.google.common.base.ax r1 = r6.f255149m
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.sidekick.main.entry.bn r1 = (com.google.android.apps.gsa.sidekick.main.entry.C91336bn) r1
            com.google.android.apps.gsa.sidekick.shared.util.ad r1 = r1.mo85658a()
            com.google.ai.b.ii r0 = r1.mo86653j(r0)
        L_0x00bd:
            r6.f255145i = r5
            r6.f255146j = r0
            r6.m149610c(r0, r7)
            return r0
        L_0x00c5:
            r6.f255145i = r1
            r6.m149610c(r0, r7)
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Entry tree is empty."
            r7.<init>(r0)
            throw r7
        L_0x00d2:
            if (r7 == 0) goto L_0x00f7
            com.google.common.f.e r2 = f255137a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "SecondScreenEntryProvid"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "Failed to retrieve entries"
            r4 = 11753(0x2de9, float:1.647E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.sidekick.main.f.f r2 = r6.f255147k
            boolean r2 = r2.mo85697b()
            if (r1 == r2) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r1 = 2
        L_0x00f2:
            r6.f255145i = r1
            r6.m149610c(r0, r7)
        L_0x00f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.p7218m.C91473l.mo85820a(com.google.android.apps.gsa.sidekick.shared.e):com.google.ai.b.ii");
    }
}
