package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9555g;

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
import com.google.assistant.p3897e.p3917i.p3918a.C51261bd;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.g.c */
/* compiled from: PG */
public final class C127222c implements C127369n {

    /* renamed from: a */
    public static final C33476a f350294a = new C33476a("assistant.api.params.CallStateParams", C51261bd.f133446d);

    /* renamed from: b */
    public static final C32836cd f350295b;

    /* renamed from: c */
    private final C68214a f350296c;

    /* renamed from: d */
    private final C71422aw f350297d;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("call");
        a.mo38319b(a2.mo38298a());
        f350295b = a.mo38318a();
    }

    public C127222c(C68214a aVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "callStateParamsFetcher");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f350296c = aVar;
        this.f350297d = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350297d, (C71424ay) null, new C127220a(this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107997b(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9555g.C127221b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.voice.d.c.g.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9555g.C127221b) r0
            int r1 = r0.f350293c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350293c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.g.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.g.b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f350291a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350293c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            dagger.a r5 = r4.f350296c
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.libraries.search.assistant.y.d.a r5 = (com.google.android.libraries.search.assistant.p2828y.p2834d.C36861a) r5
            com.google.assistant.e.i.a.bd r5 = r5.mo40421a()
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            r0.f350293c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            java.lang.String r0 = "callStateParamsFetcher.g…).callStateParams.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9555g.C127222c.mo107997b(h.c.g):java.lang.Object");
    }
}
