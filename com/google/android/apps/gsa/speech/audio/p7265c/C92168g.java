package com.google.android.apps.gsa.speech.audio.p7265c;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.speech.audio.C92156ab;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.speech.audio.c.g */
/* compiled from: PG */
public final class C92168g implements C92156ab {

    /* renamed from: a */
    public long f256948a = 0;

    /* renamed from: b */
    public Optional f256949b = Optional.empty();

    /* renamed from: c */
    private final C92194i f256950c;

    /* renamed from: d */
    private final C22871g f256951d;

    /* renamed from: e */
    private final C90021c f256952e;

    /* renamed from: f */
    private final C60950i f256953f;

    /* renamed from: g */
    private Optional f256954g = Optional.empty();

    /* renamed from: h */
    private final C92172k f256955h;

    /* renamed from: i */
    private final C92171j f256956i;

    public C92168g(C92194i iVar, C22871g gVar, C92172k kVar, C92171j jVar, C90021c cVar, C60950i iVar2) {
        this.f256950c = iVar;
        this.f256951d = gVar;
        this.f256955h = kVar;
        this.f256956i = jVar;
        this.f256952e = cVar;
        this.f256953f = iVar2;
    }

    /* renamed from: f */
    private final void m151304f(C60870cx cxVar) {
        this.f256951d.mo28211k(cxVar, "EarconSoundManager check play result", new C92166e());
    }

    /* renamed from: a */
    public final void mo86828a() {
        this.f256951d.mo28212l("EarconSoundManager cancel earcon", new C92161a(this));
    }

    /* renamed from: b */
    public final void mo86829b(String str, String str2) {
        if (!str.isEmpty() || !str2.isEmpty()) {
            mo86828a();
        }
    }

    /* renamed from: c */
    public final void mo86830c(boolean z) {
        this.f256951d.mo28212l("EarconSoundManager playSpeakNowSound", new C92165d(this, z));
    }

