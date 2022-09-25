package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6513aj.C84547g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.C89956x;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89033bd;
import com.google.android.apps.gsa.shared.p6968aa.C89067w;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4068b.p4069a.C54196m;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.p4152bb.p4153a.C55348pa;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4500cm.p4501a.p4511d.p4512a.p4513a.C58166b;
import com.google.p4500cm.p4514b.C58170d;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.speech.p5208h.C66565av;
import com.google.speech.p5208h.C66674h;
import dagger.C68214a;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.search.core.p.bj */
/* compiled from: PG */
public final class C86227bj extends C86224bg implements C91043j, C90991b {

    /* renamed from: c */
    private static final C59071e f233012c = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.bj");

    /* renamed from: A */
    private boolean f233013A;

    /* renamed from: B */
    private boolean f233014B;

    /* renamed from: C */
    private final AtomicBoolean f233015C = new AtomicBoolean(false);

    /* renamed from: D */
    private C86269x f233016D;

    /* renamed from: E */
    private C60870cx f233017E;

    /* renamed from: F */
    private final C90908be f233018F = new C86226bi(this);

    /* renamed from: a */
    public final C86195ae f233019a;

    /* renamed from: b */
    public C58881cr f233020b;

    /* renamed from: d */
    private final C90931ca f233021d;

    /* renamed from: e */
    private final C86124t f233022e;

    /* renamed from: f */
    private final C86228bk f233023f;

    /* renamed from: g */
    private final C21370a f233024g;

    /* renamed from: h */
    private final C89956x f233025h;

    /* renamed from: l */
    private final C89067w f233026l;

    /* renamed from: m */
    private final C90476a f233027m;

    /* renamed from: n */
    private final C90479a f233028n;

    /* renamed from: o */
    private final AtomicInteger f233029o = new AtomicInteger(0);

    /* renamed from: p */
    private C86199ai f233030p;

    /* renamed from: q */
    private InputStream f233031q;

    /* renamed from: r */
    private C89022at f233032r;

    /* renamed from: s */
    private C84547g f233033s;

    /* renamed from: t */
    private C89033bd f233034t;

    /* renamed from: u */
    private String f233035u;

    /* renamed from: v */
    private boolean f233036v;

    /* renamed from: w */
    private boolean f233037w;

    /* renamed from: x */
    private boolean f233038x;

    /* renamed from: y */
    private boolean f233039y;

    /* renamed from: z */
    private final Object f233040z = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86227bj(C86246cb cbVar, C90931ca caVar, C84474e eVar, C86124t tVar, C89956x xVar, C58881cr crVar, C89067w wVar, C21370a aVar, C86195ae aeVar, C68214a aVar2, C90476a aVar3, C90479a aVar4) {
        super(cbVar, aVar, aVar2, eVar, caVar, aVar3);
        C86228bk bkVar = new C86228bk();
        boolean z = false;
        this.f233021d = caVar;
        this.f233022e = tVar;
        this.f233025h = xVar;
        this.f233020b = crVar;
        this.f233023f = bkVar;
        C58838bb.m90883r(bkVar.f233043c == null ? true : z);
        bkVar.f233043c = this;
        this.f233026l = wVar;
        this.f233024g = aVar;
        this.f233019a = aeVar;
        this.f233027m = aVar3;
        this.f233028n = aVar4;
    }

