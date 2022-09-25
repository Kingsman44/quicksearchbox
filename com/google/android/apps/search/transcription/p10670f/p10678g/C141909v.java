package com.google.android.apps.search.transcription.p10670f.p10678g;

import com.google.android.apps.search.transcription.p10670f.C141803av;
import com.google.android.apps.search.transcription.p10670f.C141804aw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.transcription.f.g.v */
/* compiled from: PG */
public final class C141909v {

    /* renamed from: a */
    public static final C59071e f385031a = C59071e.m91332i("com.google.android.apps.search.transcription.f.g.v");

    /* renamed from: b */
    public final C141911x f385032b;

    /* renamed from: c */
    public final C141890c f385033c;

    /* renamed from: d */
    public final ConcurrentHashMap f385034d = new ConcurrentHashMap();

    /* renamed from: e */
    public final Optional f385035e;

    /* renamed from: f */
    public final Optional f385036f;

    /* renamed from: g */
    public final C141892e f385037g;

    /* renamed from: h */
    private final C141804aw f385038h;

    public C141909v(C141804aw awVar, C141911x xVar, C141892e eVar, C141890c cVar, Optional optional, Optional optional2) {
        this.f385038h = awVar;
        this.f385032b = xVar;
        this.f385037g = eVar;
        this.f385033c = cVar;
        this.f385035e = optional;
        this.f385036f = optional2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x027e A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02e0 A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e8 A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0340 A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0374 A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03ac A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03af A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03c2 A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03da A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0434 A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0447 A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0119 A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014b A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018b A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x018e A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a0 A[ADDED_TO_REGION, Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bf A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01dd A[Catch:{ i -> 0x0473 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e6 A[Catch:{ i -> 0x0473 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116877a(android.content.Context r18, android.content.Intent r19, com.google.android.apps.search.transcription.p10670f.p10678g.C141908u r20, int r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            java.lang.String r6 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r0 = "android.speech.extra.ENABLE_FORMATTING"
            java.lang.String r7 = "android.speech.extra.ENABLE_BIASING_DEVICE_CONTEXT"
            java.lang.String r8 = "android.speech.extra.BIASING_STRINGS"
            java.lang.String r9 = "android.speech.extra.MASK_OFFENSIVE_WORDS"
            java.lang.String r10 = "com.google.recognition.extra.REQUEST_DIARIZATION"
            com.google.common.f.e r11 = f385031a
            com.google.common.f.x r11 = r11.mo56224b()
            java.lang.String r12 = "RecognitionService#onStartListening"
            r13 = 41937(0xa3d1, float:5.8766E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            com.google.android.apps.search.transcription.f.g.e r11 = r1.f385037g
            com.google.android.apps.search.transcription.f.g.x r12 = r1.f385032b
            java.lang.String r12 = r12.mo116879c(r3, r5)
            java.lang.String r13 = com.google.android.apps.search.transcription.p10670f.C141786ae.m230051e(r19)
            com.google.android.libraries.search.b.b r11 = r11.f385010a
            com.google.android.libraries.search.b.i.g r14 = com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a.f98785h
            com.google.protobuf.bt r15 = com.google.common.p4552o.aqh.f159745g
            com.google.common.o.aqh r16 = com.google.common.p4552o.aqh.f159744f
            com.google.protobuf.bn r16 = r16.createBuilder()
            r4 = r16
            com.google.common.o.aqg r4 = (com.google.common.p4552o.aqg) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.common.o.aqh r2 = (com.google.common.p4552o.aqh) r2
            r12.getClass()
            r16 = r6
            int r6 = r2.f159747a
            r6 = r6 | 4
            r2.f159747a = r6
            r2.f159750d = r12
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.common.o.aqh r2 = (com.google.common.p4552o.aqh) r2
            r13.getClass()
            int r6 = r2.f159747a
            r6 = r6 | 8
            r2.f159747a = r6
            r2.f159751e = r13
            com.google.protobuf.bv r2 = r4.build()
            com.google.common.o.aqh r2 = (com.google.common.p4552o.aqh) r2
            com.google.android.libraries.search.b.i.a r2 = r14.mo40812e(r15, r2)
            r11.mo19974a(r2)
            j$.util.Optional r2 = r1.f385036f
            com.google.android.apps.search.transcription.f.g.i r4 = new com.google.android.apps.search.transcription.f.g.i
            r4.<init>(r1, r5, r3)
            r2.ifPresent(r4)
            r2 = 0
            com.google.android.apps.search.transcription.f.g.x r4 = r1.f385032b     // Catch:{ i -> 0x0473 }
            boolean r6 = com.google.android.apps.search.transcription.p10670f.C141786ae.m230053g(r19)     // Catch:{ i -> 0x0473 }
            java.lang.String r11 = r4.mo116879c(r3, r5)     // Catch:{ i -> 0x0473 }
            com.google.android.apps.search.transcription.f.br r12 = com.google.android.apps.search.transcription.p10670f.C141851bs.m230219y()     // Catch:{ i -> 0x0473 }
            int r13 = com.google.android.apps.search.transcription.p10670f.C141786ae.m230047a(r19)     // Catch:{ i -> 0x0473 }
            r12.mo116809n(r13)     // Catch:{ i -> 0x0473 }
            java.lang.String r13 = com.google.android.apps.search.transcription.p10670f.C141786ae.m230051e(r19)     // Catch:{ i -> 0x0473 }
            r12.mo116808m(r13)     // Catch:{ i -> 0x0473 }
            if (r11 == 0) goto L_0x046b
            r13 = r12
            com.google.android.apps.search.transcription.f.i r13 = (com.google.android.apps.search.transcription.p10670f.C141915i) r13     // Catch:{ i -> 0x0473 }
            r13.f385049b = r11     // Catch:{ i -> 0x0473 }
            r13 = r12
            com.google.android.apps.search.transcription.f.i r13 = (com.google.android.apps.search.transcription.p10670f.C141915i) r13     // Catch:{ i -> 0x0473 }
            r14 = 3
            r13.f385053f = r14     // Catch:{ i -> 0x0473 }
            r12.mo116814s(r6)     // Catch:{ i -> 0x0473 }
            r6 = 5000(0x1388, float:7.006E-42)
            r12.mo116817v(r6)     // Catch:{ i -> 0x0473 }
            java.lang.String r6 = "android.speech.extra.PARTIAL_RESULTS"
            r13 = 0
            boolean r6 = r3.getBooleanExtra(r6, r13)     // Catch:{ i -> 0x0473 }
            r12.mo116806k(r6)     // Catch:{ i -> 0x0473 }
            r12.mo116816u(r13)     // Catch:{ i -> 0x0473 }
            boolean r6 = androidx.core.p094f.C1888a.m5150d()     // Catch:{ i -> 0x0473 }
            r14 = 1
            if (r6 == 0) goto L_0x00ce
            boolean r6 = r3.hasExtra(r9)     // Catch:{ i -> 0x0473 }
            if (r6 == 0) goto L_0x00ce
            boolean r6 = r3.getBooleanExtra(r9, r14)     // Catch:{ i -> 0x0473 }
            goto L_0x00d4
        L_0x00ce:
            java.lang.String r6 = "com.google.recognition.extra.MASK_OFFENSIVE_WORDS"
            boolean r6 = r3.getBooleanExtra(r6, r14)     // Catch:{ i -> 0x0473 }
        L_0x00d4:
            r12.mo116815t(r6)     // Catch:{ i -> 0x0473 }
            r12.mo116812q(r13)     // Catch:{ i -> 0x0473 }
            boolean r6 = androidx.core.p094f.C1888a.m5150d()     // Catch:{ i -> 0x0473 }
            if (r6 == 0) goto L_0x010c
            boolean r6 = r3.hasExtra(r8)     // Catch:{ i -> 0x0473 }
            if (r6 != 0) goto L_0x00e7
            goto L_0x010c
        L_0x00e7:
            java.util.ArrayList r6 = r3.getStringArrayListExtra(r8)     // Catch:{ i -> 0x0473 }
            if (r6 == 0) goto L_0x00f9
            boolean r8 = r6.isEmpty()     // Catch:{ i -> 0x0473 }
            if (r8 == 0) goto L_0x00f4
            goto L_0x00f9
        L_0x00f4:
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89842j(r6)     // Catch:{ i -> 0x0473 }
            goto L_0x0110
        L_0x00f9:
            com.google.common.f.e r6 = com.google.android.apps.search.transcription.p10670f.C141786ae.f384786a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ i -> 0x0473 }
            java.lang.String r8 = "No valid strings passed to EXTRA_BIASING_STRINGS; ignoring it"
            r9 = 41836(0xa36c, float:5.8625E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r9)).mo56386p(r8)     // Catch:{ i -> 0x0473 }
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ i -> 0x0473 }
            goto L_0x0110
        L_0x010c:
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ i -> 0x0473 }
        L_0x0110:
            r12.mo116802g(r6)     // Catch:{ i -> 0x0473 }
            boolean r6 = androidx.core.p094f.C1888a.m5150d()     // Catch:{ i -> 0x0473 }
            if (r6 == 0) goto L_0x013a
            boolean r6 = r3.hasExtra(r7)     // Catch:{ i -> 0x0473 }
            if (r6 != 0) goto L_0x0120
            goto L_0x013a
        L_0x0120:
            boolean r6 = com.google.android.apps.search.transcription.p10670f.C141786ae.m230053g(r19)     // Catch:{ i -> 0x0473 }
            if (r6 != 0) goto L_0x0135
            com.google.common.f.e r6 = com.google.android.apps.search.transcription.p10670f.C141786ae.f384786a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ i -> 0x0473 }
            java.lang.String r7 = "EXTRA_ENABLE_BIASING_DEVICE_CONTEXT can't be used when EXTRA_PREFER_OFFLINE is false"
            r8 = 41856(0xa380, float:5.8653E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56386p(r7)     // Catch:{ i -> 0x0473 }
            goto L_0x013a
        L_0x0135:
            boolean r6 = r3.getBooleanExtra(r7, r13)     // Catch:{ i -> 0x0473 }
            goto L_0x013b
        L_0x013a:
            r6 = 0
        L_0x013b:
            r12.mo116804i(r6)     // Catch:{ i -> 0x0473 }
            boolean r6 = androidx.core.p094f.C1888a.m5150d()     // Catch:{ i -> 0x0473 }
            r7 = -1
            if (r6 == 0) goto L_0x018e
            boolean r6 = r3.hasExtra(r0)     // Catch:{ i -> 0x0473 }
            if (r6 == 0) goto L_0x018e
            java.lang.String r0 = r3.getStringExtra(r0)     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x0199
            int r6 = r0.hashCode()     // Catch:{ i -> 0x0473 }
            r8 = -46576386(0xfffffffffd394cfe, float:-1.5394184E37)
            if (r6 == r8) goto L_0x016a
            r8 = 651215103(0x26d0c0ff, float:1.4485211E-15)
            if (r6 == r8) goto L_0x0160
            goto L_0x0174
        L_0x0160:
            java.lang.String r6 = "quality"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0174
            r0 = 0
            goto L_0x0175
        L_0x016a:
            java.lang.String r6 = "latency"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0174
            r0 = 1
            goto L_0x0175
        L_0x0174:
            r0 = -1
        L_0x0175:
            if (r0 == 0) goto L_0x018b
            if (r0 == r14) goto L_0x0188
            com.google.common.f.e r0 = com.google.android.apps.search.transcription.p10670f.C141786ae.f384786a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ i -> 0x0473 }
            java.lang.String r6 = "Wrong value passed to EXTRA_ENABLE_FORMATTING; ignoring it"
            r8 = 41846(0xa376, float:5.8639E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r8)).mo56386p(r6)     // Catch:{ i -> 0x0473 }
            goto L_0x0199
        L_0x0188:
            com.google.speech.j.he r0 = com.google.speech.p5218j.C66996he.OPTIMIZE_LATENCY     // Catch:{ i -> 0x0473 }
            goto L_0x019a
        L_0x018b:
            com.google.speech.j.he r0 = com.google.speech.p5218j.C66996he.DEFAULT_OPTIMIZE_QUALITY     // Catch:{ i -> 0x0473 }
            goto L_0x019a
        L_0x018e:
            java.lang.String r0 = "com.google.recognition.extra.ENABLE_TEXT_FORMATTING"
            boolean r0 = r3.getBooleanExtra(r0, r13)     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x0199
            com.google.speech.j.he r0 = com.google.speech.p5218j.C66996he.DEFAULT_OPTIMIZE_QUALITY     // Catch:{ i -> 0x0473 }
            goto L_0x019a
        L_0x0199:
            r0 = r2
        L_0x019a:
            boolean r6 = com.google.android.apps.search.transcription.p10670f.C141786ae.m230053g(r19)     // Catch:{ i -> 0x0473 }
            if (r6 != 0) goto L_0x01b5
            if (r0 == 0) goto L_0x01b5
            com.google.common.f.e r0 = com.google.android.apps.search.transcription.p10670f.C141786ae.f384786a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ i -> 0x0473 }
            java.lang.String r6 = "EXTRA_ENABLE_FORMATTING can't be used when EXTRA_PREFER_OFFLINE is false"
            r8 = 41845(0xa375, float:5.8637E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r8)).mo56386p(r6)     // Catch:{ i -> 0x0473 }
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ i -> 0x0473 }
            goto L_0x01b9
        L_0x01b5:
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r0)     // Catch:{ i -> 0x0473 }
        L_0x01b9:
            boolean r6 = r0.isPresent()     // Catch:{ i -> 0x0473 }
            if (r6 == 0) goto L_0x01d3
            r12.mo116805j(r0)     // Catch:{ i -> 0x0473 }
            boolean r0 = androidx.core.p094f.C1888a.m5150d()     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x01cf
            java.lang.String r0 = "android.speech.extra.HIDE_PARTIAL_TRAILING_PUNCTUATION"
            boolean r0 = r3.getBooleanExtra(r0, r13)     // Catch:{ i -> 0x0473 }
            goto L_0x01d0
        L_0x01cf:
            r0 = 0
        L_0x01d0:
            r12.mo116807l(r0)     // Catch:{ i -> 0x0473 }
        L_0x01d3:
            j$.util.Optional r0 = com.google.android.apps.search.transcription.p10670f.C141786ae.m230048b(r19)     // Catch:{ i -> 0x0473 }
            boolean r6 = r0.isPresent()     // Catch:{ i -> 0x0473 }
            if (r6 == 0) goto L_0x01e0
            r12.mo116801f(r0)     // Catch:{ i -> 0x0473 }
        L_0x01e0:
            java.lang.String r0 = com.google.android.apps.search.transcription.p10670f.C141786ae.m230052f(r19)     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x027e
            int r6 = r0.hashCode()     // Catch:{ i -> 0x0473 }
            r8 = -733110353(0xffffffffd44d9faf, float:-3.53258937E12)
            r9 = 2
            if (r6 == r8) goto L_0x020f
            r8 = -604887686(0xffffffffdbf2257a, float:-1.36316301E17)
            if (r6 == r8) goto L_0x0205
            r8 = -496591057(0xffffffffe2669f2f, float:-1.0635554E21)
            if (r6 == r8) goto L_0x01fb
            goto L_0x0218
        L_0x01fb:
            java.lang.String r6 = "android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0218
            r7 = 2
            goto L_0x0218
        L_0x0205:
            java.lang.String r6 = "android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0218
            r7 = 1
            goto L_0x0218
        L_0x020f:
            java.lang.String r6 = "android.speech.extra.AUDIO_SOURCE"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0218
            r7 = 0
        L_0x0218:
            if (r7 == 0) goto L_0x025d
            if (r7 == r14) goto L_0x023e
            if (r7 == r9) goto L_0x0220
            goto L_0x02ac
        L_0x0220:
            int r0 = com.google.android.apps.search.transcription.p10670f.p10678g.C141911x.m230344a(r19)     // Catch:{ i -> 0x0473 }
            if (r0 <= 0) goto L_0x022e
            r12.mo116817v(r0)     // Catch:{ i -> 0x0473 }
            r12.mo116811p(r14)     // Catch:{ i -> 0x0473 }
            goto L_0x02ac
        L_0x022e:
            com.google.common.f.e r0 = com.google.android.apps.search.transcription.p10670f.p10678g.C141911x.f385039a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ i -> 0x0473 }
            java.lang.String r6 = "EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS is not set with positive value; ignoring EXTRA_SEGMENTED_SESSION"
            r7 = 41945(0xa3d9, float:5.8777E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r6)     // Catch:{ i -> 0x0473 }
            goto L_0x02ac
        L_0x023e:
            int r0 = com.google.android.apps.search.transcription.p10670f.p10678g.C141911x.m230345b(r19)     // Catch:{ i -> 0x0473 }
            if (r0 <= 0) goto L_0x024e
            r12.mo116810o(r0)     // Catch:{ i -> 0x0473 }
            r12.mo116817v(r13)     // Catch:{ i -> 0x0473 }
            r12.mo116811p(r14)     // Catch:{ i -> 0x0473 }
            goto L_0x02ac
        L_0x024e:
            com.google.common.f.e r0 = com.google.android.apps.search.transcription.p10670f.p10678g.C141911x.f385039a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ i -> 0x0473 }
            java.lang.String r6 = "EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS is not set with positive value; ignoring EXTRA_SEGMENTED_SESSION"
            r7 = 41944(0xa3d8, float:5.8776E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r6)     // Catch:{ i -> 0x0473 }
            goto L_0x02ac
        L_0x025d:
            r0 = r12
            com.google.android.apps.search.transcription.f.i r0 = (com.google.android.apps.search.transcription.p10670f.C141915i) r0     // Catch:{ i -> 0x0473 }
            j$.util.Optional r0 = r0.f385050c     // Catch:{ i -> 0x0473 }
            boolean r0 = r0.isPresent()     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x026f
            r12.mo116817v(r13)     // Catch:{ i -> 0x0473 }
            r12.mo116811p(r14)     // Catch:{ i -> 0x0473 }
            goto L_0x02ac
        L_0x026f:
            com.google.common.f.e r0 = com.google.android.apps.search.transcription.p10670f.p10678g.C141911x.f385039a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ i -> 0x0473 }
            java.lang.String r6 = "EXTRA_AUDIO_SOURCE is not set correctly; ignoring EXTRA_SEGMENTED_SESSION"
            r7 = 41943(0xa3d7, float:5.8775E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r6)     // Catch:{ i -> 0x0473 }
            goto L_0x02ac
        L_0x027e:
            int r0 = com.google.android.apps.search.transcription.p10670f.p10678g.C141911x.m230345b(r19)     // Catch:{ i -> 0x0473 }
            if (r0 <= 0) goto L_0x028e
            r12.mo116810o(r0)     // Catch:{ i -> 0x0473 }
            r12.mo116817v(r13)     // Catch:{ i -> 0x0473 }
            r12.mo116811p(r14)     // Catch:{ i -> 0x0473 }
            goto L_0x02ac
        L_0x028e:
            int r0 = com.google.android.apps.search.transcription.p10670f.p10678g.C141911x.m230344a(r19)     // Catch:{ i -> 0x0473 }
            if (r0 <= 0) goto L_0x029b
            r12.mo116817v(r0)     // Catch:{ i -> 0x0473 }
            r12.mo116811p(r14)     // Catch:{ i -> 0x0473 }
            goto L_0x02ac
        L_0x029b:
            r0 = r12
            com.google.android.apps.search.transcription.f.i r0 = (com.google.android.apps.search.transcription.p10670f.C141915i) r0     // Catch:{ i -> 0x0473 }
            j$.util.Optional r0 = r0.f385050c     // Catch:{ i -> 0x0473 }
            boolean r0 = r0.isPresent()     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x02ac
            r12.mo116817v(r13)     // Catch:{ i -> 0x0473 }
            r12.mo116811p(r14)     // Catch:{ i -> 0x0473 }
        L_0x02ac:
            com.google.android.apps.search.transcription.d.a r0 = r4.f385041c     // Catch:{ i -> 0x0473 }
            com.google.common.b.ij r0 = r0.f384734b     // Catch:{ i -> 0x0473 }
            boolean r0 = r0.contains(r11)     // Catch:{ i -> 0x0473 }
            if (r0 != 0) goto L_0x02c2
            android.content.Context r0 = r4.f385040b     // Catch:{ i -> 0x0473 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ i -> 0x0473 }
            boolean r0 = r11.equals(r0)     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x03bc
        L_0x02c2:
            com.google.common.f.e r0 = com.google.android.apps.search.transcription.p10670f.p10678g.C141911x.f385039a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ i -> 0x0473 }
            java.lang.String r6 = "#enableFirstPartyAppFeatures"
            r7 = 41942(0xa3d6, float:5.8773E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r6)     // Catch:{ i -> 0x0473 }
            java.lang.String r0 = "com.google.android.apps.recorder"
            com.google.android.apps.search.transcription.f.bs r6 = r12.mo116818w()     // Catch:{ i -> 0x0473 }
            java.lang.String r6 = r6.mo116832n()     // Catch:{ i -> 0x0473 }
            boolean r0 = r0.equals(r6)     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x02e2
            com.google.android.apps.search.transcription.d.a r0 = r4.f385041c     // Catch:{ i -> 0x0473 }
        L_0x02e2:
            boolean r0 = r3.hasExtra(r10)     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x0336
            byte[] r0 = r3.getByteArrayExtra(r10)     // Catch:{ i -> 0x0473 }
            if (r0 != 0) goto L_0x02ef
            goto L_0x0336
        L_0x02ef:
            boolean r0 = com.google.android.apps.search.transcription.p10670f.C141786ae.m230053g(r19)     // Catch:{ i -> 0x0473 }
            if (r0 != 0) goto L_0x0308
            com.google.common.f.e r0 = com.google.android.apps.search.transcription.p10670f.C141786ae.f384786a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ i -> 0x0473 }
            java.lang.String r4 = "EXTRA_REQUEST_DIARIZATION can't be used when EXTRA_PREFER_OFFLINE is false"
            r6 = 41844(0xa374, float:5.8636E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r4)     // Catch:{ i -> 0x0473 }
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ i -> 0x0473 }
            goto L_0x033a
        L_0x0308:
            byte[] r0 = r3.getByteArrayExtra(r10)     // Catch:{ ct -> 0x0322 }
            r0.getClass()
            byte[] r0 = (byte[]) r0     // Catch:{ ct -> 0x0322 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0322 }
            com.google.speech.j.gg r6 = com.google.speech.p5218j.C66971gg.f182040a     // Catch:{ ct -> 0x0322 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r0, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x0322 }
            com.google.speech.j.gg r0 = (com.google.speech.p5218j.C66971gg) r0     // Catch:{ ct -> 0x0322 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x0322 }
            goto L_0x033a
        L_0x0322:
            r0 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.search.transcription.p10670f.C141786ae.f384786a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ i -> 0x0473 }
            java.lang.String r6 = "Failed to parse diarization config from intent."
            r7 = 41843(0xa373, float:5.8635E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r7)).mo56386p(r6)     // Catch:{ i -> 0x0473 }
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ i -> 0x0473 }
            goto L_0x033a
        L_0x0336:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ i -> 0x0473 }
        L_0x033a:
            boolean r4 = r0.isPresent()     // Catch:{ i -> 0x0473 }
            if (r4 == 0) goto L_0x0343
            r12.mo116803h(r0)     // Catch:{ i -> 0x0473 }
        L_0x0343:
            java.lang.String r0 = "com.google.recognition.extra.REQUEST_SODA_EVENTS"
            boolean r0 = r3.getBooleanExtra(r0, r13)     // Catch:{ i -> 0x0473 }
            boolean r4 = com.google.android.apps.search.transcription.p10670f.C141786ae.m230053g(r19)     // Catch:{ i -> 0x0473 }
            if (r4 != 0) goto L_0x0360
            if (r0 == 0) goto L_0x0360
            com.google.common.f.e r0 = com.google.android.apps.search.transcription.p10670f.p10678g.C141911x.f385039a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ i -> 0x0473 }
            java.lang.String r4 = "EXTRA_REQUEST_SODA_EVENTS can't be used when EXTRA_PREFER_OFFLINE is false"
            r6 = 41950(0xa3de, float:5.8784E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r4)     // Catch:{ i -> 0x0473 }
            r0 = 0
        L_0x0360:
            r12.mo116816u(r0)     // Catch:{ i -> 0x0473 }
            java.lang.String r0 = "com.google.recognition.extra.MUTE_AUDIO_BEEPS"
            boolean r0 = r3.getBooleanExtra(r0, r13)     // Catch:{ i -> 0x0473 }
            r12.mo116812q(r0)     // Catch:{ i -> 0x0473 }
            java.lang.String r0 = "com.google.recognition.extra.ADDITIONAL_LANGUAGES"
            java.lang.String[] r0 = r3.getStringArrayExtra(r0)     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x038f
            int r4 = r0.length     // Catch:{ i -> 0x0473 }
            if (r4 != 0) goto L_0x0378
            goto L_0x038f
        L_0x0378:
            com.google.common.f.e r4 = com.google.android.apps.search.transcription.p10670f.C141786ae.f384786a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ i -> 0x0473 }
            java.lang.String r6 = "Using additional languages specified in RecognizerIntent: %s"
            java.lang.String r7 = java.util.Arrays.toString(r0)     // Catch:{ i -> 0x0473 }
            r8 = 41835(0xa36b, float:5.8623E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r8)).mo56389s(r6, r7)     // Catch:{ i -> 0x0473 }
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89844l(r0)     // Catch:{ i -> 0x0473 }
            goto L_0x03a1
        L_0x038f:
            com.google.common.f.e r0 = com.google.android.apps.search.transcription.p10670f.C141786ae.f384786a     // Catch:{ i -> 0x0473 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ i -> 0x0473 }
            java.lang.String r4 = "No additional languages specified in RecognizerIntent"
            r6 = 41834(0xa36a, float:5.8622E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r4)     // Catch:{ i -> 0x0473 }
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ i -> 0x0473 }
        L_0x03a1:
            r12.mo116798c(r0)     // Catch:{ i -> 0x0473 }
            r4 = r16
            boolean r0 = r3.hasExtra(r4)     // Catch:{ i -> 0x0473 }
            if (r0 != 0) goto L_0x03af
            java.lang.String r0 = ""
            goto L_0x03b7
        L_0x03af:
            java.lang.String r0 = r3.getStringExtra(r4)     // Catch:{ i -> 0x0473 }
            java.lang.String r0 = com.google.common.base.C58837ba.m90858g(r0)     // Catch:{ i -> 0x0473 }
        L_0x03b7:
            r3 = r12
            com.google.android.apps.search.transcription.f.i r3 = (com.google.android.apps.search.transcription.p10670f.C141915i) r3     // Catch:{ i -> 0x0473 }
            r3.f385052e = r0     // Catch:{ i -> 0x0473 }
        L_0x03bc:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ i -> 0x0473 }
            r3 = 30
            if (r0 != r3) goto L_0x03da
            com.google.android.apps.search.transcription.f.a r0 = com.google.android.apps.search.transcription.p10670f.C141808b.m230094b()     // Catch:{ i -> 0x0473 }
            com.google.android.libraries.search.m.b.b r3 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_TRANSCRIPTION_VOICE_RECOGNITION     // Catch:{ i -> 0x0473 }
            r0.mo116715b(r3)     // Catch:{ i -> 0x0473 }
            r0.mo116716c(r5)     // Catch:{ i -> 0x0473 }
            com.google.android.apps.search.transcription.f.b r0 = r0.mo116714a()     // Catch:{ i -> 0x0473 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ i -> 0x0473 }
            r12.mo116799d(r0)     // Catch:{ i -> 0x0473 }
            goto L_0x042a
        L_0x03da:
            boolean r0 = androidx.core.p094f.C1888a.m5149c()     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x042a
            android.content.AttributionSource r0 = r20.mo20696a()     // Catch:{ i -> 0x0473 }
            if (r0 == 0) goto L_0x042a
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ i -> 0x0473 }
            if (r3 == 0) goto L_0x0422
            r4 = r12
            com.google.android.apps.search.transcription.f.i r4 = (com.google.android.apps.search.transcription.p10670f.C141915i) r4     // Catch:{ i -> 0x0473 }
            r4.f385051d = r3     // Catch:{ i -> 0x0473 }
            r3 = r18
            if (r3 == 0) goto L_0x042a
            r4 = r12
            com.google.android.apps.search.transcription.f.i r4 = (com.google.android.apps.search.transcription.p10670f.C141915i) r4     // Catch:{ i -> 0x0473 }
            j$.util.Optional r4 = r4.f385050c     // Catch:{ i -> 0x0473 }
            boolean r4 = r4.isEmpty()     // Catch:{ i -> 0x0473 }
            if (r4 != 0) goto L_0x0411
            r4 = r12
            com.google.android.apps.search.transcription.f.i r4 = (com.google.android.apps.search.transcription.p10670f.C141915i) r4     // Catch:{ i -> 0x0473 }
            j$.util.Optional r4 = r4.f385050c     // Catch:{ i -> 0x0473 }
            java.lang.Object r4 = r4.get()     // Catch:{ i -> 0x0473 }
            com.google.android.apps.search.transcription.f.d r4 = (com.google.android.apps.search.transcription.p10670f.C141860d) r4     // Catch:{ i -> 0x0473 }
            boolean r4 = r4.mo116859g()     // Catch:{ i -> 0x0473 }
            if (r4 != 0) goto L_0x042a
        L_0x0411:
            android.content.ContextParams$Builder r4 = new android.content.ContextParams$Builder     // Catch:{ i -> 0x0473 }
            r4.<init>()     // Catch:{ i -> 0x0473 }
            android.content.ContextParams$Builder r0 = r4.setNextAttributionSource(r0)     // Catch:{ i -> 0x0473 }
            android.content.ContextParams r0 = r0.build()     // Catch:{ i -> 0x0473 }
            r3.createContext(r0)     // Catch:{ i -> 0x0473 }
            goto L_0x042a
        L_0x0422:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ i -> 0x0473 }
            java.lang.String r3 = "Null attributionSource"
            r0.<init>(r3)     // Catch:{ i -> 0x0473 }
            throw r0     // Catch:{ i -> 0x0473 }
        L_0x042a:
            com.google.android.apps.search.transcription.f.bs r0 = r12.mo116818w()     // Catch:{ i -> 0x0473 }
            boolean r3 = r0.mo116839u()     // Catch:{ i -> 0x0473 }
            if (r3 == 0) goto L_0x043d
            com.google.android.apps.search.transcription.f.g.e r3 = r1.f385037g     // Catch:{ i -> 0x0473 }
            com.google.android.libraries.search.b.b r3 = r3.f385010a     // Catch:{ i -> 0x0473 }
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a.f98791n     // Catch:{ i -> 0x0473 }
            r3.mo19974a(r4)     // Catch:{ i -> 0x0473 }
        L_0x043d:
            j$.util.Optional r3 = r0.mo116827i()     // Catch:{ i -> 0x0473 }
            boolean r3 = r3.isPresent()     // Catch:{ i -> 0x0473 }
            if (r3 == 0) goto L_0x0450
            com.google.android.apps.search.transcription.f.g.e r3 = r1.f385037g     // Catch:{ i -> 0x0473 }
            com.google.android.libraries.search.b.b r3 = r3.f385010a     // Catch:{ i -> 0x0473 }
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a.f98792o     // Catch:{ i -> 0x0473 }
            r3.mo19974a(r4)     // Catch:{ i -> 0x0473 }
        L_0x0450:
            com.google.android.apps.search.transcription.f.g.l r3 = new com.google.android.apps.search.transcription.f.g.l     // Catch:{ i -> 0x0473 }
            r4 = r20
            r3.<init>(r1, r4)     // Catch:{ i -> 0x0473 }
            com.google.android.apps.search.transcription.f.g.t r5 = new com.google.android.apps.search.transcription.f.g.t     // Catch:{ i -> 0x0473 }
            r5.<init>(r1, r4, r0)     // Catch:{ i -> 0x0473 }
            com.google.android.apps.search.transcription.f.aw r6 = r1.f385038h     // Catch:{ i -> 0x0473 }
            com.google.android.apps.search.transcription.f.av r0 = r6.mo116758a(r0, r3, r5)     // Catch:{ i -> 0x0473 }
            j$.util.concurrent.ConcurrentHashMap r3 = r1.f385034d     // Catch:{ i -> 0x0473 }
            r3.put(r4, r0)     // Catch:{ i -> 0x0473 }
            r0.mo116755b()     // Catch:{ i -> 0x0473 }
            return
        L_0x046b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ i -> 0x0473 }
            java.lang.String r3 = "Null triggerApplicationId"
            r0.<init>(r3)     // Catch:{ i -> 0x0473 }
            throw r0     // Catch:{ i -> 0x0473 }
        L_0x0473:
            com.google.common.f.e r0 = f385031a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r3 = 41938(0xa3d2, float:5.8768E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.transcription.p10670f.p10678g.C141909v.mo116877a(android.content.Context, android.content.Intent, com.google.android.apps.search.transcription.f.g.u, int):void");
    }

    /* renamed from: b */
    public final void mo116878b(C141908u uVar) {
        ((C59052c) ((C59052c) f385031a.mo56224b()).mo56372aa(41939)).mo56386p("RecognitionService#onStopListening");
        C141803av avVar = (C141803av) this.f385034d.get(uVar);
        if (avVar != null) {
            avVar.mo116756c();
        }
        this.f385036f.ifPresent(C141897j.f385016a);
    }
}
