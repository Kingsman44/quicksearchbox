package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9562n;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.deviceproperties.DevicePropertiesSupplier$getDeviceProperties$2$mdaSignals$1", mo61344c = "DevicePropertiesSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {131})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.n.b */
/* compiled from: PG */
final class C127243b extends C69572j implements C69630p {

    /* renamed from: a */
    int f350381a;

    /* renamed from: b */
    final /* synthetic */ C127245d f350382b;

    /* renamed from: c */
    final /* synthetic */ C127289i f350383c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127243b(C127245d dVar, C127289i iVar, C69577g gVar) {
        super(2, gVar);
        this.f350382b = dVar;
        this.f350383c = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127243b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f350381a
            if (r1 == 0) goto L_0x000a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0076
        L_0x000a:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.surfaces.voice.d.c.n.d r7 = r6.f350382b
            com.google.android.apps.search.assistant.surfaces.voice.d.d.i r1 = r6.f350383c
            r2 = 1
            r6.f350381a = r2
            com.google.protobuf.bt r2 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9672g.C128048a.f352353a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r3 = r1.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0072
            com.google.protobuf.bt r2 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9672g.C128048a.f352353a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r4 = r1.f169962ag
            com.google.protobuf.bs r5 = r2.f169971d
            java.lang.Object r4 = r4.mo58854l(r5)
            if (r4 != 0) goto L_0x003e
            java.lang.Object r2 = r2.f169969b
            goto L_0x0042
        L_0x003e:
            java.lang.Object r2 = r2.mo58889c(r4)
        L_0x0042:
            java.lang.String r4 = "queryContext.getExtensio…nsion.populateMdaSignals)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0072
            com.google.android.apps.search.assistant.surfaces.voice.i.c.i r7 = r7.f350408k
            com.google.android.apps.search.assistant.surfaces.voice.d.d.n r1 = r1.f350567e
            if (r1 != 0) goto L_0x0057
            com.google.android.apps.search.assistant.surfaces.voice.d.d.n r1 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127294n.f350576c
        L_0x0057:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = r1.f350579b
            if (r1 != 0) goto L_0x005d
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x005d:
            java.lang.String r2 = "queryContext.triggeringInfo.invocationToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.apps.search.assistant.surfaces.voice.i.c.g r2 = new com.google.android.apps.search.assistant.surfaces.voice.i.c.g
            r2.<init>(r7, r1, r3)
            java.lang.Object r7 = kotlinx.coroutines.C71423ax.m104196a(r2, r6)
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r7 == r1) goto L_0x0073
            com.google.android.apps.search.assistant.surfaces.voice.i.c.b r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c.C127940b) r7
            goto L_0x0073
        L_0x0072:
            r7 = r3
        L_0x0073:
            if (r7 != r0) goto L_0x0076
            return r0
        L_0x0076:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9562n.C127243b.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127243b(this.f350382b, this.f350383c, gVar);
    }
}
