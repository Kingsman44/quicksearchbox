package com.google.android.apps.gsa.staticplugins.p7415au;

import android.util.SparseArray;
import androidx.p060c.C0979i;
import com.google.android.apps.gsa.l.a;
import com.google.android.apps.gsa.search.core.logging.eventprocessor.C86177a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C89981at;
import com.google.android.apps.gsa.staticplugins.p7417av.C94142c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqs;
import com.google.common.p4580v.C60951j;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4817a.C63190d;
import com.google.protos.p4816ai.p4817a.C63192f;
import com.google.protos.p4816ai.p4817a.C63193g;
import dagger.C68214a;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.au.d */
/* compiled from: PG */
public final class C94134d implements C86177a, a {

    /* renamed from: a */
    public static final C59071e f262989a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.au.d");

    /* renamed from: b */
    public final C68214a f262990b;

    /* renamed from: c */
    public final Set f262991c;

    /* renamed from: d */
    private final C86124t f262992d;

    /* renamed from: e */
    private final SparseArray f262993e;

    /* renamed from: f */
    private final Map f262994f;

    /* renamed from: g */
    private final Map f262995g;

    /* renamed from: h */
    private final C60870cx f262996h;

    /* renamed from: i */
    private final C21370a f262997i;

    /* renamed from: j */
    private final C86338r f262998j;

    public C94134d(C94142c cVar, C68214a aVar, C86124t tVar, C22871g gVar, C21370a aVar2, C86338r rVar) {
        this.f262990b = aVar;
        this.f262992d = tVar;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : tVar.mo79752r(C89981at.f246636f).entrySet()) {
            try {
                sparseArray.put(Integer.parseInt((String) entry.getKey()), (String) entry.getValue());
            } catch (NumberFormatException e) {
                C59104x d = f262989a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "FirebaseAnalytics");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(19961)).mo56389s("Invalid event (expected int): %s", entry.getKey());
            }
        }
        this.f262993e = sparseArray;
        this.f262994f = tVar.mo79752r(C89981at.f246638h);
        this.f262995g = tVar.mo79752r(C89981at.f246639i);
        this.f262991c = new C0979i((Collection) tVar.mo79745c(C89981at.f246631a));
        this.f262997i = aVar2;
        this.f262998j = rVar;
        this.f262996h = cVar.mo88347a();
        gVar.mo28212l("FirebaseAnalytics", new C94129a(aVar));
    }

    /* renamed from: g */
    private final void m155356g(String str, int i, Map map) {
        C60856cj.m92911t(this.f262996h, new C94132b(this, str, i, map), C60826bg.f164896a);
    }

    /* renamed from: h */
    private final void m155357h(C94133c cVar) {
        long b = this.f262997i.mo26870b();
        if (!Instant.ofEpochMilli(b).atZone(C60951j.f165070a).toLocalDate().equals(Instant.ofEpochMilli(this.f262998j.getLong(cVar.f262986d, 0)).atZone(C60951j.f165070a).toLocalDate())) {
            int i = this.f262998j.getInt(cVar.f262987e, 0) + 1;
            m155356g(cVar.f262985c, 1, C58495hd.m89900n(cVar.f262988f, String.valueOf(i)));
            C86337q b2 = this.f262998j.mo80076b();
            b2.mo80072g(cVar.f262986d, b);
            b2.mo80070e(cVar.f262987e, i);
            b2.apply();
        }
    }

    /* renamed from: a */
    public final void mo88337a(String str, int i) {
        m155356g(str, i, C58729pv.f156485a);
    }

    /* renamed from: b */
    public final void mo88338b(Map map) {
        m155356g("opa_result", 1, map);
    }

    /* renamed from: c */
    public final void mo79812c(int i) {
        String str;
        if (this.f262992d.mo79746e(C89981at.f246633c) && (str = (String) this.f262993e.get(i)) != null) {
            mo88339f(str);
        }
    }

    /* renamed from: d */
    public final void mo79813d(C60321oe oeVar) {
        if (oeVar != null) {
            if (!this.f262994f.isEmpty() || !this.f262995g.isEmpty()) {
                for (aqs aqs : oeVar.f163228c) {
                    String str = (String) this.f262994f.get(String.valueOf(aqs.f159783b));
                    if (str != null) {
                        mo88339f(str);
                    }
                }
                aqm aqm = oeVar.f163230e;
                if (aqm == null) {
                    aqm = aqm.f159760n;
                }
                String str2 = (String) this.f262995g.get(String.format(Locale.US, "%d:%d", new Object[]{Integer.valueOf(aqm.f159765d), Integer.valueOf(aqm.f159767f)}));
                if (str2 != null) {
                    mo88339f(str2);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo79814e(C60555uf ufVar) {
        int a;
        if (this.f262992d.mo79746e(C89981at.f246633c) && this.f262992d.mo79746e(C89981at.f246632b)) {
            int i = ufVar.f164258m;
            if (i == 160 || i == 161) {
                m155357h(C94133c.TEXT_OR_VOICE_SEARCH);
            } else if (i == 1125) {
                m155357h(C94133c.FEED_TAP_OR_SCROLL);
            } else if (i == 1192) {
                C63193g gVar = ufVar.f164110aQ;
                if (gVar == null) {
                    gVar = C63193g.f170718h;
                }
                for (C63192f fVar : gVar.f170725f) {
                    int i2 = fVar.f170705e;
                    int a2 = C63190d.m96203a(i2);
                    if ((a2 != 0 && a2 == 4) || ((a = C63190d.m96203a(i2)) != 0 && a == 10)) {
                        m155357h(C94133c.FEED_TAP_OR_SCROLL);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo88339f(String str) {
        m155356g(str, 1, C58729pv.f156485a);
    }
}
