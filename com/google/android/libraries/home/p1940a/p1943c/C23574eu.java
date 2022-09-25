package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5463a.C69505av;

/* renamed from: com.google.android.libraries.home.a.c.eu */
/* compiled from: PG */
public enum C23574eu {
    UNKNOWN(BuildConfig.FLAVOR),
    EXPLORATIVE("action.devices.traits.Explorative"),
    ON_OFF("action.devices.traits.OnOff"),
    BRIGHTNESS("action.devices.traits.Brightness"),
    COLOR_SETTING("action.devices.traits.ColorSetting"),
    COLOR_TEMPERATURE("action.devices.traits.ColorTemperature"),
    COLOR_SPECTRUM("action.devices.traits.ColorSpectrum"),
    COMMUNICATION_VIDEO_CALL("action.devices.traits.CommunicationVideoCall"),
    SCENE("action.devices.traits.Scene"),
    TEMPERATURE_SETTING("action.devices.traits.TemperatureSetting"),
    DOCK("action.devices.traits.Dock"),
    MODES("action.devices.traits.Modes"),
    START_STOP("action.devices.traits.StartStop"),
    TOGGLES("action.devices.traits.Toggles"),
    RUN_CYCLE("action.devices.traits.RunCycle"),
    CAMERA_STREAM("action.devices.traits.CameraStream"),
    LOCK_UNLOCK("action.devices.traits.LockUnlock"),
    FAN_SPEED("action.devices.traits.FanSpeed"),
    TEMPERATURE_CONTROL("action.devices.traits.TemperatureControl"),
    OPEN_CLOSE("action.devices.traits.OpenClose"),
    ARM_DISARM("action.devices.traits.ArmDisarm"),
    CAMERA_CLIP("action.devices.traits.CameraClip"),
    SCREEN_BRIGHTNESS("action.devices.traits.ScreenBrightness"),
    SCREEN_ON_OFF("action.devices.traits.ScreenOnOff"),
    SENSOR("action.devices.traits.Sensor"),
    OBJECT_DETECTION("action.devices.traits.ObjectDetection"),
    STATUS_REPORT("action.devices.traits.StatusReport"),
    LOCATOR("action.devices.traits.Locator"),
    ASSISTANT("action.devices.traits.Assistant"),
    MEDIA_INITIATION("action.devices.traits.MediaInitiation"),
    TRANSPORT_CONTROL("action.devices.traits.TransportControl"),
    UP_DOWN("action.devices.traits.UpDown"),
    SCHEDULE("action.devices.traits.Schedule"),
    CAST("action.devices.traits.Cast"),
    MEDIA_TAGGING("action.devices.traits.MediaTagging"),
    VOLUME_CONTROL("action.devices.traits.Volume"),
    INPUT_SELECTOR("action.devices.traits.InputSelector"),
    SENSOR_STATE("action.devices.traits.SensorState"),
    TIMER("action.devices.traits.Timer"),
    APP_SELECTOR("action.devices.traits.AppSelector"),
    ROTATE("action.devices.traits.Rotate"),
    CHANNEL("action.devices.traits.Channel"),
    RECORD("action.devices.traits.Record"),
    MEDIA_STATE("action.devices.traits.MediaState"),
    DEVICE_LINKS("action.devices.traits.DeviceLinks"),
    CHARGING("action.devices.traits.Charging"),
    BEACONING("action.devices.traits.Beaconing"),
    SOFTWARE_UPDATE("action.devices.traits.SoftwareUpdate"),
    PRESET_MESSAGE("action.devices.traits.PresetMessage"),
    LIGHT_EFFECTS("action.devices.traits.LightEffects"),
    PARTNER_DEVICE_ID("action.devices.traits.PartnerDeviceId"),
    GEOFENCE("action.devices.traits.Geofence"),
    MOUNT("action.devices.traits.Mount"),
    ENTITLEMENT("action.devices.traits.Entitlement"),
    SETUP("action.devices.traits.Setup"),
    REMOTE_CONTROL("action.devices.traits.RemoteControl"),
    ENERGY_PROGRAMS("action.devices.traits.EnergyPrograms"),
    DYNAMIC_LOCATION("action.devices.traits.DynamicLocation"),
    OCCUPANCY_SENSING("action.devices.traits.OccupancySensing"),
    HUMIDITY_SETTING("action.devices.traits.HumiditySetting"),
    POWER_DETECTION("action.devices.traits.PowerDetection"),
    MOTION_DETECTION("action.devices.traits.MotionDetection"),
    MIGRATION("action.devices.traits.Migration"),
    DEVICE_STATUS("internal.action.devices.traits.deviceStatus"),
    NETWORK_OVERVIEW("internal.action.devices.traits.networkOverview"),
    Q_TIME("internal.action.devices.traits.QuietTime"),
    AUDIO_SETTINGS("internal.action.devices.traits.AudioSettings"),
    TIMELINE("internal.action.devices.traits.Timeline"),
    THERMAL("internal.action.devices.traits.Thermal");
    

    /* renamed from: a */
    public static final Map f64530a = null;

    /* renamed from: as */
    public final String f64575as;

    static {
        int i;
        int b = C69505av.m100860b(r1);
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (C23574eu euVar : values()) {
            linkedHashMap.put(euVar.f64575as, euVar);
        }
        f64530a = linkedHashMap;
    }

    private C23574eu(String str) {
        this.f64575as = str;
    }
}
