package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.gsa.binaries.satin.app.aor;
import com.google.android.apps.search.assistant.libraries.p8977h.C119406a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125786j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125926o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125934w;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9478r.C126286d;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62910ar;
import dagger.p5294a.C68225k;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.bn */
/* compiled from: PG */
public final class C125850bn {

    /* renamed from: a */
    public static final C59071e f346847a = C59071e.m91331h();

    /* renamed from: b */
    public final C126286d f346848b;

    /* renamed from: c */
    public final C125786j f346849c;

    /* renamed from: d */
    public final Duration f346850d;

    /* renamed from: e */
    public final Duration f346851e;

    /* renamed from: f */
    public final Duration f346852f;

    /* renamed from: g */
    private final C125934w f346853g;

    /* renamed from: h */
    private final C125926o f346854h;

    /* renamed from: i */
    private final C58889cz f346855i;

    /* renamed from: j */
    private final C125833ax f346856j;

    /* renamed from: k */
    private final Duration f346857k;

    public C125850bn(C126286d dVar, C125934w wVar, aor aor, C125786j jVar, C125926o oVar, C58889cz czVar, C62910ar arVar, C62910ar arVar2, C62910ar arVar3, C62910ar arVar4) {
        C69664n.m101061g(dVar, "keyboardStubs");
        C69664n.m101061g(wVar, "initialKeyboardState");
        C69664n.m101061g(aor, "keyboardForegroundAppCheckerFactory");
        C69664n.m101061g(jVar, "interactionManager");
        C69664n.m101061g(oVar, "eligibilityChecker");
        C69664n.m101061g(czVar, "ticker");
        this.f346848b = dVar;
        this.f346853g = wVar;
        this.f346849c = jVar;
        this.f346854h = oVar;
        this.f346855i = czVar;
        C62910ar arVar5 = (C62910ar) ((C46897i) aor.f199116a.a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45357086").mo50905d();
        C68225k.m98532d(arVar5);
        this.f346856j = new C125833ax(dVar, (C125926o) aor.f199116a.b.f198027a.f199362db.mo17428b(), arVar5);
        this.f346850d = C119406a.m198129a(arVar);
        this.f346851e = C119406a.m198129a(arVar3);
        this.f346852f = C119406a.m198129a(arVar2);
        this.f346857k = C119406a.m198129a(arVar4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107128a(p3186j$.time.Duration r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125835az
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.az r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125835az) r0
            int r1 = r0.f346790c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346790c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.az r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.az
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f346788a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346790c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x009a
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            com.google.common.f.e r7 = f346847a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 36721(0x8f71, float:5.1457E-41)
            r2.<init>(r4)
            r7.mo56379ah(r2)
            java.lang.String r2 = "Attempting to bring up the keyboard if a field is focused. [SD]"
            r7.mo56386p(r2)
            com.google.android.apps.search.assistant.surfaces.dictation.a.ad r7 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125049ad.f345018c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.search.assistant.surfaces.dictation.a.aa r7 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125046aa) r7
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            com.google.android.apps.search.assistant.surfaces.dictation.a.af r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.android.apps.search.assistant.surfaces.dictation.a.ac r4 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125048ac.f345016a
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.assistant.surfaces.dictation.a.ab r4 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125047ab) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r2)
            com.google.android.apps.search.assistant.surfaces.dictation.a.ah r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            com.google.android.apps.search.assistant.surfaces.dictation.a.ac r2 = r2.mo106791a()
            java.lang.String r4 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)
            com.google.android.apps.search.assistant.surfaces.dictation.a.aa r4 = r7.f345022a
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.android.apps.search.assistant.surfaces.dictation.a.ad r4 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125049ad) r4
            r2.getClass()
            r4.f345021b = r2
            r2 = 3
            r4.f345020a = r2
            com.google.android.apps.search.assistant.surfaces.dictation.a.ad r7 = r7.mo106790a()
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bb r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bb
            r4 = 0
            r2.<init>(r5, r7, r4)
            r0.f346790c = r3
            long r6 = com.google.common.p4580v.p4582b.C60942a.m93083a(r6)
            java.lang.Object r7 = kotlinx.coroutines.C71745ea.m104930b(r6, r2, r0)
            if (r7 == r1) goto L_0x00bf
        L_0x009a:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bt r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125856bt) r7
            if (r7 == 0) goto L_0x009f
            return r7
        L_0x009f:
            com.google.common.f.e r6 = f346847a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r7 = new com.google.common.f.n
            r0 = 36722(0x8f72, float:5.1458E-41)
            r7.<init>(r0)
            r6.mo56379ah(r7)
            java.lang.String r7 = "Timed out while retrying keyboard-up IPCs [SD]"
            r6.mo56386p(r7)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r6 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.KEYBOARD_NOT_UP
            r6.<init>(r7)
            return r6
        L_0x00bf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.mo107128a(j$.time.Duration, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107129b(com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125934w r5, com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125839bc
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bc r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125839bc) r0
            int r1 = r0.f346802c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346802c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bc r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bc
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f346800a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346802c
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
            java.lang.String r2 = "state.keyboardConfiguration.foregroundPackage"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            boolean r6 = r6.mo107150a(r7)
            if (r6 != 0) goto L_0x0055
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.FOREGROUND_APP_MISMATCH
            r5.<init>(r6)
            return r5
        L_0x0055:
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.o r6 = r4.f346854h
            com.google.android.apps.gsa.nga.api.a.af r5 = r5.f347148c
            r0.f346802c = r3
            java.lang.Object r7 = r6.mo107178m(r5, r0)
            if (r7 == r1) goto L_0x0070
        L_0x0061:
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r5 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.ELIGIBLE
            if (r7 == r5) goto L_0x006d
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.FIELD_NOT_ELIGIBLE
            r5.<init>(r6)
            return r5
        L_0x006d:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bt r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125856bt.f346865a
            return r5
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.mo107129b(com.google.android.apps.search.assistant.surfaces.dictation.service.m.w, com.google.android.apps.search.assistant.surfaces.dictation.service.l.b, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107130c(p3186j$.time.Duration r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125840bd
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bd r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125840bd) r0
            int r1 = r0.f346805c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346805c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bd r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bd
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f346803a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346805c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            p5462h.C69714l.m101134b(r8)
            goto L_0x0099
        L_0x0028:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0030:
            p5462h.C69714l.m101134b(r8)
            com.google.common.f.e r8 = f346847a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r2 = new com.google.common.f.n
            r5 = 36728(0x8f78, float:5.1467E-41)
            r2.<init>(r5)
            r8.mo56379ah(r2)
            java.lang.String r2 = "Attempting to focus a field and bring up the keyboard. [SD]"
            r8.mo56386p(r2)
            com.google.android.apps.search.assistant.surfaces.dictation.a.ad r8 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125049ad.f345018c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.search.assistant.surfaces.dictation.a.aa r8 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125046aa) r8
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            com.google.android.apps.search.assistant.surfaces.dictation.a.af r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.apps.search.assistant.surfaces.dictation.a.ac r5 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125048ac.f345016a
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.search.assistant.surfaces.dictation.a.ab r5 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125047ab) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            com.google.android.apps.search.assistant.surfaces.dictation.a.ah r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.android.apps.search.assistant.surfaces.dictation.a.ac r2 = r2.mo106791a()
            java.lang.String r5 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            com.google.android.apps.search.assistant.surfaces.dictation.a.aa r5 = r8.f345022a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.apps.search.assistant.surfaces.dictation.a.ad r5 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125049ad) r5
            r2.getClass()
            r5.f345021b = r2
            r5.f345020a = r4
            com.google.android.apps.search.assistant.surfaces.dictation.a.ad r8 = r8.mo106790a()
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.be r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.be
            r2.<init>(r6, r8, r3)
            r0.f346805c = r4
            long r7 = com.google.common.p4580v.p4582b.C60942a.m93083a(r7)
            java.lang.Object r8 = kotlinx.coroutines.C71745ea.m104930b(r7, r2, r0)
            if (r8 == r1) goto L_0x0103
        L_0x0099:
            com.google.android.apps.search.assistant.surfaces.dictation.a.aj r8 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125055aj) r8
            if (r8 == 0) goto L_0x00a3
            boolean r7 = r8.f345026a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
        L_0x00a3:
            if (r3 != 0) goto L_0x00c5
            com.google.common.f.e r7 = f346847a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r8 = new com.google.common.f.n
            r0 = 36730(0x8f7a, float:5.147E-41)
            r8.<init>(r0)
            r7.mo56379ah(r8)
            java.lang.String r8 = "Timed out while trying to focus field and bring keyboard up [SD]"
            r7.mo56386p(r8)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r7 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.KEYBOARD_NOT_UP
            r7.<init>(r8)
            goto L_0x00fc
        L_0x00c5:
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r7 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r7)
            if (r7 == 0) goto L_0x00f0
            com.google.common.f.e r7 = f346847a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r8 = new com.google.common.f.n
            r0 = 36729(0x8f79, float:5.1468E-41)
            r8.<init>(r0)
            r7.mo56379ah(r8)
            java.lang.String r8 = "Sending the keyboard-up IPC failed. [SD]"
            r7.mo56386p(r8)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r7 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.KEYBOARD_NOT_UP
            r7.<init>(r8)
            goto L_0x00fc
        L_0x00f0:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            boolean r7 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r7)
            if (r7 == 0) goto L_0x00fd
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bt r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125856bt.f346865a
        L_0x00fc:
            return r7
        L_0x00fd:
            h.g r7 = new h.g
            r7.<init>()
            throw r7
        L_0x0103:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.mo107130c(j$.time.Duration, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107131d(com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b r10, p3186j$.time.Duration r11, p5462h.p5466c.C69577g r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125842bf
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bf r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125842bf) r0
            int r1 = r0.f346815g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346815g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bf r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bf
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f346813e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346815g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p5462h.C69714l.m101134b(r12)
            goto L_0x00ec
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            java.lang.Object r10 = r0.f346812d
            java.lang.Object r11 = r0.f346811c
            java.lang.Object r2 = r0.f346810b
            java.lang.Object r4 = r0.f346809a
            p5462h.C69714l.m101134b(r12)
            goto L_0x00c0
        L_0x0043:
            java.lang.Object r10 = r0.f346812d
            java.lang.Object r11 = r0.f346811c
            java.lang.Object r2 = r0.f346810b
            java.lang.Object r5 = r0.f346809a
            p5462h.C69714l.m101134b(r12)
            r8 = r12
            r12 = r10
            r10 = r2
            r2 = r8
            goto L_0x0089
        L_0x0053:
            p5462h.C69714l.m101134b(r12)
            com.google.common.base.cz r12 = r9.f346855i
            com.google.common.base.ci r12 = com.google.common.base.C58872ci.m90947d(r12)
            com.google.common.f.e r2 = f346847a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 36731(0x8f7b, float:5.1471E-41)
            r6.<init>(r7)
            r2.mo56379ah(r6)
            java.lang.String r6 = "Attempting to focus field and open keyboard in app [%s] [SD]"
            r2.mo56389s(r6, r10)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.ax r2 = r9.f346856j
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.w r6 = r9.f346853g
            r0.f346809a = r9
            r0.f346810b = r10
            r0.f346811c = r11
            r0.f346812d = r12
            r0.f346815g = r5
            java.lang.Object r2 = r2.mo107123a(r6, r10, r0)
            if (r2 == r1) goto L_0x00ed
            r5 = r9
        L_0x0089:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bo r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125851bo) r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bt r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125856bt.f346865a
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r6)
            if (r2 == 0) goto L_0x00a5
            r2 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bn r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn) r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.j r2 = r2.f346849c
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.g r2 = r2.mo107117a()
            if (r2 != 0) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bs r10 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bs
            r10.<init>(r2)
            return r10
        L_0x00a5:
            r0.f346809a = r5
            r0.f346810b = r10
            r0.f346811c = r11
            r0.f346812d = r12
            r0.f346815g = r4
            r2 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bn r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn) r2
            r4 = r11
            j$.time.Duration r4 = (p3186j$.time.Duration) r4
            java.lang.Object r2 = r2.mo107130c(r4, r0)
            if (r2 == r1) goto L_0x00ed
            r4 = r5
            r8 = r2
            r2 = r10
            r10 = r12
            r12 = r8
        L_0x00c0:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bo r12 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125851bo) r12
            boolean r5 = r12 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125852bp
            if (r5 == 0) goto L_0x00c7
            return r12
        L_0x00c7:
            com.google.common.base.ci r10 = (com.google.common.base.C58872ci) r10
            j$.time.Duration r10 = com.google.android.apps.search.assistant.libraries.p8977h.C119407b.m198130a(r10)
            j$.time.Duration r11 = (p3186j$.time.Duration) r11
            j$.time.Duration r10 = r11.minus(r10)
            java.lang.String r11 = "timeout - keyboardUpRequestDuration"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            r11 = 0
            r0.f346809a = r11
            r0.f346810b = r11
            r0.f346811c = r11
            r0.f346812d = r11
            r0.f346815g = r3
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bn r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn) r4
            java.lang.Object r12 = r4.mo107135h(r2, r10, r0)
            if (r12 != r1) goto L_0x00ec
            return r1
        L_0x00ec:
            return r12
        L_0x00ed:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.mo107131d(com.google.android.apps.search.assistant.surfaces.dictation.service.l.b, j$.time.Duration, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107132e(com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125783g r5, com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125843bg
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bg r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125843bg) r0
            int r1 = r0.f346818c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346818c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bg r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bg
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f346816a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346818c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            if (r5 != 0) goto L_0x003c
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.KEYBOARD_NOT_UP
            r5.<init>(r6)
            goto L_0x005f
        L_0x003c:
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.ab r5 = r5.f346664e
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.w r5 = r5.mo107164a()
            r0.f346818c = r3
            java.lang.Object r7 = r4.mo107129b(r5, r6, r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bo r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125851bo) r7
            boolean r5 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125852bp
            if (r5 == 0) goto L_0x0055
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125852bp) r7
            r5 = r7
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r5 != 0) goto L_0x005f
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.FAILURE_OTHER
            r5.<init>(r6)
        L_0x005f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.mo107132e(com.google.android.apps.search.assistant.surfaces.dictation.service.h.g, com.google.android.apps.search.assistant.surfaces.dictation.service.l.b, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107133f(com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125844bh
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bh r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125844bh) r0
            int r1 = r0.f346822d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346822d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bh r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bh
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f346820b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346822d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r7 = r0.f346819a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0085
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            com.google.common.f.e r8 = f346847a
            com.google.common.f.x r2 = r8.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 36736(0x8f80, float:5.1478E-41)
            r4.<init>(r5)
            r2.mo56379ah(r4)
            java.lang.String r4 = "Expecting that the keyboard is up in app [%s] [SD]"
            r2.mo56389s(r4, r7)
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.j r2 = r6.f346849c
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.g r2 = r2.mo107117a()
            if (r2 != 0) goto L_0x0072
            com.google.common.f.x r7 = r8.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r8 = new com.google.common.f.n
            r0 = 36737(0x8f81, float:5.148E-41)
            r8.<init>(r0)
            r7.mo56379ah(r8)
            java.lang.String r8 = "No active interaction [SD]"
            r7.mo56386p(r8)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r7 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bq r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125853bq.KEYBOARD_NOT_UP
            r7.<init>(r8)
            return r7
        L_0x0072:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.ax r8 = r6.f346856j
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.z r4 = r2.f346665f
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.w r4 = r4.mo107203b()
            r0.f346819a = r2
            r0.f346822d = r3
            java.lang.Object r8 = r8.mo107123a(r4, r7, r0)
            if (r8 == r1) goto L_0x009a
            r7 = r2
        L_0x0085:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bo r8 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125851bo) r8
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125852bp
            if (r0 == 0) goto L_0x008e
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp r8 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125852bp) r8
            goto L_0x008f
        L_0x008e:
            r8 = 0
        L_0x008f:
            if (r8 == 0) goto L_0x0092
            return r8
        L_0x0092:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bs r8 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bs
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.g r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125783g) r7
            r8.<init>(r7)
            return r8
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.mo107133f(com.google.android.apps.search.assistant.surfaces.dictation.service.l.b, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107134g(com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b r11, p3186j$.time.Duration r12, p5462h.p5466c.C69577g r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125845bi
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bi r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125845bi) r0
            int r1 = r0.f346829g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346829g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bi r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bi
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f346827e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346829g
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r6) goto L_0x0053
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            p5462h.C69714l.m101134b(r13)
            goto L_0x011e
        L_0x0031:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0039:
            java.lang.Object r11 = r0.f346826d
            java.lang.Object r12 = r0.f346825c
            java.lang.Object r2 = r0.f346824b
            java.lang.Object r4 = r0.f346823a
            p5462h.C69714l.m101134b(r13)
            goto L_0x00f2
        L_0x0046:
            java.lang.Object r11 = r0.f346826d
            java.lang.Object r12 = r0.f346825c
            java.lang.Object r2 = r0.f346824b
            java.lang.Object r5 = r0.f346823a
            p5462h.C69714l.m101134b(r13)
            goto L_0x00c4
        L_0x0053:
            java.lang.Object r11 = r0.f346826d
            java.lang.Object r12 = r0.f346825c
            java.lang.Object r2 = r0.f346824b
            java.lang.Object r6 = r0.f346823a
            p5462h.C69714l.m101134b(r13)
            r13 = r11
            r11 = r2
            goto L_0x00a5
        L_0x0061:
            p5462h.C69714l.m101134b(r13)
            com.google.common.base.cz r13 = r10.f346855i
            com.google.common.base.ci r13 = com.google.common.base.C58872ci.m90947d(r13)
            com.google.common.f.e r2 = f346847a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 36738(0x8f82, float:5.1481E-41)
            r7.<init>(r8)
            r2.mo56379ah(r7)
            java.lang.String r7 = "Waiting for the app [%s] and will bring keyboard up [SD]"
            r2.mo56389s(r7, r11)
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.w r2 = r10.f346853g
            com.google.android.apps.gsa.nga.api.a.af r2 = r2.f347148c
            java.lang.String r2 = r2.e
            java.lang.String r7 = "com.whatsapp"
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r7)
            if (r2 == 0) goto L_0x00a4
            j$.time.Duration r2 = r10.f346857k
            r0.f346823a = r10
            r0.f346824b = r11
            r0.f346825c = r12
            r0.f346826d = r13
            r0.f346829g = r6
            java.lang.Object r2 = com.google.common.p4580v.p4582b.C60942a.m93084b(r2, r0)
            if (r2 == r1) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            return r1
        L_0x00a4:
            r6 = r10
        L_0x00a5:
            r2 = r6
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bn r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn) r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.ax r7 = r2.f346856j
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.w r2 = r2.f346853g
            r0.f346823a = r6
            r0.f346824b = r11
            r0.f346825c = r12
            r0.f346826d = r13
            r0.f346829g = r5
            r5 = r12
            j$.time.Duration r5 = (p3186j$.time.Duration) r5
            java.lang.Object r2 = r7.mo107126d(r2, r11, r5, r0)
            if (r2 == r1) goto L_0x011f
            r5 = r6
            r9 = r2
            r2 = r11
            r11 = r13
            r13 = r9
        L_0x00c4:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bo r13 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125851bo) r13
            boolean r6 = r13 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125852bp
            if (r6 == 0) goto L_0x00cb
            return r13
        L_0x00cb:
            r13 = r11
            com.google.common.base.ci r13 = (com.google.common.base.C58872ci) r13
            j$.time.Duration r13 = com.google.android.apps.search.assistant.libraries.p8977h.C119407b.m198130a(r13)
            r6 = r12
            j$.time.Duration r6 = (p3186j$.time.Duration) r6
            j$.time.Duration r13 = r6.minus(r13)
            java.lang.String r6 = "timeout - fieldInFocusWaitDuration"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r6)
            r0.f346823a = r5
            r0.f346824b = r2
            r0.f346825c = r12
            r0.f346826d = r11
            r0.f346829g = r4
            r4 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bn r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn) r4
            java.lang.Object r13 = r4.mo107128a(r13, r0)
            if (r13 == r1) goto L_0x011f
            r4 = r5
        L_0x00f2:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bo r13 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125851bo) r13
            boolean r5 = r13 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125852bp
            if (r5 == 0) goto L_0x00f9
            return r13
        L_0x00f9:
            com.google.common.base.ci r11 = (com.google.common.base.C58872ci) r11
            j$.time.Duration r11 = com.google.android.apps.search.assistant.libraries.p8977h.C119407b.m198130a(r11)
            j$.time.Duration r12 = (p3186j$.time.Duration) r12
            j$.time.Duration r11 = r12.minus(r11)
            java.lang.String r12 = "timeout - keyboardUpRequestDuration"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            r12 = 0
            r0.f346823a = r12
            r0.f346824b = r12
            r0.f346825c = r12
            r0.f346826d = r12
            r0.f346829g = r3
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bn r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn) r4
            java.lang.Object r13 = r4.mo107135h(r2, r11, r0)
            if (r13 != r1) goto L_0x011e
            return r1
        L_0x011e:
            return r13
        L_0x011f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.mo107134g(com.google.android.apps.search.assistant.surfaces.dictation.service.l.b, j$.time.Duration, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.l.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107135h(com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b r9, p3186j$.time.Duration r10, p5462h.p5466c.C69577g r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125846bj
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bj r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125846bj) r0
            int r1 = r0.f346834e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346834e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bj r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bj
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f346832c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346834e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p5462h.C69714l.m101134b(r11)
            goto L_0x00bc
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            java.lang.Object r9 = r0.f346831b
            java.lang.Object r10 = r0.f346830a
            p5462h.C69714l.m101134b(r11)
            goto L_0x006d
        L_0x003c:
            p5462h.C69714l.m101134b(r11)
            com.google.common.f.e r11 = f346847a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.n r2 = new com.google.common.f.n
            r6 = 36742(0x8f86, float:5.1487E-41)
            r2.<init>(r6)
            r11.mo56379ah(r2)
            java.lang.String r2 = "Waiting for the keyboard to show up in %s [SD]"
            r11.mo56389s(r2, r9)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bm r11 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bm
            r11.<init>(r8, r9, r5)
            r0.f346830a = r8
            r0.f346831b = r9
            r0.f346834e = r4
            long r6 = com.google.common.p4580v.p4582b.C60942a.m93083a(r10)
            java.lang.Object r11 = kotlinx.coroutines.C71745ea.m104930b(r6, r11, r0)
            if (r11 == r1) goto L_0x00bd
            r10 = r8
        L_0x006d:
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.g r11 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125783g) r11
            if (r11 == 0) goto L_0x008f
            com.google.common.f.e r9 = f346847a
            com.google.common.f.x r9 = r9.mo56224b()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.n r10 = new com.google.common.f.n
            r0 = 36744(0x8f88, float:5.149E-41)
            r10.<init>(r0)
            r9.mo56379ah(r10)
            java.lang.String r10 = "Waiting for the keyboard to show up succeeded with %s [SD]"
            r9.mo56389s(r10, r11)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bs r9 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.bs
            r9.<init>(r11)
            return r9
        L_0x008f:
            com.google.common.f.e r11 = f346847a
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 36743(0x8f87, float:5.1488E-41)
            r2.<init>(r4)
            r11.mo56379ah(r2)
            java.lang.String r2 = "Waiting for keyboard to show up timed out. [SD]"
            r11.mo56386p(r2)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bn r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn) r10
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.j r11 = r10.f346849c
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.g r11 = r11.mo107117a()
            r0.f346830a = r5
            r0.f346831b = r5
            r0.f346834e = r3
            java.lang.Object r11 = r10.mo107132e(r11, r9, r0)
            if (r11 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            return r11
        L_0x00bd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125850bn.mo107135h(com.google.android.apps.search.assistant.surfaces.dictation.service.l.b, j$.time.Duration, h.c.g):java.lang.Object");
    }
}
