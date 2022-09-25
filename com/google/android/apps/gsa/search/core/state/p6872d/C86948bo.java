package com.google.android.apps.gsa.search.core.state.p6872d;

import android.app.Notification;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.p6864a.C86802q;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88230tz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88233ub;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.keepalive.C91049a;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.bo */
/* compiled from: PG */
public final class C86948bo extends C86898ct implements C86802q {

    /* renamed from: a */
    public static final C59071e f234843a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.bo");

    /* renamed from: b */
    public final C68214a f234844b;

    /* renamed from: c */
    public final C68214a f234845c;

    /* renamed from: d */
    public boolean f234846d = false;

    /* renamed from: e */
    public boolean f234847e;

    /* renamed from: f */
    public final BitFlags f234848f = new BitFlags(getClass(), "FLAG_START_", 0);

    /* renamed from: g */
    public volatile boolean f234849g;

    /* renamed from: h */
    public volatile boolean f234850h;

    /* renamed from: i */
    public Intent f234851i;

    /* renamed from: j */
    public int f234852j = 1;

    /* renamed from: k */
    private final C68214a f234853k;

    /* renamed from: l */
    private final C68214a f234854l;

    /* renamed from: m */
    private final C68214a f234855m;

    /* renamed from: n */
    private final C84516aa f234856n;

    /* renamed from: o */
    private final C91049a f234857o;

    /* renamed from: p */
    private boolean f234858p;

    /* renamed from: q */
    private boolean f234859q;

    /* renamed from: r */
    private boolean f234860r;

    /* renamed from: s */
    private final Set f234861s;

    /* renamed from: t */
    private C58833ax f234862t = C58836b.f156633a;

    public C86948bo(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C84516aa aaVar, C91049a aVar7) {
        super(aVar, 18);
        this.f234853k = aVar2;
        this.f234844b = aVar3;
        this.f234854l = aVar4;
        this.f234845c = aVar5;
        this.f234855m = aVar6;
        this.f234856n = aaVar;
        this.f234857o = aVar7;
        boolean isDeviceLocked = aaVar.f230023b.isDeviceLocked();
        C58976aa aaVar2 = C58975e.f156826a;
        this.f234859q = isDeviceLocked;
        this.f234858p = aaVar.mo78230d();
        this.f234847e = this.f234859q;
        this.f234861s = new HashSet();
    }

