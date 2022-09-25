package com.google.apps.tiktok.concurrent;

import android.content.Context;
import android.util.SparseArray;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.apps.tiktok.concurrent.l */
/* compiled from: PG */
public final class C46460l {

    /* renamed from: a */
    public static final C59071e f121576a = C59071e.m91332i("com.google.apps.tiktok.concurrent.l");

    /* renamed from: b */
    public static final SettableFuture f121577b;

    /* renamed from: c */
    public final AtomicLong f121578c = new AtomicLong(0);

    /* renamed from: d */
    public final Object f121579d = new Object();

    /* renamed from: e */
    public final ConcurrentHashMap f121580e = new ConcurrentHashMap(10, 0.75f, 4);

    /* renamed from: f */
    public final SparseArray f121581f = new SparseArray();

    /* renamed from: g */
    public final SparseArray f121582g = new SparseArray();

    /* renamed from: h */
    public final UUID f121583h = UUID.randomUUID();

    /* renamed from: i */
    public final Context f121584i;

    static {
        SettableFuture settableFuture = new SettableFuture();
        f121577b = settableFuture;
        settableFuture.mo57356n(new Object());
    }

    public C46460l(Context context) {
        this.f121584i = context;
    }

    /* renamed from: a */
    public static long m82834a(int i, long j) {
        return ((long) ((int) (j & 4294967295L))) | (((long) i) << 32);
    }
}
