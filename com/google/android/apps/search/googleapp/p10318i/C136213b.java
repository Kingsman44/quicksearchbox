package com.google.android.apps.search.googleapp.p10318i;

import android.net.wifi.WifiManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p3025k.C38553h;

/* renamed from: com.google.android.apps.search.googleapp.i.b */
/* compiled from: PG */
public final class C136213b {

    /* renamed from: a */
    private final AccessibilityManager f370954a;

    /* renamed from: b */
    private final WifiManager f370955b;

    /* renamed from: c */
    private final C38553h f370956c;

    public C136213b(AccessibilityManager accessibilityManager, C38553h hVar, WifiManager wifiManager) {
        this.f370954a = accessibilityManager;
        this.f370956c = hVar;
        this.f370955b = wifiManager;
    }

    /* renamed from: b */
    private static C136217f m221343b(C136216e eVar, int i, int i2, int i3) {
        C136214c cVar = (C136214c) C136217f.f370970f.createBuilder();
        cVar.copyOnWrite();
        C136217f fVar = (C136217f) cVar.instance;
        fVar.f370973b = eVar.f370969k;
        fVar.f370972a |= 1;
        cVar.copyOnWrite();
        C136217f fVar2 = (C136217f) cVar.instance;
        fVar2.f370972a |= 2;
        fVar2.f370974c = i;
        cVar.copyOnWrite();
        C136217f fVar3 = (C136217f) cVar.instance;
        fVar3.f370972a |= 4;
        fVar3.f370975d = i2;
        cVar.copyOnWrite();
        C136217f fVar4 = (C136217f) cVar.instance;
        fVar4.f370972a |= 8;
        fVar4.f370976e = i3;
        return (C136217f) cVar.build();
    }

    /* renamed from: c */
    private static C136217f m221344c() {
        return m221343b(C136216e.RETRY, R.string.googleapp_error_card_retry_label, R.drawable.quantum_ic_replay_grey600_24, 92747);
    }

    /* renamed from: d */
    private static C136217f m221345d() {
        return m221343b(C136216e.RETRY_VOICE_SEARCH, R.string.googleapp_error_card_retry_label, R.drawable.quantum_ic_replay_grey600_24, 92747);
    }

    /* renamed from: f */
    private final boolean m221347f(boolean z) {
        return z && !this.f370954a.isEnabled() && !this.f370956c.f101930a;
    }

    /* renamed from: e */
    private static C136217f m221346e(boolean z) {
        if (z) {
            return m221343b(C136216e.SELECT_WIFI_NETWORK, R.string.googleapp_error_card_select_wifi_network, R.drawable.quantum_ic_settings_grey600_24, 120945);
        }
        return m221343b(C136216e.TURN_ON_WIFI, R.string.googleapp_error_card_turn_on_wifi, R.drawable.quantum_ic_settings_grey600_24, 120948);
    }

