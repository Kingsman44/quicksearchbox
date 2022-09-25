package com.google.ads.interactivemedia.p367v3.impl.data;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ap */
/* compiled from: PG */
final class C6723ap extends C6753bs {
    private Float volume;

    public C6754bt build() {
        String str = this.volume == null ? " volume" : BuildConfig.FLAVOR;
        if (str.isEmpty()) {
            return new C6724aq(this.volume.floatValue());
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
    }

    public C6753bs volume(float f) {
        this.volume = Float.valueOf(f);
        return this;
    }
}
