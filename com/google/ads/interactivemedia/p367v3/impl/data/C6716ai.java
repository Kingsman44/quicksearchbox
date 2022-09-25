package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ai */
/* compiled from: PG */
final class C6716ai extends ResizeAndPositionVideoMsgData {
    private final Integer height;
    private final Integer width;

    /* renamed from: x */
    private final Integer f20041x;

    /* renamed from: y */
    private final Integer f20042y;

    public C6716ai(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num != null) {
            this.f20041x = num;
            if (num2 != null) {
                this.f20042y = num2;
                if (num3 != null) {
                    this.width = num3;
                    if (num4 != null) {
                        this.height = num4;
                        return;
                    }
                    throw new NullPointerException("Null height");
                }
                throw new NullPointerException("Null width");
            }
            throw new NullPointerException("Null y");
        }
        throw new NullPointerException("Null x");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResizeAndPositionVideoMsgData) {
            ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData = (ResizeAndPositionVideoMsgData) obj;
            return this.f20041x.equals(resizeAndPositionVideoMsgData.mo13984x()) && this.f20042y.equals(resizeAndPositionVideoMsgData.mo13985y()) && this.width.equals(resizeAndPositionVideoMsgData.width()) && this.height.equals(resizeAndPositionVideoMsgData.height());
        }
    }

    public int hashCode() {
        return ((((((this.f20041x.hashCode() ^ 1000003) * 1000003) ^ this.f20042y.hashCode()) * 1000003) ^ this.width.hashCode()) * 1000003) ^ this.height.hashCode();
    }

    public Integer height() {
        return this.height;
    }

    public Integer width() {
        return this.width;
    }

    /* renamed from: x */
    public Integer mo13984x() {
        return this.f20041x;
    }

    /* renamed from: y */
    public Integer mo13985y() {
        return this.f20042y;
    }
}
