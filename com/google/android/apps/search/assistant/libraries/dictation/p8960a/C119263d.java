package com.google.android.apps.search.assistant.libraries.dictation.p8960a;

import com.google.android.apps.search.assistant.libraries.dictation.starter.C119320c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.a.d */
/* compiled from: PG */
public final class C119263d implements C35472h {

    /* renamed from: a */
    private final Optional f332601a;

    /* renamed from: b */
    private final C71422aw f332602b;

    /* renamed from: c */
    private final C59071e f332603c = C59071e.m91331h();

    public C119263d(Optional optional, C71422aw awVar) {
        C69664n.m101061g(optional, "dictationStarter");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f332601a = optional;
        this.f332602b = awVar;
    }

    /* renamed from: d */
    private final Object m197963d(C64735n nVar, C69577g gVar) {
        C60870cx c = ((C119320c) this.f332601a.get()).mo104283c(nVar);
        C69664n.m101060f(c, "dictationStarter.get().s…ionInCurrentProfile(args)");
        return C71663i.m104690c(c, gVar);
    }

    /* renamed from: e */
    private final Object m197964e(C64735n nVar, C69577g gVar) {
        C60870cx d = ((C119320c) this.f332601a.get()).mo104284d(nVar);
        C69664n.m101060f(d, "dictationStarter.get().s…tationInWorkProfile(args)");
        return C71663i.m104690c(d, gVar);
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        return C71663i.m104692e(this.f332602b, (C71424ay) null, new C119260a(this, dyVar, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104266b(com.google.assistant.p3897e.p3921j.C51809dy r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.libraries.dictation.p8960a.C119261b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.libraries.dictation.a.b r0 = (com.google.android.apps.search.assistant.libraries.dictation.p8960a.C119261b) r0
            int r1 = r0.f332595e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f332595e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.libraries.dictation.a.b r0 = new com.google.android.apps.search.assistant.libraries.dictation.a.b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f332593c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f332595e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r6 = r0.f332592b
            java.lang.Object r0 = r0.f332591a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0083
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            j$.util.Optional r7 = r5.f332601a
            boolean r7 = r7.isPresent()
            if (r7 != 0) goto L_0x0062
            com.google.common.f.e r6 = r5.f332603c
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r7 = new com.google.common.f.n
            r0 = 34351(0x862f, float:4.8136E-41)
            r7.<init>(r0)
            r6.mo56379ah(r7)
            java.lang.String r7 = "failure: TNG:Dictation is not compiled in. [SD]"
            r6.mo56386p(r7)
            com.google.assistant.e.j.kf r6 = com.google.assistant.p3897e.p3921j.C52235kf.UNIMPLEMENTED
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r6)
            java.lang.String r7 = "error(ResponseCode.Status.UNIMPLEMENTED)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            return r6
        L_0x0062:
            com.google.protos.f.b.b.a.n r7 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n.f175467n
            com.google.protobuf.eb r7 = r7.getParserForType()
            java.lang.String r2 = "start_dictation_args"
            com.google.protobuf.MessageLite r6 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r6, r2, r7)
            com.google.protos.f.b.b.a.n r6 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r6
            java.lang.String r7 = "args"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r0.f332591a = r6
            r0.f332592b = r5
            r0.f332595e = r3
            java.lang.Object r7 = r5.mo104267c(r6, r0)
            if (r7 == r1) goto L_0x00c7
            r0 = r6
            r6 = r5
        L_0x0083:
            com.google.android.apps.search.assistant.libraries.dictation.starter.b r7 = (com.google.android.apps.search.assistant.libraries.dictation.starter.C119313b) r7
            com.google.protos.f.b.b.a.n r0 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r0
            boolean r0 = r0.f175476h
            com.google.android.apps.search.assistant.libraries.dictation.starter.b r1 = com.google.android.apps.search.assistant.libraries.dictation.starter.C119313b.SUCCESS
            com.google.android.apps.search.assistant.libraries.dictation.a.d r6 = (com.google.android.apps.search.assistant.libraries.dictation.p8960a.C119263d) r6
            com.google.common.f.e r6 = r6.f332603c
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            if (r7 != r1) goto L_0x009a
            java.lang.String r2 = "succeeded"
            goto L_0x009c
        L_0x009a:
            java.lang.String r2 = "failed"
        L_0x009c:
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 34350(0x862e, float:4.8135E-41)
            r3.<init>(r4)
            r6.mo56379ah(r3)
            java.lang.String r3 = "Dictation invocation %s [SD]"
            r6.mo56389s(r3, r2)
            if (r7 != r1) goto L_0x00bb
            if (r0 == 0) goto L_0x00b3
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94545b
            goto L_0x00b5
        L_0x00b3:
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94544a
        L_0x00b5:
            java.lang.String r7 = "{\n      if (skipReturnRe…lientOpResults.ok()\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            goto L_0x00c6
        L_0x00bb:
            com.google.assistant.e.j.kf r6 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r6)
            java.lang.String r7 = "error(ResponseCode.Status.INTERNAL)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
        L_0x00c6:
            return r6
        L_0x00c7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.dictation.p8960a.C119263d.mo104266b(com.google.assistant.e.j.dy, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104267c(com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.libraries.dictation.p8960a.C119262c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.libraries.dictation.a.c r0 = (com.google.android.apps.search.assistant.libraries.dictation.p8960a.C119262c) r0
            int r1 = r0.f332600e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f332600e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.libraries.dictation.a.c r0 = new com.google.android.apps.search.assistant.libraries.dictation.a.c
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f332598c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f332600e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r6) goto L_0x0044
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            p5462h.C69714l.m101134b(r9)
            goto L_0x0081
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            java.lang.Object r8 = r0.f332597b
            java.lang.Object r2 = r0.f332596a
            p5462h.C69714l.m101134b(r9)
            goto L_0x006c
        L_0x0040:
            p5462h.C69714l.m101134b(r9)
            goto L_0x0096
        L_0x0044:
            p5462h.C69714l.m101134b(r9)
            goto L_0x00a7
        L_0x0048:
            p5462h.C69714l.m101134b(r9)
            int r9 = r8.f175481m
            int r9 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64734m.m96450a(r9)
            if (r9 != 0) goto L_0x0054
            r9 = 1
        L_0x0054:
            int r9 = r9 + -2
            r2 = -1
            if (r9 == r2) goto L_0x009f
            if (r9 == 0) goto L_0x009f
            if (r9 == r6) goto L_0x009f
            if (r9 == r5) goto L_0x008e
            r0.f332596a = r7
            r0.f332597b = r8
            r0.f332600e = r4
            java.lang.Object r9 = r7.m197963d(r8, r0)
            if (r9 == r1) goto L_0x008d
            r2 = r7
        L_0x006c:
            com.google.android.apps.search.assistant.libraries.dictation.starter.b r4 = com.google.android.apps.search.assistant.libraries.dictation.starter.C119313b.SUCCESS
            if (r9 == r4) goto L_0x008a
            r9 = 0
            r0.f332596a = r9
            r0.f332597b = r9
            r0.f332600e = r3
            com.google.android.apps.search.assistant.libraries.dictation.a.d r2 = (com.google.android.apps.search.assistant.libraries.dictation.p8960a.C119263d) r2
            com.google.protos.f.b.b.a.n r8 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r8
            java.lang.Object r9 = r2.m197964e(r8, r0)
            if (r9 == r1) goto L_0x0089
        L_0x0081:
            com.google.android.apps.search.assistant.libraries.dictation.starter.b r8 = com.google.android.apps.search.assistant.libraries.dictation.starter.C119313b.SUCCESS
            if (r9 != r8) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            com.google.android.apps.search.assistant.libraries.dictation.starter.b r8 = com.google.android.apps.search.assistant.libraries.dictation.starter.C119313b.FAILURE
            goto L_0x008c
        L_0x0089:
            return r1
        L_0x008a:
            com.google.android.apps.search.assistant.libraries.dictation.starter.b r8 = com.google.android.apps.search.assistant.libraries.dictation.starter.C119313b.SUCCESS
        L_0x008c:
            return r8
        L_0x008d:
            return r1
        L_0x008e:
            r0.f332600e = r5
            java.lang.Object r9 = r7.m197964e(r8, r0)
            if (r9 == r1) goto L_0x009e
        L_0x0096:
            java.lang.String r8 = "startDictationInWorkProfile(args)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r8)
            com.google.android.apps.search.assistant.libraries.dictation.starter.b r9 = (com.google.android.apps.search.assistant.libraries.dictation.starter.C119313b) r9
            goto L_0x00ae
        L_0x009e:
            return r1
        L_0x009f:
            r0.f332600e = r6
            java.lang.Object r9 = r7.m197963d(r8, r0)
            if (r9 == r1) goto L_0x00af
        L_0x00a7:
            java.lang.String r8 = "startDictationInCurrentProfile(args)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r8)
            com.google.android.apps.search.assistant.libraries.dictation.starter.b r9 = (com.google.android.apps.search.assistant.libraries.dictation.starter.C119313b) r9
        L_0x00ae:
            return r9
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.dictation.p8960a.C119263d.mo104267c(com.google.protos.f.b.b.a.n, h.c.g):java.lang.Object");
    }
}
