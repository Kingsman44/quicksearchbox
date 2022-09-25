package com.google.android.libraries.home.p1940a.p1943c.p1945b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.home.p1940a.p1943c.C23542dp;
import com.google.android.libraries.home.p1940a.p1943c.C23553e;
import com.google.android.libraries.home.p1940a.p1943c.C23570eq;
import com.google.android.libraries.home.p1940a.p1943c.C23571er;
import com.google.android.libraries.home.p1955d.p1956a.C23765a;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58714pg;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.b.at */
/* compiled from: PG */
public final class C23445at implements C23570eq {
    /* renamed from: a */
    public final /* synthetic */ C23571er mo28847a(C23553e eVar, Map map) {
        C23553e eVar2 = eVar;
        Map map2 = map;
        Object obj = map2.get(C23542dp.MODE);
        if (obj == null) {
            obj = C23438am.m43852b(BuildConfig.FLAVOR, false);
        }
        C23439an anVar = (C23439an) obj;
        Object obj2 = map2.get(C23542dp.ACTIVE_MODE);
        if (obj2 == null) {
            obj2 = C23442aq.m43856c(BuildConfig.FLAVOR, 4);
        }
        C23443ar arVar = (C23443ar) obj2;
        Object obj3 = map2.get(C23542dp.AMBIENT_AIR_HUMIDITY);
        if (obj3 == null) {
            obj3 = C23459m.m43866b(0.0f, false, 6);
        }
        C23460n nVar = (C23460n) obj3;
        Object obj4 = map2.get(C23542dp.AMBIENT_AIR_TEMPERATURE);
        if (obj4 == null) {
            obj4 = new C23462p(0.0f, false);
        }
        C23462p pVar = (C23462p) obj4;
        Object obj5 = map2.get(C23542dp.AMBIENT_AIR_TEMPERATURE_C);
        if (obj5 == null) {
            obj5 = new C23448b(0.0f, false);
        }
        C23448b bVar = (C23448b) obj5;
        Object obj6 = map2.get(C23542dp.AMBIENT_AIR_TEMPERATURE_F);
        if (obj6 == null) {
            obj6 = new C23450d(0.0f, false);
        }
        C23450d dVar = (C23450d) obj6;
        Object obj7 = map2.get(C23542dp.HEAT_COOL_SETTING_HIGH_ROUND);
        if (obj7 == null) {
            obj7 = new C23431af(0.0f, false);
        }
        C23431af afVar = (C23431af) obj7;
        Object obj8 = map2.get(C23542dp.HEAT_COOL_SETTING_LOW_ROUND);
        if (obj8 == null) {
            obj8 = new C23433ah(0.0f, false);
        }
        C23433ah ahVar = (C23433ah) obj8;
        Object obj9 = map2.get(C23542dp.HEAT_SETTING_ROUND);
        if (obj9 == null) {
            obj9 = new C23435aj(0.0f, false);
        }
        C23435aj ajVar = (C23435aj) obj9;
        Object obj10 = map2.get(C23542dp.COOL_SETTING_ROUND);
        if (obj10 == null) {
            obj10 = new C23470x(0.0f, false);
        }
        C23470x xVar = (C23470x) obj10;
        Object obj11 = map2.get(C23542dp.HEAT_SETTING_ROUND_C);
        if (obj11 == null) {
            obj11 = new C23454h(0.0f, false);
        }
        C23454h hVar = (C23454h) obj11;
        Object obj12 = map2.get(C23542dp.COOL_SETTING_ROUND_C);
        if (obj12 == null) {
            obj12 = new C23452f(0.0f, false);
        }
        C23452f fVar = (C23452f) obj12;
        Object obj13 = map2.get(C23542dp.HEAT_COOL_SETTING_LOW_ROUND_C);
        if (obj13 == null) {
            obj13 = new C23458l(0.0f, false);
        }
        C23458l lVar = (C23458l) obj13;
        Object obj14 = map2.get(C23542dp.HEAT_COOL_SETTING_HIGH_ROUND_C);
        if (obj14 == null) {
            obj14 = new C23456j(0.0f, false);
        }
        C23456j jVar = (C23456j) obj14;
        Object obj15 = map2.get(C23542dp.THERMOSTAT_TEMP_SET_POINT_C);
        if (obj15 == null) {
            obj15 = new C23468v(0.0f, false);
        }
        C23468v vVar = (C23468v) obj15;
        Object obj16 = map2.get(C23542dp.THERMOSTAT_TEMP_SET_POINT_F);
        if (obj16 == null) {
            obj16 = new C23429ad(0.0f, false);
        }
        C23429ad adVar = (C23429ad) obj16;
        Object obj17 = map2.get(C23542dp.THERMOSTAT_TEMP_SET_POINT_LOW_C);
        if (obj17 == null) {
            obj17 = new C23466t(0.0f, false);
        }
        C23466t tVar = (C23466t) obj17;
        Object obj18 = map2.get(C23542dp.THERMOSTAT_TEMP_SET_POINT_HIGH_C);
        if (obj18 == null) {
            obj18 = new C23464r(0.0f, false);
        }
        C23464r rVar = (C23464r) obj18;
        Object obj19 = map2.get(C23542dp.THERMOSTAT_TEMP_SET_POINT_LOW_F);
        if (obj19 == null) {
            obj19 = new C23427ab(0.0f, false);
        }
        C23427ab abVar = (C23427ab) obj19;
        Object obj20 = map2.get(C23542dp.THERMOSTAT_TEMP_SET_POINT_HIGH_F);
        if (obj20 == null) {
            obj20 = new C23472z(0.0f, false);
        }
        HashSet hashSet = r2;
        HashSet hashSet2 = new HashSet();
        C23447av avVar = new C23447av(hashSet, anVar, arVar, nVar, pVar, bVar, dVar, afVar, ahVar, ajVar, xVar, hVar, fVar, lVar, jVar, vVar, tVar, rVar, adVar, abVar, (C23472z) obj20);
        String str = (String) C23765a.m44264a(eVar2.mo28920c("availableThermostatModes", String.class));
        if (str != null) {
            C69540x.m100811r(avVar.f64162b, C58869cf.m90936b(new C58903m(',')).mo56152f(C58911u.f156751b).mo56151a().mo56153g(str));
        } else {
            List list = (List) C23765a.m44264a(eVar2.mo28918a("availableThermostatModes", String.class));
            if (list != null) {
                avVar.f64162b.addAll(list);
            }
        }
        avVar.f64166f = (Double) C23765a.m44264a(eVar2.mo28920c("bufferRangeCelsius", Double.class));
        avVar.f64167g = (Double) C23765a.m44264a(eVar2.mo28920c("bufferRangeFahrenheit", Double.class));
        String str2 = (String) C23765a.m44264a(eVar2.mo28920c("thermostatTemperatureUnit", String.class));
        if (str2 != null) {
            avVar.f64163c = C69664n.m101066l(C23446au.CELSIUS.f64159c, str2) ? C23446au.CELSIUS : C23446au.FAHRENHEIT;
        }
        Map map3 = (Map) C23765a.m44264a(eVar2.mo28919b("thermostatTemperatureRange", Double.class));
        if (map3 != null) {
            Double d = (Double) map3.get("minThresholdCelsius");
            Double d2 = (Double) map3.get("maxThresholdCelsius");
            if (!(d == null || d2 == null || d.doubleValue() > d2.doubleValue())) {
                avVar.f64164d = C58714pg.m90504g(d, d2);
            }
            Double d3 = (Double) map3.get("minThresholdFahrenheit");
            Double d4 = (Double) map3.get("maxThresholdFahrenheit");
            if (!(d3 == null || d4 == null || d3.doubleValue() > d4.doubleValue())) {
                avVar.f64165e = C58714pg.m90504g(d3, d4);
            }
        }
        return avVar;
    }
}
