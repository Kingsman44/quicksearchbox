package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114546e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l;
import com.google.assistant.p3994s.p3995a.C53401mn;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bu */
/* compiled from: PG */
public final class C115017bu implements C114758l {

    /* renamed from: a */
    public final C53401mn f319249a;

    /* renamed from: b */
    public final String f319250b;

    /* renamed from: c */
    public final C114546e f319251c;

    /* renamed from: d */
    public final C86054o f319252d;

    /* renamed from: e */
    public final C58833ax f319253e;

    /* renamed from: f */
    public final SharedPreferences f319254f;

    /* renamed from: g */
    public final C86124t f319255g;

    /* renamed from: h */
    public C58833ax f319256h;

    /* renamed from: i */
    public C58833ax f319257i;

    /* renamed from: j */
    public C58881cr f319258j = mo101818c();

    public C115017bu(C86054o oVar, C58833ax axVar, SharedPreferences sharedPreferences, C86124t tVar, C53401mn mnVar, String str, C114546e eVar) {
        C58836b bVar = C58836b.f156633a;
        this.f319256h = bVar;
        this.f319257i = bVar;
        this.f319252d = oVar;
        this.f319253e = axVar;
        this.f319254f = sharedPreferences;
        this.f319255g = tVar;
        this.f319249a = mnVar;
        this.f319250b = str;
        this.f319251c = eVar;
    }

    /* renamed from: a */
    public final C58833ax mo101817a() {
        C53401mn mnVar = this.f319249a;
        return (mnVar.f140128a & 8) != 0 ? C58833ax.m90834k(Integer.valueOf(mnVar.f140132e)) : C58836b.f156633a;
    }

    /* renamed from: b */
    public final int mo101585b() {
        return 1;
    }

    /* renamed from: c */
    public final C58881cr mo101818c() {
        return C58886cw.m90973a(new C115015bs(this));
    }

    /* renamed from: d */
    public final C58485gu mo101819d() {
        C58976aa aaVar = C58975e.f156826a;
        return (C58485gu) this.f319258j.mo6453a();
    }
}
