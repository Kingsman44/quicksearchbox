package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.cu */
/* compiled from: PG */
public enum C51305cu implements C62957cd {
    UNKNOWN_MODALITY(0),
    VOICE_MODALITY(1),
    TYPING_MODALITY(2),
    IMAGE_TAP_LOCATION_MODALITY(3),
    GUI_MODALITY(4);
    

    /* renamed from: f */
    public final int f133565f;

    private C51305cu(int i) {
        this.f133565f = i;
    }

    /* renamed from: a */
    public static C51305cu m86117a(int i) {
        if (i == 0) {
            return UNKNOWN_MODALITY;
        }
        if (i == 1) {
            return VOICE_MODALITY;
        }
        if (i == 2) {
            return TYPING_MODALITY;
        }
        if (i == 3) {
            return IMAGE_TAP_LOCATION_MODALITY;
        }
        if (i != 4) {
            return null;
        }
        return GUI_MODALITY;
    }

    /* renamed from: b */
    public static C62959cf m86118b() {
        return C51304ct.f133558a;
    }

    public final int getNumber() {
        return this.f133565f;
    }

    public final String toString() {
        return Integer.toString(this.f133565f);
    }
}
