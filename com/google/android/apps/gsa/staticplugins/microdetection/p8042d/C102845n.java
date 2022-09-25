package com.google.android.apps.gsa.staticplugins.microdetection.p8042d;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.speech.C90574e;
import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.p7139a.C90515g;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.speech.audio.C92157ac;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7307d.C92505a;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.libraries.assistant.hotword.C18382s;
import com.google.android.libraries.assistant.hotword.C18387x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.micro.GoogleHotwordData;
import dagger.C68214a;
import java.io.InputStream;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.d.n */
/* compiled from: PG */
public final class C102845n {

    /* renamed from: a */
    public static final C59071e f287219a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.d.n");

    /* renamed from: A */
    private Future f287220A;

    /* renamed from: B */
    private volatile boolean f287221B;

    /* renamed from: b */
    public final C92216a f287222b;

    /* renamed from: c */
    public final int f287223c;

    /* renamed from: d */
    final C18387x f287224d;

    /* renamed from: e */
    final C102847p f287225e;

    /* renamed from: f */
    public final C68214a f287226f;

    /* renamed from: g */
    private final int f287227g;

    /* renamed from: h */
    private final int f287228h;

    /* renamed from: i */
    private final C22871g f287229i;

    /* renamed from: j */
    private final GoogleHotwordData f287230j;

    /* renamed from: k */
    private final C92504i f287231k;

    /* renamed from: l */
    private final String f287232l;

    /* renamed from: m */
    private final C90536a f287233m;

    /* renamed from: n */
    private final boolean f287234n;

    /* renamed from: o */
    private final byte[] f287235o;

    /* renamed from: p */
    private final C92157ac f287236p;

    /* renamed from: q */
    private final boolean f287237q;

    /* renamed from: r */
    private final String f287238r;

    /* renamed from: s */
    private final C89994f f287239s;

    /* renamed from: t */
    private final C92505a f287240t;

    /* renamed from: u */
    private final C102841j f287241u;

    /* renamed from: v */
    private final boolean f287242v;

    /* renamed from: w */
    private final boolean f287243w;

    /* renamed from: x */
    private final C58833ax f287244x;

    /* renamed from: y */
    private final C90021c f287245y;

