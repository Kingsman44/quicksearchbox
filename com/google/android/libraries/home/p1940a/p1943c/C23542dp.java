package com.google.android.libraries.home.p1940a.p1943c;

import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5463a.C69505av;

/* renamed from: com.google.android.libraries.home.a.c.dp */
/* compiled from: PG */
public enum C23542dp {
    ACCESSORY_TYPE("accessoryType", C23574eu.MOUNT),
    ACTIVE_ENERGY_PROGRAMS("activeEnergyPrograms", C23574eu.ENERGY_PROGRAMS),
    ACTIVE_MODE("activeThermostatMode", C23574eu.TEMPERATURE_SETTING),
    ACTIVITY_STATE("activityState", C23574eu.MEDIA_STATE),
    ACTOR_NAME("actorName", C23574eu.LOCK_UNLOCK),
    AMBIENT_AIR_HUMIDITY("ambientAirHumidity", C23574eu.TEMPERATURE_SETTING),
    AMBIENT_AIR_TEMPERATURE("ambientAirTemperature", C23574eu.TEMPERATURE_SETTING),
    AMBIENT_AIR_TEMPERATURE_C("ambientAirTemperatureC", C23574eu.TEMPERATURE_SETTING),
    AMBIENT_AIR_TEMPERATURE_F("ambientAirTemperatureF", C23574eu.TEMPERATURE_SETTING),
    ARM_DISARM("isArmed", C23574eu.ARM_DISARM),
    ARM_LEVEL("currentArmLevel", C23574eu.ARM_DISARM),
    MEDIA_ARTIST("artist", C23574eu.MEDIA_STATE),
    AVAILABLE_TRANSPORT_CONTROLS("availableTransportControls", C23574eu.TRANSPORT_CONTROL),
    AVAILABLE_CHANNELS("availableChannels", C23574eu.CHANNEL),
    BATTERY_REPLACEMENT_INDICATOR("batteryReplacementIndicator", C23574eu.CHARGING),
    BATTERY_SAVER("isBatterySaverEnabled", C23574eu.CHARGING),
    BEACONING_UUID("beaconUUID", C23574eu.BEACONING),
    BLOCKING_SCHEDULES("blockingSchedules", C23574eu.NETWORK_OVERVIEW),
    BRIGHTNESS("brightness", C23574eu.BRIGHTNESS),
    CAMERA_AUDIO_COMMUNICATION_TYPE("audioCommunicationType", C23574eu.CAMERA_STREAM),
    CAMERA_CLOUD_BACKEND("cameraCloudBackend", C23574eu.CAMERA_STREAM),
    CAMERA_ICE_SERVERS("iceServers", C23574eu.CAMERA_STREAM),
    CAMERA_NEST_UUID("cameraNestUuid", C23574eu.CAMERA_STREAM),
    CAMERA_NEXUS_HOST("cameraNexusHost", C23574eu.CAMERA_STREAM),
    CAMERA_OFFER("offer", C23574eu.CAMERA_STREAM),
    CAMERA_SIGNALING_URL("cameraStreamSignalingUrl", C23574eu.CAMERA_STREAM),
    CAMERA_STREAM_ACCESS_URL("cameraStreamAccessUrl", C23574eu.CAMERA_STREAM),
    CAMERA_STREAM_AUTH_TOKEN("cameraStreamAuthToken", C23574eu.CAMERA_STREAM),
    CAMERA_STREAM_AUTH_TOKEN_EXPIRATION_SEC("cameraStreamAuthTokenExpirationSec", C23574eu.CAMERA_STREAM),
    CAMERA_STREAM_AUTH_TOKEN_TYPE("cameraStreamAuthTokenType", C23574eu.CAMERA_STREAM),
    CAMERA_STREAM_HOST("streamHost", C23574eu.CAMERA_STREAM),
    CAMERA_STREAM_PROTOCOL("cameraStreamProtocol", C23574eu.CAMERA_STREAM),
    CAMERA_STREAM_PLACEHOLDER_IMAGE("cameraStreamPlaceholderImage", C23574eu.CAMERA_STREAM),
    CAMERA_STREAM_LIVE_VIEW_IMAGE("cameraStreamLiveViewImage", C23574eu.CAMERA_STREAM),
    CAMERA_STREAM_RECEIVER_APP_ID("cameraStreamReceiverAppId", C23574eu.CAMERA_STREAM),
    CAPACITY_REMAINING_PERCENTAGE("capacityRemainingPercentage", C23574eu.CHARGING),
    CAPACITY_REMAINING_SECONDS("capacityRemainingSeconds", C23574eu.CHARGING),
    CAPACITY_UNTIL_FULL_SECONDS("capacityUntilFullSeconds", C23574eu.CHARGING),
    CHALLENGE("challenge", C23574eu.DEVICE_STATUS),
    CHANNEL_CODE("channelNumber", C23574eu.CHANNEL),
    CHANNEL_NAME("channelName", C23574eu.CHANNEL),
    CHANNEL_NUMBER("channelNumber", C23574eu.CHANNEL),
    CHARGING_LIMITATIONS("chargingLimitations", C23574eu.CHARGING),
    CLICK_REMOTE_CONTROL_BUTTON("clickRemoteControlButton", C23574eu.REMOTE_CONTROL),
    CLIENT_CONTEXT_TOKEN("clientContextToken", C23574eu.CAMERA_STREAM),
    COLOR_RGB("colorRGB", C23574eu.COLOR_SETTING),
    COLOR_TEMPERATURE("colorTemperature", C23574eu.COLOR_SETTING),
    COOL_SETTING_ROUND("coolSettingRound", C23574eu.TEMPERATURE_SETTING),
    COOL_SETTING_ROUND_C("coolSettingRoundC", C23574eu.TEMPERATURE_SETTING),
    CURRENT_CYCLE("currentCycle", C23574eu.RUN_CYCLE),
    CURRENT_CYCLE_REMAINING_TIME("currentCycleRemainingTime", C23574eu.RUN_CYCLE),
    CURRENT_MODES("currentModeSetting", C23574eu.MODES),
    CURRENT_SENSOR_STATE_DATA("currentSensorStateData", C23574eu.SENSOR_STATE),
    CURRENT_TOGGLES("currentToggleSettings", C23574eu.TOGGLES),
    CURRENT_TOTAL_REMAINING_TIME("currentTotalRemainingTime", C23574eu.RUN_CYCLE),
    CURRENT_VOLUME("currentVolume", C23574eu.VOLUME_CONTROL),
    DESCRIPTIVE_CAPACITY_REMAINING("descriptiveCapacityRemaining", C23574eu.CHARGING),
    DEVICE_LINK("deviceLinkManagementAndroid", C23574eu.DEVICE_LINKS),
    DOCK("isDocked", C23574eu.DOCK),
    DOCKED_DEVICE_ID("dockedDeviceIdParameter", C23574eu.DYNAMIC_LOCATION),
    DOCKED_DEVICE_ROOM_ID("dockedDeviceRoomIdParameter", C23574eu.DYNAMIC_LOCATION),
    DOCKED_DEVICE_STRUCTURE_ID("dockedDeviceStructureIdParameter", C23574eu.DYNAMIC_LOCATION),
    ERROR("error", C23574eu.DEVICE_STATUS),
    FAMILIAR_FACES_STATE("familiarFacesState", C23574eu.ENTITLEMENT),
    HEAT_COOL_SETTING_HIGH_ROUND("heatCoolSettingHighRound", C23574eu.TEMPERATURE_SETTING),
    HEAT_COOL_SETTING_HIGH_ROUND_C("heatCoolSettingHighRoundC", C23574eu.TEMPERATURE_SETTING),
    HEAT_COOL_SETTING_LOW_ROUND("heatCoolSettingLowRound", C23574eu.TEMPERATURE_SETTING),
    HEAT_COOL_SETTING_LOW_ROUND_C("heatCoolSettingLowRoundC", C23574eu.TEMPERATURE_SETTING),
    THERMOSTAT_TEMP_SET_POINT_C("thermostatTemperatureSetpointC", C23574eu.TEMPERATURE_SETTING),
    THERMOSTAT_TEMP_SET_POINT_F("thermostatTemperatureSetpointF", C23574eu.TEMPERATURE_SETTING),
    THERMOSTAT_TEMP_SET_POINT_LOW_C("thermostatTemperatureSetpointLowC", C23574eu.TEMPERATURE_SETTING),
    THERMOSTAT_TEMP_SET_POINT_HIGH_C("thermostatTemperatureSetpointHighC", C23574eu.TEMPERATURE_SETTING),
    THERMOSTAT_TEMP_SET_POINT_LOW_F("thermostatTemperatureSetpointLowF", C23574eu.TEMPERATURE_SETTING),
    THERMOSTAT_TEMP_SET_POINT_HIGH_F("thermostatTemperatureSetpointHighF", C23574eu.TEMPERATURE_SETTING),
    HEAT_SETTING_ROUND("heatSettingRound", C23574eu.TEMPERATURE_SETTING),
    HEAT_SETTING_ROUND_C("heatSettingRoundC", C23574eu.TEMPERATURE_SETTING),
    HUMIDITY_SETPOINT_PERCENT("humiditySetpointPercent", C23574eu.HUMIDITY_SETTING),
    HUMIDITY_AMBIENT_PERCENT("humidityAmbientPercent", C23574eu.HUMIDITY_SETTING),
    CURRENT_INPUT("currentInput", C23574eu.INPUT_SELECTOR),
    CURRENTLY_RECORDING("isCurrentlyRecording", C23574eu.RECORD),
    IS_CHARGING("isCharging", C23574eu.CHARGING),
    IS_FREE_TIER("isFreeTier", C23574eu.ENTITLEMENT),
    IS_JAMMED("isJammed", C23574eu.LOCK_UNLOCK),
    IS_MUTED("isMuted", C23574eu.VOLUME_CONTROL),
    ISSUES("issues", C23574eu.NETWORK_OVERVIEW),
    LAST_SOFTWARE_UPDATE_TIMESTAMP("lastSoftwareUpdateUnixTimestampSec", C23574eu.SOFTWARE_UPDATE),
    LOCK_STATE_CHANGED_TIME("lockStateChangedTimestampInSeconds", C23574eu.LOCK_UNLOCK),
    LOCK_UNLOCK("isLocked", C23574eu.LOCK_UNLOCK),
    MEDIA_NEXT("mediaNext", C23574eu.TRANSPORT_CONTROL),
    MEDIA_PREVIOUS("mediaPrevious", C23574eu.TRANSPORT_CONTROL),
    MEDIA_STOP("mediaStop", C23574eu.TRANSPORT_CONTROL),
    MEDIA_PAUSE("mediaPause", C23574eu.TRANSPORT_CONTROL),
    MEDIA_RESUME("mediaResume", C23574eu.TRANSPORT_CONTROL),
    MEDIA_SHUFFLE("mediaShuffle", C23574eu.TRANSPORT_CONTROL),
    MEDIA_SEEK_TO_POSITION("mediaSeekToPosition", C23574eu.TRANSPORT_CONTROL),
    MEDIA_SEEK_RELATIVE("mediaSeekRelative", C23574eu.TRANSPORT_CONTROL),
    MEDIA_SET_REPEAT_MODE("mediaSetRepeatMode", C23574eu.TRANSPORT_CONTROL),
    MEDIA_SET_CAPTION_CONTROL("mediaSetCaptionControl", C23574eu.TRANSPORT_CONTROL),
    MICROPHONE_ENABLED("microphoneEnabled", C23574eu.AUDIO_SETTINGS),
    MODE("mode", C23574eu.TEMPERATURE_SETTING),
    MOUNT_STATE("mountState", C23574eu.MOUNT),
    MOUNT_TYPE("mountType", C23574eu.MOUNT),
    MUTE("mute", C23574eu.VOLUME_CONTROL),
    NEXT_CYCLE("nextCycle", C23574eu.RUN_CYCLE),
    OCCUPANCY("occupancy", C23574eu.OCCUPANCY_SENSING),
    ONLINE("online", C23574eu.DEVICE_STATUS),
    ON_OFF("onOff", C23574eu.ON_OFF),
    ON_OFF_REASON("onOffReason", C23574eu.ON_OFF),
    OPEN_CLOSE_STATE("state", C23574eu.OPEN_CLOSE),
    OPEN_DIRECTION("openDirection", C23574eu.OPEN_CLOSE),
    OPEN_PERCENT("openPercent", C23574eu.OPEN_CLOSE),
    PARTNER_DEVICE_ID("partnerDeviceId", C23574eu.PARTNER_DEVICE_ID),
    PHRASE_TYPE("phraseType", C23574eu.PRESET_MESSAGE),
    PLAYBACK_STATE("playbackState", C23574eu.MEDIA_STATE),
    PROGRESS_PERCENT("progressPercent", C23574eu.SOFTWARE_UPDATE),
    PROGRESS_STATE("progressState", C23574eu.SOFTWARE_UPDATE),
    PROXIMITY_TOKEN("proximityToken", C23574eu.LOCK_UNLOCK),
    Q_TIME_ENABLED("quietTimeEnabled", C23574eu.Q_TIME),
    Q_TIME_END_TIME("endTime", C23574eu.Q_TIME),
    RECORDING_ENABLED("recordingEnabled", C23574eu.AUDIO_SETTINGS),
    RELATIVE_CHANNEL("relativeChannel", C23574eu.CHANNEL),
    RELATIVE_VOLUME("relativeVolume", C23574eu.VOLUME_CONTROL),
    RETURN_CHANNEL("returnChannel", C23574eu.CHANNEL),
    SELECT_CHANNEL("selectChannel", C23574eu.CHANNEL),
    SPECTRUM_HSV("spectrumHsv", C23574eu.COLOR_SETTING),
    SPECTRUM_RGB("spectrumRgb", C23574eu.COLOR_SETTING),
    SOFTWARE_UPDATE_ESTIMATED_COMPLETION_DURATION("estimatedCompletionDuration", C23574eu.SOFTWARE_UPDATE),
    SOFTWARE_UPDATE_TYPE("updateType", C23574eu.SOFTWARE_UPDATE),
    SSID("ssid", C23574eu.NETWORK_OVERVIEW),
    START_STOP("startStop", C23574eu.START_STOP),
    START_STOP_ZONE("zone", C23574eu.START_STOP),
    STATIONS("stations", C23574eu.NETWORK_OVERVIEW),
    STATION_SETS("stationSets", C23574eu.NETWORK_OVERVIEW),
    STREAM_TO_CHROMECAST("streamToChromecast", C23574eu.CAMERA_STREAM),
    MEDIA_SUBTITLE("subtitle", C23574eu.MEDIA_STATE),
    SUPPORTED_STREAM_PROTOCOL("supportedStreamProtocol", C23574eu.CAMERA_STREAM),
    TEMPERATURE_K("temperatureK", C23574eu.COLOR_SETTING),
    TEMP_SETTING("tempSetting", C23574eu.TEMPERATURE_SETTING),
    THERMAL_THROTTLE_LEVEL("thermalThrottleLevel", C23574eu.THERMAL),
    TIMELINE_LENGTH("timelineLengthInSeconds", C23574eu.TIMELINE),
    MEDIA_TITLE("title", C23574eu.MEDIA_STATE),
    UNMUTE("unmute", C23574eu.VOLUME_CONTROL),
    VOLUME_PERCENTAGE("volumePercentage", C23574eu.VOLUME_CONTROL),
    WIFI_POINTS("wifiPoints", C23574eu.NETWORK_OVERVIEW),
    POWER_DETECTION_STATE("state", C23574eu.POWER_DETECTION),
    MOTION_DETECTION_TIMESTAMP("motionDetectionTimestampSeconds", C23574eu.MOTION_DETECTION),
    MOTION_DETECTION_EVENT_IN_PROGRESS("motionDetectionEventInProgress", C23574eu.MOTION_DETECTION),
    MOTION_DETECTION_LAST_EVENT_START_TIMESTAMP("lastMotionDetectionEventStartTimestampSec", C23574eu.MOTION_DETECTION),
    MOTION_DETECTION_LAST_EVENT_END_TIMESTAMP("lastMotionDetectionEventEndTimestampSec", C23574eu.MOTION_DETECTION),
    LEGACY_CAMERA_MIGRATION_ELIGIBILITY_FORWARD("legacyCameraMigrationEligibilityForward", C23574eu.MIGRATION),
    LEGACY_CAMERA_MIGRATION_ELIGIBILITY_REVERSE("legacyCameraMigrationEligibilityReverse", C23574eu.MIGRATION),
    LEGACY_CAMERA_MIGRATION_DIRECTION("legacyCameraMigrationDirection", C23574eu.MIGRATION),
    LEGACY_CAMERA_MIGRATION_STATUS("legacyCameraMigrationStatus", C23574eu.MIGRATION),
    LEGACY_CAMERA_MIGRATION_COMPLETED_TIMESTAMP("legacyCameraMigrationCompletedTimestamp", C23574eu.MIGRATION),
    LEGACY_CAMERA_MIGRATION_FAILURE_REASON("legacyCameraMigrationFailureReason", C23574eu.MIGRATION);
    

    /* renamed from: a */
    public static final Map f64323a = null;

    /* renamed from: ca */
    public final C23574eu f64454ca;

    /* renamed from: cc */
    private final String f64455cc;

    static {
        int i;
        int i2;
        int b = C69505av.m100860b(r1);
        if (b >= 16) {
            i2 = b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
        for (C23542dp dpVar : values()) {
            linkedHashMap.put(dpVar.f64455cc, dpVar);
        }
        f64323a = linkedHashMap;
    }

    private C23542dp(String str, C23574eu euVar) {
        this.f64455cc = str;
        this.f64454ca = euVar;
    }
}
