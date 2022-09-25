package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c;

import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.assistant.p3803ag.p3804a.C48794ab;
import com.google.assistant.p3803ag.p3804a.C48796ad;
import com.google.assistant.p3803ag.p3804a.C48836bc;
import com.google.assistant.p3803ag.p3804a.C48838be;
import com.google.assistant.p3803ag.p3804a.C48840bg;
import com.google.assistant.p3803ag.p3804a.C48845bl;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48854bu;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.assistant.p3803ag.p3804a.C48862e;
import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.c.a */
/* compiled from: PG */
public final class C107421a {

    /* renamed from: a */
    public final C39141kp f298955a;

    /* renamed from: b */
    public final C21370a f298956b;

    public C107421a(C39141kp kpVar, C21370a aVar) {
        this.f298955a = kpVar;
        this.f298956b = aVar;
    }

    /* renamed from: a */
    public static String m178336a(String str, C48851br brVar) {
        if (!str.equals("TRAVEL")) {
            return "NOT_ABLE_TO_KNOW";
        }
        String zVar = brVar.f126418e.toString();
        if (zVar.contains("travel_weather_forecast_notification")) {
            return "WEATHER_FORECAST";
        }
        if (zVar.contains("travel_flight_landing_smartspace_card")) {
            return "FLIGHT_LANDING";
        }
        if (!zVar.contains("hotel_notification")) {
            return "NOT_ABLE_TO_KNOW";
        }
        if (zVar.contains("checkin")) {
            return "HOTEL_CHECK_IN";
        }
        return zVar.contains("checkout") ? "HOTEL_CHECK_OUT" : "NOT_ABLE_TO_KNOW";
    }

