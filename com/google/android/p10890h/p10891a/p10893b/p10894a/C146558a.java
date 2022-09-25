package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C2657bs;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p137a.C2711b;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;

/* renamed from: com.google.android.h.a.b.a.a */
/* compiled from: PG */
public final class C146558a extends C146579j implements Runnable {

    /* renamed from: b */
    private final Handler f395796b;

    /* renamed from: c */
    private long f395797c = -1;

    /* renamed from: d */
    private long f395798d = -1;

    /* renamed from: e */
    private long f395799e;

    /* renamed from: f */
    private long f395800f;

    public C146558a() {
        Handler handler = new Handler(C2612ak.m6923F(), (Handler.Callback) null);
        this.f395796b = handler;
        handler.postDelayed(this, 30000);
    }

    /* renamed from: u */
    private final void m238667u(C2711b bVar, boolean z, boolean z2) {
        long j = this.f395797c;
        if (j != -1 && z) {
            if (z2 || j != this.f395798d) {
                C146580k kVar = this.f395862a;
                StringBuilder b = kVar.mo123372b(bVar.f7527a);
                b.append(this.f395797c);
                kVar.mo123373c("bwe", Uri.encode(b.toString(), ",:"));
                this.f395798d = this.f395797c;
            }
        }
    }

    /* renamed from: v */
    private final void m238668v() {
        if (this.f395799e > 0 || this.f395800f > 0) {
            C146580k kVar = this.f395862a;
            StringBuilder b = kVar.mo123372b(SystemClock.elapsedRealtime());
            b.append(this.f395799e);
            b.append(':');
            b.append(C146580k.m238793a(this.f395800f));
            kVar.mo123373c("bwm", Uri.encode(b.toString(), ",:"));
            this.f395800f = 0;
            this.f395799e = 0;
        }
    }

    /* renamed from: b */
    public final void mo95068b(C2711b bVar, C2657bs bsVar, boolean z) {
        m238667u(bVar, z, true);
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("bwe");
        this.f395862a.mo123374d("bwm");
    }

    /* renamed from: f */
    public final void mo123351f(C2711b bVar, int i, long j, long j2, boolean z) {
        this.f395797c = j2 / 8;
        this.f395799e += j;
        this.f395800f += (long) i;
        m238667u(bVar, z, false);
    }

    /* renamed from: g */
    public final void mo123352g(long j, boolean z) {
        this.f395796b.removeCallbacks(this);
        m238668v();
    }

    /* renamed from: n */
    public final void mo123353n(C2711b bVar, boolean z) {
        m238667u(bVar, z, true);
    }

    public final void run() {
        m238668v();
        this.f395796b.postDelayed(this, 30000);
    }
}
