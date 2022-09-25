package com.google.android.apps.gsa.staticplugins.s3request.producers;

import android.content.Context;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88183sf;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92455l;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59337t;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.InputStream;
import java.util.Collection;
import java.util.concurrent.Future;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.producers.g */
/* compiled from: PG */
public final class C116348g implements C92439c {

    /* renamed from: f */
    private static final C59071e f322575f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.s3request.producers.g");

    /* renamed from: a */
    public final C88183sf f322576a;

    /* renamed from: b */
    public final C90931ca f322577b;

    /* renamed from: c */
    public final C86054o f322578c;

    /* renamed from: d */
    public final C92302a f322579d;

    /* renamed from: e */
    public final C89994f f322580e;

    /* renamed from: g */
    private final C92473f f322581g;

    /* renamed from: h */
    private final C86124t f322582h;

    /* renamed from: i */
    private final Collection f322583i;

    /* renamed from: j */
    private final C67451at f322584j;

    /* renamed from: k */
    private final int f322585k;

    /* renamed from: l */
    private final int f322586l;

    /* renamed from: m */
    private final C69464a f322587m;

    /* renamed from: n */
    private final C58833ax f322588n;

    /* renamed from: o */
    private final u f322589o;

    /* renamed from: p */
    private final Context f322590p;

    /* renamed from: q */
    private InputStream f322591q;

    /* renamed from: r */
    private Future f322592r;

    /* renamed from: s */
    private C92455l f322593s;

