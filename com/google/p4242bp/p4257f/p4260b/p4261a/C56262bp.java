package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bp.f.b.a.bp */
/* compiled from: PG */
public enum C56262bp implements C62957cd {
    UNSPECIFIED(0),
    LIVE_VIEW_FINDER(3),
    CROPPING_VIEW(1),
    PREVIEW_CROPPED_DOCUMENT(2);
    

    /* renamed from: e */
    public final int f149956e;

    private C56262bp(int i) {
        this.f149956e = i;
    }

    /* renamed from: a */
    public static C56262bp m87953a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CROPPING_VIEW;
        }
        if (i == 2) {
            return PREVIEW_CROPPED_DOCUMENT;
        }
        if (i != 3) {
            return null;
        }
        return LIVE_VIEW_FINDER;
    }

    /* renamed from: b */
    public static C62959cf m87954b() {
        return C56261bo.f149950a;
    }

    public final int getNumber() {
        return this.f149956e;
    }

    public final String toString() {
        return Integer.toString(this.f149956e);
    }
}
