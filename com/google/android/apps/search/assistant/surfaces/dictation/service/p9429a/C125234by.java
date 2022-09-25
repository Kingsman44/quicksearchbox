package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.speech.RecognitionListener;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3686a.C47592a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4543n.p4548e.p4549a.C59425c;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.protobuf.C62910ar;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.C69613f;
import p5462h.C69677g;
import p5462h.C69685i;
import p5462h.C69747m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by */
/* compiled from: PG */
public final class C125234by implements AutoCloseable {

    /* renamed from: a */
    public final C125191ai f345455a;

    /* renamed from: b */
    public final C125258n f345456b;

    /* renamed from: c */
    public final C125244ch f345457c;

    /* renamed from: d */
    public final C125265u f345458d;

    /* renamed from: e */
    public final C62910ar f345459e;

    /* renamed from: f */
    public final C62910ar f345460f;

    /* renamed from: g */
    public final C62910ar f345461g;

    /* renamed from: h */
    public final C71422aw f345462h;

    /* renamed from: i */
    public final Context f345463i;

    /* renamed from: j */
    public final C125243cg f345464j;

    /* renamed from: k */
    public final Level f345465k;

    /* renamed from: l */
    public final RecognitionListener f345466l;

    /* renamed from: m */
    public final C69626l f345467m;

    /* renamed from: n */
    public final C71788b f345468n;

    /* renamed from: o */
    public C125203au f345469o;

    /* renamed from: p */
    private final C125267w f345470p;

    /* renamed from: q */
    private final C62910ar f345471q;

    /* renamed from: r */
    private final Executor f345472r;

    /* renamed from: s */
    private final long f345473s;

    /* renamed from: t */
    private final C69613f f345474t;

    /* renamed from: u */
    private final C69626l f345475u;

