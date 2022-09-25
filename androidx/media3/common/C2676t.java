package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.media3.common.p136b.C2601a;

/* renamed from: androidx.media3.common.t */
/* compiled from: PG */
public final class C2676t {

    /* renamed from: a */
    private final SparseBooleanArray f7441a = new SparseBooleanArray();

    /* renamed from: b */
    private boolean f7442b;

    /* renamed from: a */
    public final C2677u mo6348a() {
        C2601a.m6832d(!this.f7442b);
        this.f7442b = true;
        return new C2677u(this.f7441a);
    }

    /* renamed from: b */
    public final void mo6349b(int i) {
        C2601a.m6832d(!this.f7442b);
        this.f7441a.append(i, true);
    }

    /* renamed from: c */
    public final void mo6350c(int... iArr) {
        for (int b : iArr) {
            mo6349b(b);
        }
    }

    /* renamed from: d */
    public final void mo6351d(int i, boolean z) {
        if (z) {
            mo6349b(i);
        }
    }
}
