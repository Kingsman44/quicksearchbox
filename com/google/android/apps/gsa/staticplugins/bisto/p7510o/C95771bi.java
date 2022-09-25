package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6356m.C81428d;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95606b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95688l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95655d;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95662k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94641e;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95101bk;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95044g;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95045h;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95226b;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95237m;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95238n;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95250z;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95352bc;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7513c.C95790a;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7513c.C95791b;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7513c.C95794e;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95833e;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95834f;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95835g;
import com.google.android.apps.gsa.staticplugins.bisto.p7517s.C95864f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142360cl;
import com.google.android.p10712d.C142365cq;
import com.google.android.p10712d.C142366cr;
import com.google.android.p10712d.C142379dd;
import com.google.android.p10712d.C142383dh;
import com.google.android.p10712d.C142386dk;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60057jf;
import com.google.common.p4552o.C60070js;
import com.google.common.p4552o.C60072ju;
import com.google.common.p4552o.C60087kg;
import com.google.common.p4552o.C60091kk;
import com.google.common.p4552o.C60092kl;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.bi */
/* compiled from: PG */
public final class C95771bi implements AutoCloseable, C95655d, C95352bc, C89495cg, C95045h, C95250z, C95101bk {

    /* renamed from: o */
    private static final C59071e f268149o = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.bi");

    /* renamed from: p */
    private static final C58528ij f268150p = C58528ij.m90012L(C142359ck.WILL_PAUSE, C142359ck.PREPARE_FETCH, C142359ck.PREPARE_VOICE_INPUT);

    /* renamed from: q */
    private static final Duration f268151q = Duration.ofMillis(250);

    /* renamed from: A */
    private Optional f268152A = Optional.empty();

    /* renamed from: B */
    private Optional f268153B = Optional.empty();

    /* renamed from: C */
    private boolean f268154C = true;

    /* renamed from: D */
    private boolean f268155D = false;

    /* renamed from: E */
    private final C95864f f268156E;

    /* renamed from: a */
    public final Context f268157a;

    /* renamed from: b */
    public final C95355bf f268158b;

    /* renamed from: c */
    public final C68214a f268159c;

    /* renamed from: d */
    public final C95044g f268160d;

    /* renamed from: e */
    public final C95214aa f268161e;

    /* renamed from: f */
    public final C95188c f268162f;

    /* renamed from: g */
    public final C95295ag f268163g;

    /* renamed from: h */
    public final C95791b f268164h;

    /* renamed from: i */
    public final C95790a f268165i;

    /* renamed from: j */
    public final C95708a f268166j;

    /* renamed from: k */
    public final C95735az f268167k;

    /* renamed from: l */
    public C95662k f268168l;

    /* renamed from: m */
    public C95688l f268169m;

    /* renamed from: n */
    public boolean f268170n;

    /* renamed from: r */
    private C124548d f268171r;

    /* renamed from: s */
    private final C95239o f268172s;

    /* renamed from: t */
    private final C95794e f268173t;

    /* renamed from: v */
    private final C95736b f268174v = new C95736b();

    /* renamed from: w */
    private final C89656k f268175w;

    /* renamed from: x */
    private final C95833e f268176x;

    /* renamed from: y */
    private final C95835g f268177y;

    /* renamed from: z */
    private final C22871g f268178z;

    public C95771bi(Context context, C95355bf bfVar, C68214a aVar, C95864f fVar, C95044g gVar, C95214aa aaVar, C95188c cVar, C95239o oVar, C95295ag agVar, C95794e eVar, C95791b bVar, C95790a aVar2, C95735az azVar, C95833e eVar2, C95835g gVar2, C22871g gVar3, C89656k kVar, C95708a aVar3) {
        this.f268157a = context;
        this.f268158b = bfVar;
        this.f268159c = aVar;
        this.f268156E = fVar;
        this.f268160d = gVar;
        this.f268171r = ((C89496ch) aVar.mo27525b()).mo83401b(bfVar.mo89270k());
        this.f268161e = aaVar;
        this.f268162f = cVar;
        this.f268172s = oVar;
        this.f268163g = agVar;
        this.f268173t = eVar;
        this.f268164h = bVar;
        this.f268165i = aVar2;
        this.f268167k = azVar;
        this.f268176x = eVar2;
        this.f268177y = gVar2;
        this.f268178z = gVar3;
        this.f268175w = kVar;
        this.f268166j = aVar3;
    }

