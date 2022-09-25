package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2645bg;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p137a.C2711b;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;

/* renamed from: com.google.android.h.a.b.a.m */
/* compiled from: PG */
public final class C146570m extends C146579j implements Runnable {

    /* renamed from: b */
    private final Handler f395820b = new Handler(C2612ak.m6923F(), (Handler.Callback) null);

    /* renamed from: c */
    private boolean f395821c;

    /* renamed from: d */
    private boolean f395822d;

    /* renamed from: e */
    private boolean f395823e;

    /* renamed from: f */
    private boolean f395824f;

    /* renamed from: g */
    private boolean f395825g;

    /* renamed from: h */
    private int f395826h = 1;

    /* renamed from: i */
    private boolean f395827i;

    /* renamed from: j */
    private boolean f395828j;

    /* renamed from: k */
    private boolean f395829k;

    /* renamed from: l */
    private String f395830l;

    /* renamed from: u */
    private final void m238724u(long j, String str) {
        C146580k kVar = this.f395862a;
        StringBuilder b = kVar.mo123372b(j);
        b.append(str);
        kVar.mo123373c("vps", Uri.encode(b.toString(), ",:"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (true != r8.f395829k) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (true != "EN".equals(r0)) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m238725v(long r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f395830l
            java.lang.String r1 = "N"
            if (r0 != 0) goto L_0x000d
            r8.f395830l = r1
            r2 = 0
            r8.m238724u(r2, r1)
        L_0x000d:
            java.lang.String r0 = r8.f395830l
            boolean r2 = r8.f395823e
            java.lang.String r3 = "EN"
            r4 = 1
            if (r2 == 0) goto L_0x0021
            boolean r0 = r3.equals(r0)
            if (r4 == r0) goto L_0x001e
            goto L_0x0077
        L_0x001e:
            r1 = r3
            goto L_0x0077
        L_0x0021:
            boolean r2 = r8.f395821c
            if (r2 == 0) goto L_0x002c
            boolean r2 = r8.f395822d
            if (r2 == 0) goto L_0x002c
            java.lang.String r1 = "S"
            goto L_0x0077
        L_0x002c:
            boolean r2 = r8.f395828j
            if (r2 == 0) goto L_0x0033
            java.lang.String r1 = "ER"
            goto L_0x0077
        L_0x0033:
            boolean r2 = r8.f395822d
            java.lang.String r5 = "PB"
            if (r2 != 0) goto L_0x0040
            boolean r0 = r8.f395829k
            if (r4 == r0) goto L_0x003e
            goto L_0x0077
        L_0x003e:
            r1 = r5
            goto L_0x0077
        L_0x0040:
            boolean r2 = r8.f395824f
            java.lang.String r6 = "SU"
            if (r2 == 0) goto L_0x0048
        L_0x0046:
            r1 = r6
            goto L_0x0077
        L_0x0048:
            int r2 = r8.f395826h
            r7 = 4
            if (r2 != r7) goto L_0x004e
            goto L_0x001e
        L_0x004e:
            r3 = 2
            if (r2 != r3) goto L_0x005c
            boolean r0 = r8.f395825g
            if (r0 == 0) goto L_0x003e
            boolean r0 = r8.f395827i
            if (r4 == r0) goto L_0x0046
            java.lang.String r1 = "B"
            goto L_0x0077
        L_0x005c:
            r3 = 3
            if (r2 != r3) goto L_0x006d
            boolean r0 = r8.f395825g
            if (r0 == 0) goto L_0x006a
            boolean r0 = r8.f395827i
            if (r4 == r0) goto L_0x0046
            java.lang.String r1 = "PL"
            goto L_0x0077
        L_0x006a:
            java.lang.String r1 = "PA"
            goto L_0x0077
        L_0x006d:
            if (r2 != r4) goto L_0x0076
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0076
            goto L_0x0046
        L_0x0076:
            r1 = r0
        L_0x0077:
            java.lang.String r0 = r8.f395830l
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            return
        L_0x0080:
            r8.f395830l = r1
            r8.m238724u(r9, r1)
            android.os.Handler r9 = r8.f395820b
            r9.removeCallbacks(r8)
            android.os.Handler r9 = r8.f395820b
            r0 = 600000(0x927c0, double:2.964394E-318)
            r9.postDelayed(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p10890h.p10891a.p10893b.p10894a.C146570m.m238725v(long):void");
    }

    /* renamed from: a */
    public final void mo95067a(C2711b bVar) {
        this.f395822d = true;
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("vps");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo95070d() {
        this.f395820b.postDelayed(this, 600000);
    }

    /* renamed from: g */
    public final void mo123352g(long j, boolean z) {
        this.f395824f = false;
        if (z) {
            this.f395826h = 4;
            m238725v(j);
        }
        this.f395823e = true;
        m238725v(j);
        this.f395820b.removeCallbacks(this);
    }

    /* renamed from: i */
    public final void mo123364i(C2711b bVar, int i, boolean z) {
        this.f395827i = i != 0;
        m238725v(bVar.f7527a);
    }

    /* renamed from: j */
    public final void mo123361j(C2711b bVar, C2639ba baVar, boolean z) {
        if (z) {
            this.f395828j = true;
            this.f395824f = false;
            this.f395821c = false;
            m238725v(bVar.f7527a);
        }
    }

    /* renamed from: k */
    public final void mo123355k(C2711b bVar, boolean z, int i, boolean z2) {
        this.f395825g = z;
        this.f395826h = i;
        if (i != 1) {
            this.f395828j = false;
        }
        if (i != 2) {
            this.f395821c = false;
        }
        if (i == 1 || i == 4) {
            this.f395824f = false;
        }
        m238725v(bVar.f7527a);
    }

    /* renamed from: l */
    public final void mo123356l(C2711b bVar, C2645bg bgVar, C2645bg bgVar2, int i, boolean z, boolean z2) {
        if (i == 1 && this.f395826h != 1) {
            this.f395821c = true;
        }
        if (z2) {
            this.f395824f = false;
        }
        m238725v(bVar.f7527a);
    }

    /* renamed from: m */
    public final void mo123367m(C2711b bVar) {
        this.f395824f = true;
        this.f395821c = false;
        m238725v(bVar.f7527a);
    }

    /* renamed from: q */
    public final void mo123366q(C2711b bVar, boolean z) {
        if (z) {
            this.f395829k = true;
            m238725v(bVar.f7527a);
        }
    }

    public final void run() {
        if (this.f395830l != null) {
            m238724u(SystemClock.elapsedRealtime(), this.f395830l);
        }
        this.f395820b.postDelayed(this, 600000);
    }
}
