package com.google.protos.p4895aw.p4902b;

/* renamed from: com.google.protos.aw.b.o */
/* compiled from: PG */
public enum C64097o {
    TRIVIAL_BIGTABLE,
    FOOTPRINTS,
    REGISTRATION,
    CHANNELID_NOT_SET;

    /* renamed from: a */
    public static C64097o m96355a(int i) {
        if (i == 0) {
            return CHANNELID_NOT_SET;
        }
        if (i == 1) {
            return TRIVIAL_BIGTABLE;
        }
        if (i == 2) {
            return FOOTPRINTS;
        }
        if (i != 3) {
            return null;
        }
        return REGISTRATION;
    }
}
