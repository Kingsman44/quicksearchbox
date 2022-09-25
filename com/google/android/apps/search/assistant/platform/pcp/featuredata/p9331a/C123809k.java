package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9331a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.api.C123604t;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abe;
import com.google.assistant.p3897e.p3921j.abu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4537i.C59291p;
import com.google.common.p4537i.C59294s;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.a.k */
/* compiled from: PG */
public final class C123809k {

    /* renamed from: a */
    public final Context f342017a;

    /* renamed from: b */
    public final Executor f342018b;

    /* renamed from: c */
    public final C60888db f342019c;

    /* renamed from: d */
    public final boolean f342020d;

    /* renamed from: e */
    public final boolean f342021e;

    /* renamed from: f */
    public final boolean f342022f;

    /* renamed from: g */
    public final boolean f342023g;

    /* renamed from: h */
    public final long f342024h;

    /* renamed from: i */
    public final boolean f342025i;

    /* renamed from: j */
    public final C62910ar f342026j;

    /* renamed from: k */
    public final Optional f342027k;

    /* renamed from: l */
    public final C123604t f342028l;

    /* renamed from: m */
    public final C58974d f342029m;

    /* renamed from: n */
    public final C130895ag f342030n;

    /* renamed from: o */
    public final C60950i f342031o;

    /* renamed from: p */
    private final C124100bz f342032p;