    /* renamed from: l */
    private final Optional m158669l() {
        C95835g gVar = this.f268177y;
        C21370a aVar = (C21370a) gVar.f268380a.mo17428b();
        aVar.getClass();
        Optional optional = (Optional) gVar.f268381b.mo17428b();
        optional.getClass();
        C95307m mVar = (C95307m) gVar.f268382c.mo17428b();
        mVar.getClass();
        Optional of = Optional.m71637of(new C95834f(aVar, optional, mVar));
        this.f268153B = of;
        C95834f fVar = (C95834f) of.get();
        C60070js jsVar = (C60070js) C60072ju.f162395f.createBuilder();
        if (fVar.f268376b.isPresent()) {
            boolean d = ((C81428d) fVar.f268376b.get()).mo75077d();
            jsVar.copyOnWrite();
            C60072ju juVar = (C60072ju) jsVar.instance;
            juVar.f162397a |= 8;
            juVar.f162401e = d;
        }
        fVar.mo89815a(2, jsVar);
        this.f268152A = Optional.empty();
        return this.f268153B;
    }

    /* renamed from: m */
    private final void m158670m(boolean z) {
        boolean z2 = true;
        if (!this.f268158b.mo89256C() && !z) {
            z2 = false;
        }
        this.f268160d.mo88967k(z, z2, m158669l());
    }

