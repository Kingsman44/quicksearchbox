package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.proactive.C84170f;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90273b;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90887au;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.sidekick.main.entry.C91351g;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91392d;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91397i;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91408b;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91417d;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91421f;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91429k;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91431m;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91434p;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91439u;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7207b.C91410b;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7208c.C91414a;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7208c.C91415b;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7210e.C91420a;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7211f.C91422a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91792ap;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91796c;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91797d;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91798e;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91799f;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91810q;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91811r;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91834b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91835c;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91838f;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91839g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91841i;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91863e;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.sidekick.shared.overlay.C91898g;
import com.google.android.apps.gsa.sidekick.shared.overlay.NowStreamConfig;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91656e;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91910h;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.C105326d;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105225bt;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105263dd;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8142f.C105365a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8144h.C105367a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8144h.C105369c;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i.C105380k;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.C105664b;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8157b.C105666b;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8159d.C105715b;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105773k;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.MinimizeUiUpdatesObserverParcelable;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.NowCardsScopeDataParcelable;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.C105764c;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.C105765d;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.CardIndexingParcelableStore;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.EntryTreeNodeParcelableStore;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a.C105755h;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23080ak;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23284h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.p4580v.C60945d;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7737ib;
import com.google.p375ai.p378b.C8074uo;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4817a.C63188b;
import com.google.protos.p4816ai.p4817a.C63192f;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar */
/* compiled from: PG */
public final class C105687ar extends C23056g implements C105755h, C91007g {

    /* renamed from: a */
    public static final C59071e f294829a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar");

    /* renamed from: A */
    public final C91420a f294830A;

    /* renamed from: B */
    public final C118827a f294831B;

    /* renamed from: C */
    public C91397i f294832C;

    /* renamed from: D */
    public Iterator f294833D;

    /* renamed from: E */
    public C7669fo f294834E;

    /* renamed from: F */
    public C105700m f294835F;

    /* renamed from: G */
    public C105369c f294836G;

    /* renamed from: H */
    public boolean f294837H;

    /* renamed from: I */
    public boolean f294838I;

    /* renamed from: J */
    public boolean f294839J;

    /* renamed from: K */
    public boolean f294840K;

    /* renamed from: L */
    public long f294841L;

    /* renamed from: M */
    public boolean f294842M;

    /* renamed from: N */
    public boolean f294843N;

    /* renamed from: O */
    public boolean f294844O;

    /* renamed from: P */
    public final C105666b f294845P;

    /* renamed from: Q */
    public boolean f294846Q;

    /* renamed from: R */
    public final C105419b f294847R;

    /* renamed from: S */
    public C105225bt f294848S;

    /* renamed from: T */
    private final LongSparseArray f294849T = new LongSparseArray();

    /* renamed from: U */
    private final C84170f f294850U;

    /* renamed from: V */
    private final C84170f f294851V;

    /* renamed from: X */
    private final C91415b f294852X;

    /* renamed from: Y */
    private final boolean f294853Y;

    /* renamed from: Z */
    private final C105367a f294854Z;

    /* renamed from: aa */
    private final C90998g f294855aa;

    /* renamed from: ab */
    private final C105686aq f294856ab;

    /* renamed from: ac */
    private final C91434p f294857ac;

    /* renamed from: ad */
    private final C91439u f294858ad;

    /* renamed from: ae */
    private final C58881cr f294859ae;

    /* renamed from: af */
    private final C58881cr f294860af;

    /* renamed from: ag */
    private C105681al f294861ag;

    /* renamed from: ah */
    private C91414a f294862ah;

    /* renamed from: b */
    public final C105773k f294863b;

    /* renamed from: c */
    public final C90931ca f294864c;

    /* renamed from: d */
    public final C22871g f294865d;

    /* renamed from: e */
    public final C23080ak f294866e;

    /* renamed from: f */
    public final C105326d f294867f;

    /* renamed from: g */
    public final C68214a f294868g;

    /* renamed from: h */
    public final C68214a f294869h;

    /* renamed from: i */
    public final C91866h f294870i;

    /* renamed from: j */
    public final C91863e f294871j;

    /* renamed from: k */
    public final C86106b f294872k;

    /* renamed from: l */
    public final C91421f f294873l;

    /* renamed from: m */
    public final C91351g f294874m;

    /* renamed from: n */
    public final String f294875n;

    /* renamed from: o */
    public final String f294876o;

    /* renamed from: p */
    public final C86124t f294877p;

    /* renamed from: q */
    public final C91713a f294878q;

    /* renamed from: r */
    final C91410b f294879r;

    /* renamed from: s */
    public final C91647a f294880s;

    /* renamed from: t */
    public final C87334q f294881t;

    /* renamed from: u */
    public final C105380k f294882u;

    /* renamed from: v */
    public final C105664b f294883v;

    /* renamed from: w */
    public final C21370a f294884w;

    /* renamed from: x */
    public final C58833ax f294885x;

    /* renamed from: y */
    public final C105715b f294886y;

