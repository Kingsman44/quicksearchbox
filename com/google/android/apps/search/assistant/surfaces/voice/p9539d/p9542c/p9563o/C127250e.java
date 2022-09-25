package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9563o;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.assistant.p3897e.p3917i.p3918a.C51366fa;
import com.google.assistant.p3897e.p3917i.p3918a.C51369fd;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.o.e */
/* compiled from: PG */
public final class C127250e implements C127369n {

    /* renamed from: a */
    public static final Duration f350423a = Duration.ofSeconds(3);

    /* renamed from: b */
    public static final C33476a f350424b;

    /* renamed from: c */
    public static final C32836cd f350425c;

    /* renamed from: d */
    private static final Map f350426d = C69505av.m100867i(new C69685i("BLUETOOTH", "content://android.settings.slices/action/bluetooth"), new C69685i("WIFI", "content://android.settings.slices/action/wifi"), new C69685i("AIRPLANE_MODE", "content://android.settings.slices/action/airplane_mode"), new C69685i("VOLUME_LEVEL", "content://com.android.settings.slices/action/media_volume"), new C69685i("DO_NOT_DISTURB", "content://com.android.settings.slices/action/zen_mode_toggle"), new C69685i("RING_VOLUME", "content://com.android.settings.slices/action/ring_volume"), new C69685i("BATTERY_SAVER", "content://android.settings.slices/action/battery_saver"), new C69685i("AUTO_ROTATE", "content://com.android.settings.slices/action/auto_rotate"), new C69685i("MOBILE_DATA", "content://com.android.settings.slices/action/mobile_data"), new C69685i("LOCATION", "content://com.android.settings.slices/action/location"), new C69685i("AMBIENT_DISPLAY_ALWAYS_ON", "content://com.android.settings.slices/action/ambient_display_always_on"), new C69685i("ADAPTIVE_BRIGHTNESS", "content://com.android.settings.slices/action/auto_brightness"), new C69685i("AMBIENT_DISPLAY_NEW_NOTIFICATION", "content://com.android.settings.slices/action/ambient_display_notification"), new C69685i("ACTIVE_EDGE", "content://com.android.settings.slices/action/gesture_assist"), new C69685i("NFC", "content://com.android.settings.slices/action/toggle_nfc"), new C69685i("FLASHLIGHT", "content://com.android.settings.slices/action/flashlight"), new C69685i("ALARM_VOLUME", "content://com.android.settings.slices/action/alarm_volume"), new C69685i("CALL_VOLUME", "content://com.android.settings.slices/action/call_volume"), new C69685i("ACCESSIBILITY", "content://com.android.settings.slices/action/com.google.android.marvin.talkback/com.google.android.marvin.talkback.TalkBackService"), new C69685i("MEDIA_VOLUME", "content://com.android.settings.slices/action/media_volume"), new C69685i("NOTIFICATION_VOLUME", "content://com.android.settings.slices/action/ring_volume"), new C69685i("ADAPTIVE_BATTERY", "content://com.android.settings.slices/action/smart_battery"), new C69685i("CAMERA_DOUBLE_TWIST", "content://com.android.settings.slices/action/gesture_double_twist"), new C69685i("SWITCH_ACCESS", "content://com.android.settings.slices/action/com.google.android.marvin.talkback/com.android.switchaccess.SwitchAccessService"), new C69685i("JUMP_TO_CAMERA", "content://com.android.settings.slices/action/gesture_double_tap_power"), new C69685i("NIGHT_MODE", "content://com.android.settings.slices/action/night_display_activated"), new C69685i("REQUIRE_DEVICE_UNLOCK_FOR_NFC", "content://com.android.settings.slices/action/nfc_secure_settings"), new C69685i("WAKE_SCREEN_FOR_NOTIFICATIONS", "content://com.android.settings.slices/action/ambient_display_notification"));

    /* renamed from: e */
    private static final Map f350427e = C69505av.m100867i(new C69685i("COLOR_INVERSION", "color_inversion"), new C69685i("DATA_SAVER", "data_saver"), new C69685i("HOT_SPOT", "enable_wifi_ap"));

    /* renamed from: f */
    private final C71422aw f350428f;

    /* renamed from: g */
    private final C35472h f350429g;

    /* renamed from: h */
    private final C65603f f350430h;

    /* renamed from: i */
    private final C65603f f350431i;

    static {
        C51366fa faVar = (C51366fa) C51369fd.f133788c.createBuilder();
        C69664n.m101060f(faVar, "newBuilder()");
        f350424b = new C33476a("assistant.api.params.DeviceSettingsParams", C69664n.m101061g(faVar, "builder").mo53594a());
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.device_settings.params");
        a.mo38319b(a2.mo38298a());
        f350425c = a.mo38318a();
    }

