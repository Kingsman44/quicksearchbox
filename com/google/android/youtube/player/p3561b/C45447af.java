package com.google.android.youtube.player.p3561b;

/* renamed from: com.google.android.youtube.player.b.af */
public final class C45447af {

    /* renamed from: a */
    public final int f118865a;

    public C45447af(int i) {
        this.f118865a = i;
    }

    /* renamed from: a */
    public static C45447af m81104a(int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 9;
                break;
            case 9:
                i2 = 10;
                break;
            case 10:
                i2 = 11;
                break;
            case 11:
                i2 = 12;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 == 0) {
            return null;
        }
        return new C45447af(i2);
    }

    public final String toString() {
        switch (this.f118865a) {
            case 1:
                return "NOT_PLAYABLE";
            case 2:
                return "NETWORK_ERROR";
            case 3:
                return "UNAUTHORIZED_OVERLAY";
            case 4:
                return "PLAYER_VIEW_TOO_SMALL";
            case 5:
                return "PLAYER_VIEW_NOT_VISIBLE";
            case 6:
                return "EMPTY_PLAYLIST";
            case 7:
                return "AUTOPLAY_DISABLED";
            case 8:
                return "USER_DECLINED_RESTRICTED_CONTENT";
            case 9:
                return "UNEXPECTED_SERVICE_DISCONNECTION";
            case 10:
                return "INTERNAL_ERROR";
            case 11:
                return "UNKNOWN";
            default:
                return "NOT_PLAYABLE_MUTED";
        }
    }
}
