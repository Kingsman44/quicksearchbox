package com.google.ads.interactivemedia.p367v3.api;

import com.google.ads.interactivemedia.p367v3.internal.C7055k;

/* renamed from: com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose */
/* compiled from: PG */
public enum FriendlyObstructionPurpose {
    VIDEO_CONTROLS,
    CLOSE_AD,
    NOT_VISIBLE,
    OTHER;

    public C7055k getOmidPurpose() {
        return (C7055k) C7055k.valueOf(C7055k.class, name());
    }
}
