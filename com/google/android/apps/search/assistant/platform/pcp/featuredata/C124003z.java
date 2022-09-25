package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.api.C123604t;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9331a.C123809k;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9332b.C123824c;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d.C123905w;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3809c.C48951ay;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48971br;
import com.google.assistant.p3803ag.p3809c.C49005cy;
import com.google.assistant.p3803ag.p3809c.C49017dj;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abe;
import com.google.assistant.p3897e.p3921j.abu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4537i.C59291p;
import com.google.common.p4537i.C59294s;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.z */
/* compiled from: PG */
public final class C124003z implements C123810aa {

    /* renamed from: a */
    public final boolean f342495a;

    /* renamed from: b */
    public final Optional f342496b;

    /* renamed from: c */
    public final C58974d f342497c;

    /* renamed from: d */
    public final C123604t f342498d;

    /* renamed from: e */
    public final C130895ag f342499e;

    /* renamed from: f */
    private final Context f342500f;

    /* renamed from: g */
    private final Executor f342501g;

    /* renamed from: h */
    private final C124100bz f342502h;

    /* renamed from: i */
    private final boolean f342503i;

    /* renamed from: j */
    private final boolean f342504j;

    /* renamed from: k */
    private final boolean f342505k;

    /* renamed from: l */
    private final long f342506l;

    /* renamed from: m */
    private final long f342507m;

    /* renamed from: n */
    private final long f342508n;

    /* renamed from: o */
    private final long f342509o;

    /* renamed from: p */
    private final C60950i f342510p;

    /* renamed from: q */
    private final C123905w f342511q;

    /* renamed from: r */
    private final C123809k f342512r;

    /* renamed from: s */
    private final C123824c f342513s;

    public C124003z(Context context, Executor executor, C124100bz bzVar, Optional optional, C60950i iVar, boolean z, boolean z2, boolean z3, long j, long j2, long j3, long j4, boolean z4, C123604t tVar, C130603a aVar, C130895ag agVar, C123905w wVar, C123809k kVar, C123824c cVar) {
        this.f342500f = context;
        this.f342501g = executor;
        this.f342502h = bzVar;
        this.f342496b = optional;
        this.f342510p = iVar;
        this.f342503i = z;
        this.f342495a = z2;
        this.f342504j = z3;
        this.f342506l = j;
        this.f342507m = j2;
        this.f342508n = j3;
        this.f342509o = j4;
        this.f342505k = z4;
        this.f342497c = aVar.mo109740b(this);
        this.f342498d = tVar;
        this.f342499e = agVar;
        this.f342511q = wVar;
        this.f342512r = kVar;
        this.f342513s = cVar;
    }

