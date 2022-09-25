package com.google.android.libraries.search.assistant.p2825x.p2826a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34230am;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2688a.C34670c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34674a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34675b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34679f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.android.libraries.search.assistant.p2825x.C36785a;
import com.google.android.libraries.search.p3055n.p3078f.C39697b;
import com.google.android.libraries.search.p3055n.p3078f.p3079a.C39696e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.speech.p5218j.C66844bv;
import com.google.speech.p5218j.C66942fe;
import com.google.speech.p5218j.C66944fg;
import com.google.speech.p5218j.C66946fi;
import com.google.speech.p5218j.C66948fk;
import com.google.speech.p5218j.C66951fn;
import com.google.speech.p5218j.C66952fo;
import com.google.speech.p5218j.C67164nk;
import com.google.speech.p5218j.C67165nl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71546cw;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71574dx;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71594u;
import p3186j$.time.Duration;
import p5462h.C69685i;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.x.a.o */
/* compiled from: PG */
public final class C36808o implements C36785a {

    /* renamed from: a */
    public static final C59071e f95913a = C59071e.m91331h();

    /* renamed from: b */
    public static final Duration f95914b;

    /* renamed from: c */
    public final Context f95915c;

    /* renamed from: d */
    public final C36805l f95916d;

    /* renamed from: e */
    public final C71422aw f95917e;

    /* renamed from: f */
    public final boolean f95918f;

    /* renamed from: g */
    public C39697b f95919g;

    /* renamed from: h */
    public C34053bp f95920h;

    /* renamed from: i */
    public final Map f95921i = new LinkedHashMap();

    /* renamed from: j */
    public C34119a f95922j;

    /* renamed from: k */
    public C122549e f95923k;

    /* renamed from: l */
    public final C71548cy f95924l;

    /* renamed from: m */
    public final C71548cy f95925m;

    /* renamed from: n */
    public final C39696e f95926n;

    /* renamed from: o */
    private final Executor f95927o;

    /* renamed from: p */
    private final C47632e f95928p = new C47632e();

    /* renamed from: q */
    private final C71587n f95929q;

    /* renamed from: r */
    private final C34230am f95930r;

    /* renamed from: com.google.android.libraries.search.assistant.x.a.o$a */
    /* compiled from: PG */
    public interface C36809a {
        /* renamed from: J */
        C122472a mo40416J();

        /* renamed from: p */
        long mo40417p();
    }

    static {
        Duration ofSeconds = Duration.ofSeconds(60);
        C69664n.m101060f(ofSeconds, "ofSeconds(60)");
        f95914b = ofSeconds;
    }

