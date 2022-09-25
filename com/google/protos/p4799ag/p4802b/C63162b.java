package com.google.protos.p4799ag.p4802b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.ag.b.b */
/* compiled from: PG */
public enum C63162b implements C62957cd {
    UNKNOWN_ACTION(0),
    POST_CAPTURE_SCAN_DOCUMENT(4),
    SHARE_CROPPED_DOCUMENT(1),
    SHARE_CROPPED_DOCUMENT_JPEG(2),
    PREVIEW_CROPPED_DOCUMENT(3);
    

    /* renamed from: f */
    private final int f170555f;

    private C63162b(int i) {
        this.f170555f = i;
    }

    /* renamed from: a */
    public static C63162b m96189a(int i) {
        if (i == 0) {
            return UNKNOWN_ACTION;
        }
        if (i == 1) {
            return SHARE_CROPPED_DOCUMENT;
        }
        if (i == 2) {
            return SHARE_CROPPED_DOCUMENT_JPEG;
        }
        if (i == 3) {
            return PREVIEW_CROPPED_DOCUMENT;
        }
        if (i != 4) {
            return null;
        }
        return POST_CAPTURE_SCAN_DOCUMENT;
    }

    /* renamed from: b */
    public static C62959cf m96190b() {
        return C63161a.f170548a;
    }

    public final int getNumber() {
        return this.f170555f;
    }

    public final String toString() {
        return Integer.toString(this.f170555f);
    }
}
