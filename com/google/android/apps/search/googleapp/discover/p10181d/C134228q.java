package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.q */
/* compiled from: PG */
public enum C134228q {
    AUTHENTICATION_ERROR(C89849ae.DISCOVER_TNG_AUTHENTICATION_ERROR_REFRESH_START),
    DEBUG_PARAMS_UPDATED(C89849ae.DISCOVER_TNG_DEBUG_PARAMS_UPDATED_REFRESH_START),
    GOOGLE_PLAY_ERROR(C89849ae.DISCOVER_TNG_GOOGLE_PLAY_ERROR_REFRESH_START),
    NO_CONTENT_ERROR(C89849ae.DISCOVER_TNG_NO_CONTENT_ERROR_REFRESH_START),
    PULL_TO_REFRESH(C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_START),
    RESPONSE_ERROR(C89849ae.DISCOVER_TNG_RESPONSE_ERROR_REFRESH_START),
    TAP_TO_UPDATE(C89849ae.DISCOVER_TNG_TAP_TO_UPDATE_START),
    UNEXPECTED_ERROR(C89849ae.DISCOVER_TNG_UNEXPECTED_ERROR_REFRESH_START),
    XUIKIT_REFRESH_FEED_COMMAND(C89849ae.DISCOVER_TNG_XUIKIT_REFRESH_COMMAND_START);
    

    /* renamed from: j */
    public final C89849ae f365699j;

    private C134228q(C89849ae aeVar) {
        this.f365699j = aeVar;
    }

    /* renamed from: a */
    public static C134228q m217796a(String str) {
        return (C134228q) Enum.valueOf(C134228q.class, str);
    }
}
