package com.google.android.gms.auth.api.signin.p10742a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.auth.api.signin.a.a */
/* compiled from: PG */
public final class C142885a {

    /* renamed from: a */
    public static final Lock f387699a = new ReentrantLock();

    /* renamed from: b */
    public static C142885a f387700b;

    /* renamed from: c */
    private final Lock f387701c = new ReentrantLock();

    /* renamed from: d */
    private final SharedPreferences f387702d;

    public C142885a(Context context) {
        this.f387702d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public final String mo117803a(String str) {
        this.f387701c.lock();
        try {
            return this.f387702d.getString(str, (String) null);
        } finally {
            this.f387701c.unlock();
        }
    }
}