    public C123809k(Context context, Executor executor, C60888db dbVar, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, C62910ar arVar, C124100bz bzVar, Optional optional, C123604t tVar, C130603a aVar, C130895ag agVar, C60950i iVar) {
        this.f342017a = context;
        this.f342018b = executor;
        this.f342019c = dbVar;
        this.f342020d = z;
        this.f342021e = z2;
        this.f342022f = z3;
        this.f342023g = z4;
        this.f342024h = j;
        this.f342025i = z5;
        this.f342026j = arVar;
        this.f342032p = bzVar;
        this.f342027k = optional;
        this.f342028l = tVar;
        this.f342029m = aVar.mo109740b(this);
        this.f342030n = agVar;
        this.f342031o = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo106133a(C123789r rVar, AccountId accountId, aas aas) {
        Optional optional;
        Object obj;
        Object obj2;
        C123789r rVar2 = rVar;
        aas aas2 = aas;
        C62940bt r2 = C62942bv.checkIsLite(abu.f134764l);
        aas2.mo58887l(r2);
        if (!aas2.f169962ag.mo58857o(r2.f169971d)) {
            ((C58970a) ((C58970a) this.f342029m.mo56224b()).mo56372aa(35262)).mo56386p("NotificationArgs has no SmartSpaceNotificationArgs.");
            optional = Optional.empty();
        } else {
            C62940bt r22 = C62942bv.checkIsLite(abu.f134764l);
            aas2.mo58887l(r22);
            Object l = aas2.f169962ag.mo58854l(r22.f169971d);
            if (l == null) {
                obj = r22.f169969b;
            } else {
                obj = r22.mo58889c(l);
            }
            if ((((abu) obj).f134766a & 512) != 0) {
                C62940bt r23 = C62942bv.checkIsLite(abu.f134764l);
                aas2.mo58887l(r23);
                Object l2 = aas2.f169962ag.mo58854l(r23.f169971d);
                if (l2 == null) {
                    obj2 = r23.f169969b;
                } else {
                    obj2 = r23.mo58889c(l2);
                }
                abe a = abe.m86274a(((abu) obj2).f134775j);
                if (a == null) {
                    a = abe.UNSPECIFIED;
                }
                optional = Optional.m71637of(a);
            } else {
                ((C58970a) ((C58970a) this.f342029m.mo56224b()).mo56372aa(35261)).mo56386p("SmartSpaceNotificationArgs has no ActionType.");
                optional = Optional.empty();
            }
        }
        if (!optional.isPresent()) {
            ((C58970a) ((C58970a) this.f342029m.mo56224b()).mo56372aa(35260)).mo56386p("Missing action type.");
            return C60866ct.f164955a;
        }
        abe abe = (abe) optional.get();
        ((C58970a) ((C58970a) this.f342029m.mo56224b()).mo56372aa(35259)).mo56389s("Flight landing data has action type %s", abe.name());
        ArrayList arrayList = new ArrayList();
        C123623b a2 = C123624c.m202992a(this.f342017a, accountId);
        String str = aas2.f134670h;
        long epochMilli = this.f342031o.mo57444a().toEpochMilli();
        C59291p e = C59294s.m92133c().mo56748e();
        e.mo56746g(C63088z.m96143E(rVar2.f341966b).mo59174N());
        e.mo56746g(C63088z.m96143E(rVar2.f341967c).mo59174N());
        arrayList.add(a2.f341550b.mo45938b(new C123803e(C123611ad.m202943b(100010, str, rVar, e.mo56758p().mo56775e(), new byte[0], epochMilli), abe, str, epochMilli)));
        this.f342032p.mo106284c(100010);
        this.f342032p.mo106283b(100010, 39);
        return C47638k.m84752c(arrayList).mo51520a(C47810es.m84978r(C123804f.f342005a), C60826bg.f164896a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo106134b(com.google.assistant.p3897e.p3921j.aas r8) {
        /*
            r7 = this;
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r8.mo58887l(r0)
            com.google.protobuf.bf r1 = r8.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 != 0) goto L_0x0026
            com.google.common.f.a.d r8 = r7.f342029m
            com.google.common.f.x r8 = r8.mo56224b()
            java.lang.String r0 = "NotificationArgs has no OpaChatNotificationArgs."
            r1 = 35266(0x89c2, float:4.9418E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            return r8
        L_0x0026:
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r8.mo58887l(r0)
            com.google.protobuf.bf r1 = r8.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x003c
            java.lang.Object r0 = r0.f169969b
            goto L_0x0040
        L_0x003c:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x0040:
            com.google.assistant.e.j.abc r0 = (com.google.assistant.p3897e.p3921j.abc) r0
            int r0 = r0.f134694a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x025c
            com.google.android.apps.search.assistant.platform.pcp.f.r r0 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r.f341963n
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.platform.pcp.f.q r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123788q) r0
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r8.mo58887l(r1)
            com.google.protobuf.bf r2 = r8.f169962ag
            com.google.protobuf.bs r3 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x0066
            java.lang.Object r1 = r1.f169969b
            goto L_0x006a
        L_0x0066:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x006a:
            com.google.assistant.e.j.abc r1 = (com.google.assistant.p3897e.p3921j.abc) r1
            com.google.aq.a.a.u r1 = r1.f134698e
            if (r1 != 0) goto L_0x0072
            com.google.aq.a.a.u r1 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0072:
            int r2 = r1.f123978a
            r3 = 1
            if (r2 != r3) goto L_0x0249
            java.lang.Object r2 = r1.f123979b
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0083
            goto L_0x0249
        L_0x0083:
            int r2 = r1.f123978a
            java.lang.String r4 = ""
            if (r2 != r3) goto L_0x008e
            java.lang.Object r2 = r1.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x008f
        L_0x008e:
            r2 = r4
        L_0x008f:
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r5
            r2.getClass()
            int r6 = r5.f341965a
            r6 = r6 | r3
            r5.f341965a = r6
            r5.f341966b = r2
            int r2 = r1.f123980c
            r5 = 7
            if (r2 != r5) goto L_0x00ca
            java.lang.Object r2 = r1.f123981d
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00ca
            int r2 = r1.f123980c
            if (r2 != r5) goto L_0x00b8
            java.lang.Object r1 = r1.f123981d
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
        L_0x00b8:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r1 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r1
            r4.getClass()
            int r2 = r1.f341965a
            r2 = r2 | 2
            r1.f341965a = r2
            r1.f341967c = r4
        L_0x00ca:
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r8.mo58887l(r1)
            com.google.protobuf.bf r2 = r8.f169962ag
            com.google.protobuf.bs r1 = r1.f169971d
            boolean r1 = r2.mo58857o(r1)
            if (r1 == 0) goto L_0x023e
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r8.mo58887l(r1)
            com.google.protobuf.bf r2 = r8.f169962ag
            com.google.protobuf.bs r4 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r4)
            if (r2 != 0) goto L_0x00f3
            java.lang.Object r1 = r1.f169969b
            goto L_0x00f7
        L_0x00f3:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x00f7:
            com.google.assistant.e.j.abu r1 = (com.google.assistant.p3897e.p3921j.abu) r1
            int r1 = r1.f134766a
            r1 = r1 & 64
            if (r1 == 0) goto L_0x023e
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r8.mo58887l(r1)
            com.google.protobuf.bf r8 = r8.f169962ag
            com.google.protobuf.bs r2 = r1.f169971d
            java.lang.Object r8 = r8.mo58854l(r2)
            if (r8 != 0) goto L_0x0115
            java.lang.Object r8 = r1.f169969b
            goto L_0x0119
        L_0x0115:
            java.lang.Object r8 = r1.mo58889c(r8)
        L_0x0119:
            com.google.assistant.e.j.abu r8 = (com.google.assistant.p3897e.p3921j.abu) r8
            com.google.assistant.e.j.abj r8 = r8.f134772g
            if (r8 != 0) goto L_0x0121
            com.google.assistant.e.j.abj r8 = com.google.assistant.p3897e.p3921j.abj.f134724i
        L_0x0121:
            long r1 = r8.f134728c
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r4
            int r5 = r4.f341965a
            r5 = r5 | 4
            r4.f341965a = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r5
            r4.f341968d = r1
            boolean r1 = r8.f134729d
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r2
            int r4 = r2.f341965a
            r4 = r4 | 64
            r2.f341965a = r4
            r2.f341972h = r1
            double r1 = r8.f134726a
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r4
            int r5 = r4.f341965a
            r5 = r5 | 16
            r4.f341965a = r5
            r4.f341970f = r1
            double r1 = r8.f134727b
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r4
            int r5 = r4.f341965a
            r5 = r5 | 32
            r4.f341965a = r5
            r4.f341971g = r1
            java.lang.String r1 = r8.f134730e
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r2
            r1.getClass()
            int r4 = r2.f341965a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r2.f341965a = r4
            r2.f341973i = r1
            java.lang.String r1 = r8.f134731f
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r2
            r1.getClass()
            int r4 = r2.f341965a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r2.f341965a = r4
            r2.f341974j = r1
            java.lang.String r1 = r8.f134732g
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r2
            r1.getClass()
            int r4 = r2.f341965a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r2.f341965a = r4
            r2.f341975k = r1
            com.google.protobuf.bt r1 = com.google.assistant.p3803ag.p3804a.p3806b.C48833n.f126352m
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r8.mo58887l(r1)
            com.google.protobuf.bf r2 = r8.f169962ag
            com.google.protobuf.bs r4 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r4)
            if (r2 != 0) goto L_0x01bb
            java.lang.Object r1 = r1.f169969b
            goto L_0x01bf
        L_0x01bb:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x01bf:
            com.google.assistant.ag.a.b.n r1 = (com.google.assistant.p3803ag.p3804a.p3806b.C48833n) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r2
            r1.getClass()
            r2.f341969e = r1
            int r1 = r2.f341965a
            r1 = r1 | 8
            r2.f341965a = r1
            com.google.protobuf.cq r1 = r8.f134733h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x023e
            com.google.protobuf.cq r1 = r8.f134733h
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x023e
            com.google.protobuf.cq r1 = r8.f134733h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r4
            r1.getClass()
            int r5 = r4.f341965a
            r5 = r5 | 2048(0x800, float:2.87E-42)
            r4.f341965a = r5
            r4.f341977m = r1
            android.content.Context r1 = r7.f342017a
            boolean r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124118d.m203544a(r1)
            if (r1 == 0) goto L_0x023e
            com.google.common.f.a.d r1 = r7.f342029m
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r4 = "Have Gmail tap target for flight landing event."
            r5 = 35264(0x89c0, float:4.9415E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r5)).mo56386p(r4)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.google.protobuf.cq r8 = r8.f134733h
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            r1[r2] = r8
            java.lang.String r8 = "intent:#Intent;action=com.google.android.gm.intent.VIEW_PLID;package=com.google.android.gm;S.plid=%s;end"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.r r1 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r1
            r8.getClass()
            int r2 = r1.f341965a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r1.f341965a = r2
            r1.f341976l = r8
        L_0x023e:
            com.google.protobuf.bv r8 = r0.build()
            com.google.android.apps.search.assistant.platform.pcp.f.r r8 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r8
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
            return r8
        L_0x0249:
            com.google.common.f.a.d r8 = r7.f342029m
            com.google.common.f.x r8 = r8.mo56224b()
            java.lang.String r0 = "notification has no title."
            r1 = 35263(0x89bf, float:4.9414E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            return r8
        L_0x025c:
            com.google.common.f.a.d r8 = r7.f342029m
            com.google.common.f.x r8 = r8.mo56224b()
            java.lang.String r0 = "OpaChatNotificationArgs has no Notification."
            r1 = 35265(0x89c1, float:4.9417E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.p9331a.C123809k.mo106134b(com.google.assistant.e.j.aas):j$.util.Optional");
    }
}
