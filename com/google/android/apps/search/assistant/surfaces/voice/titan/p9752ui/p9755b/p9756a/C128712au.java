package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateClassicConnectionImpl$createHotwordInvocationStateFlow$hotwordInvokedLastFewSecondsFlow$1", mo61344c = "VoicePlateClassicConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {331, 332, 333, 335})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.au */
/* compiled from: PG */
final class C128712au extends C69572j implements C69631q {

    /* renamed from: a */
    int f353822a;

    /* renamed from: b */
    /* synthetic */ boolean f353823b;

    /* renamed from: c */
    final /* synthetic */ C128735bq f353824c;

    /* renamed from: d */
    private /* synthetic */ Object f353825d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128712au(C128735bq bqVar, C69577g gVar) {
        super(3, gVar);
        this.f353824c = bqVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C128712au auVar = new C128712au(this.f353824c, (C69577g) obj3);
        auVar.f353825d = (C71588o) obj;
        auVar.f353823b = booleanValue;
        return auVar.mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlinx.coroutines.b.o} */
    /* JADX WARNING: type inference failed for: r7v8, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (com.google.common.p4580v.p4582b.C60942a.m93084b(r7, r6) != r0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r1.mo20883a(false, r6) == r0) goto L_0x0055;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f353822a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r5) goto L_0x0018
            if (r1 == r4) goto L_0x0012
            p5462h.C69714l.m101134b(r7)
            goto L_0x0064
        L_0x0012:
            java.lang.Object r1 = r6.f353825d
            p5462h.C69714l.m101134b(r7)
            goto L_0x0046
        L_0x0018:
            java.lang.Object r1 = r6.f353825d
            p5462h.C69714l.m101134b(r7)
            goto L_0x0034
        L_0x001e:
            p5462h.C69714l.m101134b(r7)
            java.lang.Object r7 = r6.f353825d
            boolean r1 = r6.f353823b
            if (r1 == 0) goto L_0x0056
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r6.f353822a = r5
            java.lang.Object r1 = r7.mo20883a(r1, r6)
            if (r1 == r0) goto L_0x0055
            r1 = r7
        L_0x0034:
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bq r7 = r6.f353824c
            com.google.protobuf.ar r7 = r7.f353886f
            j$.time.Duration r7 = com.google.android.apps.search.assistant.libraries.p8977h.C119406a.m198129a(r7)
            r6.f353825d = r1
            r6.f353822a = r4
            java.lang.Object r7 = com.google.common.p4580v.p4582b.C60942a.m93084b(r7, r6)
            if (r7 == r0) goto L_0x0055
        L_0x0046:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r2 = 0
            r6.f353825d = r2
            r6.f353822a = r3
            java.lang.Object r7 = r1.mo20883a(r7, r6)
            if (r7 != r0) goto L_0x0064
        L_0x0055:
            return r0
        L_0x0056:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r2 = 4
            r6.f353822a = r2
            java.lang.Object r7 = r7.mo20883a(r1, r6)
            if (r7 != r0) goto L_0x0064
            return r0
        L_0x0064:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128712au.mo5193b(java.lang.Object):java.lang.Object");
    }
}
