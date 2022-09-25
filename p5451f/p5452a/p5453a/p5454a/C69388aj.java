package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: f.a.a.a.aj */
/* compiled from: PG */
public enum C69388aj implements C62957cd {
    NONE(0),
    DARK_THEME_IS_ON(1),
    DARK_THEME_IS_AVAILABLE(2),
    COME_BACK_ANYTIME(3),
    GET_BACK_ANYTIME(4),
    GET_BACK_TO_SCREEN(5),
    ENJOY_NEW_STORIES(6),
    ACCESS_NEW_STORIES(7),
    EXPLORE_NEW_STORIES(8),
    ADD_TO_HOME_SCREEN(9),
    A_FASTER_WAY_TO_SEARCH(10),
    SEARCH_ANYTHING_WITH_YOUR_CAMERA(11),
    IDENTIFY_PLANTS_OR_ANIMALS_WITH_YOUR_CAMERA(12),
    TRANSLATE_COPY_OR_LISTEN_TO_ANY_TEXT_WITH_YOUR_CAMERA(13),
    CAPTURE_ANY_TEXT_TO_YOUR_PHONE_WITH_YOUR_CAMERA(14),
    MORE_WAYS_TO_SEARCH(15);
    

    /* renamed from: q */
    private final int f185625q;

    private C69388aj(int i) {
        this.f185625q = i;
    }

    /* renamed from: a */
    public static C69388aj m100743a(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return DARK_THEME_IS_ON;
            case 2:
                return DARK_THEME_IS_AVAILABLE;
            case 3:
                return COME_BACK_ANYTIME;
            case 4:
                return GET_BACK_ANYTIME;
            case 5:
                return GET_BACK_TO_SCREEN;
            case 6:
                return ENJOY_NEW_STORIES;
            case 7:
                return ACCESS_NEW_STORIES;
            case 8:
                return EXPLORE_NEW_STORIES;
            case 9:
                return ADD_TO_HOME_SCREEN;
            case 10:
                return A_FASTER_WAY_TO_SEARCH;
            case 11:
                return SEARCH_ANYTHING_WITH_YOUR_CAMERA;
            case 12:
                return IDENTIFY_PLANTS_OR_ANIMALS_WITH_YOUR_CAMERA;
            case 13:
                return TRANSLATE_COPY_OR_LISTEN_TO_ANY_TEXT_WITH_YOUR_CAMERA;
            case 14:
                return CAPTURE_ANY_TEXT_TO_YOUR_PHONE_WITH_YOUR_CAMERA;
            case 15:
                return MORE_WAYS_TO_SEARCH;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m100744b() {
        return C69387ai.f185607a;
    }

    public final int getNumber() {
        return this.f185625q;
    }

    public final String toString() {
        return Integer.toString(this.f185625q);
    }
}
