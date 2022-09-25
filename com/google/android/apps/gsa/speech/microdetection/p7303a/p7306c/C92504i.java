package com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c;

import android.content.Context;
import android.util.LruCache;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.hotword.C92354c;
import com.google.android.apps.gsa.speech.hotword.p7283b.C92351a;
import com.google.android.apps.gsa.speech.microdetection.p7303a.C92487a;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.SettableFuture;
import com.google.speech.micro.GoogleHotwordData;
import dagger.C68214a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.c.i */
/* compiled from: PG */
public final class C92504i implements C90991b {

    /* renamed from: a */
    public static final C59071e f258151a = C59071e.m91332i("com.google.android.apps.gsa.speech.microdetection.a.c.i");

    /* renamed from: w */
    private static LruCache f258152w;

    /* renamed from: A */
    private String f258153A = null;

    /* renamed from: B */
    private final C68214a f258154B;

    /* renamed from: b */
    public final Context f258155b;

    /* renamed from: c */
    C90584f f258156c = C90584f.OK_GOOGLE;

    /* renamed from: d */
    public GoogleHotwordData f258157d = null;

    /* renamed from: e */
    C92497b f258158e = null;

    /* renamed from: f */
    public String f258159f = null;

    /* renamed from: g */
    public byte[] f258160g = null;

    /* renamed from: h */
    public byte[] f258161h = null;

    /* renamed from: i */
    public byte[] f258162i = null;

    /* renamed from: j */
    public byte[] f258163j = null;

    /* renamed from: k */
    public boolean f258164k;

    /* renamed from: l */
    public C92503h f258165l = null;

    /* renamed from: m */
    public boolean f258166m;

    /* renamed from: n */
    String f258167n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f258168o = new CopyOnWriteArrayList();

    /* renamed from: p */
    public final C90021c f258169p;

    /* renamed from: q */
    public final C68214a f258170q;

    /* renamed from: r */
    public final C68214a f258171r;

    /* renamed from: s */
    public final C60887da f258172s;

    /* renamed from: t */
    public final Executor f258173t;

    /* renamed from: u */
    public int f258174u = 1;

    /* renamed from: v */
    public int f258175v = 1;

    /* renamed from: x */
    private final C22871g f258176x;

    /* renamed from: y */
    private final C89994f f258177y;

    /* renamed from: z */
    private final C68214a f258178z;

    public C92504i(Context context, C22871g gVar, C89994f fVar, C68214a aVar, C68214a aVar2, C90021c cVar, C91022f fVar2, C68214a aVar3, C68214a aVar4, C60887da daVar, Executor executor) {
        this.f258155b = context;
        this.f258176x = gVar;
        this.f258177y = fVar;
        this.f258178z = aVar;
        this.f258154B = aVar2;
        if (f258152w == null) {
            f258152w = new LruCache(true != C90772bp.m148283J(context) ? 10 : 2);
        }
        this.f258169p = cVar;
        this.f258170q = aVar3;
        this.f258171r = aVar4;
        this.f258172s = daVar;
        this.f258173t = executor;
        fVar2.mo85301a(this);
    }

    /* renamed from: n */
    private final C90580b m152152n(String str, C90584f fVar) {
        if (str == null) {
            return null;
        }
        return (C90580b) ((C92351a) this.f258178z.mo27525b()).mo87000b(fVar, C58833ax.m90834k(false)).get(C92354c.f257487a.getOrDefault(str, BuildConfig.FLAVOR));
    }

    /* renamed from: o */
    private static String m152153o(C90580b bVar) {
        if (bVar == null) {
            return null;
        }
        return bVar.f253241c;
    }

    /* renamed from: p */
    private final synchronized String m152154p(C92497b bVar) {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(String.format("Need to reinitialize for:\n%s\n", new Object[]{m152155q(bVar)}));
        C92497b bVar2 = this.f258158e;
        if (bVar2 != null) {
            sb.append(String.format("We're currently initialized for:\n%s", new Object[]{m152155q(bVar2)}));
        }
        return sb.toString();
    }

    /* renamed from: q */
    private static String m152155q(C92497b bVar) {
        return " LOC: " + bVar.f258132b + " SR: " + bVar.f258133c + " CC: " + bVar.f258134d;
    }

