package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.p8889z.p8890a.C118849l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.r */
/* compiled from: PG */
public final class C84591r {

    /* renamed from: a */
    public static final C59071e f230203a = C59071e.m91332i("com.google.android.apps.gsa.search.core.ak.a.r");

    /* renamed from: b */
    public final Context f230204b;

    /* renamed from: c */
    public final C90929bz f230205c;

    /* renamed from: d */
    public final C22871g f230206d;

    /* renamed from: e */
    public final C118843f f230207e;

    /* renamed from: f */
    public final C118849l f230208f;

    /* renamed from: g */
    public final C86124t f230209g;

    /* renamed from: h */
    public final C68214a f230210h;

    /* renamed from: i */
    public final Object f230211i = new Object();

    /* renamed from: j */
    public final HashMap f230212j;

    /* renamed from: k */
    public final Deque f230213k;

    /* renamed from: l */
    public final C68214a f230214l;

    /* renamed from: m */
    public boolean f230215m;

    /* renamed from: n */
    int f230216n;

    /* renamed from: o */
    public TextToSpeech f230217o;

    /* renamed from: p */
    public boolean f230218p;

    /* renamed from: q */
    boolean f230219q;

    /* renamed from: r */
    boolean f230220r;

    /* renamed from: s */
    public final boolean f230221s;

    /* renamed from: t */
    final UtteranceProgressListener f230222t = new C84583j(this);

    /* renamed from: u */
    private final C89994f f230223u;

    /* renamed from: v */
    private final C84572ac f230224v;

    /* renamed from: w */
    private boolean f230225w;

    /* renamed from: x */
    private Locale f230226x;

    public C84591r(Context context, C90929bz bzVar, C22871g gVar, C118843f fVar, C118849l lVar, C89994f fVar2, C86124t tVar, C84572ac acVar, C68214a aVar, C68214a aVar2) {
        this.f230204b = context;
        this.f230205c = bzVar;
        this.f230206d = gVar;
        this.f230207e = fVar;
        this.f230208f = lVar;
        this.f230223u = fVar2;
        this.f230212j = new HashMap();
        this.f230213k = new LinkedList();
        this.f230209g = tVar;
        this.f230224v = acVar;
        this.f230210h = aVar;
        this.f230218p = false;
        this.f230219q = false;
        this.f230225w = true;
        this.f230214l = aVar2;
        this.f230221s = tVar.mo79746e(C90086ek.f250482dv);
    }

