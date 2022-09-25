package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.p489g.p494d.C9140ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9148ak;
import com.google.android.apps.p489g.p494d.C9149al;
import com.google.android.apps.p489g.p494d.C9165ba;
import com.google.android.apps.p489g.p494d.C9166bb;
import com.google.android.apps.p489g.p494d.C9167bc;
import com.google.android.apps.p489g.p494d.C9170bf;
import com.google.android.apps.p489g.p494d.C9171bg;
import com.google.android.apps.p489g.p494d.C9172bh;
import com.google.android.apps.p489g.p494d.C9189by;
import com.google.android.apps.p489g.p494d.C9194cc;
import com.google.android.apps.p489g.p494d.C9195cd;
import com.google.android.apps.p489g.p494d.C9204cm;
import com.google.android.apps.p489g.p494d.C9205cn;
import com.google.android.apps.p489g.p494d.C9206co;
import com.google.android.apps.p489g.p494d.C9207cp;
import com.google.android.apps.p489g.p494d.C9209cr;
import com.google.android.apps.p489g.p494d.C9210cs;
import com.google.android.apps.p489g.p494d.C9211ct;
import com.google.android.apps.p489g.p494d.C9212cu;
import com.google.android.apps.p489g.p494d.C9213cv;
import com.google.android.apps.p489g.p494d.C9214cw;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.apps.p489g.p494d.C9219da;
import com.google.android.apps.p489g.p494d.C9220db;
import com.google.android.apps.p489g.p494d.C9221dc;
import com.google.android.apps.p489g.p494d.C9222dd;
import com.google.android.apps.p489g.p494d.C9223de;
import com.google.android.apps.p489g.p494d.C9224df;
import com.google.android.apps.p489g.p494d.C9231dm;
import com.google.android.apps.p489g.p494d.C9232dn;
import com.google.android.apps.p489g.p494d.C9252eg;
import com.google.android.apps.p489g.p494d.C9253eh;
import com.google.android.apps.p489g.p494d.C9260eo;
import com.google.android.apps.p489g.p494d.C9261ep;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7548bb;
import com.google.p375ai.p378b.C7555bi;
import com.google.p375ai.p378b.C7559bm;
import com.google.p375ai.p378b.C7560bn;
import com.google.p375ai.p378b.C7576cc;
import com.google.p375ai.p378b.C7577cd;
import com.google.p375ai.p378b.C7580cg;
import com.google.p375ai.p378b.C7583cj;
import com.google.p375ai.p378b.C7584ck;
import com.google.p375ai.p378b.C7586cm;
import com.google.p375ai.p378b.C7588co;
import com.google.p375ai.p378b.C7589cp;
import com.google.p375ai.p378b.C7596cw;
import com.google.p375ai.p378b.C7597cx;
import com.google.p375ai.p378b.C7598cy;
import com.google.p375ai.p378b.C7605de;
import com.google.p375ai.p378b.C7607dg;
import com.google.p375ai.p378b.C7613dm;
import com.google.p375ai.p378b.C7615do;
import com.google.p375ai.p378b.C7617dq;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C8150xj;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54782b;
import com.google.p4283bv.p4354e.p4356b.p4357a.C57056d;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.k */
/* compiled from: PG */
public final class C91992k {
    /* renamed from: a */
    public static C9167bc m150973a(C7555bi biVar) {
        C9166bb bbVar = (C9166bb) C9167bc.f31658e.createBuilder();
        if ((biVar.f26129a & 4) != 0) {
            int i = biVar.f26132d;
            bbVar.copyOnWrite();
            C9167bc bcVar = (C9167bc) bbVar.instance;
            bcVar.f31660a |= 4;
            bcVar.f31663d = i;
        }
        if ((biVar.f26129a & 2) != 0) {
            int i2 = biVar.f26131c;
            bbVar.copyOnWrite();
            C9167bc bcVar2 = (C9167bc) bbVar.instance;
            bcVar2.f31660a |= 2;
            bcVar2.f31662c = i2;
        }
        if ((biVar.f26129a & 1) != 0) {
            String str = biVar.f26130b;
            bbVar.copyOnWrite();
            C9167bc bcVar3 = (C9167bc) bbVar.instance;
            str.getClass();
            bcVar3.f31660a |= 1;
            bcVar3.f31661b = str;
        }
        return (C9167bc) bbVar.build();
    }

    /* renamed from: b */
    public static C9195cd m150974b(C7577cd cdVar) {
        C9189by byVar = (C9189by) C9195cd.f31746j.createBuilder();
        if ((cdVar.f26181a & 1) != 0) {
            int a = C7576cc.m22784a(cdVar.f26182b);
            if (a == 0) {
                a = 1;
            }
            int a2 = C9194cc.m23685a(a);
            byVar.copyOnWrite();
            C9195cd cdVar2 = (C9195cd) byVar.instance;
            if (a2 != 0) {
                cdVar2.f31749b = a2;
                cdVar2.f31748a |= 1;
            } else {
                throw null;
            }
        }
        if ((cdVar.f26181a & 2) != 0) {
            String str = cdVar.f26183c;
            byVar.copyOnWrite();
            C9195cd cdVar3 = (C9195cd) byVar.instance;
            str.getClass();
            cdVar3.f31748a |= 2;
            cdVar3.f31750c = str;
        }
        if ((cdVar.f26181a & 4) != 0) {
            String str2 = cdVar.f26184d;
            byVar.copyOnWrite();
            C9195cd cdVar4 = (C9195cd) byVar.instance;
            str2.getClass();
            cdVar4.f31748a |= 4;
            cdVar4.f31751d = str2;
        }
        if ((cdVar.f26181a & 8) != 0) {
            String str3 = cdVar.f26185e;
            byVar.copyOnWrite();
            C9195cd cdVar5 = (C9195cd) byVar.instance;
            str3.getClass();
            cdVar5.f31748a |= 8;
            cdVar5.f31752e = str3;
        }
        if ((cdVar.f26181a & 16) != 0) {
            boolean z = cdVar.f26186f;
            byVar.copyOnWrite();
            C9195cd cdVar6 = (C9195cd) byVar.instance;
            cdVar6.f31748a |= 16;
            cdVar6.f31753f = z;
        }
        if ((cdVar.f26181a & 32) != 0) {
            boolean z2 = cdVar.f26187g;
            byVar.copyOnWrite();
            C9195cd cdVar7 = (C9195cd) byVar.instance;
            cdVar7.f31748a |= 32;
            cdVar7.f31755h = z2;
        }
        if ((cdVar.f26181a & 64) != 0) {
            boolean z3 = cdVar.f26188h;
            byVar.copyOnWrite();
            C9195cd cdVar8 = (C9195cd) byVar.instance;
            cdVar8.f31748a |= 64;
            cdVar8.f31756i = z3;
        }
        return (C9195cd) byVar.build();
    }