    /* renamed from: c */
    private static long m203371c(abu abu) {
        C48951ay ayVar;
        C48971br brVar;
        C48971br brVar2;
        C49017dj djVar;
        C49005cy cyVar;
        if ((abu.f134766a & 1) == 0) {
            return 0;
        }
        C48952az azVar = abu.f134767b;
        if (azVar == null) {
            azVar = C48952az.f126657c;
        }
        if (azVar.f126659a == 2) {
            ayVar = (C48951ay) azVar.f126660b;
        } else {
            ayVar = C48951ay.f126654b;
        }
        for (C48952az azVar2 : ayVar.f126656a) {
            if (azVar2.f126659a == 1) {
                brVar = (C48971br) azVar2.f126660b;
            } else {
                brVar = C48971br.f126689d;
            }
            if (brVar.f126691a == 2) {
                if (azVar2.f126659a == 1) {
                    brVar2 = (C48971br) azVar2.f126660b;
                } else {
                    brVar2 = C48971br.f126689d;
                }
                if (brVar2.f126691a == 2) {
                    djVar = (C49017dj) brVar2.f126692b;
                } else {
                    djVar = C49017dj.f126788c;
                }
                if (djVar.f126790a == 1) {
                    cyVar = (C49005cy) djVar.f126791b;
                } else {
                    cyVar = C49005cy.f126761d;
                }
                return cyVar.f126765c;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h m203372d(com.google.assistant.p3897e.p3921j.aas r9) {
        /*
            r8 = this;
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r9.mo58887l(r0)
            com.google.protobuf.bf r1 = r9.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x0016
            java.lang.Object r0 = r0.f169969b
            goto L_0x001a
        L_0x0016:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x001a:
            com.google.assistant.e.j.abc r0 = (com.google.assistant.p3897e.p3921j.abc) r0
            com.google.android.apps.search.assistant.platform.pcp.f.h r1 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h.f341925m
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.assistant.platform.pcp.f.g r1 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123778g) r1
            long r2 = r9.f134666d
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r4
            int r5 = r4.f341927a
            r5 = r5 | 2
            r4.f341927a = r5
            r4.f341929c = r2
            int r2 = r0.f134694a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x019e
            com.google.aq.a.a.u r2 = r0.f134698e
            if (r2 != 0) goto L_0x0041
            com.google.aq.a.a.u r2 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0041:
            int r3 = r2.f123982e
            r4 = 8
            java.lang.String r5 = ""
            if (r3 != r4) goto L_0x004e
            java.lang.Object r2 = r2.f123983f
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x004f
        L_0x004e:
            r2 = r5
        L_0x004f:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r3
            r2.getClass()
            int r6 = r3.f341927a
            r7 = 1
            r6 = r6 | r7
            r3.f341927a = r6
            r3.f341928b = r2
            com.google.aq.a.a.u r2 = r0.f134698e
            if (r2 != 0) goto L_0x0067
            com.google.aq.a.a.u r2 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0067:
            int r3 = r2.f123978a
            if (r3 != r7) goto L_0x0070
            java.lang.Object r2 = r2.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0071
        L_0x0070:
            r2 = r5
        L_0x0071:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r3
            r2.getClass()
            int r6 = r3.f341927a
            r7 = 4
            r6 = r6 | r7
            r3.f341927a = r6
            r3.f341930d = r2
            com.google.aq.a.a.u r2 = r0.f134698e
            if (r2 != 0) goto L_0x0089
            com.google.aq.a.a.u r2 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0089:
            int r3 = r2.f123980c
            r6 = 7
            if (r3 != r6) goto L_0x0093
            java.lang.Object r2 = r2.f123981d
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
        L_0x0093:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r2
            r5.getClass()
            int r3 = r2.f341927a
            r3 = r3 | r4
            r2.f341927a = r3
            r2.f341931e = r5
            java.lang.String r2 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j.m203547a(r9)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x00d0
            com.google.common.f.a.d r0 = r8.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r3 = "#getCommuteTimeData() Commute with Smartspace action URL."
            r4 = 35207(0x8987, float:4.9336E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r4)).mo56386p(r3)
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r0
            r2.getClass()
            int r3 = r0.f341927a
            r3 = r3 | 16
            r0.f341927a = r3
            r0.f341932f = r2
            goto L_0x019e
        L_0x00d0:
            com.google.aq.a.a.u r2 = r0.f134698e
            if (r2 != 0) goto L_0x00d7
            com.google.aq.a.a.u r3 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
            goto L_0x00d8
        L_0x00d7:
            r3 = r2
        L_0x00d8:
            com.google.aq.a.a.b r3 = r3.f123984g
            if (r3 == 0) goto L_0x0125
            if (r2 != 0) goto L_0x00e0
            com.google.aq.a.a.u r2 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x00e0:
            com.google.aq.a.a.b r2 = r2.f123984g
            if (r2 != 0) goto L_0x00e6
            com.google.aq.a.a.b r2 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x00e6:
            com.google.protobuf.cq r2 = r2.f123940c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0125
            com.google.common.f.a.d r2 = r8.f342497c
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "#getCommuteTimeData() Commute with notification action URL."
            r4 = 35206(0x8986, float:4.9334E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.aq.a.a.u r0 = r0.f134698e
            if (r0 != 0) goto L_0x0102
            com.google.aq.a.a.u r0 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0102:
            com.google.aq.a.a.b r0 = r0.f123984g
            if (r0 != 0) goto L_0x0108
            com.google.aq.a.a.b r0 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0108:
            com.google.protobuf.cq r0 = r0.f123940c
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r2
            r0.getClass()
            int r3 = r2.f341927a
            r3 = r3 | 16
            r2.f341927a = r3
            r2.f341932f = r0
            goto L_0x019e
        L_0x0125:
            com.google.aq.a.a.u r2 = r0.f134698e
            if (r2 != 0) goto L_0x012b
            com.google.aq.a.a.u r2 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x012b:
            com.google.aq.a.a.b r2 = r2.f123984g
            if (r2 != 0) goto L_0x0131
            com.google.aq.a.a.b r2 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0131:
            int r2 = r2.f123938a
            if (r2 != r7) goto L_0x0190
            com.google.common.f.a.d r2 = r8.f342497c
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r3 = 35205(0x8985, float:4.9333E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            com.google.aq.a.a.u r3 = r0.f134698e
            if (r3 != 0) goto L_0x014c
            com.google.aq.a.a.u r3 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x014c:
            com.google.aq.a.a.b r3 = r3.f123984g
            if (r3 != 0) goto L_0x0152
            com.google.aq.a.a.b r3 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0152:
            int r4 = r3.f123938a
            if (r4 != r7) goto L_0x015b
            java.lang.Object r3 = r3.f123939b
            com.google.aq.a.a.t r3 = (com.google.p3717aq.p3718a.p3719a.C47886t) r3
            goto L_0x015d
        L_0x015b:
            com.google.aq.a.a.t r3 = com.google.p3717aq.p3718a.p3719a.C47886t.f123973b
        L_0x015d:
            java.lang.String r4 = "#getCommuteTimeData() Commute with action payload query. %s"
            java.lang.String r3 = r3.f123975a
            r2.mo56389s(r4, r3)
            com.google.aq.a.a.u r0 = r0.f134698e
            if (r0 != 0) goto L_0x016a
            com.google.aq.a.a.u r0 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x016a:
            com.google.aq.a.a.b r0 = r0.f123984g
            if (r0 != 0) goto L_0x0170
            com.google.aq.a.a.b r0 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0170:
            int r2 = r0.f123938a
            if (r2 != r7) goto L_0x0179
            java.lang.Object r0 = r0.f123939b
            com.google.aq.a.a.t r0 = (com.google.p3717aq.p3718a.p3719a.C47886t) r0
            goto L_0x017b
        L_0x0179:
            com.google.aq.a.a.t r0 = com.google.p3717aq.p3718a.p3719a.C47886t.f123973b
        L_0x017b:
            java.lang.String r0 = r0.f123975a
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r2
            r0.getClass()
            int r3 = r2.f341927a
            r3 = r3 | 16
            r2.f341927a = r3
            r2.f341932f = r0
            goto L_0x019e
        L_0x0190:
            com.google.common.f.a.d r0 = r8.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "#getCommuteTimeData() Commute NO action URL."
            r3 = 35204(0x8984, float:4.9331E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
        L_0x019e:
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r9.mo58887l(r0)
            com.google.protobuf.bf r2 = r9.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r2.mo58857o(r0)
            if (r0 == 0) goto L_0x0282
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r9.mo58887l(r0)
            com.google.protobuf.bf r9 = r9.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r9 = r9.mo58854l(r2)
            if (r9 != 0) goto L_0x01c7
            java.lang.Object r9 = r0.f169969b
            goto L_0x01cb
        L_0x01c7:
            java.lang.Object r9 = r0.mo58889c(r9)
        L_0x01cb:
            com.google.assistant.e.j.abu r9 = (com.google.assistant.p3897e.p3921j.abu) r9
            int r0 = r9.f134766a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0269
            com.google.assistant.e.j.abh r0 = r9.f134770e
            if (r0 != 0) goto L_0x01d9
            com.google.assistant.e.j.abh r0 = com.google.assistant.p3897e.p3921j.abh.f134715g
        L_0x01d9:
            java.lang.String r0 = r0.f134717a
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r2
            r0.getClass()
            int r3 = r2.f341927a
            r3 = r3 | 32
            r2.f341927a = r3
            r2.f341933g = r0
            com.google.assistant.e.j.abh r0 = r9.f134770e
            if (r0 != 0) goto L_0x01f3
            com.google.assistant.e.j.abh r0 = com.google.assistant.p3897e.p3921j.abh.f134715g
        L_0x01f3:
            java.lang.String r0 = r0.f134718b
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r2
            r0.getClass()
            int r3 = r2.f341927a
            r3 = r3 | 64
            r2.f341927a = r3
            r2.f341934h = r0
            com.google.assistant.e.j.abh r0 = r9.f134770e
            if (r0 != 0) goto L_0x020d
            com.google.assistant.e.j.abh r0 = com.google.assistant.p3897e.p3921j.abh.f134715g
        L_0x020d:
            java.lang.String r0 = r0.f134719c
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r2
            r0.getClass()
            int r3 = r2.f341927a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r2.f341927a = r3
            r2.f341935i = r0
            com.google.assistant.e.j.abh r0 = r9.f134770e
            if (r0 != 0) goto L_0x0227
            com.google.assistant.e.j.abh r0 = com.google.assistant.p3897e.p3921j.abh.f134715g
        L_0x0227:
            java.lang.String r0 = r0.f134720d
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r2
            r0.getClass()
            int r3 = r2.f341927a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.f341927a = r3
            r2.f341936j = r0
            com.google.assistant.e.j.abh r0 = r9.f134770e
            if (r0 != 0) goto L_0x0241
            com.google.assistant.e.j.abh r0 = com.google.assistant.p3897e.p3921j.abh.f134715g
        L_0x0241:
            double r2 = r0.f134721e
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r0
            int r4 = r0.f341927a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r0.f341927a = r4
            r0.f341937k = r2
            com.google.assistant.e.j.abh r0 = r9.f134770e
            if (r0 != 0) goto L_0x0258
            com.google.assistant.e.j.abh r0 = com.google.assistant.p3897e.p3921j.abh.f134715g
        L_0x0258:
            double r2 = r0.f134722f
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r0
            int r4 = r0.f341927a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r0.f341927a = r4
            r0.f341938l = r2
        L_0x0269:
            long r2 = m203371c(r9)
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0282
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.h r9 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r9
            int r0 = r9.f341927a
            r0 = r0 | 2
            r9.f341927a = r0
            r9.f341929c = r2
        L_0x0282:
            com.google.protobuf.bv r9 = r1.build()
            com.google.android.apps.search.assistant.platform.pcp.f.h r9 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.C124003z.m203372d(com.google.assistant.e.j.aas):com.google.android.apps.search.assistant.platform.pcp.f.h");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx m203373e(com.google.assistant.p3897e.p3921j.aas r9) {
        /*
            r8 = this;
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r9.mo58887l(r0)
            com.google.protobuf.bf r1 = r9.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x0016
            java.lang.Object r0 = r0.f169969b
            goto L_0x001a
        L_0x0016:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x001a:
            com.google.assistant.e.j.abc r0 = (com.google.assistant.p3897e.p3921j.abc) r0
            com.google.android.apps.search.assistant.platform.pcp.f.bx r1 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx.f341854l
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.assistant.platform.pcp.f.bw r1 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123756bw) r1
            long r2 = r9.f134666d
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r4
            int r5 = r4.f341856a
            r5 = r5 | 2
            r4.f341856a = r5
            r4.f341858c = r2
            int r2 = r0.f134694a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0154
            com.google.aq.a.a.u r2 = r0.f134698e
            if (r2 != 0) goto L_0x0041
            com.google.aq.a.a.u r2 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0041:
            int r3 = r2.f123982e
            r4 = 8
            java.lang.String r5 = ""
            if (r3 != r4) goto L_0x004e
            java.lang.Object r2 = r2.f123983f
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x004f
        L_0x004e:
            r2 = r5
        L_0x004f:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r3
            r2.getClass()
            int r6 = r3.f341856a
            r7 = 1
            r6 = r6 | r7
            r3.f341856a = r6
            r3.f341857b = r2
            com.google.aq.a.a.u r2 = r0.f134698e
            if (r2 != 0) goto L_0x0067
            com.google.aq.a.a.u r2 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0067:
            int r3 = r2.f123978a
            if (r3 != r7) goto L_0x0070
            java.lang.Object r2 = r2.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0071
        L_0x0070:
            r2 = r5
        L_0x0071:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r3
            r2.getClass()
            int r6 = r3.f341856a
            r6 = r6 | 4
            r3.f341856a = r6
            r3.f341859d = r2
            com.google.aq.a.a.u r2 = r0.f134698e
            if (r2 != 0) goto L_0x0089
            com.google.aq.a.a.u r2 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0089:
            int r3 = r2.f123980c
            r6 = 7
            if (r3 != r6) goto L_0x0093
            java.lang.Object r2 = r2.f123981d
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
        L_0x0093:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r2
            r5.getClass()
            int r3 = r2.f341856a
            r3 = r3 | r4
            r2.f341856a = r3
            r2.f341860e = r5
            com.google.aq.a.a.u r2 = r0.f134698e
            if (r2 != 0) goto L_0x00aa
            com.google.aq.a.a.u r2 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x00aa:
            int r2 = r2.f123987j
            int r2 = com.google.p3717aq.p3718a.p3719a.C47877k.m85094b(r2)
            if (r2 != 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r7 = r2
        L_0x00b4:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r2
            int r3 = com.google.p3717aq.p3718a.p3719a.C47877k.m85093a(r7)
            r2.f341862g = r3
            int r3 = r2.f341856a
            r3 = r3 | 32
            r2.f341856a = r3
            java.lang.String r2 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j.m203547a(r9)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x00f2
            com.google.common.f.a.d r0 = r8.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r3 = "#getTimeToLeaveData() TTL with Smartspace action URL."
            r4 = 35210(0x898a, float:4.934E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r4)).mo56386p(r3)
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r0
            r2.getClass()
            int r3 = r0.f341856a
            r3 = r3 | 16
            r0.f341856a = r3
            r0.f341861f = r2
            goto L_0x0154
        L_0x00f2:
            com.google.aq.a.a.u r2 = r0.f134698e
            if (r2 != 0) goto L_0x00f9
            com.google.aq.a.a.u r3 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
            goto L_0x00fa
        L_0x00f9:
            r3 = r2
        L_0x00fa:
            com.google.aq.a.a.b r3 = r3.f123984g
            if (r3 == 0) goto L_0x0146
            if (r2 != 0) goto L_0x0102
            com.google.aq.a.a.u r2 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0102:
            com.google.aq.a.a.b r2 = r2.f123984g
            if (r2 != 0) goto L_0x0108
            com.google.aq.a.a.b r2 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0108:
            com.google.protobuf.cq r2 = r2.f123940c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0146
            com.google.common.f.a.d r2 = r8.f342497c
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "#getTimeToLeaveData() TTL with action URL."
            r4 = 35209(0x8989, float:4.9338E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.aq.a.a.u r0 = r0.f134698e
            if (r0 != 0) goto L_0x0124
            com.google.aq.a.a.u r0 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0124:
            com.google.aq.a.a.b r0 = r0.f123984g
            if (r0 != 0) goto L_0x012a
            com.google.aq.a.a.b r0 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x012a:
            com.google.protobuf.cq r0 = r0.f123940c
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r2
            r0.getClass()
            int r3 = r2.f341856a
            r3 = r3 | 16
            r2.f341856a = r3
            r2.f341861f = r0
            goto L_0x0154
        L_0x0146:
            com.google.common.f.a.d r0 = r8.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "#getTimeToLeaveData() TTL NO action URL."
            r3 = 35208(0x8988, float:4.9337E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
        L_0x0154:
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r9.mo58887l(r0)
            com.google.protobuf.bf r2 = r9.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r2.mo58857o(r0)
            if (r0 == 0) goto L_0x0204
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r9.mo58887l(r0)
            com.google.protobuf.bf r9 = r9.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r9 = r9.mo58854l(r2)
            if (r9 != 0) goto L_0x017d
            java.lang.Object r9 = r0.f169969b
            goto L_0x0181
        L_0x017d:
            java.lang.Object r9 = r0.mo58889c(r9)
        L_0x0181:
            com.google.assistant.e.j.abu r9 = (com.google.assistant.p3897e.p3921j.abu) r9
            int r0 = r9.f134766a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01eb
            com.google.assistant.e.j.abt r0 = r9.f134769d
            if (r0 != 0) goto L_0x018f
            com.google.assistant.e.j.abt r0 = com.google.assistant.p3897e.p3921j.abt.f134756e
        L_0x018f:
            long r2 = r0.f134758a
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r0
            int r4 = r0.f341856a
            r4 = r4 | 64
            r0.f341856a = r4
            r0.f341863h = r2
            com.google.assistant.e.j.abt r0 = r9.f134769d
            if (r0 != 0) goto L_0x01a6
            com.google.assistant.e.j.abt r0 = com.google.assistant.p3897e.p3921j.abt.f134756e
        L_0x01a6:
            long r2 = r0.f134761d
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r0
            int r4 = r0.f341856a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r0.f341856a = r4
            r0.f341866k = r2
            com.google.assistant.e.j.abt r0 = r9.f134769d
            if (r0 != 0) goto L_0x01bd
            com.google.assistant.e.j.abt r0 = com.google.assistant.p3897e.p3921j.abt.f134756e
        L_0x01bd:
            java.lang.String r0 = r0.f134759b
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r2
            r0.getClass()
            int r3 = r2.f341856a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r2.f341856a = r3
            r2.f341864i = r0
            com.google.assistant.e.j.abt r0 = r9.f134769d
            if (r0 != 0) goto L_0x01d7
            com.google.assistant.e.j.abt r0 = com.google.assistant.p3897e.p3921j.abt.f134756e
        L_0x01d7:
            java.lang.String r0 = r0.f134760c
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r2
            r0.getClass()
            int r3 = r2.f341856a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.f341856a = r3
            r2.f341865j = r0
        L_0x01eb:
            long r2 = m203371c(r9)
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0204
            r1.copyOnWrite()
            com.google.protobuf.bv r9 = r1.instance
            com.google.android.apps.search.assistant.platform.pcp.f.bx r9 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r9
            int r0 = r9.f341856a
            r0 = r0 | 2
            r9.f341856a = r0
            r9.f341858c = r2
        L_0x0204:
            com.google.protobuf.bv r9 = r1.build()
            com.google.android.apps.search.assistant.platform.pcp.f.bx r9 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.C124003z.m203373e(com.google.assistant.e.j.aas):com.google.android.apps.search.assistant.platform.pcp.f.bx");
    }

    /* renamed from: f */
    private final Optional m203374f(aas aas) {
        Object obj;
        Object obj2;
        C62940bt r0 = C62942bv.checkIsLite(abu.f134764l);
        aas.mo58887l(r0);
        if (!aas.f169962ag.mo58857o(r0.f169971d)) {
            ((C58970a) ((C58970a) this.f342497c.mo56224b()).mo56372aa(35230)).mo56386p("NotificationArgs has no SmartSpaceNotificationArgs.");
            return Optional.empty();
        }
        C62940bt r02 = C62942bv.checkIsLite(abu.f134764l);
        aas.mo58887l(r02);
        Object l = aas.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        if ((((abu) obj).f134766a & 512) != 0) {
            C62940bt r03 = C62942bv.checkIsLite(abu.f134764l);
            aas.mo58887l(r03);
            Object l2 = aas.f169962ag.mo58854l(r03.f169971d);
            if (l2 == null) {
                obj2 = r03.f169969b;
            } else {
                obj2 = r03.mo58889c(l2);
            }
            abe a = abe.m86274a(((abu) obj2).f134775j);
            if (a == null) {
                a = abe.UNSPECIFIED;
            }
            return Optional.m71637of(a);
        }
        ((C58970a) ((C58970a) this.f342497c.mo56224b()).mo56372aa(35229)).mo56386p("SmartSpaceNotificationArgs has no ActionType.");
        return Optional.empty();
    }

    /* renamed from: g */
    private final Optional m203375g(aas aas) {
        Object obj;
        Object obj2;
        C62940bt r0 = C62942bv.checkIsLite(abu.f134764l);
        aas.mo58887l(r0);
        if (!aas.f169962ag.mo58857o(r0.f169971d)) {
            ((C58970a) ((C58970a) this.f342497c.mo56224b()).mo56372aa(35232)).mo56386p("notificationArgs has no smartspaceNotificationArgs");
            return Optional.empty();
        }
        C62940bt r02 = C62942bv.checkIsLite(abu.f134764l);
        aas.mo58887l(r02);
        Object l = aas.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        if ((((abu) obj).f134766a & 1) != 0) {
            C62940bt r03 = C62942bv.checkIsLite(abu.f134764l);
            aas.mo58887l(r03);
            Object l2 = aas.f169962ag.mo58854l(r03.f169971d);
            if (l2 == null) {
                obj2 = r03.f169969b;
            } else {
                obj2 = r03.mo58889c(l2);
            }
            C48952az azVar = ((abu) obj2).f134767b;
            if (azVar == null) {
                azVar = C48952az.f126657c;
            }
            return Optional.m71637of(azVar);
        }
        ((C58970a) ((C58970a) this.f342497c.mo56224b()).mo56372aa(35231)).mo56386p("smartspaceNotificationArgs has no triggering conditions");
        return Optional.empty();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p3186j$.util.Optional m203376h(com.google.assistant.p3897e.p3921j.aas r13) {
        /*
            r12 = this;
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r13.mo58887l(r0)
            com.google.protobuf.bf r1 = r13.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 != 0) goto L_0x0026
            com.google.common.f.a.d r13 = r12.f342497c
            com.google.common.f.x r13 = r13.mo56224b()
            java.lang.String r0 = "NotificationArgs has no OpaChatNotificationArgs."
            r1 = 35236(0x89a4, float:4.9376E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r13).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r13 = p3186j$.util.Optional.empty()
            return r13
        L_0x0026:
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r13.mo58887l(r0)
            com.google.protobuf.bf r1 = r13.f169962ag
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
            if (r0 == 0) goto L_0x020d
            com.google.android.apps.search.assistant.platform.pcp.f.af r0 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af.f341704k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.platform.pcp.f.ae r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123711ae) r0
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r13.mo58887l(r1)
            com.google.protobuf.bf r2 = r13.f169962ag
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
            java.lang.String r3 = ""
            r4 = 1
            if (r2 != r4) goto L_0x007e
            java.lang.Object r2 = r1.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x007f
        L_0x007e:
            r2 = r3
        L_0x007f:
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01fa
            int r2 = r1.f123978a
            if (r2 != r4) goto L_0x008e
            java.lang.Object r2 = r1.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x008f
        L_0x008e:
            r2 = r3
        L_0x008f:
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.af r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r5
            r2.getClass()
            int r6 = r5.f341706a
            r6 = r6 | r4
            r5.f341706a = r6
            r5.f341707b = r2
            int r2 = r1.f123980c
            r5 = 7
            if (r2 != r5) goto L_0x00aa
            java.lang.Object r2 = r1.f123981d
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x00aa:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.af r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r2
            r3.getClass()
            int r5 = r2.f341706a
            r5 = r5 | 2
            r2.f341706a = r5
            r2.f341708c = r3
            com.google.aq.a.a.b r2 = r1.f123984g
            if (r2 != 0) goto L_0x00c2
            com.google.aq.a.a.b r2 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x00c2:
            com.google.protobuf.cq r2 = r2.f123940c
            int r2 = r2.size()
            r3 = 0
            if (r2 <= 0) goto L_0x00eb
            com.google.aq.a.a.b r1 = r1.f123984g
            if (r1 != 0) goto L_0x00d1
            com.google.aq.a.a.b r1 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x00d1:
            com.google.protobuf.cq r1 = r1.f123940c
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.af r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r2
            r1.getClass()
            int r5 = r2.f341706a
            r5 = r5 | 16
            r2.f341706a = r5
            r2.f341710e = r1
        L_0x00eb:
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r13.mo58887l(r1)
            com.google.protobuf.bf r13 = r13.f169962ag
            com.google.protobuf.bs r2 = r1.f169971d
            java.lang.Object r13 = r13.mo58854l(r2)
            if (r13 != 0) goto L_0x0101
            java.lang.Object r13 = r1.f169969b
            goto L_0x0105
        L_0x0101:
            java.lang.Object r13 = r1.mo58889c(r13)
        L_0x0105:
            com.google.assistant.e.j.abu r13 = (com.google.assistant.p3897e.p3921j.abu) r13
            com.google.assistant.e.j.abp r13 = r13.f134773h
            if (r13 != 0) goto L_0x010d
            com.google.assistant.e.j.abp r13 = com.google.assistant.p3897e.p3921j.abp.f134738j
        L_0x010d:
            long r1 = r13.f134742c
            long r5 = r13.f134745f
            com.google.common.v.i r7 = r12.f342510p
            j$.time.Instant r7 = r7.mo57444a()
            long r7 = r7.toEpochMilli()
            r9 = 0
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0122
            goto L_0x012d
        L_0x0122:
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x012a
            long r1 = r12.f342507m
            long r1 = r1 + r5
            goto L_0x012d
        L_0x012a:
            long r1 = r12.f342506l
            long r1 = r1 + r7
        L_0x012d:
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.af r7 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r7
            int r8 = r7.f341706a
            r8 = r8 | 8
            r7.f341706a = r8
            r7.f341709d = r1
            java.lang.String r1 = r13.f134743d
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.af r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r2
            r1.getClass()
            int r7 = r2.f341706a
            r7 = r7 | 512(0x200, float:7.175E-43)
            r2.f341706a = r7
            r2.f341713h = r1
            java.lang.String r1 = r13.f134744e
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.af r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r2
            r1.getClass()
            int r7 = r2.f341706a
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r2.f341706a = r7
            r2.f341714i = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.af r1 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r1
            int r2 = r1.f341706a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f341706a = r2
            r1.f341715j = r5
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r1 = r12.f342499e
            int r2 = r13.f134746g
            int r2 = com.google.assistant.p3897e.p3921j.abm.m86277b(r2)
            if (r2 != 0) goto L_0x017e
            r2 = 1
        L_0x017e:
            java.lang.String r2 = com.google.assistant.p3897e.p3921j.abm.m86276a(r2)
            r1.mo109878N(r2)
            com.google.protobuf.cq r1 = r13.f134740a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01ef
            com.google.protobuf.cq r1 = r13.f134740a
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01ef
            com.google.protobuf.cq r1 = r13.f134740a
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.af r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r2
            r1.getClass()
            int r5 = r2.f341706a
            r5 = r5 | 64
            r2.f341706a = r5
            r2.f341712g = r1
            android.content.Context r1 = r12.f342500f
            boolean r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124118d.m203544a(r1)
            if (r1 == 0) goto L_0x01ef
            com.google.common.f.a.d r1 = r12.f342497c
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "#getHotelCheckInData() Gmail tap target."
            r5 = 35233(0x89a1, float:4.9372E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r5)).mo56386p(r2)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.google.protobuf.cq r13 = r13.f134740a
            java.lang.Object r13 = r13.get(r3)
            java.lang.String r13 = (java.lang.String) r13
            r1[r3] = r13
            java.lang.String r13 = "intent:#Intent;action=com.google.android.gm.intent.VIEW_PLID;package=com.google.android.gm;S.plid=%s;end"
            java.lang.String r13 = java.lang.String.format(r13, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.af r1 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r1
            r13.getClass()
            int r2 = r1.f341706a
            r2 = r2 | 32
            r1.f341706a = r2
            r1.f341711f = r13
        L_0x01ef:
            com.google.protobuf.bv r13 = r0.build()
            com.google.android.apps.search.assistant.platform.pcp.f.af r13 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r13
            j$.util.Optional r13 = p3186j$.util.Optional.m71637of(r13)
            return r13
        L_0x01fa:
            com.google.common.f.a.d r13 = r12.f342497c
            com.google.common.f.x r13 = r13.mo56224b()
            java.lang.String r0 = "notification has no title."
            r1 = 35234(0x89a2, float:4.9373E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r13).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r13 = p3186j$.util.Optional.empty()
            return r13
        L_0x020d:
            com.google.common.f.a.d r13 = r12.f342497c
            com.google.common.f.x r13 = r13.mo56224b()
            java.lang.String r0 = "OpaChatNotificationArgs has no Notification."
            r1 = 35235(0x89a3, float:4.9375E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r13).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r13 = p3186j$.util.Optional.empty()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.C124003z.m203376h(com.google.assistant.e.j.aas):j$.util.Optional");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p3186j$.util.Optional m203377i(com.google.assistant.p3897e.p3921j.aas r13) {
        /*
            r12 = this;
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r13.mo58887l(r0)
            com.google.protobuf.bf r1 = r13.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 != 0) goto L_0x0026
            com.google.common.f.a.d r13 = r12.f342497c
            com.google.common.f.x r13 = r13.mo56224b()
            java.lang.String r0 = "NotificationArgs has no OpaChatNotificationArgs."
            r1 = 35240(0x89a8, float:4.9382E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r13).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r13 = p3186j$.util.Optional.empty()
            return r13
        L_0x0026:
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r13.mo58887l(r0)
            com.google.protobuf.bf r1 = r13.f169962ag
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
            if (r0 == 0) goto L_0x01f9
            com.google.android.apps.search.assistant.platform.pcp.f.ah r0 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah.f341716j
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.platform.pcp.f.ag r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123713ag) r0
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r13.mo58887l(r1)
            com.google.protobuf.bf r2 = r13.f169962ag
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
            java.lang.String r3 = ""
            r4 = 1
            if (r2 != r4) goto L_0x007e
            java.lang.Object r2 = r1.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x007f
        L_0x007e:
            r2 = r3
        L_0x007f:
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01e6
            int r2 = r1.f123978a
            if (r2 != r4) goto L_0x008e
            java.lang.Object r2 = r1.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x008f
        L_0x008e:
            r2 = r3
        L_0x008f:
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.ah r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah) r5
            r2.getClass()
            int r6 = r5.f341718a
            r6 = r6 | r4
            r5.f341718a = r6
            r5.f341719b = r2
            int r2 = r1.f123980c
            r5 = 7
            if (r2 != r5) goto L_0x00aa
            java.lang.Object r2 = r1.f123981d
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x00aa:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.ah r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah) r2
            r3.getClass()
            int r5 = r2.f341718a
            r5 = r5 | 2
            r2.f341718a = r5
            r2.f341720c = r3
            com.google.aq.a.a.b r2 = r1.f123984g
            if (r2 != 0) goto L_0x00c2
            com.google.aq.a.a.b r2 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x00c2:
            com.google.protobuf.cq r2 = r2.f123940c
            int r2 = r2.size()
            r3 = 0
            if (r2 <= 0) goto L_0x00eb
            com.google.aq.a.a.b r1 = r1.f123984g
            if (r1 != 0) goto L_0x00d1
            com.google.aq.a.a.b r1 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x00d1:
            com.google.protobuf.cq r1 = r1.f123940c
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.ah r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah) r2
            r1.getClass()
            int r5 = r2.f341718a
            r5 = r5 | 16
            r2.f341718a = r5
            r2.f341722e = r1
        L_0x00eb:
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r13.mo58887l(r1)
            com.google.protobuf.bf r13 = r13.f169962ag
            com.google.protobuf.bs r2 = r1.f169971d
            java.lang.Object r13 = r13.mo58854l(r2)
            if (r13 != 0) goto L_0x0101
            java.lang.Object r13 = r1.f169969b
            goto L_0x0105
        L_0x0101:
            java.lang.Object r13 = r1.mo58889c(r13)
        L_0x0105:
            com.google.assistant.e.j.abu r13 = (com.google.assistant.p3897e.p3921j.abu) r13
            com.google.assistant.e.j.abp r13 = r13.f134773h
            if (r13 != 0) goto L_0x010d
            com.google.assistant.e.j.abp r13 = com.google.assistant.p3897e.p3921j.abp.f134738j
        L_0x010d:
            long r1 = r13.f134742c
            long r5 = r13.f134747h
            com.google.common.v.i r7 = r12.f342510p
            j$.time.Instant r7 = r7.mo57444a()
            long r7 = r7.toEpochMilli()
            r9 = 0
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0122
            goto L_0x012d
        L_0x0122:
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x012a
            long r1 = r12.f342509o
            long r1 = r1 + r5
            goto L_0x012d
        L_0x012a:
            long r1 = r12.f342508n
            long r1 = r1 + r7
        L_0x012d:
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.ah r7 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah) r7
            int r8 = r7.f341718a
            r8 = r8 | 8
            r7.f341718a = r8
            r7.f341721d = r1
            java.lang.String r1 = r13.f134744e
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.ah r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah) r2
            r1.getClass()
            int r7 = r2.f341718a
            r7 = r7 | 128(0x80, float:1.794E-43)
            r2.f341718a = r7
            r2.f341725h = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.ah r1 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah) r1
            int r2 = r1.f341718a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r1.f341718a = r2
            r1.f341726i = r5
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r1 = r12.f342499e
            int r2 = r13.f134748i
            int r2 = com.google.assistant.p3897e.p3921j.abm.m86277b(r2)
            if (r2 != 0) goto L_0x016a
            r2 = 1
        L_0x016a:
            java.lang.String r2 = com.google.assistant.p3897e.p3921j.abm.m86276a(r2)
            r1.mo109879O(r2)
            com.google.protobuf.cq r1 = r13.f134740a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01db
            com.google.protobuf.cq r1 = r13.f134740a
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01db
            com.google.protobuf.cq r1 = r13.f134740a
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.ah r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah) r2
            r1.getClass()
            int r5 = r2.f341718a
            r5 = r5 | 64
            r2.f341718a = r5
            r2.f341724g = r1
            android.content.Context r1 = r12.f342500f
            boolean r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124118d.m203544a(r1)
            if (r1 == 0) goto L_0x01db
            com.google.common.f.a.d r1 = r12.f342497c
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "#getHotelCheckOutData() Gmail tap target."
            r5 = 35237(0x89a5, float:4.9378E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r5)).mo56386p(r2)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.google.protobuf.cq r13 = r13.f134740a
            java.lang.Object r13 = r13.get(r3)
            java.lang.String r13 = (java.lang.String) r13
            r1[r3] = r13
            java.lang.String r13 = "intent:#Intent;action=com.google.android.gm.intent.VIEW_PLID;package=com.google.android.gm;S.plid=%s;end"
            java.lang.String r13 = java.lang.String.format(r13, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.platform.pcp.f.ah r1 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah) r1
            r13.getClass()
            int r2 = r1.f341718a
            r2 = r2 | 32
            r1.f341718a = r2
            r1.f341723f = r13
        L_0x01db:
            com.google.protobuf.bv r13 = r0.build()
            com.google.android.apps.search.assistant.platform.pcp.f.ah r13 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah) r13
            j$.util.Optional r13 = p3186j$.util.Optional.m71637of(r13)
            return r13
        L_0x01e6:
            com.google.common.f.a.d r13 = r12.f342497c
            com.google.common.f.x r13 = r13.mo56224b()
            java.lang.String r0 = "notification has no title."
            r1 = 35238(0x89a6, float:4.9379E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r13).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r13 = p3186j$.util.Optional.empty()
            return r13
        L_0x01f9:
            com.google.common.f.a.d r13 = r12.f342497c
            com.google.common.f.x r13 = r13.mo56224b()
            java.lang.String r0 = "OpaChatNotificationArgs has no Notification."
            r1 = 35239(0x89a7, float:4.938E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r13).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r13 = p3186j$.util.Optional.empty()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.C124003z.m203377i(com.google.assistant.e.j.aas):j$.util.Optional");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0889, code lost:
        if (r4.f126790a != 1) goto L_0x0959;
     */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0963  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo106135a(com.google.assistant.p3897e.p3921j.aas r37, com.google.apps.tiktok.account.AccountId r38) {
        /*
            r36 = this;
            r11 = r36
            r0 = r37
            r7 = r38
            com.google.assistant.e.j.aap r1 = r0.f134676n
            if (r1 != 0) goto L_0x000c
            com.google.assistant.e.j.aap r1 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x000c:
            int r1 = r1.f134655d
            com.google.protos.f.r.c r2 = com.google.protos.p4985f.p5036r.C65317c.f176650b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.f.r.a r2 = (com.google.protos.p4985f.p5036r.C65313a) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.protos.f.r.c r3 = (com.google.protos.p4985f.p5036r.C65317c) r3
            r3.f176652a = r1
            com.google.protobuf.bv r1 = r2.build()
            com.google.protos.f.r.c r1 = (com.google.protos.p4985f.p5036r.C65317c) r1
            int r1 = r1.f176652a
            int r1 = com.google.protos.p4985f.p5036r.C65316b.m96666c(r1)
            r2 = 1
            if (r1 != 0) goto L_0x002f
            r1 = 1
        L_0x002f:
            com.google.common.f.a.d r3 = r11.f342497c
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = com.google.protos.p4985f.p5036r.C65316b.m96664a(r1)
            r5 = 35226(0x899a, float:4.9362E-41)
            java.lang.String r6 = "#processNotification() Notification type {%s}"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56389s(r6, r4)
            r3 = 209(0xd1, float:2.93E-43)
            r12 = 0
            if (r1 != r3) goto L_0x019d
            com.google.common.f.a.d r1 = r11.f342497c
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "process commute notification"
            r3 = 35213(0x898d, float:4.9344E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            android.content.Context r1 = r11.f342500f
            boolean r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j.m203549c(r1)
            if (r1 != 0) goto L_0x0072
            boolean r1 = r11.f342505k
            if (r1 != 0) goto L_0x0072
            com.google.common.f.a.d r0 = r11.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Not a BC device, disabled commute widget, skip this commute"
            r2 = 35215(0x898f, float:4.9347E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x019c
        L_0x0072:
            boolean r1 = r11.f342503i
            if (r1 == 0) goto L_0x009b
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r0.mo58887l(r1)
            com.google.protobuf.bf r2 = r0.f169962ag
            com.google.protobuf.bs r1 = r1.f169971d
            boolean r1 = r2.mo58857o(r1)
            if (r1 != 0) goto L_0x009b
            com.google.common.f.a.d r0 = r11.f342497c
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Do not process commute time notifications because of missing Smartspace content."
            r2 = 35214(0x898e, float:4.9345E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x019c
        L_0x009b:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            android.content.Context r1 = r11.f342500f
            com.google.android.apps.search.assistant.platform.pcp.b.b r1 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202992a(r1, r7)
            com.google.android.apps.search.assistant.platform.pcp.f.h r2 = r36.m203372d(r37)
            java.lang.String r4 = r0.f134670h
            com.google.common.b.gp r10 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.v.i r3 = r11.f342510p
            j$.time.Instant r3 = r3.mo57444a()
            long r8 = r3.toEpochMilli()
            com.google.common.i.o r3 = com.google.common.p4537i.C59294s.m92133c()
            com.google.common.i.p r3 = r3.mo56748e()
            java.lang.String r5 = r2.f341928b
            com.google.protobuf.z r5 = com.google.protobuf.C63088z.m96143E(r5)
            byte[] r5 = r5.mo59174N()
            r3.mo56746g(r5)
            long r5 = r2.f341929c
            r3.mo56745f(r5)
            java.lang.String r5 = r2.f341930d
            com.google.protobuf.z r5 = com.google.protobuf.C63088z.m96143E(r5)
            byte[] r5 = r5.mo59174N()
            r3.mo56746g(r5)
            java.lang.String r5 = r2.f341931e
            com.google.protobuf.z r5 = com.google.protobuf.C63088z.m96143E(r5)
            byte[] r5 = r5.mo59174N()
            r3.mo56746g(r5)
            java.lang.String r5 = r2.f341932f
            com.google.protobuf.z r5 = com.google.protobuf.C63088z.m96143E(r5)
            byte[] r5 = r5.mo59174N()
            r3.mo56746g(r5)
            java.lang.String r5 = r2.f341933g
            com.google.protobuf.z r5 = com.google.protobuf.C63088z.m96143E(r5)
            byte[] r5 = r5.mo59174N()
            r3.mo56746g(r5)
            java.lang.String r5 = r2.f341934h
            com.google.protobuf.z r5 = com.google.protobuf.C63088z.m96143E(r5)
            byte[] r5 = r5.mo59174N()
            r3.mo56746g(r5)
            java.lang.String r5 = r2.f341935i
            com.google.protobuf.z r5 = com.google.protobuf.C63088z.m96143E(r5)
            byte[] r5 = r5.mo59174N()
            r3.mo56746g(r5)
            com.google.common.i.n r3 = r3.mo56758p()
            byte[] r5 = r3.mo56775e()
            byte[] r3 = new byte[r12]
            r14 = 100006(0x186a6, float:1.40138E-40)
            r15 = r4
            r16 = r2
            r17 = r5
            r18 = r3
            r19 = r8
            android.content.ContentValues r14 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202943b(r14, r15, r16, r17, r18, r19)
            j$.util.Optional r3 = r36.m203375g(r37)
            android.content.Context r0 = r11.f342500f
            com.google.android.apps.search.assistant.platform.pcp.i.bm r0 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124086bm.m203508a(r0, r7)
            r15 = 100006(0x186a6, float:1.40138E-40)
            com.google.common.b.gu r6 = r0.mo106279b(r15)
            com.google.android.libraries.storage.b.e r2 = r1.f341550b
            com.google.android.apps.search.assistant.platform.pcp.featuredata.s r1 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.s
            r0 = r1
            r12 = r1
            r1 = r36
            r15 = r2
            r2 = r6
            r17 = r6
            r6 = r38
            r7 = r8
            r9 = r10
            r21 = r10
            r10 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            com.google.common.util.concurrent.cx r0 = r15.mo45938b(r12)
            r13.add(r0)
            com.google.android.apps.search.assistant.platform.pcp.i.bz r0 = r11.f342502h
            r1 = 100006(0x186a6, float:1.40138E-40)
            r0.mo106284c(r1)
            int r0 = r17.size()
            r12 = 0
        L_0x0177:
            if (r12 >= r0) goto L_0x018b
            r2 = r17
            java.lang.Object r3 = r2.get(r12)
            com.google.assistant.s.a.j r3 = (com.google.assistant.p3994s.p3995a.C53306j) r3
            com.google.android.apps.search.assistant.platform.pcp.i.bz r4 = r11.f342502h
            int r3 = r3.f139793X
            r4.mo106283b(r1, r3)
            int r12 = r12 + 1
            goto L_0x0177
        L_0x018b:
            com.google.apps.tiktok.tracing.contrib.b.j r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84752c(r13)
            com.google.android.apps.search.assistant.platform.pcp.featuredata.t r1 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.t
            r2 = r21
            r1.<init>(r11, r2)
            java.util.concurrent.Executor r2 = r11.f342501g
            com.google.common.util.concurrent.cx r0 = r0.mo51521b(r1, r2)
        L_0x019c:
            return r0
        L_0x019d:
            r3 = 210(0xd2, float:2.94E-43)
            r4 = 2
            if (r1 == r3) goto L_0x0787
            r3 = 230(0xe6, float:3.22E-43)
            if (r1 == r3) goto L_0x0787
            r3 = 233(0xe9, float:3.27E-43)
            if (r1 == r3) goto L_0x0787
            r3 = 231(0xe7, float:3.24E-43)
            if (r1 == r3) goto L_0x0787
            r3 = 232(0xe8, float:3.25E-43)
            if (r1 != r3) goto L_0x01b5
            r9 = r11
            goto L_0x0789
        L_0x01b5:
            r3 = 387(0x183, float:5.42E-43)
            r8 = 39
            if (r1 == r3) goto L_0x04ba
            r3 = 388(0x184, float:5.44E-43)
            if (r1 != r3) goto L_0x01c1
            goto L_0x04ba
        L_0x01c1:
            r3 = 390(0x186, float:5.47E-43)
            if (r1 != r3) goto L_0x029a
            com.google.android.apps.search.assistant.platform.pcp.featuredata.a.k r8 = r11.f342512r
            com.google.common.f.a.d r1 = r8.f342029m
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            r3 = 35256(0x89b8, float:4.9404E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            java.lang.String r3 = "process flight landing notification with id: %s"
            java.lang.String r5 = r0.f134670h
            r1.mo56389s(r3, r5)
            android.content.Context r1 = r8.f342017a
            boolean r3 = r8.f342023g
            if (r3 == 0) goto L_0x0289
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            java.lang.String r5 = "com.google.android.feature.PIXEL_EXPERIENCE"
            boolean r3 = r3.hasSystemFeature(r5)
            if (r3 != 0) goto L_0x01fd
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r3 = "com.google.android.feature.GOOGLE_EXPERIENCE"
            boolean r1 = r1.hasSystemFeature(r3)
            if (r1 == 0) goto L_0x0289
        L_0x01fd:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r1 <= r3) goto L_0x0289
            j$.util.Optional r1 = r8.mo106134b(r0)
            boolean r3 = r1.isPresent()
            if (r3 != 0) goto L_0x021f
            com.google.common.f.a.d r0 = r8.f342029m
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Missing flight landing data."
            r2 = 35257(0x89b9, float:4.9406E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0299
        L_0x021f:
            java.lang.Object r1 = r1.get()
            r9 = r1
            com.google.android.apps.search.assistant.platform.pcp.f.r r9 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r) r9
            long r5 = r9.f341968d
            r12 = 0
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0241
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r1 = r8.f342030n
            j$.time.Instant r3 = p3186j$.time.Instant.ofEpochMilli(r5)
            com.google.common.v.i r5 = r8.f342031o
            j$.time.Instant r5 = r5.mo57444a()
            j$.time.Duration r3 = p3186j$.time.Duration.between(r3, r5)
            r1.mo109927ay(r3)
        L_0x0241:
            android.content.Context r1 = r8.f342017a
            java.lang.Class<com.google.android.apps.search.assistant.platform.pcp.d.e$a> r3 = com.google.android.apps.search.assistant.platform.pcp.p9327d.C123695e.C123696a.class
            java.lang.Object r1 = com.google.apps.tiktok.inject.C47245e.m84045a(r1, r3, r7)
            com.google.android.apps.search.assistant.platform.pcp.d.e$a r1 = (com.google.android.apps.search.assistant.platform.pcp.p9327d.C123695e.C123696a) r1
            com.google.android.apps.search.assistant.platform.pcp.d.e r1 = r1.mo106105W()
            com.google.common.util.concurrent.cx r3 = r1.mo106104a(r2)
            android.content.Context r1 = r8.f342017a
            com.google.android.apps.search.assistant.verticals.ambient.settings.p r1 = com.google.android.apps.search.assistant.verticals.ambient.settings.C131576q.m213974a(r1, r7)
            com.google.common.util.concurrent.cx r5 = r1.mo110194a()
            com.google.common.util.concurrent.cx[] r1 = new com.google.common.util.concurrent.C60870cx[r4]
            r4 = 0
            r1[r4] = r3
            r1[r2] = r5
            com.google.apps.tiktok.tracing.contrib.b.j r10 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84753d(r1)
            com.google.android.apps.search.assistant.platform.pcp.featuredata.a.h r12 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.a.h
            r1 = r12
            r2 = r8
            r4 = r5
            r5 = r38
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.Executor r1 = r8.f342018b
            com.google.common.util.concurrent.cx r1 = r10.mo51521b(r12, r1)
            com.google.android.apps.search.assistant.platform.pcp.featuredata.a.g r2 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.a.g
            r2.<init>(r8, r7, r9, r0)
            java.util.concurrent.Executor r0 = r8.f342018b
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r1, r2, r0)
            goto L_0x0299
        L_0x0289:
            com.google.common.f.a.d r0 = r8.f342029m
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Smartspace flight landing is not supported on this device."
            r2 = 35258(0x89ba, float:4.9407E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x0299:
            return r0
        L_0x029a:
            r2 = 394(0x18a, float:5.52E-43)
            if (r1 != r2) goto L_0x04ac
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r0.mo58887l(r1)
            com.google.protobuf.bf r2 = r0.f169962ag
            com.google.protobuf.bs r1 = r1.f169971d
            boolean r1 = r2.mo58857o(r1)
            if (r1 != 0) goto L_0x02c3
            com.google.common.f.a.d r0 = r11.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "NotificationArgs has no SmartSpaceNotificationArgs."
            r2 = 35225(0x8999, float:4.9361E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04ab
        L_0x02c3:
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r0.mo58887l(r1)
            com.google.protobuf.bf r2 = r0.f169962ag
            com.google.protobuf.bs r3 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x02d9
            java.lang.Object r1 = r1.f169969b
            goto L_0x02dd
        L_0x02d9:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x02dd:
            com.google.assistant.e.j.abu r1 = (com.google.assistant.p3897e.p3921j.abu) r1
            int r1 = r1.f134766a
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x049b
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r0.mo58887l(r1)
            com.google.protobuf.bf r2 = r0.f169962ag
            com.google.protobuf.bs r3 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x02fb
            java.lang.Object r1 = r1.f169969b
            goto L_0x02ff
        L_0x02fb:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x02ff:
            com.google.assistant.e.j.abu r1 = (com.google.assistant.p3897e.p3921j.abu) r1
            com.google.assistant.e.j.abp r1 = r1.f134773h
            if (r1 != 0) goto L_0x0307
            com.google.assistant.e.j.abp r1 = com.google.assistant.p3897e.p3921j.abp.f134738j
        L_0x0307:
            int r1 = r1.f134741b
            int r2 = com.google.assistant.p3897e.p3921j.abo.m86278a(r1)
            java.lang.String r3 = "Missing action type."
            if (r2 != 0) goto L_0x0313
            goto L_0x03f9
        L_0x0313:
            if (r2 != r4) goto L_0x03f9
            com.google.common.f.a.d r1 = r11.f342497c
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "process hotel check-in notification"
            r4 = 35216(0x8990, float:4.9348E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r4)).mo56386p(r2)
            android.content.Context r1 = r11.f342500f
            boolean r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j.m203549c(r1)
            if (r1 != 0) goto L_0x033d
            com.google.common.f.a.d r0 = r11.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Not a BC device, skip this hotel check-in."
            r2 = 35219(0x8993, float:4.9352E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04ab
        L_0x033d:
            j$.util.Optional r1 = r36.m203376h(r37)
            boolean r2 = r1.isPresent()
            if (r2 != 0) goto L_0x0359
            com.google.common.f.a.d r0 = r11.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Missing hotel check-in data."
            r2 = 35218(0x8992, float:4.9351E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04ab
        L_0x0359:
            java.lang.Object r1 = r1.get()
            com.google.android.apps.search.assistant.platform.pcp.f.af r1 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af) r1
            j$.util.Optional r2 = r36.m203374f(r37)
            boolean r4 = r2.isPresent()
            if (r4 != 0) goto L_0x0379
            com.google.common.f.a.d r0 = r11.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            r1 = 35217(0x8991, float:4.935E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r1)).mo56386p(r3)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04ab
        L_0x0379:
            java.lang.Object r2 = r2.get()
            com.google.assistant.e.j.abe r2 = (com.google.assistant.p3897e.p3921j.abe) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.Context r4 = r11.f342500f
            com.google.android.apps.search.assistant.platform.pcp.b.b r4 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202992a(r4, r7)
            java.lang.String r0 = r0.f134670h
            com.google.common.v.i r5 = r11.f342510p
            j$.time.Instant r5 = r5.mo57444a()
            long r5 = r5.toEpochMilli()
            com.google.common.i.o r7 = com.google.common.p4537i.C59294s.m92133c()
            com.google.common.i.p r7 = r7.mo56748e()
            java.lang.String r9 = r1.f341707b
            com.google.protobuf.z r9 = com.google.protobuf.C63088z.m96143E(r9)
            byte[] r9 = r9.mo59174N()
            r7.mo56746g(r9)
            com.google.common.i.n r7 = r7.mo56758p()
            byte[] r20 = r7.mo56775e()
            r7 = 0
            byte[] r7 = new byte[r7]
            r17 = 100011(0x186ab, float:1.40145E-40)
            r18 = r0
            r19 = r1
            r21 = r7
            r22 = r5
            android.content.ContentValues r18 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202943b(r17, r18, r19, r20, r21, r22)
            com.google.android.libraries.storage.b.e r1 = r4.f341550b
            com.google.android.apps.search.assistant.platform.pcp.featuredata.u r4 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.u
            r17 = r4
            r19 = r2
            r20 = r0
            r21 = r5
            r17.<init>(r18, r19, r20, r21)
            com.google.common.util.concurrent.cx r0 = r1.mo45938b(r4)
            r3.add(r0)
            com.google.android.apps.search.assistant.platform.pcp.i.bz r0 = r11.f342502h
            r1 = 100011(0x186ab, float:1.40145E-40)
            r0.mo106284c(r1)
            com.google.android.apps.search.assistant.platform.pcp.i.bz r0 = r11.f342502h
            r0.mo106283b(r1, r8)
            com.google.apps.tiktok.tracing.contrib.b.j r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84752c(r3)
            com.google.android.apps.search.assistant.platform.pcp.featuredata.v r1 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.v
            r1.<init>(r11)
            java.util.concurrent.Executor r2 = r11.f342501g
            com.google.common.util.concurrent.cx r0 = r0.mo51521b(r1, r2)
            goto L_0x04ab
        L_0x03f9:
            int r1 = com.google.assistant.p3897e.p3921j.abo.m86278a(r1)
            if (r1 != 0) goto L_0x0401
            goto L_0x0498
        L_0x0401:
            r2 = 3
            if (r1 != r2) goto L_0x0498
            com.google.common.f.a.d r1 = r11.f342497c
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "process hotel check-out notification"
            r4 = 35220(0x8994, float:4.9354E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r4)).mo56386p(r2)
            android.content.Context r1 = r11.f342500f
            boolean r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j.m203549c(r1)
            if (r1 != 0) goto L_0x042c
            com.google.common.f.a.d r0 = r11.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Not a BC device, skip this hotel check-out."
            r2 = 35223(0x8997, float:4.9358E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04ab
        L_0x042c:
            j$.util.Optional r1 = r36.m203377i(r37)
            boolean r2 = r1.isPresent()
            if (r2 != 0) goto L_0x0447
            com.google.common.f.a.d r0 = r11.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Missing hotel check-out data."
            r2 = 35222(0x8996, float:4.9357E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04ab
        L_0x0447:
            j$.util.Optional r2 = r36.m203374f(r37)
            boolean r4 = r2.isPresent()
            if (r4 != 0) goto L_0x0460
            com.google.common.f.a.d r0 = r11.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            r1 = 35221(0x8995, float:4.9355E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r1)).mo56386p(r3)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04ab
        L_0x0460:
            java.lang.Object r1 = r1.get()
            r4 = r1
            com.google.android.apps.search.assistant.platform.pcp.f.ah r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah) r4
            java.lang.Object r1 = r2.get()
            r3 = r1
            com.google.assistant.e.j.abe r3 = (com.google.assistant.p3897e.p3921j.abe) r3
            java.lang.String r5 = r0.f134670h
            boolean r0 = r11.f342504j
            if (r0 == 0) goto L_0x0493
            android.content.Context r0 = r11.f342500f
            com.google.android.apps.search.assistant.verticals.ambient.settings.p r0 = com.google.android.apps.search.assistant.verticals.ambient.settings.C131576q.m213974a(r0, r7)
            com.google.common.util.concurrent.cx r6 = r0.mo110194a()
            com.google.android.apps.search.assistant.platform.pcp.featuredata.w r8 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.w
            r0 = r8
            r1 = r36
            r2 = r38
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.Executor r0 = r11.f342501g
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r8)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r6, r1, r0)
            goto L_0x04ab
        L_0x0493:
            com.google.common.util.concurrent.cx r0 = r11.mo106227b(r7, r3, r4, r5)
            goto L_0x04ab
        L_0x0498:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04ab
        L_0x049b:
            com.google.common.f.a.d r0 = r11.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "SmartSpaceNotificationArgs has no HotelContent."
            r2 = 35224(0x8998, float:4.936E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x04ab:
            return r0
        L_0x04ac:
            r2 = 397(0x18d, float:5.56E-43)
            if (r1 != r2) goto L_0x04b7
            com.google.android.apps.search.assistant.platform.pcp.featuredata.d.w r1 = r11.f342511q
            com.google.common.util.concurrent.cx r0 = r1.mo106160a(r0, r7)
            return r0
        L_0x04b7:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            return r0
        L_0x04ba:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.b.c r9 = r11.f342513s
            java.lang.String r3 = r0.f134670h
            com.google.common.f.a.d r1 = r9.f342072g
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r5 = "process grocery notification: %s"
            r6 = 35268(0x89c4, float:4.9421E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r6)).mo56389s(r5, r3)
            android.content.Context r1 = r9.f342066a
            boolean r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j.m203549c(r1)
            if (r1 != 0) goto L_0x04e6
            com.google.common.f.a.d r0 = r9.f342072g
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Not a BC device, skip this grocery."
            r2 = 35272(0x89c8, float:4.9427E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0786
        L_0x04e6:
            j$.util.Optional r0 = r9.mo106137a(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0502
            com.google.common.f.a.d r0 = r9.f342072g
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Missing grocery data."
            r2 = 35271(0x89c7, float:4.9425E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0786
        L_0x0502:
            java.lang.Object r0 = r0.get()
            com.google.android.apps.search.assistant.platform.pcp.f.ab r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123708ab) r0
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r1 = r9.f342073h
            boolean r5 = r0.f341699m
            r1.mo109875K(r5)
            boolean r1 = r0.f341699m
            if (r1 != 0) goto L_0x0529
            boolean r1 = r9.f342069d
            if (r1 == 0) goto L_0x0529
            com.google.common.f.a.d r0 = r9.f342072g
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Processing grocery data from new corpus only, and data is from the old corpus."
            r2 = 35270(0x89c6, float:4.9424E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0786
        L_0x0529:
            android.content.Context r1 = r9.f342066a
            com.google.android.apps.search.assistant.platform.pcp.b.b r1 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202992a(r1, r7)
            boolean r5 = r0.f341698l
            r10 = 100009(0x186a9, float:1.40142E-40)
            if (r5 == 0) goto L_0x05b9
            com.google.common.f.a.d r0 = r9.f342072g
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r4 = "Delete grocery data."
            r5 = 35269(0x89c5, float:4.9422E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r0 = r9.f342073h
            r0.mo109873I()
            j$.util.Optional r0 = r9.f342070e
            java.util.concurrent.Executor r4 = r9.f342067b
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89846n(r3)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x055b
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0786
        L_0x055b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.common.b.gp r6 = com.google.common.p4522b.C58485gu.m89837e()
            boolean r8 = r0.isPresent()
            if (r8 == 0) goto L_0x0587
            java.lang.Object r8 = r0.get()
            com.google.android.apps.search.assistant.platform.pcp.validity.p r8 = (com.google.android.apps.search.assistant.platform.pcp.validity.C124167p) r8
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r38)
            j$.util.Optional r9 = p3186j$.util.Optional.empty()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            j$.util.Optional r10 = p3186j$.util.Optional.m71637of(r10)
            com.google.common.util.concurrent.cx r7 = r8.mo106308a(r7, r3, r9, r10)
            r5.add(r7)
        L_0x0587:
            com.google.apps.tiktok.tracing.contrib.b.j r7 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84752c(r5)
            com.google.android.apps.search.assistant.platform.pcp.i.f r8 = new com.google.android.apps.search.assistant.platform.pcp.i.f
            r8.<init>(r5, r6)
            com.google.common.util.concurrent.bg r5 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r5 = r7.mo51520a(r8, r5)
            com.google.android.apps.search.assistant.platform.pcp.i.g r7 = new com.google.android.apps.search.assistant.platform.pcp.i.g
            r7.<init>(r1, r3, r4)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.s r3 = com.google.apps.tiktok.tracing.C47810es.m84966f(r7)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r5, r3, r1)
            com.google.common.util.concurrent.cx[] r2 = new com.google.common.util.concurrent.C60870cx[r2]
            r3 = 0
            r2[r3] = r1
            com.google.apps.tiktok.tracing.contrib.b.j r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r2)
            com.google.android.apps.search.assistant.platform.pcp.i.h r2 = new com.google.android.apps.search.assistant.platform.pcp.i.h
            r2.<init>(r6, r0)
            com.google.common.util.concurrent.cx r0 = r1.mo51521b(r2, r4)
            goto L_0x0786
        L_0x05b9:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            com.google.common.b.gp r13 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.v.i r5 = r9.f342071f
            j$.time.Instant r5 = r5.mo57444a()
            long r5 = r5.toEpochMilli()
            com.google.common.i.o r14 = com.google.common.p4537i.C59294s.m92133c()
            com.google.common.i.p r14 = r14.mo56748e()
            java.lang.String r15 = r0.f341688b
            com.google.protobuf.z r15 = com.google.protobuf.C63088z.m96143E(r15)
            byte[] r15 = r15.mo59174N()
            r14.mo56746g(r15)
            java.lang.String r15 = r0.f341689c
            com.google.protobuf.z r15 = com.google.protobuf.C63088z.m96143E(r15)
            byte[] r15 = r15.mo59174N()
            r14.mo56746g(r15)
            r17 = 100009(0x186a9, float:1.40142E-40)
            com.google.common.i.n r14 = r14.mo56758p()
            byte[] r20 = r14.mo56775e()
            r14 = 0
            byte[] r15 = new byte[r14]
            r18 = r3
            r19 = r0
            r21 = r15
            r22 = r5
            android.content.ContentValues r14 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202943b(r17, r18, r19, r20, r21, r22)
            com.google.android.apps.search.assistant.platform.pcp.featuredata.b.d r15 = r9.f342074i
            int r8 = r0.f341687a
            r18 = r8 & 32
            if (r18 == 0) goto L_0x0611
            goto L_0x0628
        L_0x0611:
            r18 = r8 & 16
            if (r18 != 0) goto L_0x0628
            r8 = r8 & 512(0x200, float:7.175E-43)
            if (r8 != 0) goto L_0x0628
            long r18 = com.google.android.apps.search.assistant.platform.pcp.featuredata.p9332b.C123825d.m203136b(r0)
            j$.time.Duration r8 = r15.f342079e
            long r20 = r8.toMillis()
            long r18 = r18 - r20
            r10 = r18
            goto L_0x062a
        L_0x0628:
            long r10 = r0.f341694h
        L_0x062a:
            com.google.common.v.i r8 = r9.f342071f
            j$.time.Instant r8 = r8.mo57444a()
            long r18 = r8.toEpochMilli()
            r20 = r5
            long r4 = r0.f341695i
            long r22 = com.google.android.apps.search.assistant.platform.pcp.featuredata.p9332b.C123825d.f342075a
            r6 = r3
            long r2 = r18 + r22
            long r2 = java.lang.Math.max(r4, r2)
            com.google.common.f.a.d r4 = r9.f342072g
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            r5 = 35267(0x89c3, float:4.942E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            r22 = r4
            com.google.common.f.a.a r22 = (com.google.common.p4526f.p4527a.C58970a) r22
            java.lang.String r4 = r0.f341688b
            java.lang.String r5 = r0.f341689c
            int r8 = r0.f341691e
            int r8 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123796y.m203115b(r8)
            if (r8 != 0) goto L_0x0661
            r8 = 1
        L_0x0661:
            java.lang.String r26 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123796y.m203114a(r8)
            long r23 = com.google.android.apps.search.assistant.platform.pcp.featuredata.p9332b.C123825d.m203136b(r0)
            java.lang.Long r27 = java.lang.Long.valueOf(r23)
            long r23 = com.google.android.apps.search.assistant.platform.pcp.featuredata.p9332b.C123825d.m203135a(r0)
            java.lang.Long r28 = java.lang.Long.valueOf(r23)
            int r8 = r0.f341687a
            r19 = r8 & 16
            r23 = -1
            if (r19 == 0) goto L_0x0684
            r19 = r12
            r35 = r13
            long r12 = r0.f341692f
            goto L_0x068a
        L_0x0684:
            r19 = r12
            r35 = r13
            r12 = r23
        L_0x068a:
            java.lang.Long r29 = java.lang.Long.valueOf(r12)
            r12 = r8 & 32
            if (r12 == 0) goto L_0x0695
            long r12 = r0.f341693g
            goto L_0x0697
        L_0x0695:
            r12 = r23
        L_0x0697:
            java.lang.Long r30 = java.lang.Long.valueOf(r12)
            r8 = r8 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x06a3
            long r12 = r0.f341697k
            r23 = r12
        L_0x06a3:
            java.lang.Long r31 = java.lang.Long.valueOf(r23)
            java.lang.Long r32 = java.lang.Long.valueOf(r10)
            java.lang.Long r33 = java.lang.Long.valueOf(r2)
            r8 = 1
            java.lang.Object[] r12 = new java.lang.Object[r8]
            boolean r0 = r0.f341699m
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8 = 0
            r12[r8] = r0
            java.lang.String r23 = "Processing grocery data with merchant: %s, order number: %s, shipping type: %s, scheduled start time: %d, scheduled end time: %d, available_for_pickup: %d, delivered: %d, cancelled: %d, triggering start time: %d, triggering end time: %d, is from new corpus: %s"
            r24 = r4
            r25 = r5
            r34 = r12
            r22.mo56367T(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            com.google.assistant.ag.c.az r0 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.ag.c.av r0 = (com.google.assistant.p3803ag.p3809c.C48948av) r0
            com.google.assistant.ag.c.br r4 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.ag.c.bl r4 = (com.google.assistant.p3803ag.p3809c.C48965bl) r4
            com.google.assistant.ag.c.dj r5 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.ag.c.cz r5 = (com.google.assistant.p3803ag.p3809c.C49006cz) r5
            com.google.assistant.ag.c.cy r8 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d
            com.google.protobuf.bn r8 = r8.createBuilder()
            r12 = r8
            com.google.assistant.ag.c.cx r12 = (com.google.assistant.p3803ag.p3809c.C49004cx) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r8 = r12.instance
            com.google.assistant.ag.c.cy r8 = (com.google.assistant.p3803ag.p3809c.C49005cy) r8
            int r13 = r8.f126763a
            r15 = 1
            r13 = r13 | r15
            r8.f126763a = r13
            r8.f126764b = r10
            r12.copyOnWrite()
            com.google.protobuf.bv r8 = r12.instance
            r10 = r8
            com.google.assistant.ag.c.cy r10 = (com.google.assistant.p3803ag.p3809c.C49005cy) r10
            int r8 = r10.f126763a
            r11 = 2
            r13 = r8 | 2
            r10.f126763a = r13
            r10.f126765c = r2
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.assistant.ag.c.dj r2 = (com.google.assistant.p3803ag.p3809c.C49017dj) r2
            com.google.protobuf.bv r3 = r12.build()
            com.google.assistant.ag.c.cy r3 = (com.google.assistant.p3803ag.p3809c.C49005cy) r3
            r3.getClass()
            r2.f126791b = r3
            r3 = 1
            r2.f126790a = r3
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.assistant.ag.c.br r2 = (com.google.assistant.p3803ag.p3809c.C48971br) r2
            com.google.protobuf.bv r3 = r5.build()
            com.google.assistant.ag.c.dj r3 = (com.google.assistant.p3803ag.p3809c.C49017dj) r3
            r3.getClass()
            r2.f126692b = r3
            r3 = 2
            r2.f126691a = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.ag.c.az r2 = (com.google.assistant.p3803ag.p3809c.C48952az) r2
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.ag.c.br r3 = (com.google.assistant.p3803ag.p3809c.C48971br) r3
            r3.getClass()
            r2.f126660b = r3
            r3 = 1
            r2.f126659a = r3
            com.google.protobuf.bv r0 = r0.build()
            r4 = r0
            com.google.assistant.ag.c.az r4 = (com.google.assistant.p3803ag.p3809c.C48952az) r4
            com.google.android.libraries.storage.b.e r8 = r1.f341550b
            com.google.android.apps.search.assistant.platform.pcp.featuredata.b.a r10 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.b.a
            r0 = r10
            r1 = r14
            r2 = r38
            r3 = r6
            r5 = r20
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r7)
            com.google.common.util.concurrent.cx r0 = r8.mo45938b(r10)
            r1 = r19
            r1.add(r0)
            com.google.android.apps.search.assistant.platform.pcp.i.bz r0 = r9.f342068c
            r2 = 100009(0x186a9, float:1.40142E-40)
            r0.mo106284c(r2)
            com.google.android.apps.search.assistant.platform.pcp.i.bz r0 = r9.f342068c
            r3 = 39
            r0.mo106283b(r2, r3)
            com.google.apps.tiktok.tracing.contrib.b.j r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84752c(r1)
            com.google.android.apps.search.assistant.platform.pcp.featuredata.b.b r1 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.b.b
            r2 = r35
            r1.<init>(r9, r2)
            java.util.concurrent.Executor r2 = r9.f342067b
            com.google.common.util.concurrent.cx r0 = r0.mo51521b(r1, r2)
        L_0x0786:
            return r0
        L_0x0787:
            r9 = r36
        L_0x0789:
            com.google.common.f.a.d r1 = r9.f342497c
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "process time to leave notification"
            r3 = 35227(0x899b, float:4.9364E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            android.content.Context r1 = r9.f342500f
            boolean r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j.m203549c(r1)
            if (r1 != 0) goto L_0x07b2
            com.google.common.f.a.d r0 = r9.f342497c
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Not a BC device, skip this time to leave."
            r2 = 35228(0x899c, float:4.9365E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            r14 = r9
            goto L_0x09dc
        L_0x07b2:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            android.content.Context r1 = r9.f342500f
            com.google.android.apps.search.assistant.platform.pcp.b.b r1 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202992a(r1, r7)
            com.google.android.apps.search.assistant.platform.pcp.f.bx r2 = r36.m203373e(r37)
            java.lang.String r5 = r0.f134670h
            com.google.common.b.gp r11 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.v.i r3 = r9.f342510p
            j$.time.Instant r3 = r3.mo57444a()
            long r12 = r3.toEpochMilli()
            com.google.common.i.o r3 = com.google.common.p4537i.C59294s.m92133c()
            com.google.common.i.p r3 = r3.mo56748e()
            java.lang.String r4 = r2.f341857b
            com.google.protobuf.z r4 = com.google.protobuf.C63088z.m96143E(r4)
            byte[] r4 = r4.mo59174N()
            r3.mo56746g(r4)
            long r8 = r2.f341858c
            r3.mo56745f(r8)
            java.lang.String r6 = r2.f341859d
            com.google.protobuf.z r6 = com.google.protobuf.C63088z.m96143E(r6)
            byte[] r6 = r6.mo59174N()
            r3.mo56746g(r6)
            java.lang.String r6 = r2.f341860e
            com.google.protobuf.z r6 = com.google.protobuf.C63088z.m96143E(r6)
            byte[] r6 = r6.mo59174N()
            r3.mo56746g(r6)
            java.lang.String r6 = r2.f341861f
            com.google.protobuf.z r6 = com.google.protobuf.C63088z.m96143E(r6)
            byte[] r6 = r6.mo59174N()
            r3.mo56746g(r6)
            long r8 = r2.f341863h
            r3.mo56745f(r8)
            java.lang.String r6 = r2.f341864i
            com.google.protobuf.z r6 = com.google.protobuf.C63088z.m96143E(r6)
            byte[] r6 = r6.mo59174N()
            r3.mo56746g(r6)
            java.lang.String r6 = r2.f341865j
            com.google.protobuf.z r6 = com.google.protobuf.C63088z.m96143E(r6)
            byte[] r6 = r6.mo59174N()
            r3.mo56746g(r6)
            r17 = 100005(0x186a5, float:1.40137E-40)
            com.google.common.i.n r3 = r3.mo56758p()
            byte[] r20 = r3.mo56775e()
            r9 = 0
            byte[] r3 = new byte[r9]
            r18 = r5
            r19 = r2
            r21 = r3
            r22 = r12
            android.content.ContentValues r3 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202943b(r17, r18, r19, r20, r21, r22)
            j$.util.Optional r6 = r36.m203375g(r37)
            r14 = r36
            com.google.android.apps.search.assistant.platform.pcp.i.bz r0 = r14.f342502h
            boolean r8 = r6.isPresent()
            if (r8 == 0) goto L_0x0989
            int r8 = r2.f341856a
            r8 = r8 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0989
            r16 = r10
            long r9 = r2.f341866k
            j$.time.Instant r2 = p3186j$.time.Instant.ofEpochSecond(r9)
            java.lang.Object r8 = r6.get()
            r9 = r8
            com.google.assistant.ag.c.az r9 = (com.google.assistant.p3803ag.p3809c.C48952az) r9
            int r8 = r9.f126659a
            r10 = 1
            if (r8 != r10) goto L_0x08cf
            java.lang.Object r8 = r9.f126660b
            r15 = r8
            com.google.assistant.ag.c.br r15 = (com.google.assistant.p3803ag.p3809c.C48971br) r15
            int r8 = r15.f126691a
            if (r8 != r10) goto L_0x087d
            goto L_0x088d
        L_0x087d:
            r4 = 2
            if (r8 != r4) goto L_0x0885
            java.lang.Object r4 = r15.f126692b
            com.google.assistant.ag.c.dj r4 = (com.google.assistant.p3803ag.p3809c.C49017dj) r4
            goto L_0x0887
        L_0x0885:
            com.google.assistant.ag.c.dj r4 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c
        L_0x0887:
            int r4 = r4.f126790a
            if (r4 == r10) goto L_0x088d
            goto L_0x0959
        L_0x088d:
            int r4 = r15.f126691a
            if (r4 != r10) goto L_0x08a0
            java.lang.Object r4 = r15.f126692b
            com.google.assistant.ag.c.z r4 = (com.google.assistant.p3803ag.p3809c.C49156z) r4
            com.google.protobuf.fg r4 = r4.f127114b
            if (r4 != 0) goto L_0x089b
            com.google.protobuf.fg r4 = com.google.protobuf.C63042fg.f170152c
        L_0x089b:
            long r8 = com.google.protobuf.p4750c.C62953e.m95478c(r4)
            goto L_0x08c5
        L_0x08a0:
            int r4 = r9.f126659a
            if (r4 != r10) goto L_0x08a9
            java.lang.Object r4 = r9.f126660b
            com.google.assistant.ag.c.br r4 = (com.google.assistant.p3803ag.p3809c.C48971br) r4
            goto L_0x08ab
        L_0x08a9:
            com.google.assistant.ag.c.br r4 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x08ab:
            int r9 = r4.f126691a
            r8 = 2
            if (r9 != r8) goto L_0x08b5
            java.lang.Object r4 = r4.f126692b
            com.google.assistant.ag.c.dj r4 = (com.google.assistant.p3803ag.p3809c.C49017dj) r4
            goto L_0x08b7
        L_0x08b5:
            com.google.assistant.ag.c.dj r4 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c
        L_0x08b7:
            int r8 = r4.f126790a
            r9 = 1
            if (r8 != r9) goto L_0x08c1
            java.lang.Object r4 = r4.f126791b
            com.google.assistant.ag.c.cy r4 = (com.google.assistant.p3803ag.p3809c.C49005cy) r4
            goto L_0x08c3
        L_0x08c1:
            com.google.assistant.ag.c.cy r4 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d
        L_0x08c3:
            long r8 = r4.f126764b
        L_0x08c5:
            j$.time.Instant r4 = p3186j$.time.Instant.ofEpochMilli(r8)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x095d
        L_0x08cf:
            r4 = 2
            if (r8 != r4) goto L_0x0959
            java.lang.Object r4 = r9.f126660b
            com.google.assistant.ag.c.ay r4 = (com.google.assistant.p3803ag.p3809c.C48951ay) r4
            com.google.protobuf.cq r4 = r4.f126656a
            java.util.Iterator r4 = r4.iterator()
        L_0x08dc:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0959
            java.lang.Object r9 = r4.next()
            com.google.assistant.ag.c.az r9 = (com.google.assistant.p3803ag.p3809c.C48952az) r9
            int r10 = r9.f126659a
            r15 = 1
            if (r10 != r15) goto L_0x08f2
            java.lang.Object r10 = r9.f126660b
            com.google.assistant.ag.c.br r10 = (com.google.assistant.p3803ag.p3809c.C48971br) r10
            goto L_0x08f4
        L_0x08f2:
            com.google.assistant.ag.c.br r10 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x08f4:
            int r10 = r10.f126691a
            r8 = 2
            if (r10 != r8) goto L_0x0926
            int r4 = r9.f126659a
            if (r4 != r15) goto L_0x0902
            java.lang.Object r4 = r9.f126660b
            com.google.assistant.ag.c.br r4 = (com.google.assistant.p3803ag.p3809c.C48971br) r4
            goto L_0x0904
        L_0x0902:
            com.google.assistant.ag.c.br r4 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x0904:
            int r9 = r4.f126691a
            if (r9 != r8) goto L_0x090d
            java.lang.Object r4 = r4.f126692b
            com.google.assistant.ag.c.dj r4 = (com.google.assistant.p3803ag.p3809c.C49017dj) r4
            goto L_0x090f
        L_0x090d:
            com.google.assistant.ag.c.dj r4 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c
        L_0x090f:
            int r8 = r4.f126790a
            r10 = 1
            if (r8 != r10) goto L_0x0919
            java.lang.Object r4 = r4.f126791b
            com.google.assistant.ag.c.cy r4 = (com.google.assistant.p3803ag.p3809c.C49005cy) r4
            goto L_0x091b
        L_0x0919:
            com.google.assistant.ag.c.cy r4 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d
        L_0x091b:
            long r8 = r4.f126764b
            j$.time.Instant r4 = p3186j$.time.Instant.ofEpochMilli(r8)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x095d
        L_0x0926:
            r10 = 1
            int r15 = r9.f126659a
            if (r15 != r10) goto L_0x0930
            java.lang.Object r8 = r9.f126660b
            com.google.assistant.ag.c.br r8 = (com.google.assistant.p3803ag.p3809c.C48971br) r8
            goto L_0x0932
        L_0x0930:
            com.google.assistant.ag.c.br r8 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x0932:
            int r8 = r8.f126691a
            if (r8 != r10) goto L_0x08dc
            if (r15 != r10) goto L_0x093d
            java.lang.Object r4 = r9.f126660b
            com.google.assistant.ag.c.br r4 = (com.google.assistant.p3803ag.p3809c.C48971br) r4
            goto L_0x093f
        L_0x093d:
            com.google.assistant.ag.c.br r4 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x093f:
            int r8 = r4.f126691a
            if (r8 != r10) goto L_0x0948
            java.lang.Object r4 = r4.f126692b
            com.google.assistant.ag.c.z r4 = (com.google.assistant.p3803ag.p3809c.C49156z) r4
            goto L_0x094a
        L_0x0948:
            com.google.assistant.ag.c.z r4 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
        L_0x094a:
            com.google.protobuf.fg r4 = r4.f127114b
            if (r4 != 0) goto L_0x0950
            com.google.protobuf.fg r4 = com.google.protobuf.C63042fg.f170152c
        L_0x0950:
            j$.time.Instant r4 = com.google.protobuf.p4750c.C62950b.m95474e(r4)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            goto L_0x095d
        L_0x0959:
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
        L_0x095d:
            boolean r8 = r4.isPresent()
            if (r8 == 0) goto L_0x098b
            java.lang.Object r4 = r4.get()
            j$.time.temporal.Temporal r4 = (p3186j$.time.temporal.Temporal) r4
            j$.time.Duration r2 = p3186j$.time.Duration.between(r4, r2)
            r8 = 30
            j$.time.Duration r4 = p3186j$.time.Duration.ofMinutes(r8)
            int r2 = r2.compareTo((p3186j$.time.Duration) r4)
            if (r2 > 0) goto L_0x0981
            com.google.android.libraries.search.logging.d.kp r0 = r0.f342762a
            java.lang.String r2 = "TTL_TRIGGERING_TIME_WITHIN_THIRTY_MINUTES_OF_EVENT_TIME"
            r0.mo41676J(r2)
            goto L_0x098b
        L_0x0981:
            com.google.android.libraries.search.logging.d.kp r0 = r0.f342762a
            java.lang.String r2 = "TTL_TRIGGERING_TIME_BEYOND_THIRTY_MINUTES_OF_EVENT_TIME"
            r0.mo41676J(r2)
            goto L_0x098b
        L_0x0989:
            r16 = r10
        L_0x098b:
            android.content.Context r0 = r14.f342500f
            com.google.android.apps.search.assistant.platform.pcp.i.bm r0 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124086bm.m203508a(r0, r7)
            r9 = 100005(0x186a5, float:1.40137E-40)
            com.google.common.b.gu r10 = r0.mo106279b(r9)
            com.google.android.libraries.storage.b.e r15 = r1.f341550b
            com.google.android.apps.search.assistant.platform.pcp.featuredata.q r8 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.q
            r0 = r8
            r1 = r3
            r2 = r10
            r3 = r6
            r4 = r38
            r6 = r12
            r12 = r8
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            com.google.common.util.concurrent.cx r0 = r15.mo45938b(r12)
            r1 = r16
            r1.add(r0)
            com.google.android.apps.search.assistant.platform.pcp.i.bz r0 = r14.f342502h
            r0.mo106284c(r9)
            int r0 = r10.size()
            r12 = 0
        L_0x09bb:
            if (r12 >= r0) goto L_0x09cd
            java.lang.Object r2 = r10.get(r12)
            com.google.assistant.s.a.j r2 = (com.google.assistant.p3994s.p3995a.C53306j) r2
            com.google.android.apps.search.assistant.platform.pcp.i.bz r3 = r14.f342502h
            int r2 = r2.f139793X
            r3.mo106283b(r9, r2)
            int r12 = r12 + 1
            goto L_0x09bb
        L_0x09cd:
            com.google.apps.tiktok.tracing.contrib.b.j r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84752c(r1)
            com.google.android.apps.search.assistant.platform.pcp.featuredata.r r1 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.r
            r1.<init>(r14, r11)
            java.util.concurrent.Executor r2 = r14.f342501g
            com.google.common.util.concurrent.cx r0 = r0.mo51521b(r1, r2)
        L_0x09dc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.C124003z.mo106135a(com.google.assistant.e.j.aas, com.google.apps.tiktok.account.AccountId):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo106227b(AccountId accountId, abe abe, C123714ah ahVar, String str) {
        ArrayList arrayList = new ArrayList();
        C123623b a = C123624c.m202992a(this.f342500f, accountId);
        long epochMilli = this.f342510p.mo57444a().toEpochMilli();
        C59291p e = C59294s.m92133c().mo56748e();
        e.mo56746g(C63088z.m96143E(ahVar.f341719b).mo59174N());
        arrayList.add(a.f341550b.mo45938b(new C124001x(C123611ad.m202943b(100012, str, ahVar, e.mo56758p().mo56775e(), new byte[0], epochMilli), abe, str, epochMilli)));
        this.f342502h.mo106284c(100012);
        this.f342502h.mo106283b(100012, 39);
        return C47638k.m84752c(arrayList).mo51521b(new C124002y(this), this.f342501g);
    }
}
