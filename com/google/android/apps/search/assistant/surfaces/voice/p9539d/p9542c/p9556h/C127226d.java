package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9556h;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.h.d */
/* compiled from: PG */
public final class C127226d implements C127369n {

    /* renamed from: a */
    public static final C33476a f350312a = new C33476a("assistant.api.params.CarrierParams", C51270bm.f133476f);

    /* renamed from: b */
    public static final C32836cd f350313b;

    /* renamed from: c */
    private final C68214a f350314c;

    /* renamed from: d */
    private final C71422aw f350315d;

    /* renamed from: e */
    private final C68214a f350316e;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.device.carrier.params");
        a.mo38319b(a2.mo38298a());
        f350313b = a.mo38318a();
    }

    public C127226d(C68214a aVar, C71422aw awVar, C68214a aVar2) {
        C69664n.m101061g(aVar, "carrierParamsFetcher");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar2, "udcDataService");
        this.f350314c = aVar;
        this.f350315d = awVar;
        this.f350316e = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350315d, (C71424ay) null, new C127223a(this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107998b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9556h.C127224b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.voice.d.c.h.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9556h.C127224b) r0
            int r1 = r0.f350308d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350308d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.h.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.h.b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f350306b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350308d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r6)
            goto L_0x00ac
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0033:
            java.lang.Object r2 = r0.f350305a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0047
        L_0x0039:
            p5462h.C69714l.m101134b(r6)
            r0.f350305a = r5
            r0.f350308d = r4
            java.lang.Object r6 = r5.mo107999c(r0)
            if (r6 == r1) goto L_0x00ba
            r2 = r5
        L_0x0047:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0086
            com.google.assistant.e.i.a.bm r6 = com.google.assistant.p3897e.p3917i.p3918a.C51270bm.f133476f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.i.a.bh r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51265bh) r6
            java.lang.String r0 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            java.lang.String r0 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            com.google.assistant.e.i.a.bl r0 = com.google.assistant.p3897e.p3917i.p3918a.C51269bl.UDC_DI_OPTED_OUT
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.assistant.e.i.a.bm r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51270bm) r1
            int r0 = r0.f133475f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.f133480c = r0
            r0 = 3
            r1.f133479b = r0
            com.google.protobuf.bv r6 = r6.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            com.google.assistant.e.i.a.bm r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51270bm) r6
            return r6
        L_0x0086:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.h.d r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9556h.C127226d) r2
            dagger.a r6 = r2.f350314c
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.libraries.search.assistant.y.e.h r6 = (com.google.android.libraries.search.assistant.p2828y.p2835e.C36870h) r6
            com.google.android.libraries.search.assistant.y.e.a r2 = new com.google.android.libraries.search.assistant.y.e.a
            r2.<init>()
            r2.mo40424b()
            com.google.android.libraries.search.assistant.y.e.d r2 = r2.mo40423a()
            com.google.common.util.concurrent.cx r6 = r6.mo40429a(r2)
            r2 = 0
            r0.f350305a = r2
            r0.f350308d = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r6 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            com.google.common.base.ax r6 = (com.google.common.base.C58833ax) r6
            com.google.assistant.e.i.a.bm r0 = com.google.assistant.p3897e.p3917i.p3918a.C51270bm.f133476f
            java.lang.Object r6 = r6.mo56109e(r0)
            java.lang.String r0 = "carrierParamsFetcher\n   …ams.getDefaultInstance())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        L_0x00ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9556h.C127226d.mo107998b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107999c(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9556h.C127225c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.d.c.h.c r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9556h.C127225c) r0
            int r1 = r0.f350311c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350311c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.h.c r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.h.c
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f350309a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350311c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            p5462h.C69714l.m101134b(r7)
            goto L_0x0054
        L_0x0028:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0030:
            p5462h.C69714l.m101134b(r7)
            dagger.a r7 = r6.f350316e
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.libraries.search.udcdataservice.h r7 = (com.google.android.libraries.search.udcdataservice.C41409h) r7
            com.google.android.libraries.search.udcdataservice.c[] r2 = new com.google.android.libraries.search.udcdataservice.C41387c[r4]
            com.google.android.libraries.search.udcdataservice.c r5 = com.google.android.libraries.search.udcdataservice.C41387c.DEVICE_CONTACTS
            r2[r3] = r5
            com.google.android.libraries.search.udcdataservice.a r5 = com.google.android.libraries.search.udcdataservice.C41385a.ASSISTANT
            com.google.common.util.concurrent.cx r7 = r7.mo43949b(r2, r5)
            java.lang.String r2 = "udcDataService\n        .…, CallSiteName.ASSISTANT)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            r0.f350311c = r4
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 == r1) goto L_0x0075
        L_0x0054:
            java.util.List r7 = (java.util.List) r7
            java.lang.String r0 = "deviceContactsSetting"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            java.lang.Object r7 = p5462h.p5463a.C69540x.m100821C(r7)
            com.google.android.libraries.search.udcdataservice.e r7 = (com.google.android.libraries.search.udcdataservice.C41389e) r7
            if (r7 == 0) goto L_0x0070
            int r7 = r7.f108147c
            int r7 = com.google.android.libraries.search.udcdataservice.C41408g.m72395a(r7)
            if (r7 != 0) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            r0 = 2
            if (r7 != r0) goto L_0x0070
            r3 = 1
        L_0x0070:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9556h.C127226d.mo107999c(h.c.g):java.lang.Object");
    }
}
