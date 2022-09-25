package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import android.content.Context;
import android.provider.Settings;
import android.provider.SettingsSlicesContract;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126994o;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58528ij;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.af */
/* compiled from: PG */
public final class C129349af {

    /* renamed from: a */
    public static final /* synthetic */ int f355240a = 0;

    /* renamed from: b */
    private static final C58528ij f355241b;

    static {
        C58528ij N = C58528ij.m90014N(C126994o.NETWORK_NO_CELL_SUPPORT_WIFI_ON, C126994o.NETWORK_NO_SIM_CARD_WIFI_ON, C126994o.NETWORK_SIM_CARD_ERROR_WIFI_ON, C126994o.NETWORK_MOBILE_DATA_OFF_WIFI_ON, C126994o.NETWORK_DATA_ROAMING_OFF_WIFI_ON);
        C69664n.m101060f(N, "of(\n      NetworkReason.…ROAMING_OFF_WIFI_ON\n    )");
        f355241b = N;
    }

    /* renamed from: a */
    public static final int m211169a(C126994o oVar) {
        C69664n.m101061g(oVar, "networkReason");
        C126994o oVar2 = C126994o.NETWORK_UNKNOWN_REASON;
        switch (oVar.ordinal()) {
            case 0:
                return R.string.assistant_network_error_unknown;
            case 1:
                return R.string.assistant_network_error_airplane_mode_on_wifi_off;
            case 2:
                return R.string.assistant_network_error_airplane_mode_on_wifi_on;
            case 3:
                return R.string.assistant_network_error_no_cell_support_wifi_off;
            case 4:
                return R.string.assistant_network_error_no_cell_support_wifi_on;
            case 5:
                return R.string.assistant_network_error_no_sim_card_wifi_off;
            case 6:
                return R.string.assistant_network_error_no_sim_card_wifi_on;
            case 7:
                return R.string.assistant_network_error_sim_card_locked;
            case 8:
                return R.string.assistant_network_error_sim_card_unknown_problem_wifi_off;
            case 9:
                return R.string.assistant_network_error_sim_card_unknown_problem_wifi_on;
            case 10:
                return R.string.assistant_network_error_mobile_data_off_wifi_off;
            case 11:
                return R.string.assistant_network_error_mobile_data_off_wifi_on;
            case 12:
                return R.string.assistant_network_error_data_roaming_off_wifi_off;
            case 13:
                return R.string.assistant_network_error_data_roaming_off_wifi_on;
            case 14:
                return R.string.assistant_network_error_no_data_connection;
            case 15:
                return R.string.assistant_network_error_captive_portal_detected;
            default:
                throw new C69677g();
        }
    }

