package com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.platform.h.i.a.a */
/* compiled from: PG */
public enum C121143a implements C62957cd {
    QP_SETTING_TYPE_UNSPECIFIED(0),
    QP_SETTING_TYPE_ALARM(1),
    QP_SETTING_TYPE_TIMER(2),
    QP_SETTING_TYPE_CALL_CONTACT(3),
    QP_SETTING_TYPE_CALL_NUMBER(5),
    QP_SETTING_TYPE_CALL_CONTACT_V2(6),
    QP_SETTING_TYPE_CALL_NUMBER_V2(7),
    QP_SETTING_TYPE_MEDIA(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f336613j;

    private C121143a(int i) {
        this.f336613j = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f336613j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
