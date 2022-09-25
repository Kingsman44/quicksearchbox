package com.google.android.apps.gsa.shared.search;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: PG */
public enum QueryTriggerType implements Parcelable {
    USER(0),
    INTENT(1),
    PREFETCH(2),
    PREDICTIVE(3),
    WEBVIEW(4),
    HOTWORD(5),
    BT_HEADSET_BUTTON(6),
    WIRED_HEADSET_BUTTON(7),
    FOLLOW_ON(8),
    HISTORY_REFRESH(9),
    CORPUS_SELECTOR(10),
    CONVERSATIONAL_FOLLOW_ON(11),
    DOODLE(12),
    VOICE_COMMAND_INTENT(13),
    VOICE_SELECTIVE_RESPEAK(14),
    PROXY_VOICE_BUTTON(15),
    ACTION_ESCAPE_HATCH(16),
    INTENT_API(17),
    GOOGLEEARS_WIDGET(18),
    VOICE_ACTION(19),
    MUSIC_SEARCH_INTENT(21),
    BISTO(22),
    GEARHEAD_SCREEN_MIC(23),
    GEARHEAD_CONTROLLER(24),
    GEARHEAD_HARDWARE_MIC(25),
    GEARHEAD_DIRECT_ACTION(26),
    UNIFIED_IME(27),
    VOICE_IME(28),
    OPA_SUGGESTION_CHIP(29),
    OPA_TEXT_EDITOR(30),
    OPA_HQ_SUGGESTION_CHIP(31),
    OPA_PROACTIVE_NOTIFICATION(32),
    OPA_VOICE_AUTOCOMPLETE_SUGGESTION(33),
    ASSISTANT_MUSIC_SETTINGS(34),
    MAGIC_MIC(35),
    OPA_FEEDBACK_SURVEY(36),
    OPA_MORRIS_GENERIC(37),
    OPA_SRP_RESULT_CLICK(39),
    OPA_MORRIS_HOTWORD(40),
    OPA_RICH_INPUT_SUGGESTION_CHIP(42),
    NGA_VOICE_TYPING(43),
    OPA_VOICE_SEARCH_SUGGESTION_CHIP(44),
    INSPIRE_REFRESH(45),
    PIXEL_LAUNCHER_MIC(46),
    SEARCH_WIDGET_MIC(47),
    AGA_SEARCHPLATE_MIC(48),
    MONET_ELEMENTS(49),
    AGA_PROGRAMMATIC_NUDGE_SEARCHPLATE(50),
    AGA_PROGRAMMATIC_LANGUAGE_SWITCHER_CLOSED(51),
    OPA_CORRECTION_CHIP(52);
    
    public static final Parcelable.Creator CREATOR = null;

    /* renamed from: Y */
    public static final SparseArray f252812Y = null;

    /* renamed from: Z */
    public final int f252840Z;

    static {
        int i;
        f252812Y = new SparseArray(r2);
        for (QueryTriggerType queryTriggerType : values()) {
            f252812Y.put(queryTriggerType.f252840Z, queryTriggerType);
        }
        CREATOR = new C90505m();
    }

    private QueryTriggerType(int i) {
        this.f252840Z = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f252840Z);
    }
}
