package com.android.p275j;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.j.aa */
/* compiled from: PG */
final class C5187aa {

    /* renamed from: a */
    public static final boolean f16464a = C5188ab.f16468b;

    /* renamed from: b */
    private final List f16465b = new ArrayList();

    /* renamed from: c */
    private boolean f16466c = false;

    /* renamed from: a */
    public final synchronized void mo10274a(String str, long j) {
        if (!this.f16466c) {
            this.f16465b.add(new C5214z(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    /* renamed from: b */
    public final synchronized void mo10275b(String str) {
        long j;
        this.f16466c = true;
        if (this.f16465b.size() == 0) {
            j = 0;
        } else {
            long j2 = ((C5214z) this.f16465b.get(0)).f16544c;
            List list = this.f16465b;
            j = ((C5214z) list.get(list.size() - 1)).f16544c - j2;
        }
        if (j > 0) {
            long j3 = ((C5214z) this.f16465b.get(0)).f16544c;
            C5188ab.m14147b("(%-4d ms) %s", Long.valueOf(j), str);
            for (C5214z zVar : this.f16465b) {
                long j4 = zVar.f16544c;
                C5188ab.m14147b("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(zVar.f16543b), zVar.f16542a);
                j3 = j4;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (!this.f16466c) {
            mo10275b("Request on the loose");
            C5188ab.m14148c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
