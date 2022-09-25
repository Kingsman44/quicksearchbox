package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95606b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95688l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95655d;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95662k;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95064aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95250z;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95352bc;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95379cc;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7511a.C95709a;
import com.google.android.apps.gsa.staticplugins.bisto.p7517s.C95864f;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96456an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142360cl;
import com.google.android.p10712d.C142365cq;
import com.google.android.p10712d.C142366cr;
import com.google.android.p10712d.C142377db;
import com.google.android.p10712d.C142379dd;
import com.google.android.p10712d.C142381df;
import com.google.android.p10712d.C142383dh;
import com.google.android.p10712d.C142386dk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import dagger.C68214a;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.y */
/* compiled from: PG */
public final class C95826y implements AutoCloseable, C95352bc, C89495cg, C95655d, C95250z {

    /* renamed from: a */
    public static final C59071e f268307a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.y");

    /* renamed from: A */
    private final C95239o f268308A;

    /* renamed from: B */
    private boolean f268309B;

    /* renamed from: C */
    private boolean f268310C;

    /* renamed from: D */
    private PlaybackStatus f268311D;

    /* renamed from: E */
    private C95824w f268312E;

    /* renamed from: F */
    private final C95064aa f268313F;

    /* renamed from: G */
    private final C95864f f268314G;

    /* renamed from: H */
    private final C95709a f268315H;

    /* renamed from: b */
    public final Context f268316b;

    /* renamed from: c */
    public final AudioManager f268317c;

    /* renamed from: d */
    public final C95379cc f268318d;

    /* renamed from: e */
    public final C95295ag f268319e;

    /* renamed from: f */
    public final C68214a f268320f;

    /* renamed from: g */
    public final C22871g f268321g;

    /* renamed from: h */
    public final C95801cg f268322h;

    /* renamed from: i */
    public final C95214aa f268323i;

    /* renamed from: j */
    public final C95188c f268324j;

    /* renamed from: k */
    public final C95355bf f268325k;

    /* renamed from: l */
    public final String f268326l;

    /* renamed from: m */
    public final C95803ci f268327m;

    /* renamed from: n */
    public final C96456an f268328n;

    /* renamed from: o */
    public final C95708a f268329o;

    /* renamed from: p */
    public final C95735az f268330p;

    /* renamed from: q */
    public C95662k f268331q;

    /* renamed from: r */
    public C95688l f268332r;

    /* renamed from: s */
    public C60870cx f268333s;

    /* renamed from: t */
    public C60870cx f268334t;

    /* renamed from: v */
    private final C22870f f268335v = new C95822u(this);

    /* renamed from: w */
    private final C22870f f268336w = new C95823v(this);

    /* renamed from: x */
    private final C95736b f268337x = new C95736b();

    /* renamed from: y */
    private final C87594r f268338y;

    /* renamed from: z */
    private final C89656k f268339z;

    public C95826y(Context context, C95379cc ccVar, C95803ci ciVar, C87594r rVar, C68214a aVar, C22871g gVar, C89656k kVar, C95295ag agVar, C95801cg cgVar, C95239o oVar, C95214aa aaVar, C95188c cVar, C95355bf bfVar, C95709a aVar2, String str, C95864f fVar, C95064aa aaVar2, C95735az azVar, C95708a aVar3) {
        this.f268316b = context;
        this.f268318d = ccVar;
        this.f268321g = gVar;
        this.f268325k = bfVar;
        this.f268317c = (AudioManager) context.getSystemService("audio");
        this.f268327m = ciVar;
        this.f268338y = rVar;
        this.f268319e = agVar;
        this.f268314G = fVar;
        C124548d b = ((C89492cd) aVar.mo27525b()).mo83401b(bfVar.mo89270k());
        this.f268328n = new C96456an(context, gVar, (b != null ? b.mo106514l() : C124721s.UNKNOWN_DEVICE_TYPE) == C124721s.WIRED, str);
        this.f268320f = aVar;
        this.f268339z = kVar;
        this.f268322h = cgVar;
        this.f268308A = oVar;
        this.f268323i = aaVar;
        this.f268324j = cVar;
        this.f268326l = bfVar.mo89270k();
        this.f268315H = aVar2;
        this.f268313F = aaVar2;
        this.f268330p = azVar;
        this.f268329o = aVar3;
    }

