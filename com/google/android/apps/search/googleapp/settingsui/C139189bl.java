package com.google.android.apps.search.googleapp.settingsui;

import com.google.android.apps.search.googleapp.p10536x.C139872h;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139879o;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60866ct;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69469c;
import p5462h.p5463a.p5464a.C69477k;
import p5462h.p5463a.p5464a.C69483q;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;
import p5462h.p5473f.p5475b.p5476a.C69643d;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bl */
/* compiled from: PG */
public final class C139189bl {

    /* renamed from: a */
    public final C46723bg f378544a;

    /* renamed from: b */
    public final C139194bq f378545b;

    /* renamed from: c */
    private final Map f378546c;

    /* renamed from: d */
    private final C46778cv f378547d;

    public C139189bl(Map map, C46778cv cvVar, C46723bg bgVar, C139194bq bqVar) {
        C58485gu a;
        C69664n.m101061g(map, "settingSpecs");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(bqVar, "searchIndexHolder");
        this.f378546c = map;
        this.f378547d = cvVar;
        this.f378544a = bgVar;
        this.f378545b = bqVar;
        C69664n.m101061g(map, "settingSpecs");
        if (bqVar.f378564b == null) {
            C69477k kVar = new C69477k(8);
            for (Map.Entry entry : ((C58495hd) map).entrySet()) {
                C139873i iVar = (C139873i) entry.getKey();
                C139879o oVar = (C139879o) entry.getValue();
                C69469c cVar = new C69469c(10);
                String j = oVar.mo111460j();
                C69664n.m101060f(j, "spec.title");
                cVar.add(j);
                String g = oVar.mo111457g();
                if (g != null) {
                    cVar.add(g);
                }
                C139872h hVar = oVar instanceof C139872h ? (C139872h) oVar : null;
                if (!(hVar == null || (a = hVar.mo115321a()) == null)) {
                    cVar.addAll(a);
                }
                List<String> a2 = C69540x.m100943a(cVar);
                ArrayList<String> arrayList = new ArrayList<>();
                for (String lowerCase : a2) {
                    Locale locale = Locale.getDefault();
                    C69664n.m101060f(locale, "getDefault()");
                    String lowerCase2 = lowerCase.toLowerCase(locale);
                    C69664n.m101060f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                    C69483q qVar = new C69483q();
                    int length = lowerCase2.length();
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        int length2 = lowerCase2.length();
                        if (i2 <= length2) {
                            int i3 = i2;
                            while (true) {
                                String substring = lowerCase2.substring(i, i3);
                                C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                qVar.add(substring);
                                if (i3 == length2) {
                                    break;
                                }
                                i3++;
                            }
                        }
                        i = i2;
                    }
                    qVar.f185913a.mo61117j();
                    C69540x.m100811r(arrayList, qVar);
                }
                for (String str : arrayList) {
                    Object obj = kVar.get(str);
                    if (obj == null) {
                        obj = new LinkedHashSet();
                        kVar.put(str, obj);
                    }
                    if ((obj instanceof C69640a) && !(obj instanceof C69643d)) {
                        C69651ah.m101036a(obj, "kotlin.collections.MutableSet");
                    }
                    try {
                        ((Set) obj).add(iVar);
                    } catch (ClassCastException e) {
                        C69651ah.m101039d(e);
                        throw e;
                    }
                }
            }
            bqVar.f378564b = C69505av.m100861c(kVar);
        }
    }

    /* renamed from: a */
    public final void mo114809a(String str) {
        C69664n.m101061g(str, "query");
        C139194bq bqVar = this.f378545b;
        Locale locale = Locale.getDefault();
        C69664n.m101060f(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        C69664n.m101060f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        C69664n.m101061g(lowerCase, "query");
        bqVar.f378563a = lowerCase;
        this.f378547d.mo50787a(C60866ct.f164955a, "FILTERED_SETTINGS_DS_KEY");
    }
}
