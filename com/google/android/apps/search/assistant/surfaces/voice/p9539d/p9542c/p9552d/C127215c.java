package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9552d;

import com.google.android.libraries.search.assistant.appactions.p2502b.C32487a;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32490c;
import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32491d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.d.c */
/* compiled from: PG */
public final class C127215c implements C32597b {

    /* renamed from: a */
    public static final C32836cd f350264a;

    /* renamed from: b */
    private final C68214a f350265b;

    /* renamed from: c */
    private final C71422aw f350266c;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = false;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        Integer num = C32487a.f87058a;
        C69664n.m101060f(num, "GENERIC_CONTEXT_ID");
        int intValue = num.intValue();
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        arVar.f87975a = 3;
        arVar.f87976b = Integer.valueOf(intValue);
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        C62942bv build = ccVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…       )\n        .build()");
        f350264a = (C32836cd) build;
    }

    public C127215c(C68214a aVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "shortcutFetcher");
        C69664n.m101061g(awVar, "futureScope");
        this.f350265b = aVar;
        this.f350266c = awVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107996a(java.util.List r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9552d.C127214b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.d.c.d.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9552d.C127214b) r0
            int r1 = r0.f350263c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350263c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.d.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.d.b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f350261a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350263c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r7)
            goto L_0x007a
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            p5462h.C69714l.m101134b(r7)
            goto L_0x0058
        L_0x0036:
            p5462h.C69714l.m101134b(r7)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0061
            dagger.a r6 = r5.f350265b
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.search.assistant.verticals.a.h.a r6 = (com.google.android.apps.search.assistant.verticals.p9880a.p9892h.C130407a) r6
            com.google.common.util.concurrent.cx r6 = r6.mo109688a()
            java.lang.String r7 = "shortcutFetcher.get().allShortcuts"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r0.f350263c = r4
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r7 == r1) goto L_0x0060
        L_0x0058:
            java.lang.String r6 = "shortcutFetcher.get().allShortcuts.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            java.util.List r7 = (java.util.List) r7
            goto L_0x0081
        L_0x0060:
            return r1
        L_0x0061:
            dagger.a r7 = r5.f350265b
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.search.assistant.verticals.a.h.a r7 = (com.google.android.apps.search.assistant.verticals.p9880a.p9892h.C130407a) r7
            com.google.common.util.concurrent.cx r6 = r7.mo109689b(r6)
            java.lang.String r7 = "shortcutFetcher.get().ge…ForPackages(packageNames)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r0.f350263c = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r7 == r1) goto L_0x0082
        L_0x007a:
            java.lang.String r6 = "shortcutFetcher.get().ge…ges(packageNames).await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            java.util.List r7 = (java.util.List) r7
        L_0x0081:
            return r7
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9552d.C127215c.mo107996a(java.util.List, h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f350264a;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        Object obj;
        C69664n.m101061g(beVar, "request");
        C62940bt r0 = C62942bv.checkIsLite(C32491d.f87063d);
        beVar.mo58887l(r0);
        Object l = beVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C69664n.m101060f(obj, "request.getExtension(Sho…ortcutsContextRequestExt)");
        C32490c cVar = ((C32491d) obj).f87066b;
        if (cVar == null) {
            cVar = C32490c.f87059b;
        }
        C62971cq cqVar = cVar.f87061a;
        C69664n.m101060f(cqVar, "scReq.querySpec.packageNamesList");
        return C71663i.m104692e(this.f350266c, (C71424ay) null, new C127213a(this, cqVar, (C69577g) null), 3);
    }
}
