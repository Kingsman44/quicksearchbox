package com.google.android.libraries.home.coreui.devicetile.model;

import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.p1940a.p1943c.C23419av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.model.p */
/* compiled from: PG */
public enum C23741p implements C23747v {
    UNKNOWN(0, C23419av.UNKNOWN, 12),
    AC_HEATER(1, C23419av.AC_HEATING, 12),
    AC_UNIT(2, C23419av.AC_UNIT, 12),
    AIR_FRESHENER(3, C23419av.AIR_FRESHENER, 12),
    AIR_PURIFIER(4, C23419av.AIR_PURIFIER, 12),
    COFFEE_MAKER(5, C23419av.COFFEE_MAKER, 12),
    DEHUMIDIFIER(6, C23419av.DEHUMIDIFIER, 12),
    DISPLAY(7, C23419av.DISPLAY, 12),
    FAN(8, C23419av.FAN, 12),
    HOOD(10, C23419av.HOOD, 12),
    HUMIDIFIER(11, C23419av.HUMIDIFIER, 12),
    KETTLE(12, C23419av.KETTLE, 12),
    LIGHT(13, C23419av.LIGHT, 12),
    MICROWAVE(14, C23419av.MICROWAVE, 12),
    OUTLET(15, C23419av.OUTLET, 12),
    RADIATOR(16, C23419av.RADIATOR, 12),
    REMOTE_CONTROL(17, C23419av.REMOTE_CONTROL, 12),
    SET_TOP(18, C23419av.SET_TOP, 12),
    STANDMIXER(19, C23419av.STANDMIXER, 12),
    STYLER(20, C23419av.STYLER, 12),
    SWITCH(21, C23419av.SWITCH, 12),
    TV(22, C23419av.TV, 12),
    WATER_HEATER(23, C23419av.WATERHEATER, 12),
    DISHWASHER(24, C23419av.DISHWASHER, 12),
    DRYER(25, C23419av.DRYER, 12),
    MOP(26, C23419av.MOP, 12),
    MOWER(27, C23419av.MOWER, 12),
    MULTICOOKER(28, C23419av.MULTICOOKER, 12),
    SHOWER(29, C23419av.SHOWER, 12),
    SPRINKLER(30, C23419av.SPRINKLER, 12),
    WASHER(31, C23419av.WASHER, 12),
    VACUUM(32, C23419av.VACUUM, 12),
    AWNING(33, C23419av.AWNING, 12),
    BLINDS(34, C23419av.BLINDS, 12),
    CLOSET(35, C23419av.CLOSET, 12),
    CURTAIN(36, C23419av.CURTAIN, 12),
    DOOR(37, C23419av.DOOR, 12),
    DRAWER(38, C23419av.DRAWER, 12),
    GARAGE(39, C23419av.GARAGE, 12),
    GATE(40, C23419av.GATE, 12),
    PERGOLA(41, C23419av.PERGOLA, 12),
    SHUTTER(42, C23419av.SHUTTER, 12),
    WINDOW(43, C23419av.WINDOW, 12),
    VALVE(44, C23419av.VALVE, 12),
    LOCK(45, C23419av.LOCK, 12),
    SECURITY_SYSTEM(46, C23419av.SECURITY_SYSTEM, 12),
    HEATER(47, C23419av.HEATER, 12),
    REFRIGERATOR(48, C23419av.REFRIGERATOR, 12),
    THERMOSTAT(49, C23419av.THERMOSTAT, 12),
    CAMERA(50, C23419av.CAMERA, 12),
    DOORBELL(51, C23419av.DOORBELL, 12),
    ROUTINE(52, C23419av.ROUTINE, 12),
    ERROR(999, (int) null, 14),
    GENERIC_ON_OFF(-1, (int) null, 14),
    GENERIC_START_STOP(-2, (int) null, 14),
    GENERIC_OPEN_CLOSE(-3, (int) null, 14),
    GENERIC_LOCK_UNLOCK(-4, (int) null, 14),
    GENERIC_ARM_DISARM(-5, (int) null, 14),
    GENERIC_TEMP_SETTING(-6, (int) null, 14),
    GENERIC_VIEWSTREAM(-7, (int) null, 14),
    AIRCOOLER(r0.f65090bS, C23419av.AIRCOOLER, 12),
    ALARM(r0.f65090bS, C23419av.ALARM, 12),
    AUTO(r0.f65090bS, C23419av.AUTO, 12),
    AVR(r0.f65090bS, C23419av.AVR, 12),
    BAG(r0.f65090bS, C23419av.BAG, 12),
    BATHTUB(r0.f65090bS, C23419av.BATHTUB, 12),
    BATTERY(r0.f65090bS, C23419av.BATTERY, 12),
    BED(r0.f65090bS, C23419av.BED, 12),
    BIKE(r0.f65090bS, C23419av.BIKE, 12),
    BLANKET(r0.f65090bS, C23419av.BLANKET, 12),
    BLENDER(r0.f65090bS, C23419av.BLENDER, 12),
    BOILER(r0.f65090bS, C23419av.BOILER, 12),
    CARBON_MONOXIDE_DETECTOR(r0.f65090bS, C23419av.CARBON_MONOXIDE_DETECTOR, 12),
    CAT(r0.f65090bS, C23419av.CAT, 12),
    CHARGER(r0.f65090bS, C23419av.CHARGER, 12),
    CLOCK(r0.f65090bS, C23419av.CLOCK, 12),
    CLOCKRADIO(r0.f65090bS, C23419av.CLOCKRADIO, 12),
    CLOTHING(r0.f65090bS, C23419av.CLOTHING, 12),
    COMPUTER(r0.f65090bS, C23419av.COMPUTER, 12),
    COOKTOP(r0.f65090bS, C23419av.COOKTOP, 12),
    DEHYDRATOR(r0.f65090bS, C23419av.DEHYDRATOR, 12),
    DOCK(r0.f65090bS, C23419av.DOCK, 12),
    DOG(r0.f65090bS, C23419av.DOG, 12),
    ELEVATOR(r0.f65090bS, C23419av.ELEVATOR, 12),
    FAUCET(r0.f65090bS, C23419av.FAUCET, 12),
    FILTER(r0.f65090bS, C23419av.FILTER, 12),
    FIREPLACE(r0.f65090bS, C23419av.FIREPLACE, 12),
    FREEZER(r0.f65090bS, C23419av.FREEZER, 12),
    FRYER(r0.f65090bS, C23419av.FRYER, 12),
    GAME_CONSOLE(r0.f65090bS, C23419av.GAME_CONSOLE, 12),
    GARDEN(r0.f65090bS, C23419av.GARDEN, 12),
    GOOGLE_HOME(r0.f65090bS, C23419av.GOOGLE_HOME, 12),
    GRILL(r0.f65090bS, C23419av.GRILL, 12),
    HEADPHONES(r0.f65090bS, C23419av.HEADPHONES, 12),
    IDBADGE(r0.f65090bS, C23419av.IDBADGE, 12),
    INTERCOM(r0.f65090bS, C23419av.INTERCOM, 12),
    KEYS(r0.f65090bS, C23419av.KEYS, 12),
    LAPTOP(r0.f65090bS, C23419av.LAPTOP, 12),
    LOCATORTAG(r0.f65090bS, C23419av.LOCATORTAG, 12),
    MAILBOX(r0.f65090bS, C23419av.MAILBOX, 12),
    MICROPHONE(r0.f65090bS, C23419av.MICROPHONE, 12),
    NETWORK(r0.f65090bS, C23419av.NETWORK, 12),
    NOTEBOOK(r0.f65090bS, C23419av.NOTEBOOK, 12),
    OVEN(r0.f65090bS, C23419av.OVEN, 12),
    PASSPORT(r0.f65090bS, C23419av.PASSPORT, 12),
    PETFEEDER(r0.f65090bS, C23419av.PETFEEDER, 12),
    PHONE(r0.f65090bS, C23419av.PHONE, 12),
    PICTURE(r0.f65090bS, C23419av.PICTURE, 12),
    PRESSURECOOKER(r0.f65090bS, C23419av.PRESSURECOOKER, 12),
    ROBOT(r0.f65090bS, C23419av.ROBOT, 12),
    ROOF(r0.f65090bS, C23419av.ROOF, 12),
    ROUTER(r0.f65090bS, C23419av.ROUTER, 12),
    SCENE(r0.f65090bS, C23419av.SCENE, 12),
    SCREEN(r0.f65090bS, C23419av.SCREEN, 12),
    SENSOR(r0.f65090bS, C23419av.SENSOR, 12),
    SMOKE_DETECTOR(r0.f65090bS, C23419av.SMOKE_DETECTOR, 12),
    SOUNDBAR(r0.f65090bS, C23419av.SOUNDBAR, 12),
    SOUSVIDE(r0.f65090bS, C23419av.SOUSVIDE, 12),
    SPEAKER(r0.f65090bS, C23419av.SPEAKER, 12),
    SPEAKER_GROUP(r0.f65090bS, C23419av.SPEAKER_GROUP, 12),
    SPEAKER_PAIR(r0.f65090bS, C23419av.SPEAKER_PAIR, 12),
    STREAMING_BOX(r0.f65090bS, C23419av.STREAMING_BOX, 12),
    STREAMING_SOUNDBAR(r0.f65090bS, C23419av.STREAMING_SOUNDBAR, 12),
    STREAMING_STICK(r0.f65090bS, C23419av.STREAMING_STICK, 12),
    SYNCBOX(r0.f65090bS, C23419av.SYNCBOX, 12),
    TABLET(r0.f65090bS, C23419av.TABLET, 12),
    TOILET(r0.f65090bS, C23419av.TOILET, 12),
    UMBRELLA(r0.f65090bS, C23419av.UMBRELLA, 12),
    VENTILATOR(r0.f65090bS, C23419av.VENTILATOR, 12),
    WALLET(r0.f65090bS, C23419av.WALLET, 12),
    WATERPURIFIER(r0.f65090bS, C23419av.WATERPURIFIER, 12),
    WATERSOFTENER(r0.f65090bS, C23419av.WATERSOFTENER, 12),
    WEATHERSTATION(r0.f65090bS, C23419av.WEATHERSTATION, 12),
    WINECELLER(r0.f65090bS, C23419av.WINECELLER, 12),
    YOGURTMAKER(r0.f65090bS, C23419av.YOGURTMAKER, 12),
    LIGHT_GROUP(r13.f65090bS, r13.f65087bO, R.string.light_group_accessibility_name, false),
    VENTO(r13.f65090bS, r13.f65087bO, R.string.vento_accessibility_name, false),
    ROUTINE_AWAY(r7.f65090bS, r7.f65087bO, 4),
    ROUTINE_DEVICE(r7.f65090bS, r7.f65087bO, 4),
    ROUTINE_HOME(r7.f65090bS, r7.f65087bO, 4),
    ROUTINE_SCHEDULE(r7.f65090bS, r7.f65087bO, 4),
    ROUTINE_SENSOR(r7.f65090bS, r7.f65087bO, 4),
    ROUTINE_SOLAR(r7.f65090bS, r7.f65087bO, 4),
    ROUTINE_VUI(r7.f65090bS, r7.f65087bO, 4);
    

