package com.google.p5235u.p5236a.p5237a;

import android.net.Uri;

/* renamed from: com.google.u.a.a.b */
/* compiled from: PG */
public enum C67485b {
    OPEN_APP_OR_BROWSER("https://play.google.com/store/apps/details"),
    OPEN_APP("market://details");
    

    /* renamed from: c */
    public final Uri f183421c;

    private C67485b(String str) {
        this.f183421c = Uri.parse(str);
    }
}
