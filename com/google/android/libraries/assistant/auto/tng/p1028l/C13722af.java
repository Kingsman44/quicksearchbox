package com.google.android.libraries.assistant.auto.tng.p1028l;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67464l;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p5535j.p5536a.p5543b.C70936a;
import p5535j.p5536a.p5543b.C70955b;
import p5535j.p5536a.p5543b.C70957d;
import p5535j.p5536a.p5543b.C70958e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.af */
/* compiled from: PG */
public final class C13722af {

    /* renamed from: a */
    public static final C59071e f41843a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.l.af");

    /* renamed from: b */
    public final C37215b f41844b;

    /* renamed from: c */
    public final ScheduledExecutorService f41845c;

    /* renamed from: d */
    public final C60870cx f41846d;

    /* renamed from: e */
    public C2164c f41847e;

    /* renamed from: f */
    public final C60870cx f41848f;

    /* renamed from: g */
    public C2164c f41849g;

    /* renamed from: h */
    private boolean f41850h = false;

    /* renamed from: i */
    private boolean f41851i = false;

    public C13722af(C37215b bVar, ScheduledExecutorService scheduledExecutorService) {
        this.f41844b = bVar;
        this.f41845c = scheduledExecutorService;
        this.f41846d = C2169h.m6027a(new C13895z(this));
        this.f41847e.getClass();
        this.f41848f = C2169h.m6027a(new C13717aa(this));
        this.f41849g.getClass();
    }

    /* renamed from: b */
    public static C70958e m29971b(C13725ai aiVar, int i) {
        C67464l lVar;
        C67464l lVar2;
        C70936a aVar = (C70936a) C70958e.f189197m.createBuilder();
        C70955b bVar = (C70955b) C70957d.f189190f.createBuilder();
        bVar.copyOnWrite();
        C70957d dVar = (C70957d) bVar.instance;
        dVar.f189193b = i - 1;
        dVar.f189192a |= 1;
        C67238p pVar = aiVar.f41858b;
        if (pVar == null) {
            pVar = C67238p.f182736e;
        }
        if (pVar.f182740b == 2) {
            lVar = (C67464l) pVar.f182741c;
        } else {
            lVar = C67464l.f183356e;
        }
        long millis = Duration.m71141of(lVar.f183360c, ChronoUnit.MICROS).toMillis();
        bVar.copyOnWrite();
        C70957d dVar2 = (C70957d) bVar.instance;
        dVar2.f189192a |= 2;
        dVar2.f189194c = millis;
        C67238p pVar2 = aiVar.f41858b;
        if (pVar2 == null) {
            pVar2 = C67238p.f182736e;
        }
        if (pVar2.f182740b == 2) {
            lVar2 = (C67464l) pVar2.f182741c;
        } else {
            lVar2 = C67464l.f183356e;
        }
        long millis2 = Duration.m71141of(lVar2.f183361d, ChronoUnit.MICROS).toMillis();
        bVar.copyOnWrite();
        C70957d dVar3 = (C70957d) bVar.instance;
        dVar3.f189192a |= 4;
        dVar3.f189195d = millis2;
        aVar.copyOnWrite();
        C70958e eVar = (C70958e) aVar.instance;
        C70957d dVar4 = (C70957d) bVar.build();
        dVar4.getClass();
        eVar.f189209j = dVar4;
        eVar.f189200a |= 128;
        return (C70958e) aVar.build();
    }

