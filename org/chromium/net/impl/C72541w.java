package org.chromium.net.impl;

import java.util.Date;
import org.chromium.net.RequestFinishedInfo;

/* renamed from: org.chromium.net.impl.w */
/* compiled from: PG */
public final class C72541w extends RequestFinishedInfo.Metrics {

    /* renamed from: a */
    public final long f193034a;

    /* renamed from: b */
    public final long f193035b;

    /* renamed from: c */
    public final long f193036c;

    /* renamed from: d */
    public final Long f193037d;

    /* renamed from: e */
    public final Long f193038e;

    /* renamed from: f */
    private final long f193039f;

    /* renamed from: g */
    private final long f193040g;

    /* renamed from: h */
    private final long f193041h;

    /* renamed from: i */
    private final long f193042i;

    /* renamed from: j */
    private final long f193043j;

    /* renamed from: k */
    private final long f193044k;

    /* renamed from: l */
    private final long f193045l;

    /* renamed from: m */
    private final long f193046m;

    /* renamed from: n */
    private final long f193047n;

    /* renamed from: o */
    private final long f193048o;

    /* renamed from: p */
    private final boolean f193049p;

    /* renamed from: q */
    private final Long f193050q;

    /* renamed from: r */
    private final Long f193051r;

    public C72541w(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        long j16 = j;
        long j17 = j12;
        long j18 = j13;
        this.f193034a = j16;
        this.f193039f = j2;
        this.f193040g = j3;
        this.f193041h = j4;
        this.f193042i = j5;
        this.f193043j = j6;
        this.f193044k = j7;
        this.f193045l = j8;
        this.f193046m = j9;
        this.f193047n = j10;
        this.f193048o = j11;
        this.f193035b = j17;
        this.f193036c = j18;
        this.f193049p = z;
        this.f193037d = Long.valueOf(j14);
        this.f193038e = Long.valueOf(j15);
        if (j16 == -1 || j17 == -1) {
            this.f193050q = null;
        } else {
            this.f193050q = Long.valueOf(j17 - j16);
        }
        if (j16 == -1 || j18 == -1) {
            this.f193051r = null;
        } else {
            this.f193051r = Long.valueOf(j18 - j16);
        }
    }

    /* renamed from: a */
    public static Date m107237a(long j) {
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    public final Date getConnectEnd() {
        return m107237a(this.f193042i);
    }

    public final Date getConnectStart() {
        return m107237a(this.f193041h);
    }

    public final Date getDnsEnd() {
        return m107237a(this.f193040g);
    }

    public final Date getDnsStart() {
        return m107237a(this.f193039f);
    }

    public final Date getPushEnd() {
        return m107237a(this.f193048o);
    }

    public final Date getPushStart() {
        return m107237a(this.f193047n);
    }

    public final Long getReceivedByteCount() {
        return this.f193038e;
    }

    public final Date getRequestEnd() {
        return m107237a(this.f193036c);
    }

    public final Date getRequestStart() {
        return m107237a(this.f193034a);
    }

    public final Date getResponseStart() {
        return m107237a(this.f193035b);
    }

    public final Date getSendingEnd() {
        return m107237a(this.f193046m);
    }

    public final Date getSendingStart() {
        return m107237a(this.f193045l);
    }

    public final Long getSentByteCount() {
        return this.f193037d;
    }

    public final boolean getSocketReused() {
        return this.f193049p;
    }

    public final Date getSslEnd() {
        return m107237a(this.f193044k);
    }

    public final Date getSslStart() {
        return m107237a(this.f193043j);
    }

    public final Long getTotalTimeMs() {
        return this.f193051r;
    }

    public final Long getTtfbMs() {
        return this.f193050q;
    }
}