    /* renamed from: A */
    private final Map m140319A() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = this.f234852j;
        int i2 = i - 1;
        if (i != 0) {
            linkedHashMap.put("mTakenStartedState", Integer.valueOf(i2));
            linkedHashMap.put("mLastReportedIsScreenOn", Boolean.valueOf(this.f234858p));
            linkedHashMap.put("mLastReportedIsLocked", Boolean.valueOf(this.f234847e));
            Object obj = this.f234851i;
            if (obj == null) {
                obj = "NULL";
            }
            linkedHashMap.put("mPendingServiceIntent", obj);
            linkedHashMap.put("mDeviceLocked", Boolean.valueOf(this.f234859q));
            linkedHashMap.put("Flags", this.f234848f.mo85048b());
            return linkedHashMap;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo80498a(long j) {
        if (this.f234862t.mo56113h() && ((Long) this.f234862t.mo56107c()).equals(Long.valueOf(j))) {
            this.f234862t = C58836b.f156633a;
            this.f234848f.mo85049c(32, 0);
            this.f234846d = true;
            mo80591ar();
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.REFRESH_SERVICE_STATE, C87739bu.COMMON_BROADCAST_MESSAGE_RECEIVED, C87739bu.SCREEN_STATE_CHANGE};
    }

    /* renamed from: b */
    public final void mo80499b(boolean z) {
        if (this.f234859q != z) {
            this.f234859q = z;
            mo80591ar();
        }
    }

    /* renamed from: c */
    public final void mo80500c(boolean z) {
        if (this.f234858p != z) {
            this.f234858p = z;
            mo80600s();
        }
    }

    /* renamed from: e */
    public final void mo80501e() {
        this.f234860r = true;
    }

    /* renamed from: f */
    public final void mo80502f(long j) {
        if (!this.f234862t.mo56113h() || !((Long) this.f234862t.mo56107c()).equals(Long.valueOf(j))) {
            this.f234862t = C58833ax.m90834k(Long.valueOf(j));
            this.f234848f.mo85049c(0, 32);
            this.f234846d = true;
            mo80591ar();
        }
    }

    /* renamed from: g */
    public final void mo80503g(long j, boolean z) {
        if (z) {
            this.f234861s.add(Long.valueOf(j));
        } else {
            this.f234861s.remove(Long.valueOf(j));
        }
        if (this.f234848f.mo85055h(4096, !this.f234861s.isEmpty())) {
            mo80591ar();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ServiceState");
        for (Map.Entry entry : m140319A().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148228b((Boolean) value));
            } else if (value instanceof Number) {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148230d((Number) value));
            } else {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148233g(String.valueOf(value)));
            }
        }
    }

    @Deprecated
    /* renamed from: h */
    public final void mo80504h(boolean z) {
        if (this.f234848f.mo85055h(1, z)) {
            this.f234846d = true;
            mo80591ar();
        }
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 67) {
            mo80600s();
        } else if (ordinal == 157) {
            C62940bt btVar = C88230tz.f238473a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r1 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r1);
            Object l = bwVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj = r1.f169969b;
            } else {
                obj = r1.mo58889c(l);
            }
            mo80500c(((C88233ub) obj).f238481b);
        }
    }

    /* renamed from: i */
    public final void mo80505i(int i, Notification notification) {
        C91049a aVar = this.f234857o;
        boolean z = aVar.f254311c.size() == 0;
        Integer num = aVar.f254312d;
        aVar.mo85331b(i, notification, true, z);
        if (!(!z || num == null || num.intValue() == i)) {
            aVar.mo85331b(num.intValue(), (Notification) aVar.f254310b.get(num.intValue()), false, false);
        }
        this.f234846d = true;
        mo80591ar();
    }

    /* renamed from: k */
    public final void mo80507k(Notification notification) {
        C91049a aVar = this.f234857o;
        aVar.mo85331b(C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE, notification, aVar.f254311c.get(C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE), aVar.mo85332c(C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE));
    }

    /* renamed from: m */
    public final boolean mo80508m() {
        return this.f234850h;
    }

    /* renamed from: n */
    public final boolean mo80509n() {
        return this.f234859q;
    }

    /* renamed from: o */
    public final boolean mo80510o() {
        return BitFlags.m148144f(this.f234848f.f253762b, 16);
    }

    /* renamed from: p */
    public final boolean mo80511p() {
        return !this.f234860r;
    }

    /* renamed from: q */
    public final Intent mo80598q(String str) {
        Intent intent = this.f234851i;
        if (intent == null || !str.equals(intent.getAction())) {
            return null;
        }
        Intent intent2 = this.f234851i;
        this.f234851i = null;
        this.f234848f.mo85049c(64, 0);
        return intent2;
    }

    /* renamed from: r */
    public final void mo80599r(boolean z) {
        if (this.f234848f.mo85055h(16, z) || z) {
            if (z) {
                this.f234846d = true;
            }
            mo80591ar();
        }
    }

    /* renamed from: s */
    public final void mo80600s() {
        if (mo80601t()) {
            mo80591ar();
        }
    }

    /* renamed from: t */
    public final boolean mo80601t() {
        boolean z;
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        boolean h = this.f234848f.mo85055h(256, ((C86938be) this.f234844b.mo27525b()).mo80581I());
        BitFlags bitFlags = this.f234848f;
        C86941bh bhVar = (C86941bh) this.f234845c.mo27525b();
        C60870cx cxVar4 = bhVar.f234821f;
        boolean z2 = false;
        if ((cxVar4 == null || cxVar4.isDone()) && (((cxVar = bhVar.f234819d) == null || cxVar.isDone()) && (((cxVar2 = bhVar.f234820e) == null || cxVar2.isDone()) && ((cxVar3 = bhVar.f234822g) == null || cxVar3.isDone())))) {
            z = false;
        } else {
            z = true;
        }
        boolean h2 = h | bitFlags.mo85055h(128, z) | this.f234848f.mo85055h(512, ((C86954f) this.f234855m.mo27525b()).f234873e);
        BitFlags bitFlags2 = this.f234848f;
        C60870cx cxVar5 = ((C86920an) this.f234853k.mo27525b()).f234735d;
        if (cxVar5 != null && !cxVar5.isDone()) {
            z2 = true;
        }
        return h2 | bitFlags2.mo85055h(8192, z2);
    }

    public final String toString() {
        String obj = m140319A().toString();
        return "ServiceState(state=" + obj + ")";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo80603v() {
        return BitFlags.m148144f(this.f234848f.f253762b, 1);
    }

    /* renamed from: x */
    public final boolean mo80604x() {
        return !this.f234850h && mo80605y() == 2 && this.f234852j != 2;
    }

    /* renamed from: y */
    public final int mo80605y() {
        if (!this.f234848f.mo85052e(56) && !mo80603v() && this.f234857o.f254311c.size() == 0 && !this.f234849g) {
            boolean z = false;
            for (Integer num : ((C86940bg) this.f234854l.mo27525b()).f234813a.values()) {
                if (num != null && (num.intValue() == 1 || num.intValue() == 2)) {
                    z = true;
                }
            }
            if (z || this.f234848f.mo85052e(13248)) {
                return 2;
            }
            return 1;
        }
        return 2;
    }

    /* renamed from: z */
    public final boolean mo80606z(int i) {
        if (this.f234850h) {
            this.f234846d = false;
            return false;
        }
        boolean z = mo80605y() == i && this.f234852j != i;
        if (z) {
            this.f234852j = i;
            this.f234846d = false;
        }
        return z;
    }

    /* renamed from: j */
    public final void mo80506j(int i, boolean z) {
        C91049a aVar = this.f234857o;
        if (z) {
            if (aVar.mo85332c(i)) {
                if (aVar.f254311c.get(i)) {
                    aVar.mo85330a(true);
                } else {
                    aVar.f254312d = null;
                }
            }
            aVar.f254309a.cancel(i);
            aVar.f254311c.delete(i);
            aVar.f254310b.delete(i);
        } else if (aVar.f254311c.get(i)) {
            if (aVar.mo85332c(i)) {
                aVar.mo85330a(false);
            } else {
                aVar.mo85331b(i, (Notification) aVar.f254310b.get(i), false, false);
            }
        }
        mo80591ar();
    }
}
