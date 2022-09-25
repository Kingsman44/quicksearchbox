package com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10208b;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.b.b.b */
/* compiled from: PG */
public final class C134491b {

    /* renamed from: a */
    private final Context f366268a;

    /* renamed from: b */
    private final C46128f f366269b;

    /* renamed from: c */
    private final AccountId f366270c;

    /* renamed from: d */
    private final List f366271d = C69540x.m100947e("com.netflix.mediaclient", "com.amazon.avod.thirdpartyclient", "com.disney.disneyplus", "com.google.android.youtube", "com.google.android.videos", "com.hulu.plus");

    public C134491b(Context context, C46128f fVar, AccountId accountId) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(fVar, "gcoreAccountName");
        C69664n.m101061g(accountId, "accountId");
        this.f366268a = context;
        this.f366269b = fVar;
        this.f366270c = accountId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111800a(p5462h.p5466c.C69577g r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10208b.C134490a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.apps.search.googleapp.discover.p.b.b.a r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10208b.C134490a) r0
            int r1 = r0.f366267i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f366267i = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.p.b.b.a r0 = new com.google.android.apps.search.googleapp.discover.p.b.b.a
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f366265g
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f366267i
            r3 = 1
            java.lang.String r4 = "_builder.build()"
            java.lang.String r5 = "builder"
            java.lang.String r6 = "newBuilder()"
            java.lang.String r7 = "value"
            if (r2 == 0) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r1 = r0.f366264f
            java.lang.Object r2 = r0.f366263e
            java.lang.Object r3 = r0.f366262d
            java.lang.Object r8 = r0.f366261c
            java.lang.Object r9 = r0.f366260b
            java.lang.Object r0 = r0.f366259a
            p5462h.C69714l.m101134b(r14)
            goto L_0x013b
        L_0x003c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0044:
            p5462h.C69714l.m101134b(r14)
            com.google.bl.a.i r14 = com.google.p4222bl.p4223a.C56095i.f149440c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.bl.a.h r14 = (com.google.p4222bl.p4223a.C56094h) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r5)
            com.google.bl.a.j r2 = new com.google.bl.a.j
            r2.<init>(r14)
            com.google.protobuf.a.b r14 = new com.google.protobuf.a.b
            com.google.bl.a.h r8 = r2.f149444a
            com.google.protobuf.bv r8 = r8.instance
            com.google.bl.a.i r8 = (com.google.p4222bl.p4223a.C56095i) r8
            com.google.protobuf.cq r8 = r8.f149442a
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r9 = "_builder.getRequestParamList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            r14.<init>(r8)
            com.google.bl.a.u r14 = com.google.p4222bl.p4223a.C56107u.f149458c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.bl.a.t r14 = (com.google.p4222bl.p4223a.C56106t) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r5)
            com.google.bl.a.p r8 = com.google.p4222bl.p4223a.C56102p.f149450b
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.bl.a.o r8 = (com.google.p4222bl.p4223a.C56101o) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r5)
            com.google.protobuf.a.b r9 = new com.google.protobuf.a.b
            com.google.protobuf.bv r10 = r8.instance
            com.google.bl.a.p r10 = (com.google.p4222bl.p4223a.C56102p) r10
            com.google.protobuf.cq r10 = r10.f149452a
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            java.lang.String r11 = "_builder.getAppPackageNameList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            r9.<init>(r10)
            java.util.List r9 = r13.f366271d
            java.lang.String r10 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r10)
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.bl.a.p r10 = (com.google.p4222bl.p4223a.C56102p) r10
            com.google.protobuf.cq r11 = r10.f149452a
            boolean r12 = r11.mo58948c()
            if (r12 != 0) goto L_0x00bc
            com.google.protobuf.cq r11 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r11)
            r10.f149452a = r11
        L_0x00bc:
            com.google.protobuf.cq r10 = r10.f149452a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r9, (java.util.List) r10)
            com.google.protobuf.bv r8 = r8.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r4)
            com.google.bl.a.p r8 = (com.google.p4222bl.p4223a.C56102p) r8
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r7)
            r14.copyOnWrite()
            com.google.protobuf.bv r9 = r14.instance
            com.google.bl.a.u r9 = (com.google.p4222bl.p4223a.C56107u) r9
            r8.getClass()
            r9.f149461b = r8
            r8 = 2
            r9.f149460a = r8
            com.google.protobuf.bv r14 = r14.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r4)
            com.google.bl.a.u r14 = (com.google.p4222bl.p4223a.C56107u) r14
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r7)
            com.google.bl.a.h r8 = r2.f149444a
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.bl.a.i r8 = (com.google.p4222bl.p4223a.C56095i) r8
            r14.getClass()
            com.google.protobuf.cq r9 = r8.f149442a
            boolean r10 = r9.mo58948c()
            if (r10 != 0) goto L_0x0102
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r8.f149442a = r9
        L_0x0102:
            com.google.protobuf.cq r8 = r8.f149442a
            r8.add(r14)
            com.google.bl.a.r r14 = com.google.p4222bl.p4223a.C56104r.f149453c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.bl.a.q r14 = (com.google.p4222bl.p4223a.C56103q) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r5)
            com.google.bl.a.s r8 = new com.google.bl.a.s
            r8.<init>(r14)
            com.google.apps.tiktok.account.data.a.f r14 = r13.f366269b
            com.google.apps.tiktok.account.AccountId r9 = r13.f366270c
            com.google.common.util.concurrent.cx r14 = r14.mo50214a(r9)
            r0.f366259a = r13
            r0.f366260b = r2
            r0.f366261c = r8
            r0.f366262d = r8
            r0.f366263e = r8
            r0.f366264f = r2
            r0.f366267i = r3
            java.lang.Object r14 = kotlinx.coroutines.p5578d.C71663i.m104690c(r14, r0)
            if (r14 == r1) goto L_0x01f6
            r0 = r13
            r1 = r2
            r9 = r1
            r2 = r8
            r3 = r2
        L_0x013b:
            android.accounts.Account r14 = (android.accounts.Account) r14
            java.lang.String r14 = r14.name
            java.lang.String r10 = "gcoreAccountName.getAndr…t(accountId).await().name"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r7)
            com.google.bl.a.s r2 = (com.google.p4222bl.p4223a.C56105s) r2
            com.google.bl.a.q r2 = r2.f149457a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.bl.a.r r2 = (com.google.p4222bl.p4223a.C56104r) r2
            com.google.bl.a.r r10 = com.google.p4222bl.p4223a.C56104r.f149453c
            r14.getClass()
            r2.f149455a = r14
            com.google.bl.a.a.l r14 = com.google.p4222bl.p4223a.p4224a.C56073l.f149405c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.bl.a.a.k r14 = (com.google.p4222bl.p4223a.p4224a.C56072k) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r5)
            com.google.android.apps.search.googleapp.discover.p.b.b.b r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10208b.C134491b) r0
            android.content.Context r2 = r0.f366268a
            java.lang.String r5 = "context"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            java.util.Locale r2 = com.google.android.apps.search.googleapp.discover.p10238u.C135017cs.m218946a(r2)
            java.lang.String r2 = r2.getLanguage()
            java.lang.String r5 = "getLocale(context).language"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r7)
            r14.copyOnWrite()
            com.google.protobuf.bv r5 = r14.instance
            com.google.bl.a.a.l r5 = (com.google.p4222bl.p4223a.p4224a.C56073l) r5
            r2.getClass()
            r5.f149407a = r2
            android.content.Context r0 = r0.f366268a
            java.util.Locale r0 = com.google.android.apps.search.googleapp.discover.p10238u.C135017cs.m218946a(r0)
            java.lang.String r0 = r0.getCountry()
            java.lang.String r2 = "LanguageTagUtils.getLocale(context).country"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.bl.a.a.l r2 = (com.google.p4222bl.p4223a.p4224a.C56073l) r2
            r0.getClass()
            r2.f149408b = r0
            com.google.protobuf.bv r14 = r14.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r4)
            com.google.bl.a.a.l r14 = (com.google.p4222bl.p4223a.p4224a.C56073l) r14
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r7)
            com.google.bl.a.s r3 = (com.google.p4222bl.p4223a.C56105s) r3
            com.google.bl.a.q r0 = r3.f149457a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.bl.a.r r0 = (com.google.p4222bl.p4223a.C56104r) r0
            r14.getClass()
            r0.f149456b = r14
            com.google.bl.a.s r8 = (com.google.p4222bl.p4223a.C56105s) r8
            com.google.bl.a.q r14 = r8.f149457a
            com.google.protobuf.bv r14 = r14.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r4)
            com.google.bl.a.r r14 = (com.google.p4222bl.p4223a.C56104r) r14
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r7)
            com.google.bl.a.j r1 = (com.google.p4222bl.p4223a.C56096j) r1
            com.google.bl.a.h r0 = r1.f149444a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.bl.a.i r0 = (com.google.p4222bl.p4223a.C56095i) r0
            com.google.bl.a.i r1 = com.google.p4222bl.p4223a.C56095i.f149440c
            r14.getClass()
            r0.f149443b = r14
            com.google.bl.a.j r9 = (com.google.p4222bl.p4223a.C56096j) r9
            com.google.bl.a.h r14 = r9.f149444a
            com.google.protobuf.bv r14 = r14.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r4)
            com.google.bl.a.i r14 = (com.google.p4222bl.p4223a.C56095i) r14
            return r14
        L_0x01f6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10208b.C134491b.mo111800a(h.c.g):java.lang.Object");
    }
}