    /* renamed from: a */
    public final C136219h mo112846a(int i, boolean z, boolean z2) {
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                    C136218g gVar = (C136218g) C136219h.f370977i.createBuilder();
                    gVar.copyOnWrite();
                    C136219h hVar = (C136219h) gVar.instance;
                    hVar.f370980b = 0;
                    hVar.f370979a |= 1;
                    gVar.copyOnWrite();
                    C136219h hVar2 = (C136219h) gVar.instance;
                    hVar2.f370979a |= 2;
                    hVar2.f370981c = R.string.googleapp_error_card_internal_error;
                    gVar.mo112848a(z2 ? m221345d() : m221344c());
                    if (m221347f(z)) {
                        String name = C136224m.DIZZY.name();
                        gVar.copyOnWrite();
                        C136219h hVar3 = (C136219h) gVar.instance;
                        name.getClass();
                        hVar3.f370979a |= 16;
                        hVar3.f370985g = name;
                        gVar.copyOnWrite();
                        C136219h hVar4 = (C136219h) gVar.instance;
                        hVar4.f370979a |= 32;
                        hVar4.f370986h = 107897;
                    } else {
                        gVar.copyOnWrite();
                        C136219h hVar5 = (C136219h) gVar.instance;
                        hVar5.f370979a |= 8;
                        hVar5.f370983e = R.drawable.quantum_ic_cloud_off_white_48;
                        gVar.copyOnWrite();
                        C136219h hVar6 = (C136219h) gVar.instance;
                        hVar6.f370979a |= 32;
                        hVar6.f370986h = 92746;
                    }
                    return (C136219h) gVar.build();
                case 1:
                    C136218g gVar2 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar2.copyOnWrite();
                    C136219h hVar7 = (C136219h) gVar2.instance;
                    hVar7.f370980b = 1;
                    hVar7.f370979a = 1 | hVar7.f370979a;
                    gVar2.copyOnWrite();
                    C136219h hVar8 = (C136219h) gVar2.instance;
                    hVar8.f370979a = 2 | hVar8.f370979a;
                    hVar8.f370981c = R.string.googleapp_error_card_title_mobile_data_off;
                    gVar2.copyOnWrite();
                    C136219h hVar9 = (C136219h) gVar2.instance;
                    hVar9.f370979a = 4 | hVar9.f370979a;
                    hVar9.f370982d = R.string.googleapp_error_card_explanation_mobile_data_off;
                    gVar2.mo112848a(z2 ? m221345d() : m221344c());
                    gVar2.mo112848a(m221343b(C136216e.TURN_ON_MOBILE_DATA, R.string.googleapp_error_card_turn_on_mobile_data, R.drawable.quantum_ic_settings_grey600_24, 92748));
                    if (m221347f(z)) {
                        String name2 = C136224m.BOAT_DATA.name();
                        gVar2.copyOnWrite();
                        C136219h hVar10 = (C136219h) gVar2.instance;
                        name2.getClass();
                        hVar10.f370979a |= 16;
                        hVar10.f370985g = name2;
                        gVar2.copyOnWrite();
                        C136219h hVar11 = (C136219h) gVar2.instance;
                        hVar11.f370979a |= 32;
                        hVar11.f370986h = 107895;
                    } else {
                        gVar2.copyOnWrite();
                        C136219h hVar12 = (C136219h) gVar2.instance;
                        hVar12.f370979a |= 8;
                        hVar12.f370983e = R.drawable.quantum_ic_signal_cellular_connected_no_internet_2_bar_white_48;
                        gVar2.copyOnWrite();
                        C136219h hVar13 = (C136219h) gVar2.instance;
                        hVar13.f370979a |= 32;
                        hVar13.f370986h = 92742;
                    }
                    return (C136219h) gVar2.build();
                case 2:
                    C136218g gVar3 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar3.copyOnWrite();
                    C136219h hVar14 = (C136219h) gVar3.instance;
                    hVar14.f370980b = 2;
                    hVar14.f370979a |= 1;
                    gVar3.copyOnWrite();
                    C136219h hVar15 = (C136219h) gVar3.instance;
                    hVar15.f370979a |= 2;
                    hVar15.f370981c = R.string.googleapp_error_card_title_airplane_mode_on;
                    gVar3.copyOnWrite();
                    C136219h hVar16 = (C136219h) gVar3.instance;
                    hVar16.f370979a |= 4;
                    hVar16.f370982d = R.string.googleapp_error_card_explanation_airplane_mode;
                    gVar3.mo112848a(z2 ? m221345d() : m221344c());
                    gVar3.mo112848a(m221343b(C136216e.TURN_OFF_AIRPLANE_MODE, R.string.googleapp_error_card_turn_off_airplane_mode, R.drawable.quantum_ic_settings_grey600_24, 92749));
                    if (m221347f(z)) {
                        String name3 = C136224m.AIRPLANE.name();
                        gVar3.copyOnWrite();
                        C136219h hVar17 = (C136219h) gVar3.instance;
                        name3.getClass();
                        hVar17.f370979a |= 16;
                        hVar17.f370985g = name3;
                        gVar3.copyOnWrite();
                        C136219h hVar18 = (C136219h) gVar3.instance;
                        hVar18.f370979a |= 32;
                        hVar18.f370986h = 107894;
                    } else {
                        gVar3.copyOnWrite();
                        C136219h hVar19 = (C136219h) gVar3.instance;
                        hVar19.f370979a |= 8;
                        hVar19.f370983e = R.drawable.quantum_ic_airplanemode_active_white_48;
                        gVar3.copyOnWrite();
                        C136219h hVar20 = (C136219h) gVar3.instance;
                        hVar20.f370979a |= 32;
                        hVar20.f370986h = 92743;
                    }
                    return (C136219h) gVar3.build();
                case 3:
                    C136218g gVar4 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar4.copyOnWrite();
                    C136219h hVar21 = (C136219h) gVar4.instance;
                    hVar21.f370980b = 3;
                    hVar21.f370979a = 1 | hVar21.f370979a;
                    gVar4.copyOnWrite();
                    C136219h hVar22 = (C136219h) gVar4.instance;
                    hVar22.f370979a = 2 | hVar22.f370979a;
                    hVar22.f370981c = R.string.googleapp_error_card_title_data_roaming_off;
                    gVar4.copyOnWrite();
                    C136219h hVar23 = (C136219h) gVar4.instance;
                    hVar23.f370979a = 4 | hVar23.f370979a;
                    hVar23.f370982d = R.string.googleapp_error_card_explanation_data_roaming_off;
                    gVar4.mo112848a(z2 ? m221345d() : m221344c());
                    gVar4.mo112848a(m221343b(C136216e.TURN_ON_DATA_ROAMING, R.string.googleapp_error_card_turn_on_data_roaming, R.drawable.quantum_ic_settings_grey600_24, 92750));
                    if (m221347f(z)) {
                        String name4 = C136224m.BOAT_DATA.name();
                        gVar4.copyOnWrite();
                        C136219h hVar24 = (C136219h) gVar4.instance;
                        name4.getClass();
                        hVar24.f370979a |= 16;
                        hVar24.f370985g = name4;
                        gVar4.copyOnWrite();
                        C136219h hVar25 = (C136219h) gVar4.instance;
                        hVar25.f370979a |= 32;
                        hVar25.f370986h = 107896;
                    } else {
                        gVar4.copyOnWrite();
                        C136219h hVar26 = (C136219h) gVar4.instance;
                        hVar26.f370979a |= 8;
                        hVar26.f370983e = R.drawable.quantum_ic_signal_cellular_connected_no_internet_2_bar_white_48;
                        gVar4.copyOnWrite();
                        C136219h hVar27 = (C136219h) gVar4.instance;
                        hVar27.f370979a |= 32;
                        hVar27.f370986h = 92744;
                    }
                    return (C136219h) gVar4.build();
                case 4:
                    C136218g gVar5 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar5.copyOnWrite();
                    C136219h hVar28 = (C136219h) gVar5.instance;
                    hVar28.f370980b = 4;
                    hVar28.f370979a |= 1;
                    gVar5.copyOnWrite();
                    C136219h hVar29 = (C136219h) gVar5.instance;
                    hVar29.f370979a |= 2;
                    hVar29.f370981c = R.string.googleapp_error_card_title_offline;
                    gVar5.copyOnWrite();
                    C136219h hVar30 = (C136219h) gVar5.instance;
                    hVar30.f370979a |= 4;
                    hVar30.f370982d = R.string.googleapp_error_card_explanation_offline;
                    gVar5.mo112848a(z2 ? m221345d() : m221344c());
                    if (m221347f(z)) {
                        String name5 = C136224m.RAIN.name();
                        gVar5.copyOnWrite();
                        C136219h hVar31 = (C136219h) gVar5.instance;
                        name5.getClass();
                        hVar31.f370979a |= 16;
                        hVar31.f370985g = name5;
                        gVar5.copyOnWrite();
                        C136219h hVar32 = (C136219h) gVar5.instance;
                        hVar32.f370979a |= 32;
                        hVar32.f370986h = 107898;
                    } else {
                        gVar5.copyOnWrite();
                        C136219h hVar33 = (C136219h) gVar5.instance;
                        hVar33.f370979a |= 8;
                        hVar33.f370983e = R.drawable.quantum_ic_cloud_off_white_48;
                        gVar5.copyOnWrite();
                        C136219h hVar34 = (C136219h) gVar5.instance;
                        hVar34.f370979a |= 32;
                        hVar34.f370986h = 92745;
                    }
                    return (C136219h) gVar5.build();
                case 5:
                    boolean isWifiEnabled = this.f370955b.isWifiEnabled();
                    int i3 = isWifiEnabled ? R.string.googleapp_error_card_title_no_cell_support_wifi_on : R.string.googleapp_error_card_title_no_cell_support_wifi_off;
                    int i4 = true != isWifiEnabled ? R.string.googleapp_error_card_explanation_no_cell_support_wifi_off : R.string.googleapp_error_card_explanation_no_cell_support_wifi_on;
                    C136218g gVar6 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar6.copyOnWrite();
                    C136219h hVar35 = (C136219h) gVar6.instance;
                    hVar35.f370980b = 5;
                    hVar35.f370979a |= 1;
                    gVar6.copyOnWrite();
                    C136219h hVar36 = (C136219h) gVar6.instance;
                    hVar36.f370979a = 2 | hVar36.f370979a;
                    hVar36.f370981c = i3;
                    gVar6.copyOnWrite();
                    C136219h hVar37 = (C136219h) gVar6.instance;
                    hVar37.f370979a = 4 | hVar37.f370979a;
                    hVar37.f370982d = i4;
                    gVar6.mo112848a(m221346e(isWifiEnabled));
                    gVar6.mo112848a(z2 ? m221345d() : m221344c());
                    if (m221347f(z)) {
                        String name6 = C136224m.BOAT_WIFI.name();
                        gVar6.copyOnWrite();
                        C136219h hVar38 = (C136219h) gVar6.instance;
                        name6.getClass();
                        hVar38.f370979a |= 16;
                        hVar38.f370985g = name6;
                        gVar6.copyOnWrite();
                        C136219h hVar39 = (C136219h) gVar6.instance;
                        hVar39.f370979a |= 32;
                        hVar39.f370986h = 120938;
                    } else {
                        int i5 = true != isWifiEnabled ? R.drawable.quantum_ic_signal_wifi_off_white_24 : R.drawable.quantum_ic_signal_wifi_statusbar_not_connected_white_26x24;
                        gVar6.copyOnWrite();
                        C136219h hVar40 = (C136219h) gVar6.instance;
                        hVar40.f370979a |= 8;
                        hVar40.f370983e = i5;
                        gVar6.copyOnWrite();
                        C136219h hVar41 = (C136219h) gVar6.instance;
                        hVar41.f370979a |= 32;
                        hVar41.f370986h = 120937;
                    }
                    return (C136219h) gVar6.build();
                case 6:
                    boolean isWifiEnabled2 = this.f370955b.isWifiEnabled();
                    int i6 = isWifiEnabled2 ? R.string.googleapp_error_card_explanation_no_data_connection_wifi_on : R.string.googleapp_error_card_explanation_no_data_connection_wifi_off;
                    C136218g gVar7 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar7.copyOnWrite();
                    C136219h hVar42 = (C136219h) gVar7.instance;
                    hVar42.f370980b = 6;
                    hVar42.f370979a = 1 | hVar42.f370979a;
                    gVar7.copyOnWrite();
                    C136219h hVar43 = (C136219h) gVar7.instance;
                    hVar43.f370979a = 2 | hVar43.f370979a;
                    hVar43.f370981c = R.string.googleapp_error_card_title_no_data_connection;
                    gVar7.copyOnWrite();
                    C136219h hVar44 = (C136219h) gVar7.instance;
                    hVar44.f370979a = 4 | hVar44.f370979a;
                    hVar44.f370982d = i6;
                    gVar7.mo112848a(m221346e(isWifiEnabled2));
                    gVar7.mo112848a(z2 ? m221345d() : m221344c());
                    if (m221347f(z)) {
                        String name7 = C136224m.BOAT_DATA.name();
                        gVar7.copyOnWrite();
                        C136219h hVar45 = (C136219h) gVar7.instance;
                        name7.getClass();
                        hVar45.f370979a |= 16;
                        hVar45.f370985g = name7;
                        gVar7.copyOnWrite();
                        C136219h hVar46 = (C136219h) gVar7.instance;
                        hVar46.f370979a |= 32;
                        hVar46.f370986h = 120940;
                    } else {
                        gVar7.copyOnWrite();
                        C136219h hVar47 = (C136219h) gVar7.instance;
                        hVar47.f370979a |= 8;
                        hVar47.f370983e = R.drawable.quantum_ic_signal_cellular_connected_no_internet_2_bar_white_24;
                        gVar7.copyOnWrite();
                        C136219h hVar48 = (C136219h) gVar7.instance;
                        hVar48.f370979a |= 32;
                        hVar48.f370986h = 120939;
                    }
                    return (C136219h) gVar7.build();
                case 7:
                    boolean isWifiEnabled3 = this.f370955b.isWifiEnabled();
                    int i7 = isWifiEnabled3 ? R.string.googleapp_error_card_explanation_no_signal_wifi_on : R.string.googleapp_error_card_explanation_no_signal_wifi_off;
                    C136218g gVar8 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar8.copyOnWrite();
                    C136219h hVar49 = (C136219h) gVar8.instance;
                    hVar49.f370980b = 7;
                    hVar49.f370979a = 1 | hVar49.f370979a;
                    gVar8.copyOnWrite();
                    C136219h hVar50 = (C136219h) gVar8.instance;
                    hVar50.f370979a = 2 | hVar50.f370979a;
                    hVar50.f370981c = R.string.googleapp_error_card_title_no_signal;
                    gVar8.copyOnWrite();
                    C136219h hVar51 = (C136219h) gVar8.instance;
                    hVar51.f370979a = 4 | hVar51.f370979a;
                    hVar51.f370982d = i7;
                    gVar8.mo112848a(m221346e(isWifiEnabled3));
                    gVar8.mo112848a(z2 ? m221345d() : m221344c());
                    if (m221347f(z)) {
                        String name8 = C136224m.BOAT_DATA.name();
                        gVar8.copyOnWrite();
                        C136219h hVar52 = (C136219h) gVar8.instance;
                        name8.getClass();
                        hVar52.f370979a |= 16;
                        hVar52.f370985g = name8;
                        gVar8.copyOnWrite();
                        C136219h hVar53 = (C136219h) gVar8.instance;
                        hVar53.f370979a |= 32;
                        hVar53.f370986h = 120942;
                    } else {
                        gVar8.copyOnWrite();
                        C136219h hVar54 = (C136219h) gVar8.instance;
                        hVar54.f370979a |= 8;
                        hVar54.f370983e = R.drawable.quantum_ic_signal_cellular_null_white_24;
                        gVar8.copyOnWrite();
                        C136219h hVar55 = (C136219h) gVar8.instance;
                        hVar55.f370979a |= 32;
                        hVar55.f370986h = 120941;
                    }
                    return (C136219h) gVar8.build();
                case 8:
                    boolean isWifiEnabled4 = this.f370955b.isWifiEnabled();
                    int i8 = isWifiEnabled4 ? R.string.googleapp_error_card_explanation_no_sim_wifi_on : R.string.googleapp_error_card_explanation_no_sim_wifi_off;
                    C136218g gVar9 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar9.copyOnWrite();
                    C136219h hVar56 = (C136219h) gVar9.instance;
                    hVar56.f370980b = 8;
                    hVar56.f370979a = 1 | hVar56.f370979a;
                    gVar9.copyOnWrite();
                    C136219h hVar57 = (C136219h) gVar9.instance;
                    hVar57.f370979a = 2 | hVar57.f370979a;
                    hVar57.f370981c = R.string.googleapp_error_card_title_no_sim;
                    gVar9.copyOnWrite();
                    C136219h hVar58 = (C136219h) gVar9.instance;
                    hVar58.f370979a = 4 | hVar58.f370979a;
                    hVar58.f370982d = i8;
                    gVar9.mo112848a(m221346e(isWifiEnabled4));
                    gVar9.mo112848a(z2 ? m221345d() : m221344c());
                    if (m221347f(z)) {
                        String name9 = C136224m.BOAT_SIM.name();
                        gVar9.copyOnWrite();
                        C136219h hVar59 = (C136219h) gVar9.instance;
                        name9.getClass();
                        hVar59.f370979a |= 16;
                        hVar59.f370985g = name9;
                        gVar9.copyOnWrite();
                        C136219h hVar60 = (C136219h) gVar9.instance;
                        hVar60.f370979a |= 32;
                        hVar60.f370986h = 120944;
                    } else {
                        gVar9.copyOnWrite();
                        C136219h hVar61 = (C136219h) gVar9.instance;
                        hVar61.f370979a |= 8;
                        hVar61.f370983e = R.drawable.quantum_ic_no_sim_white_24;
                        gVar9.copyOnWrite();
                        C136219h hVar62 = (C136219h) gVar9.instance;
                        hVar62.f370979a |= 32;
                        hVar62.f370986h = 120943;
                    }
                    return (C136219h) gVar9.build();
                case 9:
                    boolean isWifiEnabled5 = this.f370955b.isWifiEnabled();
                    int i9 = isWifiEnabled5 ? R.string.googleapp_error_card_explanation_sim_card_error_wifi_on : R.string.googleapp_error_card_explanation_sim_card_error_wifi_off;
                    C136218g gVar10 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar10.copyOnWrite();
                    C136219h hVar63 = (C136219h) gVar10.instance;
                    hVar63.f370980b = 9;
                    hVar63.f370979a = 1 | hVar63.f370979a;
                    gVar10.copyOnWrite();
                    C136219h hVar64 = (C136219h) gVar10.instance;
                    hVar64.f370979a = 2 | hVar64.f370979a;
                    hVar64.f370981c = R.string.googleapp_error_card_title_sim_card_error;
                    gVar10.copyOnWrite();
                    C136219h hVar65 = (C136219h) gVar10.instance;
                    hVar65.f370979a = 4 | hVar65.f370979a;
                    hVar65.f370982d = i9;
                    gVar10.mo112848a(m221346e(isWifiEnabled5));
                    gVar10.mo112848a(z2 ? m221345d() : m221344c());
                    if (m221347f(z)) {
                        String name10 = C136224m.BOAT_SIM.name();
                        gVar10.copyOnWrite();
                        C136219h hVar66 = (C136219h) gVar10.instance;
                        name10.getClass();
                        hVar66.f370979a |= 16;
                        hVar66.f370985g = name10;
                        gVar10.copyOnWrite();
                        C136219h hVar67 = (C136219h) gVar10.instance;
                        hVar67.f370979a |= 32;
                        hVar67.f370986h = 120947;
                    } else {
                        gVar10.copyOnWrite();
                        C136219h hVar68 = (C136219h) gVar10.instance;
                        hVar68.f370979a |= 8;
                        hVar68.f370983e = R.drawable.quantum_ic_sim_card_alert_white_24;
                        gVar10.copyOnWrite();
                        C136219h hVar69 = (C136219h) gVar10.instance;
                        hVar69.f370979a |= 32;
                        hVar69.f370986h = 120946;
                    }
                    return (C136219h) gVar10.build();
                case 10:
                    C136218g gVar11 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar11.copyOnWrite();
                    C136219h hVar70 = (C136219h) gVar11.instance;
                    hVar70.f370980b = 10;
                    hVar70.f370979a |= 1;
                    gVar11.copyOnWrite();
                    C136219h hVar71 = (C136219h) gVar11.instance;
                    hVar71.f370979a |= 2;
                    hVar71.f370981c = R.string.googleapp_error_card_title_aw_snap_error;
                    gVar11.copyOnWrite();
                    C136219h hVar72 = (C136219h) gVar11.instance;
                    hVar72.f370979a |= 4;
                    hVar72.f370982d = R.string.googleapp_error_card_aw_snap_error;
                    gVar11.mo112848a(m221343b(C136216e.REFRESH, R.string.googleapp_error_card_refresh_label, R.drawable.quantum_ic_refresh_grey600_24, 123703));
                    if (m221347f(z)) {
                        String name11 = C136224m.DIZZY_NO_PLAY_BUTTON.name();
                        gVar11.copyOnWrite();
                        C136219h hVar73 = (C136219h) gVar11.instance;
                        name11.getClass();
                        hVar73.f370979a |= 16;
                        hVar73.f370985g = name11;
                        gVar11.copyOnWrite();
                        C136219h hVar74 = (C136219h) gVar11.instance;
                        hVar74.f370979a |= 32;
                        hVar74.f370986h = 123702;
                    } else {
                        gVar11.copyOnWrite();
                        C136219h hVar75 = (C136219h) gVar11.instance;
                        hVar75.f370979a |= 8;
                        hVar75.f370983e = R.drawable.quantum_gm_ic_error_white_24;
                        gVar11.copyOnWrite();
                        C136219h hVar76 = (C136219h) gVar11.instance;
                        hVar76.f370979a |= 32;
                        hVar76.f370986h = 123701;
                    }
                    return (C136219h) gVar11.build();
                case 11:
                    C136218g gVar12 = (C136218g) C136219h.f370977i.createBuilder();
                    gVar12.copyOnWrite();
                    C136219h hVar77 = (C136219h) gVar12.instance;
                    hVar77.f370980b = 11;
                    hVar77.f370979a |= 1;
                    gVar12.copyOnWrite();
                    C136219h hVar78 = (C136219h) gVar12.instance;
                    hVar78.f370979a |= 2;
                    hVar78.f370981c = R.string.googleapp_error_card_title_no_mic_permission;
                    gVar12.copyOnWrite();
                    C136219h hVar79 = (C136219h) gVar12.instance;
                    hVar79.f370979a |= 4;
                    hVar79.f370982d = R.string.googleapp_error_card_explanation_no_mic_permission;
                    gVar12.mo112848a(m221345d());
                    gVar12.mo112848a(m221343b(C136216e.GRANT_MIC_PERMISSION, R.string.googleapp_error_card_grant_mic_permission, R.drawable.quantum_ic_settings_grey600_24, 126363));
                    if (m221347f(z)) {
                        String name12 = C136224m.DIZZY.name();
                        gVar12.copyOnWrite();
                        C136219h hVar80 = (C136219h) gVar12.instance;
                        name12.getClass();
                        hVar80.f370979a |= 16;
                        hVar80.f370985g = name12;
                        gVar12.copyOnWrite();
                        C136219h hVar81 = (C136219h) gVar12.instance;
                        hVar81.f370979a |= 32;
                        hVar81.f370986h = 126434;
                    } else {
                        gVar12.copyOnWrite();
                        C136219h hVar82 = (C136219h) gVar12.instance;
                        hVar82.f370979a |= 8;
                        hVar82.f370983e = R.drawable.quantum_ic_warning_white_48;
                        gVar12.copyOnWrite();
                        C136219h hVar83 = (C136219h) gVar12.instance;
                        hVar83.f370979a |= 32;
                        hVar83.f370986h = 126440;
                    }
                    return (C136219h) gVar12.build();
                default:
                    throw new AssertionError("Control flow should never reach here");
            }
        } else {
            throw null;
        }
    }
}
