package com.google.android.apps.gsa.shared.bisto.p7029b;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.shared.bisto.b.i */
/* compiled from: PG */
public final class C89638i {

    /* renamed from: a */
    public static final C58495hd f242713a;

    /* renamed from: b */
    public static final C58495hd f242714b = C58495hd.m89900n("bistoSpeechTestingMode", new C89633d("Speech Testing Mode", "Enables client-side logging of events and data related to speech events."));

    /* renamed from: c */
    public static final C58495hd f242715c = C58495hd.m89901o("disableEncryption", new C89633d("Disable encryption", "Turns off encryption for GACS devices"), "logControlData", new C89633d("Log control data", "Enables client side logging of control data including speech transcription and Assistant responses"));

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("bistoPii", new C89633d("Enable PII Logging", "Should only be enabled when reproducing a bug for a bug or feedback report."));
        gzVar.mo55429h("bistoRecordAudio", new C89633d("Locally Record Audio", "Record audio from device onto your phone."));
        gzVar.mo55429h("bistoDeeperSocketLogging", new C89633d("Verbose socket logging", "data send to and from Herbie will be logged."));
        gzVar.mo55429h("enableLegacyLedControl", new C89633d("Enable legacy LED control", "legacy led animation & color will be shown"));
        gzVar.mo55429h("bistoVibrate", new C89633d("Enable vibrate on hotword", "phone will vibrate when hotword detected"));
        gzVar.mo55429h("ledUsage", new C89633d("Disable use of LEDs", "will turn off LEDs completely"));
        gzVar.mo55429h("otaProgressNotification", new C89633d("Show firmware update progress", "Show notification with firmware upload progress"));
        gzVar.mo55429h("enableForceSpeakerIdOff", new C89633d("Force SpeakerIDEnrollment off", "Forces the use of speaker id to be turned off for Bisto. This is for ART testing"));
        gzVar.mo55429h("enableDevDeviceCustomization", new C89633d("Dev channel for DCI", "Use dev channel for Device Customization"));
        gzVar.mo55429h("blackboxTestLogging", new C89633d("BlackBox test logging", "data send to and from Bisto devices will be logged."));
        f242713a = gzVar.mo55427f(false);
    }
}
