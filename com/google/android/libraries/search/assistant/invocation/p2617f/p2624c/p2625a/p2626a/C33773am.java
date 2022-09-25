package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import android.os.Bundle;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionServiceCallbacksImpl$onNewSession$1", mo61344c = "ApaVoiceInteractionSessionServiceCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {33})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.am */
/* compiled from: PG */
public final class C33773am extends C69572j implements C69630p {

    /* renamed from: a */
    int f90208a;

    /* renamed from: b */
    final /* synthetic */ C33775ao f90209b;

    /* renamed from: c */
    final /* synthetic */ Bundle f90210c;

    /* renamed from: d */
    final /* synthetic */ int f90211d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33773am(C33775ao aoVar, Bundle bundle, int i, C69577g gVar) {
        super(2, gVar);
        this.f90209b = aoVar;
        this.f90210c = bundle;
        this.f90211d = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33773am) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.content.Intent} */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f90208a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000c
            p5462h.C69714l.m101134b(r9)
            goto L_0x0029
        L_0x000c:
            p5462h.C69714l.m101134b(r9)
            long r4 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33775ao.f90215b
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.al r9 = new com.google.android.libraries.search.assistant.invocation.f.c.a.a.al
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ao r1 = r8.f90209b
            android.os.Bundle r6 = r8.f90210c
            int r7 = r8.f90211d
            r9.<init>(r1, r6, r7, r3)
            r8.f90208a = r2
            long r4 = kotlinx.coroutines.C71608bi.m104549a(r4)
            java.lang.Object r9 = kotlinx.coroutines.C71745ea.m104929a(r4, r9, r8)
            if (r9 != r0) goto L_0x0029
            return r0
        L_0x0029:
            java.lang.Number r9 = (java.lang.Number) r9
            long r0 = r9.longValue()
            com.google.common.f.e r9 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33775ao.f90214a
            com.google.common.f.x r9 = r9.mo56224b()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "VIS.ServiceCallbacks"
            r9.mo56378ag(r4, r5)
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 51295(0xc85f, float:7.188E-41)
            r4.<init>(r5)
            r9.mo56379ah(r4)
            java.lang.String r4 = "onNewSession: %s"
            r9.mo56388r(r4, r0)
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.ao r9 = r8.f90209b
            android.os.Bundle r4 = r8.f90210c
            com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.b r9 = r9.f90219f
            boolean r9 = com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2594d.C33515a.m62108a(r9, r4)
            if (r9 == 0) goto L_0x0065
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>(r4)
            java.lang.String r4 = "EXPLICITLY_MARKED_AS_SYSTEM_INVOCATION"
            r9.putBoolean(r4, r2)
            r4 = r9
        L_0x0065:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r9 = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d
            r9.<init>(r0)
            com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.a r0 = new com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.a
            r0.<init>(r9)
            java.lang.String r9 = "com.google.voicesearch.VI_INTENT"
            if (r4 == 0) goto L_0x008e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x0083
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.Object r1 = r4.getParcelable(r9, r1)
            r3 = r1
            android.content.Intent r3 = (android.content.Intent) r3
            goto L_0x008e
        L_0x0083:
            android.os.Parcelable r1 = r4.getParcelable(r9)
            boolean r2 = r1 instanceof android.content.Intent
            if (r2 == 0) goto L_0x008e
            r3 = r1
            android.content.Intent r3 = (android.content.Intent) r3
        L_0x008e:
            if (r3 != 0) goto L_0x0095
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
        L_0x0095:
            r0.mo5761a(r3)
            android.os.Bundle r0 = new android.os.Bundle
            if (r4 != 0) goto L_0x009e
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L_0x009e:
            r0.<init>(r4)
            r0.putParcelable(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33773am.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33773am(this.f90209b, this.f90210c, this.f90211d, gVar);
    }
}
