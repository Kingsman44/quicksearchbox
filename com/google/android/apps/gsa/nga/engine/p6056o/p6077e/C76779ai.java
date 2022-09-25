package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.h.f;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80338cf;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51115gy;
import com.google.assistant.p3897e.p3902c.p3907c.C51119hb;
import com.google.assistant.p3897e.p3917i.p3918a.C51310cz;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51934en;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51942ev;
import com.google.assistant.p3897e.p3921j.p3926e.C51943ew;
import com.google.assistant.p3897e.p3921j.p3926e.C51944ex;
import com.google.assistant.p3897e.p3921j.p3926e.C51948fa;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.ai */
/* compiled from: PG */
public final /* synthetic */ class C76779ai implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f212157a;

    /* renamed from: b */
    public final /* synthetic */ C80399l f212158b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f212159c;

    /* renamed from: d */
    public final /* synthetic */ df f212160d;

    /* renamed from: e */
    public final /* synthetic */ boolean f212161e;

    public /* synthetic */ C76779ai(C76795ay ayVar, C80399l lVar, C74965n nVar, df dfVar, boolean z) {
        this.f212157a = ayVar;
        this.f212158b = lVar;
        this.f212159c = nVar;
        this.f212160d = dfVar;
        this.f212161e = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76795ay ayVar = this.f212157a;
        C80399l lVar = this.f212158b;
        C74965n nVar = this.f212159c;
        f fVar = this.f212160d;
        boolean z = this.f212161e;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
            C80338cf cfVar = C80338cf.f220449a;
            aoVar.copyOnWrite();
            C80295aq aqVar = (C80295aq) aoVar.instance;
            cfVar.getClass();
            aqVar.f220360b = cfVar;
            aqVar.f220359a = 7;
            C81442m.m129555q(lVar, aoVar);
            if (ayVar.f212192n.mo71216a().equals(C51310cz.DEVICE_LOCKED) && ayVar.f212181c.mo85405j(C90066dr.f249699v) && ayVar.f212181c.mo85405j(C90126fx.f251281fp)) {
                C77280f fVar2 = ayVar.f212183e;
                f fVar3 = fVar;
                String string = ayVar.f212191m.mo75121a(nVar.mo71342q()).getString(R.string.nga_communication_call_contact_ok, new Object[]{fVar3.a});
                t tVar = fVar2.f213156a;
                C51809dy r = t.r(string);
                t tVar2 = fVar2.f213156a;
                C81442m.m129557s(lVar, t.s(r));
                C77280f fVar4 = ayVar.f212183e;
                String str = fVar3.a;
                t tVar3 = fVar4.f213156a;
                C51934en enVar = (C51934en) C51953ff.f136315l.createBuilder();
                C51936ep epVar = C51936ep.CALL;
                enVar.copyOnWrite();
                C51953ff ffVar = (C51953ff) enVar.instance;
                ffVar.f136323g = epVar.f136236u;
                ffVar.f136317a |= 32;
                C51944ex exVar = (C51944ex) C51948fa.f136294i.createBuilder();
                exVar.copyOnWrite();
                C51948fa faVar = (C51948fa) exVar.instance;
                faVar.f136296a |= 16;
                faVar.f136301f = true;
                C51942ev evVar = (C51942ev) C51943ew.f136285f.createBuilder();
                C51937eq eqVar = (C51937eq) C51941eu.f136271l.createBuilder();
                C51115gy gyVar = (C51115gy) C51119hb.f133058f.createBuilder();
                C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
                dbVar.copyOnWrite();
                C51012dc dcVar = (C51012dc) dbVar.instance;
                dcVar.f132815a |= 2;
                dcVar.f132817c = "https://www.gstatic.com/assistant/verticals/communication/iris_confirmation_light.png";
                gyVar.copyOnWrite();
                C51119hb hbVar = (C51119hb) gyVar.instance;
                C51012dc dcVar2 = (C51012dc) dbVar.build();
                dcVar2.getClass();
                hbVar.f133063d = dcVar2;
                hbVar.f133060a |= 4;
                gyVar.copyOnWrite();
                C51119hb hbVar2 = (C51119hb) gyVar.instance;
                hbVar2.f133060a |= 1;
                hbVar2.f133061b = str;
                eqVar.copyOnWrite();
                C51941eu euVar = (C51941eu) eqVar.instance;
                C51119hb hbVar3 = (C51119hb) gyVar.build();
                hbVar3.getClass();
                euVar.f136278f = hbVar3;
                euVar.f136277e = 26;
                evVar.mo53758a(eqVar);
                exVar.mo53762a(evVar);
                enVar.mo53754a(exVar);
                enVar.copyOnWrite();
                C51953ff ffVar2 = (C51953ff) enVar.instance;
                ffVar2.f136317a |= 16;
                ffVar2.f136322f = true;
                C51950fc fcVar = C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY;
                enVar.copyOnWrite();
                C51953ff ffVar3 = (C51953ff) enVar.instance;
                ffVar3.f136324h = fcVar.f136309c;
                ffVar3.f136317a |= 64;
                C51809dy m = t.m((C51953ff) enVar.build());
                t tVar4 = fVar4.f213156a;
                C81442m.m129557s(lVar, t.s(m));
            }
            C81442m.m129557s(lVar, (C51809dy) optional.get());
            lVar.mo74319k(true != z ? 23190 : 23256);
        }
        return C118826c.f331422a;
    }
}
