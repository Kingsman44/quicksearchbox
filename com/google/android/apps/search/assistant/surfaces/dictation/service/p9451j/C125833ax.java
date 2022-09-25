package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.libraries.p8977h.C119406a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125926o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9478r.C126286d;
import com.google.protobuf.C62910ar;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.ax */
/* compiled from: PG */
public final class C125833ax {

    /* renamed from: a */
    public final Duration f346784a;

    /* renamed from: b */
    private final C126286d f346785b;

    /* renamed from: c */
    private final C125926o f346786c;

    public C125833ax(C126286d dVar, C125926o oVar, C62910ar arVar) {
        C69664n.m101061g(dVar, "keyboardStubs");
        C69664n.m101061g(oVar, "eligibilityChecker");
        this.f346785b = dVar;
        this.f346786c = oVar;
        this.f346784a = C119406a.m198129a(arVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107123a(com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125934w r5, com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125828as
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.as r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125828as) r0
            int r1 = r0.f346763c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346763c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.as r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.as
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f346761a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346763c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x0061
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            boolean r7 = r5.f347147b
            if (r7 != 0) goto L_0x003e
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.KEYBOARD_NOT_UP
            r5.<init>(r6)
            return r5
        L_0x003e:
            com.google.android.apps.gsa.nga.api.a.af r7 = r5.f347148c
            java.lang.String r7 = r7.e
            java.lang.String r2 = "keyboardState.keyboardCo…uration.foregroundPackage"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            boolean r6 = r6.mo107150a(r7)
            if (r6 != 0) goto L_0x0055
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.FOREGROUND_APP_MISMATCH
            r5.<init>(r6)
            return r5
        L_0x0055:
            com.google.android.apps.gsa.nga.api.a.af r5 = r5.f347148c
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.o r6 = r4.f346786c
            r0.f346763c = r3
            java.lang.Object r7 = r6.mo107178m(r5, r0)
            if (r7 == r1) goto L_0x0072
        L_0x0061:
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r7 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i) r7
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r5 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.ELIGIBLE
            if (r7 == r5) goto L_0x006f
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.FIELD_NOT_ELIGIBLE
            r5.<init>(r6)
            return r5
        L_0x006f:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bt r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125856bt.f346865a
            return r5
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125833ax.mo107123a(com.google.android.apps.search.assistant.surfaces.dictation.service.m.w, com.google.android.apps.search.assistant.surfaces.dictation.service.l.b, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107124b(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125829at
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.at r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125829at) r0
            int r1 = r0.f346766c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346766c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.at r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.at
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f346764a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346766c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0047
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.protobuf.at r5 = com.google.protobuf.C62912at.f169862a
            java.lang.String r2 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            com.google.android.apps.search.assistant.surfaces.dictation.service.r.d r2 = r4.f346785b
            com.google.android.apps.search.assistant.surfaces.dictation.a.bt r2 = r2.mo107507b()
            r0.f346766c = r3
            java.lang.Object r5 = r2.mo106801c(r5, new p5488io.grpc.C70334de(), r0)
            if (r5 == r1) goto L_0x0055
        L_0x0047:
            com.google.android.apps.search.assistant.surfaces.dictation.a.ba r5 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125073ba) r5
            com.google.android.apps.gsa.nga.api.a.af r5 = r5.f345064a
            if (r5 != 0) goto L_0x004f
            com.google.android.apps.gsa.nga.api.a.af r5 = com.google.android.apps.gsa.nga.api.a.af.w
        L_0x004f:
            java.lang.String r0 = "response.keyboardConfiguration"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125833ax.mo107124b(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107125c(com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125830au
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.au r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125830au) r0
            int r1 = r0.f346771e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346771e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.au r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.au
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f346769c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346771e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r11 = r0.f346767a
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b r11 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b) r11
            p5462h.C69714l.m101134b(r12)
            goto L_0x007c
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            java.lang.Object r11 = r0.f346768b
            java.lang.Object r2 = r0.f346767a
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.ax r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125833ax) r2
            p5462h.C69714l.m101134b(r12)
            goto L_0x0050
        L_0x0040:
            p5462h.C69714l.m101134b(r12)
            r0.f346767a = r10
            r0.f346768b = r11
            r0.f346771e = r4
            java.lang.Object r12 = r10.mo107124b(r0)
            if (r12 == r1) goto L_0x00ec
            r2 = r10
        L_0x0050:
            com.google.android.apps.gsa.nga.api.a.af r12 = (com.google.android.apps.gsa.nga.api.a.af) r12
            long r5 = r12.l
            r7 = 59839796(0x3911534, double:2.95647875E-316)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x00e9
            int r5 = r12.d
            java.lang.String r6 = r12.e
            java.lang.String r7 = "keyboardConfiguration.foregroundPackage"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            if (r5 == 0) goto L_0x00b3
            boolean r7 = r11.mo107150a(r6)
            if (r7 != 0) goto L_0x006d
            goto L_0x00b3
        L_0x006d:
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.o r2 = r2.f346786c
            r0.f346767a = r11
            r5 = 0
            r0.f346768b = r5
            r0.f346771e = r3
            java.lang.Object r12 = r2.mo107178m(r12, r0)
            if (r12 == r1) goto L_0x00b2
        L_0x007c:
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r12 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i) r12
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r0 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.ELIGIBLE
            if (r12 != r0) goto L_0x0085
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bt r11 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125856bt.f346865a
            goto L_0x00b1
        L_0x0085:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125834ay.f346787a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r0.mo56374ac(r4, r1)
            com.google.frameworks.client.a.a.b r11 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206497b(r11)
            com.google.frameworks.client.a.a.b r12 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a.m206490b(r12)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 36711(0x8f67, float:5.1443E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "[%s] matched, but focused field not eligible: %s [SD]"
            r0.mo56354G(r1, r11, r12)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r11 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r12 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.FIELD_NOT_ELIGIBLE
            r11.<init>(r12)
        L_0x00b1:
            return r11
        L_0x00b2:
            return r1
        L_0x00b3:
            com.google.common.f.e r12 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125834ay.f346787a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r12.mo56374ac(r4, r0)
            com.google.frameworks.client.a.a.b r11 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206497b(r11)
            com.google.frameworks.client.a.a.b r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206497b(r6)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r5)
            com.google.frameworks.client.a.a.b r1 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206497b(r1)
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 36710(0x8f66, float:5.1442E-41)
            r2.<init>(r3)
            r12.mo56379ah(r2)
            java.lang.String r2 = "[%s] didn't match [%s] (field_type=%s) [SD]"
            r12.mo56359L(r2, r11, r0, r1)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r11 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r12 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.FOREGROUND_APP_MISMATCH
            r11.<init>(r12)
            return r11
        L_0x00e9:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bt r11 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125856bt.f346865a
            return r11
        L_0x00ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125833ax.mo107125c(com.google.android.apps.search.assistant.surfaces.dictation.service.l.b, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107126d(com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125934w r7, com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b r8, p3186j$.time.Duration r9, p5462h.p5466c.C69577g r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125831av
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.av r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125831av) r0
            int r1 = r0.f346777f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346777f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.av r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.av
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f346775d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346777f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r7 = r0.f346773b
            h.f.b.ae r7 = (p5462h.p5473f.p5475b.C69648ae) r7
            java.lang.Object r8 = r0.f346772a
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b r8 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b) r8
            p5462h.C69714l.m101134b(r10)
            goto L_0x0093
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            java.lang.Object r9 = r0.f346774c
            java.lang.Object r7 = r0.f346773b
            r8 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b r8 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b) r8
            java.lang.Object r7 = r0.f346772a
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.ax r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125833ax) r7
            p5462h.C69714l.m101134b(r10)
            goto L_0x005b
        L_0x0049:
            p5462h.C69714l.m101134b(r10)
            r0.f346772a = r6
            r0.f346773b = r8
            r0.f346774c = r9
            r0.f346777f = r4
            java.lang.Object r10 = r6.mo107123a(r7, r8, r0)
            if (r10 == r1) goto L_0x00b0
            r7 = r6
        L_0x005b:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bo r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125851bo) r10
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bt r2 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125856bt.f346865a
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r2)
            if (r10 == 0) goto L_0x0068
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bt r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125856bt.f346865a
            return r7
        L_0x0068:
            h.f.b.ae r10 = new h.f.b.ae
            r10.<init>()
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.FAILURE_OTHER
            r2.<init>(r4)
            r10.f186027a = r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.aw r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.aw
            r4 = 0
            r2.<init>(r10, r7, r8, r4)
            r0.f346772a = r8
            r0.f346773b = r10
            r0.f346774c = r4
            r0.f346777f = r3
            j$.time.Duration r9 = (p3186j$.time.Duration) r9
            long r3 = com.google.common.p4580v.p4582b.C60942a.m93083a(r9)
            java.lang.Object r7 = kotlinx.coroutines.C71745ea.m104930b(r3, r2, r0)
            if (r7 == r1) goto L_0x00b0
            r5 = r10
            r10 = r7
            r7 = r5
        L_0x0093:
            if (r10 != 0) goto L_0x00ad
            com.google.common.f.e r9 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125834ay.f346787a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.n r10 = new com.google.common.f.n
            r0 = 36713(0x8f69, float:5.1446E-41)
            r10.<init>(r0)
            r9.mo56379ah(r10)
            java.lang.String r10 = "Waiting for %s has timed out. [SD]"
            r9.mo56389s(r10, r8)
        L_0x00ad:
            java.lang.Object r7 = r7.f186027a
            return r7
        L_0x00b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125833ax.mo107126d(com.google.android.apps.search.assistant.surfaces.dictation.service.m.w, com.google.android.apps.search.assistant.surfaces.dictation.service.l.b, j$.time.Duration, h.c.g):java.lang.Object");
    }
}
