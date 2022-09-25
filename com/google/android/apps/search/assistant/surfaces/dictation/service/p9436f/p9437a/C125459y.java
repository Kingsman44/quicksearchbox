package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125082bj;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125083bk;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126057bv;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import java.util.Locale;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.y */
/* compiled from: PG */
public final class C125459y implements C35472h {

    /* renamed from: a */
    private static final C59071e f345971a = C59071e.m91331h();

    /* renamed from: b */
    private static final C125083bk f345972b;

    /* renamed from: c */
    private final C71422aw f345973c;

    /* renamed from: d */
    private final Locale f345974d;

    /* renamed from: e */
    private final C70862aj f345975e;

    /* renamed from: f */
    private final C125931t f345976f;

    /* renamed from: g */
    private final C126057bv f345977g;

    /* renamed from: h */
    private final C126181j f345978h;

    /* renamed from: i */
    private final C62910ar f345979i;

    /* renamed from: j */
    private final boolean f345980j;

    /* renamed from: k */
    private final boolean f345981k;

    /* renamed from: l */
    private final C125422z f345982l;

    static {
        C125082bj bjVar = (C125082bj) C125083bk.f345071c.createBuilder();
        bjVar.copyOnWrite();
        ((C125083bk) bjVar.instance).f345073a = 66;
        C62942bv build = bjVar.build();
        C69664n.m101060f(build, "newBuilder().setKeyCode(…nt.KEYCODE_ENTER).build()");
        f345972b = (C125083bk) build;
    }

