package com.google.android.apps.gsa.staticplugins.nowcards.p8100a;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.shared.util.C91035f;
import com.google.android.apps.gsa.sidekick.shared.util.C91988g;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104310al;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9258em;
import com.google.android.apps.p489g.p494d.C9259en;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C8182yo;
import com.google.p375ai.p378b.C8185yr;
import com.google.p375ai.p378b.C8186ys;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.a.m */
/* compiled from: PG */
public final class C104245m extends C104310al {

    /* renamed from: j */
    private static final C9278v[] f289925j = new C9278v[0];

    public C104245m(C7718hj hjVar, CardRenderingContext cardRenderingContext, C89291a aVar, C104308aj ajVar) {
        super(hjVar, cardRenderingContext, aVar, ajVar);
    }

    /* renamed from: B */
    public static final C9141ad m172234B(Context context, C7718hj hjVar) {
        C7805kp kpVar;
        if ((hjVar.f26955a & 4096) != 0) {
            C8186ys ysVar = hjVar.f26976q;
            if (ysVar == null) {
                ysVar = C8186ys.f28759e;
            }
            kpVar = ysVar.f28762b;
            if (kpVar == null) {
                kpVar = C7805kp.f27284h;
            }
        } else {
            kpVar = null;
        }
        C7681g gVar = C7681g.DETAILS;
        return C91988g.m150968e(context.getString(R.string.weather_search_query), kpVar, (String) null, (String) null, "1t:66502", gVar, 0);
    }