    /* renamed from: bO */
    public final C23419av f65087bO;

    /* renamed from: bP */
    public final boolean f65088bP;

    /* renamed from: bQ */
    public final int f65089bQ;

    /* renamed from: bS */
    private final int f65090bS;

    /* renamed from: bT */
    private final int f65091bT;

    private C23741p(int i, C23419av avVar, int i2, boolean z) {
        this.f65090bS = i;
        this.f65087bO = avVar;
        this.f65091bT = i2;
        this.f65088bP = z;
        this.f65089bQ = ordinal();
    }

    /* renamed from: a */
    public final int mo29093a() {
        return this.f65089bQ;
    }

    /* renamed from: b */
    public final String mo29094b(Resources resources) {
        C69664n.m101061g(resources, "resources");
        int i = this.f65091bT;
        if (i == 0) {
            C23419av avVar = this.f65087bO;
            C69664n.m101061g(resources, "resources");
            int i2 = avVar.f64136by;
            if (i2 == 0) {
                return BuildConfig.FLAVOR;
            }
            String string = resources.getString(i2);
            C69664n.m101060f(string, "{\n      resources.getStr…ssibilityNameResId)\n    }");
            return string;
        }
        String string2 = resources.getString(i);
        C69664n.m101060f(string2, "{\n      resources.getStr…verriddenNameResId)\n    }");
        return string2;
    }
}