    /* renamed from: c */
    public static C9224df m150975c(Context context, C89291a aVar, C7607dg dgVar) {
        C9223de deVar = (C9223de) C9224df.f31879l.createBuilder();
        if ((dgVar.f26292a & 1) != 0) {
            C8150xj xjVar = dgVar.f26293b;
            if (xjVar == null) {
                xjVar = C8150xj.f28657d;
            }
            String a = aVar.mo83231a(context, xjVar);
            if (a != null) {
                deVar.copyOnWrite();
                C9224df dfVar = (C9224df) deVar.instance;
                dfVar.f31881a |= 2;
                dfVar.f31883c = a;
            }
        }
        C62971cq cqVar = dgVar.f26294c;
        deVar.copyOnWrite();
        C9224df dfVar2 = (C9224df) deVar.instance;
        C62971cq cqVar2 = dfVar2.f31887g;
        if (!cqVar2.mo58948c()) {
            dfVar2.f31887g = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) dfVar2.f31887g);
        if ((dgVar.f26292a & 2) != 0) {
            C7799kj kjVar = dgVar.f26295d;
            if (kjVar == null) {
                kjVar = C7799kj.f27263h;
            }
            deVar.copyOnWrite();
            C9224df dfVar3 = (C9224df) deVar.instance;
            kjVar.getClass();
            dfVar3.f31889i = kjVar;
            dfVar3.f31881a |= 64;
        }
        return (C9224df) deVar.build();
    }

    /* renamed from: d */
    public static C9261ep m150976d(C7617dq dqVar) {
        C9260eo eoVar = (C9260eo) C9261ep.f32026h.createBuilder();
        if ((dqVar.f26319a & 2) != 0) {
            String str = dqVar.f26321c;
            eoVar.copyOnWrite();
            C9261ep epVar = (C9261ep) eoVar.instance;
            str.getClass();
            epVar.f32028a |= 2;
            epVar.f32030c = str;
        }
        if (dqVar.f26325g.size() > 0) {
            eoVar.mo17458a(dqVar.f26325g);
        }
        if ((dqVar.f26319a & 1) != 0) {
            String str2 = dqVar.f26320b;
            eoVar.copyOnWrite();
            C9261ep epVar2 = (C9261ep) eoVar.instance;
            str2.getClass();
            epVar2.f32028a |= 1;
            epVar2.f32029b = str2;
        }
        if ((dqVar.f26319a & 4) != 0) {
            String str3 = dqVar.f26322d;
            eoVar.copyOnWrite();
            C9261ep epVar3 = (C9261ep) eoVar.instance;
            str3.getClass();
            epVar3.f32028a |= 4;
            epVar3.f32031d = str3;
        }
        if ((dqVar.f26319a & 8) != 0) {
            boolean z = dqVar.f26323e;
            eoVar.copyOnWrite();
            C9261ep epVar4 = (C9261ep) eoVar.instance;
            epVar4.f32028a |= 8;
            epVar4.f32032e = z;
        }
        if ((dqVar.f26319a & 16) != 0) {
            boolean z2 = dqVar.f26324f;
            eoVar.copyOnWrite();
            C9261ep epVar5 = (C9261ep) eoVar.instance;
            epVar5.f32028a |= 16;
            epVar5.f32033f = z2;
        }
        return (C9261ep) eoVar.build();
    }

    /* renamed from: e */
    public static C7605de m150977e(C7605de deVar, boolean z) {
        if ((deVar.f26271a & 128) != 0 || !z) {
            return deVar;
        }
        C7598cy cyVar = (C7598cy) deVar.toBuilder();
        cyVar.copyOnWrite();
        C7605de deVar2 = (C7605de) cyVar.instance;
        deVar2.f26271a |= 128;
        deVar2.f26279i = C48004n.f124238a;
        return (C7605de) cyVar.build();
    }

    /* renamed from: f */
    public static boolean m150978f(C9141ad adVar) {
        if ((adVar.f31535a & 8192) == 0 || !adVar.f31550p.startsWith("now-dismiss-entry")) {
            return false;
        }
        String queryParameter = Uri.parse(adVar.f31550p).getQueryParameter("undo");
        return !TextUtils.isEmpty(queryParameter) && Boolean.parseBoolean(queryParameter);
    }

    /* JADX WARNING: type inference failed for: r14v189, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.p489g.p494d.C9141ad m150979g(android.content.Context r12, com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a r13, boolean r14, com.google.p375ai.p378b.C7536ax r15) {
        /*
            r0 = 0
            if (r15 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.apps.g.d.ad r1 = com.google.android.apps.p489g.p494d.C9141ad.f31521K
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.g.d.y r1 = (com.google.android.apps.p489g.p494d.C9281y) r1
            int r2 = r15.f26086a
            r3 = 8
            r2 = r2 & r3
            r4 = 1
            if (r2 == 0) goto L_0x002f
            int r2 = r15.f26093h
            int r2 = com.google.p375ai.p378b.C7535aw.m22777a(r2)
            if (r2 != 0) goto L_0x001d
            r2 = 1
        L_0x001d:
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.g.d.ad r5 = (com.google.android.apps.p489g.p494d.C9141ad) r5
            int r6 = r5.f31535a
            r7 = 33554432(0x2000000, float:9.403955E-38)
            r6 = r6 | r7
            r5.f31535a = r6
            int r2 = r2 + -1
            r5.f31560z = r2
        L_0x002f:
            int r2 = r15.f26088c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            r7 = 2
            r8 = 16
            if (r2 != r6) goto L_0x006d
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.OPEN_URL
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            int r14 = r14.f31520am
            r2.f31537c = r14
            int r14 = r2.f31535a
            r14 = r14 | r4
            r2.f31535a = r14
            int r14 = r15.f26088c
            if (r14 != r6) goto L_0x0054
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.cd r14 = (com.google.p375ai.p378b.C7577cd) r14
            goto L_0x0056
        L_0x0054:
            com.google.ai.b.cd r14 = com.google.p375ai.p378b.C7577cd.f26179i
        L_0x0056:
            com.google.android.apps.g.d.cd r14 = m150974b(r14)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            r14.getClass()
            r2.f31541g = r14
            int r14 = r2.f31535a
            r14 = r14 | r8
            r2.f31535a = r14
            goto L_0x06c8
        L_0x006d:
            r9 = 5
            if (r2 != r9) goto L_0x00a5
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.SECOND_SCREEN
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            int r14 = r14.f31520am
            r2.f31537c = r14
            int r14 = r2.f31535a
            r14 = r14 | r4
            r2.f31535a = r14
            int r14 = r15.f26088c
            if (r14 != r9) goto L_0x008b
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.dg r14 = (com.google.p375ai.p378b.C7607dg) r14
            goto L_0x008d
        L_0x008b:
            com.google.ai.b.dg r14 = com.google.p375ai.p378b.C7607dg.f26290e
        L_0x008d:
            com.google.android.apps.g.d.df r14 = m150975c(r12, r13, r14)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            r14.getClass()
            r2.f31545k = r14
            int r14 = r2.f31535a
            r14 = r14 | 256(0x100, float:3.59E-43)
            r2.f31535a = r14
            goto L_0x06c8
        L_0x00a5:
            r9 = 7
            if (r2 != r9) goto L_0x00dd
            com.google.android.apps.g.d.ac r2 = com.google.android.apps.p489g.p494d.C9140ac.SEARCH
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            int r2 = r2.f31520am
            r6.f31537c = r2
            int r2 = r6.f31535a
            r2 = r2 | r4
            r6.f31535a = r2
            int r2 = r15.f26088c
            if (r2 != r9) goto L_0x00c3
            java.lang.Object r2 = r15.f26089d
            com.google.ai.b.de r2 = (com.google.p375ai.p378b.C7605de) r2
            goto L_0x00c5
        L_0x00c3:
            com.google.ai.b.de r2 = com.google.p375ai.p378b.C7605de.f26269s
        L_0x00c5:
            com.google.ai.b.de r14 = m150977e(r2, r14)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            r14.getClass()
            r2.f31543i = r14
            int r14 = r2.f31535a
            r14 = r14 | 64
            r2.f31535a = r14
            goto L_0x06c8
        L_0x00dd:
            r14 = 11
            if (r2 != r14) goto L_0x0116
            com.google.android.apps.g.d.ac r2 = com.google.android.apps.p489g.p494d.C9140ac.WEB_VIEW
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            int r2 = r2.f31520am
            r6.f31537c = r2
            int r2 = r6.f31535a
            r2 = r2 | r4
            r6.f31535a = r2
            int r2 = r15.f26088c
            if (r2 != r14) goto L_0x00fc
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.dq r14 = (com.google.p375ai.p378b.C7617dq) r14
            goto L_0x00fe
        L_0x00fc:
            com.google.ai.b.dq r14 = com.google.p375ai.p378b.C7617dq.f26317h
        L_0x00fe:
            com.google.android.apps.g.d.ep r14 = m150976d(r14)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            r14.getClass()
            r2.f31546l = r14
            int r14 = r2.f31535a
            r14 = r14 | 512(0x200, float:7.175E-43)
            r2.f31535a = r14
            goto L_0x06c8
        L_0x0116:
            if (r2 != r3) goto L_0x0153
            java.lang.Object r14 = r15.f26089d
            java.lang.String r14 = (java.lang.String) r14
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23678c(r2, r14)
            int r14 = r15.f26088c
            if (r14 != r3) goto L_0x012f
            java.lang.Object r14 = r15.f26089d
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x0131
        L_0x012f:
            java.lang.String r14 = ""
        L_0x0131:
            com.google.common.base.ax r14 = m150988p(r14)
            boolean r2 = r14.mo56113h()
            if (r2 == 0) goto L_0x06c8
            java.lang.Object r14 = r14.mo56107c()
            com.google.android.apps.g.d.ac r14 = (com.google.android.apps.p489g.p494d.C9140ac) r14
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            int r14 = r14.f31520am
            r2.f31537c = r14
            int r14 = r2.f31535a
            r14 = r14 | r4
            r2.f31535a = r14
            goto L_0x06c8
        L_0x0153:
            r14 = 10
            if (r2 != r14) goto L_0x015c
            java.lang.Object r2 = r15.f26089d
            com.google.ai.b.bx r2 = (com.google.p375ai.p378b.C7570bx) r2
            goto L_0x015e
        L_0x015c:
            com.google.ai.b.bx r2 = com.google.p375ai.p378b.C7570bx.f26172c
        L_0x015e:
            int r2 = r2.f26174a
            r2 = r2 & r4
            if (r2 == 0) goto L_0x01c1
            int r1 = r15.f26088c
            if (r1 != r14) goto L_0x016c
            java.lang.Object r1 = r15.f26089d
            com.google.ai.b.bx r1 = (com.google.p375ai.p378b.C7570bx) r1
            goto L_0x016e
        L_0x016c:
            com.google.ai.b.bx r1 = com.google.p375ai.p378b.C7570bx.f26172c
        L_0x016e:
            com.google.ai.b.jw r1 = r1.f26175b
            if (r1 != 0) goto L_0x0174
            com.google.ai.b.jw r1 = com.google.p375ai.p378b.C7785jw.f27245c
        L_0x0174:
            java.lang.String r1 = r1.f27247a
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0190
            int r1 = r15.f26088c
            if (r1 != r14) goto L_0x0185
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.bx r14 = (com.google.p375ai.p378b.C7570bx) r14
            goto L_0x0187
        L_0x0185:
            com.google.ai.b.bx r14 = com.google.p375ai.p378b.C7570bx.f26172c
        L_0x0187:
            com.google.ai.b.jw r14 = r14.f26175b
            if (r14 != 0) goto L_0x018d
            com.google.ai.b.jw r14 = com.google.p375ai.p378b.C7785jw.f27245c
        L_0x018d:
            java.lang.String r14 = r14.f27248b
            goto L_0x019a
        L_0x0190:
            java.lang.String r14 = "https://mail.google.com/mail?extsrc=sync&client=h&plid="
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r14 = r14.concat(r1)
        L_0x019a:
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 == 0) goto L_0x01a1
            return r0
        L_0x01a1:
            int r1 = r15.f26090e
            com.google.ai.b.g r1 = com.google.p375ai.p378b.C7681g.m22802a(r1)
            if (r1 != 0) goto L_0x01ab
            com.google.ai.b.g r1 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x01ab:
            r2 = 2132093506(0x7f152a42, float:1.9827439E38)
            java.lang.String r2 = r12.getString(r2)
            java.lang.String[] r6 = com.google.android.apps.gsa.sidekick.shared.util.C91959aj.f256455a
            com.google.android.apps.g.d.ad r14 = com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150971h(r14, r2, r6, r1)
            com.google.protobuf.bn r14 = r14.toBuilder()
            r1 = r14
            com.google.android.apps.g.d.y r1 = (com.google.android.apps.p489g.p494d.C9281y) r1
            goto L_0x06c8
        L_0x01c1:
            int r14 = r15.f26088c
            r2 = 36
            if (r14 != r2) goto L_0x0212
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.MANAGE_NOTIFICATION_SETTINGS
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            int r14 = r14.f31520am
            r2.f31537c = r14
            int r14 = r2.f31535a
            r14 = r14 | r4
            r2.f31535a = r14
            com.google.android.apps.g.d.bn r14 = com.google.android.apps.p489g.p494d.C9178bn.f31697c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.g.d.bm r14 = (com.google.android.apps.p489g.p494d.C9177bm) r14
            com.google.ai.b.bt r2 = r15.mo16926b()
            java.lang.String r2 = com.google.android.apps.gsa.sidekick.shared.util.C91969at.m150924a(r2, r12)
            if (r2 == 0) goto L_0x01f9
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.android.apps.g.d.bn r6 = (com.google.android.apps.p489g.p494d.C9178bn) r6
            int r9 = r6.f31699a
            r9 = r9 | r4
            r6.f31699a = r9
            r6.f31700b = r2
        L_0x01f9:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.protobuf.bv r14 = r14.build()
            com.google.android.apps.g.d.bn r14 = (com.google.android.apps.p489g.p494d.C9178bn) r14
            r14.getClass()
            r2.f31528F = r14
            int r14 = r2.f31535a
            r14 = r14 | r5
            r2.f31535a = r14
            goto L_0x06c8
        L_0x0212:
            r2 = 14
            if (r14 != r2) goto L_0x0319
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.SHARE
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            int r14 = r14.f31520am
            r6.f31537c = r14
            int r14 = r6.f31535a
            r14 = r14 | r4
            r6.f31535a = r14
            com.google.android.apps.g.d.dl r14 = com.google.android.apps.p489g.p494d.C9230dl.f31903f
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.g.d.dk r14 = (com.google.android.apps.p489g.p494d.C9229dk) r14
            com.google.ai.b.dk r6 = r15.mo16927c()
            boolean r6 = r6.mo16930a()
            if (r6 == 0) goto L_0x0258
            int r6 = r15.f26088c
            if (r6 != r2) goto L_0x0243
            java.lang.Object r6 = r15.f26089d
            com.google.ai.b.dk r6 = (com.google.p375ai.p378b.C7611dk) r6
            goto L_0x0245
        L_0x0243:
            com.google.ai.b.dk r6 = com.google.p375ai.p378b.C7611dk.f26301f
        L_0x0245:
            java.lang.String r6 = r6.f26304b
            r14.copyOnWrite()
            com.google.protobuf.bv r9 = r14.instance
            com.google.android.apps.g.d.dl r9 = (com.google.android.apps.p489g.p494d.C9230dl) r9
            r6.getClass()
            int r10 = r9.f31905a
            r10 = r10 | r4
            r9.f31905a = r10
            r9.f31906b = r6
        L_0x0258:
            int r6 = r15.f26088c
            if (r6 != r2) goto L_0x0261
            java.lang.Object r9 = r15.f26089d
            com.google.ai.b.dk r9 = (com.google.p375ai.p378b.C7611dk) r9
            goto L_0x0263
        L_0x0261:
            com.google.ai.b.dk r9 = com.google.p375ai.p378b.C7611dk.f26301f
        L_0x0263:
            int r9 = r9.f26303a
            r9 = r9 & r7
            if (r9 == 0) goto L_0x0284
            if (r6 != r2) goto L_0x026f
            java.lang.Object r6 = r15.f26089d
            com.google.ai.b.dk r6 = (com.google.p375ai.p378b.C7611dk) r6
            goto L_0x0271
        L_0x026f:
            com.google.ai.b.dk r6 = com.google.p375ai.p378b.C7611dk.f26301f
        L_0x0271:
            java.lang.String r6 = r6.f26305c
            r14.copyOnWrite()
            com.google.protobuf.bv r9 = r14.instance
            com.google.android.apps.g.d.dl r9 = (com.google.android.apps.p489g.p494d.C9230dl) r9
            r6.getClass()
            int r10 = r9.f31905a
            r10 = r10 | r7
            r9.f31905a = r10
            r9.f31907c = r6
        L_0x0284:
            int r6 = r15.f26088c
            if (r6 != r2) goto L_0x028d
            java.lang.Object r9 = r15.f26089d
            com.google.ai.b.dk r9 = (com.google.p375ai.p378b.C7611dk) r9
            goto L_0x028f
        L_0x028d:
            com.google.ai.b.dk r9 = com.google.p375ai.p378b.C7611dk.f26301f
        L_0x028f:
            int r9 = r9.f26303a
            r9 = r9 & 4
            if (r9 == 0) goto L_0x02b2
            if (r6 != r2) goto L_0x029c
            java.lang.Object r6 = r15.f26089d
            com.google.ai.b.dk r6 = (com.google.p375ai.p378b.C7611dk) r6
            goto L_0x029e
        L_0x029c:
            com.google.ai.b.dk r6 = com.google.p375ai.p378b.C7611dk.f26301f
        L_0x029e:
            java.lang.String r6 = r6.f26306d
            r14.copyOnWrite()
            com.google.protobuf.bv r9 = r14.instance
            com.google.android.apps.g.d.dl r9 = (com.google.android.apps.p489g.p494d.C9230dl) r9
            r6.getClass()
            int r10 = r9.f31905a
            r10 = r10 | 4
            r9.f31905a = r10
            r9.f31908d = r6
        L_0x02b2:
            int r6 = r15.f26088c
            if (r6 != r2) goto L_0x02bb
            java.lang.Object r2 = r15.f26089d
            com.google.ai.b.dk r2 = (com.google.p375ai.p378b.C7611dk) r2
            goto L_0x02bd
        L_0x02bb:
            com.google.ai.b.dk r2 = com.google.p375ai.p378b.C7611dk.f26301f
        L_0x02bd:
            com.google.protobuf.cq r2 = r2.f26307e
            java.util.Iterator r2 = r2.iterator()
        L_0x02c3:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x02ff
            java.lang.Object r6 = r2.next()
            com.google.ai.b.di r6 = (com.google.p375ai.p378b.C7609di) r6
            com.google.android.apps.g.d.dj r9 = com.google.android.apps.p489g.p494d.C9228dj.f31899c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.g.d.di r9 = (com.google.android.apps.p489g.p494d.C9227di) r9
            int r10 = r6.f26299a
            if (r10 != r4) goto L_0x02e9
            java.lang.Object r10 = r6.f26300b
            java.lang.String r10 = (java.lang.String) r10
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.android.apps.g.d.dj r11 = (com.google.android.apps.p489g.p494d.C9228dj) r11
            com.google.android.apps.p489g.p494d.C9228dj.m23692a(r11, r10)
        L_0x02e9:
            int r10 = r6.f26299a
            if (r10 != r7) goto L_0x02fb
            java.lang.Object r6 = r6.f26300b
            java.lang.String r6 = (java.lang.String) r6
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.apps.g.d.dj r10 = (com.google.android.apps.p489g.p494d.C9228dj) r10
            com.google.android.apps.p489g.p494d.C9228dj.m23693b(r10, r6)
        L_0x02fb:
            r14.mo17455a(r9)
            goto L_0x02c3
        L_0x02ff:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.protobuf.bv r14 = r14.build()
            com.google.android.apps.g.d.dl r14 = (com.google.android.apps.p489g.p494d.C9230dl) r14
            r14.getClass()
            r2.f31547m = r14
            int r14 = r2.f31535a
            r14 = r14 | 1024(0x400, float:1.435E-42)
            r2.f31535a = r14
            goto L_0x06c8
        L_0x0319:
            r2 = 15
            if (r14 != r2) goto L_0x0354
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.START_WEATHER_IMMERSIVE
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            int r14 = r14.f31520am
            r6.f31537c = r14
            int r14 = r6.f31535a
            r14 = r14 | r4
            r6.f31535a = r14
            int r14 = r15.f26088c
            if (r14 != r2) goto L_0x0338
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.do r14 = (com.google.p375ai.p378b.C7615do) r14
            goto L_0x033a
        L_0x0338:
            com.google.ai.b.do r14 = com.google.p375ai.p378b.C7615do.f26312d
        L_0x033a:
            com.google.android.apps.g.d.eh r14 = m150987o(r14)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            r14.getClass()
            r2.f31552r = r14
            int r14 = r2.f31535a
            r6 = 32768(0x8000, float:4.5918E-41)
            r14 = r14 | r6
            r2.f31535a = r14
            goto L_0x06c8
        L_0x0354:
            r2 = 26
            if (r14 != r2) goto L_0x038e
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.SAVE_FOR_LATER
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            int r14 = r14.f31520am
            r6.f31537c = r14
            int r14 = r6.f31535a
            r14 = r14 | r4
            r6.f31535a = r14
            int r14 = r15.f26088c
            if (r14 != r2) goto L_0x0373
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.cx r14 = (com.google.p375ai.p378b.C7597cx) r14
            goto L_0x0375
        L_0x0373:
            com.google.ai.b.cx r14 = com.google.p375ai.p378b.C7597cx.f26259c
        L_0x0375:
            com.google.android.apps.g.d.dd r14 = m150985m(r14)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            r14.getClass()
            r2.f31554t = r14
            int r14 = r2.f31535a
            r6 = 524288(0x80000, float:7.34684E-40)
            r14 = r14 | r6
            r2.f31535a = r14
            goto L_0x06c8
        L_0x038e:
            if (r14 != r8) goto L_0x0405
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.at r14 = (com.google.p375ai.p378b.C7532at) r14
            int r14 = r14.f26080a
            int r14 = com.google.android.apps.gsa.assist.C9420j.m23951a(r14)
            if (r14 != 0) goto L_0x039d
            goto L_0x03b2
        L_0x039d:
            if (r14 != r6) goto L_0x03b2
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.TRANSLATE
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            int r14 = r14.f31520am
            r2.f31537c = r14
            int r14 = r2.f31535a
            r14 = r14 | r4
            r2.f31535a = r14
            goto L_0x03c4
        L_0x03b2:
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.REISSUE
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            int r14 = r14.f31520am
            r2.f31537c = r14
            int r14 = r2.f31535a
            r14 = r14 | r4
            r2.f31535a = r14
        L_0x03c4:
            com.google.android.apps.g.d.j r14 = com.google.android.apps.p489g.p494d.C9266j.f32060d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.g.d.i r14 = (com.google.android.apps.p489g.p494d.C9265i) r14
            int r2 = r15.f26088c
            if (r2 != r8) goto L_0x03d5
            java.lang.Object r2 = r15.f26089d
            com.google.ai.b.at r2 = (com.google.p375ai.p378b.C7532at) r2
            goto L_0x03d7
        L_0x03d5:
            com.google.ai.b.at r2 = com.google.p375ai.p378b.C7532at.f26078c
        L_0x03d7:
            int r2 = r2.f26080a
            int r2 = com.google.android.apps.gsa.assist.C9420j.m23951a(r2)
            if (r2 != 0) goto L_0x03e0
            r2 = 1
        L_0x03e0:
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.android.apps.g.d.j r6 = (com.google.android.apps.p489g.p494d.C9266j) r6
            int r2 = r2 + -1
            r6.f32063b = r2
            int r2 = r6.f32062a
            r2 = r2 | r4
            r6.f32062a = r2
            int r2 = r15.f26088c
            if (r2 != r8) goto L_0x03f9
            java.lang.Object r2 = r15.f26089d
            com.google.ai.b.at r2 = (com.google.p375ai.p378b.C7532at) r2
            goto L_0x03fb
        L_0x03f9:
            com.google.ai.b.at r2 = com.google.p375ai.p378b.C7532at.f26078c
        L_0x03fb:
            com.google.protobuf.z r2 = r2.f26081b
            r14.mo17459a(r2)
            r1.mo17469c(r14)
            goto L_0x06c8
        L_0x0405:
            r2 = 17
            if (r14 != r2) goto L_0x043a
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.INTEREST_PICKER
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r6, r14)
            com.google.android.apps.g.d.bl r14 = com.google.android.apps.p489g.p494d.C9176bl.f31692c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.g.d.bk r14 = (com.google.android.apps.p489g.p494d.C9175bk) r14
            int r6 = r15.f26088c
            if (r6 != r2) goto L_0x0426
            java.lang.Object r2 = r15.f26089d
            com.google.ai.b.br r2 = (com.google.p375ai.p378b.C7564br) r2
            goto L_0x0428
        L_0x0426:
            com.google.ai.b.br r2 = com.google.p375ai.p378b.C7564br.f26162a
        L_0x0428:
            com.google.ai.b.kj r2 = r2.mo16928a()
            r14.mo17450a(r2)
            com.google.protobuf.bv r14 = r14.build()
            com.google.android.apps.g.d.bl r14 = (com.google.android.apps.p489g.p494d.C9176bl) r14
            r1.mo17474h(r14)
            goto L_0x06c8
        L_0x043a:
            r2 = 24
            if (r14 != r2) goto L_0x045e
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.PLAY_VIDEO_ACTION
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r6, r14)
            int r14 = r15.f26088c
            if (r14 != r2) goto L_0x0453
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.cp r14 = (com.google.p375ai.p378b.C7589cp) r14
            goto L_0x0455
        L_0x0453:
            com.google.ai.b.cp r14 = com.google.p375ai.p378b.C7589cp.f26222o
        L_0x0455:
            com.google.android.apps.g.d.cx r14 = m150984l(r14)
            r1.mo17475i(r14)
            goto L_0x06c8
        L_0x045e:
            r2 = 22
            if (r14 != r2) goto L_0x047e
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.FEED_REACTION_FROM_DEFAULT
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r6, r14)
            int r14 = r15.f26088c
            if (r14 != r2) goto L_0x0477
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.pq r14 = (com.google.p375ai.p378b.C7941pq) r14
            goto L_0x0479
        L_0x0477:
            com.google.ai.b.pq r14 = com.google.p375ai.p378b.C7941pq.f27880i
        L_0x0479:
            r1.mo17476j(r14)
            goto L_0x06c8
        L_0x047e:
            r2 = 37
            if (r14 != r2) goto L_0x04a2
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.IMAGE_VIEWER
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r6, r14)
            int r14 = r15.f26088c
            if (r14 != r2) goto L_0x0497
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.bn r14 = (com.google.p375ai.p378b.C7560bn) r14
            goto L_0x0499
        L_0x0497:
            com.google.ai.b.bn r14 = com.google.p375ai.p378b.C7560bn.f26149g
        L_0x0499:
            com.google.android.apps.g.d.bh r14 = m150983k(r14)
            r1.mo17472f(r14)
            goto L_0x06c8
        L_0x04a2:
            r2 = 39
            if (r14 != r2) goto L_0x04c6
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.SILK_MEDIA_PANE
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r6, r14)
            int r14 = r15.f26088c
            if (r14 != r2) goto L_0x04bb
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.dm r14 = (com.google.p375ai.p378b.C7613dm) r14
            goto L_0x04bd
        L_0x04bb:
            com.google.ai.b.dm r14 = com.google.p375ai.p378b.C7613dm.f26308b
        L_0x04bd:
            com.google.android.apps.g.d.dn r14 = m150986n(r14)
            r1.mo17477k(r14)
            goto L_0x06c8
        L_0x04c6:
            r2 = 38
            if (r14 != r2) goto L_0x04ea
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.DISCOVER_PINNED_CONTENT
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.ad r6 = (com.google.android.apps.p489g.p494d.C9141ad) r6
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r6, r14)
            int r14 = r15.f26088c
            if (r14 != r2) goto L_0x04df
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.bb r14 = (com.google.p375ai.p378b.C7548bb) r14
            goto L_0x04e1
        L_0x04df:
            com.google.ai.b.bb r14 = com.google.p375ai.p378b.C7548bb.f26117c
        L_0x04e1:
            com.google.android.apps.g.d.al r14 = m150982j(r14)
            r1.mo17470d(r14)
            goto L_0x06c8
        L_0x04ea:
            int r14 = r15.f26086a
            r14 = r14 & r4
            if (r14 == 0) goto L_0x08d5
            int r14 = r15.f26090e
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r14 != 0) goto L_0x04f9
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x04f9:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.SAVE_FOR_LATER
            if (r14 != r2) goto L_0x050b
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.SAVE_FOR_LATER
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x050b:
            int r14 = r15.f26090e
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r2 != 0) goto L_0x0515
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x0515:
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.SAVE_FOR_LATER_UNDO
            if (r2 != r6) goto L_0x0527
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.SAVE_FOR_LATER_UNDO
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x0527:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r2 != 0) goto L_0x052f
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x052f:
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.FEED_STORY_LESS
            if (r2 != r6) goto L_0x0541
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.FEED_STORY_LESS
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x0541:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r2 != 0) goto L_0x0549
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x0549:
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.FEED_STORY_LESS_UNDO
            if (r2 != r6) goto L_0x055b
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.FEED_STORY_LESS_UNDO
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x055b:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r2 != 0) goto L_0x0563
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x0563:
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.FEED_STORY_MORE
            if (r2 != r6) goto L_0x0575
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.FEED_STORY_MORE
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x0575:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r2 != 0) goto L_0x057d
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x057d:
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.FEED_STORY_MORE_UNDO
            if (r2 != r6) goto L_0x058f
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.FEED_STORY_MORE_UNDO
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x058f:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r2 != 0) goto L_0x0597
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x0597:
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.AD_DISMISS_SURVEY
            if (r2 != r6) goto L_0x05c9
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.AD_DISMISS_SURVEY
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            int r14 = r15.f26088c
            r2 = 34
            if (r14 != r2) goto L_0x05b2
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.ar r14 = (com.google.p375ai.p378b.C7530ar) r14
            goto L_0x05b4
        L_0x05b2:
            com.google.ai.b.ar r14 = com.google.p375ai.p378b.C7530ar.f26069f
        L_0x05b4:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            r14.getClass()
            r2.f31526D = r14
            int r14 = r2.f31535a
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r14 = r14 | r6
            r2.f31535a = r14
            goto L_0x06c8
        L_0x05c9:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r2 != 0) goto L_0x05d1
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x05d1:
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.FEED_AD_WTA
            if (r2 != r6) goto L_0x0603
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.FEED_AD_WTA
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            int r14 = r15.f26088c
            r2 = 21
            if (r14 != r2) goto L_0x05ec
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.du r14 = (com.google.p375ai.p378b.C7621du) r14
            goto L_0x05ee
        L_0x05ec:
            com.google.ai.b.du r14 = com.google.p375ai.p378b.C7621du.f26333f
        L_0x05ee:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            r14.getClass()
            r2.f31523A = r14
            int r14 = r2.f31535a
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            r14 = r14 | r6
            r2.f31535a = r14
            goto L_0x06c8
        L_0x0603:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r2 != 0) goto L_0x060b
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x060b:
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.FEED_REACTION_FROM_DEFAULT
            if (r2 != r6) goto L_0x061d
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.FEED_REACTION_FROM_DEFAULT
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x061d:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r2 != 0) goto L_0x0625
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x0625:
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.FEED_REACTION_FROM_SET
            if (r2 != r6) goto L_0x0637
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.FEED_REACTION_FROM_SET
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x0637:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r2 != 0) goto L_0x063f
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x063f:
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.FEED_FOLLOW
            if (r2 != r6) goto L_0x0651
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.FEED_FOLLOW
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x0651:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.BILINGUAL_OPT_OUT
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r6 != 0) goto L_0x065b
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x065b:
            if (r2 != r6) goto L_0x066a
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.BILINGUAL_OPT_OUT
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x066a:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.CARD_MENU_OPEN
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r6 != 0) goto L_0x0674
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x0674:
            if (r2 != r6) goto L_0x0683
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.CARD_MENU_OPEN
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            goto L_0x06c8
        L_0x0683:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.REPORT
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r14 != 0) goto L_0x068d
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x068d:
            if (r2 != r14) goto L_0x06bc
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.REPORT
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
            int r14 = r15.f26088c
            r2 = 35
            if (r14 != r2) goto L_0x06a6
            java.lang.Object r14 = r15.f26089d
            com.google.ai.b.ct r14 = (com.google.p375ai.p378b.C7593ct) r14
            goto L_0x06a8
        L_0x06a6:
            com.google.ai.b.ct r14 = com.google.p375ai.p378b.C7593ct.f26245g
        L_0x06a8:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            r14.getClass()
            r2.f31527E = r14
            int r14 = r2.f31535a
            r6 = 1073741824(0x40000000, float:2.0)
            r14 = r14 | r6
            r2.f31535a = r14
            goto L_0x06c8
        L_0x06bc:
            com.google.android.apps.g.d.ac r14 = com.google.android.apps.p489g.p494d.C9140ac.NOOP
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            com.google.android.apps.p489g.p494d.C9141ad.m23676a(r2, r14)
        L_0x06c8:
            int r14 = r15.f26086a
            r14 = r14 & r4
            if (r14 == 0) goto L_0x06dc
            int r14 = r15.f26090e
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.m22802a(r14)
            if (r14 != 0) goto L_0x06d7
            com.google.ai.b.g r14 = com.google.p375ai.p378b.C7681g.DETAILS
        L_0x06d7:
            int r14 = r14.f26835cv
            r1.mo17468b(r14)
        L_0x06dc:
            int r14 = r15.f26086a
            r2 = r14 & 2
            if (r2 == 0) goto L_0x06fe
            com.google.android.apps.g.d.b r14 = com.google.android.apps.p489g.p494d.C9164b.f31642o
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.g.d.a r14 = (com.google.android.apps.p489g.p494d.C9137a) r14
            int r2 = r15.f26091f
            int r2 = com.google.p375ai.p378b.C7539b.m22781a(r2)
            if (r2 != 0) goto L_0x06f3
            r2 = 1
        L_0x06f3:
            int r2 = m150980h(r2)
            r14.mo17445j(r2)
            r1.mo17471e(r14)
            goto L_0x0715
        L_0x06fe:
            r14 = r14 & 4
            if (r14 == 0) goto L_0x0715
            com.google.android.apps.g.d.b r14 = com.google.android.apps.p489g.p494d.C9164b.f31642o
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.g.d.a r14 = (com.google.android.apps.p489g.p494d.C9137a) r14
            java.lang.String r2 = r15.f26092g
            r14.mo17444i(r2)
            r14.mo17446k(r4)
            r1.mo17471e(r14)
        L_0x0715:
            int r14 = r15.f26087b
            r14 = r14 & 4
            if (r14 == 0) goto L_0x072d
            int r14 = r15.f26097l
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.ad r2 = (com.google.android.apps.p489g.p494d.C9141ad) r2
            int r6 = r2.f31535a
            r9 = 134217728(0x8000000, float:3.85186E-34)
            r6 = r6 | r9
            r2.f31535a = r6
            r2.f31524B = r14
        L_0x072d:
            int r14 = r15.f26086a
            r14 = r14 & r8
            if (r14 == 0) goto L_0x0866
            com.google.android.apps.g.d.b r14 = com.google.android.apps.p489g.p494d.C9164b.f31642o
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.g.d.a r14 = (com.google.android.apps.p489g.p494d.C9137a) r14
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x0740
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0740:
            int r2 = r2.f27483h
            if (r2 == 0) goto L_0x0750
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x074a
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x074a:
            int r2 = r2.f27483h
            r14.mo17438c(r2)
            goto L_0x0776
        L_0x0750:
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x0757
            com.google.ai.b.lv r6 = com.google.p375ai.p378b.C7838lv.f27474p
            goto L_0x0758
        L_0x0757:
            r6 = r2
        L_0x0758:
            int r6 = r6.f27482g
            int r6 = com.google.p375ai.p378b.C7840lx.m22875a(r6)
            if (r6 == 0) goto L_0x0776
            if (r6 == r4) goto L_0x0776
            if (r2 != 0) goto L_0x0766
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0766:
            int r2 = r2.f27482g
            int r2 = com.google.p375ai.p378b.C7840lx.m22875a(r2)
            if (r2 != 0) goto L_0x076f
            r2 = 1
        L_0x076f:
            int r2 = m150981i(r12, r2)
            r14.mo17438c(r2)
        L_0x0776:
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x077d
            com.google.ai.b.lv r6 = com.google.p375ai.p378b.C7838lv.f27474p
            goto L_0x077e
        L_0x077d:
            r6 = r2
        L_0x077e:
            int r6 = r6.f27486k
            if (r6 == 0) goto L_0x078b
            if (r2 != 0) goto L_0x0786
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0786:
            int r2 = r2.f27486k
            r14.mo17440e(r2)
        L_0x078b:
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x0792
            com.google.ai.b.lv r6 = com.google.p375ai.p378b.C7838lv.f27474p
            goto L_0x0793
        L_0x0792:
            r6 = r2
        L_0x0793:
            int r6 = r6.f27487l
            if (r6 == 0) goto L_0x07a0
            if (r2 != 0) goto L_0x079b
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x079b:
            int r2 = r2.f27487l
            r14.mo17439d(r2)
        L_0x07a0:
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x07a7
            com.google.ai.b.lv r6 = com.google.p375ai.p378b.C7838lv.f27474p
            goto L_0x07a8
        L_0x07a7:
            r6 = r2
        L_0x07a8:
            int r6 = r6.f27485j
            if (r6 == 0) goto L_0x07b6
            if (r2 != 0) goto L_0x07b0
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x07b0:
            int r2 = r2.f27485j
            r14.mo17437b(r2)
            goto L_0x07d5
        L_0x07b6:
            if (r2 != 0) goto L_0x07bb
            com.google.ai.b.lv r6 = com.google.p375ai.p378b.C7838lv.f27474p
            goto L_0x07bc
        L_0x07bb:
            r6 = r2
        L_0x07bc:
            int r6 = r6.f27484i
            int r6 = com.google.p375ai.p378b.C7840lx.m22875a(r6)
            if (r6 == 0) goto L_0x07d5
            if (r6 == r4) goto L_0x07d5
            if (r2 != 0) goto L_0x07ca
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x07ca:
            int r2 = r2.mo16983j()
            int r2 = m150981i(r12, r2)
            r14.mo17437b(r2)
        L_0x07d5:
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x07db
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x07db:
            boolean r2 = r2.mo16980g()
            if (r2 == 0) goto L_0x07ec
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x07e7
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x07e7:
            int r2 = r2.f27490o
            r14.mo17443h(r2)
        L_0x07ec:
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x07f2
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x07f2:
            boolean r2 = r2.mo16977d()
            if (r2 == 0) goto L_0x0809
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x07fe
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x07fe:
            int r2 = r2.mo16982i()
            int r2 = m150980h(r2)
            r14.mo17442g(r2)
        L_0x0809:
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x080f
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x080f:
            boolean r2 = r2.mo16978e()
            if (r2 == 0) goto L_0x0822
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x081b
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x081b:
            java.lang.String r2 = r2.mo16979f()
            r14.mo17441f(r2)
        L_0x0822:
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x0828
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0828:
            boolean r2 = r2.mo16974a()
            if (r2 == 0) goto L_0x083f
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x0834
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0834:
            int r2 = r2.mo16981h()
            int r2 = m150980h(r2)
            r14.mo17445j(r2)
        L_0x083f:
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x0845
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0845:
            boolean r2 = r2.mo16975b()
            if (r2 == 0) goto L_0x0858
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x0851
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x0851:
            java.lang.String r2 = r2.mo16976c()
            r14.mo17444i(r2)
        L_0x0858:
            com.google.ai.b.lv r2 = r15.f26094i
            if (r2 != 0) goto L_0x085e
            com.google.ai.b.lv r2 = com.google.p375ai.p378b.C7838lv.f27474p
        L_0x085e:
            boolean r2 = r2.f27488m
            r14.mo17446k(r2)
            r1.mo17471e(r14)
        L_0x0866:
            int r14 = r15.f26086a
            r14 = r14 & 32
            if (r14 == 0) goto L_0x0884
            com.google.android.apps.g.d.b r14 = com.google.android.apps.p489g.p494d.C9164b.f31642o
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.g.d.a r14 = (com.google.android.apps.p489g.p494d.C9137a) r14
            com.google.ai.b.lb r2 = r15.mo16925a()
            r14.mo17436a(r2)
            com.google.protobuf.bv r14 = r14.build()
            com.google.android.apps.g.d.b r14 = (com.google.android.apps.p489g.p494d.C9164b) r14
            r1.mo17467a(r14)
        L_0x0884:
            int r14 = r15.f26086a
            r14 = r14 & r5
            if (r14 == 0) goto L_0x08a8
            com.google.ai.b.xj r14 = r15.f26095j
            if (r14 != 0) goto L_0x088f
            com.google.ai.b.xj r14 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x088f:
            java.lang.String r12 = r13.mo83231a(r12, r14)
            if (r12 == 0) goto L_0x08a8
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r14 = 0
            r13[r14] = r0
            java.lang.String r12 = java.lang.String.format(r12, r13)
            r1.copyOnWrite()
            com.google.protobuf.bv r13 = r1.instance
            com.google.android.apps.g.d.ad r13 = (com.google.android.apps.p489g.p494d.C9141ad) r13
            com.google.android.apps.p489g.p494d.C9141ad.m23677b(r13, r12)
        L_0x08a8:
            int r12 = r15.f26087b
            r12 = r12 & r7
            if (r12 == 0) goto L_0x08b6
            com.google.ai.b.yk r12 = r15.f26096k
            if (r12 != 0) goto L_0x08b3
            com.google.ai.b.yk r12 = com.google.p375ai.p378b.C8178yk.f28736g
        L_0x08b3:
            r1.mo17479m(r12)
        L_0x08b6:
            int r12 = r15.f26087b
            r12 = r12 & r3
            if (r12 == 0) goto L_0x08c4
            com.google.ai.b.bp r12 = r15.f26098m
            if (r12 != 0) goto L_0x08c1
            com.google.ai.b.bp r12 = com.google.p375ai.p378b.C7562bp.f26157c
        L_0x08c1:
            r1.mo17473g(r12)
        L_0x08c4:
            int r12 = r15.f26087b
            r12 = r12 & r8
            if (r12 == 0) goto L_0x08ce
            java.lang.String r12 = r15.f26099n
            r1.mo17478l(r12)
        L_0x08ce:
            com.google.protobuf.bv r12 = r1.build()
            com.google.android.apps.g.d.ad r12 = (com.google.android.apps.p489g.p494d.C9141ad) r12
            return r12
        L_0x08d5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.util.C91992k.m150979g(android.content.Context, com.google.android.apps.gsa.shared.au.b.a, boolean, com.google.ai.b.ax):com.google.android.apps.g.d.ad");
    }

    /* renamed from: h */
    public static int m150980h(int i) {
        switch (i - 1) {
            case 1:
                return R.drawable.quantum_ic_call_white_24;
            case 2:
                return R.drawable.ic_message;
            case 3:
                return R.drawable.ic_email;
            case 4:
                return R.drawable.ic_play;
            case 5:
                return R.drawable.ic_navigation;
            case 6:
                return R.drawable.ic_action_pin_pressed;
            case 7:
                return R.drawable.ic_action_directions_pressed;
            case 9:
                return R.drawable.ic_done_white_lighthouse_action_card;
            case 10:
                return R.drawable.ic_action_alarm_pressed;
            case 11:
                return R.drawable.ic_action_edit_pressed;
            case 12:
                return R.drawable.ic_event;
            case 13:
                return R.drawable.ic_shopping_cart;
            case 14:
                return R.drawable.ic_keep;
            case 15:
                return R.drawable.ic_menu_add_pressed;
            case 16:
                return R.drawable.ic_taxi;
            case 17:
                return R.drawable.ic_directions_car;
            case 18:
                return R.drawable.ic_reservation;
            case 19:
                return R.drawable.ic_plane;
            case 20:
                return R.drawable.ic_hotel;
            case 21:
                return R.drawable.ic_reminder;
            case 22:
            case 32:
                return R.drawable.quantum_ic_local_restaurant_white_24;
            case 23:
                return R.drawable.ic_action_paynow_normal;
            case 24:
                return R.drawable.ic_baseball;
            case 25:
                return R.drawable.ic_basketball;
            case 26:
                return R.drawable.ic_cricket;
            case 27:
                return R.drawable.ic_football;
            case 28:
                return R.drawable.ic_hockey;
            case 29:
                return R.drawable.ic_soccer;
            case 30:
                return R.drawable.ic_rugby;
            case 31:
                return R.drawable.ic_local_shipping;
            case 33:
                return R.drawable.quantum_ic_business_white_24;
            case 34:
                return R.drawable.quantum_ic_movie_white_24;
            case 35:
                return R.drawable.quantum_ic_theaters_white_24;
            case 36:
                return R.drawable.quantum_ic_place_white_24;
            case 37:
                return R.drawable.quantum_ic_phone_white_24;
            case 38:
                return R.drawable.quantum_ic_arrow_forward_white_24;
            case 39:
                return R.drawable.ic_lotic_stock_up;
            case 40:
                return R.drawable.ic_lotic_stock_down;
            case 41:
                return R.drawable.ic_dash;
            case 42:
                return R.drawable.quantum_ic_drive_text_white_24;
            case 43:
            case 103:
                return R.drawable.quantum_ic_history_white_24;
            case 44:
                return R.drawable.quantum_ic_store_white_24;
            case 45:
                return R.drawable.quantum_ic_star_white_24;
            case 46:
                return R.drawable.quantum_ic_shopping_cart_white_24;
            case 47:
                return R.drawable.quantum_ic_shopping_basket_white_24;
            case 48:
                return R.drawable.ic_tag;
            case 49:
                return R.drawable.ic_stock;
            case 50:
                return R.drawable.quantum_ic_directions_bike_white_24;
            case 51:
                return R.drawable.quantum_ic_directions_transit_white_24;
            case 52:
                return R.drawable.quantum_ic_directions_walk_white_24;
            case 53:
                return R.drawable.product_logo_dialer_color_24;
            case 54:
                return R.drawable.product_logo_maps_color_24;
            case 55:
                return R.drawable.quantum_ic_news_white_24;
            case 56:
                return R.drawable.quantum_ic_person_white_24;
            case 57:
                return R.drawable.ic_youtube_color;
            case 59:
                return R.drawable.quantum_ic_auto_fix_white_24;
            case 60:
                return R.drawable.quantum_ic_block_white_24;
            case 61:
                return R.drawable.quantum_gm_ic_feedback_white_24;
            case 62:
                return R.drawable.quantum_ic_report_white_24;
            case 63:
                return R.drawable.quantum_ic_visibility_white_24;
            case 64:
                return R.drawable.quantum_gm_ic_visibility_off_white_24;
            case 65:
                return R.drawable.ic_temp;
            case 66:
                return R.drawable.quantum_ic_thumb_down_white_24;
            case 67:
                return R.drawable.quantum_ic_highlight_remove_white_24;
            case 68:
                return R.drawable.quantum_ic_play_arrow_white_24;
            case 69:
                return R.drawable.quantum_ic_attach_money_white_24;
            case 70:
                return R.drawable.quantum_ic_access_time_white_24;
            case 71:
                return R.drawable.quantum_ic_add_alert_white_24;
            case 72:
                return R.drawable.quantum_ic_album_white_24;
            case 73:
                return R.drawable.quantum_ic_book_white_24;
            case 74:
                return R.drawable.ic_white_googleg;
            case 75:
                return R.drawable.quantum_ic_card_travel_white_24;
            case 76:
                return R.drawable.quantum_ic_trending_up_white_24;
            case 77:
                return R.drawable.ic_video_youtube;
            case 78:
                return R.drawable.product_logo_gmail_color_24;
            case 79:
                return R.mipmap.ic_launcher_google_search;
            case 80:
                return R.drawable.quantum_ic_event_grey600_24;
            case 81:
                return R.drawable.product_logo_google_plus_color_24;
            case 82:
                return R.drawable.product_logo_translate_color_24;
            case 83:
                return R.drawable.product_logo_travel_flights_color_24;
            case 84:
                return R.drawable.product_logo_travel_hotels_color_24;
            case 85:
                return R.drawable.product_logo_shopping_color_24;
            case 86:
                return R.drawable.quantum_ic_music_note_white_24;
            case 87:
                return R.drawable.quantum_ic_artist_white_24;
            case 88:
            case 98:
                return R.drawable.quantum_ic_directions_car_white_24;
            case 89:
                return R.drawable.quantum_ic_library_books_white_24;
            case 90:
                return R.drawable.quantum_ic_local_offer_white_24;
            case 91:
                return R.drawable.quantum_ic_local_pharmacy_white_24;
            case 92:
                return R.drawable.quantum_ic_school_white_24;
            case 93:
                return R.drawable.quantum_ic_palette_white_24;
            case 94:
                return R.drawable.quantum_ic_web_white_24;
            case 95:
                return R.drawable.quantum_ic_search_white_24;
            case 96:
                return R.drawable.quantum_ic_hangout_white_24;
            case 97:
                return R.drawable.quantum_ic_wb_sunny_white_24;
            case 99:
                return R.drawable.quantum_ic_home_white_24;
            case 100:
                return R.drawable.quantum_ic_work_white_24;
            case 101:
                return R.drawable.quantum_ic_mic_white_24;
            case 102:
                return R.drawable.quantum_ic_translate_white_24;
            case 104:
                return R.drawable.amp_icon_12;
            case 105:
                return R.drawable.amp_icon_16;
            case 106:
                return R.drawable.amp_search_icon_12;
            case 107:
                return R.drawable.quantum_ic_chevron_right_black_24;
            case 108:
                return R.drawable.quantum_ic_chevron_left_black_24;
            case 109:
                return R.drawable.quantum_ic_close_black_24;
            case 110:
                return R.drawable.quantum_ic_arrow_forward_grey600_24;
            case 111:
                return R.drawable.quantum_ic_arrow_back_grey600_24;
            case 112:
                return R.drawable.quantum_ic_add_circle_white_24;
            case 113:
                return R.drawable.quantum_gm_ic_share_white_24;
            case 114:
                return R.drawable.quantum_ic_arrow_left_white_24;
            case 115:
                return R.drawable.quantum_ic_arrow_right_white_24;
            case 118:
                return R.drawable.ic_add_inline_blue;
            case 119:
                return R.drawable.ic_check_inline_blue;
            case 120:
                return R.drawable.quantum_ic_live_tv_white_24;
            case 121:
                return R.drawable.quantum_ic_people_white_24;
            case 122:
                return R.drawable.quantum_ic_show_chart_white_24;
            case 123:
                return R.drawable.quantum_ic_local_dining_white_24;
            case 124:
                return R.drawable.quantum_ic_public_white_24;
            case 125:
                return R.drawable.quantum_ic_brush_white_24;
            case 126:
                return R.drawable.quantum_ic_arrow_upward_white_24;
            case 127:
                return R.drawable.quantum_ic_arrow_downward_white_24;
            case 128:
                return R.drawable.quantum_gm_ic_bookmark_border_white_24;
            case 129:
                return R.drawable.quantum_gm_ic_bookmark_white_24;
            case 130:
                return R.drawable.ic_react_more;
            case 132:
                return R.drawable.quantum_ic_info_grey600_24;
            case 133:
                Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
                if (locale.getLanguage().equals(new Locale("de").getLanguage())) {
                    return R.drawable.ic_ad_badge_de;
                }
                if (locale.getLanguage().equals(new Locale("ja").getLanguage())) {
                    return R.drawable.ic_ad_badge_ja;
                }
                return locale.getLanguage().equals(new Locale("pt").getLanguage()) ? R.drawable.ic_ad_badge_pt : R.drawable.ic_ad_badge;
            case 134:
                return R.drawable.ic_react_neutral;
            case 136:
                return R.drawable.ic_filled_bolt_amp_icon;
            case 137:
                return R.drawable.neutral_dark;
            case 138:
                return R.drawable.dark_more;
            case 139:
                return R.drawable.ic_interest_mark;
            case 140:
                return R.drawable.quantum_gm_ic_tune_white_24;
            case 141:
                return R.drawable.ic_stamp;
            case 142:
                return R.drawable.ic_logo_play_prism;
            case 143:
                return R.drawable.quantum_ic_more_vert_white_24;
            case 144:
                return R.drawable.quantum_ic_video_settings_black_24;
            case 145:
                return R.drawable.ad_badge;
            case 146:
                return R.drawable.quantum_ic_favorite_white_24;
            case 147:
                return R.drawable.quantum_ic_favorite_border_white_24;
            case 148:
                return R.drawable.quantum_ic_outlined_flag_black_24;
            case 149:
                return R.drawable.quantum_gm_ic_thumb_down_white_24;
            default:
                return R.drawable.ic_action_open_pressed;
        }
    }

    /* renamed from: i */
    public static int m150981i(Context context, int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return context.getResources().getColor(R.color.lotic_icon_background_good);
        }
        if (i2 == 2) {
            return context.getResources().getColor(R.color.lotic_icon_background_critical);
        }
        if (i2 == 3) {
            return context.getResources().getColor(R.color.lotic_icon_background_warning);
        }
        if (i2 != 4) {
            return 0;
        }
        return context.getResources().getColor(R.color.lotic_icon_background_default);
    }

    /* renamed from: j */
    private static C9149al m150982j(C7548bb bbVar) {
        C9148ak akVar = (C9148ak) C9149al.f31584c.createBuilder();
        C57315dp dpVar = bbVar.f26120b;
        if (dpVar == null) {
            dpVar = C57315dp.f152986c;
        }
        akVar.copyOnWrite();
        C9149al alVar = (C9149al) akVar.instance;
        dpVar.getClass();
        alVar.f31587b = dpVar;
        alVar.f31586a |= 1;
        return (C9149al) akVar.build();
    }

    /* renamed from: k */
    private static C9172bh m150983k(C7560bn bnVar) {
        C9165ba baVar = (C9165ba) C9172bh.f31680g.createBuilder();
        if ((bnVar.f26151a & 1) != 0) {
            int i = bnVar.f26153c;
            baVar.copyOnWrite();
            C9172bh bhVar = (C9172bh) baVar.instance;
            bhVar.f31682a |= 1;
            bhVar.f31684c = i;
        }
        Iterable iterable = (Iterable) Collection.EL.stream(bnVar.f26152b).map(C91989h.f256484a).collect(Collectors.toList());
        baVar.copyOnWrite();
        C9172bh bhVar2 = (C9172bh) baVar.instance;
        C62971cq cqVar = bhVar2.f31683b;
        if (!cqVar.mo58948c()) {
            bhVar2.f31683b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bhVar2.f31683b);
        if ((bnVar.f26151a & 2) != 0) {
            C7559bm bmVar = bnVar.f26154d;
            if (bmVar == null) {
                bmVar = C7559bm.f26143e;
            }
            C9170bf bfVar = (C9170bf) C9171bg.f31674e.createBuilder();
            if ((bmVar.f26145a & 1) != 0) {
                String str = bmVar.f26146b;
                bfVar.copyOnWrite();
                C9171bg bgVar = (C9171bg) bfVar.instance;
                str.getClass();
                bgVar.f31676a |= 1;
                bgVar.f31677b = str;
            }
            if ((bmVar.f26145a & 2) != 0) {
                boolean z = bmVar.f26147c;
                bfVar.copyOnWrite();
                C9171bg bgVar2 = (C9171bg) bfVar.instance;
                bgVar2.f31676a |= 2;
                bgVar2.f31678c = z;
            }
            if ((bmVar.f26145a & 4) != 0) {
                boolean z2 = bmVar.f26148d;
                bfVar.copyOnWrite();
                C9171bg bgVar3 = (C9171bg) bfVar.instance;
                bgVar3.f31676a |= 4;
                bgVar3.f31679d = z2;
            }
            C9171bg bgVar4 = (C9171bg) bfVar.build();
            baVar.copyOnWrite();
            C9172bh bhVar3 = (C9172bh) baVar.instance;
            bgVar4.getClass();
            bhVar3.f31685d = bgVar4;
            bhVar3.f31682a |= 2;
        }
        if ((bnVar.f26151a & 4) != 0) {
            String str2 = bnVar.f26155e;
            baVar.copyOnWrite();
            C9172bh bhVar4 = (C9172bh) baVar.instance;
            str2.getClass();
            bhVar4.f31682a |= 4;
            bhVar4.f31686e = str2;
        }
        if ((bnVar.f26151a & 8) != 0) {
            boolean z3 = bnVar.f26156f;
            baVar.copyOnWrite();
            C9172bh bhVar5 = (C9172bh) baVar.instance;
            bhVar5.f31682a |= 8;
            bhVar5.f31687f = z3;
        }
        return (C9172bh) baVar.build();
    }

    /* renamed from: l */
    private static C9215cx m150984l(C7589cp cpVar) {
        C7588co coVar;
        C7586cm cmVar;
        C7580cg cgVar;
        C7580cg cgVar2;
        C7580cg cgVar3;
        C7586cm cmVar2;
        C7588co coVar2;
        C9204cm cmVar3 = (C9204cm) C9215cx.f31837o.createBuilder();
        if ((cpVar.f26224a & 1024) != 0) {
            float f = cpVar.f26237n;
            cmVar3.copyOnWrite();
            C9215cx cxVar = (C9215cx) cmVar3.instance;
            cxVar.f31839a |= 1024;
            cxVar.f31852n = f;
        }
        int i = 1;
        if (cpVar.f26225b == 1) {
            coVar = (C7588co) cpVar.f26226c;
        } else {
            coVar = C7588co.f26218c;
        }
        if ((coVar.f26220a & 1) != 0) {
            C9213cv cvVar = (C9213cv) C9214cw.f31833c.createBuilder();
            if (cpVar.f26225b == 1) {
                coVar2 = (C7588co) cpVar.f26226c;
            } else {
                coVar2 = C7588co.f26218c;
            }
            String str = coVar2.f26221b;
            cvVar.copyOnWrite();
            C9214cw cwVar = (C9214cw) cvVar.instance;
            str.getClass();
            cwVar.f31835a |= 1;
            cwVar.f31836b = str;
            cmVar3.copyOnWrite();
            C9215cx cxVar2 = (C9215cx) cmVar3.instance;
            C9214cw cwVar2 = (C9214cw) cvVar.build();
            cwVar2.getClass();
            cxVar2.f31841c = cwVar2;
            cxVar2.f31840b = 1;
        }
        if (cpVar.f26225b == 2) {
            cmVar = (C7586cm) cpVar.f26226c;
        } else {
            cmVar = C7586cm.f26206k;
        }
        if ((cmVar.f26208a & 1) != 0) {
            if (cpVar.f26225b == 2) {
                cmVar2 = (C7586cm) cpVar.f26226c;
            } else {
                cmVar2 = C7586cm.f26206k;
            }
            C9211ct ctVar = (C9211ct) C9212cu.f31820l.createBuilder();
            String str2 = cmVar2.f26209b;
            ctVar.copyOnWrite();
            C9212cu cuVar = (C9212cu) ctVar.instance;
            str2.getClass();
            cuVar.f31822a |= 1;
            cuVar.f31823b = str2;
            if ((cmVar2.f26208a & 2) != 0) {
                int i2 = cmVar2.f26210c;
                ctVar.copyOnWrite();
                C9212cu cuVar2 = (C9212cu) ctVar.instance;
                cuVar2.f31822a |= 2;
                cuVar2.f31824c = i2;
            }
            if ((cmVar2.f26208a & 32) != 0) {
                String str3 = cmVar2.f26216i;
                ctVar.copyOnWrite();
                C9212cu cuVar3 = (C9212cu) ctVar.instance;
                str3.getClass();
                cuVar3.f31822a |= 64;
                cuVar3.f31831j = str3;
            }
            if ((cmVar2.f26208a & 64) != 0) {
                String str4 = cmVar2.f26217j;
                ctVar.copyOnWrite();
                C9212cu cuVar4 = (C9212cu) ctVar.instance;
                str4.getClass();
                cuVar4.f31822a |= 128;
                cuVar4.f31832k = str4;
            }
            C62971cq cqVar = cmVar2.f26211d;
            ctVar.copyOnWrite();
            C9212cu cuVar5 = (C9212cu) ctVar.instance;
            C62971cq cqVar2 = cuVar5.f31825d;
            if (!cqVar2.mo58948c()) {
                cuVar5.f31825d = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) cuVar5.f31825d);
            if ((cmVar2.f26208a & 4) != 0) {
                String str5 = cmVar2.f26212e;
                ctVar.copyOnWrite();
                C9212cu cuVar6 = (C9212cu) ctVar.instance;
                str5.getClass();
                cuVar6.f31822a |= 4;
                cuVar6.f31826e = str5;
            }
            for (C7584ck ckVar : cmVar2.f26215h) {
                C9207cp cpVar2 = (C9207cp) C9210cs.f31814e.createBuilder();
                if ((ckVar.f26202a & 1) != 0) {
                    String str6 = ckVar.f26203b;
                    cpVar2.copyOnWrite();
                    C9210cs csVar = (C9210cs) cpVar2.instance;
                    str6.getClass();
                    csVar.f31816a |= 1;
                    csVar.f31817b = str6;
                }
                if ((ckVar.f26202a & 2) != 0) {
                    C58817ah ahVar = C91991j.f256485a;
                    C7583cj a = C7583cj.m22785a(ckVar.f26204c);
                    if (a == null) {
                        a = C7583cj.NONE;
                    }
                    C9209cr a2 = ((C91976b) ahVar).apply(a);
                    cpVar2.copyOnWrite();
                    C9210cs csVar2 = (C9210cs) cpVar2.instance;
                    csVar2.f31818c = a2.f31813d;
                    csVar2.f31816a |= 2;
                }
                if ((ckVar.f26202a & 4) != 0) {
                    String str7 = ckVar.f26205d;
                    cpVar2.copyOnWrite();
                    C9210cs csVar3 = (C9210cs) cpVar2.instance;
                    str7.getClass();
                    csVar3.f31816a |= 4;
                    csVar3.f31819d = str7;
                }
                C9210cs csVar4 = (C9210cs) cpVar2.build();
                ctVar.copyOnWrite();
                C9212cu cuVar7 = (C9212cu) ctVar.instance;
                csVar4.getClass();
                C62971cq cqVar3 = cuVar7.f31830i;
                if (!cqVar3.mo58948c()) {
                    cuVar7.f31830i = C62942bv.mutableCopy(cqVar3);
                }
                cuVar7.f31830i.add(csVar4);
            }
            if ((cmVar2.f26208a & 8) != 0) {
                String str8 = cmVar2.f26213f;
                ctVar.copyOnWrite();
                C9212cu cuVar8 = (C9212cu) ctVar.instance;
                str8.getClass();
                cuVar8.f31822a |= 8;
                cuVar8.f31827f = str8;
            }
            if ((cmVar2.f26208a & 16) != 0) {
                int a3 = C54782b.m87527a(cmVar2.f26214g);
                if (a3 == 0) {
                    a3 = 1;
                }
                ctVar.copyOnWrite();
                C9212cu cuVar9 = (C9212cu) ctVar.instance;
                cuVar9.f31829h = a3 - 1;
                cuVar9.f31822a |= 32;
            }
            cmVar3.copyOnWrite();
            C9215cx cxVar3 = (C9215cx) cmVar3.instance;
            C9212cu cuVar10 = (C9212cu) ctVar.build();
            cuVar10.getClass();
            cxVar3.f31841c = cuVar10;
            cxVar3.f31840b = 2;
        }
        C7580cg cgVar4 = cpVar.f26227d;
        if (cgVar4 == null) {
            cgVar4 = C7580cg.f26189d;
        }
        if ((cgVar4.f26191a & 1) != 0) {
            C9205cn cnVar = (C9205cn) C9206co.f31803d.createBuilder();
            C7580cg cgVar5 = cpVar.f26227d;
            if (cgVar5 == null) {
                cgVar5 = C7580cg.f26189d;
            }
            String str9 = cgVar5.f26192b;
            cnVar.copyOnWrite();
            C9206co coVar3 = (C9206co) cnVar.instance;
            str9.getClass();
            coVar3.f31805a |= 1;
            coVar3.f31806b = str9;
            C7580cg cgVar6 = cpVar.f26227d;
            if (cgVar6 == null) {
                cgVar6 = C7580cg.f26189d;
            }
            String str10 = cgVar6.f26193c;
            cnVar.copyOnWrite();
            C9206co coVar4 = (C9206co) cnVar.instance;
            str10.getClass();
            coVar4.f31805a |= 2;
            coVar4.f31807c = str10;
            C9206co coVar5 = (C9206co) cnVar.build();
            cmVar3.copyOnWrite();
            C9215cx cxVar4 = (C9215cx) cmVar3.instance;
            coVar5.getClass();
            cxVar4.f31842d = coVar5;
            cxVar4.f31839a |= 8;
        }
        if (cpVar.f26225b == 12) {
            cgVar = (C7580cg) cpVar.f26226c;
        } else {
            cgVar = C7580cg.f26189d;
        }
        if ((cgVar.f26191a & 1) != 0) {
            C9205cn cnVar2 = (C9205cn) C9206co.f31803d.createBuilder();
            if (cpVar.f26225b == 12) {
                cgVar2 = (C7580cg) cpVar.f26226c;
            } else {
                cgVar2 = C7580cg.f26189d;
            }
            String str11 = cgVar2.f26192b;
            cnVar2.copyOnWrite();
            C9206co coVar6 = (C9206co) cnVar2.instance;
            str11.getClass();
            coVar6.f31805a |= 1;
            coVar6.f31806b = str11;
            if (cpVar.f26225b == 12) {
                cgVar3 = (C7580cg) cpVar.f26226c;
            } else {
                cgVar3 = C7580cg.f26189d;
            }
            String str12 = cgVar3.f26193c;
            cnVar2.copyOnWrite();
            C9206co coVar7 = (C9206co) cnVar2.instance;
            str12.getClass();
            coVar7.f31805a = 2 | coVar7.f31805a;
            coVar7.f31807c = str12;
            C9206co coVar8 = (C9206co) cnVar2.build();
            cmVar3.copyOnWrite();
            C9215cx cxVar5 = (C9215cx) cmVar3.instance;
            coVar8.getClass();
            cxVar5.f31841c = coVar8;
            cxVar5.f31840b = 12;
        }
        if ((cpVar.f26224a & 16) != 0) {
            float f2 = cpVar.f26228e;
            cmVar3.copyOnWrite();
            C9215cx cxVar6 = (C9215cx) cmVar3.instance;
            cxVar6.f31839a |= 16;
            cxVar6.f31843e = f2;
        }
        C62971cq cqVar4 = cpVar.f26229f;
        cmVar3.copyOnWrite();
        C9215cx cxVar7 = (C9215cx) cmVar3.instance;
        C62971cq cqVar5 = cxVar7.f31844f;
        if (!cqVar5.mo58948c()) {
            cxVar7.f31844f = C62942bv.mutableCopy(cqVar5);
        }
        C62947c.addAll((Iterable) cqVar4, (List) cxVar7.f31844f);
        C62971cq cqVar6 = cpVar.f26231h;
        cmVar3.copyOnWrite();
        C9215cx cxVar8 = (C9215cx) cmVar3.instance;
        C62971cq cqVar7 = cxVar8.f31846h;
        if (!cqVar7.mo58948c()) {
            cxVar8.f31846h = C62942bv.mutableCopy(cqVar7);
        }
        C62947c.addAll((Iterable) cqVar6, (List) cxVar8.f31846h);
        C62971cq cqVar8 = cpVar.f26232i;
        cmVar3.copyOnWrite();
        C9215cx cxVar9 = (C9215cx) cmVar3.instance;
        C62971cq cqVar9 = cxVar9.f31847i;
        if (!cqVar9.mo58948c()) {
            cxVar9.f31847i = C62942bv.mutableCopy(cqVar9);
        }
        C62947c.addAll((Iterable) cqVar8, (List) cxVar9.f31847i);
        if ((cpVar.f26224a & 64) != 0) {
            String str13 = cpVar.f26233j;
            cmVar3.copyOnWrite();
            C9215cx cxVar10 = (C9215cx) cmVar3.instance;
            str13.getClass();
            cxVar10.f31839a |= 64;
            cxVar10.f31848j = str13;
        }
        if ((cpVar.f26224a & 128) != 0) {
            int a4 = C57056d.m88255a(cpVar.f26234k);
            if (a4 != 0) {
                i = a4;
            }
            cmVar3.copyOnWrite();
            C9215cx cxVar11 = (C9215cx) cmVar3.instance;
            cxVar11.f31849k = i - 1;
            cxVar11.f31839a |= 128;
        }
        if ((cpVar.f26224a & 256) != 0) {
            String str14 = cpVar.f26235l;
            cmVar3.copyOnWrite();
            C9215cx cxVar12 = (C9215cx) cmVar3.instance;
            str14.getClass();
            cxVar12.f31839a |= 256;
            cxVar12.f31850l = str14;
        }
        boolean z = cpVar.f26230g;
        cmVar3.copyOnWrite();
        C9215cx cxVar13 = (C9215cx) cmVar3.instance;
        cxVar13.f31839a |= 32;
        cxVar13.f31845g = z;
        boolean z2 = cpVar.f26236m;
        cmVar3.copyOnWrite();
        C9215cx cxVar14 = (C9215cx) cmVar3.instance;
        cxVar14.f31839a |= 512;
        cxVar14.f31851m = z2;
        return (C9215cx) cmVar3.build();
    }

    /* renamed from: n */
    private static C9232dn m150986n(C7613dm dmVar) {
        C9231dm dmVar2 = (C9231dm) C9232dn.f31910c.createBuilder();
        String str = dmVar.f26310a;
        dmVar2.copyOnWrite();
        C9232dn dnVar = (C9232dn) dmVar2.instance;
        str.getClass();
        dnVar.f31912a |= 1;
        dnVar.f31913b = str;
        return (C9232dn) dmVar2.build();
    }

    /* renamed from: o */
    private static C9253eh m150987o(C7615do doVar) {
        C9252eg egVar = (C9252eg) C9253eh.f31995d.createBuilder();
        if ((doVar.f26314a & 1) != 0) {
            C7805kp kpVar = doVar.f26315b;
            if (kpVar == null) {
                kpVar = C7805kp.f27284h;
            }
            egVar.copyOnWrite();
            C9253eh ehVar = (C9253eh) egVar.instance;
            kpVar.getClass();
            ehVar.f31998b = kpVar;
            ehVar.f31997a |= 1;
        }
        if ((doVar.f26314a & 2) != 0) {
            String str = doVar.f26316c;
            egVar.copyOnWrite();
            C9253eh ehVar2 = (C9253eh) egVar.instance;
            str.getClass();
            ehVar2.f31997a |= 2;
            ehVar2.f31999c = str;
        }
        return (C9253eh) egVar.build();
    }

    /* renamed from: p */
    private static C58833ax m150988p(String str) {
        if (str.startsWith("now-optin")) {
            return C58833ax.m90834k(C9140ac.START_OPT_IN);
        }
        if (str.startsWith("now-search")) {
            return C58833ax.m90834k(C9140ac.CUSTOM_SEARCH);
        }
        if (str.startsWith("now-customize")) {
            return C58833ax.m90834k(C9140ac.START_CUSTOMIZE_GOOGLE_NOW);
        }
        if (str.startsWith("video-setting")) {
            return C58833ax.m90834k(C9140ac.OPEN_VIDEO_SETTINGS);
        }
        if (str.startsWith("privacy-and-account-setting")) {
            return C58833ax.m90834k(C9140ac.START_PRIVACY_AND_ACCOUNT_SETTING);
        }
        if (str.startsWith("assistant-settings")) {
            return C58833ax.m90834k(C9140ac.START_ASSISTANT_SETTINGS);
        }
        if (str.startsWith("now-orders-cards")) {
            return C58833ax.m90834k(C9140ac.ORDERS_CARDS);
        }
        if (str.startsWith("now-feedback")) {
            return C58833ax.m90834k(C9140ac.SEND_FEEDBACK);
        }
        if (str.startsWith("now-dismiss-entry")) {
            return C58833ax.m90834k(C9140ac.DISMISS_ENTRY);
        }
        if (str.startsWith("now-places")) {
            return C58833ax.m90834k(C9140ac.PLACES_EDIT);
        }
        if (str.startsWith("now-request-permissions")) {
            return C58833ax.m90834k(C9140ac.REQUEST_RUNTIME_PERMISSIONS);
        }
        if (str.startsWith("now-hotword-training")) {
            return C58833ax.m90834k(C9140ac.START_HOTWORD_TRAINING);
        }
        if (str.startsWith("now-noopt")) {
            return C58833ax.m90834k(C9140ac.NOOP);
        }
        if (str.startsWith("now-copy-to-clipboard")) {
            return C58833ax.m90834k(C9140ac.COPY_TO_CLIPBOARD);
        }
        if (str.startsWith("now-install-app-icon")) {
            return C58833ax.m90834k(C9140ac.INSTALL_APP_ICON);
        }
        if (str.startsWith("now-amp")) {
            return C58833ax.m90834k(C9140ac.OPEN_AMP_VIEWER);
        }
        if (str.startsWith("now-preload-amp")) {
            return C58833ax.m90834k(C9140ac.PRELOAD_AMP_VIEWER);
        }
        if (str.startsWith("assistant-notifications")) {
            return C58833ax.m90834k(C9140ac.START_OPA);
        }
        return str.startsWith("assistant-dismiss-notifications") ? C58833ax.m90834k(C9140ac.DISMISS_OPA_NOTIFICATION) : C58836b.f156633a;
    }

    /* renamed from: m */
    private static C9222dd m150985m(C7597cx cxVar) {
        C7596cw cwVar;
        if (cxVar.f26261a != 1) {
            return C9222dd.f31875c;
        }
        C9219da daVar = (C9219da) C9222dd.f31875c.createBuilder();
        C9220db dbVar = (C9220db) C9221dc.f31871c.createBuilder();
        if (cxVar.f26261a == 1) {
            cwVar = (C7596cw) cxVar.f26262b;
        } else {
            cwVar = C7596cw.f26255b;
        }
        String str = cwVar.f26257a;
        dbVar.copyOnWrite();
        C9221dc dcVar = (C9221dc) dbVar.instance;
        str.getClass();
        dcVar.f31873a |= 1;
        dcVar.f31874b = str;
        daVar.copyOnWrite();
        C9222dd ddVar = (C9222dd) daVar.instance;
        C9221dc dcVar2 = (C9221dc) dbVar.build();
        dcVar2.getClass();
        ddVar.f31878b = dcVar2;
        ddVar.f31877a = 1;
        return (C9222dd) daVar.build();
    }
}
