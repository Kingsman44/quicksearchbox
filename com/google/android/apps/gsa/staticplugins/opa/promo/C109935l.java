package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113868cw;
import com.google.android.apps.gsa.staticplugins.opa.util.C113880k;
import com.google.android.apps.gsa.staticplugins.opa.widget.impl.C114250c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.ais;
import com.google.common.p4552o.ait;
import com.google.common.p4552o.ajw;
import com.google.common.p4552o.ajy;
import com.google.common.p4552o.ajz;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.protos.p4985f.p5036r.C65316b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.l */
/* compiled from: PG */
public final class C109935l {

    /* renamed from: a */
    public static final C59071e f306306a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.promo.l");

    /* renamed from: b */
    static final C48980c f306307b = C48980c.TYPE_OPA_MISC;

    /* renamed from: c */
    public final Context f306308c;

    /* renamed from: d */
    public final C1800aq f306309d;

    /* renamed from: e */
    public final C36337r f306310e;

    /* renamed from: f */
    public final C114540i f306311f;

    /* renamed from: g */
    public final C22871g f306312g;

    /* renamed from: h */
    private final C69464a f306313h;

    /* renamed from: i */
    private final C86124t f306314i;

    /* renamed from: j */
    private final C113880k f306315j;

    /* renamed from: k */
    private final SharedPreferences f306316k;

    /* renamed from: l */
    private final C113868cw f306317l;

    /* renamed from: m */
    private final C21370a f306318m;

    /* renamed from: n */
    private final C114250c f306319n;

    public C109935l(Context context, C69464a aVar, C1800aq aqVar, C36337r rVar, C86124t tVar, C113880k kVar, SharedPreferences sharedPreferences, C113868cw cwVar, C114540i iVar, C22871g gVar, C114250c cVar, C21370a aVar2) {
        this.f306308c = context;
        this.f306313h = aVar;
        this.f306309d = aqVar;
        this.f306310e = rVar;
        this.f306314i = tVar;
        this.f306315j = kVar;
        this.f306316k = sharedPreferences;
        this.f306317l = cwVar;
        this.f306311f = iVar;
        this.f306312g = gVar;
        this.f306319n = cVar;
        this.f306318m = aVar2;
    }

    /* renamed from: a */
    public static C28292j m183103a() {
        C28292j jVar = new C28292j(46142);
        jVar.mo33795i(5);
        jVar.mo33795i(22);
        jVar.mo33794h(1);
        return jVar;
    }

    /* renamed from: d */
    public static C58833ax m183104d(C28292j jVar, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C28293k.m52908e(jVar, new C28293k[0]));
        C60321oe b = C28285c.m52875b(C28293k.m52907d(new C28292j(47411), arrayList), 47411);
        if (b == null || b.f163228c.isEmpty()) {
            return C58836b.f156633a;
        }
        ais ais = (ais) ait.f158838e.createBuilder();
        ais.copyOnWrite();
        ait ait = (ait) ais.instance;
        ait.f158841a |= 1;
        ait.f158842b = 1011194;
        ajw ajw = (ajw) ajz.f158928q.createBuilder();
        String name = C89094c.OPA_FEATURE_PROMO.name();
        ajw.copyOnWrite();
        ajz ajz = (ajz) ajw.instance;
        name.getClass();
        ajz.f158932a |= 1;
        ajz.f158933b = name;
        ajw.copyOnWrite();
        ajz ajz2 = (ajz) ajw.instance;
        ajz2.f158932a |= 8;
        ajz2.f158936e = 25;
        ajy ajy = ajy.CLIENT_GENERATED;
        ajw.copyOnWrite();
        ajz ajz3 = (ajz) ajw.instance;
        ajz3.f158939h = ajy.f158927f;
        ajz3.f158932a |= 64;
        ajw.copyOnWrite();
        ajz ajz4 = (ajz) ajw.instance;
        str.getClass();
        ajz4.f158932a |= 128;
        ajz4.f158940i = str;
        ajw.copyOnWrite();
        ajz ajz5 = (ajz) ajw.instance;
        str2.getClass();
        ajz5.f158932a |= 256;
        ajz5.f158941j = str2;
        int b2 = C65316b.m96665b(280);
        ajw.copyOnWrite();
        ajz ajz6 = (ajz) ajw.instance;
        ajz6.f158932a |= 16;
        ajz6.f158937f = b2;
        aqp aqp = (aqp) ((aqs) b.f163228c.get(0)).toBuilder();
        aqp.mo58885m(ait.f158839f, (ait) ais.build());
        aqp.mo58885m(ajz.f158929r, (ajz) ajw.build());
        aqp.copyOnWrite();
        aqs aqs = (aqs) aqp.instance;
        aqs.f159789h = 0;
        aqs.f159782a |= 32;
        C60320od odVar = (C60320od) b.toBuilder();
        odVar.mo57084d(0, (aqs) aqp.build());
        return C58833ax.m90834k((C60321oe) odVar.build());
    }

    /* renamed from: b */
    public final void mo98260b() {
        if (mo98261c()) {
            new C90873ag(this.f306311f.mo101392b("opa_entry_point_notification_count", 0), this.f306312g, "nofiticationSentCountFuture", new C109930g(this)).mo85223a(C109931h.f306301a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo98261c() {
        if (!this.f306314i.mo79746e(C90037cp.f248413U) && !this.f306314i.mo79746e(C90037cp.f248432aM)) {
            return false;
        }
        if (this.f306316k.getLong("opa_eligibility_change_timestamp", 0) == 0) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        long a = this.f306314i.mo79743a(C90037cp.f248412T);
        long b = this.f306318m.mo26870b();
        if (b - this.f306316k.getLong("opa_eligibility_change_timestamp", b) >= TimeUnit.HOURS.toMillis(a)) {
            if (!this.f306310e.mo40120g()) {
                C58976aa aaVar2 = C58975e.f156826a;
            } else {
                C36337r rVar = this.f306310e;
                if (!rVar.mo40121h(rVar.mo40115b(f306307b))) {
                    C58976aa aaVar3 = C58975e.f156826a;
                } else if (this.f306315j.mo100738c() < 2 || this.f306317l.mo100727a() || this.f306319n.mo101288a() || !((bm) this.f306313h.mo17428b()).u() || ((long) this.f306316k.getInt("opa_add_shortcut_screen_seen_count", 0)) >= this.f306314i.mo79743a(C90037cp.f248572cu)) {
                    return false;
                } else {
                    if (this.f306314i.mo79746e(C90037cp.f248432aM)) {
                        new C90873ag(this.f306311f.mo101392b("opa_entry_point_notification_counterfactual", 0), this.f306312g, "nofiticationCounterfactualFuture", new C109933j(this)).mo85223a(C109934k.f306305a);
                    }
                    return this.f306314i.mo79746e(C90037cp.f248413U);
                }
            }
            return false;
        }
        C58976aa aaVar4 = C58975e.f156826a;
        return false;
    }
}
