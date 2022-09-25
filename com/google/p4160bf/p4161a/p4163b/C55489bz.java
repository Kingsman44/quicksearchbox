package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bf.a.b.bz */
/* compiled from: PG */
public enum C55489bz implements C62957cd {
    INTERACTION_TYPE_UNSPECIFIED(0),
    ACTION_CLICK(1),
    CLICKED(2),
    DISMISSED(5),
    DISMISSED_REMOTE(30),
    DISMISSED_BY_API(35),
    DISMISS_ALL(6),
    ADDED_TO_STORAGE(34),
    REPLACED_IN_STORAGE(36),
    SHOWN(9),
    SHOWN_REPLACED(28),
    SHOWN_FORCED(29),
    SHOWN_WITHOUT_IMAGE(10),
    REMOVED_FROM_STORAGE(37),
    REMOVED(41),
    UNSHOWN(19),
    DELIVERED_FCM_PUSH(33),
    DELIVERED(11),
    DELIVERED_SYNC_INSTRUCTION(12),
    DELIVERED_FULL_SYNC_INSTRUCTION(13),
    DELIVERED_UPDATE_THREAD_INSTRUCTION(23),
    DELIVERED_REMOVE_STORAGE_INSTRUCTION(43),
    DELIVERED_SILENT_NOTIFICATION(45),
    FETCHED_THREADS_BY_ID(42),
    FETCHED_LATEST_THREADS(20),
    FETCHED_UPDATED_THREADS(21),
    FETCHED_MULTI_USER_BADGE_COUNT(38),
    SUCCEED_TO_UPDATE_THREAD_STATE(15),
    SHOW_SKIPPED_DUE_TO_COUNTERFACTUAL(16),
    LOCAL_NOTIFICATION_CREATED(17),
    LOCAL_NOTIFICATION_UPDATED(22),
    EXPIRED(18),
    APP_BLOCK_STATE_CHANGED(24),
    NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED(25),
    NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED(26),
    PERIODIC_LOG(27),
    ACCOUNT_DATA_CLEANED(31),
    NOTIFICATION_DATA_CLEANED(44),
    TARGET_REGISTERED(32),
    LOCATION_TARGET_REGISTERED(46),
    VOIP_TARGET_REGISTERED(47),
    CLICK_DURATION_CLICK_OPENED_APP(39),
    CLICK_DURATION_CLICK_WHILE_OPEN(40),
    DSC_POSTPONED(48);
    

    /* renamed from: S */
    public final int f146426S;

    private C55489bz(int i) {
        this.f146426S = i;
    }

    /* renamed from: a */
    public static C55489bz m87698a(int i) {
        switch (i) {
            case 0:
                return INTERACTION_TYPE_UNSPECIFIED;
            case 1:
                return ACTION_CLICK;
            case 2:
                return CLICKED;
            case 5:
                return DISMISSED;
            case 6:
                return DISMISS_ALL;
            case 9:
                return SHOWN;
            case 10:
                return SHOWN_WITHOUT_IMAGE;
            case 11:
                return DELIVERED;
            case 12:
                return DELIVERED_SYNC_INSTRUCTION;
            case 13:
                return DELIVERED_FULL_SYNC_INSTRUCTION;
            case 15:
                return SUCCEED_TO_UPDATE_THREAD_STATE;
            case 16:
                return SHOW_SKIPPED_DUE_TO_COUNTERFACTUAL;
            case 17:
                return LOCAL_NOTIFICATION_CREATED;
            case 18:
                return EXPIRED;
            case 19:
                return UNSHOWN;
            case 20:
                return FETCHED_LATEST_THREADS;
            case 21:
                return FETCHED_UPDATED_THREADS;
            case 22:
                return LOCAL_NOTIFICATION_UPDATED;
            case 23:
                return DELIVERED_UPDATE_THREAD_INSTRUCTION;
            case 24:
                return APP_BLOCK_STATE_CHANGED;
            case 25:
                return NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED;
            case 26:
                return NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED;
            case 27:
                return PERIODIC_LOG;
            case 28:
                return SHOWN_REPLACED;
            case 29:
                return SHOWN_FORCED;
            case 30:
                return DISMISSED_REMOTE;
            case 31:
                return ACCOUNT_DATA_CLEANED;
            case 32:
                return TARGET_REGISTERED;
            case 33:
                return DELIVERED_FCM_PUSH;
            case 34:
                return ADDED_TO_STORAGE;
            case 35:
                return DISMISSED_BY_API;
            case 36:
                return REPLACED_IN_STORAGE;
            case 37:
                return REMOVED_FROM_STORAGE;
            case 38:
                return FETCHED_MULTI_USER_BADGE_COUNT;
            case 39:
                return CLICK_DURATION_CLICK_OPENED_APP;
            case 40:
                return CLICK_DURATION_CLICK_WHILE_OPEN;
            case 41:
                return REMOVED;
            case 42:
                return FETCHED_THREADS_BY_ID;
            case 43:
                return DELIVERED_REMOVE_STORAGE_INSTRUCTION;
            case 44:
                return NOTIFICATION_DATA_CLEANED;
            case 45:
                return DELIVERED_SILENT_NOTIFICATION;
            case 46:
                return LOCATION_TARGET_REGISTERED;
            case 47:
                return VOIP_TARGET_REGISTERED;
            case 48:
                return DSC_POSTPONED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87699b() {
        return C55488by.f146380a;
    }

    public final int getNumber() {
        return this.f146426S;
    }

    public final String toString() {
        return Integer.toString(this.f146426S);
    }
}
