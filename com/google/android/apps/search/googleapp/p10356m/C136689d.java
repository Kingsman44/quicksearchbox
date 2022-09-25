package com.google.android.apps.search.googleapp.p10356m;

import com.google.protos.p5129p.p5131b.C65813cq;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.geller.GoogleAppSyncContextGenerator$generateSyncContext$1", mo61344c = "GoogleAppSyncContextGenerator.kt", mo61345d = "invokeSuspend", mo61346e = {47, 48, 50, 53})
/* renamed from: com.google.android.apps.search.googleapp.m.d */
/* compiled from: PG */
final class C136689d extends C69572j implements C69630p {

    /* renamed from: a */
    Object f372068a;

    /* renamed from: b */
    Object f372069b;

    /* renamed from: c */
    Object f372070c;

    /* renamed from: d */
    int f372071d;

    /* renamed from: e */
    final /* synthetic */ C136687c f372072e;

    /* renamed from: f */
    final /* synthetic */ String f372073f;

    /* renamed from: g */
    final /* synthetic */ C65813cq f372074g;

    /* renamed from: h */
    final /* synthetic */ Iterable f372075h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136689d(C136687c cVar, String str, C65813cq cqVar, Iterable iterable, C69577g gVar) {
        super(2, gVar);
        this.f372072e = cVar;
        this.f372073f = str;
        this.f372074g = cqVar;
        this.f372075h = iterable;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136689d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r10 != r0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        if (r10 != r0) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0101  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f372071d
            java.lang.String r2 = "value"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 == r5) goto L_0x002e
            if (r1 == r4) goto L_0x0026
            if (r1 == r3) goto L_0x001e
            java.lang.Object r0 = r9.f372070c
            java.lang.Object r1 = r9.f372069b
            java.lang.Object r3 = r9.f372068a
            com.google.protos.p.b.cm r3 = (com.google.protos.p5129p.p5131b.C65809cm) r3
            p5462h.C69714l.m101134b(r10)
            goto L_0x00df
        L_0x001e:
            java.lang.Object r1 = r9.f372068a
            com.google.apps.tiktok.account.AccountId r1 = (com.google.apps.tiktok.account.AccountId) r1
            p5462h.C69714l.m101134b(r10)
            goto L_0x0082
        L_0x0026:
            java.lang.Object r1 = r9.f372068a
            com.google.apps.tiktok.account.AccountId r1 = (com.google.apps.tiktok.account.AccountId) r1
            p5462h.C69714l.m101134b(r10)
            goto L_0x0063
        L_0x002e:
            p5462h.C69714l.m101134b(r10)
            goto L_0x0047
        L_0x0032:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.googleapp.m.c r10 = r9.f372072e
            com.google.apps.tiktok.account.data.a.f r10 = r10.f372065c
            java.lang.String r1 = r9.f372073f
            com.google.common.util.concurrent.cx r10 = r10.mo50216c(r1)
            r9.f372071d = r5
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r9)
            if (r10 == r0) goto L_0x0109
        L_0x0047:
            com.google.apps.tiktok.account.AccountId r10 = (com.google.apps.tiktok.account.AccountId) r10
            com.google.android.apps.search.googleapp.m.c r1 = r9.f372072e
            com.google.apps.tiktok.account.data.b r1 = r1.f372066d
            com.google.common.util.concurrent.cx r1 = r1.mo50250g(r10)
            java.lang.String r5 = "accountDataService.isEnabled(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)
            r9.f372068a = r10
            r9.f372071d = r4
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r9)
            if (r1 == r0) goto L_0x0109
            r8 = r1
            r1 = r10
            r10 = r8
        L_0x0063:
            java.lang.String r4 = "accountDataService.isEnabled(accountId).await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0101
            com.google.android.apps.search.googleapp.m.c r10 = r9.f372072e
            com.google.android.libraries.search.i.d r10 = r10.f372064b
            com.google.common.util.concurrent.cx r10 = r10.mo41421a(r1)
            r9.f372068a = r1
            r9.f372071d = r3
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r9)
            if (r10 == r0) goto L_0x0100
        L_0x0082:
            com.google.protos.p.b.cl r10 = (com.google.protos.p5129p.p5131b.C65808cl) r10
            java.lang.String r3 = "baseContext"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r3)
            com.google.protos.p.b.cq r3 = r9.f372074g
            com.google.android.apps.search.googleapp.m.c r4 = r9.f372072e
            java.lang.Iterable r5 = r9.f372075h
            com.google.protobuf.bn r10 = r10.toBuilder()
            java.lang.String r6 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r6)
            com.google.protos.p.b.ck r10 = (com.google.protos.p5129p.p5131b.C65807ck) r10
            java.lang.String r6 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r6)
            com.google.protos.p.b.cm r6 = new com.google.protos.p.b.cm
            r6.<init>(r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r2)
            com.google.protos.p.b.ck r10 = r6.f178904a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.protos.p.b.cl r10 = (com.google.protos.p5129p.p5131b.C65808cl) r10
            int r3 = r3.f178923h
            r10.f178900b = r3
            int r3 = r10.f178899a
            r3 = r3 | 16
            r10.f178899a = r3
            com.google.protobuf.bt r10 = com.google.protos.p5129p.p5131b.C65830dg.f178958c
            java.lang.String r3 = "syncContextExtension"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r3)
            java.lang.String r3 = "accountId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            r9.f372068a = r6
            r9.f372069b = r6
            r9.f372070c = r10
            r3 = 4
            r9.f372071d = r3
            com.google.android.apps.search.googleapp.m.g r3 = new com.google.android.apps.search.googleapp.m.g
            r7 = 0
            r3.<init>(r4, r1, r5, r7)
            java.lang.Object r1 = kotlinx.coroutines.C71423ax.m104196a(r3, r9)
            if (r1 == r0) goto L_0x0100
            r0 = r10
            r10 = r1
            r1 = r6
            r3 = r1
        L_0x00df:
            com.google.protobuf.MessageLite r10 = (com.google.protobuf.MessageLite) r10
            java.lang.String r4 = "extension"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r2)
            com.google.protos.p.b.cm r1 = (com.google.protos.p5129p.p5131b.C65809cm) r1
            com.google.protos.p.b.ck r1 = r1.f178904a
            com.google.protobuf.ay r0 = (com.google.protobuf.C62917ay) r0
            r1.mo58885m(r0, r10)
            com.google.protos.p.b.ck r10 = r3.f178904a
            com.google.protobuf.bv r10 = r10.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            com.google.protos.p.b.cl r10 = (com.google.protos.p5129p.p5131b.C65808cl) r10
            return r10
        L_0x0100:
            return r0
        L_0x0101:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Account is not enabled"
            r10.<init>(r0)
            throw r10
        L_0x0109:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10356m.C136689d.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C136689d(this.f372072e, this.f372073f, this.f372074g, this.f372075h, gVar);
    }
}