    /* renamed from: j */
    private final synchronized C95824w m158835j(String str) {
        C124548d b;
        C95824w wVar = this.f268312E;
        if ((wVar == null || !wVar.f268297a.equals(str)) && (b = ((C89492cd) this.f268320f.mo27525b()).mo83401b(str)) != null) {
            this.f268312E = new C95824w(b);
        }
        C95824w wVar2 = this.f268312E;
        if (wVar2 == null || !str.equals(wVar2.f268297a)) {
            C59104x c = f268307a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceInputHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15183)).mo56389s("Device info missing for %s", str);
            return null;
        }
        return this.f268312E;
    }

    /* renamed from: k */
    private final void m158836k(C95825x xVar) {
        this.f268321g.mo28212l("correct-voice-query", new C95817p(this, xVar));
    }

    /* renamed from: l */
    private final void m158837l(List list, int i, C95294af afVar, C95825x xVar) {
        if (this.f268331q == null) {
            C89655j.m145957a("No button handler");
            this.f268329o.mo89667b(list, (C142359ck) null, i);
            return;
        }
        if (this.f268325k.mo89279x()) {
            this.f268324j.mo89096a(2);
        }
        C95662k kVar = this.f268331q;
        if (kVar != null && !kVar.mo89631c(afVar, xVar, mo89792c())) {
            C59104x c = f268307a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceInputHandler");
            ((C59052c) ((C59052c) c).mo56372aa(15185)).mo56386p("How did a fetch gesture get started while audio paused (presumably in a voice: session or phone call?) or perhaps we are off head and the AudioController isn't available.");
        }
        this.f268329o.mo89667b(list, C142359ck.FETCH_ANNOUNCEMENTS, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x038f, code lost:
        if (r2 == false) goto L_0x03a9;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m158838m(com.google.android.p10712d.C142360cl r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            com.google.android.apps.gsa.staticplugins.bisto.f.ag r2 = r0.f268319e
            com.google.android.apps.gsa.staticplugins.bisto.f.af r2 = r2.mo89222a()
            int r3 = r20.mo89791b()
            com.google.common.f.e r4 = f268307a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "DeviceInputHandler"
            r4.mo56378ag(r5, r6)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 15186(0x3b52, float:2.128E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r5 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95708a.m158482a(r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "[ "
            r7.<init>(r8)
            com.google.protobuf.cj r8 = new com.google.protobuf.cj
            com.google.protobuf.ch r9 = r1.f386306b
            com.google.protobuf.ci r10 = com.google.android.p10712d.C142360cl.f386302c
            r8.<init>(r9, r10)
            java.util.Iterator r8 = r8.iterator()
        L_0x003d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0056
            java.lang.Object r9 = r8.next()
            com.google.android.d.ck r9 = (com.google.android.p10712d.C142359ck) r9
            java.lang.String r9 = r9.name()
            r7.append(r9)
            java.lang.String r9 = " "
            r7.append(r9)
            goto L_0x003d
        L_0x0056:
            java.lang.String r8 = "]"
            r7.append(r8)
            java.lang.String r8 = "Context %s Action input %s"
            java.lang.String r7 = r7.toString()
            r4.mo56354G(r8, r5, r7)
            com.google.android.apps.gsa.staticplugins.bisto.o.az r4 = r0.f268330p
            boolean r4 = r4.mo89720b(r2, r1, r3)
            if (r4 == 0) goto L_0x006d
            return
        L_0x006d:
            java.util.ArrayList r4 = new java.util.ArrayList
            com.google.protobuf.cj r5 = new com.google.protobuf.cj
            com.google.protobuf.ch r7 = r1.f386306b
            com.google.protobuf.ci r8 = com.google.android.p10712d.C142360cl.f386302c
            r5.<init>(r7, r8)
            r4.<init>(r5)
            int r5 = r1.f386305a
            r7 = 1
            r5 = r5 & r7
            r8 = 0
            if (r5 == 0) goto L_0x0089
            com.google.android.apps.gsa.staticplugins.bisto.s.f r5 = r0.f268314G
            com.google.android.apps.gsa.staticplugins.bisto.o.e r5 = r5.mo89825a(r1)
            goto L_0x008a
        L_0x0089:
            r5 = r8
        L_0x008a:
            com.google.android.apps.gsa.staticplugins.bisto.o.t r9 = new com.google.android.apps.gsa.staticplugins.bisto.o.t
            r9.<init>(r0)
            com.google.common.p4522b.C58557jl.m90145z(r4, r9)
            com.google.android.d.ck r9 = com.google.android.p10712d.C142359ck.COMPLETE_VOICE_INPUT
            boolean r9 = r4.remove(r9)
            r10 = 3
            r11 = 0
            if (r9 == 0) goto L_0x00cf
            if (r3 != r10) goto L_0x00a4
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r9 = r0.f268327m
            r9.mo89711Q()
            goto L_0x00a9
        L_0x00a4:
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r9 = r0.f268327m
            r9.mo89709O()
        L_0x00a9:
            boolean r9 = r0.f268309B
            if (r9 == 0) goto L_0x00bd
            r0.f268309B = r11
            com.google.android.libraries.gsa.k.g r9 = r0.f268321g
            com.google.android.apps.gsa.staticplugins.bisto.o.q r12 = new com.google.android.apps.gsa.staticplugins.bisto.o.q
            r12.<init>(r0)
            java.lang.String r13 = "effect"
            r14 = 250(0xfa, double:1.235E-321)
            r9.mo28213m(r13, r14, r12)
        L_0x00bd:
            com.google.android.apps.gsa.staticplugins.bisto.o.a r9 = r0.f268329o
            com.google.protobuf.cj r12 = new com.google.protobuf.cj
            com.google.protobuf.ch r13 = r1.f386306b
            com.google.protobuf.ci r14 = com.google.android.p10712d.C142360cl.f386302c
            r12.<init>(r13, r14)
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.COMPLETE_VOICE_INPUT
            r9.mo89667b(r12, r13, r3)
            r9 = 1
            goto L_0x00d0
        L_0x00cf:
            r9 = 0
        L_0x00d0:
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r12 = r0.f268325k
            boolean r12 = r12.mo89279x()
            if (r12 == 0) goto L_0x0110
            com.google.common.f.e r12 = f268307a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r13, r6)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            r13 = 15190(0x3b56, float:2.1286E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r13)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            boolean r13 = r20.m158849x()
            boolean r14 = r20.m158848w()
            java.lang.String r15 = "Filtering wired actions: Voice/Fetch Allowed %b/%b"
            r12.mo56358K(r15, r13, r14)
            boolean r12 = r20.m158849x()
            if (r12 != 0) goto L_0x0105
            com.google.android.apps.gsa.staticplugins.bisto.o.r r12 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95819r.f268292a
            com.google.common.p4522b.C58557jl.m90145z(r4, r12)
        L_0x0105:
            boolean r12 = r20.m158848w()
            if (r12 != 0) goto L_0x0110
            com.google.android.apps.gsa.staticplugins.bisto.o.s r12 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95820s.f268293a
            com.google.common.p4522b.C58557jl.m90145z(r4, r12)
        L_0x0110:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r4)
            com.google.common.b.ij r13 = f267745u
            r12.retainAll(r13)
            com.google.common.b.ij r13 = f267745u
            r4.removeAll(r13)
            boolean r13 = r4.isEmpty()
            if (r13 == 0) goto L_0x0198
            if (r5 == 0) goto L_0x012d
            boolean r13 = r5.mo89780a()
            if (r13 != 0) goto L_0x0198
        L_0x012d:
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x0183
            com.google.protobuf.cj r2 = new com.google.protobuf.cj
            com.google.protobuf.ch r1 = r1.f386306b
            com.google.protobuf.ci r4 = com.google.android.p10712d.C142360cl.f386302c
            r2.<init>(r1, r4)
            com.google.android.apps.gsa.search.shared.media.r r1 = r0.f268338y
            com.google.android.apps.gsa.search.shared.media.PlaybackStatus r1 = r1.mo81727f()
            r0.f268311D = r1
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.WILL_PAUSE
            boolean r1 = r12.contains(r1)
            if (r1 == 0) goto L_0x015e
            if (r3 != r7) goto L_0x015e
            com.google.android.apps.gsa.staticplugins.bisto.util.an r1 = r0.f268328n
            boolean r1 = r1.mo90147i()
            r0.f268310C = r1
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r3 = com.google.android.p10712d.C142359ck.WILL_PAUSE
            r1.mo89667b(r2, r3, r7)
            r3 = 1
        L_0x015e:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.PREPARE_VOICE_INPUT
            boolean r1 = r12.contains(r1)
            if (r1 == 0) goto L_0x0197
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r1 = r0.f268325k
            boolean r1 = r1.mo89279x()
            if (r1 == 0) goto L_0x0176
            com.google.android.apps.gsa.staticplugins.bisto.b.b.c r1 = r0.f268324j
            r2 = 9
            r1.mo89096a(r2)
            return
        L_0x0176:
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r1 = r0.f268327m
            r1.mo89708N()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r4 = com.google.android.p10712d.C142359ck.PREPARE_VOICE_INPUT
            r1.mo89667b(r2, r4, r3)
            return
        L_0x0183:
            if (r9 != 0) goto L_0x0197
            com.google.common.f.e r1 = f268307a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r6)
            java.lang.String r2 = "No actions given"
            r3 = 15189(0x3b55, float:2.1284E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x0197:
            return
        L_0x0198:
            if (r9 == 0) goto L_0x019b
            return
        L_0x019b:
            boolean r9 = r0.f268310C
            r0.f268310C = r11
            com.google.android.apps.gsa.search.shared.media.PlaybackStatus r12 = r0.f268311D
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.VOLUME_DOWN_STOP
            boolean r13 = r4.contains(r13)
            if (r13 == 0) goto L_0x01b8
            com.google.common.util.concurrent.cx r2 = r0.f268334t
            if (r2 == 0) goto L_0x01b2
            r2.cancel(r11)
            r0.f268334t = r8
        L_0x01b2:
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.VOLUME_DOWN_STOP
            r0.m158841p(r1, r2, r3, r9)
            return
        L_0x01b8:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.VOLUME_UP_STOP
            boolean r13 = r4.contains(r13)
            if (r13 == 0) goto L_0x01cf
            com.google.common.util.concurrent.cx r2 = r0.f268333s
            if (r2 == 0) goto L_0x01c9
            r2.cancel(r11)
            r0.f268333s = r8
        L_0x01c9:
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.VOLUME_UP_STOP
            r0.m158841p(r1, r2, r3, r9)
            return
        L_0x01cf:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.VOLUME_DOWN_ONCE
            boolean r13 = r4.contains(r13)
            if (r13 == 0) goto L_0x01e0
            r0.mo89795i(r11)
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.VOLUME_DOWN_ONCE
            r0.m158841p(r1, r2, r3, r9)
            return
        L_0x01e0:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.VOLUME_UP_ONCE
            boolean r13 = r4.contains(r13)
            if (r13 == 0) goto L_0x01f1
            r0.mo89795i(r7)
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.VOLUME_UP_ONCE
            r0.m158841p(r1, r2, r3, r9)
            return
        L_0x01f1:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.VOLUME_DOWN_START
            boolean r13 = r4.contains(r13)
            r14 = 800(0x320, double:3.953E-321)
            if (r13 == 0) goto L_0x0213
            boolean r2 = r0.mo89795i(r11)
            if (r2 == 0) goto L_0x020d
            com.google.android.libraries.gsa.k.g r2 = r0.f268321g
            java.lang.String r4 = "down"
            com.google.android.libraries.gsa.k.f r5 = r0.f268336w
            com.google.common.util.concurrent.cx r2 = r2.mo28208h(r4, r14, r5)
            r0.f268334t = r2
        L_0x020d:
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.VOLUME_DOWN_START
            r0.m158841p(r1, r2, r3, r9)
            return
        L_0x0213:
            com.google.android.d.ck r13 = com.google.android.p10712d.C142359ck.VOLUME_UP_START
            boolean r13 = r4.contains(r13)
            if (r13 == 0) goto L_0x0233
            boolean r2 = r0.mo89795i(r7)
            if (r2 == 0) goto L_0x022d
            com.google.android.libraries.gsa.k.g r2 = r0.f268321g
            java.lang.String r4 = "up"
            com.google.android.libraries.gsa.k.f r5 = r0.f268335v
            com.google.common.util.concurrent.cx r2 = r2.mo28208h(r4, r14, r5)
            r0.f268333s = r2
        L_0x022d:
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.VOLUME_UP_START
            r0.m158841p(r1, r2, r3, r9)
            return
        L_0x0233:
            r13 = 4
            if (r3 != r13) goto L_0x0261
            com.google.android.apps.gsa.staticplugins.bisto.o.b r3 = r0.f268337x
            com.google.android.d.ck r3 = r3.mo89722a(r4)
            if (r3 != 0) goto L_0x0240
            r3 = 4
            goto L_0x0261
        L_0x0240:
            com.google.common.f.e r2 = f268307a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r6)
            java.lang.String r4 = "Handled alarm action"
            r5 = 15188(0x3b54, float:2.1283E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r2 = r0.f268329o
            com.google.protobuf.cj r4 = new com.google.protobuf.cj
            com.google.protobuf.ch r1 = r1.f386306b
            com.google.protobuf.ci r5 = com.google.android.p10712d.C142360cl.f386302c
            r4.<init>(r1, r5)
            r2.mo89667b(r4, r3, r13)
            return
        L_0x0261:
            if (r5 == 0) goto L_0x03a5
            com.google.android.apps.gsa.shared.bisto.k r15 = r0.f268339z
            r11 = 93
            boolean r11 = r15.mo83555j(r11)
            dagger.a r15 = r0.f268320f
            com.google.android.apps.gsa.staticplugins.bisto.ae.aa r10 = r0.f268313F
            java.lang.String r13 = r0.f268326l
            android.content.Context r8 = r0.f268316b
            android.content.res.Resources r8 = r8.getResources()
            r14 = 2132091318(0x7f1521b6, float:1.9823E38)
            java.lang.String r8 = r8.getString(r14)
            com.google.android.d.n r14 = r5.f268259d
            com.google.protobuf.cq r14 = r14.f386745a
            java.util.Iterator r14 = r14.iterator()
        L_0x0286:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x03a5
            java.lang.Object r16 = r14.next()
            r17 = r8
            r8 = r16
            com.google.android.d.l r8 = (com.google.android.p10712d.C142520l) r8
            r16 = r14
            int r14 = r8.f386741a
            if (r14 != r7) goto L_0x02c9
            java.lang.Object r14 = r8.f386742b
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            int r14 = com.google.android.p10712d.C142519k.m231094a(r14)
            if (r14 != 0) goto L_0x02ab
            goto L_0x02c9
        L_0x02ab:
            r7 = 5
            if (r14 != r7) goto L_0x02c9
            com.google.android.d.i r14 = com.google.android.p10712d.C142510i.GENERIC_ACTION
            com.google.android.d.i r7 = r5.f268258c
            boolean r7 = r14.equals(r7)
            if (r7 != 0) goto L_0x02c9
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r7 = r5.f268257b
            boolean r7 = r7.mo89685G()
            if (r7 == 0) goto L_0x02c9
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r1 = r5.f268257b
            r2 = 5
            r3 = 0
            r1.mo89687I(r3, r2)
            goto L_0x0392
        L_0x02c9:
            com.google.android.d.i r7 = com.google.android.p10712d.C142510i.GENERIC_ACTION
            int r7 = r8.f386741a
            com.google.android.d.i r7 = com.google.android.p10712d.C142510i.m231093a(r7)
            int r7 = r7.ordinal()
            java.lang.String r14 = "CustomActionsHandler"
            r18 = r2
            r2 = 2
            r19 = r12
            if (r7 == 0) goto L_0x031e
            r12 = 1
            if (r7 == r12) goto L_0x02ef
            if (r7 == r2) goto L_0x02ef
            int r2 = r8.f386741a
            r14 = r16
            r8 = r17
            r2 = r18
            r12 = r19
            r7 = 1
            goto L_0x0286
        L_0x02ef:
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r2 = r5.f268257b
            boolean r2 = r2.mo89685G()
            if (r2 != 0) goto L_0x030c
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95806e.f268255a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r5, r14)
            java.lang.String r5 = "Not bound!"
            r7 = 15149(0x3b2d, float:2.1228E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r7)).mo56386p(r5)
        L_0x0309:
            r2 = 0
            goto L_0x038f
        L_0x030c:
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r2 = r5.f268257b
            java.util.concurrent.atomic.AtomicReference r2 = r2.f267985c
            java.lang.Object r2 = r2.get()
            com.google.android.apps.gsa.staticplugins.bisto.ae.c r2 = (com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95110c) r2
            if (r2 == 0) goto L_0x031b
            r2.mo89029b(r8)
        L_0x031b:
            r2 = 1
            goto L_0x038f
        L_0x031e:
            int r7 = r8.f386741a
            r12 = 1
            if (r7 != r12) goto L_0x0333
            java.lang.Object r7 = r8.f386742b
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r7 = com.google.android.p10712d.C142519k.m231094a(r7)
            if (r7 != 0) goto L_0x0334
            r7 = 1
            goto L_0x0334
        L_0x0333:
            r7 = 2
        L_0x0334:
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r8 = r5.f268257b
            boolean r8 = r8.mo89685G()
            if (r8 == 0) goto L_0x034f
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95806e.f268255a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r5, r14)
            java.lang.String r5 = "Already bound!"
            r7 = 15145(0x3b29, float:2.1223E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r7)).mo56386p(r5)
            goto L_0x0309
        L_0x034f:
            int r7 = r7 + -2
            r8 = 1
            if (r7 == r8) goto L_0x0387
            if (r7 == r2) goto L_0x037f
            r2 = 4
            if (r7 == r2) goto L_0x035a
            goto L_0x0309
        L_0x035a:
            if (r11 == 0) goto L_0x0309
            java.lang.Object r2 = r15.mo27525b()
            com.google.android.apps.gsa.shared.bisto.a.cd r2 = (com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd) r2
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r2 = r2.mo83401b(r13)
            if (r2 == 0) goto L_0x0375
            java.lang.String r2 = r2.mo106473N()
            boolean r5 = com.google.common.base.C58837ba.m90859h(r2)
            if (r5 == 0) goto L_0x0373
            goto L_0x0375
        L_0x0373:
            r8 = r2
            goto L_0x0377
        L_0x0375:
            r8 = r17
        L_0x0377:
            java.lang.String r2 = com.google.common.base.C58837ba.m90858g(r8)
            r10.mo88990f(r2)
            goto L_0x031b
        L_0x037f:
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r2 = r5.f268257b
            com.google.android.d.hq r5 = com.google.android.p10712d.C142500hq.DUO
            r2.mo89684E(r5)
            goto L_0x031b
        L_0x0387:
            com.google.android.apps.gsa.staticplugins.bisto.o.ao r2 = r5.f268257b
            com.google.android.d.hq r5 = com.google.android.p10712d.C142500hq.TRANSLATE
            r2.mo89684E(r5)
            goto L_0x031b
        L_0x038f:
            if (r2 != 0) goto L_0x0392
            goto L_0x03a9
        L_0x0392:
            com.google.common.f.e r1 = f268307a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r6)
            java.lang.String r2 = "Handled custom action"
            r3 = 15187(0x3b53, float:2.1282E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x03a5:
            r18 = r2
            r19 = r12
        L_0x03a9:
            com.google.android.apps.gsa.staticplugins.bisto.o.x r2 = new com.google.android.apps.gsa.staticplugins.bisto.o.x
            com.google.protobuf.cj r5 = new com.google.protobuf.cj
            com.google.protobuf.ch r6 = r1.f386306b
            com.google.protobuf.ci r7 = com.google.android.p10712d.C142360cl.f386302c
            r5.<init>(r6, r7)
            r2.<init>(r0, r9, r5, r3)
            if (r3 == 0) goto L_0x0669
            r5 = 3
            if (r3 == r5) goto L_0x04cd
            com.google.protobuf.cj r5 = new com.google.protobuf.cj
            com.google.protobuf.ch r1 = r1.f386306b
            com.google.protobuf.ci r6 = com.google.android.p10712d.C142360cl.f386302c
            r5.<init>(r1, r6)
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x03de
            r1 = 0
            r0.m158843r(r2, r1)
            r6 = r19
            r0.m158844s(r2, r6)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            r1.mo89667b(r5, r2, r3)
            return
        L_0x03de:
            r6 = r19
            r1 = 0
            com.google.android.d.ck r7 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            boolean r7 = r4.contains(r7)
            if (r7 == 0) goto L_0x03f7
            r0.m158843r(r2, r1)
            r0.m158845t(r2, r6)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            r1.mo89667b(r5, r2, r3)
            return
        L_0x03f7:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0407
            r1 = 1
            r0.m158843r(r2, r1)
            r0.m158845t(r2, r6)
            return
        L_0x0407:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            boolean r1 = r4.contains(r1)
            r6 = r18
            if (r1 == 0) goto L_0x0417
            boolean r1 = r0.m158850y(r5, r3, r6, r2)
            if (r1 != 0) goto L_0x04cc
        L_0x0417:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.FETCH_ANNOUNCEMENTS
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0423
            r0.m158837l(r5, r3, r6, r2)
            return
        L_0x0423:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.HFP_VOICE_ACTIVATION
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0436
            r0.m158836k(r2)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.HFP_VOICE_ACTIVATION
            r1.mo89667b(r5, r2, r3)
            return
        L_0x0436:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x04b9
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.MEDIA_PLAY
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x044f
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.MEDIA_PAUSE
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x044f
            goto L_0x04b9
        L_0x044f:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.MEDIA_PAUSE
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x046b
            com.google.android.apps.gsa.staticplugins.bisto.util.an r1 = r0.f268328n
            r4 = 127(0x7f, float:1.78E-43)
            boolean r2 = r2.f268302b
            boolean r1 = r1.mo90148j(r4, r2)
            if (r1 == 0) goto L_0x04cc
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.MEDIA_PAUSE
            r1.mo89667b(r5, r2, r3)
            return
        L_0x046b:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.MEDIA_PLAY
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0480
            com.google.android.apps.gsa.staticplugins.bisto.util.an r1 = r0.f268328n
            r1.mo90143d()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.MEDIA_PLAY
            r1.mo89667b(r5, r2, r3)
            return
        L_0x0480:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.PREV_TRACK
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0493
            r20.m158839n()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.PREV_TRACK
            r1.mo89667b(r5, r2, r3)
            return
        L_0x0493:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.NEXT_TRACK
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x04ad
            com.google.android.apps.gsa.staticplugins.bisto.util.an r1 = r0.f268328n
            r1.mo90145f()
            com.google.android.apps.gsa.staticplugins.bisto.util.an r1 = r0.f268328n
            r1.mo90143d()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.NEXT_TRACK
            r1.mo89667b(r5, r2, r3)
            return
        L_0x04ad:
            boolean r1 = r2.f268302b
            r0.m158842q(r1)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            r2 = 0
            r1.mo89667b(r5, r2, r3)
            return
        L_0x04b9:
            com.google.android.apps.gsa.staticplugins.bisto.util.an r1 = r0.f268328n
            r4 = 85
            boolean r2 = r2.f268302b
            boolean r1 = r1.mo90148j(r4, r2)
            if (r1 == 0) goto L_0x04cc
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
            r1.mo89667b(r5, r2, r3)
        L_0x04cc:
            return
        L_0x04cd:
            r6 = r19
            com.google.protobuf.cj r3 = new com.google.protobuf.cj
            com.google.protobuf.ch r1 = r1.f386306b
            com.google.protobuf.ci r5 = com.google.android.p10712d.C142360cl.f386302c
            r3.<init>(r1, r5)
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.ASSISTANT_NO_OP
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x04e9
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.ASSISTANT_NO_OP
            r4 = 3
            r1.mo89667b(r3, r2, r4)
            return
        L_0x04e9:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.END_ENDPOINTING_VOICE_INPUT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0508
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r1 = r0.f268327m
            boolean r1 = r1.mo89696t()
            if (r1 != 0) goto L_0x04fa
            goto L_0x0508
        L_0x04fa:
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r1 = r0.f268327m
            r1.mo88998d()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.END_ENDPOINTING_VOICE_INPUT
            r5 = 3
            r1.mo89667b(r3, r2, r5)
            return
        L_0x0508:
            r5 = 3
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.CANCEL_VOICE_INPUT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x051e
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r1 = r0.f268327m
            r1.mo89713g()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.CANCEL_VOICE_INPUT
            r1.mo89667b(r3, r2, r5)
            return
        L_0x051e:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x053e
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            boolean r1 = r1.mo89164l()
            if (r1 != 0) goto L_0x0532
            r1 = 0
            r0.m158843r(r2, r1)
        L_0x0532:
            r0.m158844s(r2, r6)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            r4 = 3
            r1.mo89667b(r3, r2, r4)
            return
        L_0x053e:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x055e
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            boolean r1 = r1.mo89164l()
            if (r1 != 0) goto L_0x0552
            r1 = 0
            r0.m158843r(r2, r1)
        L_0x0552:
            r0.m158845t(r2, r6)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            r4 = 3
            r1.mo89667b(r3, r2, r4)
            return
        L_0x055e:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0576
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            boolean r1 = r1.mo89164l()
            if (r1 != 0) goto L_0x0572
            r1 = 1
            r0.m158843r(r2, r1)
        L_0x0572:
            r0.m158845t(r2, r6)
            return
        L_0x0576:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.TAKE_ACTION_ON_ANNOUNCEMENT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x059b
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            com.google.android.apps.gsa.staticplugins.bisto.a.e r1 = r1.mo89153b()
            if (r1 != 0) goto L_0x0587
            goto L_0x059b
        L_0x0587:
            boolean r1 = r1.mo88595n()
            if (r1 == 0) goto L_0x059b
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            r1.mo89172t()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.TAKE_ACTION_ON_ANNOUNCEMENT
            r4 = 3
            r1.mo89667b(r3, r2, r4)
            return
        L_0x059b:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x05ab
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.FETCH_ANNOUNCEMENTS
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x05cf
        L_0x05ab:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x05c7
            com.google.android.apps.gsa.staticplugins.bisto.f.ag r1 = r0.f268319e
            com.google.android.apps.gsa.staticplugins.bisto.f.af r1 = r1.mo89222a()
            r5 = 3
            boolean r1 = r0.m158850y(r3, r5, r1, r2)
            if (r1 != 0) goto L_0x05c1
            goto L_0x05c7
        L_0x05c1:
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r1 = r0.f268327m
            r1.mo89713g()
            return
        L_0x05c7:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.FETCH_ANNOUNCEMENTS
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x0659
        L_0x05cf:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.HFP_VOICE_ACTIVATION
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x05e8
            r0.m158836k(r2)
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r1 = r0.f268327m
            r1.mo89713g()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.HFP_VOICE_ACTIVATION
            r4 = 3
            r1.mo89667b(r3, r2, r4)
            return
        L_0x05e8:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.MEDIA_PLAY
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x0648
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.MEDIA_PAUSE
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x0648
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0601
            goto L_0x0648
        L_0x0601:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.PREV_TRACK
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x061d
            r20.m158840o()
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r1 = r0.f268327m
            r1.mo89713g()
            r20.m158839n()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.PREV_TRACK
            r4 = 3
            r1.mo89667b(r3, r2, r4)
            return
        L_0x061d:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.NEXT_TRACK
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0640
            r20.m158840o()
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r1 = r0.f268327m
            r1.mo89713g()
            com.google.android.apps.gsa.staticplugins.bisto.util.an r1 = r0.f268328n
            r1.mo90145f()
            com.google.android.apps.gsa.staticplugins.bisto.util.an r1 = r0.f268328n
            r1.mo90143d()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.NEXT_TRACK
            r4 = 3
            r1.mo89667b(r3, r2, r4)
            return
        L_0x0640:
            r4 = 3
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            r2 = 0
            r1.mo89667b(r3, r2, r4)
            return
        L_0x0648:
            r4 = 3
            r20.m158840o()
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r1 = r0.f268327m
            r1.mo89713g()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
            r1.mo89667b(r3, r2, r4)
            return
        L_0x0659:
            r4 = 3
            com.google.android.apps.gsa.staticplugins.bisto.f.ag r1 = r0.f268319e
            com.google.android.apps.gsa.staticplugins.bisto.f.af r1 = r1.mo89222a()
            r0.m158837l(r3, r4, r1, r2)
            com.google.android.apps.gsa.staticplugins.bisto.o.ci r1 = r0.f268327m
            r1.mo89713g()
            return
        L_0x0669:
            r6 = r18
            com.google.protobuf.cj r3 = new com.google.protobuf.cj
            com.google.protobuf.ch r1 = r1.f386306b
            com.google.protobuf.ci r5 = com.google.android.p10712d.C142360cl.f386302c
            r3.<init>(r1, r5)
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.ASSISTANT_NO_OP
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0685
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.ASSISTANT_NO_OP
            r5 = 0
            r1.mo89667b(r3, r2, r5)
            return
        L_0x0685:
            r5 = 0
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x069f
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            boolean r1 = r1.mo89166n()
            if (r1 != 0) goto L_0x0697
            goto L_0x069f
        L_0x0697:
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.EXPAND_ANNOUNCEMENT
            r1.mo89667b(r3, r2, r5)
            return
        L_0x069f:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.TAKE_ACTION_ON_ANNOUNCEMENT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x06b4
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            r1.mo89172t()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.TAKE_ACTION_ON_ANNOUNCEMENT
            r1.mo89667b(r3, r2, r5)
            return
        L_0x06b4:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.STOP_ANNOUNCEMENTS
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x06ca
            r20.m158840o()
            r0.m158846u(r6)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.STOP_ANNOUNCEMENTS
            r1.mo89667b(r3, r2, r5)
            return
        L_0x06ca:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.SKIP_CURRENT_ANNOUNCEMENT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x06e7
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            if (r1 == 0) goto L_0x06de
            java.util.Set r2 = java.util.Collections.emptySet()
            r4 = 1
            r1.mo89171s(r2, r4)
        L_0x06de:
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.SKIP_CURRENT_ANNOUNCEMENT
            r4 = 0
            r1.mo89667b(r3, r2, r4)
            return
        L_0x06e7:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x072f
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            boolean r1 = r1.mo89164l()
            if (r1 == 0) goto L_0x0709
            com.google.android.apps.gsa.staticplugins.bisto.c.aa r1 = r0.f268323i
            r1.mo89130i()
            r1 = 0
            r0.m158844s(r2, r1)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            r4 = 3
            r1.mo89667b(r3, r2, r4)
            return
        L_0x0709:
            r1 = 0
            r4 = 3
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r0.f268308A
            boolean r5 = r5.mo89165m()
            if (r5 == 0) goto L_0x0728
            r5 = 0
            r0.m158843r(r2, r5)
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r0.f268308A
            r6 = 4
            r5.mo89162j(r6)
            r0.m158844s(r2, r1)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.START_ENDPOINTING_VOICE_INPUT
            r1.mo89667b(r3, r2, r4)
            return
        L_0x0728:
            com.google.android.apps.gsa.staticplugins.bisto.b.b.c r1 = r0.f268324j
            r2 = 5
            r1.mo89096a(r2)
            return
        L_0x072f:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x0773
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            boolean r1 = r1.mo89164l()
            if (r1 == 0) goto L_0x0751
            com.google.android.apps.gsa.staticplugins.bisto.c.aa r1 = r0.f268323i
            r1.mo89130i()
            r1 = 0
            r0.m158845t(r2, r1)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            r4 = 0
            r1.mo89667b(r3, r2, r4)
            return
        L_0x0751:
            r1 = 0
            r4 = 0
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r0.f268308A
            boolean r5 = r5.mo89165m()
            if (r5 == 0) goto L_0x076f
            r0.m158843r(r2, r4)
            com.google.android.apps.gsa.staticplugins.bisto.c.o r5 = r0.f268308A
            r6 = 4
            r5.mo89162j(r6)
            r0.m158845t(r2, r1)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            r1.mo89667b(r3, r2, r4)
            return
        L_0x076f:
            r1 = 1
            r0.f268309B = r1
            return
        L_0x0773:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x07b0
            com.google.android.apps.gsa.staticplugins.bisto.c.o r1 = r0.f268308A
            boolean r1 = r1.mo89164l()
            if (r1 == 0) goto L_0x0795
            com.google.android.apps.gsa.staticplugins.bisto.c.aa r1 = r0.f268323i
            r1.mo89130i()
            r1 = 0
            r0.m158845t(r2, r1)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.PERFORM_VOICE_INPUT
            r4 = 0
            r1.mo89667b(r3, r2, r4)
            return
        L_0x0795:
            r1 = 0
            com.google.android.apps.gsa.staticplugins.bisto.c.o r3 = r0.f268308A
            boolean r3 = r3.mo89165m()
            if (r3 == 0) goto L_0x07ac
            r3 = 1
            r0.m158843r(r2, r3)
            com.google.android.apps.gsa.staticplugins.bisto.c.o r3 = r0.f268308A
            r4 = 4
            r3.mo89162j(r4)
            r0.m158845t(r2, r1)
            return
        L_0x07ac:
            r3 = 1
            r0.f268309B = r3
            return
        L_0x07b0:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.HFP_VOICE_ACTIVATION
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x07c7
            r0.m158846u(r6)
            r0.m158836k(r2)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.HFP_VOICE_ACTIVATION
            r4 = 0
            r1.mo89667b(r3, r2, r4)
            return
        L_0x07c7:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.MEDIA_PLAY
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x0823
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.MEDIA_PAUSE
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x0823
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x07e0
            goto L_0x0823
        L_0x07e0:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.PREV_TRACK
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x07fa
            r20.m158840o()
            r0.m158846u(r6)
            r20.m158839n()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.PREV_TRACK
            r4 = 0
            r1.mo89667b(r3, r2, r4)
            return
        L_0x07fa:
            com.google.android.d.ck r1 = com.google.android.p10712d.C142359ck.NEXT_TRACK
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x081b
            r20.m158840o()
            r0.m158846u(r6)
            com.google.android.apps.gsa.staticplugins.bisto.util.an r1 = r0.f268328n
            r1.mo90145f()
            com.google.android.apps.gsa.staticplugins.bisto.util.an r1 = r0.f268328n
            r1.mo90143d()
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.NEXT_TRACK
            r4 = 0
            r1.mo89667b(r3, r2, r4)
            return
        L_0x081b:
            r4 = 0
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            r2 = 0
            r1.mo89667b(r3, r2, r4)
            return
        L_0x0823:
            r4 = 0
            r20.m158840o()
            r0.m158846u(r6)
            com.google.android.apps.gsa.staticplugins.bisto.o.a r1 = r0.f268329o
            com.google.android.d.ck r2 = com.google.android.p10712d.C142359ck.TOGGLE_PLAY_PAUSE
            r1.mo89667b(r3, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95826y.m158838m(com.google.android.d.cl):void");
    }

    /* renamed from: n */
    private final void m158839n() {
        this.f268328n.mo90146g();
        this.f268328n.mo90143d();
    }

    /* renamed from: o */
    private final void m158840o() {
        if (this.f268323i.mo89131j()) {
            C59104x b = f268307a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceInputHandler");
            ((C59052c) ((C59052c) b).mo56372aa(15192)).mo56386p("Force stop interaction");
            C95214aa aaVar = this.f268323i;
            aaVar.mo89125d(aaVar.mo89122a());
        }
    }

    /* renamed from: p */
    private final void m158841p(C142360cl clVar, C142359ck ckVar, int i, boolean z) {
        m158842q(z);
        this.f268329o.mo89667b(new C62963cj(clVar.f386306b, C142360cl.f386302c), ckVar, i);
    }

    /* renamed from: q */
    private final void m158842q(boolean z) {
        if (z) {
            this.f268328n.mo90144e();
        }
    }

    /* renamed from: r */
    private final void m158843r(C95825x xVar, boolean z) {
        if (this.f268323i.mo89131j()) {
            C95288a b = this.f268323i.mo89123b();
            if (b instanceof C95825x) {
                C58976aa aaVar = C58975e.f156826a;
                ((C95825x) b).f268301a = z;
                this.f268323i.mo89133l();
                return;
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        xVar.f268301a = z;
        this.f268323i.mo89132k(xVar, true);
    }

    /* renamed from: s */
    private final void m158844s(C95825x xVar, PlaybackStatus playbackStatus) {
        this.f268327m.mo89707M(xVar, playbackStatus);
    }

    /* renamed from: t */
    private final void m158845t(C95825x xVar, PlaybackStatus playbackStatus) {
        this.f268327m.mo89710P(xVar, playbackStatus);
    }

    /* renamed from: u */
    private final void m158846u(C95294af afVar) {
        this.f268327m.mo89713g();
        this.f268308A.mo89159g(afVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        return;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m158847v(java.lang.String r2, com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.apps.gsa.staticplugins.bisto.o.w r0 = r1.f268312E     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r0.f268297a     // Catch:{ all -> 0x0014 }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x0014 }
            if (r2 == 0) goto L_0x0012
            r1.mo89794f(r3)     // Catch:{ all -> 0x0014 }
            monitor-exit(r1)
            return
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95826y.m158847v(java.lang.String, com.google.android.apps.search.assistant.surfaces.bisto.c.b.d):void");
    }

    /* renamed from: w */
    private final boolean m158848w() {
        int b = mo89791b();
        return (b == 3 || b == 0) ? false : true;
    }

    /* renamed from: x */
    private final boolean m158849x() {
        int b = mo89791b();
        if (b != 3 && b != 0) {
            return true;
        }
        if (!this.f268308A.mo89168p() || !this.f268308A.mo89164l()) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private final boolean m158850y(List list, int i, C95294af afVar, C95825x xVar) {
        C95662k kVar = this.f268331q;
        if (kVar == null) {
            C89655j.m145957a("No button handler");
            this.f268329o.mo89667b(list, (C142359ck) null, i);
            return true;
        } else if (!kVar.mo89630b(afVar, xVar)) {
            return false;
        } else {
            this.f268329o.mo89667b(list, C142359ck.EXPAND_ANNOUNCEMENT, i);
            return true;
        }
    }

    /* renamed from: E */
    public final boolean mo89254E(String str, int i, int i2, byte[] bArr) {
        PlaybackStatus playbackStatus;
        if (i != 2) {
            return false;
        }
        if (!str.equals(this.f268326l)) {
            C59104x d = f268307a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DeviceInputHandler");
            ((C59052c) ((C59052c) d).mo56372aa(15207)).mo56386p("Ignoring input from different device");
            return false;
        }
        try {
            if (!this.f268330p.mo89721c(i2, bArr, mo89791b())) {
                if (i2 == 6) {
                    C142366cr crVar = (C142366cr) C62942bv.parseFrom((C62942bv) C142366cr.f386310c, bArr);
                    C58976aa aaVar = C58975e.f156826a;
                    int a = C142365cq.m231068a(crVar.f386312a);
                    if (a == 0) {
                        a = 1;
                    }
                    boolean z = crVar.f386313b;
                    C95824w j = m158835j(str);
                    C142360cl clVar = null;
                    if (j == null) {
                        C59104x c = f268307a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "DeviceInputHandler");
                        ((C59052c) ((C59052c) c).mo56372aa(15184)).mo56389s("Can't process input for device %s", str);
                    } else {
                        C124721s sVar = C124721s.UNKNOWN_DEVICE_TYPE;
                        int ordinal = j.f268298b.ordinal();
                        if (ordinal == 1) {
                            clVar = C95805d.m158800a(a, z);
                        } else if (ordinal == 2) {
                            clVar = C95789c.m158744a(a, z, j.f268299c);
                        } else if (ordinal == 4) {
                            clVar = C95788bz.m158743a(a, z);
                        }
                    }
                    if (clVar != null) {
                        m158838m(clVar);
                    }
                } else if (i2 == 2) {
                    C142383dh dhVar = (C142383dh) C62942bv.parseFrom((C62942bv) C142383dh.f386354m, bArr);
                    C58976aa aaVar2 = C58975e.f156826a;
                    boolean z2 = dhVar.f386366k;
                    boolean z3 = dhVar.f386367l;
                    if (z2) {
                        playbackStatus = this.f268338y.mo81727f();
                    } else {
                        playbackStatus = this.f268311D;
                    }
                    this.f268327m.mo89712R(dhVar, playbackStatus);
                } else if (i2 == 3) {
                    C142386dk dkVar = (C142386dk) C62942bv.parseFrom((C62942bv) C142386dk.f386370c, bArr);
                    C58976aa aaVar3 = C58975e.f156826a;
                    int i3 = dkVar.f386373b;
                    this.f268327m.mo89706L(dkVar);
                } else if (i2 == 4) {
                    C58976aa aaVar4 = C58975e.f156826a;
                    C142377db dbVar = (C142377db) C62942bv.parseFrom((C62942bv) C142377db.f386340b, bArr);
                    C95709a aVar = this.f268315H;
                    dbVar.f386342a.mo59174N();
                    aVar.mo89669b();
                    this.f268327m.mo89705K(dbVar);
                } else if (i2 == 5) {
                    this.f268327m.mo89715k((C142381df) C62942bv.parseFrom((C62942bv) C142381df.f386349b, bArr));
                } else if (i2 == 10) {
                    C142379dd ddVar = (C142379dd) C62942bv.parseFrom((C62942bv) C142379dd.f386345b, bArr);
                    C58976aa aaVar5 = C58975e.f156826a;
                    boolean z4 = ddVar.f386347a;
                    this.f268327m.mo89714j(ddVar);
                } else if (i2 == 9) {
                    m158838m((C142360cl) C62942bv.parseFrom((C62942bv) C142360cl.f386303e, bArr));
                } else {
                    C59104x c2 = f268307a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "DeviceInputHandler");
                    ((C59052c) ((C59052c) c2).mo56372aa(15200)).mo56387q("Unknown message type:%d", i2);
                }
            }
            return true;
        } catch (IOException e) {
            C59104x c3 = f268307a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "DeviceInputHandler");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(15201)).mo56386p("Error parsing received proto");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo89181a() {
        m158846u(this.f268319e.mo89222a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo89791b() {
        if (this.f268337x.mo89723b()) {
            return 4;
        }
        if (this.f268327m.mo89695r()) {
            return 3;
        }
        if (this.f268308A.mo89168p()) {
            return 0;
        }
        Boolean a = this.f268328n.mo90140a();
        if (a == null) {
            return 5;
        }
        return a.booleanValue() ? 1 : 2;
    }

    /* renamed from: c */
    public final String mo89792c() {
        C95824w j = m158835j(this.f268326l);
        if (j != null) {
            return j.f268300d;
        }
        return null;
    }

    public final void close() {
        m158840o();
        this.f268327m.mo89713g();
        this.f268325k.mo89275p(this);
        this.f268328n.mo90141b();
        ((C89492cd) this.f268320f.mo27525b()).mo83379U(this);
    }

    /* renamed from: d */
    public final void mo89560d(C95606b bVar) {
        this.f268337x.f268042a.set(bVar);
    }

    /* renamed from: e */
    public final void mo89561e() {
        this.f268337x.f268042a.set((Object) null);
    }

    /* renamed from: f */
    public final synchronized void mo89794f(C124548d dVar) {
        this.f268312E = new C95824w(dVar);
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        C59104x b = f268307a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DeviceInputHandler");
        ((C59052c) ((C59052c) b).mo56372aa(15194)).mo56389s("onDeviceInfoChanged %s", str);
        m158847v(str, dVar);
    }

    /* renamed from: g */
    public final void mo89627g(C95662k kVar) {
        this.f268331q = kVar;
    }

    /* renamed from: h */
    public final void mo89628h(C95688l lVar) {
        this.f268332r = lVar;
        this.f268330p.f268033a = lVar;
    }

    /* renamed from: i */
    public final boolean mo89795i(boolean z) {
        int streamVolume = this.f268317c.getStreamVolume(3);
        int streamMaxVolume = this.f268317c.getStreamMaxVolume(3);
        if (streamVolume == streamMaxVolume && z) {
            this.f268318d.mo89316a(streamVolume, true);
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (streamVolume != 0 || z) {
            int i = true != z ? -1 : 1;
            int i2 = streamVolume + i;
            this.f268318d.mo89316a(i2, true);
            this.f268317c.adjustStreamVolume(3, i, 0);
            C58976aa aaVar2 = C58975e.f156826a;
            this.f268317c.getStreamVolume(3);
            return (i2 != streamMaxVolume || !z) && (i2 != 0 || z);
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            return false;
        }
    }
}