    /* renamed from: z */
    public final C91643a f294887z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.google.android.apps.gsa.sidekick.shared.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.a.a} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C105687ar(com.google.android.libraries.gsa.monet.service.C23052c r10, com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105773k r11, com.google.android.apps.gsa.shared.util.p7159c.C90931ca r12, com.google.android.libraries.gsa.p1876k.C22871g r13, android.content.Context r14, com.google.android.apps.gsa.shared.util.p7184t.C91097g r15, com.google.android.libraries.gsa.monet.shared.C23080ak r16, com.google.android.apps.gsa.staticplugins.nowstream.p8135c.C105326d r17, dagger.C68214a r18, dagger.C68214a r19, com.google.android.apps.gsa.sidekick.main.p7205h.C91423g r20, com.google.android.apps.gsa.sidekick.main.entry.C91351g r21, com.google.android.apps.gsa.search.core.p6805i.C86124t r22, com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a r23, com.google.android.apps.gsa.sidekick.main.p7205h.p7208c.C91415b r24, boolean r25, com.google.android.apps.gsa.proactive.C84170f r26, com.google.android.apps.gsa.proactive.C84170f r27, com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8144h.C105367a r28, com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b r29, com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q r30, com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i.C105380k r31, com.google.android.libraries.p1730f.C21370a r32, com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105686aq r33, com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a r34, com.google.android.apps.gsa.sidekick.main.p7205h.C91434p r35, com.google.android.apps.gsa.sidekick.main.p7205h.C91439u r36, com.google.common.base.C58833ax r37, com.google.common.base.C58833ax r38, com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.C105668c r39, com.google.android.apps.gsa.shared.search.Query r40, com.google.android.apps.gsa.sidekick.main.p7205h.p7210e.C91420a r41, com.google.android.apps.gsa.p8885y.C118827a r42, com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h r43, com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91863e r44, com.google.android.apps.gsa.search.core.p6805i.C86106b r45, com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8156a.C105663b r46) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r32
            r4 = r38
            r5 = r46
            r9.<init>(r10)
            r0.f294863b = r2
            r6 = r12
            r0.f294864c = r6
            r6 = r13
            r0.f294865d = r6
            r6 = r16
            r0.f294866e = r6
            r6 = r17
            r0.f294867f = r6
            r6 = r18
            r0.f294868g = r6
            r6 = r35
            r0.f294857ac = r6
            r6 = r36
            r0.f294858ad = r6
            r0.f294885x = r4
            r6 = r19
            r0.f294869h = r6
            r6 = r42
            r0.f294831B = r6
            r6 = r43
            r0.f294870i = r6
            r6 = r44
            r0.f294871j = r6
            r6 = r45
            r0.f294872k = r6
            r6 = r20
            com.google.android.apps.gsa.sidekick.main.h.f r6 = r6.mo85776a(r10)
            r0.f294873l = r6
            r7 = r21
            r0.f294874m = r7
            android.util.LongSparseArray r7 = new android.util.LongSparseArray
            r7.<init>()
            r0.f294849T = r7
            r7 = r25
            r0.f294853Y = r7
            r7 = r26
            r0.f294850U = r7
            r7 = r27
            r0.f294851V = r7
            android.content.res.Resources r7 = r14.getResources()
            r8 = 2132093274(0x7f15295a, float:1.9826968E38)
            java.lang.String r7 = r7.getString(r8)
            r0.f294875n = r7
            android.content.res.Resources r7 = r14.getResources()
            r8 = 2132093271(0x7f152957, float:1.9826962E38)
            java.lang.String r7 = r7.getString(r8)
            r0.f294876o = r7
            r7 = r22
            r0.f294877p = r7
            r7 = r34
            r0.f294878q = r7
            com.google.android.apps.gsa.sidekick.main.h.b.b r7 = new com.google.android.apps.gsa.sidekick.main.h.b.b
            r7.<init>()
            r0.f294879r = r7
            r7 = r23
            r0.f294880s = r7
            r7 = r24
            r0.f294852X = r7
            r7 = r30
            r0.f294881t = r7
            r7 = r28
            r0.f294854Z = r7
            r7 = r29
            r0.f294847R = r7
            r7 = r31
            r0.f294882u = r7
            r0.f294884w = r3
            com.google.android.apps.gsa.shared.util.debug.a.b.c r7 = new com.google.android.apps.gsa.shared.util.debug.a.b.c
            r8 = 20
            r7.<init>(r3, r8)
            r0.f294855aa = r7
            r3 = r33
            r0.f294856ab = r3
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b.b r3 = new com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b.b
            r11.getClass()
            r10.getClass()
            r3.<init>(r11, r10)
            r0.f294845P = r3
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.d.b r3 = new com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.d.b
            r11.getClass()
            r10.getClass()
            r3.<init>(r11, r10)
            r0.f294886y = r3
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b r3 = new com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b
            r11.getClass()
            r10.getClass()
            r7 = r39
            g.a.a r7 = r7.f294797a
            java.lang.Object r7 = r7.mo17428b()
            com.google.android.apps.gsa.y.a r7 = (com.google.android.apps.gsa.p8885y.C118827a) r7
            r7.getClass()
            r3.<init>(r11, r10)
            r0.f294883v = r3
            java.util.HashSet r2 = r6.f255045a
            r2.add(r3)
            r2 = r41
            r0.f294830A = r2
            boolean r2 = r37.mo56113h()
            if (r2 == 0) goto L_0x0129
            java.lang.Object r2 = r37.mo56107c()
            com.google.android.apps.gsa.search.core.y.e.j.a r2 = (com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a) r2
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.a.a r3 = new com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.a.a
            g.a.a r6 = r5.f294780a
            java.lang.Object r6 = r6.mo17428b()
            com.google.android.libraries.f.a r6 = (com.google.android.libraries.p1730f.C21370a) r6
            r6.getClass()
            r2.getClass()
            r40.getClass()
            r15.getClass()
            g.a.a r5 = r5.f294781b
            dagger.a.l r5 = (dagger.p5294a.C68226l) r5
            g.a.a r5 = r5.f184585a
            dagger.a r5 = dagger.p5294a.C68219e.m98518a(r5)
            r5.getClass()
            r16 = r3
            r17 = r6
            r18 = r2
            r19 = r40
            r20 = r15
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0130
        L_0x0129:
            com.google.android.apps.gsa.sidekick.shared.a.b r3 = new com.google.android.apps.gsa.sidekick.shared.a.b
            r2 = r14
            r5 = r15
            r3.<init>(r14, r15)
        L_0x0130:
            r0.f294887z = r3
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.v r2 = new com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.v
            r2.<init>(r9, r4)
            java.lang.Class<com.google.android.apps.gsa.sidekick.main.h.a> r3 = com.google.android.apps.gsa.sidekick.main.p7205h.C91401a.class
            r10.mo28433w(r3, r2)
            java.lang.Class<com.google.android.apps.gsa.search.core.y.e.e.q> r2 = com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q.class
            r10.mo28430t(r2)
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.t r1 = new com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.t
            r1.<init>(r9)
            com.google.common.base.cr r1 = com.google.common.base.C58886cw.m90973a(r1)
            r0.f294859ae = r1
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.u r1 = new com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.u
            r1.<init>(r9)
            com.google.common.base.cr r1 = com.google.common.base.C58886cw.m90973a(r1)
            r0.f294860af = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar.<init>(com.google.android.libraries.gsa.monet.service.c, com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.k, com.google.android.apps.gsa.shared.util.c.ca, com.google.android.libraries.gsa.k.g, android.content.Context, com.google.android.apps.gsa.shared.util.t.g, com.google.android.libraries.gsa.monet.shared.ak, com.google.android.apps.gsa.staticplugins.nowstream.c.d, dagger.a, dagger.a, com.google.android.apps.gsa.sidekick.main.h.g, com.google.android.apps.gsa.sidekick.main.entry.g, com.google.android.apps.gsa.search.core.i.t, com.google.android.apps.gsa.sidekick.shared.b.a, com.google.android.apps.gsa.sidekick.main.h.c.b, boolean, com.google.android.apps.gsa.proactive.f, com.google.android.apps.gsa.proactive.f, com.google.android.apps.gsa.staticplugins.nowstream.c.h.a, com.google.android.apps.gsa.staticplugins.nowstream.shared.b, com.google.android.apps.gsa.search.core.y.e.e.q, com.google.android.apps.gsa.staticplugins.nowstream.c.i.k, com.google.android.libraries.f.a, com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.aq, com.google.android.apps.gsa.sidekick.shared.d.a, com.google.android.apps.gsa.sidekick.main.h.p, com.google.android.apps.gsa.sidekick.main.h.u, com.google.common.base.ax, com.google.common.base.ax, com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c, com.google.android.apps.gsa.shared.search.Query, com.google.android.apps.gsa.sidekick.main.h.e.a, com.google.android.apps.gsa.y.a, com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.h, com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.e, com.google.android.apps.gsa.search.core.i.b, com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.a.b):void");
    }

    /* renamed from: C */
    private final void m175845C() {
        this.f63405W.mo28433w(C91434p.class, this.f294857ac);
        this.f63405W.mo28433w(C91439u.class, this.f294858ad);
        this.f63405W.mo28433w(C91417d.class, new C105685ap(this));
        this.f63405W.mo28433w(C91422a.class, this);
    }

    /* renamed from: A */
    public final boolean mo94966A() {
        return ((Boolean) ((C23251a) this.f294863b.mo94989b()).f63720e).booleanValue();
    }

    /* renamed from: B */
    public final boolean mo94967B() {
        return !this.f294873l.mo28755f().isEmpty();
    }

    /* renamed from: a */
    public final void mo85775a(C8074uo uoVar, C7718hj hjVar) {
        this.f294830A.mo85769b(uoVar, hjVar);
        long b = C91994m.m150995b(hjVar);
        if (b == 0) {
            ((C59052c) ((C59052c) f294829a.mo56226d()).mo56372aa(22420)).mo56386p("Invalid contentIdHash for entry.");
            return;
        }
        C105715b bVar = this.f294886y;
        C91834b bVar2 = (C91834b) C91835c.f256110a.createBuilder();
        C62940bt btVar = C91841i.f256125b;
        C91838f fVar = (C91838f) C91839g.f256120c.createBuilder();
        fVar.copyOnWrite();
        C91839g gVar = (C91839g) fVar.instance;
        gVar.f256123b = uoVar.f28417d;
        gVar.f256122a |= 1;
        bVar2.mo58885m(btVar, (C91839g) fVar.build());
        bVar.f294989b.mo95045a(b, "TempFS-toggleState", (C91835c) bVar2.build());
    }

    /* renamed from: b */
    public final void mo86301b(int i, long j) {
        this.f294862ah.mo85761a(i);
        C105380k kVar = this.f294882u;
        C63188b bVar = (C63188b) C105380k.m175068e(4, j).toBuilder();
        bVar.copyOnWrite();
        C63192f fVar = (C63192f) bVar.instance;
        fVar.f170701a |= 64;
        fVar.f170710j = i;
        kVar.f293989a.add((C63192f) bVar.build());
        kVar.f293992d += i;
        this.f294851V.mo77633c(C105703p.f294967a);
    }

    /* renamed from: e */
    public final int mo94968e() {
        int l = this.f294873l.f63752b.f63757a.f63585a.mo28713l("SPACER");
        if (this.f294873l.f63752b.f63757a.f63585a.mo28713l("NAME_PUBLICATION_JUDICIAIRE_FOOTER")) {
            l++;
        }
        return this.f294873l.f63752b.f63757a.f63585a.mo28713l("SPINNER") ? l + 1 : l;
    }

    /* renamed from: f */
    public final NowStreamConfig mo94969f() {
        C58833ax axVar = (C58833ax) ((C23251a) this.f294863b.mo94996i()).f63720e;
        C58838bb.m90883r(axVar.mo56113h());
        return (NowStreamConfig) axVar.mo56107c();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        this.f294855aa.mo85271g(fVar, "Stream Events", (C90997f) null, false);
    }

    /* renamed from: h */
    public final C58833ax mo94970h() {
        C58833ax axVar = (C58833ax) this.f294863b.mo95013z().f63720e;
        if (axVar.mo56113h()) {
            long j = ((C60220t) axVar.mo56107c()).f162934b;
            if (j > 0) {
                return C58833ax.m90834k(C60945d.m93099d(j));
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: i */
    public final void mo94971i(long j, C23056g gVar) {
        C105711x xVar = new C105711x(this, j, gVar, j);
        this.f294849T.put(j, xVar);
        this.f294850U.mo77632b(xVar);
        if (gVar instanceof C91408b) {
            ((C91408b) gVar).mo85753a(new C105706s(this, gVar, j));
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        m175845C();
        this.f294855aa.mo85270f("onRestore", C90996e.f254198a);
        boolean booleanValue = ((Boolean) ((C23251a) this.f294863b.mo94989b()).f63720e).booleanValue();
        mo94986x(false);
        if (((Boolean) ((C58833ax) this.f294863b.mo95003p().f63720e).mo56109e(true)).booleanValue()) {
            this.f294879r.mo85756c();
        } else {
            this.f294879r.mo85757d();
        }
        C58833ax axVar = (C58833ax) ((C23251a) this.f294863b.mo94995h()).f63720e;
        if (booleanValue && axVar.mo56113h()) {
            String str = ((NowCardsScopeDataParcelable) axVar.mo56107c()).f295117a;
            if (this.f294873l.f63752b.f63757a.mo28646k(xVar, "SPINNER") && this.f294877p.mo79746e(C90010bp.f247011w)) {
                C91421f fVar = this.f294873l;
                fVar.f63752b.mo28758b(xVar, "SPINNER", new C105710w(this));
            }
            if (this.f294873l.f63752b.f63757a.mo28646k(xVar, "SPACER")) {
                this.f294873l.f63752b.mo28758b(xVar, "SPACER", (C23284h) null);
            }
            if (this.f294873l.f63752b.f63757a.mo28646k(xVar, "NAME_PUBLICATION_JUDICIAIRE_FOOTER")) {
                this.f294873l.f63752b.mo28758b(xVar, "NAME_PUBLICATION_JUDICIAIRE_FOOTER", (C23284h) null);
            }
            if (this.f294873l.f63752b.f63757a.mo28646k(xVar, "SIGN_IN_ERROR")) {
                this.f294873l.f63752b.mo28758b(xVar, "SIGN_IN_ERROR", (C23284h) null);
            }
            if (this.f294873l.f63752b.f63757a.mo28646k(xVar, "NO_CARDS_CARD")) {
                this.f294873l.f63752b.mo28758b(xVar, "NO_CARDS_CARD", (C23284h) null);
            }
            if (this.f294873l.f63752b.f63757a.mo28646k(xVar, "OFFLINE_WARNING_CARD")) {
                this.f294873l.f63752b.mo28758b(xVar, "OFFLINE_WARNING_CARD", (C23284h) null);
            }
            C58833ax axVar2 = (C58833ax) ((C23251a) this.f294863b.mo94995h()).f63720e;
            C58838bb.m90883r(axVar2.mo56113h());
            CardRenderingContext cardRenderingContext = ((NowCardsScopeDataParcelable) axVar2.mo56107c()).f295118b;
            ((C59052c) ((C59052c) f294829a.mo56224b()).mo56372aa(22423)).mo56389s("registerScope: %s", str);
            this.f294866e.mo28396b(str, this.f294867f.mo94724a(mo94969f(), cardRenderingContext, this.f294878q, this.f294830A, this.f294879r, this.f294847R, this.f294874m, this.f294880s, this.f294886y, this.f294887z, ((Boolean) ((C23251a) this.f294863b.mo94992e()).f63720e).booleanValue()));
            if (this.f294873l.f63752b.f63757a.mo28646k(xVar, "CHILDREN")) {
                C91421f fVar2 = this.f294873l;
                fVar2.f63752b.mo28758b(xVar, "CHILDREN", new C105682am(this));
            }
        }
        this.f294873l.f63752b.mo28757a(xVar);
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        m175845C();
        this.f294855aa.mo85270f("onCreate", C90996e.f254198a);
        boolean z = true;
        C91792ap apVar = (C91792ap) C23245b.m43557b(protoParcelable, C91792ap.f255967i.getParserForType(), C62921ba.m95368a(), true);
        apVar.getClass();
        this.f294863b.mo95009v().mo28730f(Boolean.valueOf(apVar.f255971c), false);
        ((C23251a) this.f294863b.mo94992e()).mo28730f(Boolean.valueOf(apVar.f255972d), false);
        ((C23251a) this.f294863b.mo94993f()).mo28730f(Boolean.valueOf(apVar.f255976h), false);
        this.f294863b.mo95001n().mo28730f(Boolean.valueOf(apVar.f255970b), false);
        C23251a w = this.f294863b.mo95010w();
        C8142xb a = C8142xb.m22954a(apVar.f255973e);
        if (a == null) {
            a = C8142xb.UNKNOWN_SURFACE;
        }
        w.mo28730f(C58833ax.m90834k(a), false);
        this.f294863b.mo95006s().mo28730f(Integer.valueOf((int) this.f294877p.mo79743a(C90010bp.f246925U)), false);
        ((C23251a) this.f294863b.mo94998k()).mo28730f(Boolean.valueOf(this.f294877p.mo79746e(C90010bp.f247012x)), false);
        ((C23251a) this.f294863b.mo94999l()).mo28730f(Boolean.valueOf(this.f294877p.mo79746e(C90010bp.f246978au)), false);
        ((C23251a) this.f294863b.mo94990c()).mo28730f(Boolean.valueOf(this.f294877p.mo79746e(C90010bp.f247013y)), false);
        if ((apVar.f255969a & 32) != 0) {
            C7669fo foVar = apVar.f255974f;
            if (foVar == null) {
                foVar = C7669fo.f26633e;
            }
            C7669fo foVar2 = C7669fo.f26633e;
            if (foVar != foVar2) {
                C7669fo foVar3 = apVar.f255974f;
                if (foVar3 != null) {
                    foVar2 = foVar3;
                }
                this.f294834E = foVar2;
            }
        }
        C8142xb a2 = C8142xb.m22954a(apVar.f255973e);
        if (a2 == null) {
            a2 = C8142xb.UNKNOWN_SURFACE;
        }
        if (a2 == C8142xb.UNKNOWN_SURFACE) {
            z = false;
        }
        C58838bb.m90868c(z);
        C91898g g = NowStreamConfig.m150602g();
        C8142xb a3 = C8142xb.m22954a(apVar.f255973e);
        if (a3 == null) {
            a3 = C8142xb.UNKNOWN_SURFACE;
        }
        g.mo86469d(a3);
        g.mo86467b(this.f294853Y);
        ((C23251a) this.f294863b.mo94996i()).mo28730f(C58833ax.m90834k(g.mo86466a()), false);
        C58480gp gpVar = new C58480gp(4);
        for (C90273b a4 : apVar.f255975g) {
            gpVar.mo55395g(C23245b.m43556a(a4));
        }
        this.f294863b.mo95004q().mo28730f(gpVar.mo55394f(), false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        this.f294840K = false;
        this.f294879r.mo85754a(this.f63405W, new C105705r(this));
        if (((Boolean) this.f294863b.mo95009v().f63720e).booleanValue()) {
            ((C23251a) this.f294863b.mo94991d()).mo28730f(Boolean.valueOf(this.f294877p.mo79746e(C90010bp.f247009u)), false);
        }
        C91415b bVar = this.f294852X;
        C91647a aVar = this.f294880s;
        C7681g gVar = C7681g.STREAM_SCROLL;
        C91910h hVar = (C91910h) bVar.f255034a.mo17428b();
        hVar.getClass();
        ((C91863e) bVar.f255035b.mo17428b()).getClass();
        C91866h hVar2 = (C91866h) bVar.f255036c.mo17428b();
        hVar2.getClass();
        C86106b bVar2 = (C86106b) bVar.f255037d.mo17428b();
        bVar2.getClass();
        C86124t tVar = (C86124t) bVar.f255038e.mo17428b();
        tVar.getClass();
        aVar.getClass();
        gVar.getClass();
        C91414a aVar2 = r3;
        C91414a aVar3 = new C91414a(hVar, hVar2, bVar2, tVar, aVar, gVar, (C7718hj) null, (C7718hj) null, (C7718hj) null, -1, -1, -1, (C8178yk) null);
        this.f294862ah = aVar2;
        this.f294863b.mo95004q().mo28730f(C58485gu.m89845m(), false);
        ((C23251a) this.f294863b.mo94994g()).mo28730f(C58833ax.m90834k(new MinimizeUiUpdatesObserverParcelable(new C105672ac(this, this.f294865d))), false);
        C105369c cVar = new C105369c(this.f294881t);
        this.f294836G = cVar;
        this.f294854Z.mo94763a(cVar);
        this.f294854Z.mo94764b(((Boolean) ((C23251a) this.f294863b.mo94989b()).f63720e).booleanValue());
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f294840K = true;
        for (int i = 0; i < this.f294849T.size(); i++) {
            this.f294850U.mo77634d((C91392d) this.f294849T.valueAt(i));
        }
        this.f294849T.clear();
        C105681al alVar = this.f294861ag;
        if (alVar != null) {
            alVar.mo94965a();
            this.f294861ag = null;
        }
        this.f294863b.mo95007t().mo28730f(false, false);
        this.f294854Z.mo94765c(this.f294836G);
        C105367a aVar = this.f294854Z;
        if (aVar.f293973a.mo56113h()) {
            aVar.mo94766d(C58836b.f156633a);
        }
        mo94972j();
        C91421f fVar = this.f294873l;
        fVar.f255045a.remove(this.f294883v);
    }

    /* renamed from: j */
    public final void mo94972j() {
        if (((C58833ax) ((C23251a) this.f294863b.mo94995h()).f63720e).mo56113h()) {
            String str = ((NowCardsScopeDataParcelable) ((C58833ax) ((C23251a) this.f294863b.mo94995h()).f63720e).mo56107c()).f295117a;
            ((C59052c) ((C59052c) f294829a.mo56224b()).mo56372aa(22411)).mo56389s("cleanUpControllerScope(%s)", str);
            this.f294866e.mo28397c(str);
            ((C23251a) this.f294863b.mo94995h()).mo28730f(C58836b.f156633a, false);
        }
    }

    /* renamed from: k */
    public final void mo94973k(C91397i iVar, Iterator it, String str, long j) {
        this.f294832C = iVar;
        this.f294833D = it;
        this.f294863b.mo95008u().mo28730f(str, false);
        this.f294837H = false;
        this.f294838I = false;
        this.f294841L = j;
        C105700m mVar = this.f294835F;
        if (mVar != null) {
            ((C105691d) mVar.f294955a).f294919a.mo28730f(true, false);
            if (((Boolean) ((C105691d) mVar.f294955a).f294920b.f63720e).booleanValue()) {
                C91656e eVar = mVar.f294956b;
                String c = C91656e.m149939c(mVar.f294958d);
                if (!eVar.mo86055t(c)) {
                    eVar.mo86039d(c);
                    C89856f fVar = new C89856f();
                    fVar.f246201a = C89849ae.FEED_NEXT_PAGE_CANCELLED_VIA_REFRESH;
                    fVar.mo83701c("SessionLoggerId", c);
                    eVar.f255616c.mo74236a(fVar.mo83699a());
                }
            }
            mVar.mo95014e();
        }
        this.f294886y.f294989b.f295125a.clear();
        mo94982t();
    }

    /* renamed from: l */
    public final void mo94974l() {
        if (!this.f294873l.f63752b.f63757a.f63585a.mo28713l("NO_CARDS_CARD")) {
            int e = mo94968e();
            C91810q qVar = (C91810q) C91811r.f256054e.createBuilder();
            qVar.copyOnWrite();
            C91811r rVar = (C91811r) qVar.instance;
            rVar.f256056a |= 1;
            rVar.f256057b = true;
            qVar.copyOnWrite();
            C91811r rVar2 = (C91811r) qVar.instance;
            rVar2.f256056a |= 2;
            rVar2.f256058c = true;
            boolean booleanValue = ((Boolean) ((C23251a) this.f294863b.mo94992e()).f63720e).booleanValue();
            qVar.copyOnWrite();
            C91811r rVar3 = (C91811r) qVar.instance;
            rVar3.f256056a |= 4;
            rVar3.f256059d = booleanValue;
            this.f294873l.mo28754e("NO_CARDS_CARD", mo28494O("TYPE_NO_CARDS"), C23245b.m43556a((C91811r) qVar.build()), this.f294873l.f63752b.f63757a.f63585a.mo28704b() - e);
        }
    }

    /* renamed from: m */
    public final void mo94975m(C7718hj hjVar, boolean z) {
        this.f294874m.mo85660a(hjVar, z);
    }

    /* renamed from: n */
    public final void mo94976n() {
        this.f294878q.mo86207a();
    }

    /* renamed from: o */
    public final void mo94977o(String str, C7726hr hrVar, int i) {
        String str2;
        ProtoParcelable protoParcelable;
        if (this.f294840K) {
            ((C59052c) ((C59052c) f294829a.mo56224b()).mo56372aa(22415)).mo56386p("Attempting to create child for destroyed controller.");
            return;
        }
        if (this.f294883v.f294784b.mo95043f(C91994m.m150994a(C91994m.m150996c(hrVar)))) {
            ((C118831d) this.f294859ae.mo6453a()).mo104025g(0);
            C59052c cVar = (C59052c) f294829a.mo56225c();
            cVar.mo56380ai(C58979ad.FULL);
            ((C59052c) cVar.mo56372aa(22414)).mo56351D("Dropping duplicate content [%d : %s]", C91994m.m150994a(C91994m.m150996c(hrVar)), C91994m.m150998e(hrVar));
            return;
        }
        ((C118831d) this.f294859ae.mo6453a()).mo104025g(1);
        int c = this.f294845P.mo94952c(C91994m.m150994a(C91994m.m150996c(hrVar)));
        C7669fo c2 = C91994m.m150996c(hrVar);
        if ((hrVar.f27010a & 8) != 0) {
            C91798e eVar = (C91798e) C91799f.f256001h.createBuilder();
            eVar.copyOnWrite();
            C91799f fVar = (C91799f) eVar.instance;
            c2.getClass();
            fVar.f256008f = c2;
            fVar.f256003a |= 16;
            eVar.copyOnWrite();
            C91799f fVar2 = (C91799f) eVar.instance;
            fVar2.f256003a |= 2;
            fVar2.f256005c = c;
            String str3 = (String) this.f294863b.mo95008u().f63720e;
            eVar.copyOnWrite();
            C91799f fVar3 = (C91799f) eVar.instance;
            str3.getClass();
            fVar3.f256003a |= 32;
            fVar3.f256009g = str3;
            C7669fo foVar = this.f294834E;
            if (foVar != null) {
                eVar.copyOnWrite();
                C91799f fVar4 = (C91799f) eVar.instance;
                fVar4.f256006d = foVar;
                fVar4.f256003a |= 4;
            }
            eVar.copyOnWrite();
            C91799f fVar5 = (C91799f) eVar.instance;
            fVar5.f256007e = ((C8142xb) ((C58833ax) this.f294863b.mo95010w().f63720e).mo56107c()).f28649u;
            fVar5.f256003a |= 8;
            protoParcelable = C23245b.m43556a((C91799f) eVar.build());
            str2 = "TYPE_CLUSTER";
        } else {
            C91796c cVar2 = (C91796c) C91797d.f255987l.createBuilder();
            cVar2.copyOnWrite();
            C91797d dVar = (C91797d) cVar2.instance;
            dVar.f255999k = ((C8142xb) ((C58833ax) this.f294863b.mo95010w().f63720e).mo56107c()).f28649u;
            dVar.f255989a |= 512;
            cVar2.copyOnWrite();
            C91797d dVar2 = (C91797d) cVar2.instance;
            c2.getClass();
            dVar2.f255998j = c2;
            dVar2.f255989a |= 256;
            cVar2.copyOnWrite();
            C91797d dVar3 = (C91797d) cVar2.instance;
            dVar3.f255989a |= 16;
            dVar3.f255995g = c;
            C7669fo foVar2 = this.f294834E;
            if (foVar2 != null) {
                cVar2.copyOnWrite();
                C91797d dVar4 = (C91797d) cVar2.instance;
                dVar4.f255997i = foVar2;
                dVar4.f255989a |= 128;
            }
            protoParcelable = C23245b.m43556a((C91797d) cVar2.build());
            str2 = "TYPE_CARD";
        }
        this.f294873l.mo28754e("CHILDREN", new C23129y(str, str2), protoParcelable, i);
        C23056g a = this.f294873l.f63752b.f63757a.mo28636a(i);
        if (a instanceof C91429k) {
            ((C91429k) a).mo85782d(hrVar);
            this.f294883v.f294784b.mo95039c(hrVar);
        }
        C105666b bVar = this.f294845P;
        long a2 = C91994m.m150994a(C91994m.m150996c(hrVar));
        CardIndexingParcelableStore cardIndexingParcelableStore = bVar.f294793c;
        Map map = cardIndexingParcelableStore.f295120b;
        Long valueOf = Long.valueOf(a2);
        if (!map.containsKey(valueOf) || !cardIndexingParcelableStore.f295121c.contains(valueOf)) {
            int i2 = 1;
            if (a instanceof C91431m) {
                C105765d b = bVar.f294793c.mo95033b(a2);
                if (b == null) {
                    int e = ((C91431m) a).mo85784e();
                    C105764c cVar3 = (C105764c) C105765d.f295126d.createBuilder();
                    cVar3.copyOnWrite();
                    C105765d dVar5 = (C105765d) cVar3.instance;
                    dVar5.f295128a = 1 | dVar5.f295128a;
                    dVar5.f295129b = e;
                    int i3 = bVar.f294793c.f295122d;
                    cVar3.copyOnWrite();
                    C105765d dVar6 = (C105765d) cVar3.instance;
                    dVar6.f295128a |= 2;
                    dVar6.f295130c = i3;
                    i2 = e;
                    b = (C105765d) cVar3.build();
                } else {
                    i2 = 0;
                }
                CardIndexingParcelableStore cardIndexingParcelableStore2 = bVar.f294793c;
                cardIndexingParcelableStore2.f295120b.put(valueOf, b);
                cardIndexingParcelableStore2.f295121c.add(valueOf);
            } else {
                ((C59052c) ((C59052c) C105666b.f294791a.mo56226d()).mo56372aa(22401)).mo56389s("Child %s wasn't indexable, card indexes may be wrong.", a);
                int i4 = C90755l.f253831a;
            }
            bVar.f294793c.f295122d += i2;
        } else {
            ((C59052c) ((C59052c) C105666b.f294791a.mo56226d()).mo56372aa(22403)).mo56353F("Attempting to track new Controller[%s] that has a hash[%d] which is already tracked.", a.mo28496Q(), a2);
        }
        mo94971i(C91994m.m150994a(C91994m.m150996c(hrVar)), a);
    }

    /* renamed from: p */
    public final void mo94978p() {
        if (this.f294885x.mo56113h()) {
            C105365a aVar = (C105365a) this.f294885x.mo56107c();
            C105664b bVar = this.f294883v;
            String str = null;
            C58833ax j = C58833ax.m90833j(bVar.f294784b.f295123a.size() > 0 ? C91994m.m150998e(bVar.f294784b.mo95037a(0)) : null);
            C105664b bVar2 = this.f294883v;
            if (bVar2.f294784b.f295123a.size() > 0) {
                EntryTreeNodeParcelableStore entryTreeNodeParcelableStore = bVar2.f294784b;
                str = C91994m.m150998e(entryTreeNodeParcelableStore.mo95037a(entryTreeNodeParcelableStore.f295123a.size() - 1));
            }
            aVar.mo94664a(j, C58833ax.m90833j(str));
        }
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94979q(com.google.android.apps.gsa.shared.p7127q.C90456c r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.m r0 = r10.f294835F
            r1 = 0
            if (r0 == 0) goto L_0x00b1
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.j r2 = r0.f294955a
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.d r2 = (com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105691d) r2
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r2 = r2.f294919a
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.mo28730f(r4, r1)
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.j r2 = r0.f294955a
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.d r2 = (com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105691d) r2
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r2 = r2.f294920b
            java.lang.Object r2 = r2.f63720e
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00ae
            com.google.android.apps.gsa.sidekick.shared.c.e r2 = r0.f294956b
            boolean r4 = r0.f294958d
            java.lang.String r4 = com.google.android.apps.gsa.sidekick.shared.p7232c.C91656e.m149939c(r4)
            boolean r5 = r2.mo86055t(r4)
            if (r5 == 0) goto L_0x0033
            goto L_0x00ae
        L_0x0033:
            r2.mo86039d(r4)
            int r5 = r11.mo79843a()
            r6 = 656391(0xa0407, float:9.198E-40)
            if (r5 != r6) goto L_0x0051
            boolean r5 = r11 instanceof com.google.android.apps.gsa.shared.p7127q.C90457d
            if (r5 == 0) goto L_0x0051
            r5 = r11
            com.google.android.apps.gsa.shared.q.d r5 = (com.google.android.apps.gsa.shared.p7127q.C90457d) r5
            java.lang.Throwable r5 = r5.getCause()
            boolean r6 = r5 instanceof com.google.android.apps.gsa.shared.p7127q.C90456c
            if (r6 == 0) goto L_0x0051
            r11 = r5
            com.google.android.apps.gsa.shared.q.c r11 = (com.google.android.apps.gsa.shared.p7127q.C90456c) r11
        L_0x0051:
            com.google.android.apps.gsa.shared.logger.b.f r5 = new com.google.android.apps.gsa.shared.logger.b.f
            r5.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_ERROR
            r5.f246201a = r6
            java.lang.String r6 = "SessionLoggerId"
            r5.mo83701c(r6, r4)
            com.google.common.o.cb r4 = com.google.common.p4552o.C59687cb.f160034bf
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.common.o.aj r4 = (com.google.common.p4552o.C59582aj) r4
            com.google.common.o.f r6 = com.google.common.p4552o.C59770f.f161501d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.common.o.e r6 = (com.google.common.p4552o.C59742e) r6
            int r7 = r11.mo79844b()
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.common.o.f r8 = (com.google.common.p4552o.C59770f) r8
            int r9 = r8.f161503a
            r3 = r3 | r9
            r8.f161503a = r3
            r8.f161504b = r7
            int r11 = r11.mo79843a()
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.common.o.f r3 = (com.google.common.p4552o.C59770f) r3
            int r7 = r3.f161503a
            r7 = r7 | 2
            r3.f161503a = r7
            r3.f161505c = r11
            com.google.protobuf.bv r11 = r6.build()
            com.google.common.o.f r11 = (com.google.common.p4552o.C59770f) r11
            r4.mo57008e(r11)
            com.google.protobuf.bv r11 = r4.build()
            com.google.common.o.cb r11 = (com.google.common.p4552o.C59687cb) r11
            r5.f246203c = r11
            com.google.android.apps.gsa.shared.logger.b.g r11 = r5.mo83699a()
            com.google.android.apps.gsa.shared.logger.b.i r2 = r2.f255616c
            r2.mo74236a(r11)
        L_0x00ae:
            r0.mo95014e()
        L_0x00b1:
            r10.f294846Q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar.mo94979q(com.google.android.apps.gsa.shared.q.c):void");
    }

    /* renamed from: r */
    public final void mo94980r() {
        C105700m mVar = this.f294835F;
        if (mVar != null) {
            mVar.mo95014e();
        }
        this.f294846Q = false;
    }

    /* renamed from: s */
    public final void mo94981s(long j) {
        C105225bt btVar = this.f294848S;
        if (btVar != null) {
            boolean B = mo94967B();
            C105263dd ddVar = btVar.f293496a;
            C105687ar arVar = btVar.f293497b;
            if (B) {
                ddVar.f293619l.mo86047l(C58833ax.m90834k(Long.valueOf(j)), arVar.mo94970h());
            } else {
                C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
                eVar.copyOnWrite();
                C59770f fVar = (C59770f) eVar.instance;
                fVar.f161503a |= 1;
                fVar.f161504b = 0;
                eVar.copyOnWrite();
                C59770f fVar2 = (C59770f) eVar.instance;
                fVar2.f161503a |= 2;
                fVar2.f161505c = C89885b.FEED_LAUNCH_FAILED_TO_GET_ANY_CARD_VALUE;
                ddVar.f293619l.mo86045j((C59770f) eVar.build());
            }
            ddVar.f293614g.mo78681k();
            ddVar.f293614g.mo78686q(ddVar.f293558Q);
            if (!ddVar.f293623p) {
                C58976aa aaVar = C58975e.f156826a;
                ddVar.f293624q.mo79000e(C53306j.MAIN_APP);
            }
            ddVar.f63405W.mo28435z("paginatedFeedContentUpdate");
        }
        C58833ax axVar = (C58833ax) this.f294863b.mo95010w().f63720e;
        if (!axVar.mo56113h()) {
            return;
        }
        if (C8142xb.ACETONE_OVERLAY_MOMO == axVar.mo56107c() || C8142xb.SEARCH_NOW_MONET == axVar.mo56107c()) {
            ((C118831d) this.f294860af.mo6453a()).mo104025g((long) this.f294845P.f294793c.mo95032a());
        }
    }

    /* renamed from: t */
    public final void mo94982t() {
        if (this.f294842M) {
            this.f294843N = true;
            return;
        }
        mo94986x(false);
        C105666b bVar = this.f294845P;
        CardIndexingParcelableStore cardIndexingParcelableStore = bVar.f294793c;
        cardIndexingParcelableStore.f295120b.clear();
        cardIndexingParcelableStore.f295121c.clear();
        cardIndexingParcelableStore.f295122d = 0;
        bVar.mo94953d();
        this.f294843N = false;
        C105681al alVar = this.f294861ag;
        if (alVar != null) {
            alVar.mo94965a();
            this.f294861ag = null;
        }
        for (int i = 0; i < this.f294849T.size(); i++) {
            this.f294850U.mo77634d((C91392d) this.f294849T.valueAt(i));
        }
        this.f294849T.clear();
        if (this.f294861ag == null) {
            C105681al alVar2 = new C105681al(this);
            this.f294861ag = alVar2;
            C60870cx j = alVar2.f294819e.f294865d.mo28210j(alVar2.f294819e.f294864c.mo85139d(new C90887au("ProcessEntryTreeTask - populateRenderingContext", 1, 8, new C105673ad(alVar2))), "ProcessEntryTreeTask - updateUiModel", new C105674ae(alVar2));
            C90873ag b = C90875ai.m148465b(C105675af.f294807a, j, alVar2.f294819e.f294865d, "ProcessEntryTreeTask - check for exceptions");
            b.mo85225c(CancellationException.class, C105676ag.f294808a);
            b.mo85223a(C105677ah.f294809a);
            alVar2.f294818d = j;
        }
    }

    /* renamed from: u */
    public final void mo94983u(C7642eo eoVar) {
        this.f294878q.mo86208b(eoVar);
    }

    /* renamed from: v */
    public final void mo94984v(C23056g gVar, long j) {
        C91392d dVar = (C91392d) this.f294849T.get(j);
        if (dVar != null) {
            this.f294873l.mo28753c(gVar);
            this.f294850U.mo77634d(dVar);
            this.f294849T.remove(j);
        }
    }

    /* renamed from: w */
    public final void mo94985w() {
        this.f294873l.f63752b.f63757a.mo28643h("SPINNER");
        this.f294835F = null;
    }

    /* renamed from: x */
    public final void mo94986x(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        this.f294854Z.mo94764b(z);
        ((C23251a) this.f294863b.mo94989b()).mo28730f(valueOf, false);
    }

    /* renamed from: y */
    public final void mo94987y(boolean z) {
        if (!this.f294840K && ((Boolean) this.f294863b.mo95007t().f63720e).booleanValue() != z) {
            this.f294863b.mo95007t().mo28730f(Boolean.valueOf(z), false);
            this.f294856ab.mo94571a(z);
        }
    }

    /* renamed from: z */
    public final void mo94988z(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e.mo55395g(C23245b.m43556a((C7737ib) it.next()));
        }
        ((C23251a) this.f294863b.mo94997j()).mo28730f(e.mo55394f(), false);
    }
}
