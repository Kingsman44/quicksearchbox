package com.google.apps.tiktok.tracing;

import android.support.p033v7.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.apps.tiktok.tracing.fx */
/* compiled from: PG */
final class C47843fx extends AtomicInteger {

    /* renamed from: a */
    public final String f123876a;

    /* renamed from: b */
    public final int f123877b;

    /* renamed from: c */
    public final C47563bn f123878c;

    /* renamed from: d */
    public int f123879d;

    /* renamed from: e */
    public C47843fx f123880e;

    /* renamed from: f */
    public volatile int f123881f;

    /* renamed from: g */
    int f123882g;

    /* renamed from: h */
    private final C47843fx f123883h;

    public C47843fx(C47843fx fxVar, String str, int i, C47563bn bnVar) {
        this.f123882g = 2;
        this.f123881f = 0;
        this.f123883h = fxVar;
        this.f123876a = str;
        this.f123879d = -1;
        this.f123877b = i;
        this.f123878c = bnVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo51668a() {
        C47843fx fxVar = this.f123883h;
        if (fxVar == null) {
            return -1;
        }
        return fxVar.f123879d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo51669b() {
        return this.f123881f != 0;
    }

    public C47843fx(String str, C47563bn bnVar, int i) {
        this.f123882g = 2;
        int i2 = 0;
        this.f123881f = 0;
        this.f123883h = null;
        this.f123876a = str;
        this.f123879d = 0;
        this.f123877b = 0;
        this.f123878c = bnVar;
        this.f123881f = i != 2 ? LinearLayoutManager.INVALID_OFFSET : i2;
    }
}
