package com.google.ads.interactivemedia.p367v3.internal;

import android.support.p033v7.widget.LinearLayoutManager;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pq */
/* compiled from: PG */
public final class C7207pq {

    /* renamed from: a */
    private final String f23518a;

    /* renamed from: b */
    private final int f23519b;

    /* renamed from: c */
    private final int f23520c;

    /* renamed from: d */
    private int f23521d;

    /* renamed from: e */
    private String f23522e;

    public C7207pq(int i, int i2) {
        this(LinearLayoutManager.INVALID_OFFSET, i, i2);
    }

    /* renamed from: d */
    private final void m21502d() {
        if (this.f23521d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    public final void mo16278a() {
        int i = this.f23521d;
        int i2 = i == Integer.MIN_VALUE ? this.f23519b : i + this.f23520c;
        this.f23521d = i2;
        String str = this.f23518a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i2);
        this.f23522e = sb.toString();
    }

    /* renamed from: b */
    public final int mo16279b() {
        m21502d();
        return this.f23521d;
    }

    /* renamed from: c */
    public final String mo16280c() {
        m21502d();
        return this.f23522e;
    }

    public C7207pq(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i);
            sb.append("/");
            str = sb.toString();
        } else {
            str = BuildConfig.FLAVOR;
        }
        this.f23518a = str;
        this.f23519b = i2;
        this.f23520c = i3;
        this.f23521d = LinearLayoutManager.INVALID_OFFSET;
        this.f23522e = BuildConfig.FLAVOR;
    }
}
