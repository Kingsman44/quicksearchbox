package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85891bn;
import com.google.android.apps.gsa.search.core.p6519al.p6534ag.C84675a;
import com.google.android.apps.gsa.search.core.p6519al.p6676cv.C85225a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87691a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87745c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88169rs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88171ru;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.a */
/* compiled from: PG */
public final class C86906a extends C86898ct {

    /* renamed from: a */
    public boolean f234687a;

    /* renamed from: b */
    public boolean f234688b;

    /* renamed from: c */
    public int f234689c = 0;

    /* renamed from: d */
    public int f234690d = 0;

    /* renamed from: e */
    private final C85225a f234691e;

    /* renamed from: f */
    private final C84675a f234692f;

    /* renamed from: g */
    private final SharedPreferences f234693g;

    /* renamed from: h */
    private final C21370a f234694h;

    /* renamed from: i */
    private final C68214a f234695i;

    /* renamed from: j */
    private final C85891bn f234696j;

    public C86906a(C68214a aVar, SharedPreferences sharedPreferences, C68214a aVar2, C21370a aVar3, C85225a aVar4, C84675a aVar5, C85891bn bnVar) {
        super(aVar, 21);
        this.f234693g = sharedPreferences;
        this.f234695i = aVar2;
        this.f234694h = aVar3;
        this.f234691e = aVar4;
        this.f234692f = aVar5;
        this.f234696j = bnVar;
    }

    /* renamed from: e */
    private final void m140174e(int i) {
        C58976aa aaVar = C58975e.f156826a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        int i2 = this.f234689c;
        if (!(i2 == Integer.MAX_VALUE || i2 == 0)) {
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164253h |= C89885b.HTTP_VALUE;
            ufVar2.f164152bF = i2;
        }
        int i3 = this.f234690d;
        if (!(i3 == Integer.MAX_VALUE || i3 == 0)) {
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            ufVar3.f164253h |= 524288;
            ufVar3.f164153bG = i3;
        }
        boolean z = this.f234687a;
        tzVar.copyOnWrite();
        C60555uf ufVar4 = (C60555uf) tzVar.instance;
        ufVar4.f164254i |= 134217728;
        ufVar4.f164230ch = z;
        boolean z2 = this.f234688b;
        tzVar.copyOnWrite();
        C60555uf ufVar5 = (C60555uf) tzVar.instance;
        ufVar5.f164254i |= 268435456;
        ufVar5.f164231ci = z2;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.ACETONE_LOG_STATE, C87739bu.PIXEL_HOMESCREEN_QSB_TAPPED, C87739bu.ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_IN, C87739bu.ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_OUT, C87739bu.ACETONE_LOG_USER_EVENT_MINUS_ONE_TAP_BACK_BUTTON, C87739bu.ACETONE_LOG_USER_EVENT_MINUS_ONE_CLOSE, C87739bu.ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_FAILED};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AcetoneState");
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 118) {
            C62940bt btVar = C87691a.f237045a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r10 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r10);
            Object l = bwVar.f169962ag.mo58854l(r10.f169971d);
            if (l == null) {
                obj = r10.f169969b;
            } else {
                obj = r10.mo58889c(l);
            }
            C87745c cVar = (C87745c) obj;
            this.f234693g.edit().putLong("acetone_last_active_timestamp", this.f234694h.mo26870b()).apply();
            this.f234689c = cVar.f237489b;
            this.f234690d = cVar.f237490c;
            boolean z = cVar.f237491d;
            boolean z2 = cVar.f237492e;
            C58976aa aaVar = C58975e.f156826a;
            long b = this.f234694h.mo26870b();
            if (b - this.f234693g.getLong("acetone_log_version_timestamp", 0) > 43200000) {
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1116;
                int i = this.f234689c;
                if (!(i == Integer.MAX_VALUE || i == 0)) {
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    ufVar2.f164253h |= C89885b.HTTP_VALUE;
                    ufVar2.f164152bF = i;
                }
                int i2 = this.f234690d;
                if (!(i2 == Integer.MAX_VALUE || i2 == 0)) {
                    tzVar.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar.instance;
                    ufVar3.f164253h |= 524288;
                    ufVar3.f164153bG = i2;
                }
                tzVar.copyOnWrite();
                C60555uf ufVar4 = (C60555uf) tzVar.instance;
                ufVar4.f164253h |= 1048576;
                ufVar4.f164154bH = z;
                tzVar.copyOnWrite();
                C60555uf ufVar5 = (C60555uf) tzVar.instance;
                ufVar5.f164253h |= C89885b.NOW_VALUE;
                ufVar5.f164155bI = z2;
                String d = this.f234696j.mo79525d();
                if (d != null) {
                    tzVar.copyOnWrite();
                    C60555uf ufVar6 = (C60555uf) tzVar.instance;
                    ufVar6.f164254i |= 33554432;
                    ufVar6.f164228cf = d;
                }
                boolean z3 = this.f234688b;
                tzVar.copyOnWrite();
                C60555uf ufVar7 = (C60555uf) tzVar.instance;
                ufVar7.f164254i |= 268435456;
                ufVar7.f164231ci = z3;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                boolean contains = this.f234693g.contains("acetone_log_version_timestamp");
                this.f234693g.edit().putLong("acetone_log_version_timestamp", b).apply();
                if ((!contains) && ((C86124t) this.f234695i.mo27525b()).mo79746e(C89985ax.f246656J)) {
                    this.f234691e.mo78804b(C89257aa.m145193e());
                }
            }
        } else if (ordinal != 124) {
            switch (ordinal) {
                case 185:
                    m140174e(887);
                    return;
                case 186:
                    m140174e(888);
                    return;
                case 187:
                    m140174e(894);
                    return;
                case 188:
                    m140174e(889);
                    return;
                case 189:
                    m140174e(892);
                    return;
                default:
                    return;
            }
        } else if (!((C86124t) this.f234695i.mo27525b()).mo79746e(C89985ax.f246669W) || TextUtils.isEmpty(this.f234693g.getString("qsb_super_g_image_path", BuildConfig.FLAVOR))) {
            this.f234692f.mo78414f(false);
        } else {
            C62940bt btVar2 = C88169rs.f238349a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r102 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r102);
            if (!bwVar2.f169962ag.mo58857o(r102.f169971d) || !this.f234693g.getBoolean("doodle_in_qsb_enabled", true)) {
                C58976aa aaVar2 = C58975e.f156826a;
                this.f234692f.mo78414f(false);
                return;
            }
            C62940bt btVar3 = C88169rs.f238349a;
            C87741bw bwVar3 = clientEventData.f236955a;
            C62940bt r103 = C62942bv.checkIsLite(btVar3);
            bwVar3.mo58887l(r103);
            Object l2 = bwVar3.f169962ag.mo58854l(r103.f169971d);
            if (l2 == null) {
                obj2 = r103.f169969b;
            } else {
                obj2 = r103.mo58889c(l2);
            }
            this.f234692f.mo78414f(((C88171ru) obj2).f238355d);
        }
    }
}
