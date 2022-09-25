package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9546ac;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.ac.c */
/* compiled from: PG */
public final class C127196c implements C32597b {

    /* renamed from: a */
    public static final C33476a f350191a = new C33476a("assistant.api.params.TimerParams", C51594nm.f134474f);

    /* renamed from: b */
    private static final C32836cd f350192b;

    /* renamed from: c */
    private final C68214a f350193c;

    /* renamed from: d */
    private final C71422aw f350194d;

    /* renamed from: e */
    private final C69464a f350195e;

    /* renamed from: f */
    private final boolean f350196f;

    /* renamed from: g */
    private final C32601f f350197g = new C32601f();

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("timer");
        a.mo38319b(a2.mo38298a());
        f350192b = a.mo38318a();
    }

    public C127196c(C68214a aVar, C71422aw awVar, C69464a aVar2, boolean z) {
        C69664n.m101061g(aVar, "clockContextReader");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f350193c = aVar;
        this.f350194d = awVar;
        this.f350195e = aVar2;
        this.f350196f = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107992a(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9546ac.C127195b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ac.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9546ac.C127195b) r0
            int r1 = r0.f350190c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350190c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ac.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.ac.b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f350188a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350190c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r8)
            goto L_0x0080
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x002f:
            p5462h.C69714l.m101134b(r8)
            dagger.a r8 = r7.f350193c
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.libraries.search.assistant.y.f.c r8 = (com.google.android.libraries.search.assistant.p2828y.p2836f.C36904c) r8
            com.google.android.libraries.search.assistant.y.f.d r2 = com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e.m65602e()
            java.lang.String r4 = "android.intent.action.SHOW_TIMERS"
            java.lang.String r5 = "android.intent.action.DISMISS_TIMER"
            java.lang.String r6 = "android.intent.action.SET_TIMER"
            com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90012L(r6, r4, r5)
            com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90006F(r4)
            r5 = r2
            com.google.android.libraries.search.assistant.y.f.a r5 = (com.google.android.libraries.search.assistant.p2828y.p2836f.C36872a) r5
            r5.f96027b = r4
            g.a.a r4 = r7.f350195e
            java.lang.Object r4 = r4.mo17428b()
            com.google.protos.m.a.f r4 = (com.google.protos.p5124m.p5125a.C65603f) r4
            com.google.protobuf.cq r4 = r4.f178307a
            java.lang.String r6 = "versionedClockApps.get().elementList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            com.google.common.b.ij r4 = com.google.common.p4522b.C58479go.m89814f(r4)
            com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90006F(r4)
            r5.f96028c = r4
            com.google.android.libraries.search.assistant.y.f.e r2 = r2.mo40432a()
            com.google.common.util.concurrent.cx r8 = r8.mo40447d(r2)
            java.lang.String r2 = "clockContextReader\n     …         .build()\n      )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            r0.f350190c = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 != r1) goto L_0x0080
            return r1
        L_0x0080:
            java.lang.String r0 = "clockContextReader\n     …()\n      )\n      .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9546ac.C127196c.mo107992a(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final C32601f mo38173c() {
        if (this.f350196f) {
            return null;
        }
        return this.f350197g;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f350192b;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350194d, (C71424ay) null, new C127194a(this, (C69577g) null), 3);
    }
}
