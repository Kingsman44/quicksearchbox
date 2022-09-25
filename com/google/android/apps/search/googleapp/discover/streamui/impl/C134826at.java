package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.discover.p10248y.C135270u;
import p5462h.C69677g;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.at */
/* compiled from: PG */
public final class C134826at {
    /* renamed from: a */
    public static final C89885b m218661a(C135270u uVar) {
        C135270u uVar2 = C135270u.REQUEST_FAILED_NO_INTERNET;
        C89885b bVar = C89885b.UNKNOWN;
        switch (uVar.ordinal()) {
            case 0:
                return C89885b.FEED_LAUNCH_REQUEST_NO_INTERNET_ERROR;
            case 1:
                return C89885b.FEED_LAUNCH_REQUEST_ERROR;
            case 2:
                return C89885b.FEED_LAUNCH_RESPONSE_ERROR;
            case 3:
                return C89885b.FEED_LAUNCH_AUTHENTICATION_ERROR;
            case 4:
                return C89885b.FEED_LAUNCH_USER_NOT_SIGNED_IN;
            case 5:
                return C89885b.FEED_LAUNCH_USER_NOT_ELIGIBLE;
            case 6:
                return C89885b.FEED_LAUNCH_DISABLED_BY_USER;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return C89885b.FEED_LAUNCH_STATUS_GOOGLE_PLAY_SERVICES_UNAVAILABLE;
            case 13:
                return C89885b.FEED_LAUNCH_FAILED_TO_GET_ANY_CARD_PREVIOUS_REQUEST_ERROR;
            case 14:
                return C89885b.FEED_LAUNCH_FAILED_TO_GET_ANY_CARD_NO_CARDS_IN_RESPONSE;
            case 15:
                return C89885b.FEED_LAUNCH_FAILED_TO_GET_ANY_CARD;
            case 16:
                return C89885b.FEED_LAUNCH_UNEXPECTED_ERROR;
            default:
                throw new C69677g();
        }
    }
}