    public C125459y(C71422aw awVar, Locale locale, C70862aj ajVar, C125422z zVar, C125931t tVar, C126057bv bvVar, C126181j jVar, C62910ar arVar, boolean z, boolean z2) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(locale, "spokenLocale");
        C69664n.m101061g(ajVar, "requests");
        C69664n.m101061g(zVar, "dictationController");
        C69664n.m101061g(bvVar, "keyboardUiManager");
        C69664n.m101061g(jVar, "orationLogger");
        this.f345973c = awVar;
        this.f345974d = locale;
        this.f345975e = ajVar;
        this.f345982l = zVar;
        this.f345976f = tVar;
        this.f345977g = bvVar;
        this.f345978h = jVar;
        this.f345979i = arVar;
        this.f345980j = z;
        this.f345981k = z2;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        return C71663i.m104692e(this.f345973c, (C71424ay) null, new C125457w(this, dyVar, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0137 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106974b(com.google.assistant.p3897e.p3921j.C51809dy r13, p5462h.p5466c.C69577g r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a.C125458x
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.x r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a.C125458x) r0
            int r1 = r0.f345970e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345970e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.x r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.x
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f345968c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345970e
            java.lang.String r3 = "ok()"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r5) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            p5462h.C69714l.m101134b(r14)
            goto L_0x0138
        L_0x002d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0035:
            java.lang.Object r13 = r0.f345967b
            java.lang.Object r2 = r0.f345966a
            p5462h.C69714l.m101134b(r14)
            goto L_0x00f8
        L_0x003e:
            p5462h.C69714l.m101134b(r14)
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.t r14 = r12.f345976f
            boolean r14 = r14.mo107194m()
            if (r14 != 0) goto L_0x0076
            boolean r14 = r12.f345980j
            if (r14 == 0) goto L_0x004e
            goto L_0x0076
        L_0x004e:
            com.google.common.f.e r14 = f345971a
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 36569(0x8ed9, float:5.1244E-41)
            r0.<init>(r1)
            r14.mo56379ah(r0)
            java.lang.String r0 = "text.SEND operation not supported [SD]"
            r14.mo56386p(r0)
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.j r14 = r12.f345978h
            r14.mo107441l(r13)
            com.google.android.apps.search.assistant.surfaces.dictation.service.n.bv r13 = r12.f345977g
            r13.mo107295s()
            com.google.assistant.e.j.ec r13 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94544a
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r3)
            return r13
        L_0x0076:
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.t r14 = r12.f345976f
            java.lang.String r14 = r14.mo107187f()
            java.lang.String r2 = "com.google.android.apps.messaging"
            boolean r14 = p5462h.p5473f.p5475b.C69664n.m101066l(r14, r2)
            if (r14 == 0) goto L_0x00f7
            java.util.Locale r14 = r12.f345974d
            java.lang.String r14 = r14.getLanguage()
            com.google.an.a.h r2 = com.google.p440an.p441a.C8841h.f30232e
            java.lang.String r2 = r2.f30255g
            boolean r14 = p5462h.p5473f.p5475b.C69664n.m101066l(r14, r2)
            if (r14 == 0) goto L_0x00f7
            com.google.common.f.e r14 = f345971a
            com.google.common.f.x r14 = r14.mo56224b()
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.protobuf.ar r2 = r12.f345979i
            com.google.protobuf.p4750c.C62948a.m95465p(r2)
            long r6 = r2.f169860a
            int r2 = r2.f169861b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 0
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00b2
            if (r2 >= 0) goto L_0x00b9
        L_0x00b2:
            java.lang.String r9 = "-"
            r8.append(r9)
            long r6 = -r6
            int r2 = -r2
        L_0x00b9:
            r8.append(r6)
            if (r2 == 0) goto L_0x00ca
            java.lang.String r6 = "."
            r8.append(r6)
            java.lang.String r2 = com.google.protobuf.p4750c.C62953e.m95488m(r2)
            r8.append(r2)
        L_0x00ca:
            java.lang.String r2 = "s"
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.google.frameworks.client.a.a.b r2 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r2)
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 36568(0x8ed8, float:5.1243E-41)
            r6.<init>(r7)
            r14.mo56379ah(r6)
            java.lang.String r6 = "Delaying send keyboard action by %s [SD]"
            r14.mo56389s(r6, r2)
            com.google.protobuf.ar r14 = r12.f345979i
            r0.f345966a = r12
            r0.f345967b = r13
            r0.f345970e = r5
            java.lang.Object r14 = com.google.android.libraries.search.assistant.p2511d.C32559v.m60377a(r14, r0)
            if (r14 == r1) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            return r1
        L_0x00f7:
            r2 = r12
        L_0x00f8:
            com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.y r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a.C125459y) r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.j r14 = r2.f345978h
            com.google.assistant.e.j.dy r13 = (com.google.assistant.p3897e.p3921j.C51809dy) r13
            r14.mo107443n(r13)
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.t r13 = r2.f345976f
            boolean r13 = r13.mo107195n()
            if (r13 != 0) goto L_0x0116
            boolean r13 = r2.f345981k
            if (r13 == 0) goto L_0x010e
            goto L_0x0116
        L_0x010e:
            r13 = 8
            io.grpc.i.aj r14 = r2.f345975e
            com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.p9477a.C126186a.m206399b(r13, r14)
            goto L_0x011d
        L_0x0116:
            com.google.android.apps.search.assistant.surfaces.dictation.a.bk r13 = f345972b
            io.grpc.i.aj r14 = r2.f345975e
            com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.p9477a.C126186a.m206398a(r13, r14)
        L_0x011d:
            com.google.android.apps.search.assistant.surfaces.dictation.service.e.z r13 = r2.f345982l
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r14 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a.SUCCESS_SEND
            com.google.common.util.concurrent.cx r13 = r13.mo106968b(r14)
            java.lang.String r14 = "dictationController.endI…ationStatus.SUCCESS_SEND)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            r14 = 0
            r0.f345966a = r14
            r0.f345967b = r14
            r0.f345970e = r4
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 != r1) goto L_0x0138
            return r1
        L_0x0138:
            com.google.assistant.e.j.ec r13 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94544a
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a.C125459y.mo106974b(com.google.assistant.e.j.dy, h.c.g):java.lang.Object");
    }
}
