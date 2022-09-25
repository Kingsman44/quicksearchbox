package com.google.android.apps.search.assistant.surfaces.p9485e;

import com.google.android.apps.gsa.binaries.satin.app.aof;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126394j;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126407w;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9487b.C126430s;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.C126455ag;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.C126473ay;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import com.google.android.libraries.assistant.p1533o.C18475bk;
import com.google.android.libraries.assistant.p1533o.C18479bo;
import com.google.android.libraries.assistant.p1533o.C18482br;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71629cb;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.C71816z;
import p5462h.C69677g;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5479i.C69690e;
import p5462h.p5479i.C69691f;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.v */
/* compiled from: PG */
public final class C126621v implements C70862aj {

    /* renamed from: a */
    public final C70862aj f348696a;

    /* renamed from: b */
    public final C69615a f348697b;

    /* renamed from: c */
    public final boolean f348698c;

    /* renamed from: d */
    public final C126394j f348699d;

    /* renamed from: e */
    public final C126407w f348700e;

    /* renamed from: f */
    public final C126436e f348701f;

    /* renamed from: g */
    public final C126430s f348702g = new C126430s(C126624y.f348716c);

    /* renamed from: h */
    public final C126473ay f348703h;

    /* renamed from: i */
    public final String f348704i;

    /* renamed from: j */
    public final C71816z f348705j;

    /* renamed from: k */
    public final C71816z f348706k;

    /* renamed from: l */
    private final C71422aw f348707l;

    /* renamed from: m */
    private final C126455ag f348708m;

    /* renamed from: n */
    private final C71643cp f348709n;

    /* renamed from: o */
    private final aof f348710o;

