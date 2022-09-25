package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.p033v7.app.C0395p;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.assistant.shared.bp;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.android.apps.gsa.staticplugins.opa.samson.lightness.C110254f;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110283t;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110284u;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110349bh;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110415l;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110416m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import java.util.ArrayList;
import java.util.Map;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.j */
/* compiled from: PG */
public final class C110099j {

    /* renamed from: l */
    private static final C59071e f306752l = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.j");

    /* renamed from: a */
    public final C69464a f306753a;

    /* renamed from: b */
    public final C110283t f306754b;

    /* renamed from: c */
    public final C110098i f306755c = new C110098i(this);

    /* renamed from: d */
    public final C0395p f306756d;

    /* renamed from: e */
    public final C110254f f306757e;

    /* renamed from: f */
    public final C110349bh f306758f;

    /* renamed from: g */
    public boolean f306759g;

    /* renamed from: h */
    public final C110415l f306760h;

    /* renamed from: i */
    public View.OnClickListener f306761i;

    /* renamed from: j */
    public C109024k f306762j;

    /* renamed from: k */
    public final C21378h f306763k;

    public C110099j(C86124t tVar, C0395p pVar, h hVar, C21378h hVar2, C110254f fVar, C110095f fVar2, Map map, C110284u uVar, C110349bh bhVar, C110416m mVar) {
        this.f306756d = pVar;
        this.f306763k = hVar2;
        Class cls = true != tVar.mo79746e(C90014bt.f247843s) ? C110103n.class : C110106q.class;
        for (Account account : C58833ax.m90833j(hVar.a()).mo56112g()) {
            bp c = C73845bq.m108430c();
            c.b(true);
            String d = c.c().mo65330d();
            if (d != null) {
                if (((SharedPreferences) fVar2.f306748a.mo27525b()).contains(C110095f.m183352a(account.name, d))) {
                    cls = true != ((SharedPreferences) fVar2.f306748a.mo27525b()).getBoolean(C110095f.m183352a(account.name, d), true) ? C110103n.class : C110106q.class;
                }
            }
        }
        C69464a aVar = (C69464a) Objects.requireNonNull((C69464a) map.get(cls));
        this.f306753a = aVar;
        this.f306754b = uVar.mo98534a(1);
        this.f306761i = null;
        this.f306757e = fVar;
        this.f306758f = bhVar;
        int color = pVar.getResources().getColor(R.color.clock_notification_ui_color, (Resources.Theme) null);
        LinearLayout c2 = ((C110100k) aVar.mo17428b()).mo98377c();
        View b = ((C110100k) aVar.mo17428b()).mo98376b();
        C28292j jVar = new C28292j(85045);
        jVar.mo33795i(5);
        jVar.mo33794h(2);
        c2.getClass();
        C28295m.m52919e(c2, jVar);
        C28292j jVar2 = new C28292j(85118);
        jVar2.mo33795i(5);
        jVar2.mo33794h(2);
        b.getClass();
        C28295m.m52919e(b, jVar2);
        this.f306760h = mVar.mo98652a(c2, b, color);
    }

    /* renamed from: a */
    public final void mo98373a() {
        C28293k d = ((C110100k) this.f306753a.mo17428b()).mo98378d();
        ArrayList arrayList = new ArrayList(d.mo33746b());
        arrayList.addAll(this.f306754b.f307320h.f307395m);
        C110415l lVar = this.f306760h;
        if (lVar != null) {
            arrayList.addAll(lVar.f307758j);
        }
        C28293k d2 = C28293k.m52907d(d.mo33745a(), arrayList);
        C58976aa aaVar = C58975e.f156826a;
        C60321oe b = C28285c.m52875b(d2, 75711);
        if (b != null) {
            C89949q.m146521e(b, false);
            return;
        }
        C59104x d3 = f306752l.mo56226d();
        d3.mo56378ag(C58975e.f156826a, "ClockViewCtrl");
        ((C59052c) ((C59052c) d3).mo56372aa(25679)).mo56386p("Client proto does not exist, failed to log ve impression");
    }

    /* renamed from: b */
    public final void mo98374b() {
        ((C110100k) this.f306753a.mo17428b()).mo98380f(System.currentTimeMillis());
    }
}