    public C116348g(C92473f fVar, C58833ax axVar, C86124t tVar, C90931ca caVar, C89994f fVar2, C86054o oVar, C92302a aVar, C69464a aVar2, u uVar, Context context) {
        C92473f fVar3 = fVar;
        this.f322581g = fVar3;
        C88183sf sfVar = fVar3.f258010F;
        this.f322576a = sfVar;
        sfVar.getClass();
        this.f322584j = fVar3.f258015c.mo87202n();
        int bitCount = Integer.bitCount(fVar3.f258015c.mo87190a());
        sfVar.getClass();
        int i = sfVar.f238389e;
        if (axVar.mo56113h()) {
            C92460b a = ((C74458k) axVar.mo56107c()).mo70774a();
            int bitCount2 = Integer.bitCount(a.mo87190a());
            i = a.mo87195f();
            bitCount = bitCount2;
        } else {
            C59104x d = f322575f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PronReqProdFac");
            ((C59052c) ((C59052c) d).mo56372aa(31770)).mo56386p("AudioListeningSessionAdapterOptional is not present");
        }
        this.f322585k = bitCount;
        this.f322586l = i;
        this.f322582h = tVar;
        this.f322583i = C58485gu.m89844l(sfVar.f238386b.split("\\s+"));
        this.f322577b = caVar;
        this.f322578c = oVar;
        this.f322579d = aVar;
        this.f322587m = aVar2;
        this.f322580e = fVar2;
        this.f322588n = axVar;
        this.f322589o = uVar;
        this.f322590p = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: com.google.android.apps.gsa.speech.k.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: com.google.android.apps.gsa.speech.k.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: com.google.android.apps.gsa.speech.k.a.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4449cd.p4456g.C57981b mo87118a() {
        /*
            r28 = this;
            r0 = r28
            com.google.android.apps.gsa.speech.k.a.g r1 = new com.google.android.apps.gsa.speech.k.a.g
            com.google.android.apps.gsa.shared.util.c.ca r2 = r0.f322577b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.speech.h.ag r4 = com.google.speech.p5208h.C66550ag.f180992c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.speech.h.af r4 = (com.google.speech.p5208h.C66549af) r4
            com.google.android.apps.gsa.speech.l.f r5 = r0.f322581g
            boolean r5 = r5.f258038z
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.speech.h.ag r6 = (com.google.speech.p5208h.C66550ag) r6
            int r7 = r6.f180995a
            r7 = r7 | 1
            r6.f180995a = r7
            r6.f180996b = r5
            com.google.protobuf.bv r4 = r4.build()
            r10 = r4
            com.google.speech.h.ag r10 = (com.google.speech.p5208h.C66550ag) r10
            com.google.speech.h.l r4 = com.google.speech.p5208h.C66678l.f181384f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.speech.h.k r4 = (com.google.speech.p5208h.C66677k) r4
            com.google.android.apps.gsa.search.shared.service.b.sf r5 = r0.f322576a
            r5.getClass()
            int r5 = r5.f238389e
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.speech.h.l r6 = (com.google.speech.p5208h.C66678l) r6
            int r7 = r6.f181388a
            r7 = r7 | 2
            r6.f181388a = r7
            float r5 = (float) r5
            r6.f181390c = r5
            com.google.speech.recognizer.a.at r5 = r0.f322584j
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.speech.h.l r6 = (com.google.speech.p5208h.C66678l) r6
            int r5 = r5.f183321p
            r6.f181389b = r5
            int r5 = r6.f181388a
            r5 = r5 | 1
            r6.f181388a = r5
            int r5 = r0.f322585k
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.speech.h.l r6 = (com.google.speech.p5208h.C66678l) r6
            int r7 = r6.f181388a
            r16 = 4
            r7 = r7 | 4
            r6.f181388a = r7
            r6.f181391d = r5
            com.google.protobuf.bv r4 = r4.build()
            r7 = r4
            com.google.speech.h.l r7 = (com.google.speech.p5208h.C66678l) r7
            com.google.android.apps.gsa.speech.k.b.f r4 = new com.google.android.apps.gsa.speech.k.b.f
            com.google.android.apps.gsa.speech.l.f r5 = r0.f322581g
            com.google.speech.a.a.b r6 = r5.f258028p
            boolean r8 = r5.f258025m
            boolean r9 = r5.f258005A
            boolean r11 = r5.f258027o
            boolean r12 = r5.f258034v
            boolean r13 = r5.f258026n
            java.lang.String r14 = r5.f258036x
            com.google.android.apps.gsa.speech.l.b r5 = r5.f258015c
            com.google.speech.k.a.t r25 = r5.mo87204p()
            com.google.android.apps.gsa.speech.l.f r5 = r0.f322581g
            boolean r15 = r5.f258012H
            int r5 = r5.f258013I
            r17 = r4
            r18 = r6
            r19 = r8
            r20 = r9
            r21 = r11
            r22 = r12
            r23 = r13
            r24 = r14
            r26 = r15
            r27 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.google.speech.k.a.v r6 = r4.mo87150b()
            com.google.android.apps.gsa.shared.util.c.ca r4 = r0.f322577b
            com.google.android.apps.gsa.speech.k.b.e r5 = new com.google.android.apps.gsa.speech.k.b.e
            com.google.android.apps.gsa.shared.m.b.f r8 = r0.f322580e
            com.google.android.apps.gsa.speech.l.f r9 = r0.f322581g
            java.lang.String r9 = r9.f258031s
            g.a.a r11 = r0.f322587m
            java.lang.Object r11 = r11.mo17428b()
            r20 = r11
            com.google.android.apps.gsa.speech.l.b.a r20 = (com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a) r20
            com.google.android.apps.gsa.speech.l.f r11 = r0.f322581g
            java.lang.String r12 = r11.f258019g
            com.google.common.o.amo r11 = r11.f258007C
            r23 = 0
            r24 = 0
            r17 = r5
            r18 = r8
            r19 = r9
            r21 = r12
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            com.google.common.util.concurrent.cx r4 = r4.mo85138c(r5)
            r0.f322592r = r4
            com.google.android.apps.gsa.speech.k.b.l r4 = new com.google.android.apps.gsa.speech.k.b.l
            com.google.android.apps.gsa.staticplugins.s3request.producers.f r5 = new com.google.android.apps.gsa.staticplugins.s3request.producers.f
            r5.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ca r8 = r0.f322577b
            com.google.android.apps.gsa.speech.helper.a r9 = r0.f322579d
            com.google.android.apps.gsa.shared.m.b.f r11 = r0.f322580e
            com.google.android.apps.gsa.search.core.google.gaia.o r12 = r0.f322578c
            com.google.android.apps.gsa.search.shared.service.b.sf r13 = r0.f322576a
            r13.getClass()
            java.lang.String r13 = r13.f238387c
            android.accounts.Account r22 = r12.mo79689w(r13)
            r23 = 0
            r24 = 0
            r17 = r4
            r18 = r5
            r19 = r8
            r20 = r9
            r21 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.f322593s = r4
            com.google.android.apps.gsa.staticplugins.s3request.producers.e r4 = new com.google.android.apps.gsa.staticplugins.s3request.producers.e
            java.util.concurrent.Future r8 = r0.f322592r
            com.google.android.apps.gsa.speech.k.b.l r5 = r0.f322593s
            java.util.concurrent.Future r9 = r5.f257883a
            com.google.android.apps.gsa.speech.l.f r5 = r0.f322581g
            long r11 = r5.f258032t
            com.google.android.apps.gsa.search.shared.service.b.sf r5 = r0.f322576a
            r5.getClass()
            java.lang.String r13 = r5.f238388d
            int r5 = r5.f238390f
            int r5 = com.google.speech.p5208h.C66579be.m97255a(r5)
            if (r5 != 0) goto L_0x012d
            r14 = 4
            goto L_0x012e
        L_0x012d:
            r14 = r5
        L_0x012e:
            com.google.android.apps.gsa.search.core.i.t r15 = r0.f322582h
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r15)
            r3.add(r4)
            com.google.common.base.ax r4 = r0.f322588n
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x018f
            com.google.android.apps.gsa.c.f.u r4 = r0.f322589o
            com.google.common.base.ax r5 = r0.f322588n
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.apps.gsa.c.f.k r5 = (com.google.android.apps.gsa.p5836c.p5843f.C74458k) r5
            java.io.InputStream r4 = r4.c(r5)
            r0.f322591q = r4
            com.google.speech.recognizer.a.at r4 = r0.f322584j
            com.google.speech.recognizer.a.at r5 = com.google.speech.recognizer.p5233a.C67451at.OGG_OPUS
            if (r4 != r5) goto L_0x0169
            com.google.android.apps.gsa.speech.k.a.b r4 = new com.google.android.apps.gsa.speech.k.a.b
            android.content.Context r7 = r0.f322590p
            java.io.InputStream r8 = r0.f322591q
            int r9 = r0.f322585k
            int r10 = r0.f322586l
            r11 = 2048(0x800, float:2.87E-42)
            r12 = 24000(0x5dc0, float:3.3631E-41)
            r13 = 1
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0171
        L_0x0169:
            com.google.android.apps.gsa.speech.k.a.a r5 = new com.google.android.apps.gsa.speech.k.a.a
            java.io.InputStream r6 = r0.f322591q
            r5.<init>(r6, r4)
            r4 = r5
        L_0x0171:
            r3.add(r4)
            com.google.android.apps.gsa.staticplugins.s3request.producers.d r4 = new com.google.android.apps.gsa.staticplugins.s3request.producers.d
            java.util.Collection r5 = r0.f322583i
            com.google.android.apps.gsa.search.shared.service.b.sf r6 = r0.f322576a
            int r6 = r6.f238390f
            int r6 = com.google.speech.p5208h.C66579be.m97255a(r6)
            if (r6 != 0) goto L_0x0183
            r6 = 4
        L_0x0183:
            com.google.android.apps.gsa.search.core.i.t r7 = r0.f322582h
            r4.<init>(r5, r6, r7)
            r3.add(r4)
            r1.<init>((com.google.android.apps.gsa.shared.util.p7159c.C90931ca) r2, (java.lang.Iterable) r3)
            return r1
        L_0x018f:
            com.google.android.apps.gsa.shared.speech.a.o r1 = new com.google.android.apps.gsa.shared.speech.a.o
            java.lang.String r2 = "AudioListeningSessionAdapter is empty."
            r3 = 393220(0x60004, float:5.51019E-40)
            r1.<init>((java.lang.String) r2, (int) r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.s3request.producers.C116348g.mo87118a():com.google.cd.g.b");
    }

    /* renamed from: b */
    public final void mo87119b() {
        InputStream inputStream = this.f322591q;
        if (inputStream != null) {
            C59337t.m92221a(inputStream);
        }
        C92455l lVar = this.f322593s;
        if (lVar != null) {
            lVar.mo87155a();
        }
        Future future = this.f322592r;
        if (future != null) {
            future.cancel(true);
        }
    }

    /* renamed from: c */
    public final void mo87120c() {
        C92455l lVar = this.f322593s;
        if (lVar != null) {
            lVar.mo87156b();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo87121d() {
        return false;
    }
}
