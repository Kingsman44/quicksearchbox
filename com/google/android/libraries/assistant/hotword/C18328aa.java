package com.google.android.libraries.assistant.hotword;

import com.google.android.apps.gsa.nga.shared.p6339f.C81066e;
import com.google.android.apps.gsa.shared.speech.hotword.C90578a;
import com.google.android.apps.gsa.shared.speech.hotword.C90599p;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.speech.p5208h.C66626cx;
import com.google.speech.p5218j.C67091ks;
import com.google.speech.p5218j.C67171p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.assistant.hotword.aa */
/* compiled from: PG */
public final class C18328aa implements C19347o {

    /* renamed from: h */
    public static final /* synthetic */ int f51970h = 0;

    /* renamed from: i */
    private static final C58974d f51971i = C58974d.m91134h("SodaHwCallbackAdapter");

    /* renamed from: a */
    public boolean f51972a;

    /* renamed from: b */
    public long f51973b;

    /* renamed from: c */
    public boolean f51974c;

    /* renamed from: d */
    public C37659hf f51975d;

    /* renamed from: e */
    public C81066e f51976e;

    /* renamed from: f */
    final ExecutorService f51977f = Executors.newSingleThreadExecutor();

    /* renamed from: g */
    public final C18332ae f51978g;

    /* renamed from: j */
    private final SpeakerIdModel f51979j;

    /* renamed from: k */
    private final int f51980k;

    /* renamed from: l */
    private boolean f51981l;

    /* renamed from: m */
    private ByteArrayOutputStream f51982m;

    /* renamed from: n */
    private C90599p f51983n;

    public C18328aa(C18332ae aeVar, SpeakerIdModel speakerIdModel, int i) {
        this.f51978g = aeVar;
        this.f51979j = speakerIdModel;
        this.f51980k = i;
        this.f51974c = false;
    }

