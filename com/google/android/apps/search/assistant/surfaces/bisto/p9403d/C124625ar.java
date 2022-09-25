package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.ar */
/* compiled from: PG */
public enum C124625ar implements C62957cd {
    UNKNOWN_INTERNAL_OTA_STATE(0),
    DOWNLOAD_SCHEDULED(2),
    READY_TO_UPLOAD_TO_HEADSET(5),
    UPLOADING_DFU_TO_HEADSET(12),
    WAITING_FOR_APPLY_ACK_FROM_USER(15),
    NON_FORCE_APPLY_SENT(18),
    WAITING_FOR_APPLY_ACK_FROM_USER_UNVERIFIED(35),
    CHECKING_IF_OTA_NEEDED(36);
    

    /* renamed from: i */
    public final int f343803i;

    private C124625ar(int i) {
        this.f343803i = i;
    }

    /* renamed from: a */
    public static C124625ar m204290a(int i) {
        if (i == 0) {
            return UNKNOWN_INTERNAL_OTA_STATE;
        }
        if (i == 2) {
            return DOWNLOAD_SCHEDULED;
        }
        if (i == 5) {
            return READY_TO_UPLOAD_TO_HEADSET;
        }
        if (i == 12) {
            return UPLOADING_DFU_TO_HEADSET;
        }
        if (i == 15) {
            return WAITING_FOR_APPLY_ACK_FROM_USER;
        }
        if (i == 18) {
            return NON_FORCE_APPLY_SENT;
        }
        if (i == 35) {
            return WAITING_FOR_APPLY_ACK_FROM_USER_UNVERIFIED;
        }
        if (i != 36) {
            return null;
        }
        return CHECKING_IF_OTA_NEEDED;
    }

    /* renamed from: b */
    public static C62959cf m204291b() {
        return C124624aq.f343793a;
    }

    public final int getNumber() {
        return this.f343803i;
    }

    public final String toString() {
        return Integer.toString(this.f343803i);
    }
}