    /* renamed from: D */
    static final String m172235D(Context context, C8185yr yrVar) {
        if ((yrVar.f28749a & 32) == 0) {
            return BuildConfig.FLAVOR;
        }
        int a = C8182yo.m22964a(yrVar.f28755g);
        if (a == 0 || a == 1) {
            return context.getResources().getString(R.string.qp_weather_unit_abbrev_celsius);
        }
        return context.getResources().getString(R.string.qp_weather_unit_abbrev_fahrenheit);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final com.google.android.apps.p489g.p494d.C9259en m172236R(android.content.Context r5, com.google.p375ai.p378b.C7718hj r6) {
        /*
            com.google.android.apps.g.d.en r0 = com.google.android.apps.p489g.p494d.C9259en.f32016i
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.g.d.em r0 = (com.google.android.apps.p489g.p494d.C9258em) r0
            com.google.ai.b.ys r1 = r6.f26976q
            if (r1 != 0) goto L_0x000e
            com.google.ai.b.ys r1 = com.google.p375ai.p378b.C8186ys.f28759e
        L_0x000e:
            if (r1 == 0) goto L_0x0032
            com.google.ai.b.kp r2 = r1.f28762b
            if (r2 != 0) goto L_0x0016
            com.google.ai.b.kp r2 = com.google.p375ai.p378b.C7805kp.f27284h
        L_0x0016:
            int r2 = r2.f27286a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0032
            com.google.ai.b.kp r1 = r1.f28762b
            if (r1 != 0) goto L_0x0022
            com.google.ai.b.kp r1 = com.google.p375ai.p378b.C7805kp.f27284h
        L_0x0022:
            java.lang.String r1 = r1.f27289d
            r2 = 44
            int r2 = r1.indexOf(r2)
            if (r2 <= 0) goto L_0x0034
            r3 = 0
            java.lang.String r1 = r1.substring(r3, r2)
            goto L_0x0034
        L_0x0032:
            java.lang.String r1 = ""
        L_0x0034:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.g.d.en r2 = (com.google.android.apps.p489g.p494d.C9259en) r2
            r1.getClass()
            int r3 = r2.f32018a
            r4 = 1
            r3 = r3 | r4
            r2.f32018a = r3
            r2.f32019b = r1
            com.google.ai.b.ys r6 = r6.f26976q
            if (r6 != 0) goto L_0x004d
            com.google.ai.b.ys r1 = com.google.p375ai.p378b.C8186ys.f28759e
            goto L_0x004e
        L_0x004d:
            r1 = r6
        L_0x004e:
            int r1 = r1.f28761a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00bf
            if (r6 != 0) goto L_0x0058
            com.google.ai.b.ys r6 = com.google.p375ai.p378b.C8186ys.f28759e
        L_0x0058:
            com.google.ai.b.yr r6 = r6.f28763c
            if (r6 != 0) goto L_0x005e
            com.google.ai.b.yr r6 = com.google.p375ai.p378b.C8185yr.f28747k
        L_0x005e:
            int r1 = r6.f28749a
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0078
            java.lang.String r1 = r6.f28751c
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.g.d.en r2 = (com.google.android.apps.p489g.p494d.C9259en) r2
            r1.getClass()
            int r3 = r2.f32018a
            r3 = r3 | 8
            r2.f32018a = r3
            r2.f32022e = r1
        L_0x0078:
            int r1 = r6.f28749a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = r6.f28752d
            java.lang.String r1 = com.google.android.apps.gsa.sidekick.shared.util.C91981be.m150951a(r1, r5)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x009c
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.g.d.en r2 = (com.google.android.apps.p489g.p494d.C9259en) r2
            r1.getClass()
            int r3 = r2.f32018a
            r3 = r3 | 2
            r2.f32018a = r3
            r2.f32020c = r1
        L_0x009c:
            int r1 = r6.f28749a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x00ce
            int r1 = r6.f28753e
            java.lang.String r5 = m172235D(r5, r6)
            java.lang.String r5 = com.google.android.apps.gsa.shared.util.C91035f.m148706b(r1, r5)
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.g.d.en r6 = (com.google.android.apps.p489g.p494d.C9259en) r6
            r5.getClass()
            int r1 = r6.f32018a
            r1 = r1 | 4
            r6.f32018a = r1
            r6.f32021d = r5
            goto L_0x00ce
        L_0x00bf:
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.g.d.en r5 = (com.google.android.apps.p489g.p494d.C9259en) r5
            int r6 = r5.f32018a
            r6 = r6 | 64
            r5.f32018a = r6
            r5.f32025h = r4
        L_0x00ce:
            com.google.protobuf.bv r5 = r0.build()
            com.google.android.apps.g.d.en r5 = (com.google.android.apps.p489g.p494d.C9259en) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8100a.C104245m.m172236R(android.content.Context, com.google.ai.b.hj):com.google.android.apps.g.d.en");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x022b  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.p489g.p494d.C9278v[] mo94023C(android.content.Context r12, com.google.p375ai.p378b.C7718hj r13) {
        /*
            r11 = this;
            int r0 = r13.f26955a
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x026e
            com.google.ai.b.ys r0 = r13.f26976q
            if (r0 != 0) goto L_0x000c
            com.google.ai.b.ys r0 = com.google.p375ai.p378b.C8186ys.f28759e
        L_0x000c:
            com.google.android.apps.g.d.el r1 = com.google.android.apps.p489g.p494d.C9257el.f32007h
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.g.d.ei r1 = (com.google.android.apps.p489g.p494d.C9254ei) r1
            com.google.android.apps.g.d.en r2 = m172236R(r12, r13)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.g.d.el r3 = (com.google.android.apps.p489g.p494d.C9257el) r3
            r2.getClass()
            r3.f32011c = r2
            int r2 = r3.f32009a
            r4 = 2
            r2 = r2 | r4
            r3.f32009a = r2
            int r2 = r0.f28761a
            r2 = r2 & 4
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L_0x00c9
            com.google.ai.b.yr r2 = r0.f28763c
            if (r2 != 0) goto L_0x0038
            com.google.ai.b.yr r2 = com.google.p375ai.p378b.C8185yr.f28747k
        L_0x0038:
            int r2 = r2.f28749a
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0093
            com.google.ai.b.yr r2 = r0.f28763c
            if (r2 != 0) goto L_0x0044
            com.google.ai.b.yr r2 = com.google.p375ai.p378b.C8185yr.f28747k
        L_0x0044:
            int r2 = r2.f28757i
            int r2 = com.google.p375ai.p378b.C8184yq.m22965a(r2)
            if (r2 != 0) goto L_0x004d
            goto L_0x0059
        L_0x004d:
            if (r2 == r5) goto L_0x0061
            if (r2 == r4) goto L_0x0059
            r2 = 2132089482(0x7f151a8a, float:1.9819277E38)
            java.lang.String r2 = r12.getString(r2)
            goto L_0x0068
        L_0x0059:
            r2 = 2132088691(0x7f151773, float:1.9817673E38)
            java.lang.String r2 = r12.getString(r2)
            goto L_0x0068
        L_0x0061:
            r2 = 2132089481(0x7f151a89, float:1.9819275E38)
            java.lang.String r2 = r12.getString(r2)
        L_0x0068:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.google.ai.b.yr r7 = r0.f28763c
            if (r7 != 0) goto L_0x0070
            com.google.ai.b.yr r7 = com.google.p375ai.p378b.C8185yr.f28747k
        L_0x0070:
            int r7 = r7.f28758j
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r3] = r7
            r6[r5] = r2
            r2 = 2132091747(0x7f152363, float:1.982387E38)
            java.lang.String r2 = r12.getString(r2, r6)
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.el r6 = (com.google.android.apps.p489g.p494d.C9257el) r6
            r2.getClass()
            int r7 = r6.f32009a
            r7 = r7 | 4
            r6.f32009a = r7
            r6.f32012d = r2
        L_0x0093:
            com.google.ai.b.yr r2 = r0.f28763c
            if (r2 != 0) goto L_0x009a
            com.google.ai.b.yr r6 = com.google.p375ai.p378b.C8185yr.f28747k
            goto L_0x009b
        L_0x009a:
            r6 = r2
        L_0x009b:
            int r6 = r6.f28749a
            r6 = r6 & 64
            if (r6 == 0) goto L_0x00c9
            java.lang.Object[] r6 = new java.lang.Object[r5]
            if (r2 != 0) goto L_0x00a7
            com.google.ai.b.yr r2 = com.google.p375ai.p378b.C8185yr.f28747k
        L_0x00a7:
            int r2 = r2.f28756h
            double r7 = (double) r2
            java.lang.String r2 = com.google.android.apps.gsa.shared.util.C91035f.m148709e(r7)
            r6[r3] = r2
            r2 = 2132091737(0x7f152359, float:1.982385E38)
            java.lang.String r2 = r12.getString(r2, r6)
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.el r6 = (com.google.android.apps.p489g.p494d.C9257el) r6
            r2.getClass()
            int r7 = r6.f32009a
            r7 = r7 | 8
            r6.f32009a = r7
            r6.f32013e = r2
        L_0x00c9:
            com.google.protobuf.cq r2 = r0.f28764d
            int r2 = r2.size()
            java.util.ArrayList r2 = com.google.common.p4522b.C58597ky.m90213d(r2)
            com.google.protobuf.cq r0 = r0.f28764d
            java.util.Iterator r0 = r0.iterator()
        L_0x00d9:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0159
            java.lang.Object r6 = r0.next()
            com.google.ai.b.yr r6 = (com.google.p375ai.p378b.C8185yr) r6
            com.google.android.apps.g.d.ek r7 = com.google.android.apps.p489g.p494d.C9256ek.f32000f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.g.d.ej r7 = (com.google.android.apps.p489g.p494d.C9255ej) r7
            java.lang.String r8 = r6.f28750b
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.apps.g.d.ek r9 = (com.google.android.apps.p489g.p494d.C9256ek) r9
            r8.getClass()
            int r10 = r9.f32002a
            r10 = r10 | r5
            r9.f32002a = r10
            r9.f32003b = r8
            java.lang.String r8 = r6.f28752d
            java.lang.String r8 = com.google.android.apps.gsa.sidekick.shared.util.C91981be.m150951a(r8, r12)
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.apps.g.d.ek r9 = (com.google.android.apps.p489g.p494d.C9256ek) r9
            r8.getClass()
            int r10 = r9.f32002a
            r10 = r10 | r4
            r9.f32002a = r10
            r9.f32004c = r8
            int r8 = r6.f28753e
            java.lang.String r9 = m172235D(r12, r6)
            java.lang.String r8 = com.google.android.apps.gsa.shared.util.C91035f.m148706b(r8, r9)
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.apps.g.d.ek r9 = (com.google.android.apps.p489g.p494d.C9256ek) r9
            r8.getClass()
            int r10 = r9.f32002a
            r10 = r10 | 4
            r9.f32002a = r10
            r9.f32005d = r8
            int r8 = r6.f28754f
            java.lang.String r6 = m172235D(r12, r6)
            java.lang.String r6 = com.google.android.apps.gsa.shared.util.C91035f.m148706b(r8, r6)
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.g.d.ek r8 = (com.google.android.apps.p489g.p494d.C9256ek) r8
            r6.getClass()
            int r9 = r8.f32002a
            r9 = r9 | 8
            r8.f32002a = r9
            r8.f32006e = r6
            com.google.protobuf.bv r6 = r7.build()
            com.google.android.apps.g.d.ek r6 = (com.google.android.apps.p489g.p494d.C9256ek) r6
            r2.add(r6)
            goto L_0x00d9
        L_0x0159:
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.g.d.el r0 = (com.google.android.apps.p489g.p494d.C9257el) r0
            com.google.protobuf.cq r6 = r0.f32014f
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x016e
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r0.f32014f = r6
        L_0x016e:
            com.google.protobuf.cq r0 = r0.f32014f
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r0)
            com.google.android.apps.g.d.v r0 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.g.d.q r0 = (com.google.android.apps.p489g.p494d.C9273q) r0
            com.google.android.apps.g.d.u r2 = com.google.android.apps.p489g.p494d.C9277u.WEATHER_FORECAST
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            int r2 = r2.f32164ay
            r6.f32196c = r2
            int r2 = r6.f32192a
            r2 = r2 | r5
            r6.f32192a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            r2.f32174H = r13
            int r6 = r2.f32192a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r7
            r2.f32192a = r6
            com.google.android.apps.g.d.ad r13 = m172234B(r12, r13)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            r13.getClass()
            r2.f32169C = r13
            int r13 = r2.f32192a
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            r13 = r13 | r6
            r2.f32192a = r13
            com.google.protobuf.bv r13 = r1.instance
            com.google.android.apps.g.d.el r13 = (com.google.android.apps.p489g.p494d.C9257el) r13
            com.google.android.apps.g.d.en r13 = r13.f32011c
            if (r13 != 0) goto L_0x01be
            com.google.android.apps.g.d.en r13 = com.google.android.apps.p489g.p494d.C9259en.f32016i
        L_0x01be:
            int r13 = r13.f32018a
            r13 = r13 & 4
            if (r13 == 0) goto L_0x01f9
            com.google.protobuf.bv r13 = r1.instance
            com.google.android.apps.g.d.el r13 = (com.google.android.apps.p489g.p494d.C9257el) r13
            com.google.android.apps.g.d.en r13 = r13.f32011c
            if (r13 != 0) goto L_0x01ce
            com.google.android.apps.g.d.en r13 = com.google.android.apps.p489g.p494d.C9259en.f32016i
        L_0x01ce:
            int r13 = r13.f32018a
            r13 = r13 & r5
            if (r13 == 0) goto L_0x01f9
            android.content.res.Resources r12 = r12.getResources()
            com.google.protobuf.bv r13 = r1.instance
            com.google.android.apps.g.d.el r13 = (com.google.android.apps.p489g.p494d.C9257el) r13
            com.google.android.apps.g.d.en r13 = r13.f32011c
            if (r13 != 0) goto L_0x01e2
            com.google.android.apps.g.d.en r2 = com.google.android.apps.p489g.p494d.C9259en.f32016i
            goto L_0x01e3
        L_0x01e2:
            r2 = r13
        L_0x01e3:
            java.lang.String r2 = r2.f32019b
            java.lang.Object[] r4 = new java.lang.Object[r4]
            if (r13 != 0) goto L_0x01eb
            com.google.android.apps.g.d.en r13 = com.google.android.apps.p489g.p494d.C9259en.f32016i
        L_0x01eb:
            java.lang.String r13 = r13.f32021d
            r4[r3] = r13
            r4[r5] = r2
            r13 = 2132093658(0x7f152ada, float:1.9827747E38)
            java.lang.String r12 = r12.getString(r13, r4)
            goto L_0x0225
        L_0x01f9:
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.apps.g.d.el r12 = (com.google.android.apps.p489g.p494d.C9257el) r12
            com.google.android.apps.g.d.en r12 = r12.f32011c
            if (r12 != 0) goto L_0x0204
            com.google.android.apps.g.d.en r13 = com.google.android.apps.p489g.p494d.C9259en.f32016i
            goto L_0x0205
        L_0x0204:
            r13 = r12
        L_0x0205:
            int r13 = r13.f32018a
            r13 = r13 & 4
            if (r13 == 0) goto L_0x0212
            if (r12 != 0) goto L_0x020f
            com.google.android.apps.g.d.en r12 = com.google.android.apps.p489g.p494d.C9259en.f32016i
        L_0x020f:
            java.lang.String r12 = r12.f32021d
            goto L_0x0225
        L_0x0212:
            if (r12 != 0) goto L_0x0217
            com.google.android.apps.g.d.en r13 = com.google.android.apps.p489g.p494d.C9259en.f32016i
            goto L_0x0218
        L_0x0217:
            r13 = r12
        L_0x0218:
            int r13 = r13.f32018a
            r13 = r13 & r5
            if (r13 == 0) goto L_0x0224
            if (r12 != 0) goto L_0x0221
            com.google.android.apps.g.d.en r12 = com.google.android.apps.p489g.p494d.C9259en.f32016i
        L_0x0221:
            java.lang.String r12 = r12.f32019b
            goto L_0x0225
        L_0x0224:
            r12 = 0
        L_0x0225:
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x023c
            r1.copyOnWrite()
            com.google.protobuf.bv r13 = r1.instance
            com.google.android.apps.g.d.el r13 = (com.google.android.apps.p489g.p494d.C9257el) r13
            r12.getClass()
            int r2 = r13.f32009a
            r2 = r2 | r5
            r13.f32009a = r2
            r13.f32010b = r12
        L_0x023c:
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.android.apps.g.d.el r12 = (com.google.android.apps.p489g.p494d.C9257el) r12
            int r13 = r12.f32009a
            r13 = r13 | 16
            r12.f32009a = r13
            r12.f32015g = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.android.apps.g.d.v r12 = (com.google.android.apps.p489g.p494d.C9278v) r12
            com.google.protobuf.bv r13 = r1.build()
            com.google.android.apps.g.d.el r13 = (com.google.android.apps.p489g.p494d.C9257el) r13
            r13.getClass()
            r12.f32202i = r13
            int r13 = r12.f32192a
            r13 = r13 | 64
            r12.f32192a = r13
            com.google.android.apps.g.d.v[] r12 = new com.google.android.apps.p489g.p494d.C9278v[r5]
            com.google.protobuf.bv r13 = r0.build()
            com.google.android.apps.g.d.v r13 = (com.google.android.apps.p489g.p494d.C9278v) r13
            r12[r3] = r13
            return r12
        L_0x026e:
            com.google.android.apps.g.d.v[] r12 = f289925j
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8100a.C104245m.mo94023C(android.content.Context, com.google.ai.b.hj):com.google.android.apps.g.d.v[]");
    }

    /* renamed from: x */
    public final C9278v mo94013x(Context context, C7718hj hjVar) {
        C8185yr yrVar;
        C9258em emVar = (C9258em) m172236R(context, hjVar).toBuilder();
        C8186ys ysVar = hjVar.f26976q;
        if (ysVar == null) {
            ysVar = C8186ys.f28759e;
        }
        if (ysVar.f28764d.size() == 0) {
            yrVar = null;
        } else {
            C8186ys ysVar2 = hjVar.f26976q;
            if (ysVar2 == null) {
                ysVar2 = C8186ys.f28759e;
            }
            yrVar = (C8185yr) ysVar2.f28764d.get(0);
        }
        if (yrVar != null) {
            String D = m172235D(context, yrVar);
            String b = C91035f.m148706b(yrVar.f28753e, D);
            emVar.copyOnWrite();
            C9259en enVar = (C9259en) emVar.instance;
            b.getClass();
            enVar.f32018a |= 16;
            enVar.f32023f = b;
            String b2 = C91035f.m148706b(yrVar.f28754f, D);
            emVar.copyOnWrite();
            C9259en enVar2 = (C9259en) emVar.instance;
            b2.getClass();
            enVar2.f32018a |= 32;
            enVar2.f32024g = b2;
        }
        C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
        C9277u uVar = C9277u.WEATHER_FORECAST_ROW;
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        vVar.f32196c = uVar.f32164ay;
        vVar.f32192a |= 1;
        qVar.copyOnWrite();
        C9278v vVar2 = (C9278v) qVar.instance;
        C9259en enVar3 = (C9259en) emVar.build();
        enVar3.getClass();
        vVar2.f32201h = enVar3;
        vVar2.f32192a |= 32;
        C9141ad B = m172234B(context, hjVar);
        qVar.copyOnWrite();
        C9278v vVar3 = (C9278v) qVar.instance;
        B.getClass();
        vVar3.f32169C = B;
        vVar3.f32192a |= 67108864;
        qVar.copyOnWrite();
        C9278v vVar4 = (C9278v) qVar.instance;
        hjVar.getClass();
        vVar4.f32174H = hjVar;
        vVar4.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        return (C9278v) qVar.build();
    }
}
