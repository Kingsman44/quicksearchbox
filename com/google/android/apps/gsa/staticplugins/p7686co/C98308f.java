package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.p4184bj.p4189b.C55892i;
import com.google.p4184bj.p4189b.C55893j;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.f */
/* compiled from: PG */
public final class C98308f {
    /* renamed from: a */
    static void m162847a(StringBuilder sb, C55893j jVar) {
        if (jVar == null) {
            sb.append("NULL");
            return;
        }
        int a = C55892i.m87799a(jVar.f148731b);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        String str = "AND";
        if (i != 1) {
            if (i == 2) {
                str = "OR";
            } else if (i != 3) {
                sb.append("type:");
                int a2 = C55892i.m87799a(jVar.f148731b);
                if (a2 != 0) {
                    switch (a2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            str = "OR";
                            break;
                        case 4:
                            str = "NOT";
                            break;
                        case 5:
                            str = "TIME_FENCE";
                            break;
                        case 6:
                            str = "LOCATION_FENCE";
                            break;
                        case 7:
                            str = "PLACE_FENCE";
                            break;
                        case 8:
                            str = "ACTIVITY_FENCE";
                            break;
                        case 9:
                            str = "SCREEN_FENCE";
                            break;
                        case 10:
                            str = "POWER_CONNECTION_FENCE";
                            break;
                        case 11:
                            str = "PHONE_LOCK_FENCE";
                            break;
                        case 12:
                            str = "AUDIO_STATE_FENCE";
                            break;
                        case 13:
                            str = "BEACON_FENCE";
                            break;
                        case 14:
                            str = "NETWORK_STATE_FENCE";
                            break;
                        case 15:
                            str = "WANDER_STATE_FENCE";
                            break;
                        case 16:
                            str = "TIME_INTERVAL_FENCE";
                            break;
                        case 17:
                            str = "INSTALLED_APPS_FENCE";
                            break;
                        case 18:
                            str = "PHONE_CALL_FENCE";
                            break;
                        case 19:
                            str = "PROXIMITY_DISTANCE_FENCE";
                            break;
                        case 20:
                            str = "SUN_STATE_FENCE";
                            break;
                        case 21:
                            str = "LOCAL_TIME_FENCE";
                            break;
                        case 22:
                            str = "WEATHER_FENCE";
                            break;
                        case 23:
                            str = "PREDICTIVE";
                            break;
                        case 24:
                            str = "SHUSH_STATE_FENCE";
                            break;
                        default:
                            str = "WIFI_STATE_FENCE";
                            break;
                    }
                }
                str = "UNKNOWN_CONTEXT_FENCE_TYPE";
                sb.append(str);
                return;
            } else {
                str = "NOT";
            }
        }
        sb.append(str);
        sb.append("(");
        for (C55893j jVar2 : jVar.f148732c) {
            if (!z) {
                sb.append(", ");
            }
            m162847a(sb, jVar2);
            z = false;
        }
        sb.append(")");
    }
}
