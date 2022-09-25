package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113255ah;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.h */
/* compiled from: PG */
public final class C111583h {

    /* renamed from: a */
    public static final C113341cl f310313a = C113341cl.m187503d(new C113255ah(R.drawable.quantum_ic_history_grey600_24));

    /* renamed from: b */
    public final C113206m f310314b;

    /* renamed from: c */
    public final C111585j f310315c;

    /* renamed from: d */
    public final PackageManager f310316d;

    /* renamed from: e */
    public final C86124t f310317e;

    /* renamed from: f */
    public final String f310318f;

    /* renamed from: g */
    public final C112037ao f310319g;

    public C111583h(C113206m mVar, C111585j jVar, Context context, C86124t tVar, C112037ao aoVar) {
        this.f310314b = mVar;
        this.f310315c = jVar;
        this.f310316d = context.getPackageManager();
        this.f310317e = tVar;
        this.f310319g = aoVar;
        this.f310318f = context.getString(R.string.tapas_server_open_app_prefix);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p3186j$.util.Optional m185342b(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1830910791: goto L_0x01a9;
                case -1683269456: goto L_0x019e;
                case -1384585454: goto L_0x0193;
                case -1347148203: goto L_0x0188;
                case -1332125790: goto L_0x017e;
                case -1206253905: goto L_0x0173;
                case -1197021003: goto L_0x0168;
                case -1187800591: goto L_0x015d;
                case -1035148770: goto L_0x0153;
                case -943119341: goto L_0x0148;
                case -821237672: goto L_0x013d;
                case -635710013: goto L_0x0131;
                case -599235531: goto L_0x0125;
                case -541166630: goto L_0x0119;
                case -521263270: goto L_0x010d;
                case -252438575: goto L_0x0101;
                case -201658192: goto L_0x00f5;
                case -122233601: goto L_0x00ea;
                case 72688948: goto L_0x00de;
                case 81119804: goto L_0x00d2;
                case 190754808: goto L_0x00c6;
                case 283599386: goto L_0x00ba;
                case 298498415: goto L_0x00ae;
                case 301506226: goto L_0x00a3;
                case 365184275: goto L_0x0097;
                case 394090313: goto L_0x008b;
                case 401449637: goto L_0x0080;
                case 456533820: goto L_0x0075;
                case 817310151: goto L_0x0069;
                case 917535262: goto L_0x005d;
                case 1116286597: goto L_0x0051;
                case 1282019566: goto L_0x0045;
                case 1297970613: goto L_0x0039;
                case 1972986001: goto L_0x002d;
                case 2025923950: goto L_0x0021;
                case 2043392610: goto L_0x0015;
                case 2070169380: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x01b3
        L_0x0009:
            java.lang.String r0 = "SetAlarms"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 27
            goto L_0x01b4
        L_0x0015:
            java.lang.String r0 = "Create_timer"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 21
            goto L_0x01b4
        L_0x0021:
            java.lang.String r0 = "Create_alarm"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 25
            goto L_0x01b4
        L_0x002d:
            java.lang.String r0 = "TurnOnWifi"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 8
            goto L_0x01b4
        L_0x0039:
            java.lang.String r0 = "MakePhoneCalls"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 36
            goto L_0x01b4
        L_0x0045:
            java.lang.String r0 = "TravelNavigation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 33
            goto L_0x01b4
        L_0x0051:
            java.lang.String r0 = "Get_alarm_info"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 26
            goto L_0x01b4
        L_0x005d:
            java.lang.String r0 = "ShowWifiSetting"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 10
            goto L_0x01b4
        L_0x0069:
            java.lang.String r0 = "TurnOffWifi"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 9
            goto L_0x01b4
        L_0x0075:
            java.lang.String r0 = "TurnOffBluetooth"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 4
            goto L_0x01b4
        L_0x0080:
            java.lang.String r0 = "OpenUrl"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 0
            goto L_0x01b4
        L_0x008b:
            java.lang.String r0 = "TurnOffDoNotDisturb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 12
            goto L_0x01b4
        L_0x0097:
            java.lang.String r0 = "Silence_alarm"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 29
            goto L_0x01b4
        L_0x00a3:
            java.lang.String r0 = "TurnOnBluetooth"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 3
            goto L_0x01b4
        L_0x00ae:
            java.lang.String r0 = "ChatMessage"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 18
            goto L_0x01b4
        L_0x00ba:
            java.lang.String r0 = "Disable_alarm"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 31
            goto L_0x01b4
        L_0x00c6:
            java.lang.String r0 = "FindFoodAndDrink"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 34
            goto L_0x01b4
        L_0x00d2:
            java.lang.String r0 = "ManageReminders"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 14
            goto L_0x01b4
        L_0x00de:
            java.lang.String r0 = "ShowAlarm"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 28
            goto L_0x01b4
        L_0x00ea:
            java.lang.String r0 = "ShowBluetoothSetting"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 2
            goto L_0x01b4
        L_0x00f5:
            java.lang.String r0 = "LegacySms"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 19
            goto L_0x01b4
        L_0x0101:
            java.lang.String r0 = "Delete_timer"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 23
            goto L_0x01b4
        L_0x010d:
            java.lang.String r0 = "CallActionCatchAll"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 35
            goto L_0x01b4
        L_0x0119:
            java.lang.String r0 = "Disable_alarm_in_context"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 30
            goto L_0x01b4
        L_0x0125:
            java.lang.String r0 = "Create_reminder"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 13
            goto L_0x01b4
        L_0x0131:
            java.lang.String r0 = "Delete_timer_in_context"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 24
            goto L_0x01b4
        L_0x013d:
            java.lang.String r0 = "TurnOffFlashlight"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 7
            goto L_0x01b4
        L_0x0148:
            java.lang.String r0 = "TurnOnDoNotDisturb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 11
            goto L_0x01b4
        L_0x0153:
            java.lang.String r0 = "ShowAirplaneModeSetting"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 1
            goto L_0x01b4
        L_0x015d:
            java.lang.String r0 = "ManageMessages"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 20
            goto L_0x01b4
        L_0x0168:
            java.lang.String r0 = "Enable_alarm"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 32
            goto L_0x01b4
        L_0x0173:
            java.lang.String r0 = "ShowReminder"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 15
            goto L_0x01b4
        L_0x017e:
            java.lang.String r0 = "TurnOnFlashlight"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 6
            goto L_0x01b4
        L_0x0188:
            java.lang.String r0 = "SendMessageAction"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 17
            goto L_0x01b4
        L_0x0193:
            java.lang.String r0 = "Get_reminder_info"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 16
            goto L_0x01b4
        L_0x019e:
            java.lang.String r0 = "SetTimers"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 22
            goto L_0x01b4
        L_0x01a9:
            java.lang.String r0 = "ChangeDeviceSettingBluetoothQuickChange"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b3
            r1 = 5
            goto L_0x01b4
        L_0x01b3:
            r1 = -1
        L_0x01b4:
            switch(r1) {
                case 0: goto L_0x0243;
                case 1: goto L_0x0237;
                case 2: goto L_0x022b;
                case 3: goto L_0x022b;
                case 4: goto L_0x022b;
                case 5: goto L_0x022b;
                case 6: goto L_0x021f;
                case 7: goto L_0x021f;
                case 8: goto L_0x0213;
                case 9: goto L_0x0213;
                case 10: goto L_0x0213;
                case 11: goto L_0x0207;
                case 12: goto L_0x0207;
                case 13: goto L_0x01fb;
                case 14: goto L_0x01fb;
                case 15: goto L_0x01fb;
                case 16: goto L_0x01fb;
                case 17: goto L_0x01ef;
                case 18: goto L_0x01ef;
                case 19: goto L_0x01ef;
                case 20: goto L_0x01ef;
                case 21: goto L_0x01e3;
                case 22: goto L_0x01e3;
                case 23: goto L_0x01e3;
                case 24: goto L_0x01e3;
                case 25: goto L_0x01d7;
                case 26: goto L_0x01d7;
                case 27: goto L_0x01d7;
                case 28: goto L_0x01d7;
                case 29: goto L_0x01d7;
                case 30: goto L_0x01d7;
                case 31: goto L_0x01d7;
                case 32: goto L_0x01d7;
                case 33: goto L_0x01ca;
                case 34: goto L_0x01ca;
                case 35: goto L_0x01bd;
                case 36: goto L_0x01bd;
                default: goto L_0x01b7;
            }
        L_0x01b7:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            goto L_0x024e
        L_0x01bd:
            r1 = 2131234633(0x7f080f49, float:1.8085437E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x01ca:
            r1 = 2131235001(0x7f0810b9, float:1.8086184E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x01d7:
            r1 = 2131234565(0x7f080f05, float:1.80853E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x01e3:
            r1 = 2131235195(0x7f08117b, float:1.8086577E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x01ef:
            r1 = 2131234911(0x7f08105f, float:1.8086001E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x01fb:
            r1 = 2131235049(0x7f0810e9, float:1.808628E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x0207:
            r1 = 2131234128(0x7f080d50, float:1.8084413E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x0213:
            r1 = 2131234945(0x7f081081, float:1.808607E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x021f:
            r1 = 2131234190(0x7f080d8e, float:1.8084539E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x022b:
            r1 = 2131234611(0x7f080f33, float:1.8085393E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x0237:
            r1 = 2131234561(0x7f080f01, float:1.8085291E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x024e
        L_0x0243:
            r1 = 2131235037(0x7f0810dd, float:1.8086257E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
        L_0x024e:
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.c r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111578c.f310308a
            j$.util.Optional r1 = r1.map(r0)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.d r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111579d.f310309a
            j$.util.Optional r1 = r1.map(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111583h.m185342b(java.lang.String):j$.util.Optional");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p3186j$.util.Optional m185343c(com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112036an r0, java.lang.String r1) {
        /*
            j$.util.Optional r0 = r0.mo99345h(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0010
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x011e
        L_0x0010:
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.hashCode()
            switch(r1) {
                case -2051748129: goto L_0x0093;
                case -1290197574: goto L_0x0088;
                case -1272444437: goto L_0x007d;
                case -1183073498: goto L_0x0073;
                case -870907421: goto L_0x0069;
                case -601793174: goto L_0x005e;
                case -331239923: goto L_0x0054;
                case -19257532: goto L_0x0049;
                case 108971: goto L_0x003f;
                case 3649301: goto L_0x0035;
                case 190912112: goto L_0x002a;
                case 1968882350: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x009d
        L_0x001f:
            java.lang.String r1 = "bluetooth"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 3
            goto L_0x009e
        L_0x002a:
            java.lang.String r1 = "airplane_mode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 0
            goto L_0x009e
        L_0x0035:
            java.lang.String r1 = "wifi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 6
            goto L_0x009e
        L_0x003f:
            java.lang.String r1 = "nfc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 5
            goto L_0x009e
        L_0x0049:
            java.lang.String r1 = "night_light_switch"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 10
            goto L_0x009e
        L_0x0054:
            java.lang.String r1 = "battery"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 1
            goto L_0x009e
        L_0x005e:
            java.lang.String r1 = "night_mode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 11
            goto L_0x009e
        L_0x0069:
            java.lang.String r1 = "battery_saver"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 2
            goto L_0x009e
        L_0x0073:
            java.lang.String r1 = "flashlight"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 4
            goto L_0x009e
        L_0x007d:
            java.lang.String r1 = "auto_rotate"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 9
            goto L_0x009e
        L_0x0088:
            java.lang.String r1 = "adaptive_brightness"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 8
            goto L_0x009e
        L_0x0093:
            java.lang.String r1 = "do_not_disturb"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 7
            goto L_0x009e
        L_0x009d:
            r0 = -1
        L_0x009e:
            switch(r0) {
                case 0: goto L_0x0113;
                case 1: goto L_0x0107;
                case 2: goto L_0x0107;
                case 3: goto L_0x00fb;
                case 4: goto L_0x00ef;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00d7;
                case 7: goto L_0x00cb;
                case 8: goto L_0x00bf;
                case 9: goto L_0x00b3;
                case 10: goto L_0x00a7;
                case 11: goto L_0x00a7;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x011e
        L_0x00a7:
            r0 = 2131234307(0x7f080e03, float:1.8084776E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x011e
        L_0x00b3:
            r0 = 2131234410(0x7f080e6a, float:1.8084985E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x011e
        L_0x00bf:
            r0 = 2131234048(0x7f080d00, float:1.808425E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x011e
        L_0x00cb:
            r0 = 2131234128(0x7f080d50, float:1.8084413E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x011e
        L_0x00d7:
            r0 = 2131234945(0x7f081081, float:1.808607E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x011e
        L_0x00e3:
            r0 = 2131234304(0x7f080e00, float:1.808477E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x011e
        L_0x00ef:
            r0 = 2131234190(0x7f080d8e, float:1.8084539E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x011e
        L_0x00fb:
            r0 = 2131234611(0x7f080f33, float:1.8085393E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x011e
        L_0x0107:
            r0 = 2131234030(0x7f080cee, float:1.8084214E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x011e
        L_0x0113:
            r0 = 2131234561(0x7f080f01, float:1.8085291E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x011e:
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.c r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111578c.f310308a
            j$.util.Optional r0 = r0.map(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.d r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111579d.f310309a
            j$.util.Optional r0 = r0.map(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111583h.m185343c(com.google.android.apps.gsa.staticplugins.opa.tapas.g.an, java.lang.String):j$.util.Optional");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo99182a(com.google.assistant.p3781ad.p3789d.C48578al r6) {
        /*
            r5 = this;
            j$.util.Optional r6 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187156c(r6)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x000f
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            return r6
        L_0x000f:
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.ao r0 = r5.f310319g
            java.lang.Object r6 = r6.get()
            com.google.assistant.ad.d.ad r6 = (com.google.assistant.p3781ad.p3789d.C48570ad) r6
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.an r6 = r0.mo99348a(r6)
            j$.util.Optional r0 = r6.mo99343e()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002a
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            return r6
        L_0x002a:
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1564705079: goto L_0x0059;
                case -6211207: goto L_0x004f;
                case 1605415530: goto L_0x0045;
                case 1939462293: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0063
        L_0x003b:
            java.lang.String r1 = "Turn_device_setting_on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0063
            r1 = 0
            goto L_0x0064
        L_0x0045:
            java.lang.String r1 = "Device_setting_bare"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0063
            r1 = 3
            goto L_0x0064
        L_0x004f:
            java.lang.String r1 = "Turn_device_setting_off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0063
            r1 = 1
            goto L_0x0064
        L_0x0059:
            java.lang.String r1 = "Show_device_setting"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0063
            r1 = 2
            goto L_0x0064
        L_0x0063:
            r1 = -1
        L_0x0064:
            if (r1 == 0) goto L_0x0078
            if (r1 == r4) goto L_0x0078
            if (r1 == r3) goto L_0x0078
            if (r1 == r2) goto L_0x0071
            j$.util.Optional r6 = m185342b(r0)
            return r6
        L_0x0071:
            java.lang.String r0 = "toggleable_setting"
            j$.util.Optional r6 = m185343c(r6, r0)
            return r6
        L_0x0078:
            java.lang.String r0 = "setting"
            j$.util.Optional r6 = m185343c(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111583h.mo99182a(com.google.assistant.ad.d.al):j$.util.Optional");
    }
}
