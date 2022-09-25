package com.google.android.apps.gsa.shared.logger;

import android.os.SystemClock;

/* renamed from: com.google.android.apps.gsa.shared.logger.y */
/* compiled from: PG */
public final class C89957y {

    /* renamed from: a */
    public final long f246473a = SystemClock.elapsedRealtime();

    /* renamed from: b */
    public final boolean f246474b;

    /* renamed from: c */
    public final String f246475c;

    /* renamed from: d */
    public final Integer f246476d;

    /* renamed from: e */
    public final C89834a f246477e;

    /* renamed from: f */
    public final C89954v f246478f;

    /* renamed from: g */
    public final boolean f246479g;

    /* renamed from: h */
    public final String f246480h;

    /* renamed from: i */
    public final int f246481i;

    public C89957y(int i, boolean z, String str, Integer num, C89834a aVar, C89954v vVar, boolean z2, String str2) {
        this.f246481i = i;
        this.f246474b = z;
        this.f246475c = str;
        this.f246476d = num;
        this.f246477e = aVar;
        this.f246478f = vVar;
        this.f246479g = z2;
        this.f246480h = str2;
    }

    /* renamed from: a */
    public static C89957y m146538a() {
        return new C89957y(-1, true, (String) null, (Integer) null, (C89834a) null, (C89954v) null, false, (String) null);
    }

    /* renamed from: b */
    public static C89957y m146539b(String str) {
        return new C89957y(-2, false, str, (Integer) null, (C89834a) null, (C89954v) null, false, (String) null);
    }

    /* renamed from: c */
    public static C89957y m146540c(int i) {
        return new C89957y(-3, false, (String) null, Integer.valueOf(i), (C89834a) null, (C89954v) null, false, (String) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogMetadata[mTime=");
        sb.append(this.f246473a);
        sb.append(", mEventType=");
        sb.append(Integer.toString(this.f246481i));
        sb.append(", ");
        if (this.f246474b) {
            sb.append("mClearRequestId=");
            sb.append(this.f246474b);
            sb.append(", ");
        }
        if (this.f246475c != null) {
            sb.append("mRequestId=");
            sb.append(this.f246475c);
            sb.append(", ");
        }
        if (this.f246476d != null) {
            sb.append("mRequestType=");
            sb.append(this.f246476d);
            sb.append(", ");
        }
        if (this.f246477e != null) {
            sb.append("mCookieSwitchData=");
            sb.append(this.f246477e);
            sb.append(", ");
        }
        if (this.f246478f != null) {
            sb.append("mGoogleAccountData=");
            sb.append(this.f246478f);
            sb.append(", ");
        }
        if (this.f246479g) {
            sb.append("mClearApplicationId=");
            sb.append(this.f246479g);
            sb.append(", ");
        }
        if (this.f246480h != null) {
            sb.append("mApplicationId=");
            sb.append(this.f246480h);
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