    public C126621v(C70862aj ajVar, C69615a aVar, boolean z, C71422aw awVar, C126394j jVar, C126407w wVar, C126455ag agVar, aof aof) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(agVar, "networkFactory");
        C69664n.m101061g(aof, "loggerFactory");
        this.f348696a = ajVar;
        this.f348697b = aVar;
        this.f348698c = z;
        this.f348707l = awVar;
        this.f348699d = jVar;
        this.f348700e = wVar;
        this.f348708m = agVar;
        this.f348710o = aof;
        C69690e eVar = C69691f.f186056a;
        String b = C39191a.m68623b(C69691f.f186057b.mo61406f(Long.MAX_VALUE));
        C69664n.m101060f(b, "idToStringForLogging(Ran… until = Long.MAX_VALUE))");
        this.f348704i = b;
        this.f348705j = new C71816z();
        this.f348706k = new C71816z();
        C126436e eVar2 = new C126436e(b, (C37215b) aof.f199106a.b.f198067an.mo17428b());
        this.f348701f = eVar2;
        this.f348703h = agVar.mo107619a(b, C126624y.f348715b, ajVar, eVar2);
        this.f348709n = C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C126411b(this, (C69577g) null), 3);
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59052c cVar = (C59052c) C126624y.f348717d.mo56224b();
        cVar.mo56379ah(new C59094n(38886));
        cVar.mo56386p("VoiceSearchGrpcImpl#Connection#onCompleted");
        this.f348705j.mo63050j(new IllegalStateException("onCompleted without StartVoiceQuery"));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C126624y.f348717d.mo56225c()).mo56382g(th);
        String message = th.getMessage();
        cVar.mo56379ah(new C59094n(38887));
        cVar.mo56389s("VoiceSearchGrpcImpl#Connection#onError: %s", message);
        mo107633e("Connection#onError", th);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C18479bo boVar;
        C18482br brVar = (C18482br) obj;
        C69664n.m101061g(brVar, "value");
        int i = brVar.f52417a;
        int a = C18475bk.m35945a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            C71816z zVar = this.f348705j;
            if (i == 1) {
                boVar = (C18479bo) brVar.f52418b;
            } else {
                boVar = C18479bo.f52410b;
            }
            C18460aw awVar = boVar.f52412a;
            if (awVar == null) {
                awVar = C18460aw.f52380h;
            }
            C69664n.m101060f(awVar, "value.startVoiceQuery.configuration");
            zVar.mo62909P(awVar);
        } else if (i2 == 1) {
            this.f348706k.mo62909P(C69788q.f186170a);
        } else if (i2 != 2 && i2 != 3) {
            throw new C69677g();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: kotlinx.coroutines.a.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107632d(kotlinx.coroutines.C71604be r10, kotlinx.coroutines.p5573a.C71389v r11, p5462h.p5466c.C69577g r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.p9485e.C126439d
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.e.d r0 = (com.google.android.apps.search.assistant.surfaces.p9485e.C126439d) r0
            int r1 = r0.f348222e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f348222e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.e.d r0 = new com.google.android.apps.search.assistant.surfaces.e.d
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f348220c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f348222e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r10 = r0.f348219b
            java.io.Closeable r10 = (java.io.Closeable) r10
            java.lang.Object r11 = r0.f348218a
            p5462h.C69714l.m101134b(r12)     // Catch:{ all -> 0x0031 }
            goto L_0x0093
        L_0x0031:
            r11 = move-exception
            goto L_0x00ac
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003c:
            java.lang.Object r10 = r0.f348219b
            r11 = r10
            kotlinx.coroutines.a.v r11 = (kotlinx.coroutines.p5573a.C71389v) r11
            java.lang.Object r10 = r0.f348218a
            p5462h.C69714l.m101134b(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x005b
        L_0x004a:
            p5462h.C69714l.m101134b(r12)
            r0.f348218a = r9
            r0.f348219b = r11
            r0.f348222e = r5
            java.lang.Object r12 = r10.mo62825a(r0)
            if (r12 == r1) goto L_0x00b2
            r10 = r11
            r11 = r9
        L_0x005b:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r2 = r12
            com.google.android.apps.search.assistant.surfaces.e.a.t r2 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126404t) r2     // Catch:{ all -> 0x00a9 }
            r5 = r11
            com.google.android.apps.search.assistant.surfaces.e.v r5 = (com.google.android.apps.search.assistant.surfaces.p9485e.C126621v) r5     // Catch:{ all -> 0x00a9 }
            com.google.android.apps.search.assistant.surfaces.e.c.e r5 = r5.f348701f     // Catch:{ all -> 0x00a9 }
            com.google.android.libraries.search.b.i.g r6 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97147g     // Catch:{ all -> 0x00a9 }
            com.google.net.a.a.b r7 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ all -> 0x00a9 }
            com.google.android.libraries.search.b.i.a r6 = r6.mo40815i(r7)     // Catch:{ all -> 0x00a9 }
            r5.mo107613e(r6)     // Catch:{ all -> 0x00a9 }
            r5 = r11
            com.google.android.apps.search.assistant.surfaces.e.v r5 = (com.google.android.apps.search.assistant.surfaces.p9485e.C126621v) r5     // Catch:{ all -> 0x00a9 }
            io.grpc.i.aj r5 = r5.f348696a     // Catch:{ all -> 0x00a9 }
            com.google.android.apps.search.assistant.surfaces.e.e r6 = com.google.android.apps.search.assistant.surfaces.p9485e.C126604e.f348652a     // Catch:{ all -> 0x00a9 }
            com.google.android.libraries.assistant.o.bt r6 = com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126558c.m206924f(r6)     // Catch:{ all -> 0x00a9 }
            r5.mo20123c(r6)     // Catch:{ all -> 0x00a9 }
            com.google.android.apps.search.assistant.surfaces.e.o r5 = new com.google.android.apps.search.assistant.surfaces.e.o     // Catch:{ all -> 0x00a9 }
            r6 = r11
            com.google.android.apps.search.assistant.surfaces.e.v r6 = (com.google.android.apps.search.assistant.surfaces.p9485e.C126621v) r6     // Catch:{ all -> 0x00a9 }
            r5.<init>(r6, r2, r10, r3)     // Catch:{ all -> 0x00a9 }
            r0.f348218a = r11     // Catch:{ all -> 0x00a9 }
            r0.f348219b = r12     // Catch:{ all -> 0x00a9 }
            r0.f348222e = r4     // Catch:{ all -> 0x00a9 }
            java.lang.Object r10 = kotlinx.coroutines.C71423ax.m104196a(r5, r0)     // Catch:{ all -> 0x00a9 }
            if (r10 == r1) goto L_0x00a8
            r10 = r12
        L_0x0093:
            com.google.android.apps.search.assistant.surfaces.e.v r11 = (com.google.android.apps.search.assistant.surfaces.p9485e.C126621v) r11     // Catch:{ all -> 0x0031 }
            com.google.android.apps.search.assistant.surfaces.e.c.e r11 = r11.f348701f     // Catch:{ all -> 0x0031 }
            com.google.android.libraries.search.b.i.g r12 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97200h     // Catch:{ all -> 0x0031 }
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ all -> 0x0031 }
            com.google.android.libraries.search.b.i.a r12 = r12.mo40815i(r0)     // Catch:{ all -> 0x0031 }
            r11.mo107613e(r12)     // Catch:{ all -> 0x0031 }
            p5462h.p5472e.C69598b.m101013a(r10, r3)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x00a8:
            return r1
        L_0x00a9:
            r10 = move-exception
            r11 = r10
            r10 = r12
        L_0x00ac:
            throw r11     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r12 = move-exception
            p5462h.p5472e.C69598b.m101013a(r10, r11)
            throw r12
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.C126621v.mo107632d(kotlinx.coroutines.be, kotlinx.coroutines.a.v, h.c.g):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo107633e(String str, Throwable th) {
        this.f348709n.mo62723u(C71629cb.m104602a(str, th));
    }
}