    public C36808o(Context context, C39696e eVar, C36805l lVar, C71422aw awVar, Executor executor, C34230am amVar, boolean z) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(lVar, "quickPhrasesDebugDataProvider");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f95915c = context;
        this.f95926n = eVar;
        this.f95916d = lVar;
        this.f95917e = awVar;
        this.f95927o = executor;
        this.f95930r = amVar;
        this.f95918f = z;
        C71548cy b = C71574dx.m104480b(C34679f.UNKNOWN);
        this.f95924l = b;
        C66951fn fnVar = (C66951fn) C66952fo.f181998c.createBuilder();
        C69664n.m101060f(fnVar, "newBuilder()");
        C71548cy b2 = C71574dx.m104480b(new C69685i(C69664n.m101061g(fnVar, "builder").mo59753a(), C34037b.CLIENT_UNKNOWN));
        this.f95925m = b2;
        C36791ae aeVar = new C36791ae(C71546cw.m104399a(b, b2, new C36820z(this, (C69577g) null)));
        this.f95929q = aeVar;
        C71594u.m104517d(C71536cm.m104384b(aeVar, new C36806m(this, (C69577g) null)), awVar).mo62873s(C36807n.f95912a);
    }

    /* renamed from: j */
    public static final C34037b m65503j(C34119a aVar) {
        return aVar == null ? C34037b.CLIENT_UNKNOWN : aVar.f90869a;
    }

    /* renamed from: k */
    public static final List m65504k(C66952fo foVar) {
        C66948fk fkVar;
        C62971cq<C66844bv> cqVar = foVar.f182000a;
        C69664n.m101060f(cqVar, "configResponse.errorPhrasesList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C66844bv bvVar : cqVar) {
            C34674a aVar = (C34674a) C34675b.f92064d.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C69664n.m101061g(aVar, "builder");
            C66946fi fiVar = bvVar.f181762b;
            if (fiVar == null) {
                fiVar = C66946fi.f181970c;
            }
            if (fiVar.f181972a == 1) {
                fkVar = C66948fk.m97389a(((Integer) fiVar.f181973b).intValue());
                if (fkVar == null) {
                    fkVar = C66948fk.QP_UNKNOWN;
                }
            } else {
                fkVar = C66948fk.QP_UNKNOWN;
            }
            C69664n.m101060f(fkVar, "it.quickPhrase.quickPhraseType");
            C69664n.m101061g(fkVar, "value");
            aVar.copyOnWrite();
            C34675b bVar = (C34675b) aVar.instance;
            bVar.f92067b = fkVar.f181990o;
            bVar.f92066a |= 1;
            C66942fe a = C66942fe.m97387a(bvVar.f181763c);
            if (a == null) {
                a = C66942fe.CONFIG_ERROR_UNKNOWN;
            }
            C69664n.m101060f(a, "it.configError");
            C69664n.m101061g(a, "value");
            aVar.copyOnWrite();
            C34675b bVar2 = (C34675b) aVar.instance;
            bVar2.f92068c = a.f181962g;
            bVar2.f92066a |= 2;
            C62942bv build = aVar.build();
            C69664n.m101060f(build, "_builder.build()");
            arrayList.add((C34675b) build);
        }
        return arrayList;
    }

    /* renamed from: l */
    public static final List m65505l(C66952fo foVar) {
        C66948fk fkVar;
        C62971cq<C66946fi> cqVar = foVar.f182001b;
        C69664n.m101060f(cqVar, "configResponse.successPhrasesList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C66946fi fiVar : cqVar) {
            if (fiVar.f181972a == 1) {
                fkVar = C66948fk.m97389a(((Integer) fiVar.f181973b).intValue());
                if (fkVar == null) {
                    fkVar = C66948fk.QP_UNKNOWN;
                }
            } else {
                fkVar = C66948fk.QP_UNKNOWN;
            }
            arrayList.add(fkVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C71587n mo40398a(C34053bp bpVar) {
        C69664n.m101061g(bpVar, "invocationToken");
        C36805l lVar = this.f95916d;
        C69664n.m101061g(bpVar, "invocationToken");
        Duration ofMillis = Duration.ofMillis(lVar.f95904b.mo26871c());
        C69664n.m101060f(ofMillis, "ofMillis(clock.elapsedRealtime())");
        C71803m.m105042c(lVar.f95905c, (C69585o) null, (C71424ay) null, new C36799f(lVar, new C36795b(bpVar, ofMillis), (C69577g) null), 3).mo62873s(C36800g.f95888a);
        C59052c cVar = (C59052c) f95913a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "QuickPhrases.Manager");
        C61301b a = C34711b.m63445a(bpVar);
        cVar.mo56379ah(new C59094n(52364));
        cVar.mo56389s("Requesting QP events for invocation token %s.", a);
        return C71477ah.m104295b(new C71552db(new C36812r(this, bpVar, (C69577g) null)), new C36813s(this, bpVar, (C69577g) null));
    }

    /* renamed from: b */
    public final C71587n mo40399b() {
        return this.f95929q;
    }

    /* renamed from: c */
    public final void mo40400c(C34670c cVar, C34119a aVar) {
        C69664n.m101061g(cVar, "configuration");
        C59052c cVar2 = (C59052c) f95913a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "QuickPhrases.Manager");
        Boolean valueOf = Boolean.valueOf(cVar.f92059d);
        cVar2.mo56379ah(new C59094n(52366));
        cVar2.mo56389s("onConfigurationUpdate called with keepQuickphrasesRunning %s, updating SODA QP configuration.", valueOf);
        C46459k.m82829b(mo40410d(new C36816v(cVar, this, aVar, (C69577g) null)), "onConfigurationUpdate has failed.", new Object[0]);
    }

    /* renamed from: d */
    public final C60870cx mo40410d(C69626l lVar) {
        C60870cx b = this.f95928p.mo51512b(new C36793ag(this, lVar), this.f95927o);
        C69664n.m101060f(b, "private fun <T> withSequ…} }, lightweightExecutor)");
        return b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.google.speech.j.fg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.speech.j.fg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.speech.j.fg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: com.google.speech.j.fg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0229 A[SYNTHETIC, Splitter:B:73:0x0229] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022e A[Catch:{ all -> 0x0281 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40411e(com.google.speech.p5218j.C66944fg r22, p5462h.p5466c.C69577g r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            java.lang.String r3 = "value"
            java.lang.String r4 = "_builder.build()"
            java.lang.String r5 = "builder"
            java.lang.String r6 = "newBuilder()"
            boolean r7 = r2 instanceof com.google.android.libraries.search.assistant.p2825x.p2826a.C36817w
            if (r7 == 0) goto L_0x0021
            r7 = r2
            com.google.android.libraries.search.assistant.x.a.w r7 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36817w) r7
            int r8 = r7.f95957g
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L_0x0021
            int r8 = r8 - r9
            r7.f95957g = r8
            goto L_0x0026
        L_0x0021:
            com.google.android.libraries.search.assistant.x.a.w r7 = new com.google.android.libraries.search.assistant.x.a.w
            r7.<init>(r1, r2)
        L_0x0026:
            java.lang.Object r2 = r7.f95955e
            h.c.a.a r8 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r9 = r7.f95957g
            java.lang.String r11 = "it.quickPhrase.quickPhraseType"
            r13 = 2
            java.lang.String r14 = "QuickPhrases.Manager"
            java.lang.String r15 = "quickPhraseEvent.triggeredQuickPhraseList"
            r10 = 1
            if (r9 == 0) goto L_0x0065
            if (r9 == r10) goto L_0x004c
            if (r9 != r13) goto L_0x0044
            java.lang.Object r0 = r7.f95952b
            java.lang.Object r3 = r7.f95951a
            p5462h.C69714l.m101134b(r2)
            r8 = r1
            goto L_0x0372
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004c:
            java.lang.Object r0 = r7.f95954d
            java.lang.Object r3 = r7.f95953c
            java.lang.Object r4 = r7.f95952b
            java.lang.Object r5 = r7.f95951a
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x0060 }
            r9 = r8
            r17 = r14
            r8 = r1
            r1 = r2
            r2 = r0
            r0 = r4
            goto L_0x020b
        L_0x0060:
            r0 = move-exception
            r8 = r1
            r10 = r14
            goto L_0x028f
        L_0x0065:
            p5462h.C69714l.m101134b(r2)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r1.f95920h
            if (r2 != 0) goto L_0x02d8
            com.google.protobuf.cq r2 = r0.f181967b
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r15)
            boolean r9 = r2 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0080
            boolean r9 = r2.isEmpty()
            if (r9 != 0) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            r8 = r1
            r10 = r14
            goto L_0x02b8
        L_0x0080:
            java.util.Iterator r2 = r2.iterator()
        L_0x0084:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x007c
            java.lang.Object r9 = r2.next()
            com.google.speech.j.nl r9 = (com.google.speech.p5218j.C67165nl) r9
            com.google.speech.j.fi r9 = r9.f182563c
            if (r9 != 0) goto L_0x0096
            com.google.speech.j.fi r9 = com.google.speech.p5218j.C66946fi.f181970c
        L_0x0096:
            int r9 = r9.f181972a
            if (r9 != r10) goto L_0x02b5
            h.f.b.ae r2 = new h.f.b.ae
            r2.<init>()
            com.google.android.libraries.search.assistant.invocation.o.f.a.am r9 = r1.f95930r     // Catch:{ all -> 0x0060 }
            com.google.android.libraries.search.assistant.invocation.o.i.d r16 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d.f92090g     // Catch:{ all -> 0x0060 }
            com.google.protobuf.bn r16 = r16.createBuilder()     // Catch:{ all -> 0x0060 }
            r12 = r16
            com.google.android.libraries.search.assistant.invocation.o.i.c r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34666c) r12     // Catch:{ all -> 0x0060 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r6)     // Catch:{ all -> 0x0060 }
            com.google.android.libraries.search.assistant.invocation.o.i.k r12 = p5462h.p5473f.p5475b.C69664n.m101061g(r12, "builder")     // Catch:{ all -> 0x0060 }
            com.google.android.libraries.search.assistant.invocation.o.a.bf r13 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf.ENTRYPOINT_QUICK_PHRASE     // Catch:{ all -> 0x0060 }
            r12.mo39467b(r13)     // Catch:{ all -> 0x0060 }
            com.google.android.libraries.search.assistant.invocation.o.a.ba r13 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba.f90707h     // Catch:{ all -> 0x0060 }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ all -> 0x0060 }
            com.google.android.libraries.search.assistant.invocation.o.a.az r13 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34036az) r13     // Catch:{ all -> 0x0060 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r6)     // Catch:{ all -> 0x0060 }
            com.google.android.libraries.search.assistant.invocation.o.a.bh r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")     // Catch:{ all -> 0x0060 }
            com.google.android.libraries.search.n.bu r17 = com.google.android.libraries.search.p3055n.C39372bu.f103683c     // Catch:{ all -> 0x0060 }
            com.google.protobuf.bn r17 = r17.createBuilder()     // Catch:{ all -> 0x0060 }
            r10 = r17
            com.google.android.libraries.search.n.bt r10 = (com.google.android.libraries.search.p3055n.C39371bt) r10     // Catch:{ all -> 0x0060 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r6)     // Catch:{ all -> 0x0060 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r5)     // Catch:{ all -> 0x0060 }
            r17 = r14
            com.google.protobuf.a.b r14 = new com.google.protobuf.a.b     // Catch:{ all -> 0x028c }
            r18 = r8
            com.google.protobuf.bv r8 = r10.instance     // Catch:{ all -> 0x028c }
            com.google.android.libraries.search.n.bu r8 = (com.google.android.libraries.search.p3055n.C39372bu) r8     // Catch:{ all -> 0x028c }
            r19 = r2
            com.google.protobuf.cj r2 = new com.google.protobuf.cj     // Catch:{ all -> 0x028c }
            com.google.protobuf.ch r8 = r8.f103685a     // Catch:{ all -> 0x028c }
            com.google.protobuf.ci r1 = com.google.android.libraries.search.p3055n.C39372bu.f103682b     // Catch:{ all -> 0x0288 }
            r2.<init>(r8, r1)     // Catch:{ all -> 0x0288 }
            r14.<init>(r2)     // Catch:{ all -> 0x0288 }
            com.google.protobuf.cq r1 = r0.f181967b     // Catch:{ all -> 0x0288 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r15)     // Catch:{ all -> 0x0288 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0288 }
            r8 = 10
            int r14 = p5462h.p5463a.C69540x.m100804k(r1, r8)     // Catch:{ all -> 0x0288 }
            r2.<init>(r14)     // Catch:{ all -> 0x0288 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0288 }
        L_0x0102:
            boolean r8 = r1.hasNext()     // Catch:{ all -> 0x0288 }
            if (r8 == 0) goto L_0x0137
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x0288 }
            com.google.speech.j.nl r8 = (com.google.speech.p5218j.C67165nl) r8     // Catch:{ all -> 0x0288 }
            com.google.speech.j.fi r8 = r8.f182563c     // Catch:{ all -> 0x0288 }
            if (r8 != 0) goto L_0x0114
            com.google.speech.j.fi r8 = com.google.speech.p5218j.C66946fi.f181970c     // Catch:{ all -> 0x0288 }
        L_0x0114:
            int r14 = r8.f181972a     // Catch:{ all -> 0x0288 }
            r20 = r1
            r1 = 1
            if (r14 != r1) goto L_0x012c
            java.lang.Object r1 = r8.f181973b     // Catch:{ all -> 0x0288 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0288 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0288 }
            com.google.speech.j.fk r1 = com.google.speech.p5218j.C66948fk.m97389a(r1)     // Catch:{ all -> 0x0288 }
            if (r1 != 0) goto L_0x012e
            com.google.speech.j.fk r1 = com.google.speech.p5218j.C66948fk.QP_UNKNOWN     // Catch:{ all -> 0x0288 }
            goto L_0x012e
        L_0x012c:
            com.google.speech.j.fk r1 = com.google.speech.p5218j.C66948fk.QP_UNKNOWN     // Catch:{ all -> 0x0288 }
        L_0x012e:
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r11)     // Catch:{ all -> 0x0288 }
            r2.add(r1)     // Catch:{ all -> 0x0288 }
            r1 = r20
            goto L_0x0102
        L_0x0137:
            r10.copyOnWrite()     // Catch:{ all -> 0x0288 }
            com.google.protobuf.bv r1 = r10.instance     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.n.bu r1 = (com.google.android.libraries.search.p3055n.C39372bu) r1     // Catch:{ all -> 0x0288 }
            com.google.protobuf.ch r8 = r1.f103685a     // Catch:{ all -> 0x0288 }
            boolean r14 = r8.mo58948c()     // Catch:{ all -> 0x0288 }
            if (r14 != 0) goto L_0x014c
            com.google.protobuf.ch r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r8)     // Catch:{ all -> 0x0288 }
            r1.f103685a = r8     // Catch:{ all -> 0x0288 }
        L_0x014c:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0288 }
        L_0x0150:
            boolean r8 = r2.hasNext()     // Catch:{ all -> 0x0288 }
            if (r8 == 0) goto L_0x0164
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0288 }
            com.google.speech.j.fk r8 = (com.google.speech.p5218j.C66948fk) r8     // Catch:{ all -> 0x0288 }
            com.google.protobuf.ch r14 = r1.f103685a     // Catch:{ all -> 0x0288 }
            int r8 = r8.f181990o     // Catch:{ all -> 0x0288 }
            r14.mo58916g(r8)     // Catch:{ all -> 0x0288 }
            goto L_0x0150
        L_0x0164:
            com.google.protobuf.bv r1 = r10.build()     // Catch:{ all -> 0x0288 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.n.bu r1 = (com.google.android.libraries.search.p3055n.C39372bu) r1     // Catch:{ all -> 0x0288 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.a.az r2 = r13.f90745a     // Catch:{ all -> 0x0288 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0288 }
            com.google.protobuf.bv r2 = r2.instance     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.a.ba r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba) r2     // Catch:{ all -> 0x0288 }
            r1.getClass()     // Catch:{ all -> 0x0288 }
            r2.f90715g = r1     // Catch:{ all -> 0x0288 }
            int r1 = r2.f90709a     // Catch:{ all -> 0x0288 }
            r1 = r1 | 32
            r2.f90709a = r1     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.a.ba r1 = r13.mo39195a()     // Catch:{ all -> 0x0288 }
            r12.mo39469d(r1)     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.i.b r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34660b.f92032d     // Catch:{ all -> 0x0288 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.i.a r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34454a) r1     // Catch:{ all -> 0x0288 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)     // Catch:{ all -> 0x0288 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r5)     // Catch:{ all -> 0x0288 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0288 }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.i.b r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34660b) r2     // Catch:{ all -> 0x0288 }
            int r5 = r2.f92034a     // Catch:{ all -> 0x0288 }
            r6 = 1
            r5 = r5 | r6
            r2.f92034a = r5     // Catch:{ all -> 0x0288 }
            r2.f92035b = r6     // Catch:{ all -> 0x0288 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0288 }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.i.b r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34660b) r2     // Catch:{ all -> 0x0288 }
            int r5 = r2.f92034a     // Catch:{ all -> 0x0288 }
            r6 = 2
            r5 = r5 | r6
            r2.f92034a = r5     // Catch:{ all -> 0x0288 }
            r5 = 1
            r2.f92036c = r5     // Catch:{ all -> 0x0288 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x0288 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.i.b r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34660b) r1     // Catch:{ all -> 0x0288 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.i.c r2 = r12.f92119a     // Catch:{ all -> 0x0288 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0288 }
            com.google.protobuf.bv r2 = r2.instance     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.i.d r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d) r2     // Catch:{ all -> 0x0288 }
            r1.getClass()     // Catch:{ all -> 0x0288 }
            r2.f92097f = r1     // Catch:{ all -> 0x0288 }
            int r1 = r2.f92092a     // Catch:{ all -> 0x0288 }
            r1 = r1 | 16
            r2.f92092a = r1     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.i.c r1 = r12.f92119a     // Catch:{ all -> 0x0288 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0288 }
            com.google.protobuf.bv r1 = r1.instance     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.i.d r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d) r1     // Catch:{ all -> 0x0288 }
            int r2 = r1.f92092a     // Catch:{ all -> 0x0288 }
            r2 = r2 | 4
            r1.f92092a = r2     // Catch:{ all -> 0x0288 }
            r2 = 1
            r1.f92095d = r2     // Catch:{ all -> 0x0288 }
            com.google.android.libraries.search.assistant.invocation.o.i.d r1 = r12.mo39466a()     // Catch:{ all -> 0x0288 }
            com.google.common.util.concurrent.cx r1 = r9.mo39276a(r1)     // Catch:{ all -> 0x0288 }
            r8 = r21
            r7.f95951a = r8     // Catch:{ all -> 0x0283 }
            r7.f95952b = r0     // Catch:{ all -> 0x0283 }
            r2 = r19
            r7.f95953c = r2     // Catch:{ all -> 0x0283 }
            r7.f95954d = r2     // Catch:{ all -> 0x0283 }
            r3 = 1
            r7.f95957g = r3     // Catch:{ all -> 0x0283 }
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r7)     // Catch:{ all -> 0x0283 }
            r9 = r18
            if (r1 == r9) goto L_0x0287
            r3 = r2
            r5 = r8
        L_0x020b:
            h.f.b.ae r2 = (p5462h.p5473f.p5475b.C69648ae) r2     // Catch:{ all -> 0x0283 }
            r2.f186027a = r1     // Catch:{ all -> 0x0283 }
            com.google.common.f.e r1 = f95913a     // Catch:{ all -> 0x0283 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0283 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0283 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0283 }
            r10 = r17
            r1.mo56378ag(r2, r10)     // Catch:{ all -> 0x0281 }
            java.lang.String r2 = "Starting new invocation with token %s."
            r4 = r3
            h.f.b.ae r4 = (p5462h.p5473f.p5475b.C69648ae) r4     // Catch:{ all -> 0x0281 }
            java.lang.Object r4 = r4.f186027a     // Catch:{ all -> 0x0281 }
            java.lang.String r6 = "invocationToken"
            if (r4 != 0) goto L_0x022e
            p5462h.p5473f.p5475b.C69664n.m101065k(r6)     // Catch:{ all -> 0x0281 }
            r4 = 0
            goto L_0x0230
        L_0x022e:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r4     // Catch:{ all -> 0x0281 }
        L_0x0230:
            com.google.frameworks.client.a.a.b r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r4)     // Catch:{ all -> 0x0281 }
            com.google.common.f.n r12 = new com.google.common.f.n     // Catch:{ all -> 0x0281 }
            r13 = 52359(0xcc87, float:7.337E-41)
            r12.<init>(r13)     // Catch:{ all -> 0x0281 }
            r1.mo56379ah(r12)     // Catch:{ all -> 0x0281 }
            r1.mo56389s(r2, r4)     // Catch:{ all -> 0x0281 }
            h.f.b.ae r3 = (p5462h.p5473f.p5475b.C69648ae) r3
            java.lang.Object r1 = r3.f186027a
            if (r1 != 0) goto L_0x024d
            p5462h.p5473f.p5475b.C69664n.m101065k(r6)
            r1 = 0
            goto L_0x024f
        L_0x024d:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r1
        L_0x024f:
            r2 = r5
            com.google.android.libraries.search.assistant.x.a.o r2 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o) r2
            r2.f95920h = r1
            java.util.Map r1 = r2.f95921i
            java.lang.Object r4 = r3.f186027a
            if (r4 != 0) goto L_0x025f
            p5462h.p5473f.p5475b.C69664n.m101065k(r6)
            r4 = 0
            goto L_0x0261
        L_0x025f:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r4
        L_0x0261:
            r6 = 0
            kotlinx.coroutines.a.t r12 = kotlinx.coroutines.p5573a.C71387t.DROP_OLDEST
            r13 = 20
            kotlinx.coroutines.b.cx r6 = kotlinx.coroutines.p5574b.C71557dg.m104445c(r13, r6, r12)
            r1.put(r4, r6)
            kotlinx.coroutines.aw r1 = r2.f95917e
            com.google.android.libraries.search.assistant.x.a.y r4 = new com.google.android.libraries.search.assistant.x.a.y
            r6 = 0
            r4.<init>(r2, r3, r6)
            r2 = 3
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r1, r6, r6, r4, r2)
            com.google.android.libraries.search.assistant.x.a.x r2 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36818x.f95958a
            r1.mo62873s(r2)
            r3 = r5
            goto L_0x02dc
        L_0x0281:
            r0 = move-exception
            goto L_0x028f
        L_0x0283:
            r0 = move-exception
        L_0x0284:
            r10 = r17
            goto L_0x028f
        L_0x0287:
            return r9
        L_0x0288:
            r0 = move-exception
            r8 = r21
            goto L_0x0284
        L_0x028c:
            r0 = move-exception
            r8 = r1
            goto L_0x0284
        L_0x028f:
            com.google.common.f.e r1 = f95913a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r10)
            com.google.common.f.x r0 = r1.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 52360(0xcc88, float:7.3372E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Invocation failed."
            r0.mo56386p(r1)
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x02b5:
            r9 = r8
            goto L_0x0084
        L_0x02b8:
            com.google.common.f.e r0 = f95913a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r10)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 52361(0xcc89, float:7.3373E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Initial QP event has no triggered QP Types. This should not happen."
            r0.mo56386p(r1)
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x02d8:
            r9 = r8
            r10 = r14
            r8 = r1
            r3 = r8
        L_0x02dc:
            com.google.common.f.e r1 = f95913a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r10)
            r2 = r3
            com.google.android.libraries.search.assistant.x.a.o r2 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o) r2
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = r2.f95920h
            if (r4 == 0) goto L_0x02f5
            com.google.frameworks.client.a.a.b r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r4)
            goto L_0x02f6
        L_0x02f5:
            r4 = 0
        L_0x02f6:
            r5 = r0
            com.google.speech.j.fg r5 = (com.google.speech.p5218j.C66944fg) r5
            com.google.protobuf.cq r5 = r5.f181967b
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r15)
            java.util.ArrayList r6 = new java.util.ArrayList
            r10 = 10
            int r12 = p5462h.p5463a.C69540x.m100804k(r5, r10)
            r6.<init>(r12)
            java.util.Iterator r5 = r5.iterator()
        L_0x030d:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x033e
            java.lang.Object r10 = r5.next()
            com.google.speech.j.nl r10 = (com.google.speech.p5218j.C67165nl) r10
            com.google.speech.j.fi r10 = r10.f182563c
            if (r10 != 0) goto L_0x031f
            com.google.speech.j.fi r10 = com.google.speech.p5218j.C66946fi.f181970c
        L_0x031f:
            int r12 = r10.f181972a
            r13 = 1
            if (r12 != r13) goto L_0x0335
            java.lang.Object r10 = r10.f181973b
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            com.google.speech.j.fk r10 = com.google.speech.p5218j.C66948fk.m97389a(r10)
            if (r10 != 0) goto L_0x0337
            com.google.speech.j.fk r10 = com.google.speech.p5218j.C66948fk.QP_UNKNOWN
            goto L_0x0337
        L_0x0335:
            com.google.speech.j.fk r10 = com.google.speech.p5218j.C66948fk.QP_UNKNOWN
        L_0x0337:
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            r6.add(r10)
            goto L_0x030d
        L_0x033e:
            java.lang.String r5 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36794ah.m65482b(r6)
            com.google.common.f.n r6 = new com.google.common.f.n
            r10 = 52358(0xcc86, float:7.3369E-41)
            r6.<init>(r10)
            r1.mo56379ah(r6)
            java.lang.String r6 = "Emitting QP event for invocation token %s and QuickPhrases%s."
            r1.mo56354G(r6, r4, r5)
            java.util.Map r1 = r2.f95921i
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r2.f95920h
            if (r2 == 0) goto L_0x0408
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x0400
            kotlinx.coroutines.b.cx r1 = (kotlinx.coroutines.p5574b.C71547cx) r1
            r7.f95951a = r3
            r7.f95952b = r0
            r2 = 0
            r7.f95953c = r2
            r7.f95954d = r2
            r2 = 2
            r7.f95957g = r2
            java.lang.Object r1 = r1.mo20883a(r0, r7)
            if (r1 == r9) goto L_0x03ff
        L_0x0372:
            com.google.android.libraries.search.assistant.x.a.o r3 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o) r3
            com.google.android.libraries.search.assistant.x.a.l r1 = r3.f95916d
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r3.f95920h
            if (r2 == 0) goto L_0x03f7
            java.lang.String r4 = "quickPhraseEvent"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r4)
            com.google.speech.j.fg r0 = (com.google.speech.p5218j.C66944fg) r0
            com.google.protobuf.cq r4 = r0.f181967b
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r15)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = p5462h.p5463a.C69540x.m100804k(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x0395:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x03c6
            java.lang.Object r6 = r4.next()
            com.google.speech.j.nl r6 = (com.google.speech.p5218j.C67165nl) r6
            com.google.speech.j.fi r6 = r6.f182563c
            if (r6 != 0) goto L_0x03a7
            com.google.speech.j.fi r6 = com.google.speech.p5218j.C66946fi.f181970c
        L_0x03a7:
            int r7 = r6.f181972a
            r9 = 1
            if (r7 != r9) goto L_0x03bd
            java.lang.Object r6 = r6.f181973b
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.google.speech.j.fk r6 = com.google.speech.p5218j.C66948fk.m97389a(r6)
            if (r6 != 0) goto L_0x03bf
            com.google.speech.j.fk r6 = com.google.speech.p5218j.C66948fk.QP_UNKNOWN
            goto L_0x03bf
        L_0x03bd:
            com.google.speech.j.fk r6 = com.google.speech.p5218j.C66948fk.QP_UNKNOWN
        L_0x03bf:
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r11)
            r5.add(r6)
            goto L_0x0395
        L_0x03c6:
            com.google.android.libraries.f.a r4 = r1.f95904b
            long r6 = r4.mo26871c()
            j$.time.Duration r4 = p3186j$.time.Duration.ofMillis(r6)
            java.lang.String r6 = "ofMillis(clock.elapsedRealtime())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            com.google.android.libraries.search.assistant.x.a.c r6 = new com.google.android.libraries.search.assistant.x.a.c
            r6.<init>(r2, r5, r4)
            kotlinx.coroutines.aw r2 = r1.f95905c
            com.google.android.libraries.search.assistant.x.a.j r4 = new com.google.android.libraries.search.assistant.x.a.j
            r5 = 0
            r4.<init>(r1, r6, r5)
            r1 = 3
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r2, r5, r5, r4, r1)
            com.google.android.libraries.search.assistant.x.a.k r2 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36804k.f95902a
            r1.mo62873s(r2)
            boolean r0 = r3.mo40415i(r0)
            if (r0 == 0) goto L_0x03f4
            r3.f95920h = r5
        L_0x03f4:
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x03f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        L_0x03ff:
            return r9
        L_0x0400:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Flow for active invocation was deleted."
            r0.<init>(r1)
            throw r0
        L_0x0408:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "activeInvocationToken is null when it shouldn't be."
            r0.<init>(r1)
            goto L_0x0411
        L_0x0410:
            throw r0
        L_0x0411:
            goto L_0x0410
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.mo40411e(com.google.speech.j.fg, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40412f(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.assistant.p2825x.p2826a.C36788ab
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.assistant.x.a.ab r0 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36788ab) r0
            int r1 = r0.f95860e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f95860e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.x.a.ab r0 = new com.google.android.libraries.search.assistant.x.a.ab
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f95858c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f95860e
            java.lang.String r3 = "QuickPhrases.Manager"
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r7 = r0.f95857b
            java.lang.Object r0 = r0.f95856a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002d }
            goto L_0x0064
        L_0x002d:
            r8 = move-exception
            goto L_0x0089
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.n.f.b r8 = r6.f95919g     // Catch:{ all -> 0x0087 }
            if (r8 == 0) goto L_0x0068
            r2 = r8
            com.google.android.libraries.search.n.f.a.d r2 = (com.google.android.libraries.search.p3055n.p3078f.p3079a.C39695d) r2     // Catch:{ all -> 0x0087 }
            com.google.android.libraries.search.n.f.b.a r2 = r2.f104469a     // Catch:{ all -> 0x0087 }
            p3186j$.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0087 }
            com.google.android.libraries.search.n.f.a.a r5 = new com.google.android.libraries.search.n.f.a.a     // Catch:{ all -> 0x0087 }
            r5.<init>(r2)     // Catch:{ all -> 0x0087 }
            com.google.android.libraries.search.n.f.a.d r8 = (com.google.android.libraries.search.p3055n.p3078f.p3079a.C39695d) r8     // Catch:{ all -> 0x0087 }
            java.util.concurrent.Executor r8 = r8.f104470b     // Catch:{ all -> 0x0087 }
            com.google.common.util.concurrent.r r2 = com.google.apps.tiktok.tracing.C47810es.m84965e(r5)     // Catch:{ all -> 0x0087 }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92905n(r2, r8)     // Catch:{ all -> 0x0087 }
            r0.f95856a = r6     // Catch:{ all -> 0x0087 }
            r0.f95857b = r7     // Catch:{ all -> 0x0087 }
            r0.f95860e = r4     // Catch:{ all -> 0x0087 }
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)     // Catch:{ all -> 0x0087 }
            if (r8 == r1) goto L_0x0067
            r0 = r6
        L_0x0064:
            java.lang.Void r8 = (java.lang.Void) r8     // Catch:{ all -> 0x002d }
            goto L_0x0069
        L_0x0067:
            return r1
        L_0x0068:
            r0 = r6
        L_0x0069:
            com.google.common.f.e r8 = f95913a     // Catch:{ all -> 0x002d }
            com.google.common.f.x r8 = r8.mo56224b()     // Catch:{ all -> 0x002d }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x002d }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x002d }
            r8.mo56378ag(r1, r3)     // Catch:{ all -> 0x002d }
            java.lang.String r1 = "SodaQuickPhrasesFrontend shut down successfully."
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x002d }
            r4 = 52362(0xcc8a, float:7.3375E-41)
            r2.<init>(r4)     // Catch:{ all -> 0x002d }
            r8.mo56379ah(r2)     // Catch:{ all -> 0x002d }
            r8.mo56386p(r1)     // Catch:{ all -> 0x002d }
            goto L_0x00ac
        L_0x0087:
            r8 = move-exception
            r0 = r6
        L_0x0089:
            com.google.common.f.e r1 = f95913a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r3)
            com.google.common.f.x r8 = r1.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 52363(0xcc8b, float:7.3376E-41)
            r1.<init>(r2)
            r8.mo56379ah(r1)
            java.lang.String r1 = "Error on calling SodaQuickPhrasesFrontend.shutdown()."
            r8.mo56386p(r1)
        L_0x00ac:
            com.google.android.libraries.search.assistant.x.a.o r0 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o) r0
            kotlinx.coroutines.b.cy r8 = r0.f95924l
        L_0x00b0:
            java.lang.Object r1 = r8.mo62784e()
            r2 = r1
            com.google.android.libraries.search.assistant.invocation.o.i.c.b.f r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34679f) r2
            com.google.android.libraries.search.assistant.invocation.o.i.c.b.f r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34679f.INACTIVE_SODA_NOT_LISTENING
            boolean r1 = r8.mo62808g(r1, r2)
            if (r1 == 0) goto L_0x00b0
            kotlinx.coroutines.b.cy r1 = r0.f95925m
        L_0x00c1:
            java.lang.Object r8 = r1.mo62784e()
            r2 = r8
            h.i r2 = (p5462h.C69685i) r2
            com.google.speech.j.fo r2 = com.google.speech.p5218j.C66952fo.f181998c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.speech.j.fn r2 = (com.google.speech.p5218j.C66951fn) r2
            java.lang.String r3 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.speech.j.fq r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.speech.j.fo r2 = r2.mo59753a()
            h.i r3 = new h.i
            r3.<init>(r2, r7)
            boolean r8 = r1.mo62808g(r8, r3)
            if (r8 == 0) goto L_0x00c1
            r7 = 0
            r0.mo40414h(r7)
            r0.f95919g = r7
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2825x.p2826a.C36808o.mo40412f(com.google.android.libraries.search.assistant.invocation.o.a.b, h.c.g):java.lang.Object");
    }

    /* renamed from: g */
    public final void mo40413g() {
        C59052c cVar = (C59052c) f95913a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "QuickPhrases.Manager");
        cVar.mo56379ah(new C59094n(52365));
        cVar.mo56386p("Closing the connection to NLU and Fulfillment service.");
        C122549e eVar = this.f95923k;
        if (eVar != null) {
            eVar.mo105649a();
        }
        this.f95922j = null;
        this.f95923k = null;
    }

    /* renamed from: h */
    public final void mo40414h(C34053bp bpVar) {
        C46459k.m82829b(mo40410d(new C36787aa(bpVar, this, (C69577g) null)), "Removing events for token failed.", new Object[0]);
    }

    /* renamed from: i */
    public final boolean mo40415i(C66944fg fgVar) {
        C62971cq<C67165nl> cqVar = fgVar.f181967b;
        C69664n.m101060f(cqVar, "triggeredQuickPhraseList");
        if ((cqVar instanceof Collection) && cqVar.isEmpty()) {
            return false;
        }
        for (C67165nl nlVar : cqVar) {
            int a = C67164nk.m97430a(nlVar.f182562b);
            if (a != 0 && a == 3) {
                return true;
            }
        }
        return false;
    }
}
