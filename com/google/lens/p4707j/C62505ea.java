package com.google.lens.p4707j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.lens.j.ea */
/* compiled from: PG */
public enum C62505ea implements C62957cd {
    SURFACE_UNSPECIFIED(0),
    GOOGLE_PHOTOS(1),
    GOOGLE_GO(2),
    YOUTUBE(3),
    CHROMIUM(4),
    WEARABLES(5),
    LENS_KAIOS(6),
    XGA(7),
    SHELL_APP(8),
    MAPS(9),
    SCREENSHOTS(10),
    ASSISTANT(11),
    CAMERA(12),
    GBOARD(13),
    LENS_APP(14),
    SYSTEM_UI(15),
    LG_GALLERY(16),
    CAMERA_3P(17),
    ANDROID_SYSTEM_APP(18),
    IMAGE_SEARCH(19),
    MARKETING_DEEPLINK(20),
    GALLERY_3P(21),
    SCREENSHOTS_3P(22),
    ANDROID_SCREENSHOTS(23),
    CAMERA_GO(24),
    TRANSLATE(25),
    STANDALONE(26),
    SEARCH(27),
    STANDALONE_SIDE_PANEL(28),
    UNRECOGNIZED(-1);
    

    /* renamed from: E */
    private final int f168769E;

    private C62505ea(int i) {
        this.f168769E = i;
    }

    /* renamed from: a */
    public static C62505ea m94790a(int i) {
        switch (i) {
            case 0:
                return SURFACE_UNSPECIFIED;
            case 1:
                return GOOGLE_PHOTOS;
            case 2:
                return GOOGLE_GO;
            case 3:
                return YOUTUBE;
            case 4:
                return CHROMIUM;
            case 5:
                return WEARABLES;
            case 6:
                return LENS_KAIOS;
            case 7:
                return XGA;
            case 8:
                return SHELL_APP;
            case 9:
                return MAPS;
            case 10:
                return SCREENSHOTS;
            case 11:
                return ASSISTANT;
            case 12:
                return CAMERA;
            case 13:
                return GBOARD;
            case 14:
                return LENS_APP;
            case 15:
                return SYSTEM_UI;
            case 16:
                return LG_GALLERY;
            case 17:
                return CAMERA_3P;
            case 18:
                return ANDROID_SYSTEM_APP;
            case 19:
                return IMAGE_SEARCH;
            case 20:
                return MARKETING_DEEPLINK;
            case 21:
                return GALLERY_3P;
            case 22:
                return SCREENSHOTS_3P;
            case 23:
                return ANDROID_SCREENSHOTS;
            case 24:
                return CAMERA_GO;
            case 25:
                return TRANSLATE;
            case 26:
                return STANDALONE;
            case 27:
                return SEARCH;
            case 28:
                return STANDALONE_SIDE_PANEL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m94791b() {
        return C62503dz.f168737a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f168769E;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
