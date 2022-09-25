package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.am.d.a;
import com.google.android.apps.gsa.nga.engine.am.d.g;
import com.google.android.apps.gsa.nga.engine.am.h.bb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80370b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80390c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80391d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80299au;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80301aw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80302ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80307bb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80322bq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80331bz;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80333ca;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80336cd;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80338cf;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4152bb.p4153a.C55421x;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.au */
/* compiled from: PG */
public final /* synthetic */ class C77022au implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77027az f212575a;

    /* renamed from: b */
    public final /* synthetic */ String f212576b;

    /* renamed from: c */
    public final /* synthetic */ Locale f212577c;

    /* renamed from: d */
    public final /* synthetic */ C80399l f212578d;

    /* renamed from: e */
    public final /* synthetic */ C80303ay f212579e;

    /* renamed from: f */
    public final /* synthetic */ C77088df f212580f;

    public /* synthetic */ C77022au(C77027az azVar, String str, Locale locale, C80399l lVar, C80303ay ayVar, C77088df dfVar) {
        this.f212575a = azVar;
        this.f212576b = str;
        this.f212577c = locale;
        this.f212578d = lVar;
        this.f212579e = ayVar;
        this.f212580f = dfVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77027az azVar = this.f212575a;
        String str = this.f212576b;
        Locale locale = this.f212577c;
        C80399l lVar = this.f212578d;
        C80303ay ayVar = this.f212579e;
        C77088df dfVar = this.f212580f;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C118826c.f331423b;
        }
        C77143x xVar = (C77143x) optional.get();
        int a = xVar.mo72383a();
        int i = a - 1;
        if (a != 0) {
            if (i == 1) {
                StatusBarNotification d = xVar.mo72423d();
                lVar.copyOnWrite();
                C80401n nVar = C80401n.f220656k;
                ((C80401n) lVar.instance).f220663f = true;
                if (!azVar.f212598d.c(d).isPresent()) {
                    ((C58970a) ((C58970a) C77027az.f212594a.mo56225c()).mo56372aa(3805)).mo56386p("Reply action not present");
                } else {
                    C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
                    C80338cf cfVar = C80338cf.f220449a;
                    aoVar.copyOnWrite();
                    C80295aq aqVar = (C80295aq) aoVar.instance;
                    cfVar.getClass();
                    aqVar.f220360b = cfVar;
                    aqVar.f220359a = 7;
                    C81442m.m129555q(lVar, aoVar);
                    C80299au auVar = (C80299au) C80302ax.f220374c.createBuilder();
                    C80301aw a2 = azVar.f212604j.mo71318a(d);
                    auVar.copyOnWrite();
                    a2.getClass();
                    ((C80302ax) auVar.instance).f220377b = a2;
                    auVar.copyOnWrite();
                    str.getClass();
                    ((C80302ax) auVar.instance).f220376a = str;
                    C80302ax axVar = (C80302ax) auVar.build();
                    if (C89988b.m146551d(azVar.f212601g.mo85403h(C90126fx.f251139dF)).contains("ReplyNotification")) {
                        C77089dg dgVar = azVar.f212597c;
                        String packageName = d.getPackageName();
                        g gVar = dgVar.f212750d;
                        Optional empty = Optional.empty();
                        Optional empty2 = Optional.empty();
                        Optional empty3 = Optional.empty();
                        C81442m.m129557s(lVar, gVar.b());
                        C81442m.m129557s(lVar, gVar.a(empty, empty2, empty3, packageName, str));
                        g.g(lVar);
                        C80399l lVar2 = (C80399l) C80401n.f220656k.createBuilder();
                        C80293ao aoVar2 = (C80293ao) C80295aq.f220357c.createBuilder();
                        aoVar2.copyOnWrite();
                        C80295aq aqVar2 = (C80295aq) aoVar2.instance;
                        axVar.getClass();
                        aqVar2.f220360b = axVar;
                        aqVar2.f220359a = 5;
                        C81442m.m129555q(lVar2, aoVar2);
                        C80399l lVar3 = (C80399l) C80401n.f220656k.createBuilder();
                        g.h(ayVar, lVar2, lVar3);
                        C80399l lVar4 = (C80399l) ((C80401n) lVar3.build()).toBuilder();
                        Collection.EL.stream(gVar.c(false)).forEach(new a(lVar4));
                        lVar.mo74320l("confirmation_button_id", (C80401n) lVar2.build());
                        lVar.mo74320l("dismiss_id", (C80401n) lVar3.build());
                        lVar.mo74320l("cancel_button_id", (C80401n) lVar4.build());
                    } else {
                        C80370b bVar = (C80370b) C80391d.f220635i.createBuilder();
                        C80390c cVar = C80390c.MESSAGE;
                        bVar.copyOnWrite();
                        ((C80391d) bVar.instance).f220637a = cVar.getNumber();
                        String packageName2 = d.getPackageName();
                        bVar.copyOnWrite();
                        packageName2.getClass();
                        ((C80391d) bVar.instance).f220639c = packageName2;
                        String string = azVar.f212596b.mo75121a(locale).getString(R.string.processors_share_do_send_question, new Object[0]);
                        bVar.copyOnWrite();
                        string.getClass();
                        ((C80391d) bVar.instance).f220638b = string;
                        String d2 = azVar.f212598d.d(d.getNotification(), locale);
                        bVar.copyOnWrite();
                        d2.getClass();
                        ((C80391d) bVar.instance).f220641e = d2;
                        bVar.copyOnWrite();
                        str.getClass();
                        ((C80391d) bVar.instance).f220642f = str;
                        bVar.copyOnWrite();
                        ((C80391d) bVar.instance).f220640d = true;
                        long millis = azVar.f212599e.a(str).toMillis();
                        bVar.copyOnWrite();
                        ((C80391d) bVar.instance).f220643g = millis;
                        String string2 = azVar.f212596b.mo75121a(locale).getString(R.string.nga_processors_share_not_sent, new Object[0]);
                        bVar.copyOnWrite();
                        string2.getClass();
                        ((C80391d) bVar.instance).f220644h = string2;
                        C80391d dVar = (C80391d) bVar.build();
                        C80293ao aoVar3 = (C80293ao) C80295aq.f220357c.createBuilder();
                        aoVar3.copyOnWrite();
                        C80295aq aqVar3 = (C80295aq) aoVar3.instance;
                        axVar.getClass();
                        aqVar3.f220360b = axVar;
                        aqVar3.f220359a = 5;
                        C81442m.m129555q(lVar, aoVar3);
                        lVar.copyOnWrite();
                        dVar.getClass();
                        ((C80401n) lVar.instance).f220662e = dVar;
                    }
                }
            } else if (i == 2) {
                C77141v c = xVar.mo72395c();
                lVar.copyOnWrite();
                C80401n nVar2 = C80401n.f220656k;
                ((C80401n) lVar.instance).f220663f = true;
                af a3 = c.mo72439a();
                String b = c.mo72440b();
                C80293ao aoVar4 = (C80293ao) C80295aq.f220357c.createBuilder();
                C80322bq bqVar = (C80322bq) C80336cd.f220442f.createBuilder();
                String str2 = a3.b().i;
                bqVar.copyOnWrite();
                str2.getClass();
                ((C80336cd) bqVar.instance).f220446c = str2;
                bqVar.copyOnWrite();
                ((C80336cd) bqVar.instance).f220447d = false;
                C80331bz bzVar = (C80331bz) C80333ca.f220432c.createBuilder();
                bzVar.copyOnWrite();
                b.getClass();
                ((C80333ca) bzVar.instance).f220434a = b;
                bzVar.copyOnWrite();
                str.getClass();
                ((C80333ca) bzVar.instance).f220435b = str;
                bqVar.copyOnWrite();
                C80336cd cdVar = (C80336cd) bqVar.instance;
                C80333ca caVar = (C80333ca) bzVar.build();
                caVar.getClass();
                cdVar.f220445b = caVar;
                cdVar.f220444a = 6;
                aoVar4.copyOnWrite();
                C80295aq aqVar4 = (C80295aq) aoVar4.instance;
                C80336cd cdVar2 = (C80336cd) bqVar.build();
                cdVar2.getClass();
                aqVar4.f220360b = cdVar2;
                aqVar4.f220359a = 4;
                C81442m.m129555q(lVar, aoVar4);
            } else if (i == 3) {
                C77131l b2 = xVar.mo72390b();
                C77089dg dgVar2 = azVar.f212597c;
                C55421x xVar2 = bb.c.e;
                ayVar.copyOnWrite();
                C80307bb bbVar = (C80307bb) ayVar.instance;
                C80307bb bbVar2 = C80307bb.f220382e;
                bbVar.f220386c = xVar2.f146230cP;
                bbVar.f220384a |= 2;
                ayVar.copyOnWrite();
                C80307bb bbVar3 = (C80307bb) ayVar.instance;
                bbVar3.f220385b = 2;
                bbVar3.f220384a |= 1;
                return C77089dg.m123751f(b2, new C77050bv(dgVar2, TextUtils.isEmpty(str), dfVar, str), lVar, ayVar);
            }
            return C118826c.f331423b;
        }
        throw null;
    }
}
