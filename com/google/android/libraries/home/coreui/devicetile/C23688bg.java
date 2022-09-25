package com.google.android.libraries.home.coreui.devicetile;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.C23741p;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23649k;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bg */
/* compiled from: PG */
public final class C23688bg {

    /* renamed from: a */
    public static final Map f64794a;

    /* renamed from: b */
    public static final Map f64795b;

    /* renamed from: c */
    private static final int f64796c;

    /* renamed from: d */
    private static final C23763y f64797d;

    /* renamed from: e */
    private static final C23763y f64798e;

    /* renamed from: f */
    private static final C23763y f64799f;

    /* renamed from: g */
    private static final C23763y f64800g;

    /* renamed from: h */
    private static final C23763y f64801h;

    static {
        int i = C23741p.THERMOSTAT.f65089bQ * 1000;
        f64796c = i;
        C23763y yVar = new C23763y(R.attr.control_light_foreground, R.attr.control_enabled_light_background, R.attr.control_enabled_light_secondary_background);
        f64797d = yVar;
        C23763y yVar2 = new C23763y(R.attr.control_automation_foreground, R.attr.control_enabled_automation_background, 0, 0, 28);
        f64798e = yVar2;
        C23763y yVar3 = new C23763y(R.attr.control_inactive_foreground, R.attr.control_inactive_background, R.attr.control_inactive_title_color, R.attr.control_inactive_subtitle_color, 4);
        f64799f = yVar3;
        C23763y yVar4 = new C23763y(R.attr.control_heat_stateful_foreground, R.attr.control_enabled_heat_background, R.attr.control_enabled_heat_title_color, R.attr.control_enabled_heat_subtitle_color, 4);
        f64800g = yVar4;
        C23763y yVar5 = new C23763y(R.attr.control_cool_stateful_foreground, R.attr.control_enabled_cool_background, R.attr.control_enabled_cool_title_color, R.attr.control_enabled_cool_subtitle_color, 4);
        f64801h = yVar5;
        f64794a = C69505av.m100859a(C69505av.m100867i(new C69685i(Integer.valueOf(C23649k.OFF.f64685o + i), yVar3), new C69685i(Integer.valueOf(C23649k.HEAT.f64685o + i), yVar4), new C69685i(Integer.valueOf(C23649k.COOL.f64685o + i), yVar5), new C69685i(Integer.valueOf(C23741p.LIGHT.f65089bQ), yVar), new C69685i(Integer.valueOf(C23741p.LIGHT_GROUP.f65089bQ), yVar), new C69685i(Integer.valueOf(C23741p.ROUTINE.f65089bQ), yVar2), new C69685i(Integer.valueOf(C23741p.ROUTINE_AWAY.f65089bQ), yVar2), new C69685i(Integer.valueOf(C23741p.ROUTINE_DEVICE.f65089bQ), yVar2), new C69685i(Integer.valueOf(C23741p.ROUTINE_HOME.f65089bQ), yVar2), new C69685i(Integer.valueOf(C23741p.ROUTINE_SCHEDULE.f65089bQ), yVar2), new C69685i(Integer.valueOf(C23741p.ROUTINE_SENSOR.f65089bQ), yVar2), new C69685i(Integer.valueOf(C23741p.ROUTINE_SOLAR.f65089bQ), yVar2), new C69685i(Integer.valueOf(C23741p.ROUTINE_VUI.f65089bQ), yVar2)), C23686be.f64792a);
        Integer valueOf = Integer.valueOf(C23649k.OFF.f64685o + i);
        Integer valueOf2 = Integer.valueOf(R.drawable.nest_outline_thermostat_vd_theme_24);
        Integer valueOf3 = Integer.valueOf(C23649k.HEAT.f64685o + i);
        Integer valueOf4 = Integer.valueOf(R.drawable.ic_device_thermostat);
        Integer valueOf5 = Integer.valueOf(C23741p.AIR_FRESHENER.f65089bQ);
        Integer valueOf6 = Integer.valueOf(R.drawable.ic_device_air_freshener);
        Integer valueOf7 = Integer.valueOf(C23741p.AVR.f65089bQ);
        Integer valueOf8 = Integer.valueOf(R.drawable.ic_device_set_top);
        Integer valueOf9 = Integer.valueOf(C23741p.AWNING.f65089bQ);
        Integer valueOf10 = Integer.valueOf(R.drawable.ic_device_pergola);
        Integer valueOf11 = Integer.valueOf(C23741p.BLINDS.f65089bQ);
        Integer valueOf12 = Integer.valueOf(R.drawable.ic_device_blinds);
        Integer valueOf13 = Integer.valueOf(C23741p.BOILER.f65089bQ);
        Integer valueOf14 = Integer.valueOf(R.drawable.ic_device_water_heater);
        Integer valueOf15 = Integer.valueOf(C23741p.CAT.f65089bQ);
        Integer valueOf16 = Integer.valueOf(R.drawable.ic_device_pets);
        Integer valueOf17 = Integer.valueOf(C23741p.CLOCK.f65089bQ);
        Integer valueOf18 = Integer.valueOf(R.drawable.ic_device_clock);
        Integer valueOf19 = Integer.valueOf(C23741p.CLOSET.f65089bQ);
        Integer valueOf20 = Integer.valueOf(R.drawable.ic_device_drawer);
        Integer valueOf21 = Integer.valueOf(C23741p.CLOTHING.f65089bQ);
        Integer valueOf22 = Integer.valueOf(R.drawable.ic_device_styler);
        Integer valueOf23 = Integer.valueOf(C23741p.COFFEE_MAKER.f65089bQ);
        Integer valueOf24 = Integer.valueOf(R.drawable.ic_device_kettle);
        Integer valueOf25 = Integer.valueOf(C23741p.COMPUTER.f65089bQ);
        Integer valueOf26 = Integer.valueOf(R.drawable.ic_device_computer);
        Integer valueOf27 = Integer.valueOf(C23741p.COOKTOP.f65089bQ);
        Integer valueOf28 = Integer.valueOf(R.drawable.ic_device_cooking);
        Integer valueOf29 = Integer.valueOf(C23741p.DRYER.f65089bQ);
        Integer valueOf30 = Integer.valueOf(R.drawable.ic_device_washer);
        Integer valueOf31 = Integer.valueOf(C23741p.FREEZER.f65089bQ);
        Integer valueOf32 = Integer.valueOf(R.drawable.ic_device_refrigerator);
        Integer valueOf33 = Integer.valueOf(C23741p.MICROPHONE.f65089bQ);
        Integer valueOf34 = Integer.valueOf(R.drawable.ic_device_mic);
        Integer valueOf35 = Integer.valueOf(C23741p.MULTICOOKER.f65089bQ);
        Integer valueOf36 = Integer.valueOf(R.drawable.ic_device_multicooker);
        Integer valueOf37 = Integer.valueOf(C23741p.NETWORK.f65089bQ);
        Integer valueOf38 = Integer.valueOf(R.drawable.ic_device_router);
        Integer valueOf39 = Integer.valueOf(C23741p.SHOWER.f65089bQ);
        Integer valueOf40 = Integer.valueOf(R.drawable.ic_device_water);
        Integer valueOf41 = Integer.valueOf(C23741p.SHUTTER.f65089bQ);
        Integer valueOf42 = Integer.valueOf(R.drawable.ic_device_window);
        Integer valueOf43 = Integer.valueOf(C23741p.SOUNDBAR.f65089bQ);
        Integer valueOf44 = Integer.valueOf(R.drawable.ic_device_speaker);
        Integer valueOf45 = Integer.valueOf(C23741p.SPEAKER_GROUP.f65089bQ);
        Integer valueOf46 = Integer.valueOf(R.drawable.ic_device_speaker_group);
        f64795b = C69505av.m100859a(C69505av.m100867i(new C69685i(valueOf, valueOf2), new C69685i(valueOf3, valueOf4), new C69685i(Integer.valueOf(C23649k.COOL.f64685o + i), valueOf4), new C69685i(Integer.valueOf(C23649k.HEAT_COOL.f64685o + i), valueOf4), new C69685i(Integer.valueOf(i + C23649k.ECO.f64685o), valueOf2), new C69685i(Integer.valueOf(C23741p.AC_HEATER.f65089bQ), valueOf4), new C69685i(Integer.valueOf(C23741p.AC_UNIT.f65089bQ), valueOf4), new C69685i(Integer.valueOf(C23741p.AIRCOOLER.f65089bQ), valueOf4), new C69685i(valueOf5, valueOf6), new C69685i(Integer.valueOf(C23741p.AIR_PURIFIER.f65089bQ), Integer.valueOf(R.drawable.ic_device_air_purifier)), new C69685i(Integer.valueOf(C23741p.ALARM.f65089bQ), Integer.valueOf(R.drawable.ic_device_security)), new C69685i(Integer.valueOf(C23741p.AUTO.f65089bQ), Integer.valueOf(R.drawable.ic_device_transportation)), new C69685i(valueOf7, valueOf8), new C69685i(valueOf9, valueOf10), new C69685i(Integer.valueOf(C23741p.BAG.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_shopping_bag_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.BATHTUB.f65089bQ), Integer.valueOf(R.drawable.ic_device_bathtub)), new C69685i(Integer.valueOf(C23741p.BATTERY.f65089bQ), Integer.valueOf(R.drawable.ic_device_battery)), new C69685i(Integer.valueOf(C23741p.BED.f65089bQ), Integer.valueOf(R.drawable.ic_device_bed)), new C69685i(Integer.valueOf(C23741p.BIKE.f65089bQ), Integer.valueOf(R.drawable.ic_device_bike)), new C69685i(Integer.valueOf(C23741p.BLENDER.f65089bQ), Integer.valueOf(R.drawable.ic_device_blender)), new C69685i(valueOf11, valueOf12), new C69685i(valueOf13, valueOf14), new C69685i(Integer.valueOf(C23741p.CAMERA.f65089bQ), Integer.valueOf(R.drawable.ic_device_camera)), new C69685i(Integer.valueOf(C23741p.CARBON_MONOXIDE_DETECTOR.f65089bQ), Integer.valueOf(R.drawable.ic_device_co_detector)), new C69685i(valueOf15, valueOf16), new C69685i(Integer.valueOf(C23741p.CHARGER.f65089bQ), Integer.valueOf(R.drawable.ic_device_charger)), new C69685i(valueOf17, valueOf18), new C69685i(Integer.valueOf(C23741p.CLOCKRADIO.f65089bQ), valueOf18), new C69685i(valueOf19, valueOf20), new C69685i(valueOf21, valueOf22), new C69685i(valueOf23, valueOf24), new C69685i(valueOf25, valueOf26), new C69685i(valueOf27, valueOf28), new C69685i(Integer.valueOf(C23741p.CURTAIN.f65089bQ), valueOf12), new C69685i(Integer.valueOf(C23741p.DEHUMIDIFIER.f65089bQ), valueOf6), new C69685i(Integer.valueOf(C23741p.DEHYDRATOR.f65089bQ), valueOf28), new C69685i(Integer.valueOf(C23741p.DISHWASHER.f65089bQ), Integer.valueOf(R.drawable.ic_device_dishwasher)), new C69685i(Integer.valueOf(C23741p.DISPLAY.f65089bQ), Integer.valueOf(R.drawable.ic_device_display)), new C69685i(Integer.valueOf(C23741p.DOCK.f65089bQ), Integer.valueOf(R.drawable.ic_device_dock)), new C69685i(Integer.valueOf(C23741p.DOG.f65089bQ), valueOf16), new C69685i(Integer.valueOf(C23741p.DOOR.f65089bQ), Integer.valueOf(R.drawable.ic_device_door)), new C69685i(Integer.valueOf(C23741p.DOORBELL.f65089bQ), Integer.valueOf(R.drawable.ic_device_doorbell)), new C69685i(Integer.valueOf(C23741p.DRAWER.f65089bQ), valueOf20), new C69685i(valueOf29, valueOf30), new C69685i(Integer.valueOf(C23741p.ERROR.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_error_outline_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.FAN.f65089bQ), Integer.valueOf(R.drawable.ic_device_fan)), new C69685i(Integer.valueOf(C23741p.FAUCET.f65089bQ), Integer.valueOf(R.drawable.ic_device_faucet)), new C69685i(Integer.valueOf(C23741p.FILTER.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_hvac_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.FIREPLACE.f65089bQ), Integer.valueOf(R.drawable.ic_device_fireplace)), new C69685i(valueOf31, valueOf32), new C69685i(Integer.valueOf(C23741p.FRYER.f65089bQ), valueOf28), new C69685i(Integer.valueOf(C23741p.GAME_CONSOLE.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_stadia_controller_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.GARAGE.f65089bQ), Integer.valueOf(R.drawable.ic_device_garage)), new C69685i(Integer.valueOf(C23741p.GARDEN.f65089bQ), Integer.valueOf(R.drawable.ic_device_garden)), new C69685i(Integer.valueOf(C23741p.GATE.f65089bQ), Integer.valueOf(R.drawable.ic_device_gate)), new C69685i(Integer.valueOf(C23741p.GRILL.f65089bQ), valueOf28), new C69685i(Integer.valueOf(C23741p.HEADPHONES.f65089bQ), Integer.valueOf(R.drawable.ic_device_headphones)), new C69685i(Integer.valueOf(C23741p.HEATER.f65089bQ), valueOf4), new C69685i(Integer.valueOf(C23741p.HOOD.f65089bQ), Integer.valueOf(R.drawable.ic_device_hood)), new C69685i(Integer.valueOf(C23741p.IDBADGE.f65089bQ), Integer.valueOf(R.drawable.ic_device_badge)), new C69685i(Integer.valueOf(C23741p.INTERCOM.f65089bQ), Integer.valueOf(R.drawable.ic_device_intercom)), new C69685i(Integer.valueOf(C23741p.KETTLE.f65089bQ), valueOf24), new C69685i(Integer.valueOf(C23741p.KEYS.f65089bQ), Integer.valueOf(R.drawable.ic_device_keys)), new C69685i(Integer.valueOf(C23741p.LAPTOP.f65089bQ), valueOf26), new C69685i(Integer.valueOf(C23741p.LIGHT.f65089bQ), Integer.valueOf(R.drawable.ic_device_light)), new C69685i(Integer.valueOf(C23741p.LIGHT_GROUP.f65089bQ), Integer.valueOf(R.drawable.ic_device_light_group)), new C69685i(Integer.valueOf(C23741p.LOCATORTAG.f65089bQ), Integer.valueOf(R.drawable.ic_device_locator_tag)), new C69685i(Integer.valueOf(C23741p.LOCK.f65089bQ), Integer.valueOf(R.drawable.ic_device_lock)), new C69685i(Integer.valueOf(C23741p.MAILBOX.f65089bQ), Integer.valueOf(R.drawable.ic_device_mailbox)), new C69685i(valueOf33, valueOf34), new C69685i(Integer.valueOf(C23741p.MICROWAVE.f65089bQ), Integer.valueOf(R.drawable.ic_device_microwave)), new C69685i(Integer.valueOf(C23741p.MOP.f65089bQ), Integer.valueOf(R.drawable.ic_device_mop)), new C69685i(Integer.valueOf(C23741p.MOWER.f65089bQ), Integer.valueOf(R.drawable.ic_device_outdoor_garden)), new C69685i(valueOf35, valueOf36), new C69685i(valueOf37, valueOf38), new C69685i(Integer.valueOf(C23741p.NOTEBOOK.f65089bQ), Integer.valueOf(R.drawable.ic_device_book)), new C69685i(Integer.valueOf(C23741p.OUTLET.f65089bQ), Integer.valueOf(R.drawable.ic_device_outlet)), new C69685i(Integer.valueOf(C23741p.OVEN.f65089bQ), Integer.valueOf(R.drawable.ic_device_oven)), new C69685i(Integer.valueOf(C23741p.PASSPORT.f65089bQ), Integer.valueOf(R.drawable.ic_device_passport)), new C69685i(Integer.valueOf(C23741p.PERGOLA.f65089bQ), valueOf10), new C69685i(Integer.valueOf(C23741p.PETFEEDER.f65089bQ), valueOf16), new C69685i(Integer.valueOf(C23741p.PHONE.f65089bQ), Integer.valueOf(R.drawable.ic_device_phone)), new C69685i(Integer.valueOf(C23741p.PICTURE.f65089bQ), Integer.valueOf(R.drawable.ic_device_image)), new C69685i(Integer.valueOf(C23741p.PRESSURECOOKER.f65089bQ), valueOf36), new C69685i(Integer.valueOf(C23741p.RADIATOR.f65089bQ), valueOf4), new C69685i(Integer.valueOf(C23741p.REFRIGERATOR.f65089bQ), valueOf32), new C69685i(Integer.valueOf(C23741p.REMOTE_CONTROL.f65089bQ), Integer.valueOf(R.drawable.ic_device_remote_control)), new C69685i(Integer.valueOf(C23741p.ROBOT.f65089bQ), Integer.valueOf(R.drawable.ic_device_robot)), new C69685i(Integer.valueOf(C23741p.ROOF.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_roofing_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.ROUTER.f65089bQ), valueOf38), new C69685i(Integer.valueOf(C23741p.ROUTINE_AWAY.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_location_away_filled_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.ROUTINE_DEVICE.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_google_home_devices_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.ROUTINE_HOME.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_location_home_filled_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.ROUTINE_SCHEDULE.f65089bQ), Integer.valueOf(R.drawable.nest_fill_clock_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.ROUTINE_SENSOR.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_motion_sense_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.ROUTINE_SOLAR.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_wb_twighlight_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.ROUTINE_VUI.f65089bQ), valueOf34), new C69685i(Integer.valueOf(C23741p.SCENE.f65089bQ), Integer.valueOf(R.drawable.ic_device_scene)), new C69685i(Integer.valueOf(C23741p.SECURITY_SYSTEM.f65089bQ), Integer.valueOf(R.drawable.ic_device_security_system)), new C69685i(Integer.valueOf(C23741p.SENSOR.f65089bQ), Integer.valueOf(R.drawable.ic_device_sensor)), new C69685i(Integer.valueOf(C23741p.SET_TOP.f65089bQ), valueOf8), new C69685i(valueOf39, valueOf40), new C69685i(valueOf41, valueOf42), new C69685i(Integer.valueOf(C23741p.SMOKE_DETECTOR.f65089bQ), Integer.valueOf(R.drawable.ic_device_smoke_detector)), new C69685i(valueOf43, valueOf44), new C69685i(Integer.valueOf(C23741p.SOUSVIDE.f65089bQ), valueOf28), new C69685i(Integer.valueOf(C23741p.SPEAKER.f65089bQ), valueOf44), new C69685i(valueOf45, valueOf46), new C69685i(Integer.valueOf(C23741p.SPEAKER_PAIR.f65089bQ), valueOf46), new C69685i(Integer.valueOf(C23741p.SPRINKLER.f65089bQ), Integer.valueOf(R.drawable.ic_device_sprinkler)), new C69685i(Integer.valueOf(C23741p.STANDMIXER.f65089bQ), valueOf28), new C69685i(Integer.valueOf(C23741p.STREAMING_BOX.f65089bQ), valueOf8), new C69685i(Integer.valueOf(C23741p.STREAMING_SOUNDBAR.f65089bQ), valueOf44), new C69685i(Integer.valueOf(C23741p.STREAMING_STICK.f65089bQ), valueOf8), new C69685i(Integer.valueOf(C23741p.STYLER.f65089bQ), valueOf22), new C69685i(Integer.valueOf(C23741p.SWITCH.f65089bQ), Integer.valueOf(R.drawable.ic_device_switch)), new C69685i(Integer.valueOf(C23741p.SYNCBOX.f65089bQ), valueOf8), new C69685i(Integer.valueOf(C23741p.TABLET.f65089bQ), Integer.valueOf(R.drawable.ic_device_tablet)), new C69685i(Integer.valueOf(C23741p.THERMOSTAT.f65089bQ), valueOf4), new C69685i(Integer.valueOf(C23741p.TOILET.f65089bQ), valueOf40), new C69685i(Integer.valueOf(C23741p.TV.f65089bQ), Integer.valueOf(R.drawable.ic_device_tv)), new C69685i(Integer.valueOf(C23741p.UMBRELLA.f65089bQ), Integer.valueOf(R.drawable.ic_device_umbrella)), new C69685i(Integer.valueOf(C23741p.VACUUM.f65089bQ), Integer.valueOf(R.drawable.ic_device_vacuum)), new C69685i(Integer.valueOf(C23741p.VALVE.f65089bQ), Integer.valueOf(R.drawable.ic_device_valve)), new C69685i(Integer.valueOf(C23741p.VENTILATOR.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_medical_services_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.VENTO.f65089bQ), Integer.valueOf(R.drawable.ic_device_vento)), new C69685i(Integer.valueOf(C23741p.WALLET.f65089bQ), Integer.valueOf(R.drawable.ic_device_wallet)), new C69685i(Integer.valueOf(C23741p.WASHER.f65089bQ), valueOf30), new C69685i(Integer.valueOf(C23741p.WATERPURIFIER.f65089bQ), valueOf40), new C69685i(Integer.valueOf(C23741p.WATERSOFTENER.f65089bQ), valueOf40), new C69685i(Integer.valueOf(C23741p.WATER_HEATER.f65089bQ), valueOf14), new C69685i(Integer.valueOf(C23741p.WEATHERSTATION.f65089bQ), Integer.valueOf(R.drawable.ic_device_weatherstation)), new C69685i(Integer.valueOf(C23741p.WINDOW.f65089bQ), valueOf42), new C69685i(Integer.valueOf(C23741p.WINECELLER.f65089bQ), Integer.valueOf(R.drawable.quantum_gm_ic_wine_bar_vd_theme_24)), new C69685i(Integer.valueOf(C23741p.YOGURTMAKER.f65089bQ), valueOf28)), C23687bf.f64793a);
    }
}
