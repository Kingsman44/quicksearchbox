package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.modular.C87426a;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.p6931i.C87572a;
import com.google.android.apps.gsa.staticplugins.actions.p7357c.C93311c;
import com.google.p4152bb.p4153a.C55210jy;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.m */
/* compiled from: PG */
public class C93326m extends C93311c {

    /* renamed from: f */
    private final C93327n f260283f;

    /* renamed from: g */
    private final C87572a f260284g;

    /* renamed from: h */
    private final C68214a f260285h;

    public C93326m(Context context, PackageManager packageManager, C87449m mVar, boolean z, C93327n nVar, C68214a aVar, C87572a aVar2) {
        super(context, packageManager, mVar, z, aVar2.mo81703a());
        this.f260283f = nVar;
        this.f260285h = aVar;
        this.f260284g = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0168, code lost:
        if (r1 != false) goto L_0x016a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo mo87630d(com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l r6, com.google.p4152bb.p4153a.C55240la r7) {
        /*
            r5 = this;
            com.google.protobuf.cq r0 = r7.f145459i
            boolean r0 = r6.mo81228ah(r0)
            if (r0 != 0) goto L_0x000d
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            return r6
        L_0x000d:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55208jw.f145313A
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x003d
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55208jw.f145313A
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x0036
            java.lang.Object r0 = r0.f169969b
            goto L_0x003a
        L_0x0036:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x003a:
            com.google.bb.a.jw r0 = (com.google.p4152bb.p4153a.C55208jw) r0
            goto L_0x006e
        L_0x003d:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x006d
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x0066
            java.lang.Object r0 = r0.f169969b
            goto L_0x006a
        L_0x0066:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x006a:
            com.google.bb.a.jw r0 = (com.google.p4152bb.p4153a.C55208jw) r0
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 == 0) goto L_0x00ab
            boolean r1 = r0.f145334q
            if (r1 == 0) goto L_0x0082
            com.google.android.apps.gsa.search.shared.i.a r1 = r5.f260284g
            boolean r1 = r1.mo81703a()
            if (r1 == 0) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            return r6
        L_0x0082:
            java.lang.String r1 = r0.f145337t
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00a6
            dagger.a r6 = r5.f260285h
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.handsfree.i r6 = (com.google.android.apps.gsa.handsfree.i) r6
            java.lang.String r0 = r0.f145337t
            java.util.Map r6 = r6.d
            boolean r6 = r6.containsKey(r0)
            if (r6 == 0) goto L_0x00a1
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = com.google.android.apps.gsa.staticplugins.actions.p7357c.C93311c.m153447c(r7)
            return r6
        L_0x00a1:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            return r6
        L_0x00a6:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = super.mo87630d(r6, r7)
            return r6
        L_0x00ab:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55237ky.f145439d
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0174
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55237ky.f145439d
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r3 = r7.f169962ag
            com.google.protobuf.bs r4 = r0.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x00d6
            java.lang.Object r0 = r0.f169969b
            goto L_0x00da
        L_0x00d6:
            java.lang.Object r0 = r0.mo58889c(r3)
        L_0x00da:
            com.google.bb.a.ky r0 = (com.google.p4152bb.p4153a.C55237ky) r0
            int r0 = r0.f145442b
            com.google.bb.a.ka r6 = r6.mo81216W(r0)
            if (r6 == 0) goto L_0x016f
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55231ks.f145411i
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r6.mo58887l(r0)
            com.google.protobuf.bf r3 = r6.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r3.mo58857o(r0)
            if (r0 == 0) goto L_0x016f
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55231ks.f145411i
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r6.mo58887l(r0)
            com.google.protobuf.bf r6 = r6.f169962ag
            com.google.protobuf.bs r3 = r0.f169971d
            java.lang.Object r6 = r6.mo58854l(r3)
            if (r6 != 0) goto L_0x010d
            java.lang.Object r6 = r0.f169969b
            goto L_0x0111
        L_0x010d:
            java.lang.Object r6 = r0.mo58889c(r6)
        L_0x0111:
            com.google.bb.a.ks r6 = (com.google.p4152bb.p4153a.C55231ks) r6
            int r6 = r6.f145414b
            int r6 = com.google.p4152bb.p4153a.C55228kp.m87625a(r6)
            if (r6 != 0) goto L_0x011c
            r6 = 1
        L_0x011c:
            int r6 = r6 + -1
            if (r6 == r2) goto L_0x0160
            r0 = 2
            if (r6 == r0) goto L_0x014e
            r0 = 3
            if (r6 == r0) goto L_0x0141
            r0 = 5
            if (r6 == r0) goto L_0x016a
            r0 = 6
            if (r6 != r0) goto L_0x012d
            goto L_0x016a
        L_0x012d:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown device setting "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0141:
            android.content.Context r6 = r5.f260211a
            com.google.android.apps.gsa.search.shared.actions.util.f r6 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93387a.m153629f(r6)
            android.content.pm.PackageManager r0 = r5.f260212b
            boolean r1 = r6.mo81472c(r0)
            goto L_0x0168
        L_0x014e:
            android.content.pm.PackageManager r6 = r5.f260212b
            java.lang.String r0 = "android.hardware.bluetooth"
            boolean r6 = r6.hasSystemFeature(r0)
            if (r6 == 0) goto L_0x0168
            android.bluetooth.BluetoothAdapter r6 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r6 == 0) goto L_0x0168
            r1 = 1
            goto L_0x0168
        L_0x0160:
            android.content.pm.PackageManager r6 = r5.f260212b
            java.lang.String r0 = "android.hardware.wifi"
            boolean r1 = r6.hasSystemFeature(r0)
        L_0x0168:
            if (r1 == 0) goto L_0x016f
        L_0x016a:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = com.google.android.apps.gsa.staticplugins.actions.p7357c.C93311c.m153447c(r7)
            goto L_0x0173
        L_0x016f:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
        L_0x0173:
            return r6
        L_0x0174:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55284mr.f145623d
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r3 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r3.mo58857o(r0)
            if (r0 == 0) goto L_0x01d0
            com.google.bb.a.pn r6 = com.google.android.apps.gsa.staticplugins.actions.p7357c.C93311c.m153448e(r7)
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.bb.a.pm r6 = (com.google.p4152bb.p4153a.C55360pm) r6
            android.content.Context r7 = r5.f260211a
            r0 = 2132092491(0x7f15264b, float:1.982538E38)
            java.lang.String r7 = r7.getString(r0)
            r6.copyOnWrite()
            com.google.protobuf.bv r0 = r6.instance
            com.google.bb.a.pn r0 = (com.google.p4152bb.p4153a.C55361pn) r0
            r7.getClass()
            int r3 = r0.f145868a
            r3 = r3 | r2
            r0.f145868a = r3
            r0.f145869b = r7
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.bb.a.pn r7 = (com.google.p4152bb.p4153a.C55361pn) r7
            r0 = 12
            r7.f145872e = r0
            int r0 = r7.f145868a
            r0 = r0 | 8
            r7.f145868a = r0
            com.google.protobuf.bv r6 = r6.build()
            com.google.bb.a.pn r6 = (com.google.p4152bb.p4153a.C55361pn) r6
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r7 = new com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo
            com.google.bb.a.pn[] r0 = new com.google.p4152bb.p4153a.C55361pn[r2]
            r0[r1] = r6
            java.util.ArrayList r0 = com.google.common.p4522b.C58597ky.m90212c(r0)
            r7.<init>(r0, r6, r1)
            return r7
        L_0x01d0:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55255lp.f145515d
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 != 0) goto L_0x024d
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55206ju.f145304i
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 != 0) goto L_0x024d
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55278ml.f145594j
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 != 0) goto L_0x024d
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55274mh.f145587e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 != 0) goto L_0x024d
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55217ke.f145371b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x0230
            goto L_0x024d
        L_0x0230:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55156hy.f145198h
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r1 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x0248
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = super.mo87630d(r6, r7)
            return r6
        L_0x0248:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            return r6
        L_0x024d:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = com.google.android.apps.gsa.staticplugins.actions.p7357c.C93311c.m153447c(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7358d.C93326m.mo87630d(com.google.android.apps.gsa.search.shared.actions.modular.arguments.l, com.google.bb.a.la):com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo87631f(C87426a aVar, MatchingProviderInfo matchingProviderInfo, boolean z) {
        if ((aVar.mo81219Z().f145691a & 16384) == 0) {
            return super.mo87631f(aVar, matchingProviderInfo, z);
        }
        C55210jy jyVar = aVar.mo81219Z().f145706p;
        if (jyVar == null) {
            jyVar = C55210jy.f145342e;
        }
        if ((jyVar.f145344a & 2) != 0) {
            String h = aVar.mo81235h(jyVar.f145347d);
            if (!TextUtils.isEmpty(h) && m153449g(matchingProviderInfo, h, true)) {
                return h;
            }
        }
        if ((jyVar.f145344a & 1) != 0) {
            C93327n nVar = this.f260283f;
            String str = jyVar.f145345b;
            String string = str != null ? nVar.f260286a.getString(str, (String) null) : BuildConfig.FLAVOR;
            if (m153449g(matchingProviderInfo, string, false)) {
                return string;
            }
        }
        return super.mo87631f(aVar, matchingProviderInfo, z);
    }
}
