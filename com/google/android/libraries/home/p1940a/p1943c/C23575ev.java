package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5463a.C69505av;

/* renamed from: com.google.android.libraries.home.a.c.ev */
/* compiled from: PG */
public enum C23575ev {
    UNKNOWN(BuildConfig.FLAVOR),
    PIN_NEEDED("pinNeeded"),
    ACK_NEEDED("ackNeeded"),
    CHALLENGE_FAILED_PIN_NEEDED("challengeFailedPinNeeded"),
    CHALLENGE_FAILED_NOT_SETUP("challengeFailedNotSetup"),
    TEMPERATURE_HOLD_ACTIVE("temperatureHoldActive"),
    AUTO_ECO_MODE_ACTIVE("autoEcoModeActive"),
    ENERGY_PROGRAM_ACTIVE("energyProgramActive"),
    EMERGENCY_HEAT_ACTIVE("emergencyHeatActive"),
    TOO_MANY_FAILED_ATTEMPTS("tooManyFailedAttempts"),
    NOT_SUPPORTED("notSupported");
    

    /* renamed from: a */
    public static final Map f64576a = null;

    /* renamed from: n */
    private final String f64589n;

    static {
        int i;
        int b = C69505av.m100860b(r1);
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (C23575ev evVar : values()) {
            linkedHashMap.put(evVar.f64589n, evVar);
        }
        f64576a = linkedHashMap;
    }

    private C23575ev(String str) {
        this.f64589n = str;
    }
}
