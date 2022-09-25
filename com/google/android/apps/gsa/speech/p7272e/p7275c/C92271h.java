package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92240b;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92247i;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92255q;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92256r;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92260v;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92261w;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60917ed;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.speech.recognizer.p5233a.C67453av;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.speech.e.c.h */
/* compiled from: PG */
public final class C92271h implements C92247i {

    /* renamed from: a */
    public static final C59071e f257282a = C59071e.m91332i("com.google.android.apps.gsa.speech.e.c.h");

    /* renamed from: b */
    public final C22871g f257283b;

    /* renamed from: c */
    private final C92248j f257284c;

    /* renamed from: d */
    private final C92255q f257285d;

    /* renamed from: e */
    private final C92240b f257286e;

    /* renamed from: f */
    private final C89911f f257287f;

    /* renamed from: g */
    private final HashMap f257288g = new HashMap();

    /* renamed from: h */
    private boolean f257289h;

    /* renamed from: i */
    private Future f257290i;

    /* renamed from: j */
    private C92274k f257291j;

    /* renamed from: k */
    private Long f257292k;

    public C92271h(C92248j jVar, C92255q qVar, C92240b bVar, C90821bm bmVar, C89911f fVar) {
        this.f257284c = jVar;
        this.f257285d = qVar;
        this.f257286e = bVar;
        this.f257283b = bmVar.mo85163a(C92269f.class);
        this.f257287f = fVar;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: i */
    private final C58485gu m151502i(C92252n nVar, C92249k kVar, C92260v vVar) {
        C92249k[] kVarArr;
        C92255q qVar;
        C58838bb.m90883r((nVar == C92252n.GRAMMAR && kVar == null) ? false : true);
        if (nVar == C92252n.GRAMMAR) {
            kVarArr = new C92249k[]{kVar};
        } else if (nVar == C92252n.VOICE_ACTIONS) {
            kVarArr = kVar != null ? new C92249k[]{kVar} : C92261w.f257247b.f257250e;
        } else {
            kVarArr = new C92249k[0];
        }
        C58480gp e = C58485gu.m89837e();
        for (C92249k kVar2 : kVarArr) {
            String str = null;
            if (!(kVar2 == null || (qVar = this.f257285d) == null)) {
                String a = qVar.mo86936a(kVar2);
                C58976aa aaVar = C58975e.f156826a;
                str = vVar.mo86942c(kVar2, a);
            }
            if (str == null) {
                C58976aa aaVar2 = C58975e.f156826a;
            } else {
                e.mo55395g(str);
                C58976aa aaVar3 = C58975e.f156826a;
            }
        }
        return e.mo55394f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.apps.gsa.speech.p7272e.p7275c.C92270g mo86951b(java.lang.String r10, com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n r11, com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.common.f.e r0 = f257282a     // Catch:{ all -> 0x008a }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x008a }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "Greco3EngineManager"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x008a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x008a }
            r1 = 12342(0x3036, float:1.7295E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x008a }
            r1 = r0
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x008a }
            java.util.concurrent.Future r0 = r9.f257290i     // Catch:{ all -> 0x008a }
            r7 = 0
            r8 = 1
            if (r0 != 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            java.lang.String r2 = "getResources: locale %s, mode %s, grammarType %s, %b"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x008a }
            r3 = r10
            r4 = r11
            r5 = r12
            r1.mo56360M(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008a }
            com.google.android.apps.gsa.speech.e.b.n r0 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.GRAMMAR     // Catch:{ all -> 0x008a }
            if (r11 != r0) goto L_0x0034
            if (r12 == 0) goto L_0x0035
        L_0x0034:
            r7 = 1
        L_0x0035:
            com.google.common.base.C58838bb.m90868c(r7)     // Catch:{ all -> 0x008a }
            java.util.concurrent.Future r0 = r9.f257290i     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0041
            com.google.android.apps.gsa.speech.e.c.k r0 = r9.f257291j     // Catch:{ all -> 0x008a }
            r9.mo86955f(r0)     // Catch:{ all -> 0x008a }
        L_0x0041:
            java.util.HashMap r0 = r9.f257288g     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x008a }
            com.google.android.apps.gsa.speech.e.c.g r0 = (com.google.android.apps.gsa.speech.p7272e.p7275c.C92270g) r0     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = r0.f257277c     // Catch:{ all -> 0x008a }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0062
            com.google.android.apps.gsa.speech.e.b.n r1 = r0.f257278d     // Catch:{ all -> 0x008a }
            if (r11 != r1) goto L_0x0062
            com.google.android.apps.gsa.speech.e.b.n r1 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.GRAMMAR     // Catch:{ all -> 0x008a }
            if (r11 != r1) goto L_0x0060
            com.google.android.apps.gsa.speech.e.b.k r1 = r0.f257281g     // Catch:{ all -> 0x008a }
            if (r12 == r1) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            monitor-exit(r9)
            return r0
        L_0x0062:
            com.google.android.apps.gsa.speech.e.b.r r0 = r0.f257275a     // Catch:{ all -> 0x008a }
            r0.mo59861b()     // Catch:{ all -> 0x008a }
            java.util.HashMap r0 = r9.f257288g     // Catch:{ all -> 0x008a }
            r0.remove(r11)     // Catch:{ all -> 0x008a }
        L_0x006c:
            com.google.android.apps.gsa.speech.e.c.g r10 = r9.mo86952c(r10, r11, r12)     // Catch:{ all -> 0x008a }
            r12 = 0
            if (r10 != 0) goto L_0x007f
            boolean r0 = r11.mo86935b()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x007f
            java.lang.String r10 = "en-US"
            com.google.android.apps.gsa.speech.e.c.g r10 = r9.mo86952c(r10, r11, r12)     // Catch:{ all -> 0x008a }
        L_0x007f:
            if (r10 == 0) goto L_0x0088
            java.util.HashMap r12 = r9.f257288g     // Catch:{ all -> 0x008a }
            r12.put(r11, r10)     // Catch:{ all -> 0x008a }
            monitor-exit(r9)
            return r10
        L_0x0088:
            monitor-exit(r9)
            return r12
        L_0x008a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7275c.C92271h.mo86951b(java.lang.String, com.google.android.apps.gsa.speech.e.b.n, com.google.android.apps.gsa.speech.e.b.k):com.google.android.apps.gsa.speech.e.c.g");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C92270g mo86952c(String str, C92252n nVar, C92249k kVar) {
        String b;
        String[] strArr;
        String str2 = str;
        C92252n nVar2 = nVar;
        C92249k kVar2 = kVar;
        C58976aa aaVar = C58975e.f156826a;
        C92260v a = this.f257284c.mo86923a(str);
        if (a == null || (b = a.mo86941b(nVar)) == null) {
            return null;
        }
        String str3 = a.f257243g;
        if (str3 == null) {
            C59104x c = f257282a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Greco3EngineManager");
            ((C59052c) ((C59052c) c).mo56372aa(12353)).mo56389s("No data for locale: %s", str);
            return null;
        }
        C58480gp e = C58485gu.m89837e();
        C58485gu i = m151502i(nVar, kVar2, a);
        if (nVar2 != C92252n.GRAMMAR || !i.isEmpty()) {
            e.mo55396h(m151502i(nVar, kVar2, a));
            e.mo55395g(str3);
            C58485gu f = e.mo55394f();
            strArr = (String[]) f.toArray(new String[((C58724pq) f).f156474d]);
        } else {
            strArr = null;
        }
        if (strArr == null) {
            return null;
        }
        C90762bf b2 = C90762bf.m148259b();
        C59071e eVar = f257282a;
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "Greco3EngineManager");
        ((C59052c) ((C59052c) b3).mo56372aa(12349)).mo56354G("create_rm: m=%s,l=%s", nVar, str);
        C92256r a2 = C92256r.m151486a(b, strArr);
        if (a2 == null) {
            C59104x b4 = eVar.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "Greco3EngineManager");
            ((C59052c) ((C59052c) b4).mo56372aa(12351)).mo56386p("Error loading resources.");
            return null;
        }
        C59104x b5 = eVar.mo56224b();
        b5.mo56378ag(C58975e.f156826a, "Greco3EngineManager");
        ((C59052c) ((C59052c) b5).mo56372aa(12350)).mo56359L("Brought up new g3rm instance: %s for: %s in: %d ms", b, str, Long.valueOf(b2.mo85102a()));
        return new C92270g(a2, a.mo86941b(nVar), str, kVar, nVar, strArr, a.f257244h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo86953d(java.io.File r8, boolean r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ all -> 0x00c6 }
            java.util.HashMap r1 = r7.f257288g     // Catch:{ all -> 0x00c6 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x0011:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c6 }
            r3 = 0
            if (r2 == 0) goto L_0x0072
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c6 }
            com.google.android.apps.gsa.speech.e.c.g r2 = (com.google.android.apps.gsa.speech.p7272e.p7275c.C92270g) r2     // Catch:{ all -> 0x00c6 }
            java.lang.String[] r2 = r2.f257279e     // Catch:{ all -> 0x00c6 }
            int r4 = r2.length     // Catch:{ all -> 0x00c6 }
            r5 = 0
        L_0x0022:
            if (r5 >= r4) goto L_0x0011
            r6 = r2[r5]     // Catch:{ all -> 0x00c6 }
            boolean r6 = r0.equals(r6)     // Catch:{ all -> 0x00c6 }
            if (r6 == 0) goto L_0x006f
            if (r9 == 0) goto L_0x006d
            com.google.android.apps.gsa.speech.e.c.k r9 = r7.f257291j     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x004b
            com.google.common.f.e r9 = f257282a     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r9 = r9.mo56226d()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "Greco3EngineManager"
            r9.mo56378ag(r0, r1)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "Terminating active recognition for shutdown."
            r1 = 12380(0x305c, float:1.7348E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x00c6 }
            com.google.android.apps.gsa.speech.e.c.k r9 = r7.f257291j     // Catch:{ all -> 0x00c6 }
            r7.mo86955f(r9)     // Catch:{ all -> 0x00c6 }
        L_0x004b:
            java.util.HashMap r9 = r7.f257288g     // Catch:{ all -> 0x00c6 }
            java.util.Collection r9 = r9.values()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x0055:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x00c6 }
            com.google.android.apps.gsa.speech.e.c.g r0 = (com.google.android.apps.gsa.speech.p7272e.p7275c.C92270g) r0     // Catch:{ all -> 0x00c6 }
            com.google.android.apps.gsa.speech.e.b.r r0 = r0.f257275a     // Catch:{ all -> 0x00c6 }
            r0.mo59861b()     // Catch:{ all -> 0x00c6 }
            goto L_0x0055
        L_0x0067:
            java.util.HashMap r9 = r7.f257288g     // Catch:{ all -> 0x00c6 }
            r9.clear()     // Catch:{ all -> 0x00c6 }
            goto L_0x0072
        L_0x006d:
            monitor-exit(r7)
            return
        L_0x006f:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x0072:
            boolean r9 = r8.exists()     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x00c4
            java.io.File[] r9 = r8.listFiles()     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x00a4
            int r0 = r9.length     // Catch:{ all -> 0x00c6 }
        L_0x007f:
            if (r3 >= r0) goto L_0x00a4
            r1 = r9[r3]     // Catch:{ all -> 0x00c6 }
            boolean r2 = r1.delete()     // Catch:{ all -> 0x00c6 }
            if (r2 != 0) goto L_0x00a1
            com.google.common.f.e r2 = f257282a     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "Greco3EngineManager"
            r2.mo56378ag(r4, r5)     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = "Error deleting resource file: %s"
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x00c6 }
            r5 = 12364(0x304c, float:1.7326E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56389s(r4, r1)     // Catch:{ all -> 0x00c6 }
        L_0x00a1:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x00a4:
            boolean r9 = r8.delete()     // Catch:{ all -> 0x00c6 }
            if (r9 != 0) goto L_0x00c4
            com.google.common.f.e r9 = f257282a     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r9 = r9.mo56225c()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "Greco3EngineManager"
            r9.mo56378ag(r0, r1)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "Error deleting directory: %s"
            java.lang.String r8 = r8.getAbsolutePath()     // Catch:{ all -> 0x00c6 }
            r1 = 12363(0x304b, float:1.7324E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56389s(r0, r8)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r7)
            return
        L_0x00c4:
            monitor-exit(r7)
            return
        L_0x00c6:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x00ca
        L_0x00c9:
            throw r8
        L_0x00ca:
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7275c.C92271h.mo86953d(java.io.File, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0.mo86909a(com.google.common.base.C58886cw.m90973a(new com.google.android.apps.gsa.speech.p7272e.p7274b.C92243e(r4.f257284c)), r4.f257284c) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r4.f257284c.mo86927f(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f257289h = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r0 = com.google.common.p4526f.p4527a.C58975e.f156826a;
        r4.f257284c.mo86927f(false);
        r0 = r4.f257286e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r0 == null) goto L_0x002f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86954e() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f257289h     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0009
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            return
        L_0x0009:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.speech.e.b.j r0 = r4.f257284c
            r1 = 0
            r0.mo86927f(r1)
            com.google.android.apps.gsa.speech.e.b.b r0 = r4.f257286e
            r1 = 1
            if (r0 == 0) goto L_0x002f
            com.google.android.apps.gsa.speech.e.b.j r2 = r4.f257284c
            com.google.android.apps.gsa.speech.e.b.e r3 = new com.google.android.apps.gsa.speech.e.b.e
            r3.<init>(r2)
            com.google.common.base.cr r2 = com.google.common.base.C58886cw.m90973a(r3)
            com.google.android.apps.gsa.speech.e.b.j r3 = r4.f257284c
            boolean r0 = r0.mo86909a(r2, r3)
            if (r0 == 0) goto L_0x002f
            com.google.android.apps.gsa.speech.e.b.j r0 = r4.f257284c
            r0.mo86927f(r1)
        L_0x002f:
            monitor-enter(r4)
            r4.f257289h = r1     // Catch:{ all -> 0x0034 }
            monitor-exit(r4)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0034 }
            throw r0
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7275c.C92271h.mo86954e():void");
    }

    /* renamed from: f */
    public final synchronized void mo86955f(C92274k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (kVar != this.f257291j) {
            this.f257287f.mo83755a((Throwable) null, 111334852, 29).mo83721a();
        } else if (this.f257290i == null) {
            this.f257287f.mo83755a((Throwable) null, 111334100, 29).mo83721a();
        } else {
            if (kVar != null) {
                kVar.cancel();
            }
            try {
                C60917ed.m93035b(this.f257290i, 5000, TimeUnit.MILLISECONDS);
                this.f257291j.delete();
                this.f257290i = null;
                this.f257291j = null;
                this.f257292k = null;
            } catch (TimeoutException e) {
                C59104x c = f257282a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Greco3EngineManager");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12373)).mo56386p("Timeout running recognition.");
                this.f257291j.delete();
                this.f257290i = null;
                this.f257291j = null;
                this.f257292k = null;
            } catch (ExecutionException e2) {
                try {
                    C59104x c2 = f257282a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "Greco3EngineManager");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(12376)).mo56386p("Exception while running recognition");
                } finally {
                    this.f257291j.delete();
                    this.f257290i = null;
                    this.f257291j = null;
                    this.f257292k = null;
                }
            }
        }
    }

    /* renamed from: g */
    public final synchronized void mo86956g(long j) {
        if (this.f257290i != null) {
            C58976aa aaVar = C58975e.f156826a;
            C59081b.m91349a(C58979ad.FULL, "stack size");
            mo86955f(this.f257291j);
        }
        this.f257292k = Long.valueOf(j);
    }

    /* renamed from: h */
    public final synchronized void mo86957h(C92274k kVar, InputStream inputStream, C92265b bVar, C67453av avVar, long j, C92275l lVar, C8476as asVar, boolean z) {
        C92274k kVar2 = kVar;
        synchronized (this) {
            C58976aa aaVar = C58975e.f156826a;
            if (!C58832aw.m90831a(Long.valueOf(j), this.f257292k)) {
                C59104x d = f257282a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Greco3EngineManager");
                ((C59052c) ((C59052c) d).mo56372aa(12384)).mo56351D("Offline recognition for %d can't be started, latest initialization is for %d.", j, this.f257292k);
                bVar.mo86945a();
                return;
            }
            long j2 = j;
            if (this.f257290i != null) {
                this.f257287f.mo83755a((Throwable) null, 111333799, 29).mo83721a();
                C59081b.m91349a(C58979ad.FULL, "stack size");
                mo86955f(this.f257291j);
            }
            kVar.setAudioReader(inputStream);
            kVar2.f257309b = (int) avVar.f183327d;
            kVar2.f257308a.f257305a = bVar;
            kVar2.f257310c = 0;
            C92266c cVar = new C92266c(lVar, j, z, kVar, avVar, asVar);
            C22871g gVar = this.f257283b;
            Objects.requireNonNull(cVar);
            this.f257290i = gVar.mo28201a("Greco3EngineManager#startRecognition", new C92267d(cVar));
            this.f257291j = kVar2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000d, code lost:
        r2.f257283b.mo28212l("Greco3EngineManagerdeleteResource", new com.google.android.apps.gsa.speech.p7272e.p7275c.C92268e(r2, r3, r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86922a(java.io.File r3, boolean r4, java.lang.Runnable r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f257289h     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000c
            if (r4 != 0) goto L_0x000b
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x001a }
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            return
        L_0x000b:
            r4 = 1
        L_0x000c:
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            com.google.android.libraries.gsa.k.g r0 = r2.f257283b
            com.google.android.apps.gsa.speech.e.c.e r1 = new com.google.android.apps.gsa.speech.e.c.e
            r1.<init>(r2, r3, r4, r5)
            java.lang.String r3 = "Greco3EngineManagerdeleteResource"
            r0.mo28212l(r3, r1)
            return
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7272e.p7275c.C92271h.mo86922a(java.io.File, boolean, java.lang.Runnable):void");
    }
}