    /* renamed from: b */
    public static final C129374p m211170b(C126994o oVar, Context context) {
        C69664n.m101061g(oVar, "networkReason");
        C69664n.m101061g(context, "context");
        C126994o oVar2 = C126994o.NETWORK_UNKNOWN_REASON;
        switch (oVar.ordinal()) {
            case 0:
            case 14:
                C129373o oVar3 = (C129373o) C129374p.f355284e.createBuilder();
                C69664n.m101060f(oVar3, "newBuilder()");
                C129376r a = C69664n.m101061g(oVar3, "builder");
                String string = context.getString(m211169a(oVar));
                C69664n.m101060f(string, "context.getString(getErr…orkReason(networkReason))");
                a.mo109008d(string);
                C129363e eVar = (C129363e) C129364f.f355269f.createBuilder();
                C69664n.m101060f(eVar, "newBuilder()");
                C129366h a2 = C69664n.m101061g(eVar, "builder");
                String string2 = context.getString(R.string.assistant_open_wireless_display_name);
                C69664n.m101060f(string2, "context.getString(R.stri…en_wireless_display_name)");
                a2.mo109000c(string2);
                a2.mo108999b("android.settings.WIRELESS_SETTINGS");
                a.mo109007c(a2.mo108998a());
                return a.mo109005a();
            case 1:
            case 2:
                C129373o oVar4 = (C129373o) C129374p.f355284e.createBuilder();
                C69664n.m101060f(oVar4, "newBuilder()");
                C129376r a3 = C69664n.m101061g(oVar4, "builder");
                String string3 = context.getString(m211169a(oVar));
                C69664n.m101060f(string3, "context.getString(getErr…orkReason(networkReason))");
                a3.mo109008d(string3);
                C129343a aVar = (C129343a) C129360b.f355262e.createBuilder();
                C69664n.m101060f(aVar, "newBuilder()");
                C129362d a4 = C69664n.m101061g(aVar, "builder");
                a4.mo108996c(C63490p.AIRPLANE_MODE.name());
                String string4 = context.getString(R.string.assistant_airplane_mode_display_name);
                C69664n.m101060f(string4, "context.getString(R.stri…rplane_mode_display_name)");
                a4.mo108995b(string4);
                String uri = SettingsSlicesContract.BASE_URI.buildUpon().appendPath("action").appendPath("airplane_mode").build().toString();
                C69664n.m101060f(uri, "BASE_URI.buildUpon()\n   …build()\n      .toString()");
                a4.mo108997d(uri);
                a3.mo109006b(a4.mo108994a());
                return a3.mo109005a();
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                C129373o oVar5 = (C129373o) C129374p.f355284e.createBuilder();
                C69664n.m101060f(oVar5, "newBuilder()");
                C129376r a5 = C69664n.m101061g(oVar5, "builder");
                String string5 = context.getString(m211169a(oVar));
                C69664n.m101060f(string5, "context.getString(getErr…orkReason(networkReason))");
                a5.mo109008d(string5);
                if (f355241b.contains(oVar)) {
                    C129363e eVar2 = (C129363e) C129364f.f355269f.createBuilder();
                    C69664n.m101060f(eVar2, "newBuilder()");
                    C129366h a6 = C69664n.m101061g(eVar2, "builder");
                    String string6 = context.getString(R.string.assistant_open_wifi_display_name);
                    C69664n.m101060f(string6, "context.getString(R.stri…t_open_wifi_display_name)");
                    a6.mo109000c(string6);
                    a6.mo108999b("android.settings.WIFI_SETTINGS");
                    a5.mo109007c(a6.mo108998a());
                } else {
                    C129343a aVar2 = (C129343a) C129360b.f355262e.createBuilder();
                    C69664n.m101060f(aVar2, "newBuilder()");
                    C129362d a7 = C69664n.m101061g(aVar2, "builder");
                    a7.mo108996c(C63490p.WIFI.name());
                    String string7 = context.getString(R.string.assistant_wifi_display_name);
                    C69664n.m101060f(string7, "context.getString(R.stri…istant_wifi_display_name)");
                    a7.mo108995b(string7);
                    String uri2 = SettingsSlicesContract.BASE_URI.buildUpon().appendPath("action").appendPath("wifi").build().toString();
                    C69664n.m101060f(uri2, "BASE_URI.buildUpon()\n   …build()\n      .toString()");
                    a7.mo108997d(uri2);
                    a5.mo109006b(a7.mo108994a());
                }
                return a5.mo109005a();
            case 7:
                C129373o oVar6 = (C129373o) C129374p.f355284e.createBuilder();
                C69664n.m101060f(oVar6, "newBuilder()");
                C129376r a8 = C69664n.m101061g(oVar6, "builder");
                String string8 = context.getString(m211169a(oVar));
                C69664n.m101060f(string8, "context.getString(getErr…orkReason(networkReason))");
                a8.mo109008d(string8);
                return a8.mo109005a();
            case 15:
                C129373o oVar7 = (C129373o) C129374p.f355284e.createBuilder();
                C69664n.m101060f(oVar7, "newBuilder()");
                C129376r a9 = C69664n.m101061g(oVar7, "builder");
                String string9 = context.getString(m211169a(oVar));
                C69664n.m101060f(string9, "context.getString(getErr…orkReason(networkReason))");
                a9.mo109008d(string9);
                C129363e eVar3 = (C129363e) C129364f.f355269f.createBuilder();
                C69664n.m101060f(eVar3, "newBuilder()");
                C129366h a10 = C69664n.m101061g(eVar3, "builder");
                String string10 = context.getString(R.string.assistant_sign_in_network_display_name);
                C69664n.m101060f(string10, "context.getString(R.stri…_in_network_display_name)");
                a10.mo109000c(string10);
                a10.mo108999b("android.intent.action.VIEW");
                String string11 = Settings.Global.getString(context.getContentResolver(), "captive_portal_http_url");
                if (string11 == null || string11.length() <= 0) {
                    string11 = "http://connectivitycheck.gstatic.com/generate_204";
                }
                C129363e eVar4 = a10.f355276a;
                eVar4.copyOnWrite();
                C129364f fVar = (C129364f) eVar4.instance;
                fVar.f355271a |= 4;
                fVar.f355274d = string11;
                C129363e eVar5 = a10.f355276a;
                eVar5.copyOnWrite();
                C129364f fVar2 = (C129364f) eVar5.instance;
                fVar2.f355271a |= 8;
                fVar2.f355275e = "android.intent.category.BROWSABLE";
                a9.mo109007c(a10.mo108998a());
                return a9.mo109005a();
            default:
                throw new C69677g();
        }
    }
}