    /* renamed from: h */
    private final void m135319h() {
        TextToSpeech textToSpeech = this.f230217o;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            C58976aa aaVar = C58975e.f156826a;
            this.f230217o = null;
        }
    }

    /* renamed from: i */
    private final void m135320i(String str) {
        C84589p pVar = (C84589p) this.f230212j.remove(str);
        this.f230213k.remove(str);
        if (pVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            mo78352d("Run utterance callback", new C84587n(pVar));
        }
    }

    /* renamed from: j */
    private final void m135321j(String str, String str2) {
        mo78352d(str, new C84588o(this, str, str2));
    }

    /* renamed from: a */
    public final void mo78349a(String str, C90908be beVar, C90908be beVar2) {
        mo78354f(new TtsRequest(str, false), beVar, beVar2, this.f230204b.getResources().getConfiguration().locale.toString());
    }

    /* renamed from: b */
    public final void mo78350b(String str) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f230211i) {
            m135320i(str);
            this.f230215m = false;
        }
        mo78351c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0207, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01b8 A[Catch:{ Exception -> 0x0107 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78351c() {
        /*
            r15 = this;
            java.lang.Object r0 = r15.f230211i
            monitor-enter(r0)
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x020b }
            boolean r1 = r15.f230220r     // Catch:{ all -> 0x020b }
            if (r1 == 0) goto L_0x0023
            com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.m135331d()     // Catch:{ all -> 0x020b }
            r15.m135319h()     // Catch:{ all -> 0x020b }
        L_0x000f:
            java.util.Deque r1 = r15.f230213k     // Catch:{ all -> 0x020b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x020b }
            if (r1 != 0) goto L_0x0023
            java.util.Deque r1 = r15.f230213k     // Catch:{ all -> 0x020b }
            java.lang.Object r1 = r1.peekFirst()     // Catch:{ all -> 0x020b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x020b }
            r15.m135320i(r1)     // Catch:{ all -> 0x020b }
            goto L_0x000f
        L_0x0023:
            java.util.Deque r1 = r15.f230213k     // Catch:{ all -> 0x020b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x020b }
            r2 = 0
            if (r1 == 0) goto L_0x004a
            boolean r1 = r15.f230225w     // Catch:{ all -> 0x020b }
            if (r1 == 0) goto L_0x0042
            r15.f230225w = r2     // Catch:{ all -> 0x020b }
            com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84598y.m135331d()     // Catch:{ all -> 0x020b }
            java.util.HashMap r1 = r15.f230212j     // Catch:{ all -> 0x020b }
            r1.clear()     // Catch:{ all -> 0x020b }
            com.google.android.apps.gsa.z.a.f r1 = r15.f230207e     // Catch:{ all -> 0x020b }
            r1.mo71752m()     // Catch:{ all -> 0x020b }
            r15.m135319h()     // Catch:{ all -> 0x020b }
        L_0x0042:
            r15.f230215m = r2     // Catch:{ all -> 0x020b }
            r15.f230220r = r2     // Catch:{ all -> 0x020b }
            r15.f230218p = r2     // Catch:{ all -> 0x020b }
            monitor-exit(r0)     // Catch:{ all -> 0x020b }
            return
        L_0x004a:
            java.util.Deque r1 = r15.f230213k     // Catch:{ all -> 0x020b }
            java.lang.Object r1 = r1.getFirst()     // Catch:{ all -> 0x020b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x020b }
            java.util.HashMap r3 = r15.f230212j     // Catch:{ all -> 0x020b }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x020b }
            com.google.android.apps.gsa.search.core.ak.a.p r3 = (com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84589p) r3     // Catch:{ all -> 0x020b }
            if (r3 != 0) goto L_0x0063
            java.lang.String r2 = "Invalid utteranceId"
            r15.m135321j(r2, r1)     // Catch:{ all -> 0x020b }
            monitor-exit(r0)     // Catch:{ all -> 0x020b }
            return
        L_0x0063:
            boolean r4 = r15.f230220r     // Catch:{ all -> 0x020b }
            if (r4 == 0) goto L_0x006e
            java.lang.String r2 = "Skipping utterance"
            r15.m135321j(r2, r1)     // Catch:{ all -> 0x020b }
            monitor-exit(r0)     // Catch:{ all -> 0x020b }
            return
        L_0x006e:
            boolean r4 = r15.f230225w     // Catch:{ all -> 0x020b }
            r5 = 1
            if (r4 != 0) goto L_0x007a
            r15.f230225w = r5     // Catch:{ all -> 0x020b }
            com.google.android.apps.gsa.z.a.f r4 = r15.f230207e     // Catch:{ all -> 0x020b }
            r4.mo71750k()     // Catch:{ all -> 0x020b }
        L_0x007a:
            boolean r4 = r15.f230215m     // Catch:{ all -> 0x020b }
            r4 = r4 ^ r5
            r15.f230215m = r5     // Catch:{ all -> 0x020b }
            java.lang.String r5 = r3.f230201f     // Catch:{ all -> 0x020b }
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()     // Catch:{ all -> 0x020b }
            com.google.android.apps.gsa.shared.m.b.f r6 = r15.f230223u     // Catch:{ all -> 0x020b }
            java.util.Locale r6 = r6.mo83893am()     // Catch:{ all -> 0x020b }
            java.util.Locale r5 = com.google.android.apps.gsa.shared.util.C90725ai.m148180b(r5, r6)     // Catch:{ all -> 0x020b }
            java.util.Locale r5 = com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1445a.C17574a.m34862b(r5)     // Catch:{ all -> 0x020b }
            java.lang.Object r6 = r15.f230211i     // Catch:{ all -> 0x020b }
            monitor-enter(r6)     // Catch:{ all -> 0x020b }
            android.speech.tts.TextToSpeech r7 = r15.f230217o     // Catch:{ all -> 0x0208 }
            if (r7 == 0) goto L_0x00cd
            java.util.Locale r7 = r15.f230226x     // Catch:{ all -> 0x0208 }
            if (r7 == 0) goto L_0x00cd
            boolean r7 = r7.equals(r5)     // Catch:{ all -> 0x0208 }
            if (r7 == 0) goto L_0x00cd
            android.speech.tts.TextToSpeech r7 = r15.f230217o     // Catch:{ all -> 0x0208 }
            java.util.Locale r7 = r7.getLanguage()     // Catch:{ all -> 0x0208 }
            if (r7 == 0) goto L_0x00ae
            monitor-exit(r6)     // Catch:{ all -> 0x0208 }
            goto L_0x01d1
        L_0x00ae:
            com.google.common.f.e r7 = f230203a     // Catch:{ all -> 0x0208 }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ all -> 0x0208 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0208 }
            java.lang.String r9 = "LocalTtsManager"
            r7.mo56378ag(r8, r9)     // Catch:{ all -> 0x0208 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0208 }
            r8 = 9487(0x250f, float:1.3294E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ all -> 0x0208 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0208 }
            java.lang.String r8 = "Bad TextToSpeech instance detected. Re-creating."
            r7.mo56386p(r8)     // Catch:{ all -> 0x0208 }
            r15.m135319h()     // Catch:{ all -> 0x0208 }
        L_0x00cd:
            com.google.android.apps.gsa.search.core.ak.a.ac r7 = r15.f230224v     // Catch:{ all -> 0x0208 }
            r8 = 0
            android.content.Context r9 = r7.f230158b     // Catch:{ NameNotFoundException -> 0x00de }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00de }
            java.lang.String r10 = "com.google.android.tts"
            r9.getApplicationInfo(r10, r2)     // Catch:{ NameNotFoundException -> 0x00de }
            java.lang.String r9 = "com.google.android.tts"
            goto L_0x00df
        L_0x00de:
            r9 = r8
        L_0x00df:
            android.util.Pair r10 = r7.mo78329a(r9)     // Catch:{ all -> 0x0208 }
            java.lang.Object r11 = r10.second     // Catch:{ all -> 0x0208 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0208 }
            if (r9 != 0) goto L_0x0116
            java.lang.Object r9 = r10.first     // Catch:{ all -> 0x0208 }
            if (r9 != 0) goto L_0x00ef
            r9 = r11
            goto L_0x0116
        L_0x00ef:
            java.lang.Object r9 = r10.first     // Catch:{ all -> 0x0208 }
            android.speech.tts.TextToSpeech r9 = (android.speech.tts.TextToSpeech) r9     // Catch:{ all -> 0x0208 }
            java.lang.Class<android.speech.tts.TextToSpeech> r12 = android.speech.tts.TextToSpeech.class
            java.lang.String r13 = "getCurrentEngine"
            java.lang.Class[] r14 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0107 }
            java.lang.reflect.Method r12 = r12.getMethod(r13, r14)     // Catch:{ Exception -> 0x0107 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0107 }
            java.lang.Object r2 = r12.invoke(r9, r2)     // Catch:{ Exception -> 0x0107 }
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0107 }
            goto L_0x0116
        L_0x0107:
            r2 = move-exception
            com.google.common.f.e r9 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84572ac.f230157a     // Catch:{ all -> 0x0208 }
            com.google.common.f.x r9 = r9.mo56226d()     // Catch:{ all -> 0x0208 }
            java.lang.String r12 = "Error invoking getCurrentEngine()"
            r13 = 9513(0x2529, float:1.333E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56382g(r2)).mo56372aa(r13)).mo56386p(r12)     // Catch:{ all -> 0x0208 }
            r9 = r8
        L_0x0116:
            if (r9 == 0) goto L_0x011e
            boolean r2 = r9.equals(r11)     // Catch:{ all -> 0x0208 }
            if (r2 == 0) goto L_0x011f
        L_0x011e:
            r11 = r8
        L_0x011f:
            java.lang.Object r2 = r10.first     // Catch:{ all -> 0x0208 }
            android.speech.tts.TextToSpeech r2 = (android.speech.tts.TextToSpeech) r2     // Catch:{ all -> 0x0208 }
            if (r2 == 0) goto L_0x0134
            int r10 = r2.isLanguageAvailable(r5)     // Catch:{ all -> 0x0208 }
            if (r10 < 0) goto L_0x0134
            java.lang.String r10 = "embeddedTts"
            boolean r10 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84572ac.m135302b(r2, r5, r10)     // Catch:{ all -> 0x0208 }
            if (r10 == 0) goto L_0x0134
            goto L_0x018a
        L_0x0134:
            if (r11 == 0) goto L_0x013f
            android.util.Pair r7 = r7.mo78329a(r11)     // Catch:{ all -> 0x0208 }
            java.lang.Object r7 = r7.first     // Catch:{ all -> 0x0208 }
            android.speech.tts.TextToSpeech r7 = (android.speech.tts.TextToSpeech) r7     // Catch:{ all -> 0x0208 }
            goto L_0x0140
        L_0x013f:
            r7 = r8
        L_0x0140:
            if (r7 == 0) goto L_0x0151
            int r10 = r7.isLanguageAvailable(r5)     // Catch:{ all -> 0x0208 }
            if (r10 < 0) goto L_0x0151
            java.lang.String r10 = "embeddedTts"
            boolean r10 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84572ac.m135302b(r7, r5, r10)     // Catch:{ all -> 0x0208 }
            if (r10 == 0) goto L_0x0151
            goto L_0x01a3
        L_0x0151:
            if (r2 == 0) goto L_0x0162
            int r10 = r2.isLanguageAvailable(r5)     // Catch:{ all -> 0x0208 }
            if (r10 < 0) goto L_0x0162
            java.lang.String r10 = "networkTts"
            boolean r10 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84572ac.m135302b(r2, r5, r10)     // Catch:{ all -> 0x0208 }
            if (r10 == 0) goto L_0x0162
            goto L_0x018a
        L_0x0162:
            if (r7 == 0) goto L_0x0173
            int r10 = r7.isLanguageAvailable(r5)     // Catch:{ all -> 0x0208 }
            if (r10 < 0) goto L_0x0173
            java.lang.String r10 = "networkTts"
            boolean r10 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84572ac.m135302b(r7, r5, r10)     // Catch:{ all -> 0x0208 }
            if (r10 == 0) goto L_0x0173
            goto L_0x01a3
        L_0x0173:
            if (r2 == 0) goto L_0x018c
            com.google.common.f.e r7 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84572ac.f230157a     // Catch:{ all -> 0x0208 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x0208 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0208 }
            r8 = 9512(0x2528, float:1.3329E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ all -> 0x0208 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0208 }
            java.lang.String r8 = "No TTS available for %s. Using %s in its default locale"
            r7.mo56354G(r8, r5, r9)     // Catch:{ all -> 0x0208 }
        L_0x018a:
            r8 = r2
            goto L_0x01b2
        L_0x018c:
            if (r7 == 0) goto L_0x01a5
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84572ac.f230157a     // Catch:{ all -> 0x0208 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0208 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0208 }
            r8 = 9511(0x2527, float:1.3328E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r8)     // Catch:{ all -> 0x0208 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0208 }
            java.lang.String r8 = "No TTS available for %s. Using %s in its default locale"
            r2.mo56354G(r8, r5, r11)     // Catch:{ all -> 0x0208 }
        L_0x01a3:
            r8 = r7
            goto L_0x01b2
        L_0x01a5:
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84572ac.f230157a     // Catch:{ all -> 0x0208 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0208 }
            java.lang.String r7 = "No TTS available"
            r9 = 9510(0x2526, float:1.3326E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r9)).mo56386p(r7)     // Catch:{ all -> 0x0208 }
        L_0x01b2:
            r15.f230217o = r8     // Catch:{ all -> 0x0208 }
            r15.f230226x = r5     // Catch:{ all -> 0x0208 }
            if (r8 == 0) goto L_0x01d0
            r8.setLanguage(r5)     // Catch:{ all -> 0x0208 }
            com.google.android.apps.gsa.shared.m.b.f r2 = r15.f230223u     // Catch:{ all -> 0x0208 }
            j$.util.Optional r2 = r2.mo83862Y()     // Catch:{ all -> 0x0208 }
            boolean r5 = r2.isPresent()     // Catch:{ all -> 0x0208 }
            if (r5 == 0) goto L_0x01d0
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0208 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0208 }
            com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1450f.C17589a.m34881b(r8, r2)     // Catch:{ all -> 0x0208 }
        L_0x01d0:
            monitor-exit(r6)     // Catch:{ all -> 0x0208 }
        L_0x01d1:
            android.speech.tts.TextToSpeech r2 = r15.f230217o     // Catch:{ all -> 0x020b }
            if (r2 != 0) goto L_0x01fa
            com.google.common.f.e r2 = f230203a     // Catch:{ all -> 0x020b }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x020b }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x020b }
            java.lang.String r5 = "LocalTtsManager"
            r2.mo56378ag(r4, r5)     // Catch:{ all -> 0x020b }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x020b }
            r4 = 9490(0x2512, float:1.3298E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x020b }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x020b }
            java.lang.String r4 = "Unable to initialize Embedded TTS [%s]"
            com.google.android.apps.gsa.search.core.ak.a.ae r3 = r3.f230196a     // Catch:{ all -> 0x020b }
            r2.mo56389s(r4, r3)     // Catch:{ all -> 0x020b }
            java.lang.String r2 = "Skipping utterance with error"
            r15.m135321j(r2, r1)     // Catch:{ all -> 0x020b }
            monitor-exit(r0)     // Catch:{ all -> 0x020b }
            return
        L_0x01fa:
            if (r4 == 0) goto L_0x0206
            java.lang.String r2 = "UtterancePlayback"
            com.google.android.apps.gsa.search.core.ak.a.m r4 = new com.google.android.apps.gsa.search.core.ak.a.m     // Catch:{ all -> 0x020b }
            r4.<init>(r15, r3, r1)     // Catch:{ all -> 0x020b }
            r15.mo78352d(r2, r4)     // Catch:{ all -> 0x020b }
        L_0x0206:
            monitor-exit(r0)     // Catch:{ all -> 0x020b }
            return
        L_0x0208:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0208 }
            throw r1     // Catch:{ all -> 0x020b }
        L_0x020b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x020b }
            goto L_0x020f
        L_0x020e:
            throw r1
        L_0x020f:
            goto L_0x020e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84591r.mo78351c():void");
    }

    /* renamed from: d */
    public final void mo78352d(String str, C90908be beVar) {
        if (this.f230221s) {
            C58976aa aaVar = C58975e.f156826a;
            this.f230206d.mo28212l(str, new C84582i(beVar));
            return;
        }
        this.f230205c.mo85139d(beVar);
    }

    /* renamed from: e */
    public final void mo78353e() {
        C58976aa aaVar = C58975e.f156826a;
        mo78352d("Stop TTS", new C84585l(this));
    }

    /* renamed from: f */
    public final void mo78354f(TtsRequest ttsRequest, C90908be beVar, C90908be beVar2, String str) {
        mo78352d("Enqueue TtsRequest", new C84584k(this, ttsRequest, beVar, beVar2, str));
    }

    /* renamed from: g */
    public final void mo78355g(int i) {
        mo78349a(this.f230204b.getString(i), (C90908be) null, (C90908be) null);
    }
}
