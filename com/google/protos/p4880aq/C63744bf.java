package com.google.protos.p4880aq;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aq.bf */
/* compiled from: PG */
public enum C63744bf implements C62957cd {
    TARGET_UNKNOWN(0),
    LENS_ICON(1),
    VOICE_SEARCH_ICON(2),
    DISCOVER_BOC_ICON(3),
    SEARCH_BOTTOMBAR_ICON(4),
    DISCOVER_ADS_BOC_ICON(5);
    

    /* renamed from: g */
    public final int f172449g;

    private C63744bf(int i) {
        this.f172449g = i;
    }

    /* renamed from: a */
    public static C63744bf m96298a(int i) {
        if (i == 0) {
            return TARGET_UNKNOWN;
        }
        if (i == 1) {
            return LENS_ICON;
        }
        if (i == 2) {
            return VOICE_SEARCH_ICON;
        }
        if (i == 3) {
            return DISCOVER_BOC_ICON;
        }
        if (i == 4) {
            return SEARCH_BOTTOMBAR_ICON;
        }
        if (i != 5) {
            return null;
        }
        return DISCOVER_ADS_BOC_ICON;
    }

    /* renamed from: b */
    public static C62959cf m96299b() {
        return C63743be.f172441a;
    }

    public final int getNumber() {
        return this.f172449g;
    }

    public final String toString() {
        return Integer.toString(this.f172449g);
    }
}
