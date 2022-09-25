package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p6137s.C77910h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.android.apps.gsa.nga.shared.p6311ah.C80631b;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122417bi;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122418bj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.assistant.p3897e.p3913g.p3914a.C51223a;
import com.google.assistant.p3897e.p3913g.p3914a.C51225c;
import com.google.assistant.p3897e.p3921j.C52091ex;
import java.util.Iterator;
import java.util.Locale;
import p3186j$.time.ZoneId;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.i.s */
/* compiled from: PG */
public final class C76759s implements C76758r {

    /* renamed from: a */
    private final C91142g f212122a;

    /* renamed from: b */
    private final C69464a f212123b;

    /* renamed from: c */
    private final C77910h f212124c;

    /* renamed from: d */
    private final C81252aq f212125d;

    public C76759s(C91142g gVar, C69464a aVar, C77910h hVar, C81252aq aqVar) {
        this.f212122a = gVar;
        this.f212123b = aVar;
        this.f212124c = hVar;
        this.f212125d = aqVar;
    }

    /* renamed from: a */
    public final C122419bk mo72323a(C52091ex exVar, Locale locale, C75077bo boVar, String str) {
        C122417bi biVar = (C122417bi) C122419bk.f339392l.createBuilder();
        long d = this.f212122a.mo85399d(C90126fx.f251695nf);
        biVar.copyOnWrite();
        ((C122419bk) biVar.instance).f339394a = (int) d;
        String languageTag = locale.toLanguageTag();
        biVar.copyOnWrite();
        languageTag.getClass();
        ((C122419bk) biVar.instance).f339395b = languageTag;
        biVar.copyOnWrite();
        exVar.getClass();
        ((C122419bk) biVar.instance).f339396c = exVar;
        biVar.copyOnWrite();
        str.getClass();
        ((C122419bk) biVar.instance).f339397d = str;
        C80631b bVar = (C80631b) this.f212123b.mo17428b();
        String id = ZoneId.systemDefault().getId();
        biVar.copyOnWrite();
        id.getClass();
        ((C122419bk) biVar.instance).f339398e = id;
        C122418bj bjVar = C122418bj.NGA;
        biVar.copyOnWrite();
        ((C122419bk) biVar.instance).f339404k = bjVar.getNumber();
        boolean y = this.f212125d.mo74964y();
        biVar.copyOnWrite();
        ((C122419bk) biVar.instance).f339400g = y;
        if (this.f212122a.mo85405j(C90126fx.f251366hU)) {
            boolean v = this.f212125d.mo74961v();
            biVar.copyOnWrite();
            ((C122419bk) biVar.instance).f339401h = v;
            C77910h hVar = this.f212124c;
            C51223a aVar = (C51223a) C51225c.f133369c.createBuilder();
            e eVar = e.a;
            e eVar2 = (e) boVar.mo71467m().orElse(e.a);
            if (eVar2.equals(e.f)) {
                if (boVar.mo71464h().isPresent()) {
                    Iterator it = hVar.mo72886k(((ac) boVar.mo71464h().get()).b()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        e a = e.a(((C80413ae) it.next()).f220703o);
                        if (a == null) {
                            a = e.a;
                        }
                        eVar2 = a;
                        if (!eVar2.equals(e.f)) {
                            break;
                        }
                    }
                }
                eVar2 = e.a;
            }
            int ordinal = eVar2.ordinal();
            if (ordinal == 98 || ordinal == 122) {
                aVar.copyOnWrite();
                C51225c cVar = (C51225c) aVar.instance;
                cVar.f133372b = 6;
                cVar.f133371a |= 1;
            } else {
                aVar.copyOnWrite();
                C51225c cVar2 = (C51225c) aVar.instance;
                cVar2.f133372b = 0;
                cVar2.f133371a |= 1;
            }
            C51225c cVar3 = (C51225c) aVar.build();
            biVar.copyOnWrite();
            cVar3.getClass();
            ((C122419bk) biVar.instance).f339402i = cVar3;
        }
        return (C122419bk) biVar.build();
    }
}
