package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1145c;

import com.google.knowledge.p4661a.p4662a.C61752n;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.c.f */
/* compiled from: PG */
public final /* synthetic */ class C15608f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15609g f46662a;

    /* renamed from: b */
    public final /* synthetic */ C61752n f46663b;

    public /* synthetic */ C15608f(C15609g gVar, C61752n nVar) {
        this.f46662a = gVar;
        this.f46663b = nVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a0, code lost:
        if (r1.f166811b.equals("Radio_source_descriptor") != false) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0313, code lost:
        if (((com.google.protos.p4883as.p4884a.C63775d) r1.f172072a.get(0)).f172521b.equals("radio") != false) goto L_0x0315;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x031d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r9 = this;
            com.google.android.libraries.assistant.auto.tng.r.c.a.c.g r0 = r9.f46662a
            com.google.knowledge.a.a.n r1 = r9.f46663b
            java.lang.String r2 = r1.f166811b
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 15
            r6 = 2
            switch(r3) {
                case -1475640849: goto L_0x0183;
                case -1372315690: goto L_0x0178;
                case -1363629390: goto L_0x016e;
                case -1307780404: goto L_0x0163;
                case -1305707300: goto L_0x0158;
                case -1199858686: goto L_0x014d;
                case -1183163064: goto L_0x0142;
                case -1090849647: goto L_0x0137;
                case -830889775: goto L_0x012c;
                case -381549767: goto L_0x0121;
                case -365932152: goto L_0x0115;
                case -356192338: goto L_0x0109;
                case -330839288: goto L_0x00fd;
                case -167558404: goto L_0x00f1;
                case 2587682: goto L_0x00e5;
                case 3198785: goto L_0x00d9;
                case 94559292: goto L_0x00ce;
                case 109376752: goto L_0x00c3;
                case 238021614: goto L_0x00b7;
                case 401430359: goto L_0x00ab;
                case 435378404: goto L_0x00a0;
                case 456428929: goto L_0x0095;
                case 473881282: goto L_0x0089;
                case 515454733: goto L_0x007d;
                case 799095313: goto L_0x0071;
                case 870216797: goto L_0x0065;
                case 955468664: goto L_0x0059;
                case 1282019566: goto L_0x004d;
                case 1318764015: goto L_0x0042;
                case 1370374648: goto L_0x0036;
                case 1498399618: goto L_0x002a;
                case 1504745432: goto L_0x001f;
                case 1668672753: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x018e
        L_0x0013:
            java.lang.String r3 = "MuteVoiceGuidance"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 25
            goto L_0x018f
        L_0x001f:
            java.lang.String r3 = "IncreaseDeviceSetting"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 6
            goto L_0x018f
        L_0x002a:
            java.lang.String r3 = "LocalOpeningHours"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 31
            goto L_0x018f
        L_0x0036:
            java.lang.String r3 = "SetDeviceSetting"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 10
            goto L_0x018f
        L_0x0042:
            java.lang.String r3 = "SetAudioSource"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 0
            goto L_0x018f
        L_0x004d:
            java.lang.String r3 = "TravelNavigation"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 22
            goto L_0x018f
        L_0x0059:
            java.lang.String r3 = "UnmuteVoiceGuidance"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 26
            goto L_0x018f
        L_0x0065:
            java.lang.String r3 = "StopPlayback"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 18
            goto L_0x018f
        L_0x0071:
            java.lang.String r3 = "PausePlayback"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 17
            goto L_0x018f
        L_0x007d:
            java.lang.String r3 = "PreviousMedia"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 15
            goto L_0x018f
        L_0x0089:
            java.lang.String r3 = "RouteOverview"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 28
            goto L_0x018f
        L_0x0095:
            java.lang.String r3 = "Set_audio_source"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 1
            goto L_0x018f
        L_0x00a0:
            java.lang.String r3 = "Increase_device_setting"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 7
            goto L_0x018f
        L_0x00ab:
            java.lang.String r3 = "OpenApp"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 19
            goto L_0x018f
        L_0x00b7:
            java.lang.String r3 = "Destination"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 30
            goto L_0x018f
        L_0x00c3:
            java.lang.String r3 = "PlayMedia"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 2
            goto L_0x018f
        L_0x00ce:
            java.lang.String r3 = "TurnDeviceSettingOn"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 4
            goto L_0x018f
        L_0x00d9:
            java.lang.String r3 = "help"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 20
            goto L_0x018f
        L_0x00e5:
            java.lang.String r3 = "Stop"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 13
            goto L_0x018f
        L_0x00f1:
            java.lang.String r3 = "DecreaseDeviceSetting"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 8
            goto L_0x018f
        L_0x00fd:
            java.lang.String r3 = "Decrease_device_setting"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 9
            goto L_0x018f
        L_0x0109:
            java.lang.String r3 = "TravelDirections"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 27
            goto L_0x018f
        L_0x0115:
            java.lang.String r3 = "ResumePlayback"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 16
            goto L_0x018f
        L_0x0121:
            java.lang.String r3 = "Play_media"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 3
            goto L_0x018f
        L_0x012c:
            java.lang.String r3 = "NavigationTurn"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 24
            goto L_0x018f
        L_0x0137:
            java.lang.String r3 = "NextMedia"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 14
            goto L_0x018f
        L_0x0142:
            java.lang.String r3 = "UnmuteDevice"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 12
            goto L_0x018f
        L_0x014d:
            java.lang.String r3 = "AddAStop"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 32
            goto L_0x018f
        L_0x0158:
            java.lang.String r3 = "LocalEntityInfo"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 23
            goto L_0x018f
        L_0x0163:
            java.lang.String r3 = "TravelArrivalTime"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 29
            goto L_0x018f
        L_0x016e:
            java.lang.String r3 = "TurnDeviceSettingOff"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 5
            goto L_0x018f
        L_0x0178:
            java.lang.String r3 = "StopNavigation"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 21
            goto L_0x018f
        L_0x0183:
            java.lang.String r3 = "MuteDevice"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x018e
            r3 = 11
            goto L_0x018f
        L_0x018e:
            r3 = -1
        L_0x018f:
            java.lang.String r7 = "These intents should've been handled by MediaControl in PortMon instead."
            java.lang.String r8 = "PortableDispatcher"
            switch(r3) {
                case 0: goto L_0x024b;
                case 1: goto L_0x024b;
                case 2: goto L_0x024b;
                case 3: goto L_0x024b;
                case 4: goto L_0x0241;
                case 5: goto L_0x0241;
                case 6: goto L_0x0241;
                case 7: goto L_0x0241;
                case 8: goto L_0x0241;
                case 9: goto L_0x0241;
                case 10: goto L_0x0241;
                case 11: goto L_0x0241;
                case 12: goto L_0x0241;
                case 13: goto L_0x0241;
                case 14: goto L_0x022a;
                case 15: goto L_0x022a;
                case 16: goto L_0x022a;
                case 17: goto L_0x022a;
                case 18: goto L_0x020f;
                case 19: goto L_0x0205;
                case 20: goto L_0x01fb;
                case 21: goto L_0x01e0;
                case 22: goto L_0x01c7;
                case 23: goto L_0x01c7;
                case 24: goto L_0x01c7;
                case 25: goto L_0x01c7;
                case 26: goto L_0x01c7;
                case 27: goto L_0x01c7;
                case 28: goto L_0x01c7;
                case 29: goto L_0x01c7;
                case 30: goto L_0x01aa;
                case 31: goto L_0x01aa;
                case 32: goto L_0x01aa;
                default: goto L_0x0196;
            }
        L_0x0196:
            java.lang.String r3 = "ActionPackage__"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L_0x032b
            com.google.common.b.ij r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15673e.f46796a
            java.lang.String r1 = r1.f166811b
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0336
            goto L_0x032b
        L_0x01aa:
            com.google.android.libraries.assistant.auto.tng.r.c.a.a r1 = r0.f46673j
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r0.f46676m = r1
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1145c.C15609g.f46664a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r8)
            java.lang.String r2 = "Sending to local fulfiller"
            r3 = 46196(0xb474, float:6.4734E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x033a
        L_0x01c7:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            r0.f46676m = r1
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1145c.C15609g.f46664a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r8)
            java.lang.String r2 = "These intents should've been handled by Geo in PortMon instead."
            r3 = 46195(0xb473, float:6.4733E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x033a
        L_0x01e0:
            com.google.android.libraries.assistant.auto.tng.r.c.a.a r1 = r0.f46674k
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r0.f46676m = r1
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1145c.C15609g.f46664a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r8)
            r2 = 46194(0xb472, float:6.4732E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r7)
            goto L_0x033a
        L_0x01fb:
            com.google.android.libraries.assistant.auto.tng.r.c.a.a r1 = r0.f46669f
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r0.f46676m = r1
            goto L_0x033a
        L_0x0205:
            com.google.android.libraries.assistant.auto.tng.r.c.a.a r1 = r0.f46672i
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r0.f46676m = r1
            goto L_0x033a
        L_0x020f:
            com.google.android.libraries.assistant.auto.tng.r.c.a.a r1 = r0.f46674k
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r0.f46676m = r1
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1145c.C15609g.f46664a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r8)
            r2 = 46193(0xb471, float:6.473E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r7)
            goto L_0x033a
        L_0x022a:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            r0.f46676m = r1
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1145c.C15609g.f46664a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r8)
            r2 = 46192(0xb470, float:6.4729E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r7)
            goto L_0x033a
        L_0x0241:
            com.google.android.libraries.assistant.auto.tng.r.c.a.a r1 = r0.f46668e
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r0.f46676m = r1
            goto L_0x033a
        L_0x024b:
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r2 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r2.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r1)
            java.lang.String r1 = "media_object"
            boolean r3 = r2.mo22501f(r1)
            if (r3 == 0) goto L_0x02a4
            com.google.common.base.ax r3 = r2.mo22497b(r1)
            java.lang.Object r3 = r3.mo56107c()
            com.google.knowledge.a.a.h r3 = (com.google.knowledge.p4661a.p4662a.C61746h) r3
            com.google.knowledge.a.a.j r3 = r3.f166797e
            if (r3 != 0) goto L_0x0268
            com.google.knowledge.a.a.j r3 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x0268:
            int r7 = r3.f166802a
            if (r7 != r6) goto L_0x0271
            java.lang.Object r3 = r3.f166803b
            com.google.knowledge.a.a.n r3 = (com.google.knowledge.p4661a.p4662a.C61752n) r3
            goto L_0x0273
        L_0x0271:
            com.google.knowledge.a.a.n r3 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0273:
            java.lang.String r3 = r3.f166811b
            java.lang.String r7 = "RadioSourceDescriptor"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0315
            com.google.common.base.ax r1 = r2.mo22497b(r1)
            java.lang.Object r1 = r1.mo56107c()
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            com.google.knowledge.a.a.j r1 = r1.f166797e
            if (r1 != 0) goto L_0x028d
            com.google.knowledge.a.a.j r1 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x028d:
            int r3 = r1.f166802a
            if (r3 != r6) goto L_0x0296
            java.lang.Object r1 = r1.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x0298
        L_0x0296:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0298:
            java.lang.String r1 = r1.f166811b
            java.lang.String r3 = "Radio_source_descriptor"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02a4
            goto L_0x0315
        L_0x02a4:
            java.lang.String r1 = "car_device"
            boolean r3 = r2.mo22501f(r1)
            if (r3 == 0) goto L_0x02bc
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r1 = r2.mo22496a(r1)
            java.lang.String r3 = "source"
            com.google.common.base.ax r1 = r1.mo22499d(r3)
            boolean r1 = r1.mo56113h()
            if (r1 != 0) goto L_0x0315
        L_0x02bc:
            java.lang.String r1 = "app"
            boolean r3 = r2.mo22501f(r1)
            if (r3 == 0) goto L_0x0322
            com.google.common.base.ax r3 = r2.mo22500e(r1)
            boolean r6 = r3.mo56113h()
            java.lang.String r7 = "radio"
            if (r6 == 0) goto L_0x02dc
            java.lang.Object r3 = r3.mo56107c()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0315
        L_0x02dc:
            com.google.common.base.ax r1 = r2.mo22497b(r1)
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x0322
            java.lang.Object r1 = r1.mo56107c()
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            com.google.knowledge.a.a.j r1 = r1.f166797e
            if (r1 != 0) goto L_0x02f2
            com.google.knowledge.a.a.j r1 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x02f2:
            int r2 = r1.f166802a
            if (r2 != r5) goto L_0x02fb
            java.lang.Object r1 = r1.f166803b
            com.google.protos.an.h r1 = (com.google.protos.p4850an.C63624h) r1
            goto L_0x02fd
        L_0x02fb:
            com.google.protos.an.h r1 = com.google.protos.p4850an.C63624h.f172070b
        L_0x02fd:
            com.google.protobuf.cq r2 = r1.f172072a
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0322
            com.google.protobuf.cq r1 = r1.f172072a
            java.lang.Object r1 = r1.get(r4)
            com.google.protos.as.a.d r1 = (com.google.protos.p4883as.p4884a.C63775d) r1
            java.lang.String r1 = r1.f172521b
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0322
        L_0x0315:
            com.google.common.base.ax r1 = r0.f46665b
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0322
            com.google.common.base.ax r1 = r0.f46665b
            r0.f46676m = r1
            goto L_0x033a
        L_0x0322:
            com.google.android.libraries.assistant.auto.tng.r.c.a.a r1 = r0.f46671h
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r0.f46676m = r1
            goto L_0x033a
        L_0x032b:
            com.google.common.base.ax r1 = r0.f46666c
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0336
            com.google.common.base.ax r1 = r0.f46666c
            goto L_0x0338
        L_0x0336:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
        L_0x0338:
            r0.f46676m = r1
        L_0x033a:
            com.google.common.base.ax r0 = r0.f46676m
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1145c.C15608f.call():java.lang.Object");
    }
}
