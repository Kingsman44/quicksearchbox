package com.google.android.apps.search.soundsearch.p10660g;

import com.google.common.util.concurrent.C60870cx;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.soundsearch.g.c */
/* compiled from: PG */
public final /* synthetic */ class C141692c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C141701j f384558a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f384559b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f384560c;

    /* renamed from: d */
    public final /* synthetic */ InputStream f384561d;

    /* renamed from: e */
    public final /* synthetic */ Duration f384562e;

    /* renamed from: f */
    public final /* synthetic */ int f384563f;

    public /* synthetic */ C141692c(C141701j jVar, C60870cx cxVar, C60870cx cxVar2, int i, InputStream inputStream, Duration duration) {
        this.f384558a = jVar;
        this.f384559b = cxVar;
        this.f384560c = cxVar2;
        this.f384563f = i;
        this.f384561d = inputStream;
        this.f384562e = duration;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039 A[SYNTHETIC, Splitter:B:10:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x03ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r17 = this;
            r1 = r17
            com.google.android.apps.search.soundsearch.g.j r2 = r1.f384558a
            com.google.common.util.concurrent.cx r0 = r1.f384559b
            com.google.common.util.concurrent.cx r3 = r1.f384560c
            int r4 = r1.f384563f
            java.io.InputStream r6 = r1.f384561d
            j$.time.Duration r5 = r1.f384562e
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r0)     // Catch:{ Exception -> 0x0023 }
            com.google.apps.tiktok.account.data.a r0 = (com.google.apps.tiktok.account.data.C46108a) r0     // Catch:{ Exception -> 0x0023 }
            if (r0 == 0) goto L_0x0032
            java.lang.String r7 = "pseudonymous"
            com.google.apps.tiktok.account.data.j r0 = r0.mo50210b()     // Catch:{ Exception -> 0x0023 }
            java.lang.String r0 = r0.f121165j     // Catch:{ Exception -> 0x0023 }
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0033
        L_0x0023:
            r0 = move-exception
            com.google.common.f.e r7 = com.google.android.apps.search.soundsearch.p10660g.C141701j.f384577a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Failed to check if Account is Pseudonymous"
            r9 = 41790(0xa33e, float:5.856E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r0)).mo56372aa(r9)).mo56386p(r8)
        L_0x0032:
            r0 = 0
        L_0x0033:
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            if (r0 != 0) goto L_0x0057
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r3)     // Catch:{ Exception -> 0x0048 }
            com.google.apps.tiktok.h.a r0 = (com.google.apps.tiktok.p3644h.C47103a) r0     // Catch:{ Exception -> 0x0048 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r0.f122701a     // Catch:{ Exception -> 0x0048 }
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0057
        L_0x0048:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.search.soundsearch.p10660g.C141701j.f384577a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r8 = "Failed to get Auth Token for signed-in user!"
            r9 = 41789(0xa33d, float:5.8559E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r9)).mo56386p(r8)
        L_0x0057:
            io.grpc.i.aj r0 = r2.f384583g
            r0.getClass()
            android.content.Context r0 = r2.f384579c
            java.lang.String r3 = r2.f384581e
            com.google.speech.h.ce r8 = com.google.speech.p5208h.C66607ce.f181191f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.speech.h.cd r8 = (com.google.speech.p5208h.C66606cd) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.speech.h.ce r9 = (com.google.speech.p5208h.C66607ce) r9
            int r10 = r9.f181193a
            r11 = 2
            r10 = r10 | r11
            r9.f181193a = r10
            r13 = 1
            r9.f181195c = r13
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.speech.h.ce r9 = (com.google.speech.p5208h.C66607ce) r9
            int r10 = r9.f181193a
            r10 = r10 | r13
            r9.f181193a = r10
            java.lang.String r10 = "sound-search"
            r9.f181194b = r10
            com.google.audio.b.a.r r9 = com.google.audio.p4107b.p4108a.C54595r.f143331e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.audio.b.a.q r9 = (com.google.audio.p4107b.p4108a.C54594q) r9
            r10 = 7
            r14 = 8
            r15 = 4
            if (r4 != r10) goto L_0x00c4
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.audio.b.a.r r10 = (com.google.audio.p4107b.p4108a.C54595r) r10
            r12 = 3
            r10.f143334b = r12
            int r12 = r10.f143333a
            r12 = r12 | r13
            r10.f143333a = r12
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.audio.b.a.r r10 = (com.google.audio.p4107b.p4108a.C54595r) r10
            r10.f143335c = r14
            int r12 = r10.f143333a
            r12 = r12 | r11
            r10.f143333a = r12
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.audio.b.a.r r10 = (com.google.audio.p4107b.p4108a.C54595r) r10
            int r12 = r10.f143333a
            r12 = r12 | r15
            r10.f143333a = r12
            java.lang.String r12 = "3"
            r10.f143336d = r12
            goto L_0x00e0
        L_0x00c4:
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.audio.b.a.r r10 = (com.google.audio.p4107b.p4108a.C54595r) r10
            r10.f143334b = r15
            int r12 = r10.f143333a
            r12 = r12 | r13
            r10.f143333a = r12
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.audio.b.a.r r10 = (com.google.audio.p4107b.p4108a.C54595r) r10
            r10.f143335c = r15
            int r12 = r10.f143333a
            r12 = r12 | r11
            r10.f143333a = r12
        L_0x00e0:
            com.google.speech.k.a.z r10 = com.google.speech.p5224k.p5225a.C67248z.f182795j
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.speech.k.a.y r10 = (com.google.speech.p5224k.p5225a.C67247y) r10
            com.google.audio.b.a.g r12 = com.google.audio.p4107b.p4108a.C54584g.f143307f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.audio.b.a.e r12 = (com.google.audio.p4107b.p4108a.C54582e) r12
            java.lang.String r14 = "phone"
            java.lang.Object r14 = r0.getSystemService(r14)
            android.telephony.TelephonyManager r14 = (android.telephony.TelephonyManager) r14
            java.lang.String r14 = r14.getSimCountryIso()
            boolean r16 = android.text.TextUtils.isEmpty(r14)
            if (r16 == 0) goto L_0x010b
            java.util.Locale r14 = java.util.Locale.getDefault()
            java.lang.String r14 = r14.getCountry()
            goto L_0x0111
        L_0x010b:
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r14 = r14.toUpperCase(r11)
        L_0x0111:
            r12.copyOnWrite()
            com.google.protobuf.bv r11 = r12.instance
            com.google.audio.b.a.g r11 = (com.google.audio.p4107b.p4108a.C54584g) r11
            r14.getClass()
            int r13 = r11.f143309a
            r13 = r13 | 128(0x80, float:1.794E-43)
            r11.f143309a = r13
            r11.f143312d = r14
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r11 = r11.toLanguageTag()
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.audio.b.a.g r13 = (com.google.audio.p4107b.p4108a.C54584g) r13
            r11.getClass()
            int r14 = r13.f143309a
            r14 = r14 | r15
            r13.f143309a = r14
            r13.f143311c = r11
            r12.copyOnWrite()
            com.google.protobuf.bv r11 = r12.instance
            com.google.audio.b.a.g r11 = (com.google.audio.p4107b.p4108a.C54584g) r11
            int r13 = r4 + -1
            r11.f143313e = r13
            int r13 = r11.f143309a
            r13 = r13 | 256(0x100, float:3.59E-43)
            r11.f143309a = r13
            r11 = 1
            r12.mo54135a(r11)
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.speech.k.a.z r13 = (com.google.speech.p5224k.p5225a.C67248z) r13
            com.google.protobuf.bv r12 = r12.build()
            com.google.audio.b.a.g r12 = (com.google.audio.p4107b.p4108a.C54584g) r12
            r12.getClass()
            r13.f182799b = r12
            int r12 = r13.f182798a
            r12 = r12 | r11
            r13.f182798a = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.speech.k.a.z r11 = (com.google.speech.p5224k.p5225a.C67248z) r11
            com.google.protobuf.bv r9 = r9.build()
            com.google.audio.b.a.r r9 = (com.google.audio.p4107b.p4108a.C54595r) r9
            r9.getClass()
            r11.f182800c = r9
            int r9 = r11.f182798a
            r12 = 2
            r9 = r9 | r12
            r11.f182798a = r9
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.speech.k.a.z r9 = (com.google.speech.p5224k.p5225a.C67248z) r9
            int r11 = r9.f182798a
            r11 = r11 | r15
            r9.f182798a = r11
            r11 = 0
            r9.f182801d = r11
            com.google.protobuf.bv r9 = r10.build()
            com.google.speech.k.a.z r9 = (com.google.speech.p5224k.p5225a.C67248z) r9
            com.google.protobuf.bt r10 = com.google.speech.p5224k.p5225a.C67248z.f182796k
            j$.util.Optional r9 = p3186j$.util.Optional.m71637of(r9)
            com.google.android.apps.search.soundsearch.g.c.a r11 = new com.google.android.apps.search.soundsearch.g.c.a
            r11.<init>(r9, r10)
            com.google.speech.h.by r9 = com.google.speech.p5208h.C66599by.f181159p
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.speech.h.bx r9 = (com.google.speech.p5208h.C66598bx) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.speech.h.by r10 = (com.google.speech.p5208h.C66599by) r10
            int r12 = r10.f181162a
            r12 = r12 | r15
            r10.f181162a = r12
            java.lang.String r12 = "Android"
            r10.f181167f = r12
            java.lang.String r10 = android.os.Build.DISPLAY
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.speech.h.by r12 = (com.google.speech.p5208h.C66599by) r12
            r10.getClass()
            int r13 = r12.f181162a
            r14 = 8
            r13 = r13 | r14
            r12.f181162a = r13
            r12.f181168g = r10
            java.lang.String r10 = android.os.Build.MODEL
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.speech.h.by r12 = (com.google.speech.p5208h.C66599by) r12
            r10.getClass()
            int r13 = r12.f181162a
            r13 = r13 | 64
            r12.f181162a = r13
            r12.f181171j = r10
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.speech.h.by r10 = (com.google.speech.p5208h.C66599by) r10
            int r12 = r10.f181162a
            r12 = r12 | 16
            r10.f181162a = r12
            java.lang.String r12 = "voice-search"
            r10.f181169h = r12
            android.content.pm.PackageManager r10 = r0.getPackageManager()
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0475 }
            r12 = 0
            android.content.pm.PackageInfo r0 = r10.getPackageInfo(r0, r12)     // Catch:{ NameNotFoundException -> 0x0475 }
            int r0 = r0.versionCode
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.speech.h.by r10 = (com.google.speech.p5208h.C66599by) r10
            r0.getClass()
            int r12 = r10.f181162a
            r12 = r12 | 32
            r10.f181162a = r12
            r10.f181170i = r0
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.speech.h.by r0 = (com.google.speech.p5208h.C66599by) r0
            int r10 = r0.f181162a
            r12 = 2048(0x800, float:2.87E-42)
            r10 = r10 | r12
            r0.f181162a = r10
            java.lang.String r10 = ""
            r0.f181175n = r10
            com.google.protobuf.bv r0 = r9.build()
            com.google.speech.h.by r0 = (com.google.speech.p5208h.C66599by) r0
            com.google.protobuf.bt r9 = com.google.speech.p5208h.C66599by.f181160q
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.android.apps.search.soundsearch.g.c.a r10 = new com.google.android.apps.search.soundsearch.g.c.a
            r10.<init>(r0, r9)
            com.google.speech.h.cm r0 = com.google.speech.p5208h.C66615cm.f181220j
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.speech.h.cl r0 = (com.google.speech.p5208h.C66614cl) r0
            boolean r9 = r7.isPresent()
            if (r9 == 0) goto L_0x0294
            com.google.speech.h.br r9 = com.google.speech.p5208h.C66592br.f181140e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.speech.h.bq r9 = (com.google.speech.p5208h.C66591bq) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.speech.h.br r13 = (com.google.speech.p5208h.C66592br) r13
            r3.getClass()
            int r14 = r13.f181142a
            r14 = r14 | r15
            r13.f181142a = r14
            r13.f181144c = r3
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.speech.h.br r3 = (com.google.speech.p5208h.C66592br) r3
            int r13 = r3.f181142a
            r14 = 2
            r13 = r13 | r14
            r3.f181142a = r13
            r13 = 1
            r3.f181143b = r13
            java.lang.Object r3 = r7.get()
            java.lang.String r3 = (java.lang.String) r3
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.speech.h.br r7 = (com.google.speech.p5208h.C66592br) r7
            r3.getClass()
            int r13 = r7.f181142a
            r14 = 8
            r13 = r13 | r14
            r7.f181142a = r13
            r7.f181145d = r3
            com.google.protobuf.bv r3 = r9.build()
            com.google.speech.h.br r3 = (com.google.speech.p5208h.C66592br) r3
            r0.mo59689c(r3)
            goto L_0x02a2
        L_0x0294:
            com.google.common.f.e r3 = com.google.android.apps.search.soundsearch.p10660g.p10663c.C141694b.f384566a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r7 = "AuthToken could not be included in request. Expected for logged-out users."
            r9 = 41805(0xa34d, float:5.8581E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r9)).mo56386p(r7)
        L_0x02a2:
            com.google.speech.h.bw r3 = com.google.speech.p5208h.C66597bw.f181154d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.speech.h.bv r3 = (com.google.speech.p5208h.C66596bv) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.speech.h.bw r7 = (com.google.speech.p5208h.C66597bw) r7
            int r9 = r7.f181156a
            r13 = 2
            r9 = r9 | r13
            r7.f181156a = r9
            r7.f181158c = r13
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.toLanguageTag()
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.speech.h.bw r9 = (com.google.speech.p5208h.C66597bw) r9
            r7.getClass()
            int r13 = r9.f181156a
            r14 = 1
            r13 = r13 | r14
            r9.f181156a = r13
            r9.f181157b = r7
            com.google.protobuf.bv r3 = r3.build()
            com.google.speech.h.bw r3 = (com.google.speech.p5208h.C66597bw) r3
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.speech.h.cm r7 = (com.google.speech.p5208h.C66615cm) r7
            r3.getClass()
            r7.f181228f = r3
            int r3 = r7.f181223a
            r9 = 2
            r3 = r3 | r9
            r7.f181223a = r3
            com.google.protobuf.bt r3 = com.google.speech.p5208h.C66615cm.f181221k
            com.google.protobuf.bv r0 = r0.build()
            com.google.speech.h.cm r0 = (com.google.speech.p5208h.C66615cm) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.android.apps.search.soundsearch.g.c.a r7 = new com.google.android.apps.search.soundsearch.g.c.a
            r7.<init>(r0, r3)
            com.google.speech.h.ag r0 = com.google.speech.p5208h.C66550ag.f180992c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.speech.h.af r0 = (com.google.speech.p5208h.C66549af) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.speech.h.ag r3 = (com.google.speech.p5208h.C66550ag) r3
            int r9 = r3.f180995a
            r13 = 1
            r9 = r9 | r13
            r3.f180995a = r9
            r3.f180996b = r13
            com.google.protobuf.bv r0 = r0.build()
            com.google.speech.h.ag r0 = (com.google.speech.p5208h.C66550ag) r0
            com.google.protobuf.bt r3 = com.google.speech.p5208h.C66550ag.f180993d
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.android.apps.search.soundsearch.g.c.a r9 = new com.google.android.apps.search.soundsearch.g.c.a
            r9.<init>(r0, r3)
            com.google.speech.h.l r0 = com.google.speech.p5208h.C66678l.f181384f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.speech.h.k r0 = (com.google.speech.p5208h.C66677k) r0
            com.google.speech.recognizer.a.at r3 = com.google.speech.recognizer.p5233a.C67451at.ADTS_AAC
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.speech.h.l r13 = (com.google.speech.p5208h.C66678l) r13
            int r3 = r3.f183321p
            r13.f181389b = r3
            int r3 = r13.f181388a
            r14 = 1
            r3 = r3 | r14
            r13.f181388a = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.speech.h.l r3 = (com.google.speech.p5208h.C66678l) r3
            int r13 = r3.f181388a
            r14 = 2
            r13 = r13 | r14
            r3.f181388a = r13
            r13 = 1182400512(0x467a0000, float:16000.0)
            r3.f181390c = r13
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.speech.h.l r3 = (com.google.speech.p5208h.C66678l) r3
            int r13 = r3.f181388a
            r13 = r13 | r15
            r3.f181388a = r13
            r13 = 1
            r3.f181391d = r13
            com.google.protobuf.bv r0 = r0.build()
            com.google.speech.h.l r0 = (com.google.speech.p5208h.C66678l) r0
            com.google.protobuf.bt r3 = com.google.speech.p5208h.C66678l.f181385g
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.android.apps.search.soundsearch.g.c.a r13 = new com.google.android.apps.search.soundsearch.g.c.a
            r13.<init>(r0, r3)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89850r(r11, r10, r7, r9, r13)
            r3 = r0
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            r7 = 0
        L_0x037a:
            if (r7 >= r3) goto L_0x0396
            java.lang.Object r9 = r0.get(r7)
            com.google.android.apps.search.soundsearch.g.c.a r9 = (com.google.android.apps.search.soundsearch.p10660g.p10663c.C141693a) r9
            j$.util.Optional r10 = r9.f384564a
            com.google.protobuf.ay r9 = r9.f384565b
            boolean r11 = r10.isPresent()
            if (r11 == 0) goto L_0x0393
            java.lang.Object r10 = r10.get()
            r8.mo58885m(r9, r10)
        L_0x0393:
            int r7 = r7 + 1
            goto L_0x037a
        L_0x0396:
            com.google.protobuf.bv r0 = r8.build()
            com.google.speech.h.ce r0 = (com.google.speech.p5208h.C66607ce) r0
            io.grpc.i.aj r3 = r2.f384583g
            com.google.android.apps.search.soundsearch.g.b.b r3 = (com.google.android.apps.search.soundsearch.p10660g.p10662b.C141687b) r3
            r3.mo20123c(r0)
            r0 = 7
            if (r4 != r0) goto L_0x03ab
            r2.mo116658c(r6, r5)
            goto L_0x0452
        L_0x03ab:
            com.google.android.libraries.as.a.c r3 = new com.google.android.libraries.as.a.c
            java.lang.String r7 = "audio/mp4a-latm"
            r8 = 16000(0x3e80, float:2.2421E-41)
            r9 = 2048(0x800, float:2.87E-42)
            r10 = 16000(0x3e80, float:2.2421E-41)
            r11 = 1
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            byte[] r0 = new byte[r12]     // Catch:{ all -> 0x0454 }
        L_0x03bc:
            java.util.concurrent.atomic.AtomicBoolean r4 = r2.f384582f     // Catch:{ all -> 0x0454 }
            boolean r4 = r4.get()     // Catch:{ all -> 0x0454 }
            if (r4 != 0) goto L_0x044f
            r4 = 0
            int r5 = com.google.common.p4541l.C59332o.m92210a(r3, r0, r4, r12)     // Catch:{ all -> 0x0454 }
            com.google.common.f.e r4 = com.google.android.apps.search.soundsearch.p10660g.C141701j.f384577a     // Catch:{ all -> 0x0454 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x0454 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0454 }
            r6 = 41793(0xa341, float:5.8564E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)     // Catch:{ all -> 0x0454 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0454 }
            java.lang.String r6 = "Streaming audio, %d bytes"
            r4.mo56387q(r6, r5)     // Catch:{ all -> 0x0454 }
            io.grpc.i.aj r4 = r2.f384583g     // Catch:{ all -> 0x0454 }
            r4.getClass()
            if (r5 <= 0) goto L_0x0422
            com.google.speech.h.j r4 = com.google.speech.p5208h.C66676j.f181378c     // Catch:{ all -> 0x0454 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x0454 }
            com.google.speech.h.i r4 = (com.google.speech.p5208h.C66675i) r4     // Catch:{ all -> 0x0454 }
            r6 = 0
            com.google.protobuf.z r7 = com.google.protobuf.C63088z.m96142D(r0, r6, r5)     // Catch:{ all -> 0x0454 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0454 }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x0454 }
            com.google.speech.h.j r6 = (com.google.speech.p5208h.C66676j) r6     // Catch:{ all -> 0x0454 }
            int r8 = r6.f181382a     // Catch:{ all -> 0x0454 }
            r9 = 1
            r8 = r8 | r9
            r6.f181382a = r8     // Catch:{ all -> 0x0454 }
            r6.f181383b = r7     // Catch:{ all -> 0x0454 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x0454 }
            com.google.speech.h.j r4 = (com.google.speech.p5208h.C66676j) r4     // Catch:{ all -> 0x0454 }
            io.grpc.i.aj r6 = r2.f384583g     // Catch:{ all -> 0x0454 }
            com.google.speech.h.ce r7 = com.google.speech.p5208h.C66607ce.f181191f     // Catch:{ all -> 0x0454 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x0454 }
            com.google.speech.h.cd r7 = (com.google.speech.p5208h.C66606cd) r7     // Catch:{ all -> 0x0454 }
            com.google.protobuf.bt r8 = com.google.speech.p5208h.C66676j.f181379d     // Catch:{ all -> 0x0454 }
            r7.mo58885m(r8, r4)     // Catch:{ all -> 0x0454 }
            com.google.protobuf.bv r4 = r7.build()     // Catch:{ all -> 0x0454 }
            com.google.speech.h.ce r4 = (com.google.speech.p5208h.C66607ce) r4     // Catch:{ all -> 0x0454 }
            com.google.android.apps.search.soundsearch.g.b.b r6 = (com.google.android.apps.search.soundsearch.p10660g.p10662b.C141687b) r6     // Catch:{ all -> 0x0454 }
            r6.mo20123c(r4)     // Catch:{ all -> 0x0454 }
        L_0x0422:
            if (r5 == r12) goto L_0x03bc
            io.grpc.i.aj r0 = r2.f384583g     // Catch:{ all -> 0x0454 }
            com.google.speech.h.ce r4 = com.google.speech.p5208h.C66607ce.f181191f     // Catch:{ all -> 0x0454 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x0454 }
            com.google.speech.h.cd r4 = (com.google.speech.p5208h.C66606cd) r4     // Catch:{ all -> 0x0454 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0454 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0454 }
            com.google.speech.h.ce r5 = (com.google.speech.p5208h.C66607ce) r5     // Catch:{ all -> 0x0454 }
            int r6 = r5.f181193a     // Catch:{ all -> 0x0454 }
            r7 = 8
            r6 = r6 | r7
            r5.f181193a = r6     // Catch:{ all -> 0x0454 }
            r6 = 1
            r5.f181197e = r6     // Catch:{ all -> 0x0454 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x0454 }
            com.google.speech.h.ce r4 = (com.google.speech.p5208h.C66607ce) r4     // Catch:{ all -> 0x0454 }
            com.google.android.apps.search.soundsearch.g.b.b r0 = (com.google.android.apps.search.soundsearch.p10660g.p10662b.C141687b) r0     // Catch:{ all -> 0x0454 }
            r0.mo20123c(r4)     // Catch:{ all -> 0x0454 }
            io.grpc.i.aj r0 = r2.f384583g     // Catch:{ all -> 0x0454 }
            r0.mo20121a()     // Catch:{ all -> 0x0454 }
        L_0x044f:
            r3.close()
        L_0x0452:
            r0 = 0
            return r0
        L_0x0454:
            r0 = move-exception
            r2 = r0
            r3.close()     // Catch:{ all -> 0x045a }
            goto L_0x0474
        L_0x045a:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0474 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r0[r5] = r4     // Catch:{ Exception -> 0x0474 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r6, r0)     // Catch:{ Exception -> 0x0474 }
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0474 }
            r4[r5] = r3     // Catch:{ Exception -> 0x0474 }
            r0.invoke(r2, r4)     // Catch:{ Exception -> 0x0474 }
        L_0x0474:
            throw r2
        L_0x0475:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            goto L_0x047d
        L_0x047c:
            throw r2
        L_0x047d:
            goto L_0x047c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.soundsearch.p10660g.C141692c.call():java.lang.Object");
    }
}
