package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
public final class PerformanceSpan {
    final Long begin;
    final int beginThreadIdentifier;
    final Long end;
    final int endThreadIdentifier;
    final PerformanceEventInfo info;
    final boolean isMainThread;
    final int nonce;
    final Integer parentNonce;
    final PerformanceSpanType type;

    public PerformanceSpan(PerformanceSpanType performanceSpanType, int i, PerformanceEventInfo performanceEventInfo, Long l, Long l2, int i2, int i3, boolean z, Integer num) {
        this.type = performanceSpanType;
        this.nonce = i;
        this.info = performanceEventInfo;
        this.begin = l;
        this.end = l2;
        this.beginThreadIdentifier = i2;
        this.endThreadIdentifier = i3;
        this.isMainThread = z;
        this.parentNonce = num;
    }

    public Long getBegin() {
        return this.begin;
    }

    public int getBeginThreadIdentifier() {
        return this.beginThreadIdentifier;
    }

    public Long getEnd() {
        return this.end;
    }

    public int getEndThreadIdentifier() {
        return this.endThreadIdentifier;
    }

    public PerformanceEventInfo getInfo() {
        return this.info;
    }

    public boolean getIsMainThread() {
        return this.isMainThread;
    }

    public int getNonce() {
        return this.nonce;
    }

    public Integer getParentNonce() {
        return this.parentNonce;
    }

    public PerformanceSpanType getType() {
        return this.type;
    }

    public String toString() {
        String valueOf = String.valueOf(this.type);
        int i = this.nonce;
        String valueOf2 = String.valueOf(this.info);
        Long l = this.begin;
        Long l2 = this.end;
        int i2 = this.beginThreadIdentifier;
        int i3 = this.endThreadIdentifier;
        boolean z = this.isMainThread;
        Integer num = this.parentNonce;
        return "PerformanceSpan{type=" + valueOf + ",nonce=" + i + ",info=" + valueOf2 + ",begin=" + l + ",end=" + l2 + ",beginThreadIdentifier=" + i2 + ",endThreadIdentifier=" + i3 + ",isMainThread=" + z + ",parentNonce=" + num + "}";
    }
}
