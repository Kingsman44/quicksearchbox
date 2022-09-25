package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.xb */
/* compiled from: PG */
public enum C8142xb implements C62957cd {
    UNKNOWN_SURFACE(0),
    SEARCH_NOW_ACTIVITY(1),
    GOOGLE_NOW_LAUNCHER(2),
    ACETONE_OVERLAY(3),
    ASSIST_LAYER(4),
    ASSIST_SELECTION_LAYER(5),
    SECOND_SCREEN_ACTIVITY(6),
    CUSTOMIZE_ACTIVITY(7),
    IMMERSIVE_ACTIONS(9),
    PLATFORM_NOTIFICATION(11),
    ACTIONS_AGENDA(12),
    ACETONE_OVERLAY_MOMO(15),
    SEARCH_NOW_MONET(16),
    LIGHTSPEED(17),
    SECOND_SCREEN_MONET(18),
    CHANNEL_DETAIL(19),
    DEPRECATED_LOBBY_ACTIVITY(8),
    DEPRECATED_ACTIONS_UI(10),
    DEPRECATED_WEAR_CARD_SYNC(13),
    DEPRECATED_ASSISTANT_HQ(14);
    

    /* renamed from: u */
    public final int f28649u;

    private C8142xb(int i) {
        this.f28649u = i;
    }

    /* renamed from: a */
    public static C8142xb m22954a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SURFACE;
            case 1:
                return SEARCH_NOW_ACTIVITY;
            case 2:
                return GOOGLE_NOW_LAUNCHER;
            case 3:
                return ACETONE_OVERLAY;
            case 4:
                return ASSIST_LAYER;
            case 5:
                return ASSIST_SELECTION_LAYER;
            case 6:
                return SECOND_SCREEN_ACTIVITY;
            case 7:
                return CUSTOMIZE_ACTIVITY;
            case 8:
                return DEPRECATED_LOBBY_ACTIVITY;
            case 9:
                return IMMERSIVE_ACTIONS;
            case 10:
                return DEPRECATED_ACTIONS_UI;
            case 11:
                return PLATFORM_NOTIFICATION;
            case 12:
                return ACTIONS_AGENDA;
            case 13:
                return DEPRECATED_WEAR_CARD_SYNC;
            case 14:
                return DEPRECATED_ASSISTANT_HQ;
            case 15:
                return ACETONE_OVERLAY_MOMO;
            case 16:
                return SEARCH_NOW_MONET;
            case 17:
                return LIGHTSPEED;
            case 18:
                return SECOND_SCREEN_MONET;
            case 19:
                return CHANNEL_DETAIL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m22955b() {
        return C8141xa.f28627a;
    }

    public final int getNumber() {
        return this.f28649u;
    }

    public final String toString() {
        return Integer.toString(this.f28649u);
    }
}