    /* renamed from: a */
    public final synchronized C92487a mo87261a(String str, C90584f fVar) {
        C90580b bVar = (C90580b) ((C92351a) this.f258178z.mo27525b()).mo87000b(fVar, C58833ax.m90834k(false)).get(str);
        if (bVar != null) {
            String str2 = bVar.f253242d;
            C90584f a = C90584f.m147800a(bVar.f253244f);
            if (a == null) {
                a = C90584f.OK_GOOGLE;
            }
            boolean z = bVar.f253243e;
            C58976aa aaVar = C58975e.f156826a;
            if (mo87268i(str, a)) {
                if (this.f258160g == null) {
                    if (this.f258157d == null) {
                        return new C92487a(bVar.f253242d, 2, z, a);
                    }
                }
                return new C92487a(str2, 1, z, a);
            }
            return new C92487a(str2, 0, z, a);
        }
        C59104x b = f258151a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicroDataManager");
        ((C59052c) ((C59052c) b).mo56372aa(12711)).mo56389s("Hotword configuration not present for the given locale %s", str);
        return C92487a.f258106b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0113, code lost:
        if (r4 != false) goto L_0x012b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo87262b(com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90582d r10, com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b r11, com.google.android.apps.gsa.speech.p7269b.C92216a r12, boolean r13) {
        /*
            r9 = this;
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture
            r0.<init>()
            java.lang.String r1 = r10.f253249c
            int r10 = r10.f253248b
            com.google.android.apps.gsa.shared.speech.hotword.a.f r10 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.m147800a(r10)
            if (r10 != 0) goto L_0x0011
            com.google.android.apps.gsa.shared.speech.hotword.a.f r10 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_GOOGLE
        L_0x0011:
            java.lang.String r2 = r9.mo87264e(r1, r10)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0055
            java.lang.Exception r11 = new java.lang.Exception
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r4] = r1
            int r13 = r10.f253255d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r5] = r13
            java.lang.String r13 = "Data manager cannot find model location for [locale: %s, modelType: %s]"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.<init>(r12)
            r0.mo57357o(r11)
            com.google.common.f.e r11 = f258151a
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r13 = "MicroDataManager"
            r11.mo56378ag(r12, r13)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            r12 = 12717(0x31ad, float:1.782E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r12)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            java.lang.String r12 = "Data manager cannot find model location for [locale: %s, modelType: %s]"
            java.lang.String r10 = r10.name()
            r11.mo56354G(r12, r1, r10)
            return r0
        L_0x0055:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.speech.microdetection.a.c.b r6 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b.f258129f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.speech.microdetection.a.c.a r6 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92496a) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.speech.microdetection.a.c.b r7 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b) r7
            int r8 = r7.f258131a
            r8 = r8 | r5
            r7.f258131a = r8
            r7.f258132b = r2
            int r2 = r11.f258133c
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.speech.microdetection.a.c.b r7 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b) r7
            int r8 = r7.f258131a
            r3 = r3 | r8
            r7.f258131a = r3
            r7.f258133c = r2
            int r2 = r11.f258134d
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.android.apps.gsa.speech.microdetection.a.c.b r3 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b) r3
            int r7 = r3.f258131a
            r7 = r7 | 4
            r3.f258131a = r7
            r3.f258134d = r2
            int r11 = r11.f258135e
            r6.copyOnWrite()
            com.google.protobuf.bv r2 = r6.instance
            com.google.android.apps.gsa.speech.microdetection.a.c.b r2 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b) r2
            int r3 = r2.f258131a
            r3 = r3 | 8
            r2.f258131a = r3
            r2.f258135e = r11
            com.google.protobuf.bv r11 = r6.build()
            com.google.android.apps.gsa.speech.microdetection.a.c.b r11 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b) r11
            com.google.android.apps.gsa.shared.m.c r2 = r9.f258169p
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249918ah
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x00eb
            com.google.android.apps.gsa.shared.m.c r2 = r9.f258169p
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249871N
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x00ba
            goto L_0x00eb
        L_0x00ba:
            monitor-enter(r9)
            com.google.android.apps.gsa.speech.microdetection.a.c.b r2 = r9.f258158e     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00c6
            boolean r2 = com.google.common.base.C58832aw.m90831a(r11, r2)     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00c6
            r4 = 1
        L_0x00c6:
            com.google.common.f.e r2 = f258151a     // Catch:{ all -> 0x00e8 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x00e8 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = "MicroDataManager"
            r2.mo56378ag(r3, r6)     // Catch:{ all -> 0x00e8 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00e8 }
            r3 = 12738(0x31c2, float:1.785E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x00e8 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00e8 }
            java.lang.String r3 = "isInitializedWithLatestParams-%b"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x00e8 }
            r2.mo56389s(r3, r6)     // Catch:{ all -> 0x00e8 }
            monitor-exit(r9)     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00e8 }
            throw r10
        L_0x00eb:
            r4 = 1
        L_0x00ec:
            boolean r2 = r9.mo87268i(r1, r10)
            if (r2 == 0) goto L_0x0113
            boolean r2 = r9.mo87269j()
            if (r2 == 0) goto L_0x0113
            if (r4 != 0) goto L_0x00fb
            goto L_0x0116
        L_0x00fb:
            com.google.common.f.e r10 = f258151a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "MicroDataManager"
            r10.mo56378ag(r13, r1)
            java.lang.String r13 = "Already initialized, obtaining the hotword data immediately."
            r1 = 12716(0x31ac, float:1.7819E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r13)
            r9.mo87266g(r11, r12, r0)
            return r0
        L_0x0113:
            if (r4 == 0) goto L_0x0116
            goto L_0x012b
        L_0x0116:
            com.google.common.f.e r13 = f258151a
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "MicroDataManager"
            r13.mo56378ag(r2, r3)
            java.lang.String r2 = "Hotword params have changed! Reinitializing..."
            r3 = 12715(0x31ab, float:1.7818E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r3)).mo56386p(r2)
            r13 = 1
        L_0x012b:
            com.google.android.apps.gsa.speech.microdetection.a.c.c r2 = new com.google.android.apps.gsa.speech.microdetection.a.c.c
            r2.<init>(r9, r11, r12, r0)
            r9.mo87265f(r1, r2, r13, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i.mo87262b(com.google.android.apps.gsa.shared.speech.hotword.a.d, com.google.android.apps.gsa.speech.microdetection.a.c.b, com.google.android.apps.gsa.speech.b.a, boolean):com.google.common.util.concurrent.cx");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r0 = (com.google.speech.micro.GoogleHotwordData) f258152w.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r0 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r14 = com.google.common.p4526f.p4527a.C58975e.f156826a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r12.f258157d = r0;
        r12.f258175v = 5;
        r12.f258160g = null;
        r12.f258174u = 6;
        r12.f258159f = null;
        r12.f258158e = r13;
        r13 = f258151a.mo56224b();
        r13.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MicroDataManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(12725)).mo56389s("#getGoogleHotwordData, reset hotwordModel to null and returning the cached version of googleHotwordData %s", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        if (r12.f258158e == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r12.f258169p.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90082eg.f249871N) != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        r0 = f258151a.mo56225c();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MicroDataManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(12724)).mo56389s("Need to reinitialize for:\n%s", r13);
        r14.mo70939a(new com.google.android.apps.gsa.shared.speech.p7139a.C90515g(m152154p(r13), 524295, true));
        r12.f258175v = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        if (r12.f258160g != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r13 = r13.f258132b;
        r0 = f258151a.mo56225c();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MicroDataManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(12723)).mo56389s("Need to initialize - Attempted hotword recognition with missing model from %s", r13);
        r14.mo70939a(new com.google.android.apps.gsa.shared.speech.p7139a.C90515g(java.lang.String.format("No hotword model available from:\n%s", new java.lang.Object[]{r13}), 524295, true));
        r12.f258175v = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e7, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e9, code lost:
        r0 = r13.f258132b;
        r3 = r12.f258159f;
        r5 = f258151a;
        r6 = r5.mo56224b();
        r6.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MicroDataManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(12718)).mo56354G("#getGoogleHotwordData desiredModel %s, sourceLocationOfCurrentHotwordModel %s", r0, r12.f258159f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010e, code lost:
        if ((r13.f258131a & 1) == 0) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0114, code lost:
        if (r0.equals(r3) == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0116, code lost:
        r0 = r5.mo56224b();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MicroDataManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(12719)).mo56386p("Obtaining new data for new params.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7304a.C92488a.m152144a().mo87258b(r12.f258160g, r13.f258133c, r13.f258134d, r13.f258135e, false);
        r12.f258157d = r0;
        r12.f258158e = r13;
        f258152w.put(r13, r0);
        r0 = r5.mo56224b();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MicroDataManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(12720)).mo56389s("Created a new hotword model for:\n%s", m152155q(r13));
        r12.f258175v = 8;
        r13 = r12.f258157d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0172, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0173, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0174, code lost:
        r0 = f258151a.mo56225c();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MicroDataManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r13)).mo56372aa(12722)).mo56386p("Failed to load hotword library");
        r0 = new com.google.android.apps.gsa.shared.speech.p7139a.C90515g("Failed to load the hotword library", r13, 524297, true);
        ((com.google.android.apps.gsa.shared.logger.C89911f) r12.f258154B.mo27525b()).mo83755a(r0, 13633456, 29).mo83721a();
        r14.mo70939a(r0);
        r12.f258175v = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01bc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01bd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01bf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c0, code lost:
        r1 = f258151a.mo56225c();
        r1.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MicroDataManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(12721)).mo56359L("Exception thrown by createHotwordData for model at: %s, sampling rate: %d, model size: %d", r13.f258132b, java.lang.Integer.valueOf(r13.f258133c), java.lang.Integer.valueOf(r12.f258160g.length));
        r14.mo70939a(new com.google.android.apps.gsa.shared.speech.p7139a.C90515g("Failed to create GoogleHotwordData object", r0, com.google.android.apps.gsa.shared.logger.p7054d.C89885b.RECOGNIZER_HOTWORD_FAILED_TO_CREATE_GOOGLEHOTWORDDATA_OBJ_VALUE, true));
        r12.f258175v = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0204, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0205, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0206, code lost:
        r14.mo70939a(new com.google.android.apps.gsa.shared.speech.p7139a.C90515g(java.lang.String.format("Trying to create GoogleHotwordData using %s, but we're initialized for %s", new java.lang.Object[]{r0, r3}), 524290, true));
        r12.f258175v = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0222, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0223, code lost:
        return null;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.speech.micro.GoogleHotwordData mo87263c(com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b r13, com.google.android.apps.gsa.speech.p7269b.C92216a r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            com.google.android.apps.gsa.speech.microdetection.a.c.b r0 = r12.f258158e     // Catch:{ all -> 0x0227 }
            if (r0 == 0) goto L_0x0032
            boolean r0 = com.google.common.base.C58832aw.m90831a(r13, r0)     // Catch:{ all -> 0x0227 }
            if (r0 == 0) goto L_0x0032
            com.google.common.f.e r14 = f258151a     // Catch:{ all -> 0x0227 }
            com.google.common.f.x r14 = r14.mo56224b()     // Catch:{ all -> 0x0227 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0227 }
            java.lang.String r1 = "MicroDataManager"
            r14.mo56378ag(r0, r1)     // Catch:{ all -> 0x0227 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x0227 }
            r0 = 12727(0x31b7, float:1.7834E-41)
            com.google.common.f.x r14 = r14.mo56372aa(r0)     // Catch:{ all -> 0x0227 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x0227 }
            java.lang.String r0 = "Returning previous model again for:\n%s"
            java.lang.String r13 = m152155q(r13)     // Catch:{ all -> 0x0227 }
            r14.mo56389s(r0, r13)     // Catch:{ all -> 0x0227 }
            r13 = 4
            r12.f258175v = r13     // Catch:{ all -> 0x0227 }
            com.google.speech.micro.GoogleHotwordData r13 = r12.f258157d     // Catch:{ all -> 0x0227 }
            monitor-exit(r12)     // Catch:{ all -> 0x0227 }
            return r13
        L_0x0032:
            monitor-exit(r12)     // Catch:{ all -> 0x0227 }
            android.util.LruCache r0 = f258152w
            java.lang.Object r0 = r0.get(r13)
            com.google.speech.micro.GoogleHotwordData r0 = (com.google.speech.micro.GoogleHotwordData) r0
            r1 = 6
            r2 = 0
            if (r0 == 0) goto L_0x0070
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            monitor-enter(r12)
            r12.f258157d = r0     // Catch:{ all -> 0x006d }
            r14 = 5
            r12.f258175v = r14     // Catch:{ all -> 0x006d }
            r12.f258160g = r2     // Catch:{ all -> 0x006d }
            r12.f258174u = r1     // Catch:{ all -> 0x006d }
            r12.f258159f = r2     // Catch:{ all -> 0x006d }
            r12.f258158e = r13     // Catch:{ all -> 0x006d }
            com.google.common.f.e r13 = f258151a     // Catch:{ all -> 0x006d }
            com.google.common.f.x r13 = r13.mo56224b()     // Catch:{ all -> 0x006d }
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "MicroDataManager"
            r13.mo56378ag(r14, r1)     // Catch:{ all -> 0x006d }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x006d }
            r14 = 12725(0x31b5, float:1.7832E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r14)     // Catch:{ all -> 0x006d }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x006d }
            java.lang.String r14 = "#getGoogleHotwordData, reset hotwordModel to null and returning the cached version of googleHotwordData %s"
            r13.mo56389s(r14, r0)     // Catch:{ all -> 0x006d }
            monitor-exit(r12)     // Catch:{ all -> 0x006d }
            return r0
        L_0x006d:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x006d }
            throw r13
        L_0x0070:
            monitor-enter(r12)
            com.google.android.apps.gsa.speech.microdetection.a.c.b r0 = r12.f258158e     // Catch:{ all -> 0x0224 }
            r3 = 524295(0x80007, float:7.34694E-40)
            r4 = 1
            if (r0 == 0) goto L_0x00af
            com.google.android.apps.gsa.shared.m.c r0 = r12.f258169p     // Catch:{ all -> 0x0224 }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249871N     // Catch:{ all -> 0x0224 }
            boolean r0 = r0.mo79746e(r5)     // Catch:{ all -> 0x0224 }
            if (r0 != 0) goto L_0x00af
            com.google.common.f.e r0 = f258151a     // Catch:{ all -> 0x0224 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0224 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0224 }
            java.lang.String r6 = "MicroDataManager"
            r0.mo56378ag(r5, r6)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0224 }
            r5 = 12724(0x31b4, float:1.783E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = "Need to reinitialize for:\n%s"
            r0.mo56389s(r5, r13)     // Catch:{ all -> 0x0224 }
            com.google.android.apps.gsa.shared.speech.a.g r0 = new com.google.android.apps.gsa.shared.speech.a.g     // Catch:{ all -> 0x0224 }
            java.lang.String r13 = r12.m152154p(r13)     // Catch:{ all -> 0x0224 }
            r0.<init>(r13, r3, r4)     // Catch:{ all -> 0x0224 }
            r14.mo70939a(r0)     // Catch:{ all -> 0x0224 }
            r12.f258175v = r1     // Catch:{ all -> 0x0224 }
            monitor-exit(r12)     // Catch:{ all -> 0x0224 }
            return r2
        L_0x00af:
            byte[] r0 = r12.f258160g     // Catch:{ all -> 0x0224 }
            r1 = 0
            if (r0 != 0) goto L_0x00e9
            java.lang.String r13 = r13.f258132b     // Catch:{ all -> 0x0224 }
            com.google.common.f.e r0 = f258151a     // Catch:{ all -> 0x0224 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0224 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0224 }
            java.lang.String r6 = "MicroDataManager"
            r0.mo56378ag(r5, r6)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0224 }
            r5 = 12723(0x31b3, float:1.7829E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = "Need to initialize - Attempted hotword recognition with missing model from %s"
            r0.mo56389s(r5, r13)     // Catch:{ all -> 0x0224 }
            com.google.android.apps.gsa.shared.speech.a.g r0 = new com.google.android.apps.gsa.shared.speech.a.g     // Catch:{ all -> 0x0224 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0224 }
            r5[r1] = r13     // Catch:{ all -> 0x0224 }
            java.lang.String r13 = "No hotword model available from:\n%s"
            java.lang.String r13 = java.lang.String.format(r13, r5)     // Catch:{ all -> 0x0224 }
            r0.<init>(r13, r3, r4)     // Catch:{ all -> 0x0224 }
            r14.mo70939a(r0)     // Catch:{ all -> 0x0224 }
            r13 = 7
            r12.f258175v = r13     // Catch:{ all -> 0x0224 }
            monitor-exit(r12)     // Catch:{ all -> 0x0224 }
            return r2
        L_0x00e9:
            java.lang.String r0 = r13.f258132b     // Catch:{ all -> 0x0224 }
            java.lang.String r3 = r12.f258159f     // Catch:{ all -> 0x0224 }
            com.google.common.f.e r5 = f258151a     // Catch:{ all -> 0x0224 }
            com.google.common.f.x r6 = r5.mo56224b()     // Catch:{ all -> 0x0224 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0224 }
            java.lang.String r8 = "MicroDataManager"
            r6.mo56378ag(r7, r8)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0224 }
            r7 = 12718(0x31ae, float:1.7822E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r7)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0224 }
            java.lang.String r7 = "#getGoogleHotwordData desiredModel %s, sourceLocationOfCurrentHotwordModel %s"
            java.lang.String r8 = r12.f258159f     // Catch:{ all -> 0x0224 }
            r6.mo56354G(r7, r0, r8)     // Catch:{ all -> 0x0224 }
            int r6 = r13.f258131a     // Catch:{ all -> 0x0224 }
            r6 = r6 & r4
            if (r6 == 0) goto L_0x0206
            boolean r6 = r0.equals(r3)     // Catch:{ all -> 0x0224 }
            if (r6 == 0) goto L_0x0206
            com.google.common.f.x r0 = r5.mo56224b()     // Catch:{ all -> 0x0224 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0224 }
            java.lang.String r3 = "MicroDataManager"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0224 }
            r1 = 12719(0x31af, float:1.7823E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0224 }
            java.lang.String r1 = "Obtaining new data for new params."
            r0.mo56386p(r1)     // Catch:{ all -> 0x0224 }
            com.google.android.apps.gsa.speech.microdetection.a.a.a r6 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7304a.C92488a.m152144a()     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            byte[] r0 = r12.f258160g     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            r7 = r0
            byte[] r7 = (byte[]) r7     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            int r8 = r13.f258133c     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            int r9 = r13.f258134d     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            int r10 = r13.f258135e     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            r11 = 0
            com.google.speech.micro.GoogleHotwordData r0 = r6.mo87258b(r7, r8, r9, r10, r11)     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            r12.f258157d = r0     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            r12.f258158e = r13     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            android.util.LruCache r1 = f258152w     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            r1.put(r13, r0)     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            com.google.common.f.x r0 = r5.mo56224b()     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            java.lang.String r3 = "MicroDataManager"
            r0.mo56378ag(r1, r3)     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            r1 = 12720(0x31b0, float:1.7825E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            java.lang.String r1 = "Created a new hotword model for:\n%s"
            java.lang.String r3 = m152155q(r13)     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            r0.mo56389s(r1, r3)     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            r0 = 8
            r12.f258175v = r0     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            com.google.speech.micro.GoogleHotwordData r13 = r12.f258157d     // Catch:{ IllegalStateException -> 0x01bf, IllegalArgumentException -> 0x01bd, UnsatisfiedLinkError -> 0x0173 }
            monitor-exit(r12)     // Catch:{ all -> 0x0224 }
            return r13
        L_0x0173:
            r13 = move-exception
            com.google.common.f.e r0 = f258151a     // Catch:{ all -> 0x0224 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0224 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0224 }
            java.lang.String r3 = "MicroDataManager"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0224 }
            com.google.common.f.x r0 = r0.mo56382g(r13)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0224 }
            r1 = 12722(0x31b2, float:1.7827E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0224 }
            java.lang.String r1 = "Failed to load hotword library"
            r0.mo56386p(r1)     // Catch:{ all -> 0x0224 }
            com.google.android.apps.gsa.shared.speech.a.g r0 = new com.google.android.apps.gsa.shared.speech.a.g     // Catch:{ all -> 0x0224 }
            java.lang.String r1 = "Failed to load the hotword library"
            r3 = 524297(0x80009, float:7.34697E-40)
            r0.<init>(r1, r13, r3, r4)     // Catch:{ all -> 0x0224 }
            dagger.a r13 = r12.f258154B     // Catch:{ all -> 0x0224 }
            java.lang.Object r13 = r13.mo27525b()     // Catch:{ all -> 0x0224 }
            com.google.android.apps.gsa.shared.logger.f r13 = (com.google.android.apps.gsa.shared.logger.C89911f) r13     // Catch:{ all -> 0x0224 }
            r1 = 13633456(0xd007b0, float:1.9104541E-38)
            r3 = 29
            com.google.android.apps.gsa.shared.logger.e r13 = r13.mo83755a(r0, r1, r3)     // Catch:{ all -> 0x0224 }
            r13.mo83721a()     // Catch:{ all -> 0x0224 }
            r14.mo70939a(r0)     // Catch:{ all -> 0x0224 }
            r13 = 10
            r12.f258175v = r13     // Catch:{ all -> 0x0224 }
            monitor-exit(r12)     // Catch:{ all -> 0x0224 }
            return r2
        L_0x01bd:
            r0 = move-exception
            goto L_0x01c0
        L_0x01bf:
            r0 = move-exception
        L_0x01c0:
            com.google.common.f.e r1 = f258151a     // Catch:{ all -> 0x0224 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0224 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = "MicroDataManager"
            r1.mo56378ag(r3, r5)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0224 }
            com.google.common.f.x r1 = r1.mo56382g(r0)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0224 }
            r3 = 12721(0x31b1, float:1.7826E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ all -> 0x0224 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0224 }
            java.lang.String r3 = "Exception thrown by createHotwordData for model at: %s, sampling rate: %d, model size: %d"
            java.lang.String r5 = r13.f258132b     // Catch:{ all -> 0x0224 }
            int r13 = r13.f258133c     // Catch:{ all -> 0x0224 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0224 }
            byte[] r6 = r12.f258160g     // Catch:{ all -> 0x0224 }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x0224 }
            int r6 = r6.length     // Catch:{ all -> 0x0224 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0224 }
            r1.mo56359L(r3, r5, r13, r6)     // Catch:{ all -> 0x0224 }
            com.google.android.apps.gsa.shared.speech.a.g r13 = new com.google.android.apps.gsa.shared.speech.a.g     // Catch:{ all -> 0x0224 }
            java.lang.String r1 = "Failed to create GoogleHotwordData object"
            r3 = 524304(0x80010, float:7.34706E-40)
            r13.<init>(r1, r0, r3, r4)     // Catch:{ all -> 0x0224 }
            r14.mo70939a(r13)     // Catch:{ all -> 0x0224 }
            r13 = 9
            r12.f258175v = r13     // Catch:{ all -> 0x0224 }
            monitor-exit(r12)     // Catch:{ all -> 0x0224 }
            return r2
        L_0x0206:
            com.google.android.apps.gsa.shared.speech.a.g r13 = new com.google.android.apps.gsa.shared.speech.a.g     // Catch:{ all -> 0x0224 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0224 }
            r5[r1] = r0     // Catch:{ all -> 0x0224 }
            r5[r4] = r3     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "Trying to create GoogleHotwordData using %s, but we're initialized for %s"
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ all -> 0x0224 }
            r1 = 524290(0x80002, float:7.34687E-40)
            r13.<init>(r0, r1, r4)     // Catch:{ all -> 0x0224 }
            r14.mo70939a(r13)     // Catch:{ all -> 0x0224 }
            r13 = 11
            r12.f258175v = r13     // Catch:{ all -> 0x0224 }
            monitor-exit(r12)     // Catch:{ all -> 0x0224 }
            return r2
        L_0x0224:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0224 }
            throw r13
        L_0x0227:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0227 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i.mo87263c(com.google.android.apps.gsa.speech.microdetection.a.c.b, com.google.android.apps.gsa.speech.b.a):com.google.speech.micro.GoogleHotwordData");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo87264e(String str, C90584f fVar) {
        boolean z = false;
        C90580b bVar = (C90580b) ((C92351a) this.f258178z.mo27525b()).mo87000b(fVar, C58833ax.m90834k(false)).get(str);
        if (bVar != null) {
            C59104x b = f258151a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDataManager");
            ((C59052c) ((C59052c) b).mo56372aa(12730)).mo56359L("Location for model with model type: %s and locale: %s, is : %s", fVar, str, bVar.f253241c);
            return bVar.f253241c;
        }
        C59071e eVar = f258151a;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "MicroDataManager");
        ((C59052c) ((C59052c) b2).mo56372aa(12728)).mo56389s("locale is %s", str);
        C90580b n = m152152n(str, fVar);
        C59104x c = eVar.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MicroDataManager");
        C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(12729);
        String name = fVar.name();
        if (n == null) {
            z = true;
        }
        cVar.mo56360M("Location of model with model type: %s and locale: %s is null. HotwordLocaleConfig for re-mapped Chinese locale is null: %b, and getLocationForReMappedLocale is %s", name, str, Boolean.valueOf(z), m152153o(n));
        return null;
    }

    /* renamed from: f */
    public final synchronized void mo87265f(String str, Runnable runnable, boolean z, C90584f fVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!z && str.equals(this.f258153A) && fVar == this.f258156c) {
            if (mo87269j()) {
                if (this.f258164k) {
                    this.f258168o.add(runnable);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            }
        }
        C92503h hVar = this.f258165l;
        if (hVar != null) {
            C59104x b = f258151a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDataManager");
            ((C59052c) ((C59052c) b).mo56372aa(12732)).mo56386p("Cancelling previous initialization task.");
            hVar.f258149d = true;
        }
        if (z) {
            f258152w.evictAll();
            this.f258157d = null;
            this.f258175v = 3;
            this.f258158e = null;
        }
        this.f258160g = null;
        this.f258174u = 2;
        this.f258159f = null;
        this.f258161h = null;
        this.f258162i = null;
        this.f258163j = null;
        this.f258153A = str;
        this.f258156c = fVar;
        this.f258164k = true;
        this.f258168o.clear();
        this.f258168o.add(runnable);
        C92503h hVar2 = new C92503h(this, str, fVar);
        this.f258165l = hVar2;
        this.f258176x.mo28212l(hVar2.f258146a, hVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo87266g(C92497b bVar, C92216a aVar, SettableFuture settableFuture) {
        GoogleHotwordData c = mo87263c(bVar, aVar);
        if (c == null) {
            settableFuture.mo57357o(new Exception(String.format("Data manager is initialized but has no model for [location: %s]", new Object[]{bVar.f258132b})));
            return;
        }
        settableFuture.mo57356n(c);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getSimpleName());
        boolean z = true;
        if (this.f258177y != null) {
            C91005e c = fVar.mo85279c("Speaker model present=");
            C89994f fVar2 = this.f258177y;
            c.mo85276a(C90752i.m148228b(Boolean.valueOf(fVar2.mo83841D(fVar2.mo83882ab()) != null)));
        }
        synchronized (this) {
            fVar.mo85279c("Last known locale=").mo85276a(C90752i.m148229c(this.f258153A));
            fVar.mo85279c("re-mapped Chinese locale=").mo85276a(C90752i.m148229c((CharSequence) C92354c.f257487a.getOrDefault(this.f258153A, BuildConfig.FLAVOR)));
            fVar.mo85279c("Last known model type=").mo85276a(C90752i.m148231e(this.f258156c));
            fVar.mo85279c("Hotword model present=").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f258160g != null)));
            C91005e c2 = fVar.mo85279c("How did we get hotword model=");
            int i = this.f258174u;
            String a = C92500e.m152148a(i);
            if (i != 0) {
                c2.mo85276a(C90752i.m148229c(a));
                C91005e c3 = fVar.mo85279c("How did we get hotword data=");
                int i2 = this.f258175v;
                String a2 = C92499d.m152147a(i2);
                if (i2 != 0) {
                    c3.mo85276a(C90752i.m148229c(a2));
                    fVar.mo85279c("model location config is null").mo85276a(C90752i.m148228b(Boolean.valueOf(!((C92351a) this.f258178z.mo27525b()).mo87000b(this.f258156c, C58833ax.m90834k(false)).containsKey(this.f258153A))));
                    if (this.f258153A != null) {
                        C91005e c4 = fVar.mo85279c("model location is null=");
                        String str = this.f258153A;
                        str.getClass();
                        c4.mo85276a(C90752i.m148228b(Boolean.valueOf(mo87264e(str, this.f258156c) == null)));
                        C91005e c5 = fVar.mo85279c("mdd group name =");
                        String str2 = this.f258153A;
                        str2.getClass();
                        c5.mo85276a(C90752i.m148229c(C92354c.m151657c(str2, this.f258156c)));
                    }
                    fVar.mo85279c("model location for re-mapped locale is null=").mo85276a(C90752i.m148228b(Boolean.valueOf(m152153o(m152152n(this.f258153A, this.f258156c)) == null)));
                    C91005e c6 = fVar.mo85279c("model location config for re-mapped locale is null=");
                    if (m152152n(this.f258153A, this.f258156c) != null) {
                        z = false;
                    }
                    c6.mo85276a(C90752i.m148228b(Boolean.valueOf(z)));
                    fVar.mo85279c("locale remap happened =").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f258166m)));
                    fVar.mo85279c("hotword model error =").mo85276a(C90752i.m148229c(this.f258167n));
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        return r5;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo87267h(java.lang.String r5, com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo87268i(r5, r6)     // Catch:{ all -> 0x004b }
            byte[] r1 = r4.f258160g     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0039
            com.google.speech.micro.GoogleHotwordData r1 = r4.f258157d     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0039
            com.google.common.f.e r1 = f258151a     // Catch:{ all -> 0x004b }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x004b }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x004b }
            java.lang.String r3 = "MicroDataManager"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x004b }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x004b }
            r2 = 12734(0x31be, float:1.7844E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x004b }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x004b }
            java.lang.String r2 = r4.f258159f     // Catch:{ all -> 0x004b }
            java.lang.String r5 = r4.mo87264e(r5, r6)     // Catch:{ all -> 0x004b }
            com.google.android.apps.gsa.speech.microdetection.a.c.b r6 = r4.f258158e     // Catch:{ all -> 0x004b }
            if (r6 != 0) goto L_0x0030
            r6 = 0
            goto L_0x0034
        L_0x0030:
            java.lang.String r6 = m152155q(r6)     // Catch:{ all -> 0x004b }
        L_0x0034:
            java.lang.String r3 = "Both hotwordModel and googleHotwordData are null! sourceLocationOfCurrentHotwordModel is %s, modelLocationForLocale(locale, modelType) is %s, paramsForCurrentGoogleHotwordData is %s "
            r1.mo56359L(r3, r2, r5, r6)     // Catch:{ all -> 0x004b }
        L_0x0039:
            r5 = 0
            if (r0 == 0) goto L_0x0049
            byte[] r6 = r4.f258160g     // Catch:{ all -> 0x004b }
            r0 = 1
            if (r6 != 0) goto L_0x0048
            com.google.speech.micro.GoogleHotwordData r6 = r4.f258157d     // Catch:{ all -> 0x004b }
            if (r6 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            monitor-exit(r4)
            return r0
        L_0x0048:
            r5 = 1
        L_0x0049:
            monitor-exit(r4)
            return r5
        L_0x004b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i.mo87267h(java.lang.String, com.google.android.apps.gsa.shared.speech.hotword.a.f):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return false;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo87268i(java.lang.String r3, com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f258153A     // Catch:{ all -> 0x0019 }
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x0019 }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r0 = r2.f258156c     // Catch:{ all -> 0x0019 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0019 }
            boolean r1 = r2.f258164k     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0016
            if (r3 == 0) goto L_0x0016
            if (r4 != r0) goto L_0x0016
            monitor-exit(r2)
            r3 = 1
            return r3
        L_0x0016:
            monitor-exit(r2)
            r3 = 0
            return r3
        L_0x0019:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i.mo87268i(java.lang.String, com.google.android.apps.gsa.shared.speech.hotword.a.f):boolean");
    }

    /* renamed from: k */
    public final synchronized byte[] mo87270k() {
        return this.f258162i;
    }

    /* renamed from: l */
    public final synchronized byte[] mo87271l() {
        return this.f258163j;
    }

    /* renamed from: m */
    public final synchronized byte[] mo87272m(String str, C90584f fVar) {
        C58976aa aaVar = C58975e.f156826a;
        C58838bb.m90883r(mo87268i(str, fVar));
        return this.f258161h;
    }

    /* renamed from: j */
    public final synchronized boolean mo87269j() {
        String str;
        String str2 = this.f258159f;
        boolean z = true;
        if (str2 == null || (str = this.f258153A) == null) {
            C59104x d = f258151a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicroDataManager");
            C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(12736);
            String str3 = this.f258159f;
            String str4 = this.f258153A;
            Boolean valueOf = Boolean.valueOf(this.f258160g == null);
            if (this.f258157d != null) {
                z = false;
            }
            cVar.mo56360M("isInitializedWithLatestHotwordModel is false sourceLocationOfCurrentHotwordModel is %s, locale is %s, hotwordModel is null %b, googleHotwordData is null %b ", str3, str4, valueOf, Boolean.valueOf(z));
            return false;
        } else if (str2.equals(mo87264e(str, this.f258156c))) {
            return true;
        } else {
            C59104x b = f258151a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDataManager");
            C59052c cVar2 = (C59052c) ((C59052c) b).mo56372aa(12737);
            String str5 = this.f258159f;
            String str6 = this.f258153A;
            str6.getClass();
            String e = mo87264e(str6, this.f258156c);
            Boolean valueOf2 = Boolean.valueOf(this.f258160g == null);
            if (this.f258157d != null) {
                z = false;
            }
            Boolean valueOf3 = Boolean.valueOf(z);
            int i = this.f258174u;
            String a = C92500e.m152148a(i);
            if (i != 0) {
                int i2 = this.f258175v;
                String a2 = C92499d.m152147a(i2);
                if (i2 != 0) {
                    cVar2.mo56362O("sourceLocationOfCurrentHotwordModel is %s, modelLocationForLocale(locale, modelType) is %s, hotwordModel is null %b, googleHotwordData is null %b , howDidWeGetHotwordModel: %s,  howDidWeGetGoogleHotwordData: %s", str5, e, valueOf2, valueOf3, a, a2);
                    return false;
                }
                throw null;
            }
            throw null;
        }
    }
}