    public C125234by(C125191ai aiVar, C125258n nVar, C125244ch chVar, C125265u uVar, C125267w wVar, C62910ar arVar, C62910ar arVar2, C62910ar arVar3, C62910ar arVar4, C71422aw awVar, Executor executor, Context context, C125235bz bzVar, C125243cg cgVar) {
        Level level;
        C69664n.m101061g(aiVar, "client");
        C69664n.m101061g(uVar, "controller");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "uiThreadExecutor");
        C69664n.m101061g(context, "applicationContext");
        C69664n.m101061g(bzVar, "idSequence");
        this.f345455a = aiVar;
        this.f345456b = nVar;
        this.f345457c = chVar;
        this.f345458d = uVar;
        this.f345470p = wVar;
        this.f345459e = arVar;
        this.f345471q = arVar2;
        this.f345460f = arVar3;
        this.f345461g = arVar4;
        this.f345462h = awVar;
        this.f345472r = executor;
        this.f345463i = context;
        this.f345464j = cgVar;
        this.f345473s = bzVar.f345476a.getAndIncrement();
        int i = aiVar.mo106844i();
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                level = Level.SEVERE;
            } else if (i2 == 1) {
                level = Level.WARNING;
            } else {
                throw new C69677g();
            }
            this.f345465k = level;
            this.f345466l = new C47592a(new C125190ah(this), C47816ey.m84988b());
            this.f345474t = new C69747m(C125206ax.f345366a);
            this.f345475u = new C59425c(new C125219bj(this, (C69577g) null));
            this.f345467m = new C59425c(new C125227br(this, (C69577g) null));
            this.f345468n = new C71799m();
            this.f345469o = C125195am.f345357a;
            return;
        }
        throw null;
    }

    /* renamed from: p */
    private final C69685i m205126p() {
        return (C69685i) this.f345474t.mo5768a();
    }

    /* renamed from: q */
    private final void m205127q() {
        C125203au auVar = this.f345469o;
        if ((auVar instanceof C125202at) || (auVar instanceof C125196an)) {
            this.f345469o = C125204av.f345364a;
            C71803m.m105043d(this.f345462h, (C69585o) null, (C71424ay) null, new C125226bq(this, (C69577g) null), 3);
            C71803m.m105043d(this.f345462h, (C69585o) null, (C71424ay) null, new C125210ba(this, (C69577g) null), 3);
            return;
        }
        String l = mo106865l();
        throw new IllegalStateException("Cannot enter Stopping state for " + l + ".");
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo106853a() {
        return (ParcelFileDescriptor) m205126p().f186053b;
    }

    /* renamed from: b */
    public final C60870cx mo106854b() {
        return C71663i.m104692e(this.f345462h, (C71424ay) null, new C125222bm(this, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final C60870cx mo106855c() {
        return C71663i.m104692e(this.f345462h, (C71424ay) null, new C125225bp(this, (C69577g) null), 3);
    }

    public final void close() {
        C59052c cVar = (C59052c) C125237ca.f345479a.mo56224b();
        C61301b a = C126290c.m206496a(toString());
        cVar.mo56379ah(new C59094n(36469));
        cVar.mo56389s("Closing audio pipe for %s. [SD]", a);
        mo106853a().close();
        mo106866m().close();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[SYNTHETIC, Splitter:B:17:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106857d(int r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125215bf
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bf r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125215bf) r0
            int r1 = r0.f345387g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345387g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bf r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bf
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f345385e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345387g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r9 = r0.f345384d
            java.lang.Object r1 = r0.f345383c
            java.lang.Object r2 = r0.f345382b
            java.lang.Object r0 = r0.f345381a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0058
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            p5462h.C69714l.m101134b(r10)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            com.google.frameworks.client.a.a.b r2 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r10)
            kotlinx.coroutines.j.b r10 = r8.f345468n
            r0.f345381a = r8
            r0.f345382b = r2
            r0.f345383c = r10
            r0.f345384d = r9
            r0.f345387g = r3
            java.lang.Object r0 = r10.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x012b
            r0 = r8
            r1 = r10
        L_0x0058:
            r10 = 9
            if (r9 != r10) goto L_0x0084
            com.google.common.f.e r9 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a     // Catch:{ all -> 0x0126 }
            com.google.common.f.x r9 = r9.mo56224b()     // Catch:{ all -> 0x0126 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ all -> 0x0126 }
            java.lang.String r10 = "Ignoring ERROR_INSUFFICIENT_PERMISSIONS from SpeechRecognizer in %s. [SD]"
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r0     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r0.mo106865l()     // Catch:{ all -> 0x0126 }
            com.google.frameworks.client.a.a.b r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r0)     // Catch:{ all -> 0x0126 }
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x0126 }
            r3 = 36460(0x8e6c, float:5.1091E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x0126 }
            r9.mo56379ah(r2)     // Catch:{ all -> 0x0126 }
            r9.mo56389s(r10, r0)     // Catch:{ all -> 0x0126 }
            h.q r9 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0126 }
            r1.mo63026c(r4)
            return r9
        L_0x0084:
            r10 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r10     // Catch:{ all -> 0x0126 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.au r10 = r10.f345469o     // Catch:{ all -> 0x0126 }
            boolean r3 = r10 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125202at     // Catch:{ all -> 0x0126 }
            if (r3 == 0) goto L_0x00be
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a     // Catch:{ all -> 0x0126 }
            r3 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r3 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r3     // Catch:{ all -> 0x0126 }
            java.util.logging.Level r3 = r3.f345465k     // Catch:{ all -> 0x0126 }
            com.google.common.f.c r10 = r10.mo56223a(r3)     // Catch:{ all -> 0x0126 }
            java.lang.String r3 = "Received error %s from SpeechRecognizer while starting %s. [SD]"
            r5 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r5     // Catch:{ all -> 0x0126 }
            java.lang.String r5 = r5.mo106865l()     // Catch:{ all -> 0x0126 }
            com.google.frameworks.client.a.a.b r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r5)     // Catch:{ all -> 0x0126 }
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x0126 }
            r7 = 36459(0x8e6b, float:5.109E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x0126 }
            r10.mo56379ah(r6)     // Catch:{ all -> 0x0126 }
            r10.mo56354G(r3, r2, r5)     // Catch:{ all -> 0x0126 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ao r10 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.ao     // Catch:{ all -> 0x0126 }
            r10.<init>(r9)     // Catch:{ all -> 0x0126 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r0     // Catch:{ all -> 0x0126 }
            r0.mo106868o(r10)     // Catch:{ all -> 0x0126 }
            goto L_0x00f8
        L_0x00be:
            boolean r10 = r10 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125196an     // Catch:{ all -> 0x0126 }
            if (r10 == 0) goto L_0x00fe
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a     // Catch:{ all -> 0x0126 }
            r3 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r3 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r3     // Catch:{ all -> 0x0126 }
            java.util.logging.Level r3 = r3.f345465k     // Catch:{ all -> 0x0126 }
            com.google.common.f.c r10 = r10.mo56223a(r3)     // Catch:{ all -> 0x0126 }
            java.lang.String r3 = "Received error %s from SpeechRecognizer while running %s. [SD]"
            r5 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r5     // Catch:{ all -> 0x0126 }
            java.lang.String r5 = r5.mo106865l()     // Catch:{ all -> 0x0126 }
            com.google.frameworks.client.a.a.b r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r5)     // Catch:{ all -> 0x0126 }
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x0126 }
            r7 = 36458(0x8e6a, float:5.1089E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x0126 }
            r10.mo56379ah(r6)     // Catch:{ all -> 0x0126 }
            r10.mo56354G(r3, r2, r5)     // Catch:{ all -> 0x0126 }
            r10 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r10     // Catch:{ all -> 0x0126 }
            kotlinx.coroutines.aw r10 = r10.f345462h     // Catch:{ all -> 0x0126 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bg r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bg     // Catch:{ all -> 0x0126 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r0     // Catch:{ all -> 0x0126 }
            r2.<init>(r0, r9, r4)     // Catch:{ all -> 0x0126 }
            r9 = 3
            kotlinx.coroutines.C71803m.m105043d(r10, r4, r4, r2, r9)     // Catch:{ all -> 0x0126 }
        L_0x00f8:
            r1.mo63026c(r4)
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x00fe:
            com.google.common.f.e r9 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a     // Catch:{ all -> 0x0126 }
            com.google.common.f.x r9 = r9.mo56226d()     // Catch:{ all -> 0x0126 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ all -> 0x0126 }
            java.lang.String r10 = "Received stray error %s from SpeechRecognizer in %s [SD]"
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r0     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r0.mo106865l()     // Catch:{ all -> 0x0126 }
            com.google.frameworks.client.a.a.b r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r0)     // Catch:{ all -> 0x0126 }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0126 }
            r5 = 36457(0x8e69, float:5.1087E-41)
            r3.<init>(r5)     // Catch:{ all -> 0x0126 }
            r9.mo56379ah(r3)     // Catch:{ all -> 0x0126 }
            r9.mo56354G(r10, r2, r0)     // Catch:{ all -> 0x0126 }
            h.q r9 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0126 }
            r1.mo63026c(r4)
            return r9
        L_0x0126:
            r9 = move-exception
            r1.mo63026c(r4)
            throw r9
        L_0x012b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by.mo106857d(int, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106858e(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125217bh
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bh r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125217bh) r0
            int r1 = r0.f345394e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345394e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bh r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bh
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f345392c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345394e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r1 = r0.f345391b
            java.lang.Object r0 = r0.f345390a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0060
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            java.lang.Object r2 = r0.f345390a
            p5462h.C69714l.m101134b(r7)
            goto L_0x004d
        L_0x003d:
            p5462h.C69714l.m101134b(r7)
            com.google.protobuf.ar r7 = r6.f345471q
            r0.f345390a = r6
            r0.f345394e = r4
            java.lang.Object r7 = com.google.android.libraries.search.assistant.p2511d.C32559v.m60377a(r7, r0)
            if (r7 == r1) goto L_0x009e
            r2 = r6
        L_0x004d:
            r7 = r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r7
            kotlinx.coroutines.j.b r7 = r7.f345468n
            r0.f345390a = r2
            r0.f345391b = r7
            r0.f345394e = r3
            java.lang.Object r0 = r7.mo63025b(r5, r0)
            if (r0 == r1) goto L_0x009e
            r1 = r7
            r0 = r2
        L_0x0060:
            r7 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r7     // Catch:{ all -> 0x0099 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.au r7 = r7.f345469o     // Catch:{ all -> 0x0099 }
            boolean r7 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125202at     // Catch:{ all -> 0x0099 }
            if (r7 == 0) goto L_0x0071
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ap r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125198ap.f345360a     // Catch:{ all -> 0x0099 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r0     // Catch:{ all -> 0x0099 }
            r0.mo106868o(r7)     // Catch:{ all -> 0x0099 }
            goto L_0x0093
        L_0x0071:
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a     // Catch:{ all -> 0x0099 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x0099 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = "Received stray onReadyForSpeech from SpeechRecognizer in %s [SD]"
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r0     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r0.mo106865l()     // Catch:{ all -> 0x0099 }
            com.google.frameworks.client.a.a.b r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r0)     // Catch:{ all -> 0x0099 }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0099 }
            r4 = 36461(0x8e6d, float:5.1093E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x0099 }
            r7.mo56379ah(r3)     // Catch:{ all -> 0x0099 }
            r7.mo56389s(r2, r0)     // Catch:{ all -> 0x0099 }
        L_0x0093:
            r1.mo63026c(r5)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x0099:
            r7 = move-exception
            r1.mo63026c(r5)
            throw r7
        L_0x009e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by.mo106858e(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a A[Catch:{ all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106859f(android.os.Bundle r12, boolean r13, p5462h.p5466c.C69577g r14) {
        /*
            r11 = this;
            java.lang.String r0 = "end"
            java.lang.String r1 = "start"
            boolean r2 = r14 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125218bi
            if (r2 == 0) goto L_0x0017
            r2 = r14
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bi r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125218bi) r2
            int r3 = r2.f345401g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f345401g = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bi r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bi
            r2.<init>(r11, r14)
        L_0x001c:
            java.lang.Object r14 = r2.f345399e
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f345401g
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003c
            if (r4 != r6) goto L_0x0034
            boolean r13 = r2.f345398d
            java.lang.Object r12 = r2.f345397c
            java.lang.Object r3 = r2.f345396b
            java.lang.Object r2 = r2.f345395a
            p5462h.C69714l.m101134b(r14)
            goto L_0x0071
        L_0x0034:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003c:
            p5462h.C69714l.m101134b(r14)
            if (r12 != 0) goto L_0x005c
            com.google.common.f.e r12 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r13 = new com.google.common.f.n
            r14 = 36466(0x8e72, float:5.11E-41)
            r13.<init>(r14)
            r12.mo56379ah(r13)
            java.lang.String r13 = "SpeechRecognizer called handleRecognitionResults without a bundle [SD]"
            r12.mo56386p(r13)
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x005c:
            kotlinx.coroutines.j.b r14 = r11.f345468n
            r2.f345395a = r11
            r2.f345396b = r12
            r2.f345397c = r14
            r2.f345398d = r13
            r2.f345401g = r6
            java.lang.Object r2 = r14.mo63025b(r5, r2)
            if (r2 == r3) goto L_0x01a2
            r2 = r11
            r3 = r12
            r12 = r14
        L_0x0071:
            r14 = r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r14 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r14     // Catch:{ all -> 0x019d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.au r14 = r14.f345469o     // Catch:{ all -> 0x019d }
            boolean r14 = r14 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125196an     // Catch:{ all -> 0x019d }
            if (r14 != 0) goto L_0x00a2
            com.google.common.f.e r13 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a     // Catch:{ all -> 0x019d }
            com.google.common.f.x r13 = r13.mo56226d()     // Catch:{ all -> 0x019d }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x019d }
            java.lang.String r14 = "Received stray handleRecognitionResults from SpeechRecognizer in %s [SD]"
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r2     // Catch:{ all -> 0x019d }
            java.lang.String r0 = r2.mo106865l()     // Catch:{ all -> 0x019d }
            com.google.frameworks.client.a.a.b r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r0)     // Catch:{ all -> 0x019d }
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x019d }
            r2 = 36465(0x8e71, float:5.1098E-41)
            r1.<init>(r2)     // Catch:{ all -> 0x019d }
            r13.mo56379ah(r1)     // Catch:{ all -> 0x019d }
            r13.mo56389s(r14, r0)     // Catch:{ all -> 0x019d }
            h.q r13 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x019d }
            r12.mo63026c(r5)
            return r13
        L_0x00a2:
            r12.mo63026c(r5)
            r12 = r3
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.String r14 = "results_recognition"
            java.util.ArrayList r12 = r12.getStringArrayList(r14)
            if (r12 != 0) goto L_0x00cb
            com.google.common.f.e r12 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r13 = new com.google.common.f.n
            r14 = 36464(0x8e70, float:5.1097E-41)
            r13.<init>(r14)
            r12.mo56379ah(r13)
            java.lang.String r13 = "SpeechRecognizer called handleRecognitionResults() without RESULTS_RECOGNITION. [SD]"
            r12.mo56386p(r13)
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x00cb:
            java.lang.Object r12 = p5462h.p5463a.C69540x.m100821C(r12)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x00d5
            java.lang.String r12 = ""
        L_0x00d5:
            int r14 = r12.length()
            if (r14 != 0) goto L_0x00f6
            com.google.common.f.e r12 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r13 = new com.google.common.f.n
            r14 = 36463(0x8e6f, float:5.1096E-41)
            r13.<init>(r14)
            r12.mo56379ah(r13)
            java.lang.String r13 = "Received empty recognition result from SpeechRecognizer. [SD]"
            r12.mo56386p(r13)
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x00f6:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.w r14 = r2.f345470p
            java.lang.String r4 = "SD.Corrections.ParseAlternatives"
            com.google.apps.tiktok.tracing.bi r4 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r4)
            r5 = 0
            boolean r14 = r14.f345582a     // Catch:{ all -> 0x0181 }
            if (r14 != 0) goto L_0x010d
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x0181 }
        L_0x0109:
            r4.close()
            goto L_0x0174
        L_0x010d:
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x0181 }
            java.lang.String r14 = "results_alternatives"
            java.util.ArrayList r14 = r3.getParcelableArrayList(r14)     // Catch:{ all -> 0x0181 }
            if (r14 == 0) goto L_0x016f
            boolean r3 = r14.isEmpty()     // Catch:{ all -> 0x0181 }
            if (r3 == 0) goto L_0x011e
            goto L_0x016f
        L_0x011e:
            java.lang.Object r14 = r14.get(r5)     // Catch:{ all -> 0x0181 }
            android.os.Bundle r14 = (android.os.Bundle) r14     // Catch:{ all -> 0x0181 }
            java.lang.String r3 = "alternative_spans"
            java.util.ArrayList r14 = r14.getParcelableArrayList(r3)     // Catch:{ all -> 0x0181 }
            if (r14 != 0) goto L_0x0131
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x0181 }
            goto L_0x0109
        L_0x0131:
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0181 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0181 }
        L_0x0139:
            boolean r7 = r14.hasNext()     // Catch:{ all -> 0x0181 }
            if (r7 == 0) goto L_0x016a
            java.lang.Object r7 = r14.next()     // Catch:{ all -> 0x0181 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x0181 }
            java.lang.String r8 = "alternatives"
            java.util.ArrayList r8 = r7.getStringArrayList(r8)     // Catch:{ all -> 0x0181 }
            boolean r9 = r7.containsKey(r1)     // Catch:{ all -> 0x0181 }
            if (r9 == 0) goto L_0x0139
            boolean r9 = r7.containsKey(r0)     // Catch:{ all -> 0x0181 }
            if (r9 == 0) goto L_0x0139
            if (r8 == 0) goto L_0x0139
            int r9 = r7.getInt(r1)     // Catch:{ all -> 0x0181 }
            int r7 = r7.getInt(r0)     // Catch:{ all -> 0x0181 }
            com.google.android.apps.d.a.b.a.e r10 = new com.google.android.apps.d.a.b.a.e     // Catch:{ all -> 0x0181 }
            r10.<init>(r9, r7, r8)     // Catch:{ all -> 0x0181 }
            r3.mo55395g(r10)     // Catch:{ all -> 0x0181 }
            goto L_0x0139
        L_0x016a:
            com.google.common.b.gu r14 = r3.mo55394f()     // Catch:{ all -> 0x0181 }
            goto L_0x0109
        L_0x016f:
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x0181 }
            goto L_0x0109
        L_0x0174:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ai r0 = r2.f345455a
            java.lang.String r1 = "resultAlternatives"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r1)
            r0.mo106837b(r12, r13, r14)
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x0181:
            r12 = move-exception
            r4.close()     // Catch:{ all -> 0x0186 }
            goto L_0x019c
        L_0x0186:
            r13 = move-exception
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x019c }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r14[r5] = r0     // Catch:{ Exception -> 0x019c }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r1 = "addSuppressed"
            java.lang.reflect.Method r14 = r0.getDeclaredMethod(r1, r14)     // Catch:{ Exception -> 0x019c }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x019c }
            r0[r5] = r13     // Catch:{ Exception -> 0x019c }
            r14.invoke(r12, r0)     // Catch:{ Exception -> 0x019c }
        L_0x019c:
            throw r12
        L_0x019d:
            r13 = move-exception
            r12.mo63026c(r5)
            throw r13
        L_0x01a2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by.mo106859f(android.os.Bundle, boolean, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076 A[SYNTHETIC, Splitter:B:27:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106860g(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            java.lang.String r0 = "start() or stop() was already called on "
            boolean r1 = r8 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125221bl
            if (r1 == 0) goto L_0x0015
            r1 = r8
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bl r1 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125221bl) r1
            int r2 = r1.f345410e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f345410e = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bl r1 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bl
            r1.<init>(r7, r8)
        L_0x001a:
            java.lang.Object r8 = r1.f345408c
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f345410e
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x003d
            if (r3 == r5) goto L_0x0035
            if (r3 != r4) goto L_0x002d
            p5462h.C69714l.m101134b(r8)
            goto L_0x0073
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0035:
            java.lang.Object r3 = r1.f345407b
            java.lang.Object r5 = r1.f345406a
            p5462h.C69714l.m101134b(r8)
            goto L_0x004f
        L_0x003d:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r3 = r7.f345468n
            r1.f345406a = r7
            r1.f345407b = r3
            r1.f345410e = r5
            java.lang.Object r8 = r3.mo63025b(r6, r1)
            if (r8 == r2) goto L_0x0098
            r5 = r7
        L_0x004f:
            r8 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r8 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r8     // Catch:{ all -> 0x0093 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.au r8 = r8.f345469o     // Catch:{ all -> 0x0093 }
            boolean r8 = r8 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125195am     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x0076
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.aw r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125205aw.f345365a     // Catch:{ all -> 0x0093 }
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r0     // Catch:{ all -> 0x0093 }
            r0.f345469o = r8     // Catch:{ all -> 0x0093 }
            r3.mo63026c(r6)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.u r8 = r5.f345458d
            r1.f345406a = r6
            r1.f345407b = r6
            r1.f345410e = r4
            java.lang.Object r8 = r8.mo106889b(r5, r1)
            if (r8 != r2) goto L_0x0073
            return r2
        L_0x0073:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0076:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r5     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = r5.mo106865l()     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r1.<init>(r0)     // Catch:{ all -> 0x0093 }
            r1.append(r8)     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = "."
            r1.append(r8)     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x0093 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0093 }
            r0.<init>(r8)     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r8 = move-exception
            r3.mo63026c(r6)
            throw r8
        L_0x0098:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by.mo106860g(h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.a.by} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054 A[Catch:{ all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e A[Catch:{ all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106861h(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            java.lang.String r0 = "stop() called when already stopping on "
            java.lang.String r1 = "stop() called when already finished on "
            boolean r2 = r9 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125224bo
            if (r2 == 0) goto L_0x0017
            r2 = r9
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bo r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125224bo) r2
            int r3 = r2.f345421e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f345421e = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bo r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bo
            r2.<init>(r8, r9)
        L_0x001c:
            java.lang.Object r9 = r2.f345419c
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f345421e
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0038
            if (r4 != r6) goto L_0x0030
            java.lang.Object r3 = r2.f345418b
            java.lang.Object r2 = r2.f345417a
            p5462h.C69714l.m101134b(r9)
            goto L_0x004b
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0038:
            p5462h.C69714l.m101134b(r9)
            kotlinx.coroutines.j.b r9 = r8.f345468n
            r2.f345417a = r8
            r2.f345418b = r9
            r2.f345421e = r6
            java.lang.Object r2 = r9.mo63025b(r5, r2)
            if (r2 == r3) goto L_0x00e5
            r2 = r8
            r3 = r9
        L_0x004b:
            r9 = r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r9 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r9     // Catch:{ all -> 0x00e0 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.au r9 = r9.f345469o     // Catch:{ all -> 0x00e0 }
            boolean r4 = r9 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125195am     // Catch:{ all -> 0x00e0 }
            if (r4 == 0) goto L_0x007e
            com.google.common.f.e r9 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a     // Catch:{ all -> 0x00e0 }
            com.google.common.f.x r9 = r9.mo56226d()     // Catch:{ all -> 0x00e0 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "stop() called before start() on %s [SD]"
            r1 = r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r1 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r1     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r1.mo106865l()     // Catch:{ all -> 0x00e0 }
            com.google.frameworks.client.a.a.b r1 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r1)     // Catch:{ all -> 0x00e0 }
            com.google.common.f.n r4 = new com.google.common.f.n     // Catch:{ all -> 0x00e0 }
            r6 = 36467(0x8e73, float:5.1101E-41)
            r4.<init>(r6)     // Catch:{ all -> 0x00e0 }
            r9.mo56379ah(r4)     // Catch:{ all -> 0x00e0 }
            r9.mo56389s(r0, r1)     // Catch:{ all -> 0x00e0 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.al r9 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125194al.f345356a     // Catch:{ all -> 0x00e0 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r2     // Catch:{ all -> 0x00e0 }
            r2.f345469o = r9     // Catch:{ all -> 0x00e0 }
            goto L_0x00a4
        L_0x007e:
            boolean r4 = r9 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125194al     // Catch:{ all -> 0x00e0 }
            java.lang.String r7 = "."
            if (r4 != 0) goto L_0x00c5
            boolean r1 = r9 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125204av     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x00aa
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125205aw     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x0092
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r2     // Catch:{ all -> 0x00e0 }
            r2.mo106867n()     // Catch:{ all -> 0x00e0 }
            goto L_0x00a4
        L_0x0092:
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125202at     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x009b
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.at r9 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125202at) r9     // Catch:{ all -> 0x00e0 }
            r9.f345363a = r6     // Catch:{ all -> 0x00e0 }
            goto L_0x00a4
        L_0x009b:
            boolean r9 = r9 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125196an     // Catch:{ all -> 0x00e0 }
            if (r9 == 0) goto L_0x00a4
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r2     // Catch:{ all -> 0x00e0 }
            r2.m205127q()     // Catch:{ all -> 0x00e0 }
        L_0x00a4:
            r3.mo63026c(r5)
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x00aa:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e0 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r2     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r2.mo106865l()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r2.<init>(r0)     // Catch:{ all -> 0x00e0 }
            r2.append(r1)     // Catch:{ all -> 0x00e0 }
            r2.append(r7)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00e0 }
            r9.<init>(r0)     // Catch:{ all -> 0x00e0 }
            throw r9     // Catch:{ all -> 0x00e0 }
        L_0x00c5:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e0 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r2     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r2.mo106865l()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r2.<init>(r1)     // Catch:{ all -> 0x00e0 }
            r2.append(r0)     // Catch:{ all -> 0x00e0 }
            r2.append(r7)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00e0 }
            r9.<init>(r0)     // Catch:{ all -> 0x00e0 }
            throw r9     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r9 = move-exception
            r3.mo63026c(r5)
            throw r9
        L_0x00e5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by.mo106861h(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.speech.SpeechRecognizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: android.speech.SpeechRecognizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: java.io.Closeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106862i(android.speech.SpeechRecognizer r9, com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by r10, p5462h.p5466c.C69577g r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125228bs
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bs r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125228bs) r0
            int r1 = r0.f345436g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345436g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bs r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bs
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f345434e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345436g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r9 = r0.f345430a
            java.io.Closeable r9 = (java.io.Closeable) r9
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x002f }
            goto L_0x0090
        L_0x002f:
            r10 = move-exception
            goto L_0x009c
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            java.lang.Object r9 = r0.f345433d
            java.lang.Object r10 = r0.f345432c
            java.lang.Object r2 = r0.f345431b
            java.lang.Object r4 = r0.f345430a
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r4
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x002f }
            r7 = r11
            r11 = r9
            r9 = r2
            r2 = r7
            goto L_0x0068
        L_0x004c:
            p5462h.C69714l.m101134b(r11)
            java.lang.String r11 = "SD.AiAiSession.SpeechRecognizer.Start"
            com.google.apps.tiktok.tracing.bi r11 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r11)
            h.f.a.l r2 = r10.f345475u     // Catch:{ all -> 0x0099 }
            r0.f345430a = r8     // Catch:{ all -> 0x0099 }
            r0.f345431b = r9     // Catch:{ all -> 0x0099 }
            r0.f345432c = r10     // Catch:{ all -> 0x0099 }
            r0.f345433d = r11     // Catch:{ all -> 0x0099 }
            r0.f345436g = r4     // Catch:{ all -> 0x0099 }
            java.lang.Object r2 = r2.mo5761a(r0)     // Catch:{ all -> 0x0099 }
            if (r2 == r1) goto L_0x0098
            r4 = r8
        L_0x0068:
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x0099 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bt r6 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bt     // Catch:{ all -> 0x0099 }
            android.speech.SpeechRecognizer r9 = (android.speech.SpeechRecognizer) r9     // Catch:{ all -> 0x0099 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r10     // Catch:{ all -> 0x0099 }
            r6.<init>(r9, r10, r4, r2)     // Catch:{ all -> 0x0099 }
            java.util.concurrent.Executor r9 = r4.f345472r     // Catch:{ all -> 0x0099 }
            java.lang.Runnable r10 = com.google.apps.tiktok.tracing.C47810es.m84977q(r6)     // Catch:{ all -> 0x0099 }
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92903l(r10, r9)     // Catch:{ all -> 0x0099 }
            r0.f345430a = r11     // Catch:{ all -> 0x0099 }
            r0.f345431b = r5     // Catch:{ all -> 0x0099 }
            r0.f345432c = r5     // Catch:{ all -> 0x0099 }
            r0.f345433d = r5     // Catch:{ all -> 0x0099 }
            r0.f345436g = r3     // Catch:{ all -> 0x0099 }
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)     // Catch:{ all -> 0x0099 }
            if (r9 == r1) goto L_0x0098
            r7 = r11
            r11 = r9
            r9 = r7
        L_0x0090:
            java.lang.Void r11 = (java.lang.Void) r11     // Catch:{ all -> 0x002f }
            p5462h.p5472e.C69598b.m101013a(r9, r5)
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x0098:
            return r1
        L_0x0099:
            r9 = move-exception
            r10 = r9
            r9 = r11
        L_0x009c:
            throw r10     // Catch:{ all -> 0x009d }
        L_0x009d:
            r11 = move-exception
            p5462h.p5472e.C69598b.m101013a(r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by.mo106862i(android.speech.SpeechRecognizer, com.google.android.apps.search.assistant.surfaces.dictation.service.a.by, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106863j(android.speech.SpeechRecognizer r6, com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125230bu
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bu r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125230bu) r0
            int r1 = r0.f345444d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345444d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bu r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bu
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f345442b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345444d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r6 = r0.f345441a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0029 }
            goto L_0x0058
        L_0x0029:
            r7 = move-exception
            goto L_0x0065
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r8)
            java.lang.String r8 = "SD.AiAiSession.SpeechRecognizer.Stop"
            com.google.apps.tiktok.tracing.bi r8 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r8)
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bv r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bv     // Catch:{ all -> 0x0062 }
            r2.<init>(r7, r6)     // Catch:{ all -> 0x0062 }
            java.util.concurrent.Executor r6 = r5.f345472r     // Catch:{ all -> 0x0062 }
            java.lang.Runnable r7 = com.google.apps.tiktok.tracing.C47810es.m84977q(r2)     // Catch:{ all -> 0x0062 }
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92903l(r7, r6)     // Catch:{ all -> 0x0062 }
            r0.f345441a = r8     // Catch:{ all -> 0x0062 }
            r0.f345444d = r3     // Catch:{ all -> 0x0062 }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ all -> 0x0062 }
            if (r6 == r1) goto L_0x0061
            r4 = r8
            r8 = r6
            r6 = r4
        L_0x0058:
            java.lang.Void r8 = (java.lang.Void) r8     // Catch:{ all -> 0x0029 }
            r7 = 0
            p5462h.p5472e.C69598b.m101013a(r6, r7)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0061:
            return r1
        L_0x0062:
            r6 = move-exception
            r7 = r6
            r6 = r8
        L_0x0065:
            throw r7     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r8 = move-exception
            p5462h.p5472e.C69598b.m101013a(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by.mo106863j(android.speech.SpeechRecognizer, com.google.android.apps.search.assistant.surfaces.dictation.service.a.by, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[Catch:{ all -> 0x0133 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00df A[SYNTHETIC, Splitter:B:55:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106864k(p5462h.p5466c.C69577g r11) {
        /*
            r10 = this;
            java.lang.String r0 = "onStarting() called when not finished or waiting to start on "
            boolean r1 = r11 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125232bw
            if (r1 == 0) goto L_0x0015
            r1 = r11
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bw r1 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125232bw) r1
            int r2 = r1.f345452f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f345452f = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bw r1 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bw
            r1.<init>(r10, r11)
        L_0x001a:
            java.lang.Object r11 = r1.f345450d
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f345452f
            r4 = 2
            r5 = 1
            r6 = 3
            r7 = 0
            if (r3 == 0) goto L_0x005a
            if (r3 == r5) goto L_0x0051
            if (r3 == r4) goto L_0x0040
            if (r3 != r6) goto L_0x0038
            java.lang.Object r0 = r1.f345448b
            java.lang.Object r1 = r1.f345447a
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x0035 }
            goto L_0x00ac
        L_0x0035:
            r11 = move-exception
            goto L_0x00ce
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0040:
            java.lang.Object r0 = r1.f345449c
            java.lang.Object r3 = r1.f345448b
            java.lang.Object r4 = r1.f345447a
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x004c }
            r5 = r0
            r0 = r3
            goto L_0x0096
        L_0x004c:
            r11 = move-exception
            r0 = r3
        L_0x004e:
            r1 = r4
            goto L_0x00ce
        L_0x0051:
            java.lang.Object r3 = r1.f345448b
            java.lang.Object r5 = r1.f345447a
            p5462h.C69714l.m101134b(r11)
            r11 = r3
            goto L_0x006c
        L_0x005a:
            p5462h.C69714l.m101134b(r11)
            kotlinx.coroutines.j.b r11 = r10.f345468n
            r1.f345447a = r10
            r1.f345448b = r11
            r1.f345452f = r5
            java.lang.Object r3 = r11.mo63025b(r7, r1)
            if (r3 == r2) goto L_0x0138
            r5 = r10
        L_0x006c:
            r3 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r3 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r3     // Catch:{ all -> 0x0133 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.au r3 = r3.f345469o     // Catch:{ all -> 0x0133 }
            boolean r8 = r3 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125205aw     // Catch:{ all -> 0x0133 }
            if (r8 == 0) goto L_0x00df
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.at r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.at     // Catch:{ all -> 0x0133 }
            r0.<init>()     // Catch:{ all -> 0x0133 }
            r3 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r3 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r3     // Catch:{ all -> 0x0133 }
            r3.f345469o = r0     // Catch:{ all -> 0x0133 }
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r0     // Catch:{ all -> 0x00c9 }
            h.f.a.l r0 = r0.f345467m     // Catch:{ all -> 0x00c9 }
            r1.f345447a = r5     // Catch:{ all -> 0x00c9 }
            r1.f345448b = r11     // Catch:{ all -> 0x00c9 }
            r1.f345449c = r5     // Catch:{ all -> 0x00c9 }
            r1.f345452f = r4     // Catch:{ all -> 0x00c9 }
            java.lang.Object r0 = r0.mo5761a(r1)     // Catch:{ all -> 0x00c9 }
            if (r0 == r2) goto L_0x00c8
            r4 = r5
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x0096:
            android.speech.SpeechRecognizer r11 = (android.speech.SpeechRecognizer) r11     // Catch:{ all -> 0x00c6 }
            r1.f345447a = r4     // Catch:{ all -> 0x00c6 }
            r1.f345448b = r0     // Catch:{ all -> 0x00c6 }
            r1.f345449c = r7     // Catch:{ all -> 0x00c6 }
            r1.f345452f = r6     // Catch:{ all -> 0x00c6 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r5     // Catch:{ all -> 0x00c6 }
            r3 = r4
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r3 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r3     // Catch:{ all -> 0x00c6 }
            java.lang.Object r11 = r5.mo106862i(r11, r3, r1)     // Catch:{ all -> 0x00c6 }
            if (r11 == r2) goto L_0x00c5
            r1 = r4
        L_0x00ac:
            r11 = r1
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r11 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r11     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ai r11 = r11.f345455a     // Catch:{ all -> 0x0035 }
            r11.mo106836a()     // Catch:{ all -> 0x0035 }
            r11 = r1
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r11 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r11     // Catch:{ all -> 0x0035 }
            kotlinx.coroutines.aw r11 = r11.f345462h     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bn r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bn     // Catch:{ all -> 0x0035 }
            r3 = r1
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r3 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r3     // Catch:{ all -> 0x0035 }
            r2.<init>(r3, r7)     // Catch:{ all -> 0x0035 }
            kotlinx.coroutines.C71803m.m105043d(r11, r7, r7, r2, r6)     // Catch:{ all -> 0x0035 }
            goto L_0x00d8
        L_0x00c5:
            return r2
        L_0x00c6:
            r11 = move-exception
            goto L_0x004e
        L_0x00c8:
            return r2
        L_0x00c9:
            r0 = move-exception
            r1 = r5
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x00ce:
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.ar r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.ar     // Catch:{ all -> 0x00da }
            r2.<init>(r11)     // Catch:{ all -> 0x00da }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r1 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r1     // Catch:{ all -> 0x00da }
            r1.mo106868o(r2)     // Catch:{ all -> 0x00da }
        L_0x00d8:
            r11 = r0
            goto L_0x0115
        L_0x00da:
            r11 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto L_0x0134
        L_0x00df:
            boolean r1 = r3 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125194al     // Catch:{ all -> 0x0133 }
            if (r1 == 0) goto L_0x011b
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125237ca.f345479a     // Catch:{ all -> 0x0133 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0133 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0133 }
            java.lang.String r1 = "onStarting() called when already finished on %s [SD]"
            r2 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r2     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = r2.mo106865l()     // Catch:{ all -> 0x0133 }
            com.google.frameworks.client.a.a.b r2 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r2)     // Catch:{ all -> 0x0133 }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0133 }
            r4 = 36468(0x8e74, float:5.1103E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x0133 }
            r0.mo56379ah(r3)     // Catch:{ all -> 0x0133 }
            r0.mo56389s(r1, r2)     // Catch:{ all -> 0x0133 }
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r0     // Catch:{ all -> 0x0133 }
            kotlinx.coroutines.aw r0 = r0.f345462h     // Catch:{ all -> 0x0133 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.bx r1 = new com.google.android.apps.search.assistant.surfaces.dictation.service.a.bx     // Catch:{ all -> 0x0133 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r5     // Catch:{ all -> 0x0133 }
            r1.<init>(r5, r7)     // Catch:{ all -> 0x0133 }
            kotlinx.coroutines.C71803m.m105043d(r0, r7, r7, r1, r6)     // Catch:{ all -> 0x0133 }
        L_0x0115:
            r11.mo63026c(r7)
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        L_0x011b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0133 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.a.by r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by) r5     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = r5.mo106865l()     // Catch:{ all -> 0x0133 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r3.<init>(r0)     // Catch:{ all -> 0x0133 }
            r3.append(r2)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0133 }
            r1.<init>(r0)     // Catch:{ all -> 0x0133 }
            throw r1     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r0 = move-exception
        L_0x0134:
            r11.mo63026c(r7)
            throw r0
        L_0x0138:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by.mo106864k(h.c.g):java.lang.Object");
    }

    /* renamed from: l */
    public final String mo106865l() {
        long j = this.f345473s;
        int i = this.f345455a.mo106844i();
        C125203au auVar = this.f345469o;
        return "{AiAiSession, id=" + j + ", clientType=" + C125192aj.m205069a(i) + ", state=" + auVar + "}";
    }

    /* renamed from: m */
    public final FileChannel mo106866m() {
        return (FileChannel) m205126p().f186052a;
    }

    /* renamed from: n */
    public final void mo106867n() {
        C71803m.m105043d(this.f345462h, (C69585o) null, (C71424ay) null, new C125220bk(this, (C69577g) null), 3);
        C125203au auVar = this.f345469o;
        if (auVar instanceof C125205aw) {
            C59052c cVar = (C59052c) C125237ca.f345479a.mo56224b();
            C61301b a = C126290c.m206496a(mo106865l());
            cVar.mo56379ah(new C59094n(36471));
            cVar.mo56389s("Finished %s before starting. [SD]", a);
            this.f345469o = C125194al.f345356a;
            C71803m.m105043d(this.f345462h, (C69585o) null, (C71424ay) null, new C125207ay(this, (C69577g) null), 3);
        } else if (auVar instanceof C125204av) {
            C59052c cVar2 = (C59052c) C125237ca.f345479a.mo56224b();
            C61301b a2 = C126290c.m206496a(mo106865l());
            cVar2.mo56379ah(new C59094n(36470));
            cVar2.mo56389s("Finished stopping %s. [SD]", a2);
            this.f345469o = C125194al.f345356a;
            C71803m.m105043d(this.f345462h, (C69585o) null, (C71424ay) null, new C125208az(this, (C69577g) null), 3);
        } else {
            String l = mo106865l();
            throw new IllegalStateException("Cannot enter Finished state for " + l + ".");
        }
    }

    /* renamed from: o */
    public final void mo106868o(C125201as asVar) {
        C125203au auVar = this.f345469o;
        if (!(auVar instanceof C125202at)) {
            String l = mo106865l();
            throw new IllegalStateException("Cannot finish Starting for " + l + ".");
        } else if (((C125202at) auVar).f345363a) {
            m205127q();
        } else {
            this.f345469o = C125196an.f345358a;
            if (C69664n.m101066l(asVar, C125198ap.f345360a)) {
                C71803m.m105043d(this.f345462h, (C69585o) null, (C71424ay) null, new C125211bb(this, (C69577g) null), 3);
            } else if (C69664n.m101066l(asVar, C125199aq.f345361a)) {
                C71803m.m105043d(this.f345462h, (C69585o) null, (C71424ay) null, new C125212bc(this, (C69577g) null), 3);
            } else if (asVar instanceof C125197ao) {
                C71803m.m105043d(this.f345462h, (C69585o) null, (C71424ay) null, new C125213bd(this, asVar, (C69577g) null), 3);
            } else if (asVar instanceof C125200ar) {
                C71803m.m105043d(this.f345462h, (C69585o) null, (C71424ay) null, new C125214be(this, asVar, (C69577g) null), 3);
            }
        }
    }

    public final String toString() {
        long j = this.f345473s;
        int i = this.f345455a.mo106844i();
        return "{AiAiSession, id=" + j + ", clientType=" + C125192aj.m205069a(i) + "}";
    }
}