    /* renamed from: d */
    private final HotwordResult m35647d() {
        C90599p pVar = this.f51983n;
        if (pVar == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f51982m;
        if (byteArrayOutputStream != null) {
            ((C90578a) pVar).f253212b = C58833ax.m90834k(byteArrayOutputStream.toByteArray());
        }
        C81066e eVar = this.f51976e;
        if (eVar != null) {
            ((C90578a) pVar).f253217g = C58833ax.m90834k(eVar.mo74808d());
            C66626cx a = C66626cx.m97268a(eVar.mo74806b().f222160e);
            if (a == null) {
                a = C66626cx.DEVICE_TYPE_UNKNOWN;
            }
            pVar.mo84718g(a);
            C37360ay ayVar = eVar.mo74806b().f222157b;
            if (ayVar == null) {
                ayVar = C37360ay.f99224l;
            }
            pVar.mo84716e(ayVar.f99229d);
            pVar.mo84721j(ayVar.f99230e);
        }
        return pVar.mo84712a();
    }

    /* renamed from: e */
    private final void m35648e() {
        C37659hf hfVar = this.f51975d;
        if (hfVar != null) {
            hfVar.mo41058b();
            this.f51975d = null;
        }
    }

    /* renamed from: f */
    private final void m35649f(C67171p pVar) {
        ByteArrayOutputStream byteArrayOutputStream = this.f51982m;
        if (byteArrayOutputStream != null) {
            try {
                pVar.f182578b.mo59046r(byteArrayOutputStream);
            } catch (IOException e) {
                ((C58970a) ((C58970a) ((C58970a) f51971i.mo56225c()).mo56382g(e)).mo56372aa(47227)).mo56386p("Unable to write audio output bytes");
            }
        }
    }

    /* renamed from: g */
    private final boolean m35650g(C67091ks ksVar) {
        return ksVar.f182389b && ksVar.f182390c.equals(this.f51979j.f253283a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0229, code lost:
        if (r6 == false) goto L_0x022b;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23782t(com.google.speech.p5218j.C67087ko r12) {
        /*
            r11 = this;
            int r0 = r12.f182368a
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L_0x0263
            com.google.common.f.a.d r0 = f51971i
            com.google.common.f.x r3 = r0.mo56224b()
            java.lang.String r4 = "#handleHotwordEvent"
            r5 = 47219(0xb873, float:6.6168E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.speech.j.je r3 = r12.f182369b
            if (r3 != 0) goto L_0x001b
            com.google.speech.j.je r3 = com.google.speech.p5218j.C67050je.f182262f
        L_0x001b:
            com.google.android.apps.gsa.shared.speech.hotword.p r4 = com.google.android.apps.gsa.shared.speech.hotword.HotwordResult.m147742F()
            boolean r5 = r11.f51972a
            r4.mo84719h(r5)
            long r5 = r11.f51973b
            r4.mo84720i(r5)
            r4.mo84732u(r1)
            int r5 = r11.f51980k
            r4.mo84733v(r5)
            r11.f51983n = r4
            int r4 = r3.f182264a
            r4 = r4 & 8
            r5 = 3
            if (r4 == 0) goto L_0x0098
            com.google.speech.j.jg r4 = r3.f182268e
            if (r4 != 0) goto L_0x0040
            com.google.speech.j.jg r4 = com.google.speech.p5218j.C67052jg.f182269e
        L_0x0040:
            int r6 = r4.f182271a
            r6 = r6 & r1
            if (r6 == 0) goto L_0x0070
            com.google.speech.j.il r6 = r4.f182273c
            if (r6 != 0) goto L_0x004b
            com.google.speech.j.il r6 = com.google.speech.p5218j.C67030il.f182195e
        L_0x004b:
            int r7 = r6.f182200d
            int r7 = com.google.speech.p5218j.C67029ik.m97410a(r7)
            if (r7 != 0) goto L_0x0054
            goto L_0x0062
        L_0x0054:
            if (r7 != r5) goto L_0x0062
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r7 = "Unhealthy microphone reported"
            r8 = 47224(0xb878, float:6.6175E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r8)).mo56386p(r7)
        L_0x0062:
            com.google.android.apps.gsa.shared.speech.hotword.p r0 = r11.f51983n
            if (r0 == 0) goto L_0x0070
            float r7 = r6.f182198b
            r0.mo84722k(r7)
            float r6 = r6.f182199c
            r0.mo84715d(r6)
        L_0x0070:
            com.google.protobuf.cq r0 = r4.f182272b
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x0098
            boolean[] r6 = new boolean[r0]
            r7 = 0
        L_0x007b:
            if (r7 >= r0) goto L_0x008c
            com.google.protobuf.cq r8 = r4.f182272b
            java.lang.Object r8 = r8.get(r7)
            com.google.speech.j.jw r8 = (com.google.speech.p5218j.C67068jw) r8
            boolean r8 = r8.f182313a
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x007b
        L_0x008c:
            com.google.android.apps.gsa.shared.speech.hotword.p r0 = r11.f51983n
            if (r0 == 0) goto L_0x0098
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r6)
            com.google.android.apps.gsa.shared.speech.hotword.a r0 = (com.google.android.apps.gsa.shared.speech.hotword.C90578a) r0
            r0.f253213c = r4
        L_0x0098:
            int r0 = r3.f182264a
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00bc
            com.google.speech.j.jc r0 = r3.f182265b
            if (r0 != 0) goto L_0x00a3
            com.google.speech.j.jc r0 = com.google.speech.p5218j.C67048jc.f182253h
        L_0x00a3:
            com.google.android.apps.gsa.shared.speech.hotword.p r4 = r11.f51983n
            if (r4 == 0) goto L_0x00bc
            java.lang.String r6 = r0.f182261g
            r7 = r4
            com.google.android.apps.gsa.shared.speech.hotword.a r7 = (com.google.android.apps.gsa.shared.speech.hotword.C90578a) r7
            r7.f253211a = r6
            float r6 = r0.f182258d
            r4.mo84731t(r6)
            boolean r6 = r0.f182259e
            r4.mo84726o(r6)
            java.lang.String r0 = r0.f182257c
            r7.f253215e = r0
        L_0x00bc:
            int r0 = r3.f182264a
            r4 = 2
            r0 = r0 & r4
            r6 = 4
            if (r0 == 0) goto L_0x018a
            com.google.speech.j.ka r0 = r3.f182266c
            if (r0 != 0) goto L_0x00c9
            com.google.speech.j.ka r0 = com.google.speech.p5218j.C67073ka.f182324f
        L_0x00c9:
            int r7 = r0.f182326a
            r7 = r7 & r1
            if (r7 == 0) goto L_0x017c
            com.google.android.apps.gsa.shared.speech.hotword.p r7 = r11.f51983n
            if (r7 == 0) goto L_0x017c
            com.google.speech.j.p r8 = r0.f182327b
            if (r8 != 0) goto L_0x00d8
            com.google.speech.j.p r8 = com.google.speech.p5218j.C67171p.f182575e
        L_0x00d8:
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            r11.f51982m = r9
            r11.m35649f(r8)
            int r9 = r8.f182577a
            r9 = r9 & r4
            if (r9 == 0) goto L_0x0143
            com.google.speech.j.t r9 = r8.f182579c
            if (r9 != 0) goto L_0x00ed
            com.google.speech.j.t r9 = com.google.speech.p5218j.C67175t.f182588e
        L_0x00ed:
            int r9 = r9.f182590a
            r9 = r9 & r4
            if (r9 == 0) goto L_0x00fd
            com.google.speech.j.t r9 = r8.f182579c
            if (r9 != 0) goto L_0x00f8
            com.google.speech.j.t r9 = com.google.speech.p5218j.C67175t.f182588e
        L_0x00f8:
            int r9 = r9.f182592c
            r7.mo84728q(r9)
        L_0x00fd:
            com.google.speech.j.t r9 = r8.f182579c
            if (r9 != 0) goto L_0x0104
            com.google.speech.j.t r10 = com.google.speech.p5218j.C67175t.f182588e
            goto L_0x0105
        L_0x0104:
            r10 = r9
        L_0x0105:
            int r10 = r10.f182590a
            r10 = r10 & r6
            if (r10 == 0) goto L_0x0113
            if (r9 != 0) goto L_0x010e
            com.google.speech.j.t r9 = com.google.speech.p5218j.C67175t.f182588e
        L_0x010e:
            int r9 = r9.f182593d
            r7.mo84717f(r9)
        L_0x0113:
            com.google.speech.j.t r8 = r8.f182579c
            if (r8 != 0) goto L_0x011a
            com.google.speech.j.t r9 = com.google.speech.p5218j.C67175t.f182588e
            goto L_0x011b
        L_0x011a:
            r9 = r8
        L_0x011b:
            int r9 = r9.f182590a
            r9 = r9 & r4
            if (r9 == 0) goto L_0x0143
            if (r8 != 0) goto L_0x0124
            com.google.speech.j.t r8 = com.google.speech.p5218j.C67175t.f182588e
        L_0x0124:
            int r8 = r8.f182591b
            com.google.speech.j.s r8 = com.google.speech.p5218j.C67174s.m97431a(r8)
            if (r8 != 0) goto L_0x012e
            com.google.speech.j.s r8 = com.google.speech.p5218j.C67174s.INT16
        L_0x012e:
            int r8 = r8.ordinal()
            if (r8 == r1) goto L_0x013f
            if (r8 == r4) goto L_0x013c
            if (r8 == r5) goto L_0x013a
            r8 = 0
            goto L_0x0140
        L_0x013a:
            r8 = 4
            goto L_0x0140
        L_0x013c:
            r8 = 22
            goto L_0x0140
        L_0x013f:
            r8 = 2
        L_0x0140:
            r7.mo84721j(r8)
        L_0x0143:
            int r8 = r0.f182326a
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x018a
            com.google.android.apps.gsa.nga.shared.f.e r8 = r11.f51976e
            if (r8 == 0) goto L_0x018a
            com.google.android.apps.gsa.nga.shared.f.c.j r8 = r8.mo74806b()
            com.google.android.libraries.search.c.ay r8 = r8.f222157b
            if (r8 != 0) goto L_0x0157
            com.google.android.libraries.search.c.ay r8 = com.google.android.libraries.search.p2904c.C37360ay.f99224l
        L_0x0157:
            int r8 = r8.f99230e
            if (r8 == r4) goto L_0x0172
            if (r8 == r5) goto L_0x0170
            if (r8 == r6) goto L_0x016e
            com.google.common.f.a.d r5 = f51971i
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r9 = "Unsupported audio encoding %d"
            r10 = 47218(0xb872, float:6.6167E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r5).mo56372aa(r10)).mo56387q(r9, r8)
            goto L_0x0170
        L_0x016e:
            r5 = 4
            goto L_0x0173
        L_0x0170:
            r5 = 1
            goto L_0x0173
        L_0x0172:
            r5 = 2
        L_0x0173:
            long r8 = r0.f182330e
            int r0 = (int) r8
            int r0 = r0 * r5
            r7.mo84723l(r0)
            goto L_0x018a
        L_0x017c:
            com.google.common.f.a.d r0 = f51971i
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r5 = "Hotword detected, but no preamble audio."
            r7 = 47225(0xb879, float:6.6176E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r7)).mo56386p(r5)
        L_0x018a:
            int r0 = r3.f182264a
            r0 = r0 & r6
            if (r0 == 0) goto L_0x01fb
            int r0 = r11.f51980k
            if (r0 != r4) goto L_0x01fb
            com.google.android.apps.gsa.shared.speech.hotword.p r0 = r11.f51983n
            com.google.speech.j.ks r4 = r3.f182267d
            if (r4 != 0) goto L_0x019b
            com.google.speech.j.ks r4 = com.google.speech.p5218j.C67091ks.f182386h
        L_0x019b:
            boolean r5 = r11.m35650g(r4)
            r0.mo84735x(r5)
            float r6 = r4.f182391d
            r0.mo84734w(r6)
            boolean r6 = r4.f182392e
            r0.mo84730s(r6)
            if (r5 == 0) goto L_0x01fb
            com.google.protobuf.dn r4 = r4.f182393f
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r5 = r11.f51979j
            java.lang.String r5 = r5.f253283a
            java.lang.Object r4 = r4.get(r5)
            com.google.speech.j.jy r4 = (com.google.speech.p5218j.C67070jy) r4
            if (r4 == 0) goto L_0x01ed
            com.google.protobuf.cq r4 = r4.f182317a
            java.util.Iterator r4 = r4.iterator()
        L_0x01c6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01fb
            java.lang.Object r5 = r4.next()
            com.google.speech.j.ip r5 = (com.google.speech.p5218j.C67034ip) r5
            boolean r6 = r5.f182212c
            if (r6 == 0) goto L_0x01c6
            int r6 = r5.f182210a
            r6 = r6 & r1
            if (r6 == 0) goto L_0x01c6
            int r5 = r5.f182211b
            com.google.speech.j.io r5 = com.google.speech.p5218j.C67033io.m97411a(r5)
            if (r5 != 0) goto L_0x01e5
            com.google.speech.j.io r5 = com.google.speech.p5218j.C67033io.GH_INTERVAL_GUEST
        L_0x01e5:
            com.google.speech.j.io r6 = com.google.speech.p5218j.C67033io.GH_INTERVAL_TRUSTED_USER
            if (r5 != r6) goto L_0x01c6
            r0.mo84736y(r1)
            goto L_0x01c6
        L_0x01ed:
            com.google.common.f.a.d r0 = f51971i
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r4 = "No SpeakerId confidence intervals."
            r5 = 47226(0xb87a, float:6.6178E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r5)).mo56386p(r4)
        L_0x01fb:
            com.google.android.libraries.search.c.hf r0 = r11.f51975d
            r4 = 0
            if (r0 == 0) goto L_0x0247
            com.google.android.apps.gsa.shared.speech.hotword.p r5 = r11.f51983n
            com.google.android.apps.gsa.nga.shared.f.e r6 = r11.f51976e
            if (r5 == 0) goto L_0x0244
            if (r6 != 0) goto L_0x0209
            goto L_0x0244
        L_0x0209:
            com.google.speech.j.ks r7 = r3.f182267d
            if (r7 != 0) goto L_0x020f
            com.google.speech.j.ks r7 = com.google.speech.p5218j.C67091ks.f182386h
        L_0x020f:
            boolean r7 = r11.m35650g(r7)
            com.google.android.apps.gsa.nga.shared.f.c.j r6 = r6.mo74806b()
            boolean r6 = r6.f222158c
            com.google.speech.j.jc r3 = r3.f182265b
            if (r3 != 0) goto L_0x021f
            com.google.speech.j.jc r3 = com.google.speech.p5218j.C67048jc.f182253h
        L_0x021f:
            boolean r3 = r3.f182259e
            if (r7 != 0) goto L_0x0229
            if (r6 == 0) goto L_0x022b
            r11.m35648e()
            goto L_0x0247
        L_0x0229:
            if (r6 != 0) goto L_0x0234
        L_0x022b:
            if (r3 == 0) goto L_0x0234
            r5.mo84732u(r2)
            r11.m35648e()
            goto L_0x0247
        L_0x0234:
            com.google.android.libraries.search.c.he r0 = r0.mo41059c()
            com.google.android.libraries.search.c.hq r0 = r0.mo41054a()
            int r0 = r0.f100055b
            r5.mo84729r(r0)
            r11.f51975d = r4
            goto L_0x0247
        L_0x0244:
            r11.m35648e()
        L_0x0247:
            boolean r0 = r11.f51981l
            if (r0 != 0) goto L_0x0253
            boolean r0 = r11.f51974c
            if (r0 == 0) goto L_0x0253
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r4 = r11.m35647d()
        L_0x0253:
            boolean r0 = r11.f51981l
            if (r0 != 0) goto L_0x0263
            java.util.concurrent.ExecutorService r0 = r11.f51977f
            com.google.android.libraries.assistant.hotword.z r3 = new com.google.android.libraries.assistant.hotword.z
            r3.<init>(r11, r4)
            r0.submit(r3)
            r11.f51981l = r1
        L_0x0263:
            int r0 = r12.f182368a
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x02e9
            boolean r0 = r11.f51981l
            if (r0 == 0) goto L_0x02e0
            boolean r0 = r11.f51974c
            if (r0 == 0) goto L_0x02e0
            com.google.android.libraries.assistant.hotword.ae r0 = r11.f51978g
            com.google.speech.j.p r1 = r12.f182376i
            if (r1 != 0) goto L_0x0279
            com.google.speech.j.p r1 = com.google.speech.p5218j.C67171p.f182575e
        L_0x0279:
            com.google.android.libraries.assistant.hotword.al r3 = r0.f51987a
            com.google.common.util.concurrent.cx r3 = r3.f52011k
            if (r3 == 0) goto L_0x02d1
            boolean r3 = r3.isDone()
            if (r3 != 0) goto L_0x02d1
            com.google.android.libraries.assistant.hotword.al r3 = r0.f51987a
            boolean r4 = r3.f52016r
            if (r4 == 0) goto L_0x02d1
            com.google.android.libraries.assistant.hotword.am r3 = r3.f52017s     // Catch:{ IOException -> 0x02b1 }
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r4 = r3.f52026c     // Catch:{ IOException -> 0x02b1 }
            if (r4 == 0) goto L_0x02e9
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x02b1 }
            com.google.protobuf.z r5 = r1.f182578b     // Catch:{ IOException -> 0x02b1 }
            int r5 = r5.mo59031d()     // Catch:{ IOException -> 0x02b1 }
            com.google.android.libraries.assistant.soda.ag r3 = r3.f52027d     // Catch:{ IOException -> 0x02b1 }
            java.nio.ByteBuffer r3 = r3.mo24395a(r5)     // Catch:{ IOException -> 0x02b1 }
            com.google.protobuf.z r1 = r1.f182578b     // Catch:{ IOException -> 0x02b1 }
            byte[] r1 = r1.mo59174N()     // Catch:{ IOException -> 0x02b1 }
            r3.put(r1, r2, r5)     // Catch:{ IOException -> 0x02b1 }
            r3.flip()     // Catch:{ IOException -> 0x02b1 }
            r4.write(r3)     // Catch:{ IOException -> 0x02b1 }
            goto L_0x02e9
        L_0x02b1:
            com.google.common.f.a.d r1 = com.google.android.libraries.assistant.hotword.C18339al.f51996a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r3 = "EOF, closing audio"
            r4 = 47234(0xb882, float:6.6189E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r4)).mo56386p(r3)
            com.google.android.libraries.assistant.hotword.al r1 = r0.f51987a
            com.google.common.util.concurrent.cx r1 = r1.f52011k
            if (r1 == 0) goto L_0x02c9
            r1.cancel(r2)
        L_0x02c9:
            com.google.android.libraries.assistant.hotword.al r0 = r0.f51987a
            com.google.android.libraries.assistant.hotword.am r0 = r0.f52017s
            r0.mo23806a()
            goto L_0x02e9
        L_0x02d1:
            com.google.common.f.a.d r0 = com.google.android.libraries.assistant.hotword.C18339al.f51996a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "skipped writing processed audio to output Stream"
            r2 = 47233(0xb881, float:6.6188E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x02e9
        L_0x02e0:
            com.google.speech.j.p r0 = r12.f182376i
            if (r0 != 0) goto L_0x02e6
            com.google.speech.j.p r0 = com.google.speech.p5218j.C67171p.f182575e
        L_0x02e6:
            r11.m35649f(r0)
        L_0x02e9:
            int r0 = r12.f182368a
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0333
            com.google.speech.j.jk r12 = r12.f182380m
            if (r12 != 0) goto L_0x02f6
            com.google.speech.j.jk r12 = com.google.speech.p5218j.C67056jk.f182276e
        L_0x02f6:
            float r0 = r12.f182278a
            com.google.common.f.a.d r1 = f51971i
            com.google.common.f.x r2 = r1.mo56224b()
            java.lang.String r3 = "#handleHotwordTimeoutEvent"
            r4 = 47221(0xb875, float:6.6171E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            r11.m35648e()
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            r3 = 47222(0xb876, float:6.6172E-41)
            java.lang.String r4 = "Hotword timeout max score: %f"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56389s(r4, r2)
            com.google.android.apps.gsa.shared.speech.hotword.p r1 = com.google.android.apps.gsa.shared.speech.hotword.HotwordResult.m147742F()
            boolean r2 = r11.f51972a
            r1.mo84719h(r2)
            int r2 = r11.f51980k
            r1.mo84733v(r2)
            r1.mo84731t(r0)
            java.lang.String r12 = r12.f182279b
            r0 = r1
            com.google.android.apps.gsa.shared.speech.hotword.a r0 = (com.google.android.apps.gsa.shared.speech.hotword.C90578a) r0
            r0.f253211a = r12
            r11.f51983n = r1
        L_0x0333:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.hotword.C18328aa.mo23782t(com.google.speech.j.ko):void");
    }

    /* renamed from: u */
    public final /* synthetic */ void mo23783u() {
    }

    /* renamed from: v */
    public final void mo23784v(C19243af afVar) {
        ((C58970a) ((C58970a) f51971i.mo56224b()).mo56372aa(47223)).mo56389s("Soda stopped: %s", afVar);
        this.f51977f.submit(new C18388y(this.f51978g, !this.f51974c ? m35647d() : null, this.f51976e));
        this.f51981l = false;
        this.f51982m = null;
        this.f51983n = null;
        this.f51976e = null;
        m35648e();
    }
}
