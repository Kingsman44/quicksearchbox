package com.bumptech.glide.load.p293a.p296c;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.load.a.c.a */
/* compiled from: PG */
public final class C5706a {

    /* renamed from: a */
    public int f17189a;

    /* renamed from: b */
    public int f17190b;

    /* renamed from: c */
    public String f17191c;

    /* renamed from: d */
    private final boolean f17192d;

    public C5706a(boolean z) {
        this.f17192d = z;
    }

    /* renamed from: a */
    public final C5710e mo12203a() {
        if (!TextUtils.isEmpty(this.f17191c)) {
            return new C5710e(new ThreadPoolExecutor(this.f17189a, this.f17190b, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C5709d(this.f17191c, this.f17192d)));
        }
        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: ".concat(String.valueOf(this.f17191c)));
    }
}