    /* renamed from: d */
    public final void mo86831d(long j, boolean z) {
        if (j != 0) {
            this.f256951d.mo28212l("EarconSoundManager playVoiceRequestStartBeep", new C92164c(this, j, z));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86833e(boolean r13) {
        /*
            r12 = this;
            com.google.android.apps.gsa.speech.audio.c.k r0 = r12.f256955h
            com.google.android.apps.gsa.z.a.f r1 = r0.f256960a
            boolean r1 = r1.mo71759t()
            r2 = 3
            r3 = 1
            r4 = 2
            if (r1 != 0) goto L_0x0034
            com.google.android.apps.gsa.z.a.f r1 = r0.f256960a
            int r1 = r1.mo71742c()
            if (r1 != r4) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            if (r13 != 0) goto L_0x0032
            com.google.android.apps.gsa.shared.util.b r13 = r0.f256961b
            android.view.accessibility.AccessibilityManager r13 = r13.f253818a
            boolean r13 = r13.isEnabled()
            if (r13 != 0) goto L_0x0032
            dagger.a r13 = r0.f256962c
            java.lang.Object r13 = r13.mo27525b()
            com.google.android.apps.gsa.shared.util.v r13 = (com.google.android.apps.gsa.shared.util.C91123v) r13
            boolean r13 = r13.mo85390b()
            if (r13 != 0) goto L_0x0032
            r13 = 1
            goto L_0x0035
        L_0x0032:
            r13 = 2
            goto L_0x0035
        L_0x0034:
            r13 = 3
        L_0x0035:
            com.google.android.apps.gsa.speech.audio.c.j r0 = r12.f256956i
            boolean r0 = r0.mo86834a()
            if (r0 == 0) goto L_0x00cd
            j$.time.Instant r0 = p3186j$.time.Instant.now()
            j$.util.Optional r1 = r12.f256954g
            boolean r1 = r1.isPresent()
            r5 = 0
            if (r1 == 0) goto L_0x0069
            j$.time.temporal.ChronoUnit r1 = p3186j$.time.temporal.ChronoUnit.SECONDS
            j$.util.Optional r6 = r12.f256954g
            java.lang.Object r6 = r6.get()
            j$.time.temporal.Temporal r6 = (p3186j$.time.temporal.Temporal) r6
            long r6 = r1.between(r6, r0)
            r8 = 2
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0069
            j$.util.Optional r13 = r12.f256949b
            boolean r13 = r13.isPresent()
            if (r13 != 0) goto L_0x0068
            r13 = 0
            goto L_0x0069
        L_0x0068:
            return
        L_0x0069:
            com.google.android.apps.gsa.speech.audio.e.i r6 = r12.f256950c
            com.google.android.apps.gsa.shared.m.c r1 = r12.f256952e
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247417gk
            long r10 = r1.mo79743a(r7)
            com.google.android.apps.gsa.shared.m.c r1 = r6.f257036g
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247418gl
            long r7 = r1.mo79743a(r7)
            int r1 = (int) r7
            if (r1 != 0) goto L_0x0089
            r7 = 2132017432(0x7f140118, float:1.9673142E38)
            java.lang.String r8 = "<beep>Listening</beep>"
        L_0x0083:
            r9 = 1
            com.google.common.util.concurrent.cx r1 = r6.mo86845a(r7, r8, r9, r10)
            goto L_0x00a9
        L_0x0089:
            if (r1 != r3) goto L_0x0091
            r7 = 2132017433(0x7f140119, float:1.9673144E38)
            java.lang.String r8 = "<beep>Listening alt</beep>"
            goto L_0x0083
        L_0x0091:
            if (r1 != r4) goto L_0x0099
            r7 = 2132017434(0x7f14011a, float:1.9673146E38)
            java.lang.String r8 = "<beep>Listening mono</beep>"
            goto L_0x0083
        L_0x0099:
            if (r1 != r2) goto L_0x00a1
            r7 = 2132017477(0x7f140145, float:1.9673234E38)
            java.lang.String r8 = "<beep>Listening home</beep>"
            goto L_0x0083
        L_0x00a1:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x00a9:
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r1)
            r12.f256949b = r2
            com.google.android.libraries.gsa.k.g r2 = r12.f256951d
            com.google.android.apps.gsa.speech.audio.c.f r4 = new com.google.android.apps.gsa.speech.audio.c.f
            r4.<init>(r12)
            java.lang.String r5 = "EarconSoundManager track earcon"
            r2.mo28211k(r1, r5, r4)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            r12.f256954g = r0
            if (r13 != r3) goto L_0x00cc
            com.google.android.apps.gsa.speech.audio.e.i r13 = r12.f256950c
            com.google.common.util.concurrent.cx r13 = r13.mo86846b()
            r12.m151304f(r13)
        L_0x00cc:
            return
        L_0x00cd:
            if (r13 != r3) goto L_0x00d6
            com.google.android.apps.gsa.speech.audio.e.i r13 = r12.f256950c
            com.google.common.util.concurrent.cx r13 = r13.mo86846b()
            goto L_0x00f5
        L_0x00d6:
            if (r13 != r4) goto L_0x00e7
            com.google.android.apps.gsa.speech.audio.e.i r0 = r12.f256950c
            r1 = 2132017477(0x7f140145, float:1.9673234E38)
            java.lang.String r2 = "<beep>Open</beep>"
            r3 = 1
            r4 = 0
            com.google.common.util.concurrent.cx r13 = r0.mo86845a(r1, r2, r3, r4)
            goto L_0x00f5
        L_0x00e7:
            com.google.android.apps.gsa.speech.audio.e.i r0 = r12.f256950c
            r1 = 2132017478(0x7f140146, float:1.9673236E38)
            java.lang.String r2 = "<beep>Open (Bluetooth)</beep>"
            r3 = 1
            r4 = 0
            com.google.common.util.concurrent.cx r13 = r0.mo86845a(r1, r2, r3, r4)
        L_0x00f5:
            r12.m151304f(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.p7265c.C92168g.mo86833e(boolean):void");
    }
}