    /* renamed from: b */
    public static String m178337b(C48865h hVar) {
        C48862e eVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i = hVar.f126458b;
        if (i == 3) {
            C48855bv bvVar = ((C48851br) hVar.f126459c).f126417d;
            if (bvVar == null) {
                bvVar = C48855bv.f126424b;
            }
            return m178338c(bvVar);
        }
        if (i == 4) {
            eVar = (C48862e) hVar.f126459c;
        } else {
            eVar = C48862e.f126439a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C48796ad.f126260c);
        eVar.mo58887l(r0);
        if (eVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C48796ad.f126260c);
            eVar.mo58887l(r02);
            Object l = eVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj5 = r02.f169969b;
            } else {
                obj5 = r02.mo58889c(l);
            }
            C48871n nVar = ((C48796ad) obj5).f126262a;
            if (nVar == null) {
                nVar = C48871n.f126470e;
            }
            C48851br brVar = nVar.f126473b;
            if (brVar == null) {
                brVar = C48851br.f126412f;
            }
            C48855bv bvVar2 = brVar.f126417d;
            if (bvVar2 == null) {
                bvVar2 = C48855bv.f126424b;
            }
            return m178338c(bvVar2);
        }
        C62940bt r03 = C62942bv.checkIsLite(C48794ab.f126255c);
        eVar.mo58887l(r03);
        if (eVar.f169962ag.mo58857o(r03.f169971d)) {
            C62940bt r04 = C62942bv.checkIsLite(C48794ab.f126255c);
            eVar.mo58887l(r04);
            Object l2 = eVar.f169962ag.mo58854l(r04.f169971d);
            if (l2 == null) {
                obj4 = r04.f169969b;
            } else {
                obj4 = r04.mo58889c(l2);
            }
            C48851br brVar2 = ((C48794ab) obj4).f126257a;
            if (brVar2 == null) {
                brVar2 = C48851br.f126412f;
            }
            C48855bv bvVar3 = brVar2.f126417d;
            if (bvVar3 == null) {
                bvVar3 = C48855bv.f126424b;
            }
            return m178338c(bvVar3);
        }
        C62940bt r05 = C62942bv.checkIsLite(C48840bg.f126387c);
        eVar.mo58887l(r05);
        if (eVar.f169962ag.mo58857o(r05.f169971d)) {
            C62940bt r06 = C62942bv.checkIsLite(C48840bg.f126387c);
            eVar.mo58887l(r06);
            Object l3 = eVar.f169962ag.mo58854l(r06.f169971d);
            if (l3 == null) {
                obj3 = r06.f169969b;
            } else {
                obj3 = r06.mo58889c(l3);
            }
            C48855bv bvVar4 = ((C48840bg) obj3).f126389a;
            if (bvVar4 == null) {
                bvVar4 = C48855bv.f126424b;
            }
            return m178338c(bvVar4);
        }
        C62940bt r07 = C62942bv.checkIsLite(C48836bc.f126375c);
        eVar.mo58887l(r07);
        if (eVar.f169962ag.mo58857o(r07.f169971d)) {
            C62940bt r08 = C62942bv.checkIsLite(C48836bc.f126375c);
            eVar.mo58887l(r08);
            Object l4 = eVar.f169962ag.mo58854l(r08.f169971d);
            if (l4 == null) {
                obj2 = r08.f169969b;
            } else {
                obj2 = r08.mo58889c(l4);
            }
            C48855bv bvVar5 = ((C48836bc) obj2).f126377a;
            if (bvVar5 == null) {
                bvVar5 = C48855bv.f126424b;
            }
            return m178338c(bvVar5);
        }
        C62940bt r09 = C62942bv.checkIsLite(C48838be.f126380d);
        eVar.mo58887l(r09);
        if (!eVar.f169962ag.mo58857o(r09.f169971d)) {
            return "INVALID_ACTION";
        }
        C62940bt r010 = C62942bv.checkIsLite(C48838be.f126380d);
        eVar.mo58887l(r010);
        Object l5 = eVar.f169962ag.mo58854l(r010.f169971d);
        if (l5 == null) {
            obj = r010.f169969b;
        } else {
            obj = r010.mo58889c(l5);
        }
        C48855bv bvVar6 = ((C48838be) obj).f126382a;
        if (bvVar6 == null) {
            bvVar6 = C48855bv.f126424b;
        }
        return m178338c(bvVar6);
    }

    /* renamed from: c */
    public static String m178338c(C48855bv bvVar) {
        if (bvVar.f126426a.size() <= 0) {
            return "INVALID_JOURNEY";
        }
        int a = C48845bl.m85284a(((C48854bu) bvVar.f126426a.get(0)).f126422b);
        if (a != 0) {
            switch (a) {
                case 1:
                    break;
                case 2:
                    return "BIRTHDAY";
                case 3:
                    return "GROWTH_MEDIA_PLAYER_CONTROL";
                case 4:
                    return "MORNING";
                case 5:
                    return "GROWTH_CAMPAIGN";
                case 6:
                    return "ON_MY_WAY_HOME";
                case 7:
                    return "LOBBY_HIGHLIGHTS";
                case 8:
                    return "LOCAL_COMMUNITY";
                case 9:
                    return "GENERIC_PROJECT";
                case 10:
                    return "CONFIG_BASED";
                case 11:
                    return "DO_IT_AGAIN";
                case 12:
                    return "ASPIRE";
                case 13:
                    return "FASTTRACK";
                case 14:
                    return "AADC_MINOR_MOMENT";
                case 15:
                    return "SUBSCRIPTION";
                case 16:
                    return "CREATE_EVENT";
                default:
                    switch (a) {
                        case 18:
                            return "TRAVEL";
                        case 19:
                            return "REMINDER";
                        case 20:
                            return "WEATHER";
                        case 21:
                            return "PROBER";
                        default:
                            switch (a) {
                                case 1002:
                                    return "TEST_1";
                                case 1003:
                                    return "TEST_2";
                                case 1004:
                                    return "TEST_3";
                                case 1005:
                                    return "TEST_4";
                                case 1006:
                                    return "TEST_5";
                                default:
                                    return "null";
                            }
                    }
            }
        }
        return "UNSPECIFIED";
    }

    /* renamed from: d */
    public final void mo96004d(C48865h hVar, String str) {
        C39141kp kpVar = this.f298955a;
        C48864g a = C48864g.m85285a(hVar.f126460d);
        if (a == null) {
            a = C48864g.TYPE_UNSPECIFIED;
        }
        ((C19567d) kpVar.f102835aS.mo6453a()).mo24822a(1, a.name(), m178337b(hVar), str, Boolean.valueOf((hVar.f126457a & 2) != 0));
    }
}