    /* renamed from: c */
    private final void m29972c(C37258g gVar, C13725ai aiVar, int i) {
        this.f41844b.mo19974a(gVar.mo40812e(C70958e.f189198n, m29971b(aiVar, i)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo21231a(com.google.android.libraries.assistant.auto.tng.p1028l.C13725ai r10, boolean r11, com.google.common.util.concurrent.C60870cx r12, com.google.common.util.concurrent.C60870cx r13) {
        /*
            r9 = this;
            int r0 = r10.f41857a
            r1 = 1
            r0 = r0 & r1
            r2 = 2
            if (r0 == 0) goto L_0x0024
            com.google.speech.k.a.p r0 = r10.f41858b
            if (r0 != 0) goto L_0x000d
            com.google.speech.k.a.p r0 = com.google.speech.p5224k.p5225a.C67238p.f182736e
        L_0x000d:
            int r3 = r0.f182740b
            if (r3 != r2) goto L_0x0024
            java.lang.Object r0 = r0.f182741c
            com.google.speech.recognizer.a.l r0 = (com.google.speech.recognizer.p5233a.C67464l) r0
            int r0 = r0.f183359b
            com.google.speech.recognizer.a.k r0 = com.google.speech.recognizer.p5233a.C67463k.m97475a(r0)
            if (r0 != 0) goto L_0x001f
            com.google.speech.recognizer.a.k r0 = com.google.speech.recognizer.p5233a.C67463k.START_OF_SPEECH
        L_0x001f:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0028
        L_0x0024:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0028:
            boolean r3 = r0.isPresent()
            if (r3 != 0) goto L_0x0031
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60866ct.f164955a
            return r10
        L_0x0031:
            r0.get()
            com.google.speech.k.a.p r3 = r10.f41858b
            if (r3 != 0) goto L_0x003a
            com.google.speech.k.a.p r3 = com.google.speech.p5224k.p5225a.C67238p.f182736e
        L_0x003a:
            int r4 = r3.f182740b
            if (r4 != r2) goto L_0x0043
            java.lang.Object r3 = r3.f182741c
            com.google.speech.recognizer.a.l r3 = (com.google.speech.recognizer.p5233a.C67464l) r3
            goto L_0x0045
        L_0x0043:
            com.google.speech.recognizer.a.l r3 = com.google.speech.recognizer.p5233a.C67464l.f183356e
        L_0x0045:
            long r3 = r3.f183361d
            com.google.speech.k.a.p r3 = r10.f41858b
            if (r3 != 0) goto L_0x004d
            com.google.speech.k.a.p r3 = com.google.speech.p5224k.p5225a.C67238p.f182736e
        L_0x004d:
            int r4 = r3.f182740b
            if (r4 != r2) goto L_0x0056
            java.lang.Object r3 = r3.f182741c
            com.google.speech.recognizer.a.l r3 = (com.google.speech.recognizer.p5233a.C67464l) r3
            goto L_0x0058
        L_0x0056:
            com.google.speech.recognizer.a.l r3 = com.google.speech.recognizer.p5233a.C67464l.f183356e
        L_0x0058:
            long r3 = r3.f183360c
            java.lang.Object r3 = r0.get()
            com.google.speech.recognizer.a.k r3 = (com.google.speech.recognizer.p5233a.C67463k) r3
            com.google.speech.recognizer.a.k r4 = com.google.speech.recognizer.p5233a.C67463k.START_OF_SPEECH
            int r3 = r3.ordinal()
            r4 = 3
            if (r3 == 0) goto L_0x009c
            if (r3 == r1) goto L_0x008e
            if (r3 == r2) goto L_0x007f
            if (r3 == r4) goto L_0x0070
            goto L_0x00a9
        L_0x0070:
            r3 = 4
            if (r11 == 0) goto L_0x0079
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97624dk
            r9.m29972c(r5, r10, r3)
            goto L_0x00a9
        L_0x0079:
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97625dl
            r9.m29972c(r5, r10, r3)
            goto L_0x00a9
        L_0x007f:
            r3 = 5
            if (r11 == 0) goto L_0x0088
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97414M
            r9.m29972c(r5, r10, r3)
            goto L_0x00a9
        L_0x0088:
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97415N
            r9.m29972c(r5, r10, r3)
            goto L_0x00a9
        L_0x008e:
            if (r11 == 0) goto L_0x0096
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97694o
            r9.m29972c(r3, r10, r4)
            goto L_0x00a9
        L_0x0096:
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97695p
            r9.m29972c(r3, r10, r4)
            goto L_0x00a9
        L_0x009c:
            if (r11 == 0) goto L_0x00a4
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97692m
            r9.m29972c(r3, r10, r2)
            goto L_0x00a9
        L_0x00a4:
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97693n
            r9.m29972c(r3, r10, r2)
        L_0x00a9:
            com.google.speech.recognizer.a.k r3 = com.google.speech.recognizer.p5233a.C67463k.START_OF_SPEECH
            java.lang.Object r5 = r0.get()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00e3
            com.google.speech.k.a.p r10 = r10.f41858b
            if (r10 != 0) goto L_0x00bb
            com.google.speech.k.a.p r10 = com.google.speech.p5224k.p5225a.C67238p.f182736e
        L_0x00bb:
            int r0 = r10.f182740b
            if (r0 != r2) goto L_0x00c4
            java.lang.Object r10 = r10.f182741c
            com.google.speech.recognizer.a.l r10 = (com.google.speech.recognizer.p5233a.C67464l) r10
            goto L_0x00c6
        L_0x00c4:
            com.google.speech.recognizer.a.l r10 = com.google.speech.recognizer.p5233a.C67464l.f183356e
        L_0x00c6:
            r8 = r10
            com.google.common.util.concurrent.cx[] r10 = new com.google.common.util.concurrent.C60870cx[r2]
            r0 = 0
            r10[r0] = r12
            r10[r1] = r13
            com.google.apps.tiktok.tracing.contrib.b.j r10 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84753d(r10)
            com.google.android.libraries.assistant.auto.tng.l.ac r0 = new com.google.android.libraries.assistant.auto.tng.l.ac
            r3 = r0
            r4 = r9
            r5 = r12
            r6 = r13
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.concurrent.ScheduledExecutorService r11 = r9.f41845c
            com.google.common.util.concurrent.cx r10 = r10.mo51520a(r0, r11)
            return r10
        L_0x00e3:
            java.lang.Object r12 = r0.get()
            com.google.speech.recognizer.a.k r12 = (com.google.speech.recognizer.p5233a.C67463k) r12
            if (r11 == 0) goto L_0x00f3
            boolean r13 = r9.f41851i
            if (r13 == 0) goto L_0x00f3
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x01a3
        L_0x00f3:
            if (r11 != 0) goto L_0x00fd
            boolean r13 = r9.f41850h
            if (r13 == 0) goto L_0x00fd
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x01a3
        L_0x00fd:
            int r12 = r12.ordinal()
            r5 = 0
            if (r12 == r1) goto L_0x0170
            if (r12 == r2) goto L_0x013e
            if (r12 == r4) goto L_0x010b
            goto L_0x01a1
        L_0x010b:
            com.google.speech.k.a.p r12 = r10.f41858b
            if (r12 != 0) goto L_0x0112
            com.google.speech.k.a.p r13 = com.google.speech.p5224k.p5225a.C67238p.f182736e
            goto L_0x0113
        L_0x0112:
            r13 = r12
        L_0x0113:
            int r0 = r13.f182740b
            if (r0 != r2) goto L_0x011c
            java.lang.Object r13 = r13.f182741c
            com.google.speech.recognizer.a.l r13 = (com.google.speech.recognizer.p5233a.C67464l) r13
            goto L_0x011e
        L_0x011c:
            com.google.speech.recognizer.a.l r13 = com.google.speech.recognizer.p5233a.C67464l.f183356e
        L_0x011e:
            long r0 = r13.f183361d
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x01a1
            if (r12 != 0) goto L_0x0128
            com.google.speech.k.a.p r12 = com.google.speech.p5224k.p5225a.C67238p.f182736e
        L_0x0128:
            int r13 = r12.f182740b
            if (r13 != r2) goto L_0x0131
            java.lang.Object r12 = r12.f182741c
            com.google.speech.recognizer.a.l r12 = (com.google.speech.recognizer.p5233a.C67464l) r12
            goto L_0x0133
        L_0x0131:
            com.google.speech.recognizer.a.l r12 = com.google.speech.recognizer.p5233a.C67464l.f183356e
        L_0x0133:
            long r1 = r12.f183361d
            r5 = 4
            r0 = r9
            r3 = r11
            r4 = r10
            r0.m29973d(r1, r3, r4, r5)
            goto L_0x01a1
        L_0x013e:
            com.google.speech.k.a.p r12 = r10.f41858b
            if (r12 != 0) goto L_0x0145
            com.google.speech.k.a.p r13 = com.google.speech.p5224k.p5225a.C67238p.f182736e
            goto L_0x0146
        L_0x0145:
            r13 = r12
        L_0x0146:
            int r0 = r13.f182740b
            if (r0 != r2) goto L_0x014f
            java.lang.Object r13 = r13.f182741c
            com.google.speech.recognizer.a.l r13 = (com.google.speech.recognizer.p5233a.C67464l) r13
            goto L_0x0151
        L_0x014f:
            com.google.speech.recognizer.a.l r13 = com.google.speech.recognizer.p5233a.C67464l.f183356e
        L_0x0151:
            long r0 = r13.f183360c
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x01a1
            if (r12 != 0) goto L_0x015b
            com.google.speech.k.a.p r12 = com.google.speech.p5224k.p5225a.C67238p.f182736e
        L_0x015b:
            int r13 = r12.f182740b
            if (r13 != r2) goto L_0x0164
            java.lang.Object r12 = r12.f182741c
            com.google.speech.recognizer.a.l r12 = (com.google.speech.recognizer.p5233a.C67464l) r12
            goto L_0x0166
        L_0x0164:
            com.google.speech.recognizer.a.l r12 = com.google.speech.recognizer.p5233a.C67464l.f183356e
        L_0x0166:
            long r1 = r12.f183360c
            r5 = 5
            r0 = r9
            r3 = r11
            r4 = r10
            r0.m29973d(r1, r3, r4, r5)
            goto L_0x01a1
        L_0x0170:
            com.google.speech.k.a.p r12 = r10.f41858b
            if (r12 != 0) goto L_0x0177
            com.google.speech.k.a.p r13 = com.google.speech.p5224k.p5225a.C67238p.f182736e
            goto L_0x0178
        L_0x0177:
            r13 = r12
        L_0x0178:
            int r0 = r13.f182740b
            if (r0 != r2) goto L_0x0181
            java.lang.Object r13 = r13.f182741c
            com.google.speech.recognizer.a.l r13 = (com.google.speech.recognizer.p5233a.C67464l) r13
            goto L_0x0183
        L_0x0181:
            com.google.speech.recognizer.a.l r13 = com.google.speech.recognizer.p5233a.C67464l.f183356e
        L_0x0183:
            long r0 = r13.f183361d
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x01a1
            if (r12 != 0) goto L_0x018d
            com.google.speech.k.a.p r12 = com.google.speech.p5224k.p5225a.C67238p.f182736e
        L_0x018d:
            int r13 = r12.f182740b
            if (r13 != r2) goto L_0x0196
            java.lang.Object r12 = r12.f182741c
            com.google.speech.recognizer.a.l r12 = (com.google.speech.recognizer.p5233a.C67464l) r12
            goto L_0x0198
        L_0x0196:
            com.google.speech.recognizer.a.l r12 = com.google.speech.recognizer.p5233a.C67464l.f183356e
        L_0x0198:
            long r1 = r12.f183361d
            r5 = 3
            r0 = r9
            r3 = r11
            r4 = r10
            r0.m29973d(r1, r3, r4, r5)
        L_0x01a1:
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x01a3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1028l.C13722af.mo21231a(com.google.android.libraries.assistant.auto.tng.l.ai, boolean, com.google.common.util.concurrent.cx, com.google.common.util.concurrent.cx):com.google.common.util.concurrent.cx");
    }

    /* renamed from: d */
    private final void m29973d(long j, boolean z, C13725ai aiVar, int i) {
        if (z && this.f41851i) {
            return;
        }
        if (!z && this.f41850h) {
            return;
        }
        if (z) {
            this.f41851i = true;
            C2164c cVar = this.f41847e;
            cVar.getClass();
            cVar.mo5437b(new C13721ae(j, aiVar, i));
            return;
        }
        this.f41850h = true;
        C2164c cVar2 = this.f41849g;
        cVar2.getClass();
        cVar2.mo5437b(new C13721ae(j, aiVar, i));
    }
}
