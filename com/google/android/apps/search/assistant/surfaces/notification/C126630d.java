package com.google.android.apps.search.assistant.surfaces.notification;

import com.google.android.libraries.search.assistant.proactive.C36254d;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.knowledge.p4661a.p4662a.C61759u;
import com.google.knowledge.p4661a.p4662a.C61760v;
import com.google.knowledge.p4661a.p4662a.p4663a.C61736a;
import com.google.knowledge.p4661a.p4662a.p4663a.C61737b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4794ae.p4795a.C63146a;
import com.google.protos.p4794ae.p4795a.C63148b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.notification.d */
/* compiled from: PG */
public final class C126630d implements C126625a {

    /* renamed from: a */
    public static final C59071e f348727a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.notification.d");

    /* renamed from: b */
    public final C36254d f348728b;

    /* renamed from: c */
    private final Executor f348729c;

    public C126630d(Executor executor, C36254d dVar) {
        this.f348729c = new C60904dr(executor);
        this.f348728b = dVar;
    }

    /* renamed from: b */
    public static C61746h m207049b(String str) {
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "RD";
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        hVar.f166793a |= 2;
        hVar.f166796d = "category";
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C61751m mVar2 = (C61751m) C61752n.f166808f.createBuilder();
        mVar2.copyOnWrite();
        C61752n nVar2 = (C61752n) mVar2.instance;
        nVar2.f166810a |= 4;
        nVar2.f166811b = "TimerObject";
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        C61752n nVar3 = (C61752n) mVar2.build();
        nVar3.getClass();
        jVar.f166803b = nVar3;
        jVar.f166802a = 2;
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        C61748j jVar2 = (C61748j) iVar.build();
        jVar2.getClass();
        hVar2.f166797e = jVar2;
        hVar2.f166793a |= 4;
        mVar.mo58184c(gVar);
        C61736a aVar = (C61736a) C61737b.f166782c.createBuilder();
        C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
        C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
        C63146a aVar2 = (C63146a) C63148b.f170519d.createBuilder();
        aVar2.copyOnWrite();
        C63148b bVar = (C63148b) aVar2.instance;
        bVar.f170521a |= 1;
        bVar.f170522b = str;
        aVar2.copyOnWrite();
        C63148b bVar2 = (C63148b) aVar2.instance;
        bVar2.f170523c = 3;
        bVar2.f170521a |= 2;
        sVar.copyOnWrite();
        C61758t tVar = (C61758t) sVar.instance;
        C63148b bVar3 = (C63148b) aVar2.build();
        bVar3.getClass();
        tVar.f166827b = bVar3;
        tVar.f166826a = 6;
        iVar2.copyOnWrite();
        C61748j jVar3 = (C61748j) iVar2.instance;
        C61758t tVar2 = (C61758t) sVar.build();
        tVar2.getClass();
        jVar3.f166803b = tVar2;
        jVar3.f166802a = 3;
        C61748j jVar4 = (C61748j) iVar2.build();
        aVar.copyOnWrite();
        C61737b bVar4 = (C61737b) aVar.instance;
        jVar4.getClass();
        bVar4.f166785b = jVar4;
        bVar4.f166784a |= 1;
        if (!mVar.mo58882j(C61760v.f166829c)) {
            mVar.mo58885m(C61760v.f166829c, C61760v.f166828b);
        }
        C62940bt btVar = C61760v.f166829c;
        C61759u uVar = (C61759u) ((C61760v) mVar.mo58881i(btVar)).toBuilder();
        C61737b bVar5 = (C61737b) aVar.build();
        uVar.copyOnWrite();
        C61760v vVar = (C61760v) uVar.instance;
        bVar5.getClass();
        C62971cq cqVar = vVar.f166831a;
        if (!cqVar.mo58948c()) {
            vVar.f166831a = C62942bv.mutableCopy(cqVar);
        }
        vVar.f166831a.add(bVar5);
        mVar.mo58885m(btVar, (C61760v) uVar.build());
        C61745g gVar2 = (C61745g) C61746h.f166791g.createBuilder();
        gVar2.copyOnWrite();
        C61746h hVar3 = (C61746h) gVar2.instance;
        hVar3.f166793a |= 2;
        hVar3.f166796d = "timer_object";
        C61747i iVar3 = (C61747i) C61748j.f166800d.createBuilder();
        iVar3.copyOnWrite();
        C61748j jVar5 = (C61748j) iVar3.instance;
        C61752n nVar4 = (C61752n) mVar.build();
        nVar4.getClass();
        jVar5.f166803b = nVar4;
        jVar5.f166802a = 2;
        gVar2.copyOnWrite();
        C61746h hVar4 = (C61746h) gVar2.instance;
        C61748j jVar6 = (C61748j) iVar3.build();
        jVar6.getClass();
        hVar4.f166797e = jVar6;
        hVar4.f166793a |= 4;
        return (C61746h) gVar2.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo107634a(android.content.Intent r5, int r6) {
        /*
            r4 = this;
            com.google.common.f.e r0 = f348727a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "NTF.IntentProcessor"
            r0.mo56378ag(r1, r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 37066(0x90ca, float:5.194E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "#process:%s %d"
            r0.mo56352E(r1, r5, r6)
            java.lang.String r6 = r5.getAction()
            java.lang.String r6 = com.google.common.base.C58837ba.m90858g(r6)
            int r0 = r6.hashCode()
            r1 = -1051044222(0xffffffffc15a5682, float:-13.64612)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x004f
            r1 = -217659624(0xfffffffff306c718, float:-1.067819E31)
            if (r0 == r1) goto L_0x0045
            r1 = 1909655729(0x71d308b1, float:2.089979E30)
            if (r0 == r1) goto L_0x003b
            goto L_0x0059
        L_0x003b:
            java.lang.String r0 = "com.google.android.apps.search.assistant.surfaces.notification.TNG_CLIENT_INPUT_ACTION"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0059
            r6 = 1
            goto L_0x005a
        L_0x0045:
            java.lang.String r0 = "com.google.android.apps.search.assistant.surfaces.notification.USER_DISMISSAL_ACTION"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0059
            r6 = 0
            goto L_0x005a
        L_0x004f:
            java.lang.String r0 = "ASPIRE_BUTTON_ACTION"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0059
            r6 = 2
            goto L_0x005a
        L_0x0059:
            r6 = -1
        L_0x005a:
            if (r6 == 0) goto L_0x0083
            if (r6 == r3) goto L_0x0073
            if (r6 == r2) goto L_0x006c
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Unexpected intent."
            r5.<init>(r6)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92899h(r5)
            return r5
        L_0x006c:
            com.google.android.libraries.search.assistant.proactive.d r6 = r4.f348728b
            com.google.common.util.concurrent.cx r5 = r6.mo40071a(r5)
            return r5
        L_0x0073:
            com.google.android.apps.search.assistant.surfaces.notification.c r6 = new com.google.android.apps.search.assistant.surfaces.notification.c
            r6.<init>(r4, r5)
            java.util.concurrent.Executor r5 = r4.f348729c
            java.lang.Runnable r6 = com.google.apps.tiktok.tracing.C47810es.m84977q(r6)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92903l(r6, r5)
            return r5
        L_0x0083:
            com.google.android.apps.search.assistant.surfaces.notification.b r6 = new com.google.android.apps.search.assistant.surfaces.notification.b
            r6.<init>(r4, r5)
            java.util.concurrent.Executor r5 = r4.f348729c
            java.lang.Runnable r6 = com.google.apps.tiktok.tracing.C47810es.m84977q(r6)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92903l(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.notification.C126630d.mo107634a(android.content.Intent, int):com.google.common.util.concurrent.cx");
    }
}
