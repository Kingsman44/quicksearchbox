package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9543a;

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
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.a.c */
/* compiled from: PG */
public final class C127188c implements C32597b {

    /* renamed from: a */
    public static final C33476a f350156a = new C33476a("assistant.api.params.AlarmParams", C51527l.f134273f);

    /* renamed from: b */
    private static final C32836cd f350157b;

    /* renamed from: c */
    private final C68214a f350158c;

    /* renamed from: d */
    private final C71422aw f350159d;

    /* renamed from: e */
    private final boolean f350160e;

    /* renamed from: f */
    private final C32601f f350161f = new C32601f();

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("alarm");
        a.mo38319b(a2.mo38298a());
        f350157b = a.mo38318a();
    }

    public C127188c(C68214a aVar, C71422aw awVar, boolean z) {
        C69664n.m101061g(aVar, "clockContextReader");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f350158c = aVar;
        this.f350159d = awVar;
        this.f350160e = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107990a(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9543a.C127187b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.surfaces.voice.d.c.a.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9543a.C127187b) r0
            int r1 = r0.f350155c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350155c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.a.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.a.b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f350153a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350155c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r9)
            goto L_0x0076
        L_0x0027:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x002f:
            p5462h.C69714l.m101134b(r9)
            dagger.a r9 = r8.f350158c
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.libraries.search.assistant.y.f.c r9 = (com.google.android.libraries.search.assistant.p2828y.p2836f.C36904c) r9
            com.google.android.libraries.search.assistant.y.f.d r2 = com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e.m65602e()
            java.lang.String r4 = "android.intent.action.DISMISS_ALARM"
            java.lang.String r5 = "android.intent.action.SNOOZE_ALARM"
            java.lang.String r6 = "android.intent.action.SET_ALARM"
            java.lang.String r7 = "android.intent.action.SHOW_ALARMS"
            com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90013M(r6, r7, r4, r5)
            com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90006F(r4)
            r5 = r2
            com.google.android.libraries.search.assistant.y.f.a r5 = (com.google.android.libraries.search.assistant.p2828y.p2836f.C36872a) r5
            r5.f96026a = r4
            com.google.common.b.qy r4 = new com.google.common.b.qy
            java.lang.String r6 = "com.google.android.deskclock/53000003/-1"
            r4.<init>(r6)
            com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90006F(r4)
            r5.f96028c = r4
            com.google.android.libraries.search.assistant.y.f.e r2 = r2.mo40432a()
            com.google.common.util.concurrent.cx r9 = r9.mo40444a(r2)
            java.lang.String r2 = "clockContextReader\n     …         .build()\n      )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r0.f350155c = r3
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 != r1) goto L_0x0076
            return r1
        L_0x0076:
            java.lang.String r0 = "clockContextReader\n     …()\n      )\n      .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9543a.C127188c.mo107990a(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final C32601f mo38173c() {
        if (this.f350160e) {
            return null;
        }
        return this.f350161f;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f350157b;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350159d, (C71424ay) null, new C127186a(this, (C69577g) null), 3);
    }
}
