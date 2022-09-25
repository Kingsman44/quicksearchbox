package com.google.protos.p4816ai.p4819c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.ai.c.c */
/* compiled from: PG */
public enum C63207c implements C62957cd {
    TYPE_UNDEFINED(0),
    CARD(1),
    NOTIFICATION(2),
    CLUSTER(3),
    FEATURE(4),
    FEED_PROTOCOL(5),
    PIET_SHARED_STATE(6),
    TREE_STRUCTURE(7),
    COLLECTION(8),
    TOKEN(9),
    RENDER_DATA(10),
    CHANNELS_BAR_ITEM(11);
    

    /* renamed from: m */
    public final int f170770m;

    private C63207c(int i) {
        this.f170770m = i;
    }

    /* renamed from: a */
    public static C63207c m96205a(int i) {
        switch (i) {
            case 0:
                return TYPE_UNDEFINED;
            case 1:
                return CARD;
            case 2:
                return NOTIFICATION;
            case 3:
                return CLUSTER;
            case 4:
                return FEATURE;
            case 5:
                return FEED_PROTOCOL;
            case 6:
                return PIET_SHARED_STATE;
            case 7:
                return TREE_STRUCTURE;
            case 8:
                return COLLECTION;
            case 9:
                return TOKEN;
            case 10:
                return RENDER_DATA;
            case 11:
                return CHANNELS_BAR_ITEM;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96206b() {
        return C63206b.f170756a;
    }

    public final int getNumber() {
        return this.f170770m;
    }

    public final String toString() {
        return Integer.toString(this.f170770m);
    }
}