    /* renamed from: n */
    private final void m158671n() {
        this.f268160d.mo88972p(this.f268158b.mo89256C(), m158669l());
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015a A[ADDED_TO_REGION] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m158672o(com.google.android.p10712d.C142360cl r13) {
        /*
            r12 = this;
            com.google.android.apps.gsa.staticplugins.bisto.f.ag r0 = r12.f268163g
            com.google.android.apps.gsa.staticplugins.bisto.f.af r0 = r0.mo89222a()
            java.util.ArrayList r1 = new java.util.ArrayList
            com.google.protobuf.cj r2 = new com.google.protobuf.cj
            com.google.protobuf.ch r3 = r13.f386306b
            com.google.protobuf.ci r4 = com.google.android.p10712d.C142360cl.f386302c
            r2.<init>(r3, r4)
            r1.<init>(r2)
            int r2 = r12.mo89760b()
            com.google.common.f.e r3 = f268149o
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "QpuDeviceInputHandler"
            r3.mo56378ag(r4, r5)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 15328(0x3be0, float:2.1479E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95708a.m158482a(r2)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[ "
            r6.<init>(r7)
            com.google.protobuf.cj r7 = new com.google.protobuf.cj
            com.google.protobuf.ch r8 = r13.f386306b
            com.google.protobuf.ci r9 = com.google.android.p10712d.C142360cl.f386302c
            r7.<init>(r8, r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x0047:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0060
            java.lang.Object r8 = r7.next()
            com.google.android.d.ck r8 = (com.google.android.p10712d.C142359ck) r8
            java.lang.String r8 = r8.name()
            r6.append(r8)
            java.lang.String r8 = " "
            r6.append(r8)
            goto L_0x0047
        L_0x0060:
            java.lang.String r7 = "]"
            r6.append(r7)
            java.lang.String r7 = "Context %s Action input %s"
            java.lang.String r6 = r6.toString()
            r3.mo56354G(r7, r4, r6)
            com.google.android.apps.gsa.staticplugins.bisto.o.az r3 = r12.f268167k
            boolean r3 = r3.mo89720b(r0, r13, r2)
            if (r3 != 0) goto L_0x0437
            int r3 = r13.f386305a
            r4 = 1
            r3 = r3 & r4
            r6 = 0
            if (r3 == 0) goto L_0x0084
            com.google.android.apps.gsa.staticplugins.bisto.s.f r3 = r12.f268156E
            com.google.android.apps.gsa.staticplugins.bisto.o.e r13 = r3.mo89825a(r13)
            goto L_0x0085
        L_0x0084:
            r13 = r6
        L_0x0085:
            com.google.android.apps.gsa.staticplugins.bisto.o.c.e r3 = r12.f268173t
            com.google.android.d.ck r3 = r3.mo89774a(r1)
            if (r3 == 0) goto L_0x0097
            com.google.android.apps.gsa.staticplugins.bisto.o.a r7 = r12.f268166j
            r7.mo89667b(r1, r3, r2)
            com.google.android.apps.gsa.staticplugins.bisto.o.c.b r3 = r12.f268164h
            r3.mo89771a()
        L_0x0097:
            r3 = 4
            if (r2 != r3) goto L_0x00bc
            com.google.android.apps.gsa.staticplugins.bisto.o.b r2 = r12.f268174v
            com.google.android.d.ck r2 = r2.mo89722a(r1)
            if (r2 != 0) goto L_0x00a4
            r2 = 4
            goto L_0x00bc
        L_0x00a4:
            com.google.common.f.e r13 = f268149o
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r0, r5)
            java.lang.String r0 = "Handled alarm action"
            r4 = 15329(0x3be1, float:2.148E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r4)).mo56386p(r0)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r13 = r12.f268166j
            r13.mo89667b(r1, r2, r3)
            return
        L_0x00bc:
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.COMPLETE_VOICE_INPUT
            boolean r5 = r1.contains(r5)
            r7 = 0
            if (r5 == 0) goto L_0x00eb
            com.google.android.apps.gsa.staticplugins.bisto.ae.a.g r5 = r12.f268160d
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r8 = r12.f268158b
            boolean r8 = r8.mo89256C()
            r5.mo88966i(r8)
            boolean r5 = r12.f268170n
            if (r5 == 0) goto L_0x00e8
            r12.f268170n = r7
            com.google.android.libraries.gsa.k.g r5 = r12.f268178z
            j$.time.Duration r8 = f268151q
            long r8 = r8.toMillis()
            com.google.android.apps.gsa.staticplugins.bisto.o.bf r10 = new com.google.android.apps.gsa.staticplugins.bisto.o.bf
            r10.<init>(r12)
            java.lang.String r11 = "effect"
            r5.mo28213m(r11, r8, r10)
        L_0x00e8:
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.COMPLETE_VOICE_INPUT
            goto L_0x00ec
        L_0x00eb:
            r5 = r6
        L_0x00ec:
            if (r5 == 0) goto L_0x00f3
            com.google.android.apps.gsa.staticplugins.bisto.o.a r8 = r12.f268166j
            r8.mo89667b(r1, r5, r2)
        L_0x00f3:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r1)
            com.google.android.d.ck r9 = com.google.android.p10712d.C142359ck.COMPLETE_VOICE_INPUT
            r8.remove(r9)
            com.google.common.b.ij r9 = f268150p
            r8.removeAll(r9)
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0150
            if (r13 == 0) goto L_0x0110
            boolean r13 = r13.mo89780a()
            if (r13 != 0) goto L_0x0150
        L_0x0110:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.WILL_PAUSE
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L_0x012b
            if (r2 != r4) goto L_0x012b
            com.google.android.apps.gsa.staticplugins.bisto.o.c.b r13 = r12.f268164h
            com.google.android.apps.gsa.staticplugins.bisto.util.an r2 = r13.f268227c
            boolean r2 = r2.mo90147i()
            java.util.concurrent.atomic.AtomicBoolean r13 = r13.f268225a
            r13.set(r2)
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.WILL_PAUSE
            r2 = 1
            goto L_0x0151
        L_0x012b:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.PREPARE_VOICE_INPUT
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L_0x0145
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r13 = r12.f268158b
            boolean r13 = r13.mo89279x()
            if (r13 == 0) goto L_0x0142
            com.google.android.apps.gsa.staticplugins.bisto.b.b.c r13 = r12.f268162f
            r8 = 9
            r13.mo89096a(r8)
        L_0x0142:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.PREPARE_VOICE_INPUT
            goto L_0x0151
        L_0x0145:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.PREPARE_FETCH
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L_0x0150
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.PREPARE_FETCH
            goto L_0x0151
        L_0x0150:
            r13 = r6
        L_0x0151:
            if (r13 == 0) goto L_0x0158
            com.google.android.apps.gsa.staticplugins.bisto.o.a r8 = r12.f268166j
            r8.mo89667b(r1, r13, r2)
        L_0x0158:
            if (r5 != 0) goto L_0x0437
            if (r13 == 0) goto L_0x015e
            goto L_0x0437
        L_0x015e:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.ASSISTANT_NO_OP
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L_0x016e
            com.google.android.apps.gsa.staticplugins.bisto.o.a r13 = r12.f268166j
            com.google.android.d.ck r0 = com.google.android.p10712d.C142359ck.ASSISTANT_NO_OP
            r13.mo89667b(r1, r0, r2)
            return
        L_0x016e:
            r13 = 3
            if (r2 == 0) goto L_0x028e
            if (r2 == r13) goto L_0x020b
            r3 = 6
            if (r2 == r3) goto L_0x01e6
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x018d
            com.google.android.apps.gsa.staticplugins.bisto.o.c.b r3 = r12.f268164h
            r3.mo89772b()
            r12.m158676s()
            r12.m158670m(r4)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            goto L_0x0364
        L_0x018d:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x01a4
            com.google.android.apps.gsa.staticplugins.bisto.o.c.b r3 = r12.f268164h
            r3.mo89772b()
            r12.m158676s()
            r12.m158670m(r7)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            goto L_0x0364
        L_0x01a4:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x01bb
            com.google.android.apps.gsa.staticplugins.bisto.o.c.b r3 = r12.f268164h
            r3.mo89772b()
            r12.m158676s()
            r12.m158671n()
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT
            goto L_0x0364
        L_0x01bb:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x01d2
            boolean r3 = r12.m158678u(r0)
            if (r3 == 0) goto L_0x01d2
            com.google.android.apps.gsa.staticplugins.bisto.o.c.b r3 = r12.f268164h
            r3.mo89772b()
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            goto L_0x0364
        L_0x01d2:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.FETCH_ANNOUNCEMENTS
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0208
            com.google.android.apps.gsa.staticplugins.bisto.o.c.b r3 = r12.f268164h
            r3.mo89772b()
            r12.mo89761c(r0)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.FETCH_ANNOUNCEMENTS
            goto L_0x0364
        L_0x01e6:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.END_ENDPOINTING_VOICE_INPUT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x01f7
            com.google.android.apps.gsa.staticplugins.bisto.ae.a.g r3 = r12.f268160d
            r3.mo88966i(r4)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.END_ENDPOINTING_VOICE_INPUT
            goto L_0x0364
        L_0x01f7:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.CANCEL_VOICE_INPUT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0208
            com.google.android.apps.gsa.staticplugins.bisto.ae.a.g r3 = r12.f268160d
            r3.mo88971o()
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.CANCEL_VOICE_INPUT
            goto L_0x0364
        L_0x0208:
            r3 = r6
            goto L_0x0364
        L_0x020b:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.END_ENDPOINTING_VOICE_INPUT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x021c
            com.google.android.apps.gsa.staticplugins.bisto.ae.a.g r3 = r12.f268160d
            r3.mo88966i(r4)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.END_ENDPOINTING_VOICE_INPUT
            goto L_0x0364
        L_0x021c:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.CANCEL_VOICE_INPUT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x022d
            com.google.android.apps.gsa.staticplugins.bisto.ae.a.g r3 = r12.f268160d
            r3.mo88971o()
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.CANCEL_VOICE_INPUT
            goto L_0x0364
        L_0x022d:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x023f
            r12.m158676s()
            r12.m158670m(r4)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            goto L_0x0364
        L_0x023f:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0251
            r12.m158676s()
            r12.m158670m(r7)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            goto L_0x0364
        L_0x0251:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0263
            r12.m158676s()
            r12.m158671n()
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT
            goto L_0x0364
        L_0x0263:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x027a
            boolean r3 = r12.m158678u(r0)
            if (r3 == 0) goto L_0x027a
            com.google.android.apps.gsa.staticplugins.bisto.ae.a.g r3 = r12.f268160d
            r3.mo88971o()
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            goto L_0x0364
        L_0x027a:
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.FETCH_ANNOUNCEMENTS
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0208
            com.google.android.apps.gsa.staticplugins.bisto.ae.a.g r3 = r12.f268160d
            r3.mo88971o()
            r12.mo89761c(r0)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.FETCH_ANNOUNCEMENTS
            goto L_0x0364
        L_0x028e:
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x02a2
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r12.f268172s
            boolean r5 = r5.mo89166n()
            if (r5 == 0) goto L_0x02a2
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            goto L_0x0364
        L_0x02a2:
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.TAKE_ACTION_ON_ANNOUNCEMENT
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x02b3
            com.google.android.apps.gsa.staticplugins.bisto.c.o r3 = r12.f268172s
            r3.mo89172t()
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.TAKE_ACTION_ON_ANNOUNCEMENT
            goto L_0x0364
        L_0x02b3:
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.STOP_ANNOUNCEMENTS
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x02c7
            r12.m158673p()
            com.google.android.apps.gsa.staticplugins.bisto.c.o r3 = r12.f268172s
            r3.mo89159g(r0)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.STOP_ANNOUNCEMENTS
            goto L_0x0364
        L_0x02c7:
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.SKIP_CURRENT_ANNOUNCEMENT
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x02da
            com.google.android.apps.gsa.staticplugins.bisto.c.o r3 = r12.f268172s
            com.google.common.b.pz r5 = com.google.common.p4522b.C58733pz.f156496a
            r3.mo89171s(r5, r4)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.SKIP_CURRENT_ANNOUNCEMENT
            goto L_0x0364
        L_0x02da:
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x031d
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r12.f268172s
            boolean r5 = r5.mo89164l()
            if (r5 == 0) goto L_0x02fa
            com.google.android.apps.gsa.staticplugins.bisto.c.aa r3 = r12.f268161e
            r3.mo89130i()
            com.google.android.apps.gsa.staticplugins.bisto.c.o r3 = r12.f268172s
            r3.mo89163k()
            r12.m158677t(r4)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            goto L_0x0364
        L_0x02fa:
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r12.f268172s
            boolean r5 = r5.mo89165m()
            if (r5 == 0) goto L_0x0315
            r12.m158676s()
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r12.f268172s
            r5.mo89162j(r3)
            com.google.android.apps.gsa.staticplugins.bisto.c.o r3 = r12.f268172s
            r3.mo89163k()
            r12.m158677t(r4)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            goto L_0x0364
        L_0x0315:
            com.google.android.apps.gsa.staticplugins.bisto.b.b.c r3 = r12.f268162f
            r5 = 5
            r3.mo89096a(r5)
            goto L_0x0208
        L_0x031d:
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto L_0x032d
            com.google.android.d.ck r5 = com.google.android.p10712d.C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x0208
        L_0x032d:
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r12.f268172s
            boolean r5 = r5.mo89164l()
            if (r5 == 0) goto L_0x0345
            com.google.android.apps.gsa.staticplugins.bisto.c.aa r3 = r12.f268161e
            r3.mo89130i()
            com.google.android.apps.gsa.staticplugins.bisto.c.o r3 = r12.f268172s
            r3.mo89163k()
            r12.m158677t(r7)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            goto L_0x0364
        L_0x0345:
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r12.f268172s
            boolean r5 = r5.mo89165m()
            if (r5 == 0) goto L_0x0360
            r12.m158676s()
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r12.f268172s
            r5.mo89162j(r3)
            com.google.android.apps.gsa.staticplugins.bisto.c.o r3 = r12.f268172s
            r3.mo89163k()
            r12.m158677t(r7)
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            goto L_0x0364
        L_0x0360:
            r12.f268170n = r4
            goto L_0x0208
        L_0x0364:
            if (r3 == 0) goto L_0x036c
            com.google.android.apps.gsa.staticplugins.bisto.o.a r13 = r12.f268166j
            r13.mo89667b(r1, r3, r2)
            return
        L_0x036c:
            com.google.android.apps.gsa.staticplugins.bisto.o.c.b r3 = r12.f268164h
            if (r2 == 0) goto L_0x0374
            if (r2 != r13) goto L_0x0373
            goto L_0x0374
        L_0x0373:
            r4 = 0
        L_0x0374:
            java.util.concurrent.atomic.AtomicBoolean r13 = r3.f268225a
            boolean r13 = r13.getAndSet(r7)
            if (r4 == 0) goto L_0x0398
            com.google.android.d.ck r4 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L_0x0394
            com.google.android.d.ck r4 = com.google.android.p10712d.C142359ck.MEDIA_PLAY
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L_0x0394
            com.google.android.d.ck r4 = com.google.android.p10712d.C142359ck.MEDIA_PAUSE
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x0398
        L_0x0394:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
            goto L_0x0408
        L_0x0398:
            com.google.android.d.ck r4 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L_0x03ff
            com.google.android.d.ck r4 = com.google.android.p10712d.C142359ck.MEDIA_PLAY
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x03b1
            com.google.android.d.ck r4 = com.google.android.p10712d.C142359ck.MEDIA_PAUSE
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x03b1
            goto L_0x03ff
        L_0x03b1:
            com.google.android.d.ck r4 = com.google.android.p10712d.C142359ck.MEDIA_PAUSE
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x03c3
            com.google.android.apps.gsa.staticplugins.bisto.util.an r3 = r3.f268227c
            r4 = 127(0x7f, float:1.78E-43)
            r3.mo90148j(r4, r13)
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.MEDIA_PAUSE
            goto L_0x0408
        L_0x03c3:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.MEDIA_PLAY
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L_0x03d3
            com.google.android.apps.gsa.staticplugins.bisto.util.an r13 = r3.f268227c
            r13.mo90143d()
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.MEDIA_PLAY
            goto L_0x0408
        L_0x03d3:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.PREV_TRACK
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L_0x03e8
            com.google.android.apps.gsa.staticplugins.bisto.util.an r13 = r3.f268227c
            r13.mo90146g()
            com.google.android.apps.gsa.staticplugins.bisto.util.an r13 = r3.f268227c
            r13.mo90143d()
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.PREV_TRACK
            goto L_0x0408
        L_0x03e8:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.NEXT_TRACK
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L_0x03fd
            com.google.android.apps.gsa.staticplugins.bisto.util.an r13 = r3.f268227c
            r13.mo90145f()
            com.google.android.apps.gsa.staticplugins.bisto.util.an r13 = r3.f268227c
            r13.mo90143d()
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.NEXT_TRACK
            goto L_0x0408
        L_0x03fd:
            r13 = r6
            goto L_0x0408
        L_0x03ff:
            com.google.android.apps.gsa.staticplugins.bisto.util.an r3 = r3.f268227c
            r4 = 85
            r3.mo90148j(r4, r13)
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
        L_0x0408:
            if (r13 == 0) goto L_0x0413
            r12.m158674q(r2, r0)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r0 = r12.f268166j
            r0.mo89667b(r1, r13, r2)
            return
        L_0x0413:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.HFP_VOICE_ACTIVATION
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L_0x0432
            com.google.android.libraries.gsa.k.g r13 = r12.f268178z
            com.google.android.apps.gsa.staticplugins.bisto.o.bg r3 = new com.google.android.apps.gsa.staticplugins.bisto.o.bg
            r3.<init>(r12)
            java.lang.String r4 = "play-correction-prompt"
            r13.mo28212l(r4, r3)
            r12.m158674q(r2, r0)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r13 = r12.f268166j
            com.google.android.d.ck r0 = com.google.android.p10712d.C142359ck.HFP_VOICE_ACTIVATION
            r13.mo89667b(r1, r0, r2)
            return
        L_0x0432:
            com.google.android.apps.gsa.staticplugins.bisto.o.a r13 = r12.f268166j
            r13.mo89667b(r1, r6, r2)
        L_0x0437:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95771bi.m158672o(com.google.android.d.cl):void");
    }

    /* renamed from: p */
    private final void m158673p() {
        if (this.f268161e.mo89131j()) {
            C59104x b = f268149o.mo56224b();
            b.mo56378ag(C58975e.f156826a, "QpuDeviceInputHandler");
            ((C59052c) ((C59052c) b).mo56372aa(15330)).mo56386p("Force stop interaction");
            C95214aa aaVar = this.f268161e;
            aaVar.mo89125d(aaVar.mo89122a());
        }
    }

    /* renamed from: q */
    private final void m158674q(int i, C95294af afVar) {
        if (i == 3) {
            this.f268160d.mo88971o();
        } else if (i == 0) {
            this.f268172s.mo89159g(afVar);
        } else if (i == 6) {
            C95239o oVar = this.f268172s;
            if (oVar.f266455i.isPresent() && !((C95238n) oVar.f266455i.get()).mo89151b()) {
                C95237m mVar = oVar.f266450d;
                if (mVar.f266443a) {
                    mVar.mo89149b(true);
                }
            }
            oVar.f266455i = Optional.empty();
        }
    }

    /* renamed from: r */
    private final void m158675r() {
        if (!this.f268175w.mo83555j(161) && this.f268155D) {
            this.f268172s.f266450d.mo89149b(false);
            this.f268155D = false;
        }
        C95214aa aaVar = this.f268161e;
        aaVar.mo89125d(aaVar.mo89122a());
        this.f268164h.mo89771a();
    }

    /* renamed from: s */
    private final void m158676s() {
        if (!this.f268161e.mo89131j() || !(this.f268161e.mo89123b() instanceof C95770bh)) {
            this.f268161e.mo89128g(true);
            this.f268161e.mo89132k(new C95770bh(this), true);
            return;
        }
        this.f268161e.mo89133l();
    }

    /* renamed from: t */
    private final void m158677t(boolean z) {
        boolean z2 = true;
        if (!this.f268158b.mo89256C() && !z) {
            z2 = false;
        }
        this.f268160d.mo88968l(z, z2);
    }

    /* renamed from: u */
    private final boolean m158678u(C95294af afVar) {
        C95662k kVar = this.f268168l;
        if (kVar == null) {
            C89655j.m145957a("No button handler");
            return true;
        } else if (kVar.mo89630b(afVar, new C95770bh(this))) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: E */
    public final boolean mo89254E(String str, int i, int i2, byte[] bArr) {
        String str2;
        if (i != 2) {
            return false;
        }
        if (!str.equals(this.f268158b.mo89270k())) {
            C59104x d = f268149o.mo56226d();
            d.mo56378ag(C58975e.f156826a, "QpuDeviceInputHandler");
            ((C59052c) ((C59052c) d).mo56372aa(15339)).mo56386p("Ignoring input from different device");
            return false;
        }
        try {
            if (!this.f268167k.mo89721c(i2, bArr, mo89760b())) {
                C142360cl clVar = null;
                if (i2 == 6) {
                    C142366cr crVar = (C142366cr) C62942bv.parseFrom((C62942bv) C142366cr.f386310c, bArr);
                    C58976aa aaVar = C58975e.f156826a;
                    int a = C142365cq.m231068a(crVar.f386312a);
                    if (a == 0) {
                        a = 1;
                    }
                    boolean z = crVar.f386313b;
                    C124548d dVar = this.f268171r;
                    if (dVar == null) {
                        C59104x c = f268149o.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "QpuDeviceInputHandler");
                        ((C59052c) ((C59052c) c).mo56372aa(15326)).mo56389s("Can't process input for device %s", this.f268158b.mo89270k());
                    } else {
                        clVar = C95827z.m158862a(dVar, a, z);
                    }
                    if (clVar != null) {
                        m158672o(clVar);
                    }
                } else if (i2 == 2) {
                    C142383dh dhVar = (C142383dh) C62942bv.parseFrom((C62942bv) C142383dh.f386354m, bArr);
                    C58976aa aaVar2 = C58975e.f156826a;
                    boolean z2 = dhVar.f386366k;
                    boolean z3 = dhVar.f386367l;
                    if (z2) {
                        Optional of = Optional.m71637of(this.f268176x.mo89814a(4));
                        this.f268152A = of;
                        C95832d dVar2 = (C95832d) of.get();
                        C124548d dVar3 = this.f268171r;
                        if (dVar3 == null) {
                            str2 = BuildConfig.FLAVOR;
                        } else {
                            str2 = dVar3.mo106471L();
                        }
                        dVar2.mo89802c(str2);
                        this.f268160d.mo88973q(this.f268152A);
                        this.f268153B = Optional.empty();
                    } else {
                        this.f268152A = Optional.empty();
                    }
                    return true;
                } else if (i2 == 3) {
                    C58976aa aaVar3 = C58975e.f156826a;
                    int i3 = ((C142386dk) C62942bv.parseFrom((C62942bv) C142386dk.f386370c, bArr)).f386373b;
                    if (this.f268152A.isPresent()) {
                        ((C95832d) this.f268152A.get()).mo89809j(C60091kk.HOTWORD_AUDIO_VOICE_STOP);
                    }
                    if (this.f268153B.isPresent()) {
                        ((C95834f) this.f268153B.get()).mo89815a(3, (C60070js) C60072ju.f162395f.createBuilder());
                    }
                    return true;
                } else if (i2 == 10) {
                    C58976aa aaVar4 = C58975e.f156826a;
                    boolean z4 = ((C142379dd) C62942bv.parseFrom((C62942bv) C142379dd.f386345b, bArr)).f386347a;
                    if (this.f268152A.isPresent()) {
                        ((C95832d) this.f268152A.get()).mo89805f(C60091kk.HOTWORD_VOICEINFO_RECEIVED, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
                    }
                    return true;
                } else if (i2 == 9) {
                    m158672o((C142360cl) C62942bv.parseFrom((C62942bv) C142360cl.f386303e, bArr));
                }
                return true;
            }
            return true;
        } catch (C62974ct e) {
            C59104x c2 = f268149o.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "QpuDeviceInputHandler");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(15334)).mo56386p("Invalid proto");
        }
    }

    /* renamed from: a */
    public final void mo89181a() {
        this.f268172s.mo89159g(this.f268163g.mo89222a());
    }

    /* renamed from: b */
    public final int mo89760b() {
        if (this.f268174v.mo89723b()) {
            return 4;
        }
        if (this.f268160d.mo88970n()) {
            return 6;
        }
        if (this.f268160d.mo88965h() != 0) {
            return 3;
        }
        if (this.f268172s.mo89168p()) {
            return 0;
        }
        Boolean a = this.f268164h.f268227c.mo90140a();
        if (a == null) {
            return 5;
        }
        return a.booleanValue() ? 1 : 2;
    }

    /* renamed from: c */
    public final void mo89761c(C95294af afVar) {
        C95662k kVar = this.f268168l;
        if (kVar == null) {
            C89655j.m145957a("No button handler");
            return;
        }
        C95770bh bhVar = new C95770bh(this);
        C124548d dVar = this.f268171r;
        if (!kVar.mo89631c(afVar, bhVar, dVar != null ? dVar.mo106476Q() : null)) {
            C59104x c = f268149o.mo56225c();
            c.mo56378ag(C58975e.f156826a, "QpuDeviceInputHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15327)).mo56386p("Fetch failed");
        }
    }

    public final void close() {
        m158673p();
        ((C89496ch) this.f268159c.mo27525b()).mo83379U(this);
        this.f268160d.mo88969m((C95045h) null);
        this.f268158b.mo89275p(this);
    }

    /* renamed from: d */
    public final void mo89560d(C95606b bVar) {
        this.f268174v.f268042a.set(bVar);
    }

    /* renamed from: e */
    public final void mo89561e() {
        this.f268174v.f268042a.set((Object) null);
    }

    /* renamed from: f */
    public final void mo89008f() {
        this.f268172s.f266450d.mo89149b(false);
        m158675r();
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (str.equals(this.f268158b.mo89270k())) {
            this.f268171r = dVar;
        }
    }

    /* renamed from: g */
    public final void mo89627g(C95662k kVar) {
        this.f268168l = kVar;
    }

    /* renamed from: h */
    public final void mo89628h(C95688l lVar) {
        this.f268169m = lVar;
        this.f268167k.f268033a = lVar;
    }

    /* renamed from: i */
    public final void mo88974i(int i) {
        C59104x b = f268149o.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QpuDeviceInputHandler");
        ((C59052c) ((C59052c) b).mo56372aa(15331)).mo56387q("onStatusChanged: %d", i);
        if (this.f268175w.mo83555j(161) && (i == 3 || i == 4)) {
            return;
        }
        if (i == 3) {
            this.f268172s.f266450d.mo89148a(false);
            this.f268155D = true;
            m158676s();
        } else if (i == 1) {
            this.f268154C = true;
        } else if (i == 4) {
            this.f268154C = false;
        } else if (i == 0 && this.f268154C) {
            m158675r();
        }
    }

    /* renamed from: j */
    public final void mo88975j() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268178z.mo28212l("no-speech-tts", new C95767be(this));
    }

    /* renamed from: k */
    public final void mo88976k(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f268160d.mo88970n()) {
            C95239o oVar = this.f268172s;
            C59104x b = C95239o.f266447a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoAudioController");
            ((C59052c) ((C59052c) b).mo56372aa(14708)).mo56386p("Transcription received");
            if (oVar.f266455i.isEmpty()) {
                C59104x d = C95239o.f266447a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoAudioController");
                ((C59052c) ((C59052c) d).mo56372aa(14710)).mo56386p("transcription received for unknown source");
                return;
            }
            C94641e a = ((C95238n) oVar.f266455i.get()).mo89150a();
            if (a != null && a.mo88596o()) {
                a.mo88590i(str, new C95226b(oVar, ((C95238n) oVar.f266455i.get()).mo89151b()));
                oVar.f266455i = Optional.empty();
            }
        }
    }
}
