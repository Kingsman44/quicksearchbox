package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111675l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.af */
/* compiled from: PG */
public final class C111695af {

    /* renamed from: d */
    public static final /* synthetic */ int f310501d = 0;

    /* renamed from: e */
    private static final C121537f f310502e;

    /* renamed from: a */
    public final C111675l f310503a;

    /* renamed from: b */
    public final C22871g f310504b;

    /* renamed from: c */
    public final C86124t f310505c;

    static {
        C121537f b = C121537f.m200840b("TapasServerResponseParser", C113409et.f314037l);
        f310502e = b;
        C121511c cVar = b.f337270a;
    }

    public C111695af(C111675l lVar, C22871g gVar, C86124t tVar) {
        this.f310503a = lVar;
        this.f310504b = gVar;
        this.f310505c = tVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0250, code lost:
        if (r2.equals("Find_media") != false) goto L_0x0269;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo99206a(com.google.assistant.p3781ad.p3789d.C48578al r10, java.lang.String r11) {
        /*
            r9 = this;
            com.google.protobuf.cq r0 = r10.f125509c
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0011
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92900i(r10)
            return r10
        L_0x0011:
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.y r0 = new com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.y
            r0.<init>(r10, r11)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.l r1 = r9.f310503a
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f310463a
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249580gH
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x002c
            dagger.a r10 = r1.f310471i
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
            goto L_0x02d2
        L_0x002c:
            com.google.protobuf.cq r2 = r10.f125509c
            int r2 = r2.size()
            if (r2 != 0) goto L_0x003a
        L_0x0034:
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = r1.mo99205a()
            goto L_0x02d2
        L_0x003a:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f310463a
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249585gM
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x0058
            j$.util.Optional r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187155b(r10)
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L_0x0058
            dagger.a r10 = r1.f310465c
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
            goto L_0x02d2
        L_0x0058:
            com.google.protobuf.cq r2 = r10.f125509c
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.assistant.ad.d.aj r2 = (com.google.assistant.p3781ad.p3789d.C48576aj) r2
            int r4 = r2.f125497b
            int r4 = com.google.assistant.p3781ad.p3789d.C48573ag.m85236a(r4)
            r5 = 13
            if (r4 != 0) goto L_0x006c
            goto L_0x0078
        L_0x006c:
            if (r4 != r5) goto L_0x0078
            dagger.a r10 = r1.f310473k
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
            goto L_0x02d2
        L_0x0078:
            j$.util.Optional r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187158e(r2)
            boolean r6 = r4.isPresent()
            r7 = 25
            if (r6 == 0) goto L_0x00b8
            java.lang.Object r6 = r4.get()
            com.google.assistant.ad.d.u r6 = (com.google.assistant.p3781ad.p3789d.C48763u) r6
            int r6 = r6.f126175b
            if (r6 == r7) goto L_0x009a
            java.lang.Object r6 = r4.get()
            com.google.assistant.ad.d.u r6 = (com.google.assistant.p3781ad.p3789d.C48763u) r6
            int r6 = r6.f126175b
            r8 = 50
            if (r6 != r8) goto L_0x00b8
        L_0x009a:
            java.lang.Object r4 = r4.get()
            com.google.assistant.ad.d.u r4 = (com.google.assistant.p3781ad.p3789d.C48763u) r4
            com.google.protos.ba.f r4 = r4.f126176c
            if (r4 != 0) goto L_0x00a6
            com.google.protos.ba.f r4 = com.google.protos.p4948ba.C64376f.f174594b
        L_0x00a6:
            com.google.protobuf.cq r4 = r4.f174596a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00b8
            dagger.a r10 = r1.f310474l
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
            goto L_0x02d2
        L_0x00b8:
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.ao r4 = r1.f310475m
            com.google.assistant.ad.d.ad r2 = r2.f125500e
            if (r2 != 0) goto L_0x00c0
            com.google.assistant.ad.d.ad r2 = com.google.assistant.p3781ad.p3789d.C48570ad.f125481d
        L_0x00c0:
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.an r2 = r4.mo99348a(r2)
            j$.util.Optional r2 = r2.mo99343e()
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x00d0
            goto L_0x0034
        L_0x00d0:
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f310463a
            com.google.android.apps.gsa.shared.m.h r6 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249593gU
            com.google.common.b.gu r4 = r4.mo79745c(r6)
            boolean r4 = r4.contains(r2)
            if (r4 != 0) goto L_0x00e6
            goto L_0x0034
        L_0x00e6:
            int r4 = r2.hashCode()
            switch(r4) {
                case -2042615405: goto L_0x025e;
                case -1924688544: goto L_0x0253;
                case -1859996162: goto L_0x024a;
                case -1830910791: goto L_0x023f;
                case -1564705079: goto L_0x0234;
                case -1384585454: goto L_0x0229;
                case -1361515124: goto L_0x021f;
                case -1332125790: goto L_0x0214;
                case -1305707300: goto L_0x0209;
                case -1144657654: goto L_0x01fe;
                case -1035148770: goto L_0x01f2;
                case -821237672: goto L_0x01e6;
                case -439681332: goto L_0x01db;
                case -381549767: goto L_0x01d0;
                case -122233601: goto L_0x01c4;
                case -6211207: goto L_0x01b8;
                case 46834225: goto L_0x01ac;
                case 109867825: goto L_0x01a1;
                case 301506226: goto L_0x0195;
                case 401430359: goto L_0x018a;
                case 456533820: goto L_0x017e;
                case 817310151: goto L_0x0172;
                case 917535262: goto L_0x0166;
                case 917696521: goto L_0x015a;
                case 1116286597: goto L_0x014e;
                case 1231935024: goto L_0x0142;
                case 1282019566: goto L_0x0137;
                case 1605415530: goto L_0x012b;
                case 1838311808: goto L_0x011f;
                case 1939462293: goto L_0x0113;
                case 1972986001: goto L_0x0107;
                case 2025923950: goto L_0x00fb;
                case 2043392610: goto L_0x00ef;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x0268
        L_0x00ef:
            java.lang.String r3 = "Create_timer"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 26
            goto L_0x0269
        L_0x00fb:
            java.lang.String r3 = "Create_alarm"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 25
            goto L_0x0269
        L_0x0107:
            java.lang.String r3 = "TurnOnWifi"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 20
            goto L_0x0269
        L_0x0113:
            java.lang.String r3 = "Turn_device_setting_on"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 9
            goto L_0x0269
        L_0x011f:
            java.lang.String r3 = "Get_schedule"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 32
            goto L_0x0269
        L_0x012b:
            java.lang.String r3 = "Device_setting_bare"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 12
            goto L_0x0269
        L_0x0137:
            java.lang.String r3 = "TravelNavigation"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 4
            goto L_0x0269
        L_0x0142:
            java.lang.String r3 = "App_bare"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 8
            goto L_0x0269
        L_0x014e:
            java.lang.String r3 = "Get_alarm_info"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 27
            goto L_0x0269
        L_0x015a:
            java.lang.String r3 = "Get_personal_event_info"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 31
            goto L_0x0269
        L_0x0166:
            java.lang.String r3 = "ShowWifiSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 22
            goto L_0x0269
        L_0x0172:
            java.lang.String r3 = "TurnOffWifi"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 21
            goto L_0x0269
        L_0x017e:
            java.lang.String r3 = "TurnOffBluetooth"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 16
            goto L_0x0269
        L_0x018a:
            java.lang.String r3 = "OpenApp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 5
            goto L_0x0269
        L_0x0195:
            java.lang.String r3 = "TurnOnBluetooth"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 15
            goto L_0x0269
        L_0x01a1:
            java.lang.String r3 = "PlayMusic"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 2
            goto L_0x0269
        L_0x01ac:
            java.lang.String r3 = "Get_calendar_events"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 30
            goto L_0x0269
        L_0x01b8:
            java.lang.String r3 = "Turn_device_setting_off"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 10
            goto L_0x0269
        L_0x01c4:
            java.lang.String r3 = "ShowBluetoothSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 14
            goto L_0x0269
        L_0x01d0:
            java.lang.String r3 = "Play_media"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 1
            goto L_0x0269
        L_0x01db:
            java.lang.String r3 = "Open_app"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 6
            goto L_0x0269
        L_0x01e6:
            java.lang.String r3 = "TurnOffFlashlight"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 19
            goto L_0x0269
        L_0x01f2:
            java.lang.String r3 = "ShowAirplaneModeSetting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 13
            goto L_0x0269
        L_0x01fe:
            java.lang.String r3 = "CalendarAgenda"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 29
            goto L_0x0269
        L_0x0209:
            java.lang.String r3 = "LocalEntityInfo"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 24
            goto L_0x0269
        L_0x0214:
            java.lang.String r3 = "TurnOnFlashlight"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 18
            goto L_0x0269
        L_0x021f:
            java.lang.String r3 = "intent_factory_device.Open_app"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 7
            goto L_0x0269
        L_0x0229:
            java.lang.String r3 = "Get_reminder_info"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 28
            goto L_0x0269
        L_0x0234:
            java.lang.String r3 = "Show_device_setting"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 11
            goto L_0x0269
        L_0x023f:
            java.lang.String r3 = "ChangeDeviceSettingBluetoothQuickChange"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 17
            goto L_0x0269
        L_0x024a:
            java.lang.String r4 = "Find_media"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0268
            goto L_0x0269
        L_0x0253:
            java.lang.String r3 = "ShowEntity"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 23
            goto L_0x0269
        L_0x025e:
            java.lang.String r3 = "Media_entity_bare"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0268
            r3 = 3
            goto L_0x0269
        L_0x0268:
            r3 = -1
        L_0x0269:
            switch(r3) {
                case 0: goto L_0x02c0;
                case 1: goto L_0x02b7;
                case 2: goto L_0x02b7;
                case 3: goto L_0x02b7;
                case 4: goto L_0x02ae;
                case 5: goto L_0x02a5;
                case 6: goto L_0x02a5;
                case 7: goto L_0x02a5;
                case 8: goto L_0x02a5;
                case 9: goto L_0x029c;
                case 10: goto L_0x029c;
                case 11: goto L_0x029c;
                case 12: goto L_0x029c;
                case 13: goto L_0x029c;
                case 14: goto L_0x029c;
                case 15: goto L_0x029c;
                case 16: goto L_0x029c;
                case 17: goto L_0x029c;
                case 18: goto L_0x029c;
                case 19: goto L_0x029c;
                case 20: goto L_0x029c;
                case 21: goto L_0x029c;
                case 22: goto L_0x029c;
                case 23: goto L_0x0293;
                case 24: goto L_0x0293;
                case 25: goto L_0x026e;
                case 26: goto L_0x026e;
                case 27: goto L_0x026e;
                case 28: goto L_0x026e;
                case 29: goto L_0x026e;
                case 30: goto L_0x026e;
                case 31: goto L_0x026e;
                case 32: goto L_0x026e;
                default: goto L_0x026c;
            }
        L_0x026c:
            goto L_0x0034
        L_0x026e:
            com.google.android.apps.gsa.search.core.i.t r10 = r1.f310463a
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249353bt
            boolean r10 = r10.mo79746e(r2)
            if (r10 != 0) goto L_0x027a
            goto L_0x0034
        L_0x027a:
            boolean r10 = android.text.TextUtils.isEmpty(r11)
            if (r10 == 0) goto L_0x028a
            com.google.android.apps.gsa.search.core.i.t r10 = r1.f310463a
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249267aM
            boolean r10 = r10.mo79746e(r11)
            if (r10 != 0) goto L_0x0034
        L_0x028a:
            dagger.a r10 = r1.f310464b
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
            goto L_0x02d2
        L_0x0293:
            dagger.a r10 = r1.f310467e
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
            goto L_0x02d2
        L_0x029c:
            dagger.a r10 = r1.f310466d
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
            goto L_0x02d2
        L_0x02a5:
            dagger.a r10 = r1.f310472j
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
            goto L_0x02d2
        L_0x02ae:
            dagger.a r10 = r1.f310468f
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
            goto L_0x02d2
        L_0x02b7:
            dagger.a r10 = r1.f310470h
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
            goto L_0x02d2
        L_0x02c0:
            j$.util.Optional r10 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187160g(r10)
            boolean r10 = r10.isPresent()
            if (r10 == 0) goto L_0x0034
            dagger.a r10 = r1.f310469g
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.k r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111674k) r10
        L_0x02d2:
            java.lang.Object r10 = r0.apply(r10)
            com.google.common.util.concurrent.cx r10 = (com.google.common.util.concurrent.C60870cx) r10
            com.google.android.libraries.gsa.k.g r11 = r9.f310504b
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.ae r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.ae
            r1.<init>(r9, r0)
            java.lang.String r0 = "processCompletionUsingFunction"
            com.google.common.util.concurrent.cx r10 = r11.mo28210j(r10, r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111695af.mo99206a(com.google.assistant.ad.d.al, java.lang.String):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo99207b(C49728r rVar) {
        C121537f fVar = f310502e;
        C60870cx i = this.f310504b.mo28209i(this.f310504b.mo28209i(C60856cj.m92906o((C58485gu) Collection.EL.stream(rVar.f128344d).map(new C111745z(this, rVar.f128342b)).collect(C58370cn.f155946a)), "combining parsed tapas server results", C111690aa.f310495a), "buildTapasSuggestionResponse", new C111693ad(rVar));
        fVar.mo105244m("parseTapasCompletionResponse", i);
        return i;
    }
}
