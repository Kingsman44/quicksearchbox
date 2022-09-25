package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110979aq;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111054d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113126ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.e */
/* compiled from: PG */
public final /* synthetic */ class C111309e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309750a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f309751b;

    /* renamed from: c */
    public final /* synthetic */ C58495hd f309752c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f309753d;

    /* renamed from: e */
    public final /* synthetic */ C49728r f309754e;

    /* renamed from: f */
    public final /* synthetic */ String f309755f;

    /* renamed from: g */
    public final /* synthetic */ C49301bt f309756g;

    /* renamed from: h */
    public final /* synthetic */ Map f309757h;

    public /* synthetic */ C111309e(C111305ag agVar, C60870cx cxVar, C58495hd hdVar, C60870cx cxVar2, C49728r rVar, String str, C49301bt btVar, Map map) {
        this.f309750a = agVar;
        this.f309751b = cxVar;
        this.f309752c = hdVar;
        this.f309753d = cxVar2;
        this.f309754e = rVar;
        this.f309755f = str;
        this.f309756g = btVar;
        this.f309757h = map;
    }

    public final Object call() {
        C49301bt btVar;
        double max;
        Iterator it;
        C49301bt btVar2;
        double d;
        C111305ag agVar = this.f309750a;
        C60870cx cxVar = this.f309751b;
        C58495hd hdVar = this.f309752c;
        C60870cx cxVar2 = this.f309753d;
        C49728r rVar = this.f309754e;
        String str = this.f309755f;
        C49301bt btVar3 = this.f309756g;
        Map map = this.f309757h;
        String str2 = (String) C60856cj.m92909r(cxVar);
        if (!hdVar.isEmpty()) {
            String str3 = (String) C58557jl.m90132m(hdVar.values(), BuildConfig.FLAVOR);
            if (!str3.isEmpty()) {
                str2 = str3;
            }
        }
        String concat = String.valueOf(str2.substring(0, 1).toUpperCase(Locale.getDefault())).concat(String.valueOf(str2.substring(1)));
        agVar.f309737g.mo99076a(C111255r.APP_ACTIONS_ENTITY, String.format("Params for Action Entity suggestion '%s':\nDeeplink: %s\n%s", new Object[]{concat, ((C113502n) C90877ak.m148474h(cxVar2)).mo99957q(), C90877ak.m148474h(cxVar2)}));
        String str4 = rVar.f128342b;
        String c = C58890d.m90988c(str);
        String c2 = C58890d.m90988c(str4);
        if (c.contains(c2)) {
            double length = (double) c2.length();
            double length2 = (double) c.length();
            Double.isNaN(length);
            Double.isNaN(length2);
            max = length / length2;
        } else if (c2.contains(c)) {
            double length3 = (double) c.length();
            double length4 = (double) c2.length();
            Double.isNaN(length3);
            Double.isNaN(length4);
            max = length3 / length4;
        } else {
            List i = C113126ak.f313427a.mo56155i(c);
            List<String> i2 = C113126ak.f313427a.mo56155i(c2);
            Iterator it2 = i.iterator();
            double d2 = C59203do.f157270a;
            double d3 = C59203do.f157270a;
            while (it2.hasNext()) {
                String str5 = (String) it2.next();
                for (String str6 : i2) {
                    if (str5.startsWith(str6)) {
                        it = it2;
                        btVar2 = btVar3;
                        double length5 = (double) str6.length();
                        Double.isNaN(length5);
                        d2 += length5;
                        if (str5.equals(str6)) {
                            d = (double) str5.length();
                            Double.isNaN(d);
                        } else {
                            btVar3 = btVar2;
                            it2 = it;
                        }
                    } else {
                        it = it2;
                        btVar2 = btVar3;
                        if (str6.startsWith(str5)) {
                            d = (double) str5.length();
                            Double.isNaN(d);
                        } else {
                            btVar3 = btVar2;
                            it2 = it;
                        }
                    }
                    d3 += d;
                    btVar3 = btVar2;
                    it2 = it;
                }
            }
            btVar = btVar3;
            double max2 = (double) Math.max(Collection.EL.stream(i).mapToInt(C111330z.f309797a).sum(), Collection.EL.stream(i2).mapToInt(C111330z.f309797a).sum());
            Double.isNaN(max2);
            Double.isNaN(max2);
            max = Math.max(d2 / max2, d3 / max2);
            double d4 = max;
            C113414ey R = C113415ez.m187750R();
            C113386e eVar = (C113386e) R;
            eVar.f313953a = concat;
            R.mo100180y(12000);
            R.mo100177v(C48580an.APP_ACTION);
            R.mo100167l(agVar.f309736f.mo99040a());
            R.mo100175t(C48672ag.APP_ACTIONS_ENTITY);
            C49301bt btVar4 = btVar;
            R.mo100173r(((C110979aq) agVar.f309741k.mo27525b()).mo99003a(concat, btVar4.f127426b, (C113502n) C90877ak.m148474h(cxVar2)));
            C111054d dVar = agVar.f309739i;
            String str7 = btVar4.f127426b;
            R.mo100174s(dVar.mo99037a(str7, ((Double) Map.EL.getOrDefault(map, str7, Double.valueOf(C59203do.f157270a))).doubleValue(), d4));
            eVar.f313962j = Optional.m71637of((C113502n) C90877ak.m148474h(cxVar2));
            return R.mo100156a();
        }
        btVar = btVar3;
        double d42 = max;
        C113414ey R2 = C113415ez.m187750R();
        C113386e eVar2 = (C113386e) R2;
        eVar2.f313953a = concat;
        R2.mo100180y(12000);
        R2.mo100177v(C48580an.APP_ACTION);
        R2.mo100167l(agVar.f309736f.mo99040a());
        R2.mo100175t(C48672ag.APP_ACTIONS_ENTITY);
        C49301bt btVar42 = btVar;
        R2.mo100173r(((C110979aq) agVar.f309741k.mo27525b()).mo99003a(concat, btVar42.f127426b, (C113502n) C90877ak.m148474h(cxVar2)));
        C111054d dVar2 = agVar.f309739i;
        String str72 = btVar42.f127426b;
        R2.mo100174s(dVar2.mo99037a(str72, ((Double) Map.EL.getOrDefault(map, str72, Double.valueOf(C59203do.f157270a))).doubleValue(), d42));
        eVar2.f313962j = Optional.m71637of((C113502n) C90877ak.m148474h(cxVar2));
        return R2.mo100156a();
    }
}
