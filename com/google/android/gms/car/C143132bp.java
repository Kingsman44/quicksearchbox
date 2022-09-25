package com.google.android.gms.car;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.android.gms.car.bp */
/* compiled from: PG */
public final class C143132bp {

    /* renamed from: a */
    public final Deque f388189a;

    /* renamed from: b */
    public final SparseArray f388190b = new SparseArray();

    /* renamed from: c */
    public final int f388191c;

    /* renamed from: d */
    public final int f388192d;

    public C143132bp(int i, int i2) {
        this.f388191c = i;
        this.f388192d = i2;
        this.f388189a = new ArrayDeque(i);
    }

    /* renamed from: a */
    public static int m232181a(int i) {
        if (i == 17) {
            return 66;
        }
        if (i == 33) {
            return 130;
        }
        if (i == 66) {
            return 17;
        }
        if (i == 130) {
            return 33;
        }
        throw new IllegalArgumentException("Unsupported direction: " + i);
    }

    /* renamed from: b */
    public static boolean m232182b(long j, int i) {
        if (i >= 0) {
            return i != 0 && SystemClock.elapsedRealtime() - j <= ((long) i);
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo118061c(long j, View view, View view2) {
        return (!m232182b(j, this.f388192d) || view == null || view2 == null) ? false : true;
    }
}