    /* renamed from: z */
    private final u f287246z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C102845n(com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102844m r17, com.google.android.libraries.gsa.p1876k.C22871g r18, com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i r19, com.google.android.apps.gsa.shared.p7066m.C90021c r20, dagger.C68214a r21, com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f r22, com.google.android.apps.gsa.speech.microdetection.p7303a.p7307d.C92505a r23, com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102848q r24, android.content.Context r25, com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102841j r26, com.google.android.apps.gsa.c.f.u r27) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            r2 = r22
            r3 = r24
            r4 = r26
            r16.<init>()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.speech.d.a r5 = r17.mo93485d()
            r0.f287233m = r5
            r5 = r19
            r0.f287231k = r5
            com.google.android.apps.gsa.speech.b.a r5 = r17.mo93488f()
            r0.f287222b = r5
            int r5 = r17.mo93483b()
            r0.f287227g = r5
            int r6 = r17.mo93482a()
            r0.f287228h = r6
            r6 = r18
            r0.f287229i = r6
            int r6 = r17.mo93484c()
            r0.f287223c = r6
            r0.f287245y = r1
            boolean r7 = r17.mo93495l()
            boolean r8 = r17.mo93497n()
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L_0x0047
            if (r7 != 0) goto L_0x0047
            r7 = 1
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            r0.f287234n = r7
            byte[] r8 = r17.mo93499p()
            r0.f287235o = r8
            com.google.speech.micro.GoogleHotwordData r8 = r17.mo93490h()
            r0.f287230j = r8
            com.google.android.apps.gsa.speech.audio.ac r11 = r17.mo93486e()
            r0.f287236p = r11
            java.lang.String r11 = r17.mo93492i()
            r0.f287232l = r11
            if (r7 == 0) goto L_0x006e
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250075l
            boolean r1 = r1.mo79746e(r12)
            if (r1 == 0) goto L_0x006e
            r1 = 1
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            r0.f287237q = r1
            r12 = r21
            r0.f287226f = r12
            r0.f287239s = r2
            r12 = r23
            r0.f287240t = r12
            r0.f287241u = r4
            boolean r12 = r17.mo93498o()
            r0.f287242v = r12
            boolean r13 = r17.mo93496m()
            r0.f287243w = r13
            com.google.common.base.ax r14 = r17.mo93489g()
            r0.f287244x = r14
            r14 = r27
            r0.f287246z = r14
            if (r7 == 0) goto L_0x00a0
            if (r1 == 0) goto L_0x00a0
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = r1.getPath()
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            r0.f287238r = r1
            com.google.android.apps.gsa.shared.speech.d.a r1 = r17.mo93485d()
            com.google.android.apps.gsa.shared.speech.d.a r7 = com.google.android.apps.gsa.shared.speech.p7142d.C90536a.VOICE_ACTIONS
            if (r1 != r7) goto L_0x00d2
            int r1 = r17.mo93483b()
            java.lang.String r7 = r17.mo93493j()
            com.google.android.apps.gsa.staticplugins.microdetection.d.p r15 = new com.google.android.apps.gsa.staticplugins.microdetection.d.p
            r7.getClass()
            g.a.a r14 = r3.f287262a
            java.lang.Object r14 = r14.mo17428b()
            com.google.android.apps.gsa.speech.microdetection.a.c.i r14 = (com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i) r14
            r14.getClass()
            g.a.a r3 = r3.f287263b
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.shared.m.b.f r3 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r3
            r3.getClass()
            r15.<init>(r1, r7, r14, r3)
            goto L_0x00d3
        L_0x00d2:
            r15 = 0
        L_0x00d3:
            r0.f287225e = r15
            com.google.android.apps.gsa.shared.speech.d.a r1 = r17.mo93485d()
            if (r15 == 0) goto L_0x00e3
            com.google.android.apps.gsa.shared.speech.d.a r3 = com.google.android.apps.gsa.shared.speech.p7142d.C90536a.HOTWORD
            if (r1 != r3) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            r14 = 0
            goto L_0x01dc
        L_0x00e3:
            boolean r1 = r17.mo93494k()
            if (r12 == 0) goto L_0x00f0
            if (r13 != 0) goto L_0x00f0
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r3 = r2.mo83841D(r11)
            goto L_0x00f1
        L_0x00f0:
            r3 = 0
        L_0x00f1:
            if (r3 == 0) goto L_0x00fd
            com.google.common.base.ax r7 = r3.f253284b
            java.lang.Object r7 = r7.mo56111f()
            r14 = r7
            byte[] r14 = (byte[]) r14
            goto L_0x00fe
        L_0x00fd:
            r14 = 0
        L_0x00fe:
            if (r6 == 0) goto L_0x01b6
            if (r6 == r9) goto L_0x01a4
            r7 = 2
            if (r6 == r7) goto L_0x010c
            com.google.speech.micro.GoogleHotwordRecognizer r4 = new com.google.speech.micro.GoogleHotwordRecognizer
            r4.<init>(r8)
            goto L_0x01bb
        L_0x010c:
            java.lang.String r7 = "GoogleHotwRecFactory"
            if (r14 == 0) goto L_0x018c
            boolean r13 = r8.isSpeakerVerificationEnabled()
            if (r13 == 0) goto L_0x0127
            boolean r13 = r8.isSpeakerModelCompatible(r14)
            if (r13 == 0) goto L_0x0127
            com.google.speech.micro.GoogleHotwordRecognizer r4 = new com.google.speech.micro.GoogleHotwordRecognizer
            byte[][] r7 = new byte[r9][]
            r7[r10] = r14
            r4.<init>(r8, r7)
            goto L_0x01bb
        L_0x0127:
            if (r11 == 0) goto L_0x0135
            com.google.android.apps.gsa.shared.m.b.f r9 = r4.f287216b
            r10 = 6
            java.lang.String r13 = "removing model during verification"
            com.google.android.apps.gsa.shared.speech.dumper.EventForDump r10 = com.google.android.apps.gsa.shared.speech.dumper.EventForDump.m147676e(r10, r13)
            r9.mo83843F(r11, r10)
        L_0x0135:
            dagger.a r4 = r4.f287217c
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r4 = (com.google.android.apps.gsa.shared.logger.C89911f) r4
            com.google.android.apps.gsa.shared.speech.a.h r9 = new com.google.android.apps.gsa.shared.speech.a.h
            java.lang.String r10 = r8.getHotwordModelId()
            int r13 = r14.length
            r15 = 16
            int r13 = java.lang.Math.min(r15, r13)
            byte[] r13 = java.util.Arrays.copyOf(r14, r13)
            java.lang.String r13 = com.google.android.libraries.p1733g.C21407a.m40530a(r13)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "["
            r14.<init>(r15)
            r14.append(r13)
            java.lang.String r13 = "]"
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r9.<init>(r10, r13)
            r10 = 28604975(0x1b47a2f, float:6.629688E-38)
            r13 = 29
            com.google.android.apps.gsa.shared.logger.e r4 = r4.mo83755a(r9, r10, r13)
            r4.mo83721a()
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102841j.f287215a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r9, r7)
            java.lang.String r7 = "Non compatible model passed to hotword."
            r9 = 21279(0x531f, float:2.9818E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r9)).mo56386p(r7)
            com.google.speech.micro.GoogleHotwordRecognizer r4 = new com.google.speech.micro.GoogleHotwordRecognizer
            r4.<init>(r8)
            goto L_0x01bb
        L_0x018c:
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102841j.f287215a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r9, r7)
            java.lang.String r7 = "Speaker model should not be null for account %s in verification mode!"
            r9 = 21278(0x531e, float:2.9817E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r9)).mo56389s(r7, r11)
            com.google.speech.micro.GoogleHotwordRecognizer r4 = new com.google.speech.micro.GoogleHotwordRecognizer
            r4.<init>(r8)
            goto L_0x01bb
        L_0x01a4:
            if (r14 != 0) goto L_0x01ac
            com.google.speech.micro.GoogleHotwordRecognizer r4 = new com.google.speech.micro.GoogleHotwordRecognizer
            r4.<init>(r8)
            goto L_0x01bb
        L_0x01ac:
            com.google.speech.micro.GoogleHotwordRecognizer r4 = new com.google.speech.micro.GoogleHotwordRecognizer
            byte[][] r7 = new byte[r9][]
            r7[r10] = r14
            r4.<init>(r8, r7)
            goto L_0x01bb
        L_0x01b6:
            com.google.speech.micro.GoogleHotwordRecognizer r4 = new com.google.speech.micro.GoogleHotwordRecognizer
            r4.<init>(r8)
        L_0x01bb:
            com.google.android.libraries.assistant.hotword.v r4 = com.google.android.libraries.assistant.hotword.C18387x.m35837d(r5, r6, r8, r4)
            r5 = r4
            com.google.android.libraries.assistant.hotword.i r5 = (com.google.android.libraries.assistant.hotword.C18372i) r5
            r5.f52129f = r3
            r5.f52130g = r11
            r4.mo23861d(r1)
            r1 = r25
            r4.mo23859b(r1)
            r4.mo23862e(r12)
            boolean r1 = r22.mo83846I()
            r4.mo23863f(r1)
            com.google.android.libraries.assistant.hotword.x r14 = r4.mo23895g()
        L_0x01dc:
            r0.f287224d = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102845n.<init>(com.google.android.apps.gsa.staticplugins.microdetection.d.m, com.google.android.libraries.gsa.k.g, com.google.android.apps.gsa.speech.microdetection.a.c.i, com.google.android.apps.gsa.shared.m.c, dagger.a, com.google.android.apps.gsa.shared.m.b.f, com.google.android.apps.gsa.speech.microdetection.a.d.a, com.google.android.apps.gsa.staticplugins.microdetection.d.q, android.content.Context, com.google.android.apps.gsa.staticplugins.microdetection.d.j, com.google.android.apps.gsa.c.f.u):void");
    }

    /* renamed from: c */
    public static C102843l m170604c(C92216a aVar, int i, int i2, GoogleHotwordData googleHotwordData, String str, int i3, C90536a aVar2) {
        C102832a aVar3 = new C102832a();
        if (aVar2 != null) {
            aVar3.f287147c = aVar2;
            if (aVar != null) {
                aVar3.f287145a = aVar;
                aVar3.f287149e = i;
                byte b = aVar3.f287156l;
                aVar3.f287150f = i2;
                aVar3.f287151g = i3;
                aVar3.f287156l = (byte) (((byte) (((byte) (b | 1)) | 2)) | 4);
                if (googleHotwordData != null) {
                    aVar3.f287146b = googleHotwordData;
                    if (str != null) {
                        aVar3.f287148d = str;
                        aVar3.mo93481f(true);
                        aVar3.mo93478c(false);
                        aVar3.mo93479d(false);
                        return aVar3;
                    }
                    throw new NullPointerException("Null locale");
                }
                throw new NullPointerException("Null googleHotwordData");
            }
            throw new NullPointerException("Null recognitionEngineCallback");
        }
        throw new NullPointerException("Null recognitionMode");
    }

    /* renamed from: g */
    private static void m170605g() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C90603k mo93506a(InputStream inputStream, C18382s sVar, int i, int i2, int i3, int i4) {
        SpeakerIdModel o;
        C18387x xVar = this.f287224d;
        if (xVar == null) {
            return null;
        }
        try {
            HotwordResult a = xVar.mo23896a(inputStream, sVar, i, i2, i3, i4, this.f287228h);
            if (a == null) {
                return null;
            }
            C58976aa aaVar = C58975e.f156826a;
            if (!(!this.f287242v || (o = a.mo84697o()) == null || this.f287232l == null)) {
                if (this.f287245y.mo79746e(C90082eg.f249888aD)) {
                    C59104x b = f287219a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "MicroRecognitionRunner");
                    ((C59052c) ((C59052c) b).mo56372aa(21281)).mo56386p("Saving speaker ID model");
                }
                this.f287239s.mo83845H(new SpeakerIdModel(this.f287232l, (byte[]) o.f253284b.mo56107c()), true, EventForDump.m147676e(6, "Saving model generated by micro"));
            }
            return new C90574e(a);
        } catch (UnsupportedOperationException e) {
            throw new C90452a(e, 214, C89885b.RECOGNIZER_HOTWORD_UNSUPPORTED_FEATURE_VALUE);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: com.google.speech.micro.EchoCancellingInputStream} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [com.google.protos.ai.b.b, com.google.android.apps.gsa.shared.speech.k, java.lang.String, com.google.common.o.oe] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x030e A[Catch:{ all -> 0x0428 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03b7 A[SYNTHETIC, Splitter:B:132:0x03b7] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0357 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012d A[Catch:{ all -> 0x043a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a5 A[SYNTHETIC, Splitter:B:60:0x01a5] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.shared.speech.C90603k mo93507b() {
        /*
            r24 = this;
            r8 = r24
            java.lang.String r9 = "Detection finished"
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.assistant.hotword.x r0 = r8.f287224d
            java.lang.String r10 = "MicroRecognitionRunner"
            r11 = 0
            if (r0 != 0) goto L_0x0027
            com.google.android.apps.gsa.staticplugins.microdetection.d.p r0 = r8.f287225e
            if (r0 == 0) goto L_0x0012
            goto L_0x0027
        L_0x0012:
            com.google.common.f.e r0 = f287219a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r10)
            java.lang.String r1 = "#waitForDetection - No Detectors found, returning."
            r2 = 21284(0x5324, float:2.9825E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            return r11
        L_0x0027:
            com.google.speech.micro.GoogleHotwordData r0 = r8.f287230j     // Catch:{ UnsatisfiedLinkError -> 0x04b4 }
            int r12 = r0.idealBufferBytes()     // Catch:{ UnsatisfiedLinkError -> 0x04b4 }
            com.google.common.base.ax r0 = r8.f287244x
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x04ac
            com.google.android.apps.gsa.c.f.u r0 = r8.f287246z
            com.google.common.base.ax r1 = r8.f287244x
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.c.f.k r1 = (com.google.android.apps.gsa.p5836c.p5843f.C74458k) r1
            java.io.InputStream r1 = r0.c(r1)
            boolean r0 = r8.f287234n
            r13 = 0
            java.lang.String r14 = ""
            r15 = 1
            if (r0 == 0) goto L_0x00f7
            com.google.android.apps.gsa.speech.microdetection.a.c.i r0 = r8.f287231k
            byte[] r2 = r0.mo87270k()
            if (r2 != 0) goto L_0x0067
            com.google.common.f.e r0 = f287219a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r10)
            java.lang.String r2 = "EchoCancellerConfig was null."
            r3 = 21297(0x5331, float:2.9843E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x00f7
        L_0x0067:
            byte[] r0 = r8.f287235o
            if (r0 == 0) goto L_0x00f7
            com.google.android.apps.gsa.speech.audio.o r0 = new com.google.android.apps.gsa.speech.audio.o     // Catch:{ Exception -> 0x00e4 }
            byte[] r3 = r8.f287235o     // Catch:{ Exception -> 0x00e4 }
            r0.<init>(r3, r13)     // Catch:{ Exception -> 0x00e4 }
            com.google.speech.micro.DecimatingInputStream r3 = new com.google.speech.micro.DecimatingInputStream     // Catch:{ Exception -> 0x00e4 }
            int r4 = r0.f257063a     // Catch:{ Exception -> 0x00e4 }
            r3.<init>(r4, r0)     // Catch:{ Exception -> 0x00e4 }
            boolean r0 = r8.f287237q
            if (r0 == 0) goto L_0x00d7
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0090 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0090 }
            java.lang.String r5 = r8.f287238r     // Catch:{ Exception -> 0x0090 }
            java.lang.String r6 = "mic_bytes.data"
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r4 = r4.getPath()     // Catch:{ Exception -> 0x0090 }
            r0.<init>(r4, r15)     // Catch:{ Exception -> 0x0090 }
            goto L_0x00a2
        L_0x0090:
            r0 = move-exception
            com.google.common.f.e r4 = f287219a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r10)
            r5 = 21295(0x532f, float:2.984E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r5)).mo56386p(r14)
            r0 = r11
        L_0x00a2:
            if (r0 == 0) goto L_0x00aa
            org.a.a.a.d.b r4 = new org.a.a.a.d.b
            r4.<init>(r1, r0)
            r1 = r4
        L_0x00aa:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00bd }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00bd }
            java.lang.String r5 = r8.f287238r     // Catch:{ Exception -> 0x00bd }
            java.lang.String r6 = "tts_bytes.data"
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x00bd }
            java.lang.String r4 = r4.getPath()     // Catch:{ Exception -> 0x00bd }
            r0.<init>(r4, r15)     // Catch:{ Exception -> 0x00bd }
            goto L_0x00cf
        L_0x00bd:
            r0 = move-exception
            com.google.common.f.e r4 = f287219a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r10)
            r5 = 21294(0x532e, float:2.9839E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r5)).mo56386p(r14)
            r0 = r11
        L_0x00cf:
            if (r0 == 0) goto L_0x00d7
            org.a.a.a.d.b r4 = new org.a.a.a.d.b
            r4.<init>(r3, r0)
            goto L_0x00d8
        L_0x00d7:
            r4 = r3
        L_0x00d8:
            r3 = r1
            com.google.speech.micro.EchoCancellingInputStream r0 = new com.google.speech.micro.EchoCancellingInputStream
            int r5 = r8.f287227g
            r1 = r0
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7 = r0
            goto L_0x00f8
        L_0x00e4:
            r0 = move-exception
            com.google.common.f.e r2 = f287219a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r10)
            java.lang.String r3 = "Unable to create DecimatingInputStream with DecodingInputStream parameter."
            r4 = 21296(0x5330, float:2.9842E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
        L_0x00f7:
            r7 = r1
        L_0x00f8:
            int r0 = r8.f287227g
            int r0 = r0 + r0
            int r0 = r0 / 1000
            int r0 = r0 * 1000
            int r1 = r8.f287228h
            int r6 = r0 * r1
            long r16 = java.lang.System.currentTimeMillis()
            r18 = 16777216(0x1000000, float:2.3509887E-38)
            r5 = 89
            m170605g()     // Catch:{ all -> 0x0443 }
            int r0 = r12 * 1000
            int r0 = r0 / r6
            int r0 = r0 + 2000
            int r1 = r8.f287227g     // Catch:{ all -> 0x0443 }
            int r0 = r0 * r1
            int r0 = r0 + r0
            int r1 = r8.f287228h     // Catch:{ all -> 0x0443 }
            int r0 = r0 * r1
            int r0 = r0 / 1000
            com.google.android.libraries.assistant.hotword.s r4 = new com.google.android.libraries.assistant.hotword.s     // Catch:{ all -> 0x0443 }
            int r2 = r1 + r1
            r4.<init>(r12, r0, r2, r1)     // Catch:{ all -> 0x0443 }
            com.google.android.apps.gsa.speech.microdetection.a.d.a r0 = r8.f287240t     // Catch:{ all -> 0x043a }
            r0.f258179a = r4     // Catch:{ all -> 0x043a }
            boolean r0 = r8.f287237q     // Catch:{ all -> 0x043a }
            if (r0 == 0) goto L_0x0141
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x043a }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x043a }
            java.lang.String r2 = r8.f287238r     // Catch:{ all -> 0x043a }
            java.lang.String r3 = "erased_bytes.data"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x043a }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x043a }
            r0.<init>(r1, r15)     // Catch:{ all -> 0x043a }
            r3 = r0
            goto L_0x0142
        L_0x0141:
            r3 = r11
        L_0x0142:
            boolean r0 = r8.f287221B     // Catch:{ all -> 0x042e }
            if (r0 == 0) goto L_0x01a5
            r4.mo23888b()
            com.google.common.p4541l.C59337t.m92221a(r7)
            com.google.android.libraries.assistant.hotword.x r0 = r8.f287224d
            if (r0 == 0) goto L_0x0153
            r0.mo23898c()
        L_0x0153:
            com.google.android.apps.gsa.staticplugins.microdetection.d.p r0 = r8.f287225e
            if (r0 == 0) goto L_0x015a
            r0.mo93512a()
        L_0x015a:
            if (r3 == 0) goto L_0x015f
            r3.close()
        L_0x015f:
            long r0 = java.lang.System.currentTimeMillis()
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r4 = r3.f164093a
            r4 = r4 | 2
            r3.f164093a = r4
            r3.f164258m = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r4 = r3.f164249d
            r4 = r4 | r18
            r3.f164249d = r4
            long r0 = r0 - r16
            r3.f164143ax = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r11, r11, r11)
            com.google.common.f.e r0 = f287219a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r10)
            r1 = 21291(0x532b, float:2.9835E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r1)).mo56386p(r9)
            return r11
        L_0x01a5:
            com.google.android.libraries.assistant.hotword.r r2 = r4.mo23887a(r7)     // Catch:{ all -> 0x042e }
            m170605g()     // Catch:{ all -> 0x042e }
            com.google.android.apps.gsa.speech.audio.ac r0 = r8.f287236p     // Catch:{ all -> 0x042e }
            if (r0 == 0) goto L_0x01b9
            int r1 = r2.f52173a     // Catch:{ all -> 0x042e }
            byte[] r5 = r4.mo23890d()     // Catch:{ all -> 0x042e }
            r0.mo86832a(r5, r1, r12)     // Catch:{ all -> 0x042e }
        L_0x01b9:
            boolean r0 = r8.f287237q     // Catch:{ all -> 0x042e }
            if (r0 == 0) goto L_0x01f0
            if (r3 == 0) goto L_0x01f0
            byte[] r0 = r4.mo23890d()     // Catch:{ all -> 0x042e }
            int r1 = r2.f52173a     // Catch:{ all -> 0x042e }
            int r5 = r2.f52174b     // Catch:{ all -> 0x042e }
            int r5 = r5 + r1
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r1, r5)     // Catch:{ all -> 0x042e }
            r3.write(r0)     // Catch:{ Exception -> 0x01d0 }
            goto L_0x01f0
        L_0x01d0:
            r0 = move-exception
            r1 = r0
            com.google.common.f.e r0 = f287219a     // Catch:{ all -> 0x042e }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x042e }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x042e }
            r0.mo56378ag(r5, r10)     // Catch:{ all -> 0x042e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x042e }
            com.google.common.f.x r0 = r0.mo56382g(r1)     // Catch:{ all -> 0x042e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x042e }
            r1 = 21290(0x532a, float:2.9834E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x042e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x042e }
            r0.mo56386p(r14)     // Catch:{ all -> 0x042e }
        L_0x01f0:
            int r0 = r2.f52173a     // Catch:{ all -> 0x042e }
            int r5 = r2.f52174b     // Catch:{ all -> 0x042e }
            r1 = r24
            r15 = r2
            r2 = r7
            r21 = r3
            r3 = r4
            r22 = r4
            r4 = r0
            r13 = 89
            r19 = r6
            r6 = r12
            r23 = r7
            r7 = r19
            com.google.android.apps.gsa.shared.speech.k r0 = r1.mo93506a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x042a }
            if (r0 == 0) goto L_0x026c
            r22.mo23888b()
            com.google.common.p4541l.C59337t.m92221a(r23)
            com.google.android.libraries.assistant.hotword.x r1 = r8.f287224d
            if (r1 == 0) goto L_0x021a
            r1.mo23898c()
        L_0x021a:
            com.google.android.apps.gsa.staticplugins.microdetection.d.p r1 = r8.f287225e
            if (r1 == 0) goto L_0x0221
            r1.mo93512a()
        L_0x0221:
            if (r21 == 0) goto L_0x0226
            r21.close()
        L_0x0226:
            long r1 = java.lang.System.currentTimeMillis()
            com.google.common.o.uf r3 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.tz r3 = (com.google.common.p4552o.C60548tz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r5 = r4.f164093a
            r5 = r5 | 2
            r4.f164093a = r5
            r4.f164258m = r13
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r5 = r4.f164249d
            r5 = r5 | r18
            r4.f164249d = r5
            long r1 = r1 - r16
            r4.f164143ax = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r1, r11, r11, r11)
            com.google.common.f.e r1 = f287219a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r10)
            r2 = 21289(0x5329, float:2.9832E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r9)
            return r0
        L_0x026c:
            int r0 = r15.f52173a     // Catch:{ all -> 0x042a }
            int r1 = r15.f52174b     // Catch:{ all -> 0x042a }
            com.google.android.apps.gsa.shared.speech.d.a r2 = r8.f287233m     // Catch:{ all -> 0x042a }
            com.google.android.apps.gsa.shared.speech.d.a r3 = com.google.android.apps.gsa.shared.speech.p7142d.C90536a.VOICE_ACTIONS     // Catch:{ all -> 0x042a }
            com.google.android.apps.gsa.staticplugins.microdetection.d.p r4 = r8.f287225e     // Catch:{ all -> 0x042a }
            if (r4 == 0) goto L_0x034e
            if (r2 == r3) goto L_0x0283
            r2 = r11
            r3 = r19
            r5 = r22
            r6 = 1
            r11 = 0
            goto L_0x0355
        L_0x0283:
            com.google.speech.micro.GoogleEndpointerData r2 = r4.f287259c     // Catch:{ all -> 0x042a }
            if (r2 == 0) goto L_0x02f9
            com.google.speech.micro.GoogleEndpointer r2 = r4.f287258b     // Catch:{ all -> 0x042a }
            if (r2 != 0) goto L_0x028c
            goto L_0x02f9
        L_0x028c:
            byte[] r3 = r22.mo23890d()     // Catch:{ all -> 0x042a }
            com.google.speech.micro.GoogleEndpointer$GoogleEndpointerResult r0 = r2.process(r3, r0, r1)     // Catch:{ all -> 0x042a }
            com.google.speech.micro.a r2 = r0.getEvent()     // Catch:{ all -> 0x042a }
            com.google.speech.micro.a r3 = r4.f287260d     // Catch:{ all -> 0x042a }
            if (r2 == r3) goto L_0x02f3
            r3 = r19
            r5 = r22
            byte[] r1 = r5.mo23891e(r3, r1)     // Catch:{ all -> 0x0428 }
            long r6 = r0.getEventTimestampMs()     // Catch:{ all -> 0x0428 }
            com.google.android.apps.gsa.shared.speech.o r0 = new com.google.android.apps.gsa.shared.speech.o     // Catch:{ all -> 0x0428 }
            r11 = 0
            r0.<init>(r11, r1, r6)     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.l r1 = com.google.speech.recognizer.p5233a.C67464l.f183356e     // Catch:{ all -> 0x0428 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.i r1 = (com.google.speech.recognizer.p5233a.C67461i) r1     // Catch:{ all -> 0x0428 }
            com.google.speech.micro.a r6 = com.google.speech.micro.C67363a.SPEECH     // Catch:{ all -> 0x0428 }
            if (r2 != r6) goto L_0x02d0
            com.google.speech.recognizer.a.k r6 = com.google.speech.recognizer.p5233a.C67463k.START_OF_SPEECH     // Catch:{ all -> 0x0428 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0428 }
            com.google.protobuf.bv r7 = r1.instance     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.l r7 = (com.google.speech.recognizer.p5233a.C67464l) r7     // Catch:{ all -> 0x0428 }
            int r6 = r6.f183355e     // Catch:{ all -> 0x0428 }
            r7.f183359b = r6     // Catch:{ all -> 0x0428 }
            int r6 = r7.f183358a     // Catch:{ all -> 0x0428 }
            r20 = 1
            r6 = r6 | 1
            r7.f183358a = r6     // Catch:{ all -> 0x0428 }
            goto L_0x02e5
        L_0x02d0:
            com.google.speech.recognizer.a.k r6 = com.google.speech.recognizer.p5233a.C67463k.END_OF_SPEECH     // Catch:{ all -> 0x0428 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0428 }
            com.google.protobuf.bv r7 = r1.instance     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.l r7 = (com.google.speech.recognizer.p5233a.C67464l) r7     // Catch:{ all -> 0x0428 }
            int r6 = r6.f183355e     // Catch:{ all -> 0x0428 }
            r7.f183359b = r6     // Catch:{ all -> 0x0428 }
            int r6 = r7.f183358a     // Catch:{ all -> 0x0428 }
            r20 = 1
            r6 = r6 | 1
            r7.f183358a = r6     // Catch:{ all -> 0x0428 }
        L_0x02e5:
            com.google.android.apps.gsa.shared.speech.c r6 = new com.google.android.apps.gsa.shared.speech.c     // Catch:{ all -> 0x0428 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.l r1 = (com.google.speech.recognizer.p5233a.C67464l) r1     // Catch:{ all -> 0x0428 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x0428 }
            r4.f287260d = r2     // Catch:{ all -> 0x0428 }
            goto L_0x030c
        L_0x02f3:
            r3 = r19
            r5 = r22
            r11 = 0
            goto L_0x030b
        L_0x02f9:
            r3 = r19
            r5 = r22
            r11 = 0
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102847p.f287257a     // Catch:{ all -> 0x0428 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0428 }
            java.lang.String r1 = "#process - SpeechDetector will not run."
            r2 = 21305(0x5339, float:2.9855E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0428 }
        L_0x030b:
            r6 = 0
        L_0x030c:
            if (r6 == 0) goto L_0x034c
            com.google.android.apps.gsa.shared.speech.o r0 = r6.f253086b     // Catch:{ all -> 0x0428 }
            com.google.android.apps.gsa.speech.b.a r1 = r8.f287222b     // Catch:{ all -> 0x0428 }
            r1.mo70941c(r6)     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.l r1 = r6.f253085a     // Catch:{ all -> 0x0428 }
            int r1 = r1.f183359b     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.k r1 = com.google.speech.recognizer.p5233a.C67463k.m97475a(r1)     // Catch:{ all -> 0x0428 }
            if (r1 != 0) goto L_0x0321
            com.google.speech.recognizer.a.k r1 = com.google.speech.recognizer.p5233a.C67463k.START_OF_SPEECH     // Catch:{ all -> 0x0428 }
        L_0x0321:
            com.google.speech.recognizer.a.k r2 = com.google.speech.recognizer.p5233a.C67463k.END_OF_SPEECH     // Catch:{ all -> 0x0428 }
            if (r1 != r2) goto L_0x034c
            com.google.speech.recognizer.a.l r1 = com.google.speech.recognizer.p5233a.C67464l.f183356e     // Catch:{ all -> 0x0428 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.i r1 = (com.google.speech.recognizer.p5233a.C67461i) r1     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.k r2 = com.google.speech.recognizer.p5233a.C67463k.END_OF_AUDIO     // Catch:{ all -> 0x0428 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0428 }
            com.google.protobuf.bv r4 = r1.instance     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.l r4 = (com.google.speech.recognizer.p5233a.C67464l) r4     // Catch:{ all -> 0x0428 }
            int r2 = r2.f183355e     // Catch:{ all -> 0x0428 }
            r4.f183359b = r2     // Catch:{ all -> 0x0428 }
            int r2 = r4.f183358a     // Catch:{ all -> 0x0428 }
            r6 = 1
            r2 = r2 | r6
            r4.f183358a = r2     // Catch:{ all -> 0x0428 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x0428 }
            com.google.speech.recognizer.a.l r1 = (com.google.speech.recognizer.p5233a.C67464l) r1     // Catch:{ all -> 0x0428 }
            com.google.android.apps.gsa.shared.speech.c r2 = new com.google.android.apps.gsa.shared.speech.c     // Catch:{ all -> 0x0428 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0428 }
            goto L_0x0355
        L_0x034c:
            r6 = 1
            goto L_0x0354
        L_0x034e:
            r3 = r19
            r5 = r22
            r6 = 1
            r11 = 0
        L_0x0354:
            r2 = 0
        L_0x0355:
            if (r2 == 0) goto L_0x03b7
            r5.mo23888b()
            com.google.common.p4541l.C59337t.m92221a(r23)
            com.google.android.libraries.assistant.hotword.x r0 = r8.f287224d
            if (r0 == 0) goto L_0x0364
            r0.mo23898c()
        L_0x0364:
            com.google.android.apps.gsa.staticplugins.microdetection.d.p r0 = r8.f287225e
            if (r0 == 0) goto L_0x036b
            r0.mo93512a()
        L_0x036b:
            if (r21 == 0) goto L_0x0370
            r21.close()
        L_0x0370:
            long r0 = java.lang.System.currentTimeMillis()
            com.google.common.o.uf r3 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.tz r3 = (com.google.common.p4552o.C60548tz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r5 = r4.f164093a
            r5 = r5 | 2
            r4.f164093a = r5
            r4.f164258m = r13
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r5 = r4.f164249d
            r5 = r5 | r18
            r4.f164249d = r5
            long r0 = r0 - r16
            r4.f164143ax = r0
            com.google.protobuf.bv r0 = r3.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            r1 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r1, r1, r1)
            com.google.common.f.e r0 = f287219a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r10)
            r1 = 21288(0x5328, float:2.9831E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r1)).mo56386p(r9)
            return r2
        L_0x03b7:
            int r0 = r15.f52174b     // Catch:{ all -> 0x0428 }
            if (r0 >= r12) goto L_0x041b
            r5.mo23888b()
            com.google.common.p4541l.C59337t.m92221a(r23)
            com.google.android.libraries.assistant.hotword.x r0 = r8.f287224d
            if (r0 == 0) goto L_0x03c8
            r0.mo23898c()
        L_0x03c8:
            com.google.android.apps.gsa.staticplugins.microdetection.d.p r0 = r8.f287225e
            if (r0 == 0) goto L_0x03cf
            r0.mo93512a()
        L_0x03cf:
            if (r21 == 0) goto L_0x03d4
            r21.close()
        L_0x03d4:
            long r0 = java.lang.System.currentTimeMillis()
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r4 = r3.f164093a
            r4 = r4 | 2
            r3.f164093a = r4
            r3.f164258m = r13
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r4 = r3.f164249d
            r4 = r4 | r18
            r3.f164249d = r4
            long r0 = r0 - r16
            r3.f164143ax = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            r1 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r1, r1, r1)
            com.google.common.f.e r0 = f287219a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r10)
            r2 = 21286(0x5326, float:2.9828E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r9)
            return r1
        L_0x041b:
            r6 = r3
            r4 = r5
            r3 = r21
            r7 = r23
            r5 = 89
            r11 = 0
            r13 = 0
            r15 = 1
            goto L_0x0142
        L_0x0428:
            r0 = move-exception
            goto L_0x0436
        L_0x042a:
            r0 = move-exception
            r5 = r22
            goto L_0x0436
        L_0x042e:
            r0 = move-exception
            r21 = r3
            r5 = r4
            r23 = r7
            r13 = 89
        L_0x0436:
            r4 = r5
            r3 = r21
            goto L_0x044a
        L_0x043a:
            r0 = move-exception
            r5 = r4
            r23 = r7
            r13 = 89
            r4 = r5
            r3 = 0
            goto L_0x044a
        L_0x0443:
            r0 = move-exception
            r23 = r7
            r13 = 89
            r3 = 0
            r4 = 0
        L_0x044a:
            if (r4 == 0) goto L_0x044f
            r4.mo23888b()
        L_0x044f:
            com.google.common.p4541l.C59337t.m92221a(r23)
            com.google.android.libraries.assistant.hotword.x r1 = r8.f287224d
            if (r1 == 0) goto L_0x0459
            r1.mo23898c()
        L_0x0459:
            com.google.android.apps.gsa.staticplugins.microdetection.d.p r1 = r8.f287225e
            if (r1 == 0) goto L_0x0460
            r1.mo93512a()
        L_0x0460:
            if (r3 == 0) goto L_0x0465
            r3.close()
        L_0x0465:
            long r1 = java.lang.System.currentTimeMillis()
            com.google.common.o.uf r3 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.tz r3 = (com.google.common.p4552o.C60548tz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r5 = r4.f164093a
            r5 = r5 | 2
            r4.f164093a = r5
            r4.f164258m = r13
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r5 = r4.f164249d
            r5 = r5 | r18
            r4.f164249d = r5
            long r1 = r1 - r16
            r4.f164143ax = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            r2 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r1, r2, r2, r2)
            com.google.common.f.e r1 = f287219a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r10)
            r2 = 21287(0x5327, float:2.983E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r9)
            throw r0
        L_0x04ac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "MicroRecognitionRunner: AudioListeningSessionAdapter should never be empty.\n"
            r0.<init>(r1)
            throw r0
        L_0x04b4:
            r0 = move-exception
            com.google.common.f.e r1 = f287219a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r10)
            java.lang.String r2 = "UnsatisfiedLinkError for idealBufferBytes"
            r3 = 21292(0x532c, float:2.9836E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102845n.mo93507b():com.google.android.apps.gsa.shared.speech.k");
    }

    /* renamed from: d */
    public final void mo93508d(Exception exc, String str, int i, int i2) {
        Level level;
        C59071e eVar = f287219a;
        if (i != 2) {
            level = i != 3 ? i != 4 ? i != 5 ? Level.SEVERE : Level.WARNING : Level.INFO : Level.FINE;
        } else {
            level = Level.FINEST;
        }
        C59052c g = eVar.mo56223a(level);
        g.mo56378ag(C58975e.f156826a, "MicroRecognitionRunner");
        ((C59052c) ((C59052c) g.mo56382g(exc)).mo56372aa(21299)).mo56389s("%s", str);
        this.f287222b.mo70939a(new C90515g(str, exc, i2, false));
    }

    /* renamed from: e */
    public final void mo93509e() {
        C58838bb.m90884s(this.f287220A == null, "Duplicate call to start.");
        this.f287220A = this.f287229i.mo28207g("Detection loop", new C102842k(this));
    }

    /* renamed from: f */
    public final void mo93510f() {
        C59104x b = f287219a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicroRecognitionRunner");
        ((C59052c) ((C59052c) b).mo56372aa(21301)).mo56386p("Stopping hotword detection.");
        Future future = this.f287220A;
        if (future != null) {
            future.cancel(true);
            this.f287220A = null;
        }
        this.f287221B = true;
    }
}
