package com.google.ads.interactivemedia.p367v3.impl.data;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.o */
/* compiled from: PG */
final class C6767o extends C6725ar {
    private Integer height;
    private Integer left;
    private Integer top;
    private Integer width;

    public C6726as build() {
        String str = this.left == null ? " left" : BuildConfig.FLAVOR;
        if (this.top == null) {
            str = str.concat(" top");
        }
        if (this.height == null) {
            str = String.valueOf(str).concat(" height");
        }
        if (this.width == null) {
            str = String.valueOf(str).concat(" width");
        }
        if (str.isEmpty()) {
            return new C6768p(this.left.intValue(), this.top.intValue(), this.height.intValue(), this.width.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public C6725ar height(int i) {
        this.height = Integer.valueOf(i);
        return this;
    }

    public C6725ar left(int i) {
        this.left = Integer.valueOf(i);
        return this;
    }

    public C6725ar top(int i) {
        this.top = Integer.valueOf(i);
        return this;
    }

    public C6725ar width(int i) {
        this.width = Integer.valueOf(i);
        return this;
    }
}
