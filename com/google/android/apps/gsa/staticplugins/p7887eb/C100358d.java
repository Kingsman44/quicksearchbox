package com.google.android.apps.gsa.staticplugins.p7887eb;

import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7020bd.C89408a;
import com.google.android.apps.gsa.shared.p7020bd.C89409b;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4575r.C60757n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Map;
import p5451f.p5452a.p5453a.p5454a.C69395aq;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69415bj;
import p5451f.p5452a.p5453a.p5454a.C69421bp;
import p5451f.p5452a.p5453a.p5454a.C69431bz;
import p5451f.p5452a.p5453a.p5454a.C69436cd;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.d */
/* compiled from: PG */
public final class C100358d implements C89409b {

    /* renamed from: a */
    public static final C59071e f280643a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.eb.d");

    /* renamed from: b */
    public final C86338r f280644b;

    /* renamed from: c */
    public final C21370a f280645c;

    /* renamed from: d */
    public final C68214a f280646d;

    /* renamed from: e */
    final Map f280647e;

    /* renamed from: f */
    final Map f280648f;

    /* renamed from: g */
    private final long f280649g;

    /* renamed from: h */
    private final C86124t f280650h;

    public C100358d(C86338r rVar, C86124t tVar, C21370a aVar, C68214a aVar2) {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C69395aq.FEED_TOOLTIP, C69436cd.FEED_TOOLTIP);
        gzVar.mo55429h(C69395aq.DRAWER_FEATURE_TIP, C69436cd.DRAWER_FEATURE_TIP);
        gzVar.mo55429h(C69395aq.BOTTOM_DIALOG_TIP, C69436cd.BOTTOM_DIALOG_TIP);
        gzVar.mo55429h(C69395aq.PARTICLE_DISC_TOOLTIP, C69436cd.PARTICLE_DISC_TOOLTIP);
        gzVar.mo55429h(C69395aq.BOTTOM_BAR_PROMOTION_INDICATOR, C69436cd.BOTTOM_BAR_PROMOTION_INDICATOR);
        gzVar.mo55429h(C69395aq.BOTTOM_BAR_TOOLTIP, C69436cd.BOTTOM_BAR_TOOLTIP);
        gzVar.mo55429h(C69395aq.SEARCH_PLATE_TOOLTIP, C69436cd.SEARCH_PLATE_TOOLTIP);
        this.f280647e = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C69395aq.FEED_TOOLTIP, C69431bz.INTERESTS_TAB);
        gzVar2.mo55429h(C69395aq.DRAWER_FEATURE_TIP, C69431bz.DRAWER_TAB);
        gzVar2.mo55429h(C69395aq.BOTTOM_DIALOG_TIP, C69431bz.MULTIPLE_TABS);
        gzVar2.mo55429h(C69395aq.PARTICLE_DISC_TOOLTIP, C69431bz.INTERESTS_TAB);
        gzVar2.mo55429h(C69395aq.BOTTOM_BAR_PROMOTION_INDICATOR, C69431bz.NO_TAB);
        gzVar2.mo55429h(C69395aq.BOTTOM_BAR_TOOLTIP, C69431bz.MULTIPLE_TABS);
        gzVar2.mo55429h(C69395aq.SEARCH_PLATE_TOOLTIP, C69431bz.NO_TAB);
        this.f280648f = gzVar2.mo55427f(false);
        this.f280644b = rVar;
        this.f280650h = tVar;
        this.f280645c = aVar;
        this.f280646d = aVar2;
        this.f280649g = tVar.mo79743a(C89972ak.f246550Y);
    }

    /* renamed from: j */
    static String m166373j(String str, int i) {
        return str + i;
    }

    /* renamed from: r */
    private final boolean m166374r(long j) {
        return j <= 0 || this.f280645c.mo26870b() - j >= this.f280649g;
    }

    /* renamed from: s */
    private static boolean m166375s(C58833ax axVar, int i) {
        return !axVar.mo56113h() || ((Integer) axVar.mo56107c()).intValue() == i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ba, code lost:
        if ((r5 - r10.f280644b.getLong(m166373j("last_tip_seen_time_for_tab_type_", r4), 0)) >= r10.f280644b.getLong(m166373j("interval_time_for_tab_type_", r4), 0)) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0041, code lost:
        if ((r6 - r10.f280644b.getLong(m166373j("last_tip_seen_time_for_tip_type_", r0), 0)) >= r10.f280644b.getLong(m166373j("interval_time_for_tip_type_", r0), 0)) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0067, code lost:
        if (r10.f280644b.getInt(m166373j("maximum_count_for_tip_type_", r0), 0) <= r10.f280644b.getInt(m166373j("impression_count_for_tip_type_", r0), 0)) goto L_0x00d0;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m166376t(int r11, p5451f.p5452a.p5453a.p5454a.C69431bz r12) {
        /*
            r10 = this;
            f.a.a.a.aq r0 = r10.mo91900h(r11)
            java.util.Map r1 = r10.f280647e
            java.lang.Object r0 = r1.get(r0)
            f.a.a.a.cd r0 = (p5451f.p5452a.p5453a.p5454a.C69436cd) r0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0012
            goto L_0x006a
        L_0x0012:
            int r0 = r0.f185809j
            com.google.android.apps.gsa.search.core.preferences.r r4 = r10.f280644b
            java.lang.String r5 = "interval_time_for_tip_type_"
            java.lang.String r6 = m166373j(r5, r0)
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L_0x0043
            com.google.android.libraries.f.a r4 = r10.f280645c
            long r6 = r4.mo26870b()
            com.google.android.apps.gsa.search.core.preferences.r r4 = r10.f280644b
            java.lang.String r5 = m166373j(r5, r0)
            long r4 = r4.getLong(r5, r2)
            com.google.android.apps.gsa.search.core.preferences.r r8 = r10.f280644b
            java.lang.String r9 = "last_tip_seen_time_for_tip_type_"
            java.lang.String r9 = m166373j(r9, r0)
            long r8 = r8.getLong(r9, r2)
            long r6 = r6 - r8
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00d0
        L_0x0043:
            com.google.android.apps.gsa.search.core.preferences.r r4 = r10.f280644b
            java.lang.String r5 = "maximum_count_for_tip_type_"
            java.lang.String r6 = m166373j(r5, r0)
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L_0x006a
            com.google.android.apps.gsa.search.core.preferences.r r4 = r10.f280644b
            java.lang.String r5 = m166373j(r5, r0)
            int r4 = r4.getInt(r5, r1)
            com.google.android.apps.gsa.search.core.preferences.r r5 = r10.f280644b
            java.lang.String r6 = "impression_count_for_tip_type_"
            java.lang.String r0 = m166373j(r6, r0)
            int r0 = r5.getInt(r0, r1)
            if (r4 > r0) goto L_0x006a
            goto L_0x00d0
        L_0x006a:
            f.a.a.a.bz r0 = p5451f.p5452a.p5453a.p5454a.C69431bz.MULTIPLE_TABS
            if (r12 == r0) goto L_0x00d0
            f.a.a.a.bz r0 = p5451f.p5452a.p5453a.p5454a.C69431bz.UNKNOWN_TAB
            if (r12 != r0) goto L_0x0073
            goto L_0x00d0
        L_0x0073:
            f.a.a.a.aq r0 = r10.mo91900h(r11)
            java.util.Map r4 = r10.f280648f
            java.lang.Object r0 = r4.get(r0)
            f.a.a.a.bz r0 = (p5451f.p5452a.p5453a.p5454a.C69431bz) r0
            f.a.a.a.bz r4 = p5451f.p5452a.p5453a.p5454a.C69431bz.MULTIPLE_TABS
            if (r0 == r4) goto L_0x0085
            if (r0 != r12) goto L_0x00d0
        L_0x0085:
            int r4 = r12.f185791j
            f.a.a.a.bz r5 = p5451f.p5452a.p5453a.p5454a.C69431bz.NO_TAB
            if (r12 != r5) goto L_0x008d
            if (r0 == r12) goto L_0x00bc
        L_0x008d:
            com.google.android.apps.gsa.search.core.preferences.r r12 = r10.f280644b
            java.lang.String r0 = "interval_time_for_tab_type_"
            java.lang.String r5 = m166373j(r0, r4)
            boolean r12 = r12.contains(r5)
            if (r12 == 0) goto L_0x00bc
            com.google.android.libraries.f.a r12 = r10.f280645c
            long r5 = r12.mo26870b()
            com.google.android.apps.gsa.search.core.preferences.r r12 = r10.f280644b
            java.lang.String r0 = m166373j(r0, r4)
            long r7 = r12.getLong(r0, r2)
            com.google.android.apps.gsa.search.core.preferences.r r12 = r10.f280644b
            java.lang.String r0 = "last_tip_seen_time_for_tab_type_"
            java.lang.String r0 = m166373j(r0, r4)
            long r2 = r12.getLong(r0, r2)
            long r5 = r5 - r2
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x00d0
        L_0x00bc:
            com.google.android.apps.gsa.search.core.preferences.r r12 = r10.f280644b
            com.google.android.apps.gsa.search.core.preferences.q r12 = r12.mo80076b()
            java.lang.String r0 = "tab_type_for_tip_id_"
            java.lang.String r11 = m166373j(r0, r11)
            r12.mo80070e(r11, r4)
            r12.apply()
            r11 = 1
            return r11
        L_0x00d0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7887eb.C100358d.m166376t(int, f.a.a.a.bz):boolean");
    }

    /* renamed from: u */
    private final boolean m166377u(int i) {
        long b = this.f280645c.mo26870b();
        if (this.f280644b.contains(m166373j("interval_time_for_positive_interaction_", i))) {
            if (b - this.f280644b.getLong(m166373j("last_tip_seen_time_for_positive_interaction_", i), 0) < this.f280644b.getLong(m166373j("interval_time_for_positive_interaction_", i), 0)) {
                return false;
            }
        }
        if (!this.f280644b.contains(m166373j("interval_time_for_negative_interaction_", i))) {
            return true;
        }
        if (b - this.f280644b.getLong(m166373j("last_tip_seen_time_for_negative_interaction_", i), 0) < this.f280644b.getLong(m166373j("interval_time_for_negative_interaction_", i), 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C58833ax mo83325a(C69395aq aqVar) {
        C69431bz bzVar = (C69431bz) this.f280648f.get(aqVar);
        if (bzVar == null) {
            return C58836b.f156633a;
        }
        return mo83326b(aqVar, bzVar);
    }

    /* renamed from: b */
    public final C58833ax mo83326b(C69395aq aqVar, C69431bz bzVar) {
        int[] f = this.f280644b.mo80080f(m166373j("ids_for_tip_case_", aqVar.f185677j));
        if (f.length <= 0) {
            return C58836b.f156633a;
        }
        return (mo91907p(f[0]) || (m166376t(f[0], bzVar) && m166377u(f[0]))) ? C58833ax.m90834k(Integer.valueOf(f[0])) : C58836b.f156633a;
    }

    /* renamed from: c */
    public final C69396ar mo83327c(int i) {
        mo91902k(i);
        return (C69396ar) C62942bv.parseFrom((C62942bv) C69396ar.f185678d, Base64.decode(this.f280644b.getString(m166373j("feature_tip_", i), BuildConfig.FLAVOR), 0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086 A[Catch:{ a | ct -> 0x0109 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[Catch:{ a | ct -> 0x0109 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83328d(int r15) {
        /*
            r14 = this;
            java.lang.String r0 = "last_tip_requested_time_for_tip_type_"
            java.lang.String r1 = "requested_tip_for_tip_type_"
            com.google.android.apps.gsa.search.core.i.t r2 = r14.f280650h
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246533H
            boolean r2 = r2.mo79746e(r3)
            r3 = 1
            if (r2 != 0) goto L_0x0010
            return r3
        L_0x0010:
            r2 = 0
            f.a.a.a.aq r4 = r14.mo91900h(r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            f.a.a.a.bz r5 = r14.mo91901i(r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            com.google.common.base.ax r6 = r14.mo91898f(r4)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            boolean r6 = m166375s(r6, r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r6 != 0) goto L_0x0024
            return r2
        L_0x0024:
            f.a.a.a.bz r6 = p5451f.p5452a.p5453a.p5454a.C69431bz.NO_TAB     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r5 != r6) goto L_0x0031
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            goto L_0x0035
        L_0x0031:
            com.google.common.base.ax r6 = r14.mo91897e(r5)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
        L_0x0035:
            boolean r6 = m166375s(r6, r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r6 != 0) goto L_0x003c
            return r2
        L_0x003c:
            boolean r6 = r14.mo91907p(r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r6 != 0) goto L_0x0051
            boolean r6 = r14.m166377u(r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r6 != 0) goto L_0x0049
            return r2
        L_0x0049:
            boolean r6 = r14.m166376t(r15, r5)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r6 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            return r2
        L_0x0051:
            com.google.android.apps.gsa.search.core.preferences.r r6 = r14.f280644b     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            int r7 = r4.f185677j     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            java.lang.String r7 = m166373j(r1, r7)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            r8 = -1
            int r6 = r6.getInt(r7, r8)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            com.google.android.apps.gsa.search.core.preferences.r r7 = r14.f280644b     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            int r9 = r4.f185677j     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            java.lang.String r9 = m166373j(r0, r9)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            r10 = 0
            long r12 = r7.getLong(r9, r10)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r6 == r8) goto L_0x007e
            boolean r7 = r14.m166374r(r12)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r7 == 0) goto L_0x0075
            goto L_0x007e
        L_0x0075:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            goto L_0x0080
        L_0x007e:
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x010b, a -> 0x0109 }
        L_0x0080:
            boolean r6 = m166375s(r6, r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r6 != 0) goto L_0x0087
            return r2
        L_0x0087:
            f.a.a.a.bz r6 = p5451f.p5452a.p5453a.p5454a.C69431bz.NO_TAB     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            java.lang.String r7 = "last_tip_requested_time_for_tab_type_"
            java.lang.String r9 = "requested_tip_for_tab_type_"
            if (r5 != r6) goto L_0x0098
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            goto L_0x00c8
        L_0x0098:
            com.google.android.apps.gsa.search.core.preferences.r r6 = r14.f280644b     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            int r12 = r5.f185791j     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            java.lang.String r12 = m166373j(r9, r12)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            int r6 = r6.getInt(r12, r8)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            com.google.android.apps.gsa.search.core.preferences.r r12 = r14.f280644b     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            int r13 = r5.f185791j     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            java.lang.String r13 = m166373j(r7, r13)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            long r10 = r12.getLong(r13, r10)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            f.a.a.a.bz r12 = p5451f.p5452a.p5453a.p5454a.C69431bz.UNKNOWN_TAB     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r5 == r12) goto L_0x00c6
            if (r6 == r8) goto L_0x00c6
            boolean r8 = r14.m166374r(r10)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r8 == 0) goto L_0x00bd
            goto L_0x00c6
        L_0x00bd:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            goto L_0x00c8
        L_0x00c6:
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x010b, a -> 0x0109 }
        L_0x00c8:
            boolean r6 = m166375s(r6, r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            if (r6 != 0) goto L_0x00cf
            return r2
        L_0x00cf:
            com.google.android.apps.gsa.search.core.preferences.r r6 = r14.f280644b     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            com.google.android.apps.gsa.search.core.preferences.q r6 = r6.mo80076b()     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            int r8 = r4.f185677j     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            java.lang.String r1 = m166373j(r1, r8)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            r6.mo80070e(r1, r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            int r1 = r4.f185677j     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            java.lang.String r0 = m166373j(r0, r1)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            com.google.android.libraries.f.a r1 = r14.f280645c     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            long r10 = r1.mo26870b()     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            r6.mo80072g(r0, r10)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            int r0 = r5.f185791j     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            java.lang.String r0 = m166373j(r9, r0)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            r6.mo80070e(r0, r15)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            int r0 = r5.f185791j     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            java.lang.String r0 = m166373j(r7, r0)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            com.google.android.libraries.f.a r1 = r14.f280645c     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            long r4 = r1.mo26870b()     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            r6.mo80072g(r0, r4)     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            r6.apply()     // Catch:{ ct -> 0x010b, a -> 0x0109 }
            return r3
        L_0x0109:
            r0 = move-exception
            goto L_0x010c
        L_0x010b:
            r0 = move-exception
        L_0x010c:
            com.google.common.f.e r1 = f280643a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "TipSharedPrefManager"
            r1.mo56378ag(r3, r4)
            java.lang.String r3 = "Error checking if tip %d can be shown"
            r4 = 33324(0x822c, float:4.6697E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r4)).mo56387q(r3, r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7887eb.C100358d.mo83328d(int):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C58833ax mo91897e(C69431bz bzVar) {
        int i = this.f280644b.getInt(m166373j("active_tab_tip_", bzVar.f185791j), -1);
        if (bzVar == C69431bz.UNKNOWN_TAB || i == -1) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C58833ax mo91898f(C69395aq aqVar) {
        int i = this.f280644b.getInt(m166373j("active_type_tip_", aqVar.f185677j), -1);
        if (i == -1) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C58485gu mo91899g() {
        return C58485gu.m89842j(C60757n.m92749j(this.f280644b.mo80080f("setup_tips")));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C69395aq mo91900h(int i) {
        mo91902k(i);
        return C69395aq.m100747a(this.f280644b.getInt(m166373j("feature_tip_case_", i), 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C69431bz mo91901i(int i) {
        mo91902k(i);
        return C69431bz.m100756a(this.f280644b.getInt(m166373j("tab_type_for_tip_id_", i), C69431bz.UNKNOWN_TAB.f185791j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo91902k(int i) {
        if (this.f280644b.getBoolean(m166373j("done_", i), true)) {
            throw new C89408a(String.format("Tip %d is already cleaned up.", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: l */
    public final void mo91903l() {
        C58976aa aaVar = C58975e.f156826a;
        for (Map.Entry entry : this.f280644b.getAll().entrySet()) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo91904m(int i) {
        C69395aq h = mo91900h(i);
        C58833ax f = mo91898f(h);
        C69431bz i2 = mo91901i(i);
        C58833ax k = i2 == C69431bz.NO_TAB ? C58833ax.m90834k(Integer.valueOf(i)) : mo91897e(i2);
        if (((Integer) f.mo56109e(-1)).intValue() == i && ((Integer) k.mo56109e(-1)).intValue() == i) {
            C86337q b = this.f280644b.mo80076b();
            b.mo80075j(m166373j("active_type_tip_", h.f185677j));
            b.mo80075j(m166373j("active_tab_tip_", i2.f185791j));
            b.mo80075j(m166373j("tab_type_for_tip_id_", i));
            b.apply();
            return;
        }
        C59104x c = f280643a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TipSharedPrefManager");
        ((C59052c) ((C59052c) c).mo56372aa(33319)).mo56386p("Active tips for tip type and tab type are different");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo91905n(C69396ar arVar) {
        C69421bp bpVar = arVar.f185682c;
        if (bpVar == null) {
            bpVar = C69421bp.f185742q;
        }
        int i = bpVar.f185745b;
        C86337q b = this.f280644b.mo80076b();
        if ((bpVar.f185744a & 2) != 0) {
            b.mo80072g(m166373j("time_start_time_", i), -1);
            b.mo80070e(m166373j("time_duration_", i), bpVar.f185746c);
        }
        if ((bpVar.f185744a & 4) != 0) {
            b.mo80070e(m166373j("impression_max_", i), bpVar.f185747d);
            b.mo80070e(m166373j("impression_count_", i), 0);
        }
        if ((bpVar.f185744a & 512) != 0) {
            b.mo80070e(m166373j("positive_interaction_max_", i), bpVar.f185753j);
            String j = m166373j("positive_interaction_count_", i);
            if (!this.f280644b.contains(j)) {
                b.mo80070e(j, 0);
            }
        }
        if ((bpVar.f185744a & 1024) != 0) {
            b.mo80072g(m166373j("interval_time_for_positive_interaction_", i), bpVar.f185754k);
            String j2 = m166373j("last_tip_seen_time_for_positive_interaction_", i);
            if (!this.f280644b.contains(j2)) {
                b.mo80072g(j2, 0);
            }
        }
        if ((bpVar.f185744a & 2048) != 0) {
            b.mo80070e(m166373j("negative_interaction_max_", i), bpVar.f185755l);
            String j3 = m166373j("negative_interaction_count_", i);
            if (!this.f280644b.contains(j3)) {
                b.mo80070e(j3, 0);
            }
        }
        if ((bpVar.f185744a & 4096) != 0) {
            b.mo80072g(m166373j("interval_time_for_negative_interaction_", i), bpVar.f185756m);
            String j4 = m166373j("last_tip_seen_time_for_negative_interaction_", i);
            if (!this.f280644b.contains(j4)) {
                b.mo80072g(j4, 0);
            }
        }
        if ((bpVar.f185744a & 8) != 0 && bpVar.f185748e) {
            b.mo80067b(m166373j("dismissed_on_click_", i), false);
        }
        if ((bpVar.f185744a & 128) != 0) {
            String j5 = m166373j("conditions_", i);
            C69415bj bjVar = bpVar.f185750g;
            if (bjVar == null) {
                bjVar = C69415bj.f185728c;
            }
            b.mo80073h(j5, Base64.encodeToString(bjVar.toByteArray(), 0));
            b.mo80067b(m166373j("conditions_resolved_", i), false);
        }
        if ((bpVar.f185744a & 8192) != 0 && bpVar.f185757n && !this.f280644b.contains(m166373j("conditions_met_once_", i))) {
            b.mo80067b(m166373j("conditions_met_once_", i), false);
        }
        if (bpVar.f185759p) {
            b.mo80067b(m166373j("is_reactive_tip_", i), true);
        }
        int i2 = C69395aq.m100747a(arVar.f185680a).f185677j;
        ArrayList arrayList = new ArrayList(C60757n.m92749j(this.f280644b.mo80080f(m166373j("ids_for_tip_case_", i2))));
        arrayList.add(Integer.valueOf(i));
        b.mo80071f(m166373j("ids_for_tip_case_", i2), C60757n.m92752m(arrayList));
        b.mo80070e(m166373j("feature_tip_case_", i), i2);
        b.mo80073h(m166373j("feature_tip_", i), Base64.encodeToString(arVar.toByteArray(), 0));
        b.mo80067b(m166373j("done_", i), false);
        b.apply();
        mo91903l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo91906o(int i) {
        C58976aa aaVar = C58975e.f156826a;
        C86337q b = this.f280644b.mo80076b();
        try {
            mo91904m(i);
        } catch (C89408a | C62974ct e) {
            C59104x c = f280643a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TipSharedPrefManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33323)).mo56386p("Failed to clear current tip");
        }
        int i2 = this.f280644b.getInt(m166373j("feature_tip_case_", i), 0);
        ArrayList arrayList = new ArrayList(C60757n.m92749j(this.f280644b.mo80080f(m166373j("ids_for_tip_case_", i2))));
        int indexOf = arrayList.indexOf(Integer.valueOf(i));
        while (indexOf >= 0) {
            arrayList.remove(indexOf);
            if (arrayList.isEmpty()) {
                b.mo80075j(m166373j("ids_for_tip_case_", i2));
            } else {
                b.mo80071f(m166373j("ids_for_tip_case_", i2), C60757n.m92752m(arrayList));
            }
            indexOf = arrayList.indexOf(Integer.valueOf(i));
        }
        for (String str : this.f280644b.getAll().keySet()) {
            if (!str.startsWith("done_") && str.endsWith(Integer.toString(i))) {
                b.mo80075j(str);
            }
        }
        b.mo80067b(m166373j("done_", i), true);
        b.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo91907p(int i) {
        mo91902k(i);
        return this.f280644b.getBoolean(m166373j("is_reactive_tip_", i), false);
    }

    /* renamed from: q */
    public final boolean mo91908q(int i) {
        int i2 = i;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f280644b.getBoolean(m166373j("done_", i2), false)) {
            return true;
        }
        try {
            mo91902k(i);
            C69421bp bpVar = ((C69396ar) C62942bv.parseFrom((C62942bv) C69396ar.f185678d, Base64.decode(this.f280644b.getString(m166373j("feature_tip_", i2), BuildConfig.FLAVOR), 0))).f185682c;
            if (bpVar == null) {
                bpVar = C69421bp.f185742q;
            }
            int i3 = bpVar.f185744a;
            if ((i3 & 2) == 0 && (i3 & 4) == 0 && (i3 & 8) == 0 && (i3 & 128) == 0 && (i3 & 512) == 0 && (i3 & 2048) == 0) {
                return true;
            }
        } catch (C89408a | C62974ct e) {
            C59104x c = f280643a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TipSharedPrefManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33333)).mo56387q("No metadata for tip %d. Should at least have tipId.", i2);
        }
        int i4 = this.f280644b.getInt(m166373j("impression_count_", i2), 0);
        int i5 = this.f280644b.getInt(m166373j("impression_max_", i2), Integer.MAX_VALUE);
        int i6 = this.f280644b.getInt(m166373j("positive_interaction_count_", i2), 0);
        int i7 = this.f280644b.getInt(m166373j("positive_interaction_max_", i2), Integer.MAX_VALUE);
        int i8 = this.f280644b.getInt(m166373j("negative_interaction_count_", i2), 0);
        int i9 = this.f280644b.getInt(m166373j("negative_interaction_max_", i2), Integer.MAX_VALUE);
        long b = this.f280645c.mo26870b();
        long j = this.f280644b.getLong(m166373j("time_start_time_", i2), this.f280645c.mo26870b());
        boolean z = j != -1 && b - j >= ((long) this.f280644b.getInt(m166373j("time_duration_", i2), Integer.MAX_VALUE));
        boolean z2 = this.f280644b.getBoolean(m166373j("dismissed_on_click_", i2), false);
        boolean z3 = this.f280644b.getBoolean(m166373j("conditions_resolved_", i2), false);
        if (i4 >= i5 || z || z2 || z3 || i6 >= i7 || i8 >= i9) {
            return true;
        }
        return false;
    }
}
