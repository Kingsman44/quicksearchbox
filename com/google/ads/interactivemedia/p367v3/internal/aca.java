package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aca */
/* compiled from: PG */
public final class aca {

    /* renamed from: a */
    private Uri f20234a;

    /* renamed from: b */
    private final int f20235b = 1;

    /* renamed from: c */
    private Map f20236c = Collections.emptyMap();

    /* renamed from: d */
    private long f20237d;

    /* renamed from: e */
    private long f20238e = -1;

    /* renamed from: f */
    private String f20239f;

    /* renamed from: g */
    private int f20240g;

    /* renamed from: a */
    public final acb mo14425a() {
        ary.m19470w(this.f20234a, "The uri must be set.");
        return new acb(this.f20234a, 1, (byte[]) null, this.f20236c, this.f20237d, this.f20238e, this.f20239f, this.f20240g, (byte[]) null);
    }

    /* renamed from: b */
    public final void mo14426b(int i) {
        this.f20240g = i;
    }

    /* renamed from: c */
    public final void mo14427c(Map map) {
        this.f20236c = map;
    }

    /* renamed from: d */
    public final void mo14428d(String str) {
        this.f20239f = str;
    }

    /* renamed from: e */
    public final void mo14429e(long j) {
        this.f20238e = j;
    }

    /* renamed from: f */
    public final void mo14430f(long j) {
        this.f20237d = j;
    }

    /* renamed from: g */
    public final void mo14431g(Uri uri) {
        this.f20234a = uri;
    }
}
