package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bs */
/* compiled from: PG */
public enum C108248bs {
    FEEDBACK(R.string.feedback, R.drawable.quantum_ic_feedback_grey600_18, 27187, -1),
    LAUNCH_HQ(R.string.opa_hq_suggestion_chip_title, 0, 33984, 4),
    LAUNCH_HQ_WITH_ICON(R.string.opa_hq_suggestion_chip_title, R.drawable.ic_explore_googblue_no_border, 48603, 4),
    LAUNCH_HQ_LOW_PRIORITY(R.string.opa_hq_suggestion_chip_title, R.drawable.ic_explore_googblue_no_border, 48722, -1),
    REMIND_LEARN_OPA_LATER(R.string.remind_learn_opa_later, R.drawable.ic_reminder_googblue, 69553, 5),
    WARMER_WELCOME(R.string.warmer_welcome_suggestion, R.drawable.ic_forward_googblue, 69554, 5),
    TURN_OFF_HOTWORD(R.string.opa_turn_off_hotword_suggestion_chip_title, 0, 76839, 6),
    TRAIN_VOICE_MATCH(R.string.opa_train_voice_match_suggestion_chip_title, 0, 76840, 7),
    MULTI_DEVICE_SELECTION(R.string.opa_mult_devices_answer_on_phone, 0, 27105, 1),
    SEND_PHOTOS_TO(R.string.opa_send_photos_to, R.drawable.quantum_ic_send_googblue_24, 74194, 5),
    SHARE_PHOTOS(R.string.opa_share_photos, 0, 74261, 4),
    SELECT_TO_SHARE(R.string.opa_select_to_share_photo, 0, 78773, 6),
    UNSELECT_ALL_PHOTOS(R.string.opa_unselect_all_photos, 0, 76436, 3),
    WHAT_CAN_YOU_DO(R.string.opa_what_can_you_do_suggestion_chip_title, 0, 35968, 2),
    DEBUG_TRACE(R.string.opa_debug_trace_suggestion_chip_title, 0, 37378, -2),
    MUSIC_SEARCH(R.string.opa_music_search_suggestion_chip_title, R.drawable.quantum_ic_music_note_grey600_18, 38291, 5),
    SHARE_ASSISTANT_RESPONSE(R.string.opa_share_assistant_response_suggestion_chip_title, R.drawable.quantum_ic_share_grey600_18, 88545, -1),
    INTERPRETER(0, 0, 87189, 5),
    CHAT_HISTORY(R.string.opa_drl_history_suggestion_chip, R.drawable.quantum_ic_restore_googblue_18, 89798, 10),
    CHAT_HISTORY_AT_LAST(R.string.opa_drl_history_suggestion_chip, R.drawable.quantum_ic_restore_googblue_18, 89798, 0);
    

    /* renamed from: v */
    public int f301130v;

    /* renamed from: w */
    public final int f301131w;

    /* renamed from: x */
    public final int f301132x;

    /* renamed from: y */
    public final int f301133y;

    /* renamed from: z */
    public final C90102f f301134z;

    private C108248bs(int i, int i2, int i3, int i4) {
        this.f301130v = i;
        this.f301131w = i2;
        this.f301132x = i3;
        this.f301133y = i4;
        this.f301134z = null;
    }

    /* renamed from: a */
    public final boolean mo96699a() {
        return this == LAUNCH_HQ || this == LAUNCH_HQ_WITH_ICON || this == LAUNCH_HQ_LOW_PRIORITY;
    }

    private C108248bs(C90102f fVar) {
        this.f301130v = R.string.opa_screen_search_share_screenshot_action;
        this.f301131w = R.drawable.quantum_ic_share_grey600_18;
        this.f301132x = 27753;
        this.f301133y = 0;
        this.f301134z = fVar;
    }
}
