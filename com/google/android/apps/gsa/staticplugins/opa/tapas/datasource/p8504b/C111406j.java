package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113282bg;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.searchbox.shared.suggestion.C41664ad;
import com.google.android.libraries.searchbox.shared.suggestion.C41667ag;
import com.google.android.libraries.searchbox.shared.suggestion.C41678d;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.j */
/* compiled from: PG */
public final class C111406j extends C113409et {

    /* renamed from: a */
    private static final C59071e f309964a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.j");

    /* renamed from: b */
    private final C58495hd f309965b;

    public C111406j() {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("airplane", C113282bg.f313731a);
        gzVar.mo55429h("battery", C113282bg.f313732b);
        gzVar.mo55429h("bluetooth", C113282bg.f313733c);
        gzVar.mo55429h("connected devices", C113282bg.f313734d);
        gzVar.mo55429h("bluetooth devices", C113282bg.f313734d);
        gzVar.mo55429h("data usage", C113282bg.f313735e);
        gzVar.mo55429h("device information", C113282bg.f313736f);
        gzVar.mo55429h("about phone", C113282bg.f313736f);
        gzVar.mo55429h("emergency information", C113282bg.f313737g);
        gzVar.mo55429h("flashlight", C113282bg.f313738h);
        gzVar.mo55429h("location", C113282bg.f313739i);
        gzVar.mo55429h("storage", C113282bg.f313740j);
        gzVar.mo55429h("low storage", C113282bg.f313740j);
        gzVar.mo55429h("nfc", C113282bg.f313741k);
        gzVar.mo55429h("mobile data", C113282bg.f313742l);
        gzVar.mo55429h("notifications", C113282bg.f313743m);
        gzVar.mo55429h("alarm volume", C113282bg.f313744n);
        gzVar.mo55429h("volume alarm", C113282bg.f313744n);
        gzVar.mo55429h("call volume", C113282bg.f313745o);
        gzVar.mo55429h("volume call", C113282bg.f313745o);
        gzVar.mo55429h("media volume", C113282bg.f313746p);
        gzVar.mo55429h("volume media", C113282bg.f313746p);
        gzVar.mo55429h("ring volume", C113282bg.f313747q);
        gzVar.mo55429h("ringer volume", C113282bg.f313747q);
        gzVar.mo55429h("volume ring", C113282bg.f313747q);
        gzVar.mo55429h("volume ringer", C113282bg.f313747q);
        gzVar.mo55429h("wifi", C113282bg.f313748r);
        gzVar.mo55429h("wi-fi", C113282bg.f313748r);
        this.f309965b = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.SLICES;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        Optional empty;
        String str;
        ((C59052c) ((C59052c) f309964a.mo56224b()).mo56372aa(27183)).mo56389s("#fetchSuggestions(): prefix='%s'", epVar.mo100033p());
        String c = C58890d.m90988c(epVar.mo100033p().trim());
        C58800sl lA = this.f309965b.keySet().iterator();
        while (true) {
            if (!lA.hasNext()) {
                empty = Optional.empty();
                break;
            }
            String str2 = (String) lA.next();
            if (str2.startsWith(c) && (str = (String) this.f309965b.get(str2)) != null) {
                empty = Optional.m71637of(str);
                break;
            }
        }
        if (!empty.isPresent()) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        C41664ad adVar = (C41664ad) C41667ag.f108943h.createBuilder();
        String str3 = (String) empty.get();
        adVar.copyOnWrite();
        C41667ag agVar = (C41667ag) adVar.instance;
        str3.getClass();
        agVar.f108945a |= 1;
        agVar.f108946b = str3;
        C41667ag agVar2 = (C41667ag) adVar.build();
        C41678d dVar = (C41678d) C41679e.f109005p.createBuilder();
        dVar.copyOnWrite();
        C41679e eVar = (C41679e) dVar.instance;
        agVar2.getClass();
        eVar.f109016j = agVar2;
        eVar.f109007a |= 512;
        C113414ey q = mo100187q();
        q.mo100167l(20011);
        q.mo100180y(156);
        q.mo100177v(C48580an.SLICE);
        q.mo100161f((C41679e) dVar.build());
        C113415ez a = q.mo100156a();
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(C58485gu.m89846n(a))));
        return C60856cj.m92900i(p.mo100091a());
    }
}