    /* renamed from: N */
    private final void m138728N() {
        C89033bd bdVar;
        C89022at atVar;
        InputStream inputStream;
        C84547g gVar;
        synchronized (this) {
            bdVar = this.f233034t;
            atVar = this.f233032r;
            inputStream = this.f233031q;
            gVar = this.f233033s;
        }
        if (atVar != null && !atVar.mo83003e()) {
            mo79842z(new C89013ak(atVar));
        } else if (inputStream == null || gVar == null) {
            mo79842z(new C90457d("No response body received.", (int) C89885b.S3_NO_RESPONSE_BODY_VALUE));
        }
        if (atVar != null && gVar != null && bdVar != null && this.f233015C.compareAndSet(false, true)) {
            this.f233010k.mo79918ai(this.f233024g.mo26872d());
            this.f233026l.mo83052e(((UriRequest) this.f233020b.mo6453a()).f236331a.toString(), atVar.mo83004f());
            this.f233010k.mo79932aw(new C87504b((UriRequest) this.f233020b.mo6453a(), bdVar, gVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0293, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d5 A[Catch:{ b -> 0x01ff }] */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m138729O(com.google.speech.p5208h.C66565av r17, boolean r18) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            monitor-enter(r16)
            boolean r0 = r16.mo79857J()     // Catch:{ all -> 0x0296 }
            if (r0 != 0) goto L_0x0294
            int r0 = r8.f181064a     // Catch:{ all -> 0x0296 }
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r8.f181065b     // Catch:{ all -> 0x0296 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0296 }
            if (r0 != 0) goto L_0x003d
            com.google.android.apps.gsa.search.core.p.bk r0 = r7.f233023f     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = r8.f181065b     // Catch:{ all -> 0x0296 }
            boolean r3 = r0.f233045e     // Catch:{ all -> 0x0296 }
            if (r3 == 0) goto L_0x0022
            goto L_0x003d
        L_0x0022:
            java.lang.String r3 = r0.f233044d     // Catch:{ all -> 0x0296 }
            if (r3 != 0) goto L_0x0029
            r0.f233044d = r2     // Catch:{ all -> 0x0296 }
            goto L_0x003d
        L_0x0029:
            java.lang.StringBuilder r3 = r0.f233042b     // Catch:{ all -> 0x0296 }
            int r3 = r3.length()     // Catch:{ all -> 0x0296 }
            if (r3 != 0) goto L_0x0038
            java.lang.StringBuilder r3 = r0.f233042b     // Catch:{ all -> 0x0296 }
            java.lang.String r4 = r0.f233044d     // Catch:{ all -> 0x0296 }
            r3.append(r4)     // Catch:{ all -> 0x0296 }
        L_0x0038:
            java.lang.StringBuilder r0 = r0.f233042b     // Catch:{ all -> 0x0296 }
            r0.append(r2)     // Catch:{ all -> 0x0296 }
        L_0x003d:
            boolean r0 = r8.f181066c     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x020f
            java.io.InputStream r0 = r7.f233031q     // Catch:{ all -> 0x0296 }
            if (r0 != 0) goto L_0x0206
            com.google.android.apps.gsa.search.core.p.bk r0 = r7.f233023f     // Catch:{ all -> 0x0296 }
            boolean r2 = r0.f233045e     // Catch:{ all -> 0x0296 }
            if (r2 == 0) goto L_0x004d
            goto L_0x0169
        L_0x004d:
            r0.f233045e = r1     // Catch:{ all -> 0x0296 }
            java.lang.StringBuilder r2 = r0.f233042b     // Catch:{ all -> 0x0296 }
            int r2 = r2.length()     // Catch:{ all -> 0x0296 }
            r3 = 0
            if (r2 <= 0) goto L_0x005f
            java.lang.StringBuilder r2 = r0.f233042b     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0296 }
            goto L_0x0063
        L_0x005f:
            java.lang.String r2 = r0.f233044d     // Catch:{ all -> 0x0296 }
            if (r2 == 0) goto L_0x0205
        L_0x0063:
            r4 = 10
            com.google.android.apps.gsa.shared.util.bc r2 = com.google.android.apps.gsa.shared.util.C90759bc.m148248b(r2, r4)     // Catch:{ all -> 0x0296 }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0296 }
            if (r4 == 0) goto L_0x015a
            java.lang.String r4 = r2.next()     // Catch:{ all -> 0x0296 }
            if (r4 == 0) goto L_0x00c5
            java.lang.String r5 = "HTTP/"
            boolean r5 = r4.startsWith(r5)     // Catch:{ all -> 0x0296 }
            if (r5 != 0) goto L_0x007e
            goto L_0x00c5
        L_0x007e:
            java.lang.String r5 = " "
            int r5 = r4.indexOf(r5)     // Catch:{ all -> 0x0296 }
            int r5 = r5 + r1
            if (r5 != 0) goto L_0x0095
            com.google.common.f.e r5 = com.google.android.apps.gsa.search.core.p6816p.C86228bk.f233041a     // Catch:{ all -> 0x0296 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x0296 }
            java.lang.String r6 = "Invalid status line: %s"
            r9 = 7775(0x1e5f, float:1.0895E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r9)).mo56389s(r6, r4)     // Catch:{ all -> 0x0296 }
            goto L_0x00d2
        L_0x0095:
            int r6 = r5 + -2
            r4.charAt(r6)     // Catch:{ all -> 0x0296 }
            int r6 = r5 + 3
            int r9 = r4.length()     // Catch:{ all -> 0x0296 }
            if (r6 <= r9) goto L_0x00a6
            int r6 = r4.length()     // Catch:{ all -> 0x0296 }
        L_0x00a6:
            java.lang.String r5 = r4.substring(r5, r6)     // Catch:{ all -> 0x0296 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x0296 }
            int r6 = r6 + r1
            int r9 = r4.length()     // Catch:{ all -> 0x0296 }
            if (r6 > r9) goto L_0x00ba
            java.lang.String r4 = r4.substring(r6)     // Catch:{ all -> 0x0296 }
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r4 = ""
        L_0x00bc:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0296 }
            android.util.Pair r4 = android.util.Pair.create(r5, r4)     // Catch:{ all -> 0x0296 }
            goto L_0x00d3
        L_0x00c5:
            com.google.common.f.e r5 = com.google.android.apps.gsa.search.core.p6816p.C86228bk.f233041a     // Catch:{ all -> 0x0296 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x0296 }
            java.lang.String r6 = "Invalid status line: %s"
            r9 = 7773(0x1e5d, float:1.0892E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r9)).mo56389s(r6, r4)     // Catch:{ all -> 0x0296 }
        L_0x00d2:
            r4 = r3
        L_0x00d3:
            if (r4 == 0) goto L_0x0169
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0296 }
            r5.<init>()     // Catch:{ all -> 0x0296 }
        L_0x00da:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0296 }
            if (r6 == 0) goto L_0x0144
            java.lang.String r6 = r2.next()     // Catch:{ all -> 0x0296 }
            r9 = 58
            int r9 = r6.indexOf(r9)     // Catch:{ all -> 0x0296 }
            if (r9 > 0) goto L_0x00fa
            com.google.common.f.e r9 = com.google.android.apps.gsa.search.core.p6816p.C86228bk.f233041a     // Catch:{ all -> 0x0296 }
            com.google.common.f.x r9 = r9.mo56225c()     // Catch:{ all -> 0x0296 }
            java.lang.String r10 = "Skipping invalid header: %s"
            r11 = 7779(0x1e63, float:1.0901E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r11)).mo56389s(r10, r6)     // Catch:{ all -> 0x0296 }
            goto L_0x00da
        L_0x00fa:
            r10 = 0
            java.lang.String r11 = r6.substring(r10, r9)     // Catch:{ all -> 0x0296 }
            java.lang.String r11 = r11.trim()     // Catch:{ all -> 0x0296 }
            int r9 = r9 + 1
            java.lang.String r9 = r6.substring(r9)     // Catch:{ all -> 0x0296 }
            java.lang.String r9 = r9.trim()     // Catch:{ all -> 0x0296 }
            boolean r12 = r11.isEmpty()     // Catch:{ all -> 0x0296 }
            if (r12 != 0) goto L_0x0136
            boolean r12 = r9.isEmpty()     // Catch:{ all -> 0x0296 }
            if (r12 == 0) goto L_0x011a
            goto L_0x0136
        L_0x011a:
            boolean r6 = r5.containsKey(r11)     // Catch:{ all -> 0x0296 }
            if (r6 == 0) goto L_0x012a
            java.lang.Object r6 = r5.get(r11)     // Catch:{ all -> 0x0296 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0296 }
            r6.add(r9)     // Catch:{ all -> 0x0296 }
            goto L_0x00da
        L_0x012a:
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ all -> 0x0296 }
            r6[r10] = r9     // Catch:{ all -> 0x0296 }
            java.util.ArrayList r6 = com.google.common.p4522b.C58597ky.m90212c(r6)     // Catch:{ all -> 0x0296 }
            r5.put(r11, r6)     // Catch:{ all -> 0x0296 }
            goto L_0x00da
        L_0x0136:
            com.google.common.f.e r9 = com.google.android.apps.gsa.search.core.p6816p.C86228bk.f233041a     // Catch:{ all -> 0x0296 }
            com.google.common.f.x r9 = r9.mo56225c()     // Catch:{ all -> 0x0296 }
            java.lang.String r10 = "Skipping invalid header: %s"
            r11 = 7778(0x1e62, float:1.09E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r11)).mo56389s(r10, r6)     // Catch:{ all -> 0x0296 }
            goto L_0x00da
        L_0x0144:
            com.google.android.apps.gsa.shared.aa.at r1 = new com.google.android.apps.gsa.shared.aa.at     // Catch:{ all -> 0x0296 }
            java.lang.Object r2 = r4.first     // Catch:{ all -> 0x0296 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0296 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0296 }
            java.lang.String r4 = "unknown"
            java.util.List r5 = com.google.android.apps.gsa.shared.p6968aa.C89022at.m144767b(r5)     // Catch:{ all -> 0x0296 }
            r1.<init>(r2, r4, r5, r3)     // Catch:{ all -> 0x0296 }
            r0.f233046f = r1     // Catch:{ all -> 0x0296 }
            goto L_0x0167
        L_0x015a:
            com.google.common.f.e r1 = com.google.android.apps.gsa.search.core.p6816p.C86228bk.f233041a     // Catch:{ all -> 0x0296 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = "Malformed headers: no status line"
            r3 = 7781(0x1e65, float:1.0904E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0296 }
        L_0x0167:
            com.google.android.apps.gsa.shared.aa.at r0 = r0.f233046f     // Catch:{ all -> 0x0296 }
        L_0x0169:
            com.google.android.apps.gsa.search.core.p.bk r0 = r7.f233023f     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.shared.aa.at r0 = r0.f233046f     // Catch:{ b -> 0x01ff }
            if (r0 == 0) goto L_0x01f4
            com.google.android.apps.gsa.shared.aa.bm r1 = com.google.android.apps.gsa.shared.p6968aa.C89042bm.f241318b     // Catch:{ b -> 0x01ff }
            r0.mo83001c(r1)     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.aj.g r1 = new com.google.android.apps.gsa.search.core.aj.g     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.p.bf r2 = new com.google.android.apps.gsa.search.core.p.bf     // Catch:{ b -> 0x01ff }
            r2.<init>(r7)     // Catch:{ b -> 0x01ff }
            r1.<init>(r2)     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.p.ai r2 = new com.google.android.apps.gsa.search.core.p.ai     // Catch:{ b -> 0x01ff }
            r2.<init>(r1)     // Catch:{ b -> 0x01ff }
            r7.f233030p = r2     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.aj.e r2 = new com.google.android.apps.gsa.search.core.aj.e     // Catch:{ b -> 0x01ff }
            r2.<init>(r1)     // Catch:{ b -> 0x01ff }
            r7.f233031q = r2     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.aj.g r1 = new com.google.android.apps.gsa.search.core.aj.g     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.p.bf r2 = new com.google.android.apps.gsa.search.core.p.bf     // Catch:{ b -> 0x01ff }
            r2.<init>(r7)     // Catch:{ b -> 0x01ff }
            r1.<init>(r2)     // Catch:{ b -> 0x01ff }
            r7.f233033s = r1     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.google.d.f r10 = new com.google.android.apps.gsa.search.core.google.d.f     // Catch:{ b -> 0x01ff }
            java.io.InputStream r1 = r7.f233031q     // Catch:{ b -> 0x01ff }
            dagger.a r2 = r7.f233009j     // Catch:{ b -> 0x01ff }
            r10.<init>(r0, r1, r2)     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.aj.g r11 = r7.f233033s     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.shared.util.c.ca r13 = r7.f233021d     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.i.t r2 = r7.f233022e     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.shared.logger.x r14 = r7.f233025h     // Catch:{ b -> 0x01ff }
            dagger.a r15 = r7.f233009j     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.shared.s.a.a r5 = r7.f233027m     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.shared.s.b.a r6 = r7.f233028n     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.google.d.d r12 = new com.google.android.apps.gsa.search.core.google.d.d     // Catch:{ b -> 0x01ff }
            r1 = r12
            r3 = r16
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.aj.o r0 = new com.google.android.apps.gsa.search.core.aj.o     // Catch:{ b -> 0x01ff }
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ b -> 0x01ff }
            boolean r1 = r0.mo78292i()     // Catch:{ b -> 0x01ff }
            if (r1 != 0) goto L_0x01ee
            com.google.android.apps.gsa.shared.util.c.ca r1 = r0.f230097a     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.search.core.aj.n r2 = new com.google.android.apps.gsa.search.core.aj.n     // Catch:{ b -> 0x01ff }
            java.lang.Class r3 = r0.getClass()     // Catch:{ b -> 0x01ff }
            java.lang.String r3 = r3.getName()     // Catch:{ b -> 0x01ff }
            com.google.android.apps.gsa.shared.logger.x r4 = r0.f230098b     // Catch:{ b -> 0x01ff }
            long r4 = r4.f246471a     // Catch:{ b -> 0x01ff }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ b -> 0x01ff }
            r6.<init>()     // Catch:{ b -> 0x01ff }
            java.lang.String r9 = "runReadTask, reqId="
            r6.append(r9)     // Catch:{ b -> 0x01ff }
            r6.append(r4)     // Catch:{ b -> 0x01ff }
            java.lang.String r4 = r6.toString()     // Catch:{ b -> 0x01ff }
            r2.<init>(r0, r3, r4)     // Catch:{ b -> 0x01ff }
            com.google.common.util.concurrent.cx r1 = r1.mo85139d(r2)     // Catch:{ b -> 0x01ff }
            r0.f230100d = r1     // Catch:{ b -> 0x01ff }
        L_0x01ee:
            com.google.android.apps.gsa.search.core.p.bk r0 = r7.f233023f     // Catch:{ all -> 0x0296 }
            r0.mo79862a()     // Catch:{ all -> 0x0296 }
            goto L_0x0206
        L_0x01f4:
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ b -> 0x01ff }
            java.lang.String r1 = "Response was unparsable."
            r2 = 65569(0x10021, float:9.1882E-41)
            r0.<init>((java.lang.String) r1, (int) r2)     // Catch:{ b -> 0x01ff }
            throw r0     // Catch:{ b -> 0x01ff }
        L_0x01ff:
            r0 = move-exception
            r7.mo79842z(r0)     // Catch:{ all -> 0x0296 }
            monitor-exit(r16)
            return
        L_0x0205:
            throw r3     // Catch:{ all -> 0x0296 }
        L_0x0206:
            boolean r0 = r16.m138730P()     // Catch:{ all -> 0x0296 }
            if (r0 != 0) goto L_0x020d
            goto L_0x020f
        L_0x020d:
            monitor-exit(r16)
            return
        L_0x020f:
            int r0 = r8.f181064a     // Catch:{ all -> 0x0296 }
            r0 = r0 & 4
            r1 = 65555(0x10013, float:9.1862E-41)
            if (r0 == 0) goto L_0x0259
            com.google.protobuf.z r0 = r8.f181067d     // Catch:{ all -> 0x0296 }
            int r0 = r0.mo59031d()     // Catch:{ all -> 0x0296 }
            if (r0 <= 0) goto L_0x0259
            com.google.android.apps.gsa.search.core.p.ai r0 = r7.f233030p     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x024d
            com.google.protobuf.z r0 = r8.f181067d     // Catch:{ all -> 0x0296 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0296 }
            r0.mo59031d()     // Catch:{ all -> 0x0296 }
            com.google.android.apps.gsa.search.core.p.ai r2 = r7.f233030p     // Catch:{ d -> 0x0248 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f232936a     // Catch:{ d -> 0x0248 }
            int r3 = r3.getAndIncrement()     // Catch:{ d -> 0x0248 }
            com.google.android.apps.gsa.search.core.aj.i r4 = new com.google.android.apps.gsa.search.core.aj.i     // Catch:{ d -> 0x0248 }
            r4.<init>(r0, r3)     // Catch:{ d -> 0x0248 }
            boolean r0 = r2.mo78284f(r4)     // Catch:{ d -> 0x0248 }
            if (r0 == 0) goto L_0x023f
            goto L_0x0259
        L_0x023f:
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ d -> 0x0248 }
            r2 = 196617(0x30009, float:2.75519E-40)
            r0.<init>(r2)     // Catch:{ d -> 0x0248 }
            throw r0     // Catch:{ d -> 0x0248 }
        L_0x0248:
            r0 = move-exception
            r7.mo79842z(r0)     // Catch:{ all -> 0x0296 }
            goto L_0x0259
        L_0x024d:
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = "Missing response producer. (Out of order message ?)"
            r0.<init>((java.lang.String) r2, (int) r1)     // Catch:{ all -> 0x0296 }
            r7.mo79842z(r0)     // Catch:{ all -> 0x0296 }
            monitor-exit(r16)
            return
        L_0x0259:
            boolean r0 = r8.f181068e     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x0292
            com.google.android.apps.gsa.search.core.p.ai r0 = r7.f233030p     // Catch:{ all -> 0x0296 }
            if (r0 != 0) goto L_0x026d
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = "Missing response producer. (Out of order message ?)"
            r0.<init>((java.lang.String) r2, (int) r1)     // Catch:{ all -> 0x0296 }
            r7.mo79842z(r0)     // Catch:{ all -> 0x0296 }
            monitor-exit(r16)
            return
        L_0x026d:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0296 }
            com.google.android.apps.gsa.search.core.p.ai r0 = r7.f233030p     // Catch:{ all -> 0x0296 }
            r0.mo78283e()     // Catch:{ all -> 0x0296 }
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f233022e     // Catch:{ all -> 0x0296 }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247664lS     // Catch:{ all -> 0x0296 }
            boolean r0 = r0.mo79746e(r1)     // Catch:{ all -> 0x0296 }
            if (r0 == 0) goto L_0x0289
            java.lang.String r0 = r7.f233035u     // Catch:{ all -> 0x0296 }
            if (r0 != 0) goto L_0x0292
            if (r18 != 0) goto L_0x0292
            r16.mo79859L()     // Catch:{ all -> 0x0296 }
            monitor-exit(r16)
            return
        L_0x0289:
            java.lang.String r0 = r7.f233035u     // Catch:{ all -> 0x0296 }
            if (r0 != 0) goto L_0x0292
            r16.mo79859L()     // Catch:{ all -> 0x0296 }
            monitor-exit(r16)
            return
        L_0x0292:
            monitor-exit(r16)
            return
        L_0x0294:
            monitor-exit(r16)
            return
        L_0x0296:
            r0 = move-exception
            monitor-exit(r16)
            goto L_0x029a
        L_0x0299:
            throw r0
        L_0x029a:
            goto L_0x0299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6816p.C86227bj.m138729O(com.google.speech.h.av, boolean):void");
    }

    /* renamed from: P */
    private final boolean m138730P() {
        return this.f233029o.get() == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        return false;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m138731Q() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f233013A     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.f233036v     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000f
            r1.mo79859L()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x000f:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6816p.C86227bj.m138731Q():boolean");
    }

    /* renamed from: A */
    public final void mo79848A() {
        C86199ai aiVar;
        C58976aa aaVar = C58975e.f156826a;
        C90457d dVar = new C90457d("Cancelled.", (int) C89885b.S3_CANCELLED_VALUE);
        if (mo79842z(dVar)) {
            this.f233023f.mo79863b(dVar);
            synchronized (this) {
                aiVar = this.f233030p;
            }
            if (aiVar != null) {
                aiVar.mo78283e();
            }
        }
    }

    /* renamed from: B */
    public final synchronized void mo79849B(C66674h hVar) {
        C86246cb cbVar = this.f233010k;
        C58838bb.m90883r(cbVar instanceof C86190a);
        ((C86190a) cbVar).f232894a.mo79832b(hVar);
        mo79859L();
        mo79858K(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x024b, code lost:
        return;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo79850C(com.google.assistant.p3897e.p3910e.p3911a.C51195j r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0252 }
            com.google.android.apps.gsa.search.core.p.cb r0 = r13.f233010k     // Catch:{ all -> 0x0252 }
            boolean r1 = r0 instanceof com.google.android.apps.gsa.search.core.p6816p.C86261p     // Catch:{ all -> 0x0252 }
            com.google.common.base.C58838bb.m90883r(r1)     // Catch:{ all -> 0x0252 }
            com.google.android.apps.gsa.search.core.i.t r1 = r13.f233022e     // Catch:{ all -> 0x0252 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI     // Catch:{ all -> 0x0252 }
            boolean r1 = r1.mo79746e(r2)     // Catch:{ all -> 0x0252 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00ab
            com.google.android.apps.gsa.search.core.i.t r1 = r13.f233022e     // Catch:{ all -> 0x0252 }
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247677lf     // Catch:{ all -> 0x0252 }
            boolean r1 = r1.mo79746e(r4)     // Catch:{ all -> 0x0252 }
            if (r1 == 0) goto L_0x00ab
            com.google.assistant.e.j.e.fx r1 = com.google.android.apps.gsa.search.core.p6816p.C86217b.m138691a(r14)     // Catch:{ all -> 0x0252 }
            if (r1 == 0) goto L_0x002c
            boolean r4 = com.google.android.apps.gsa.search.core.p6816p.C86217b.m138693c(r1)     // Catch:{ all -> 0x0252 }
            if (r4 != 0) goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 != 0) goto L_0x0031
            r1 = r2
            goto L_0x0096
        L_0x0031:
            com.google.speech.h.av r4 = com.google.speech.p5208h.C66565av.f181061f     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x0252 }
            com.google.speech.h.au r4 = (com.google.speech.p5208h.C66564au) r4     // Catch:{ all -> 0x0252 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0252 }
            com.google.speech.h.av r5 = (com.google.speech.p5208h.C66565av) r5     // Catch:{ all -> 0x0252 }
            int r6 = r5.f181064a     // Catch:{ all -> 0x0252 }
            r6 = r6 | 2
            r5.f181064a = r6     // Catch:{ all -> 0x0252 }
            r5.f181066c = r3     // Catch:{ all -> 0x0252 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0252 }
            com.google.speech.h.av r5 = (com.google.speech.p5208h.C66565av) r5     // Catch:{ all -> 0x0252 }
            int r6 = r5.f181064a     // Catch:{ all -> 0x0252 }
            r6 = r6 | 8
            r5.f181064a = r6     // Catch:{ all -> 0x0252 }
            r5.f181068e = r3     // Catch:{ all -> 0x0252 }
            com.google.assistant.e.j.e.fu r5 = r1.f136384c     // Catch:{ all -> 0x0252 }
            if (r5 != 0) goto L_0x005d
            com.google.assistant.e.j.e.fu r5 = com.google.assistant.p3897e.p3921j.p3926e.C51968fu.f136374d     // Catch:{ all -> 0x0252 }
        L_0x005d:
            com.google.protobuf.z r5 = r5.f136377b     // Catch:{ all -> 0x0252 }
            java.nio.charset.Charset r6 = com.google.protobuf.C62972cr.f170009a     // Catch:{ all -> 0x0252 }
            java.lang.String r5 = r5.mo59170I(r6)     // Catch:{ all -> 0x0252 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x0252 }
            com.google.speech.h.av r6 = (com.google.speech.p5208h.C66565av) r6     // Catch:{ all -> 0x0252 }
            r5.getClass()     // Catch:{ all -> 0x0252 }
            int r7 = r6.f181064a     // Catch:{ all -> 0x0252 }
            r7 = r7 | r3
            r6.f181064a = r7     // Catch:{ all -> 0x0252 }
            r6.f181065b = r5     // Catch:{ all -> 0x0252 }
            com.google.assistant.e.j.e.fu r1 = r1.f136385d     // Catch:{ all -> 0x0252 }
            if (r1 != 0) goto L_0x007c
            com.google.assistant.e.j.e.fu r1 = com.google.assistant.p3897e.p3921j.p3926e.C51968fu.f136374d     // Catch:{ all -> 0x0252 }
        L_0x007c:
            com.google.protobuf.z r1 = r1.f136377b     // Catch:{ all -> 0x0252 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0252 }
            com.google.speech.h.av r5 = (com.google.speech.p5208h.C66565av) r5     // Catch:{ all -> 0x0252 }
            r1.getClass()     // Catch:{ all -> 0x0252 }
            int r6 = r5.f181064a     // Catch:{ all -> 0x0252 }
            r6 = r6 | 4
            r5.f181064a = r6     // Catch:{ all -> 0x0252 }
            r5.f181067d = r1     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bv r1 = r4.build()     // Catch:{ all -> 0x0252 }
            com.google.speech.h.av r1 = (com.google.speech.p5208h.C66565av) r1     // Catch:{ all -> 0x0252 }
        L_0x0096:
            com.google.assistant.e.j.e.fx r4 = com.google.android.apps.gsa.search.core.p6816p.C86217b.m138691a(r14)     // Catch:{ all -> 0x0252 }
            if (r4 == 0) goto L_0x00a5
            int r5 = r4.f136382a     // Catch:{ all -> 0x0252 }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x00a5
            java.lang.String r4 = r4.f136386e     // Catch:{ all -> 0x0252 }
            goto L_0x00a6
        L_0x00a5:
            r4 = r2
        L_0x00a6:
            if (r4 == 0) goto L_0x00ac
            r13.f233035u = r4     // Catch:{ all -> 0x0252 }
            goto L_0x00ac
        L_0x00ab:
            r1 = r2
        L_0x00ac:
            java.lang.Object r4 = r13.f233040z     // Catch:{ all -> 0x0252 }
            monitor-enter(r4)     // Catch:{ all -> 0x0252 }
            boolean r5 = r13.f233037w     // Catch:{ all -> 0x024f }
            r6 = 0
            if (r1 != 0) goto L_0x00bb
            java.lang.String r7 = r13.f233035u     // Catch:{ all -> 0x024f }
            if (r7 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r7 = 0
            goto L_0x00bc
        L_0x00bb:
            r7 = 1
        L_0x00bc:
            r5 = r5 | r7
            r13.f233037w = r5     // Catch:{ all -> 0x024f }
            monitor-exit(r4)     // Catch:{ all -> 0x024f }
            com.google.android.apps.gsa.search.core.p.p r0 = (com.google.android.apps.gsa.search.core.p6816p.C86261p) r0     // Catch:{ all -> 0x0252 }
            dagger.a r11 = r13.f233009j     // Catch:{ all -> 0x0252 }
            r0.mo79959i(r14)     // Catch:{ all -> 0x0252 }
            r0.mo79957f(r14)     // Catch:{ all -> 0x0252 }
            int r4 = r14.f133266a     // Catch:{ all -> 0x0252 }
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x00df
            com.google.cd.g.b.a r4 = r0.f233171d     // Catch:{ all -> 0x0252 }
            r4.mo54591h(r14)     // Catch:{ all -> 0x0252 }
            boolean r4 = r14.f133274i     // Catch:{ all -> 0x0252 }
            if (r4 != 0) goto L_0x00e4
            com.google.cd.g.b.a r4 = r0.f233171d     // Catch:{ all -> 0x0252 }
            r4.mo54589f(r3)     // Catch:{ all -> 0x0252 }
            goto L_0x00e4
        L_0x00df:
            com.google.cd.g.b.a r4 = r0.f233171d     // Catch:{ all -> 0x0252 }
            r4.mo54589f(r3)     // Catch:{ all -> 0x0252 }
        L_0x00e4:
            boolean r4 = r14.f133274i     // Catch:{ all -> 0x0252 }
            if (r4 == 0) goto L_0x00eb
            r0 = 0
            goto L_0x0218
        L_0x00eb:
            r0.mo79958g(r14)     // Catch:{ all -> 0x0252 }
            java.lang.String r4 = r14.f133271f     // Catch:{ all -> 0x0252 }
            com.google.android.apps.gsa.search.core.p.ag r7 = r0.f233172e     // Catch:{ all -> 0x0252 }
            r7.mo79832b(r4)     // Catch:{ all -> 0x0252 }
            if (r5 != 0) goto L_0x01d2
            com.google.android.apps.gsa.search.core.p.ag r4 = r0.f233101h     // Catch:{ all -> 0x0252 }
            r4.mo79833c()     // Catch:{ all -> 0x0252 }
            com.google.cm.d.a.b r4 = com.google.p4500cm.p4518d.p4519a.C58179b.f155534j     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x0252 }
            com.google.cm.d.a.a r4 = (com.google.p4500cm.p4518d.p4519a.C58178a) r4     // Catch:{ all -> 0x0252 }
            int r5 = r14.f133266a     // Catch:{ all -> 0x0252 }
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0139
            r4.copyOnWrite()     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0252 }
            com.google.cm.d.a.b r5 = (com.google.p4500cm.p4518d.p4519a.C58179b) r5     // Catch:{ all -> 0x0252 }
            int r7 = r5.f155536a     // Catch:{ all -> 0x0252 }
            r7 = r7 | 2048(0x800, float:2.87E-42)
            r5.f155536a = r7     // Catch:{ all -> 0x0252 }
            r5.f155544i = r6     // Catch:{ all -> 0x0252 }
            int r5 = r14.f133266a     // Catch:{ all -> 0x0252 }
            r7 = r5 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0122
            r5 = r5 & r3
            if (r5 == 0) goto L_0x0139
        L_0x0122:
            com.google.assistant.e.e.a.i r5 = r14.f133270e     // Catch:{ all -> 0x0252 }
            if (r5 != 0) goto L_0x0128
            com.google.assistant.e.e.a.i r5 = com.google.assistant.p3897e.p3910e.p3911a.C51194i.f133258e     // Catch:{ all -> 0x0252 }
        L_0x0128:
            boolean r5 = r5.f133261b     // Catch:{ all -> 0x0252 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ all -> 0x0252 }
            com.google.cm.d.a.b r7 = (com.google.p4500cm.p4518d.p4519a.C58179b) r7     // Catch:{ all -> 0x0252 }
            int r8 = r7.f155536a     // Catch:{ all -> 0x0252 }
            r8 = r8 | 16
            r7.f155536a = r8     // Catch:{ all -> 0x0252 }
            r7.f155539d = r5     // Catch:{ all -> 0x0252 }
        L_0x0139:
            com.google.bb.a.pb r5 = r14.f133267b     // Catch:{ all -> 0x0252 }
            if (r5 != 0) goto L_0x013f
            com.google.bb.a.pb r5 = com.google.p4152bb.p4153a.C55349pb.f145830g     // Catch:{ all -> 0x0252 }
        L_0x013f:
            com.google.protobuf.cq r5 = r5.f145835d     // Catch:{ all -> 0x0252 }
            int r5 = r5.size()     // Catch:{ all -> 0x0252 }
            if (r5 <= 0) goto L_0x01b0
            com.google.bb.a.pb r5 = r14.f133267b     // Catch:{ all -> 0x0252 }
            if (r5 != 0) goto L_0x014d
            com.google.bb.a.pb r5 = com.google.p4152bb.p4153a.C55349pb.f145830g     // Catch:{ all -> 0x0252 }
        L_0x014d:
            com.google.protobuf.cq r5 = r5.f145835d     // Catch:{ all -> 0x0252 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0252 }
            com.google.bb.a.ad r5 = (com.google.p4152bb.p4153a.C54946ad) r5     // Catch:{ all -> 0x0252 }
            com.google.bb.a.bg r5 = r5.f144537e     // Catch:{ all -> 0x0252 }
            if (r5 != 0) goto L_0x015b
            com.google.bb.a.bg r5 = com.google.p4152bb.p4153a.C54976bg.f144641o     // Catch:{ all -> 0x0252 }
        L_0x015b:
            com.google.protobuf.bt r7 = com.google.p5277z.p5282c.C68026p.f184307c     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)     // Catch:{ all -> 0x0252 }
            r5.mo58887l(r7)     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bf r5 = r5.f169962ag     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bs r8 = r7.f169971d     // Catch:{ all -> 0x0252 }
            java.lang.Object r5 = r5.mo58854l(r8)     // Catch:{ all -> 0x0252 }
            if (r5 != 0) goto L_0x0171
            java.lang.Object r5 = r7.f169969b     // Catch:{ all -> 0x0252 }
            goto L_0x0175
        L_0x0171:
            java.lang.Object r5 = r7.mo58889c(r5)     // Catch:{ all -> 0x0252 }
        L_0x0175:
            com.google.z.c.p r5 = (com.google.p5277z.p5282c.C68026p) r5     // Catch:{ all -> 0x0252 }
            com.google.protobuf.cq r7 = r5.f184309a     // Catch:{ all -> 0x0252 }
            int r7 = r7.size()     // Catch:{ all -> 0x0252 }
            if (r7 <= 0) goto L_0x019f
            com.google.protobuf.cq r5 = r5.f184309a     // Catch:{ all -> 0x0252 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0252 }
            com.google.z.c.n r5 = (com.google.p5277z.p5282c.C68024n) r5     // Catch:{ all -> 0x0252 }
            com.google.z.c.v r5 = r5.f184300a     // Catch:{ all -> 0x0252 }
            if (r5 != 0) goto L_0x018d
            com.google.z.c.v r5 = com.google.p5277z.p5282c.C68032v.f184320b     // Catch:{ all -> 0x0252 }
        L_0x018d:
            r4.copyOnWrite()     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ all -> 0x0252 }
            com.google.cm.d.a.b r7 = (com.google.p4500cm.p4518d.p4519a.C58179b) r7     // Catch:{ all -> 0x0252 }
            r5.getClass()     // Catch:{ all -> 0x0252 }
            r7.f155541f = r5     // Catch:{ all -> 0x0252 }
            int r5 = r7.f155536a     // Catch:{ all -> 0x0252 }
            r5 = r5 | 64
            r7.f155536a = r5     // Catch:{ all -> 0x0252 }
        L_0x019f:
            boolean r5 = r14.f133276k     // Catch:{ all -> 0x0252 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0252 }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ all -> 0x0252 }
            com.google.cm.d.a.b r7 = (com.google.p4500cm.p4518d.p4519a.C58179b) r7     // Catch:{ all -> 0x0252 }
            int r8 = r7.f155536a     // Catch:{ all -> 0x0252 }
            r8 = r8 | 32
            r7.f155536a = r8     // Catch:{ all -> 0x0252 }
            r7.f155540e = r5     // Catch:{ all -> 0x0252 }
        L_0x01b0:
            com.google.android.apps.gsa.search.core.p.cc r5 = new com.google.android.apps.gsa.search.core.p.cc     // Catch:{ all -> 0x0252 }
            java.lang.String r7 = ""
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x0252 }
            com.google.cm.d.a.b r4 = (com.google.p4500cm.p4518d.p4519a.C58179b) r4     // Catch:{ all -> 0x0252 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0252 }
            r5.<init>(r7, r2, r4, r8)     // Catch:{ all -> 0x0252 }
            r0.mo79928as(r5)     // Catch:{ all -> 0x0252 }
            byte[] r2 = r14.toByteArray()     // Catch:{ all -> 0x0252 }
            r0.mo79907X(r2)     // Catch:{ all -> 0x0252 }
            int r2 = r14.getSerializedSize()     // Catch:{ all -> 0x0252 }
            r0.mo79910aa(r2)     // Catch:{ all -> 0x0252 }
        L_0x01d2:
            int r2 = r14.f133266a     // Catch:{ all -> 0x0252 }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x01e0
            com.google.assistant.e.e.a.i r2 = r14.f133270e     // Catch:{ all -> 0x0252 }
            if (r2 != 0) goto L_0x01de
            com.google.assistant.e.e.a.i r2 = com.google.assistant.p3897e.p3910e.p3911a.C51194i.f133258e     // Catch:{ all -> 0x0252 }
        L_0x01de:
            com.google.protobuf.z r2 = r2.f133262c     // Catch:{ all -> 0x0252 }
        L_0x01e0:
            com.google.android.apps.gsa.assistant.shared.j r2 = new com.google.android.apps.gsa.assistant.shared.j     // Catch:{ all -> 0x0252 }
            r2.<init>()     // Catch:{ all -> 0x0252 }
            com.google.android.apps.gsa.search.core.p.ag r4 = r0.f233168a     // Catch:{ all -> 0x0252 }
            r4.mo79832b(r2)     // Catch:{ all -> 0x0252 }
            com.google.bb.a.pb r2 = r14.f133267b     // Catch:{ all -> 0x0252 }
            if (r2 != 0) goto L_0x01f0
            com.google.bb.a.pb r2 = com.google.p4152bb.p4153a.C55349pb.f145830g     // Catch:{ all -> 0x0252 }
        L_0x01f0:
            com.google.protobuf.cq r2 = r2.f145835d     // Catch:{ all -> 0x0252 }
            int r2 = r2.size()     // Catch:{ all -> 0x0252 }
            if (r2 <= 0) goto L_0x0212
            com.google.bb.a.pb r2 = r14.f133267b     // Catch:{ all -> 0x0252 }
            if (r2 != 0) goto L_0x01fe
            com.google.bb.a.pb r2 = com.google.p4152bb.p4153a.C55349pb.f145830g     // Catch:{ all -> 0x0252 }
        L_0x01fe:
            r7 = r2
            java.lang.String r9 = r14.f133271f     // Catch:{ all -> 0x0252 }
            com.google.assistant.e.j.ex r2 = r14.f133273h     // Catch:{ all -> 0x0252 }
            if (r2 != 0) goto L_0x0207
            com.google.assistant.e.j.ex r2 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b     // Catch:{ all -> 0x0252 }
        L_0x0207:
            r12 = r2
            r8 = 0
            r10 = 0
            com.google.android.apps.gsa.search.shared.actions.ActionData r2 = com.google.android.apps.gsa.search.shared.actions.ActionData.m141431u(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0252 }
            r0.mo79912ac(r2)     // Catch:{ all -> 0x0252 }
            goto L_0x0217
        L_0x0212:
            com.google.android.apps.gsa.search.shared.actions.ActionData r2 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b     // Catch:{ all -> 0x0252 }
            r0.mo79912ac(r2)     // Catch:{ all -> 0x0252 }
        L_0x0217:
            r0 = 1
        L_0x0218:
            java.lang.Object r2 = r13.f233040z     // Catch:{ all -> 0x0252 }
            monitor-enter(r2)     // Catch:{ all -> 0x0252 }
            boolean r4 = r14.f133274i     // Catch:{ all -> 0x024c }
            r13.f233039y = r4     // Catch:{ all -> 0x024c }
            monitor-exit(r2)     // Catch:{ all -> 0x024c }
            java.lang.String r2 = r13.f233035u     // Catch:{ all -> 0x0252 }
            if (r2 == 0) goto L_0x0237
            if (r0 == 0) goto L_0x024a
            r13.f233013A = r3     // Catch:{ all -> 0x0252 }
            boolean r14 = r13.m138731Q()     // Catch:{ all -> 0x0252 }
            if (r14 == 0) goto L_0x024a
            boolean r14 = r13.f233014B     // Catch:{ all -> 0x0252 }
            if (r14 == 0) goto L_0x024a
            r13.mo79858K(r6)     // Catch:{ all -> 0x0252 }
            monitor-exit(r13)
            return
        L_0x0237:
            if (r1 == 0) goto L_0x0240
            boolean r14 = r14.f133274i     // Catch:{ all -> 0x0252 }
            r13.m138729O(r1, r14)     // Catch:{ all -> 0x0252 }
            monitor-exit(r13)
            return
        L_0x0240:
            if (r0 == 0) goto L_0x024a
            r13.mo79859L()     // Catch:{ all -> 0x0252 }
            r13.mo79858K(r6)     // Catch:{ all -> 0x0252 }
            monitor-exit(r13)
            return
        L_0x024a:
            monitor-exit(r13)
            return
        L_0x024c:
            r14 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x024c }
            throw r14     // Catch:{ all -> 0x0252 }
        L_0x024f:
            r14 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x024f }
            throw r14     // Catch:{ all -> 0x0252 }
        L_0x0252:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6816p.C86227bj.mo79850C(com.google.assistant.e.e.a.j):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        return;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo79851D(com.google.assistant.p3897e.p3910e.p3911a.C51197l r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.f233035u     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = r5.f133286b     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x000e
            goto L_0x004e
        L_0x000e:
            com.google.protobuf.z r0 = r5.f133287c     // Catch:{ ct -> 0x0020 }
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0020 }
            com.google.speech.h.av r2 = com.google.speech.p5208h.C66565av.f181061f     // Catch:{ ct -> 0x0020 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0020 }
            com.google.speech.h.av r0 = (com.google.speech.p5208h.C66565av) r0     // Catch:{ ct -> 0x0020 }
            r4.mo79854G(r0)     // Catch:{ ct -> 0x0020 }
            goto L_0x0035
        L_0x0020:
            r0 = move-exception
            com.google.common.f.e r1 = f233012c     // Catch:{ all -> 0x0064 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0064 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = "Velvet.S3FetchTask"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "Parsing AssistantStreamChunk to PinholeOutput failed"
            r3 = 7764(0x1e54, float:1.088E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0064 }
        L_0x0035:
            boolean r5 = r5.f133288d     // Catch:{ all -> 0x0064 }
            if (r5 == 0) goto L_0x004c
            r5 = 1
            r4.f233036v = r5     // Catch:{ all -> 0x0064 }
            boolean r5 = r4.m138731Q()     // Catch:{ all -> 0x0064 }
            if (r5 == 0) goto L_0x004c
            boolean r5 = r4.f233014B     // Catch:{ all -> 0x0064 }
            if (r5 == 0) goto L_0x004c
            r5 = 0
            r4.mo79858K(r5)     // Catch:{ all -> 0x0064 }
            monitor-exit(r4)
            return
        L_0x004c:
            monitor-exit(r4)
            return
        L_0x004e:
            com.google.common.f.e r5 = f233012c     // Catch:{ all -> 0x0064 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0064 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "Velvet.S3FetchTask"
            r5.mo56378ag(r0, r1)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "AssistantStreamChunk's stream id is mismatched"
            r1 = 7763(0x1e53, float:1.0878E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0064 }
            monitor-exit(r4)
            return
        L_0x0064:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6816p.C86227bj.mo79851D(com.google.assistant.e.e.a.l):void");
    }

    /* renamed from: E */
    public final synchronized void mo79852E(C58170d dVar) {
        C58166b bVar = dVar.f155517b;
        if (bVar == null) {
            bVar = C58166b.f155509b;
        }
        if (bVar.f155511a.size() > 0) {
            C55348pa paVar = (C55348pa) C55349pb.f145830g.createBuilder();
            paVar.copyOnWrite();
            C55349pb pbVar = (C55349pb) paVar.instance;
            pbVar.f145832a |= 512;
            pbVar.f145837f = true;
            C58166b bVar2 = dVar.f155517b;
            if (bVar2 == null) {
                bVar2 = C58166b.f155509b;
            }
            C62971cq cqVar = bVar2.f155511a;
            paVar.copyOnWrite();
            C55349pb pbVar2 = (C55349pb) paVar.instance;
            pbVar2.mo54249a();
            C62947c.addAll((Iterable) cqVar, (List) pbVar2.f145835d);
            this.f233010k.mo79912ac(ActionData.m141431u((C55349pb) paVar.build(), (C58179b) null, (String) null, false, this.f233009j, (C52091ex) null));
        }
        this.f233010k.mo79913ad(dVar);
        mo79859L();
        mo79858K(false);
    }

    /* renamed from: F */
    public final synchronized void mo79853F(C54196m mVar) {
        C86269x xVar = this.f233016D;
        if (xVar == null) {
            C86246cb cbVar = this.f233010k;
            xVar = new C86269x(cbVar, (Query) C90918bo.m148516c(cbVar.mo79875K(), (Query) C90918bo.m148516c(cbVar.mo79865A(), Query.f252741b)), this.f233024g, this.f233009j);
        }
        xVar.mo79968a(mVar);
        if (mVar.f142237e) {
            mo79859L();
            mo79858K(false);
            xVar.f233207b.mo79936h();
            xVar.f233207b.mo79914ae();
        }
        this.f233016D = xVar;
    }

    /* renamed from: G */
    public final synchronized void mo79854G(C66565av avVar) {
        m138729O(avVar, false);
    }

    /* renamed from: H */
    public final void mo79855H(C90528t tVar) {
        C86199ai aiVar;
        C59104x c = f233012c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Velvet.S3FetchTask");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(tVar)).mo56372aa(7770)).mo56386p("Failed S3ResultPage");
        if (!mo79857J() && mo79842z(tVar)) {
            this.f233023f.mo79863b(tVar);
            synchronized (this) {
                aiVar = this.f233030p;
            }
            if (aiVar != null) {
                aiVar.mo78285g(tVar);
            }
        }
    }

    /* renamed from: I */
    public final boolean mo79856I() {
        return this.f233029o.get() == 2;
    }

    /* renamed from: J */
    public final boolean mo79857J() {
        int i = this.f233029o.get();
        return i == 1 || i == 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0019, code lost:
        r4 = f233012c.mo56226d();
        r4.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "Velvet.S3FetchTask");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(7768)).mo56386p("Chunk processing should not be complete before the fetch task is.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0041, code lost:
        r3.f233010k.mo79914ae();
        r4 = r3.f233017E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0048, code lost:
        if (r4 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004a, code lost:
        r4.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004d, code lost:
        r3.f233017E = r3.f233021d.mo85137b(r3.f233018F, 2000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        return;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79858K(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f233040z
            monitor-enter(r0)
            r1 = 1
            if (r4 == 0) goto L_0x0008
            r3.f233038x = r1     // Catch:{ all -> 0x005f }
        L_0x0008:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            boolean r4 = r3.mo79856I()
            if (r4 != 0) goto L_0x0031
            monitor-enter(r3)
            java.lang.String r4 = r3.f233035u     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x0018
            r3.f233014B = r1     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            return
        L_0x0018:
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            com.google.common.f.e r4 = f233012c
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "Velvet.S3FetchTask"
            r4.mo56378ag(r0, r2)
            java.lang.String r0 = "Chunk processing should not be complete before the fetch task is."
            r2 = 7768(0x1e58, float:1.0885E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r2)).mo56386p(r0)
            goto L_0x0031
        L_0x002e:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r4
        L_0x0031:
            java.lang.Object r4 = r3.f233040z
            monitor-enter(r4)
            boolean r0 = r3.f233039y     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x005a
            boolean r0 = r3.f233037w     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r3.f233038x     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x005a
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            com.google.android.apps.gsa.search.core.p.cb r4 = r3.f233010k
            r4.mo79914ae()
            com.google.common.util.concurrent.cx r4 = r3.f233017E
            if (r4 == 0) goto L_0x004d
            r4.cancel(r1)
        L_0x004d:
            com.google.android.apps.gsa.shared.util.c.ca r4 = r3.f233021d
            com.google.android.apps.gsa.shared.util.c.be r0 = r3.f233018F
            r1 = 2000(0x7d0, double:9.88E-321)
            com.google.common.util.concurrent.cx r4 = r4.mo85137b(r0, r1)
            r3.f233017E = r4
            return
        L_0x005a:
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6816p.C86227bj.mo79858K(boolean):void");
    }

    /* renamed from: L */
    public final void mo79859L() {
        C58976aa aaVar = C58975e.f156826a;
        this.f233010k.mo79936h();
        this.f233029o.compareAndSet(0, 2);
    }

    /* renamed from: M */
    public final void mo17709a(C89022at atVar) {
        synchronized (this) {
            this.f233032r = atVar;
        }
        m138728N();
    }

    /* renamed from: b */
    public final void mo79594b(Throwable th) {
        mo79858K(true);
    }

    /* renamed from: c */
    public final void mo79595c() {
        mo79859L();
    }

    /* renamed from: e */
    public final void mo79596e(String str) {
        C89033bd a = C89033bd.m144788a(str);
        synchronized (this) {
            C89033bd bdVar = this.f233034t;
            if (bdVar == null) {
                this.f233034t = a;
            } else {
                C58838bb.m90868c(bdVar.equals(a));
            }
        }
        m138728N();
    }

    /* renamed from: f */
    public final void mo79597f(String str) {
    }

    /* renamed from: g */
    public final void mo79598g(String str, C54229ar arVar) {
        C59104x d = f233012c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Velvet.S3FetchTask");
        ((C59052c) ((C59052c) d).mo56372aa(7769)).mo56386p("Received suggestions from S3, which is not expected");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("S3FetchTask");
        synchronized (this) {
            fVar.mo85279c("complete").mo85276a(C90752i.m148228b(Boolean.valueOf(mo79856I())));
            fVar.mo85279c("failed").mo85276a(C90752i.m148228b(Boolean.valueOf(m138730P())));
            fVar.mo85279c("SRP content type").mo85276a(C90752i.m148229c(String.valueOf(this.f233034t)));
            fVar.mo85279c("webpage created").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f233015C.get())));
        }
    }

    public final String toString() {
        boolean I = mo79856I();
        boolean P = m138730P();
        return "S3FetchTask{complete=" + I + ", failed=" + P + "}";
    }

    /* renamed from: z */
    public final boolean mo79842z(C90456c cVar) {
        C59104x c = f233012c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Velvet.S3FetchTask");
        ((C59052c) ((C59052c) c).mo56372aa(7772)).mo56389s("%s", cVar);
        C86246cb cbVar = this.f233010k;
        if (this.f233029o.compareAndSet(0, 1)) {
            cbVar.mo79840k(cVar);
            this.f233019a.mo79828a(false);
            return true;
        }
        if (!cbVar.mo79881Q()) {
            cbVar.mo79840k(cVar);
        }
        return false;
    }
}