    public C127250e(C71422aw awVar, C35472h hVar, C65603f fVar, C65603f fVar2) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(hVar, "getSettingsPerformer");
        this.f350428f = awVar;
        this.f350429g = hVar;
        this.f350430h = fVar;
        this.f350431i = fVar2;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350428f, (C71424ay) null, new C127248c(this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108004b(p5462h.p5466c.C69577g r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9563o.C127249d
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.voice.d.c.o.d r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9563o.C127249d) r0
            int r1 = r0.f350422c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350422c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.o.d r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.o.d
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f350420a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350422c
            r3 = 1
            java.lang.String r4 = "newBuilder()"
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r11)
            goto L_0x01e6
        L_0x002a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0032:
            p5462h.C69714l.m101134b(r11)
            com.google.assistant.e.j.fc r11 = com.google.assistant.p3897e.p3921j.C52097fc.f136720f
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.j.ez r11 = (com.google.assistant.p3897e.p3921j.C52093ez) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r2)
            com.google.protobuf.a.b r2 = new com.google.protobuf.a.b
            com.google.protobuf.bv r5 = r11.instance
            com.google.assistant.e.j.fc r5 = (com.google.assistant.p3897e.p3921j.C52097fc) r5
            com.google.protobuf.cq r5 = r5.f136724c
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            java.lang.String r6 = "_builder.getSettingIdsList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r2.<init>(r5)
            com.google.protos.m.a.f r2 = r10.f350430h
            com.google.protobuf.cq r2 = r2.f178307a
            java.lang.String r5 = "settingsToQuery.elementList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            java.lang.String r5 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            r11.copyOnWrite()
            com.google.protobuf.bv r6 = r11.instance
            com.google.assistant.e.j.fc r6 = (com.google.assistant.p3897e.p3921j.C52097fc) r6
            com.google.protobuf.cq r7 = r6.f136724c
            boolean r8 = r7.mo58948c()
            if (r8 != 0) goto L_0x007c
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r6.f136724c = r7
        L_0x007c:
            com.google.protobuf.cq r6 = r6.f136724c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r6)
            com.google.protobuf.a.c r2 = new com.google.protobuf.a.c
            com.google.protobuf.bv r6 = r11.instance
            com.google.assistant.e.j.fc r6 = (com.google.assistant.p3897e.p3921j.C52097fc) r6
            com.google.protobuf.dn r6 = r6.f136725d
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            java.lang.String r7 = "_builder.getIdsToSlicesSettingUrisMap()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r2.<init>(r6)
            java.util.Map r2 = f350426d
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00a8:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00d0
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            com.google.protos.m.a.f r9 = r10.f350430h
            com.google.protobuf.cq r9 = r9.f178307a
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L_0x00a8
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            r6.put(r8, r7)
            goto L_0x00a8
        L_0x00d0:
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.j.fc r2 = (com.google.assistant.p3897e.p3921j.C52097fc) r2
            com.google.protobuf.dn r7 = r2.f136725d
            boolean r8 = r7.f170058b
            if (r8 != 0) goto L_0x00e3
            com.google.protobuf.dn r7 = r7.mo58980a()
            r2.f136725d = r7
        L_0x00e3:
            com.google.protobuf.dn r2 = r2.f136725d
            r2.putAll(r6)
            com.google.protobuf.a.c r2 = new com.google.protobuf.a.c
            com.google.protobuf.bv r6 = r11.instance
            com.google.assistant.e.j.fc r6 = (com.google.assistant.p3897e.p3921j.C52097fc) r6
            com.google.protobuf.dn r6 = r6.f136726e
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            java.lang.String r7 = "_builder.getIdsToSettingUrisMap()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r2.<init>(r6)
            java.util.Map r2 = f350427e
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x010f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0137
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            com.google.protos.m.a.f r9 = r10.f350430h
            com.google.protobuf.cq r9 = r9.f178307a
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L_0x010f
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            r6.put(r8, r7)
            goto L_0x010f
        L_0x0137:
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.assistant.e.j.fc r2 = (com.google.assistant.p3897e.p3921j.C52097fc) r2
            com.google.protobuf.dn r7 = r2.f136726e
            boolean r8 = r7.f170058b
            if (r8 != 0) goto L_0x014a
            com.google.protobuf.dn r7 = r7.mo58980a()
            r2.f136726e = r7
        L_0x014a:
            com.google.protobuf.dn r2 = r2.f136726e
            r2.putAll(r6)
            com.google.protobuf.a.b r2 = new com.google.protobuf.a.b
            com.google.protobuf.bv r6 = r11.instance
            com.google.assistant.e.j.fc r6 = (com.google.assistant.p3897e.p3921j.C52097fc) r6
            com.google.protobuf.cq r6 = r6.f136723b
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            java.lang.String r7 = "_builder.getSignalKeysList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r2.<init>(r6)
            com.google.protos.m.a.f r2 = r10.f350431i
            com.google.protobuf.cq r2 = r2.f178307a
            java.lang.String r6 = "signalsToQuery.elementList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            r11.copyOnWrite()
            com.google.protobuf.bv r5 = r11.instance
            com.google.assistant.e.j.fc r5 = (com.google.assistant.p3897e.p3921j.C52097fc) r5
            com.google.protobuf.cq r6 = r5.f136723b
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x0184
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r5.f136723b = r6
        L_0x0184:
            com.google.protobuf.cq r5 = r5.f136723b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r5)
            com.google.protobuf.bv r11 = r11.build()
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            com.google.assistant.e.j.fc r11 = (com.google.assistant.p3897e.p3921j.C52097fc) r11
            com.google.assistant.e.j.dy r2 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.dx r2 = (com.google.assistant.p3897e.p3921j.C51808dx) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.assistant.e.j.ol r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            java.lang.String r5 = "device.GET_SETTINGS"
            r2.mo53840c(r5)
            com.google.assistant.e.j.dw r5 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.dv r5 = (com.google.assistant.p3897e.p3921j.C51806dv) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r4)
            com.google.assistant.e.j.oj r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            r5.mo53837c()
            com.google.android.libraries.search.assistant.i.d r6 = com.google.android.libraries.search.assistant.performer.deviceactions.C35881aj.f94000b
            com.google.assistant.e.j.kc r11 = r6.mo38881b(r11)
            java.lang.String r6 = "ARGS_KEY.toProtobufMapEntry(opArgs)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r6)
            r5.mo53836b(r11)
            com.google.assistant.e.j.dw r11 = r5.mo53835a()
            r2.mo53839b(r11)
            com.google.assistant.e.j.dy r11 = r2.mo53838a()
            com.google.android.libraries.search.assistant.performer.a.h r2 = r10.f350429g
            com.google.common.util.concurrent.cx r11 = r2.mo20766a(r11)
            java.lang.String r2 = "getSettingsPerformer.perform(opParams)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            r0.f350422c = r3
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r0)
            if (r11 == r1) goto L_0x0297
        L_0x01e6:
            com.google.assistant.e.j.ec r11 = (com.google.assistant.p3897e.p3921j.C52070ec) r11
            java.lang.String r0 = "opResult"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            com.google.android.libraries.search.assistant.i.d r0 = com.google.android.libraries.search.assistant.performer.deviceactions.C35881aj.f94001c
            com.google.assistant.e.j.eb r11 = r11.f136655c
            if (r11 != 0) goto L_0x01f5
            com.google.assistant.e.j.eb r11 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
        L_0x01f5:
            com.google.protobuf.cq r11 = r11.f136650a
            com.google.protobuf.MessageLite r11 = r0.mo38883d(r11)
            com.google.assistant.e.j.fm r11 = (com.google.assistant.p3897e.p3921j.C52107fm) r11
            com.google.assistant.e.i.a.fd r0 = com.google.assistant.p3897e.p3917i.p3918a.C51369fd.f133788c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.i.a.fa r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51366fa) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)
            com.google.assistant.e.i.a.ez r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.protobuf.a.c r1 = new com.google.protobuf.a.c
            com.google.assistant.e.i.a.fa r2 = r0.f133784a
            com.google.protobuf.bv r2 = r2.instance
            com.google.assistant.e.i.a.fd r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51369fd) r2
            com.google.protobuf.dn r2 = r2.f133790a
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            java.lang.String r3 = "_builder.getSettingsInfoMap()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r1.<init>(r2)
            com.google.protobuf.dn r1 = r11.f136746c
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.lang.String r2 = "opResult.settingsInfoMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.lang.String r2 = "map"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            com.google.assistant.e.i.a.fa r3 = r0.f133784a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.e.i.a.fd r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51369fd) r3
            com.google.protobuf.dn r4 = r3.f133790a
            boolean r5 = r4.f170058b
            if (r5 != 0) goto L_0x024b
            com.google.protobuf.dn r4 = r4.mo58980a()
            r3.f133790a = r4
        L_0x024b:
            com.google.protobuf.dn r3 = r3.f133790a
            r3.putAll(r1)
            com.google.protobuf.a.c r1 = new com.google.protobuf.a.c
            com.google.assistant.e.i.a.fa r3 = r0.f133784a
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.e.i.a.fd r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51369fd) r3
            com.google.protobuf.dn r3 = r3.f133791b
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
            java.lang.String r4 = "_builder.getSignalResultMap()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            r1.<init>(r3)
            com.google.protobuf.dn r11 = r11.f136745b
            java.util.Map r11 = java.util.Collections.unmodifiableMap(r11)
            java.lang.String r1 = "opResult.signalResultMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r2)
            com.google.assistant.e.i.a.fa r1 = r0.f133784a
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.assistant.e.i.a.fd r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51369fd) r1
            com.google.protobuf.dn r2 = r1.f133791b
            boolean r3 = r2.f170058b
            if (r3 != 0) goto L_0x028d
            com.google.protobuf.dn r2 = r2.mo58980a()
            r1.f133791b = r2
        L_0x028d:
            com.google.protobuf.dn r1 = r1.f133791b
            r1.putAll(r11)
            com.google.assistant.e.i.a.fd r11 = r0.mo53594a()
            return r11
        L_0x0297:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9563o.C127250e.mo108004b(h.c.g):java.lang.Object");
    }
}
