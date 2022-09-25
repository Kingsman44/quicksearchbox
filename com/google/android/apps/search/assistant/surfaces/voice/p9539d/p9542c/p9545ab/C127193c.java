package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9545ab;

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
import com.google.assistant.p3897e.p3917i.p3918a.C51566ml;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.ab.c */
/* compiled from: PG */
public final class C127193c implements C127369n {

    /* renamed from: a */
    public static final C33476a f350177a = new C33476a("assistant.api.params.StopwatchParams", C51566ml.f134401b);

    /* renamed from: b */
    public static final C32836cd f350178b;

    /* renamed from: c */
    private final C68214a f350179c;

    /* renamed from: d */
    private final C71422aw f350180d;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("stopwatch");
        a.mo38319b(a2.mo38298a());
        f350178b = a.mo38318a();
    }

    public C127193c(C68214a aVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "clockContextReader");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f350179c = aVar;
        this.f350180d = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350180d, (C71424ay) null, new C127191a(this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107991b(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9545ab.C127192b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ab.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9545ab.C127192b) r0
            int r1 = r0.f350176c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350176c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ab.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.ab.b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f350174a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350176c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x0064
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            dagger.a r7 = r6.f350179c
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.libraries.search.assistant.y.f.c r7 = (com.google.android.libraries.search.assistant.p2828y.p2836f.C36904c) r7
            com.google.android.libraries.search.assistant.y.f.d r2 = com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e.m65602e()
            com.google.common.b.qy r4 = new com.google.common.b.qy
            java.lang.String r5 = "com.google.android.deskclock/53000003/-1"
            r4.<init>(r5)
            com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90006F(r4)
            r5 = r2
            com.google.android.libraries.search.assistant.y.f.a r5 = (com.google.android.libraries.search.assistant.p2828y.p2836f.C36872a) r5
            r5.f96028c = r4
            com.google.android.libraries.search.assistant.y.f.e r2 = r2.mo40432a()
            com.google.common.util.concurrent.cx r7 = r7.mo40446c(r2)
            java.lang.String r2 = "clockContextReader\n     …         .build()\n      )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            r0.f350176c = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 != r1) goto L_0x0064
            return r1
        L_0x0064:
            java.lang.String r0 = "clockContextReader\n     …()\n      )\n      .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9545ab.C127193c.mo107991b(h.c.g):java.lang.Object");
    }
}
