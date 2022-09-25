package com.google.android.libraries.assistant.auto.ondevice;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.knowledge.p4661a.p4662a.C61752n;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b */
/* compiled from: PG */
public final /* synthetic */ class C11837b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C11926q f38024a;

    /* renamed from: b */
    public final /* synthetic */ C61752n f38025b;

    /* renamed from: c */
    public final /* synthetic */ Query f38026c;

    public /* synthetic */ C11837b(C11926q qVar, C61752n nVar, Query query) {
        this.f38024a = qVar;
        this.f38025b = nVar;
        this.f38026c = query;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r6 = this;
            com.google.android.libraries.assistant.auto.ondevice.q r0 = r6.f38024a
            com.google.knowledge.a.a.n r1 = r6.f38025b
            com.google.android.apps.gsa.shared.search.Query r2 = r6.f38026c
            com.google.android.libraries.assistant.auto.ondevice.b.c r0 = r0.f38312c
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "handleIntentQuery - intentQuery: %s"
            r5 = 43538(0xaa12, float:6.101E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56389s(r4, r1)
            java.lang.String r3 = r1.f166811b
            int r4 = r3.hashCode()
            switch(r4) {
                case -1475640849: goto L_0x0191;
                case -1372315690: goto L_0x0186;
                case -1363629390: goto L_0x017b;
                case -1307780404: goto L_0x0170;
                case -1305707300: goto L_0x0165;
                case -1199858686: goto L_0x015a;
                case -1183163064: goto L_0x014f;
                case -1090849647: goto L_0x0145;
                case -830889775: goto L_0x013a;
                case -381549767: goto L_0x012f;
                case -365932152: goto L_0x0124;
                case -356192338: goto L_0x0118;
                case -330839288: goto L_0x010c;
                case -167558404: goto L_0x0100;
                case 2587682: goto L_0x00f4;
                case 3198785: goto L_0x00e8;
                case 94559292: goto L_0x00dc;
                case 109376752: goto L_0x00d1;
                case 238021614: goto L_0x00c5;
                case 401430359: goto L_0x00b9;
                case 435378404: goto L_0x00ad;
                case 456428929: goto L_0x00a2;
                case 473881282: goto L_0x0096;
                case 515454733: goto L_0x008b;
                case 799095313: goto L_0x0080;
                case 870216797: goto L_0x0074;
                case 955468664: goto L_0x0068;
                case 1282019566: goto L_0x005c;
                case 1318764015: goto L_0x0051;
                case 1370374648: goto L_0x0045;
                case 1498399618: goto L_0x0039;
                case 1504745432: goto L_0x002d;
                case 1668672753: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x019c
        L_0x0021:
            java.lang.String r4 = "MuteVoiceGuidance"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 14
            goto L_0x019d
        L_0x002d:
            java.lang.String r4 = "IncreaseDeviceSetting"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 24
            goto L_0x019d
        L_0x0039:
            java.lang.String r4 = "LocalOpeningHours"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 19
            goto L_0x019d
        L_0x0045:
            java.lang.String r4 = "SetDeviceSetting"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 28
            goto L_0x019d
        L_0x0051:
            java.lang.String r4 = "SetAudioSource"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 0
            goto L_0x019d
        L_0x005c:
            java.lang.String r4 = "TravelNavigation"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 10
            goto L_0x019d
        L_0x0068:
            java.lang.String r4 = "UnmuteVoiceGuidance"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 15
            goto L_0x019d
        L_0x0074:
            java.lang.String r4 = "StopPlayback"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 8
            goto L_0x019d
        L_0x0080:
            java.lang.String r4 = "PausePlayback"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 7
            goto L_0x019d
        L_0x008b:
            java.lang.String r4 = "PreviousMedia"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 5
            goto L_0x019d
        L_0x0096:
            java.lang.String r4 = "RouteOverview"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 17
            goto L_0x019d
        L_0x00a2:
            java.lang.String r4 = "Set_audio_source"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 1
            goto L_0x019d
        L_0x00ad:
            java.lang.String r4 = "Increase_device_setting"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 25
            goto L_0x019d
        L_0x00b9:
            java.lang.String r4 = "OpenApp"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 9
            goto L_0x019d
        L_0x00c5:
            java.lang.String r4 = "Destination"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 18
            goto L_0x019d
        L_0x00d1:
            java.lang.String r4 = "PlayMedia"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 2
            goto L_0x019d
        L_0x00dc:
            java.lang.String r4 = "TurnDeviceSettingOn"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 22
            goto L_0x019d
        L_0x00e8:
            java.lang.String r4 = "help"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 32
            goto L_0x019d
        L_0x00f4:
            java.lang.String r4 = "Stop"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 31
            goto L_0x019d
        L_0x0100:
            java.lang.String r4 = "DecreaseDeviceSetting"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 26
            goto L_0x019d
        L_0x010c:
            java.lang.String r4 = "Decrease_device_setting"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 27
            goto L_0x019d
        L_0x0118:
            java.lang.String r4 = "TravelDirections"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 16
            goto L_0x019d
        L_0x0124:
            java.lang.String r4 = "ResumePlayback"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 6
            goto L_0x019d
        L_0x012f:
            java.lang.String r4 = "Play_media"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 3
            goto L_0x019d
        L_0x013a:
            java.lang.String r4 = "NavigationTurn"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 13
            goto L_0x019d
        L_0x0145:
            java.lang.String r4 = "NextMedia"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 4
            goto L_0x019d
        L_0x014f:
            java.lang.String r4 = "UnmuteDevice"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 30
            goto L_0x019d
        L_0x015a:
            java.lang.String r4 = "AddAStop"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 20
            goto L_0x019d
        L_0x0165:
            java.lang.String r4 = "LocalEntityInfo"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 11
            goto L_0x019d
        L_0x0170:
            java.lang.String r4 = "TravelArrivalTime"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 21
            goto L_0x019d
        L_0x017b:
            java.lang.String r4 = "TurnDeviceSettingOff"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 23
            goto L_0x019d
        L_0x0186:
            java.lang.String r4 = "StopNavigation"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 12
            goto L_0x019d
        L_0x0191:
            java.lang.String r4 = "MuteDevice"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x019c
            r3 = 29
            goto L_0x019d
        L_0x019c:
            r3 = -1
        L_0x019d:
            switch(r3) {
                case 0: goto L_0x0229;
                case 1: goto L_0x0229;
                case 2: goto L_0x0229;
                case 3: goto L_0x0229;
                case 4: goto L_0x0216;
                case 5: goto L_0x0216;
                case 6: goto L_0x0216;
                case 7: goto L_0x0216;
                case 8: goto L_0x0216;
                case 9: goto L_0x01ff;
                case 10: goto L_0x01ec;
                case 11: goto L_0x01ec;
                case 12: goto L_0x01ec;
                case 13: goto L_0x01ec;
                case 14: goto L_0x01ec;
                case 15: goto L_0x01ec;
                case 16: goto L_0x01ec;
                case 17: goto L_0x01ec;
                case 18: goto L_0x01d5;
                case 19: goto L_0x01d5;
                case 20: goto L_0x01d5;
                case 21: goto L_0x01d5;
                case 22: goto L_0x01be;
                case 23: goto L_0x01be;
                case 24: goto L_0x01be;
                case 25: goto L_0x01be;
                case 26: goto L_0x01be;
                case 27: goto L_0x01be;
                case 28: goto L_0x01be;
                case 29: goto L_0x01be;
                case 30: goto L_0x01be;
                case 31: goto L_0x01be;
                case 32: goto L_0x01a6;
                default: goto L_0x01a0;
            }
        L_0x01a0:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            r0.f38122r = r3
            goto L_0x023f
        L_0x01a6:
            com.google.android.libraries.assistant.auto.ondevice.b.p r3 = r0.f38116l
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            r0.f38122r = r3
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Sending to offlineHelpBuilder"
            r5 = 43547(0xaa1b, float:6.1022E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x023f
        L_0x01be:
            com.google.android.libraries.assistant.auto.ondevice.b.m r3 = r0.f38113i
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            r0.f38122r = r3
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Sending to offlineDeviceActionBuilder"
            r5 = 43546(0xaa1a, float:6.1021E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x023f
        L_0x01d5:
            com.google.android.libraries.assistant.auto.ondevice.b.q r3 = r0.f38114j
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            r0.f38122r = r3
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Sending to offlineLocalActionBuilder"
            r5 = 43545(0xaa19, float:6.102E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x023f
        L_0x01ec:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            r0.f38122r = r3
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "These intents should've been handled by Geo in PortMon instead."
            r5 = 43544(0xaa18, float:6.1018E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x023f
        L_0x01ff:
            com.google.android.libraries.assistant.auto.ondevice.b.y r3 = r0.f38111g
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            r0.f38122r = r3
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Sending to offlineOpenAppActionBuilder"
            r5 = 43543(0xaa17, float:6.1017E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x023f
        L_0x0216:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            r0.f38122r = r3
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "These intents should've been handled by MediaControl in PortMon instead."
            r5 = 43542(0xaa16, float:6.1015E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x023f
        L_0x0229:
            com.google.android.libraries.assistant.auto.ondevice.b.r r3 = r0.f38112h
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            r0.f38122r = r3
            com.google.common.f.a.d r3 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Sending to offlineMediaActionBuilder"
            r5 = 43541(0xaa15, float:6.1014E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
        L_0x023f:
            com.google.common.base.ax r3 = r0.f38122r
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x024c
            com.google.common.base.ax r3 = r0.f38122r
            r3.mo56107c()
        L_0x024c:
            com.google.common.base.ax r3 = r0.f38122r
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x0261
            com.google.common.base.ax r0 = r0.f38122r
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.g.b.a r0 = (com.google.android.apps.gsa.g.b.a) r0
            com.google.common.base.ax r0 = r0.a(r1, r2)
            goto L_0x0271
        L_0x0261:
            com.google.common.f.a.d r0 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "No builder can handle."
            r2 = 43539(0xaa13, float:6.1011E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0271:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.C11837b.mo17947a():java.lang.Object");
    }
}
