package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.speech.grammar.pumpkin.C66525q;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.z */
/* compiled from: PG */
public final class C11869z implements a {

    /* renamed from: a */
    private final C86124t f38213a;

    /* renamed from: b */
    private final C9309a f38214b;

    static {
        C58974d.m91134h("OfflinePRPuntBuilder");
    }

    public C11869z(C86124t tVar, C9309a aVar) {
        this.f38213a = tVar;
        this.f38214b = aVar;
    }

    /* renamed from: d */
    private final C51195j m27656d() {
        C9309a aVar = this.f38214b;
        C51809dy a = C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.personal_result_punt));
        if (a == null) {
            return null;
        }
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en b = C15669a.m32463b(Arrays.asList(new C51809dy[]{a}), Arrays.asList(new Integer[]{23202}));
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        b.getClass();
        jVar.f133275j = b;
        jVar.f133266a |= 128;
        return (C51195j) eVar.build();
    }

    /* renamed from: a */
    public final C58833ax mo20257a(C61752n nVar, Query query) {
        C51195j d = m27656d();
        return d != null ? C58833ax.m90834k(d) : C58833ax.m90833j((Object) null);
    }

    /* renamed from: b */
    public final C60870cx mo20258b(C66525q qVar, Query query) {
        C51195j d;
        if ((!this.f38213a.mo79746e(C90086ek.f250366bl) && !this.f38213a.mo79746e(C90086ek.f250360bf)) || qVar == null || (d = m27656d()) == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return C60856cj.m92900i(C58833ax.m90834k(d));
    }

    /* renamed from: c */
    public final C60870cx mo20259c(C52081en enVar) {
        if (this.f38213a.mo79746e(C90086ek.f250366bl)) {
            C9309a aVar = this.f38214b;
            C51809dy a = C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.personal_result_punt));
            if (a != null) {
                return C60856cj.m92900i(C58833ax.m90834k(C15669a.m32463b(C58485gu.m89846n(a), Arrays.asList(new Integer[]{23202}))));
            }
        }
        return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
    }
}
