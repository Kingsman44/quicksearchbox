package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9568t;

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
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36029l;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.t.c */
/* compiled from: PG */
public final class C127263c implements C127369n {

    /* renamed from: a */
    public static final C33476a f350479a = new C33476a("assistant.api.params.MediaParams", C51450id.f133992h);

    /* renamed from: b */
    public static final C32836cd f350480b;

    /* renamed from: c */
    private final C68214a f350481c;

    /* renamed from: d */
    private final C36029l f350482d;

    /* renamed from: e */
    private final C71422aw f350483e;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("media");
        a.mo38319b(a2.mo38298a());
        f350480b = a.mo38318a();
    }

    public C127263c(C68214a aVar, C36029l lVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "mediaParamsFetcher");
        C69664n.m101061g(lVar, "mediaControllerAccessor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f350481c = aVar;
        this.f350482d = lVar;
        this.f350483e = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350483e, (C71424ay) null, new C127261a(this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108005b(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9568t.C127262b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.d.c.t.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9568t.C127262b) r0
            int r1 = r0.f350478d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350478d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.t.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.t.b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f350476b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350478d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0073
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0032:
            java.lang.Object r2 = r0.f350475a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0051
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.performer.g.a.l r8 = r7.f350482d
            com.google.common.util.concurrent.cx r8 = r8.mo39945a()
            java.lang.String r2 = "mediaControllerAccessor.…gTopActiveMediaController"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            r0.f350475a = r7
            r0.f350478d = r4
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 == r1) goto L_0x0081
            r2 = r7
        L_0x0051:
            j$.util.Optional r8 = (p3186j$.util.Optional) r8
            com.google.android.apps.search.assistant.surfaces.voice.d.c.t.c r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9568t.C127263c) r2
            dagger.a r2 = r2.f350481c
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.libraries.search.assistant.y.n.l r2 = (com.google.android.libraries.search.assistant.p2828y.p2853n.C37015l) r2
            com.google.android.libraries.search.assistant.y.n.b r4 = new com.google.android.libraries.search.assistant.y.n.b
            r5 = 3
            r6 = 0
            r4.<init>(r6, r5)
            com.google.common.util.concurrent.cx r8 = r2.mo40535a(r8, r4)
            r0.f350475a = r6
            r0.f350478d = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            j$.util.Optional r8 = (p3186j$.util.Optional) r8
            com.google.assistant.e.i.a.id r0 = com.google.assistant.p3897e.p3917i.p3918a.C51450id.f133992h
            java.lang.Object r8 = r8.orElse(r0)
            java.lang.String r0 = "mediaParamsFetcher\n     …ams.getDefaultInstance())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            return r8
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9568t.C127263c.mo108005b(h.c.g):java.lang.Object");
    }
}
