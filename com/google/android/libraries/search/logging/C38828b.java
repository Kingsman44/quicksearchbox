package com.google.android.libraries.search.logging;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.logging.b */
/* compiled from: PG */
public enum C38828b implements C62957cd {
    UNKNOWN(0),
    GOOGLE_APP(6),
    TRANSCRIPTION(1673),
    NIU(1771),
    ASSISTANT(7),
    LENS_NBU(1626),
    LENS(1739),
    SOUND_SEARCH(1770),
    ASSISTANT_AUTO_EMBEDDED(1856),
    PRONUNCIATION_LEARNING(1870),
    WEATHER(1891),
    FACEVIEWER(1900),
    SCENEVIEWER(2507),
    ASSISTANT_AUTO_PROJECTED(1909),
    MORRIS(2611),
    LINGO_CAMERA(1963),
    HOTWORD_LIBRARY_ANDROID(1869),
    HSI(SimpleSnackbar.LENGTH_SHORT),
    PODCASTS(1628),
    CREATOR_STUDIO(2076),
    ASSISTANT_AUTO_TNG(1855),
    GELLER_AGSA(1808),
    LOCATION_AGSA(2306),
    WEBGLIDE(2316),
    FEDORA(2458),
    KAHANI(2462),
    APA(2463),
    ASSISTANT_TITAN_TNG(2512),
    SODA_ANDROID(2369),
    WEB_X(2578),
    WORKMANAGER_MONITORING(2572),
    PROACTIVE_ASSISTANT(1947),
    UNRECOGNIZED(-1);
    

    /* renamed from: H */
    private final int f102485H;

    private C38828b(int i) {
        this.f102485H = i;
    }

    /* renamed from: a */
    public static C38828b m68178a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 6:
                return GOOGLE_APP;
            case 7:
                return ASSISTANT;
            case 1626:
                return LENS_NBU;
            case 1628:
                return PODCASTS;
            case 1673:
                return TRANSCRIPTION;
            case 1739:
                return LENS;
            case 1770:
                return SOUND_SEARCH;
            case 1771:
                return NIU;
            case 1808:
                return GELLER_AGSA;
            case 1855:
                return ASSISTANT_AUTO_TNG;
            case 1856:
                return ASSISTANT_AUTO_EMBEDDED;
            case 1869:
                return HOTWORD_LIBRARY_ANDROID;
            case 1870:
                return PRONUNCIATION_LEARNING;
            case 1891:
                return WEATHER;
            case 1900:
                return FACEVIEWER;
            case 1909:
                return ASSISTANT_AUTO_PROJECTED;
            case 1947:
                return PROACTIVE_ASSISTANT;
            case 1963:
                return LINGO_CAMERA;
            case SimpleSnackbar.LENGTH_SHORT:
                return HSI;
            case 2076:
                return CREATOR_STUDIO;
            case 2306:
                return LOCATION_AGSA;
            case 2316:
                return WEBGLIDE;
            case 2369:
                return SODA_ANDROID;
            case 2458:
                return FEDORA;
            case 2462:
                return KAHANI;
            case 2463:
                return APA;
            case 2507:
                return SCENEVIEWER;
            case 2512:
                return ASSISTANT_TITAN_TNG;
            case 2572:
                return WORKMANAGER_MONITORING;
            case 2578:
                return WEB_X;
            case 2611:
                return MORRIS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m68179b() {
        return C38727a.f102252a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f102485H;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
