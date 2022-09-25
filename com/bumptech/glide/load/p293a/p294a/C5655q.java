package com.bumptech.glide.load.p293a.p294a;

import android.graphics.Bitmap;
import com.bumptech.glide.p291h.C5632s;

/* renamed from: com.bumptech.glide.load.a.a.q */
/* compiled from: PG */
final class C5655q implements C5653o {

    /* renamed from: a */
    int f17037a;

    /* renamed from: b */
    public Bitmap.Config f17038b;

    /* renamed from: c */
    private final C5656r f17039c;

    public C5655q(C5656r rVar) {
        this.f17039c = rVar;
    }

    /* renamed from: a */
    public final void mo12124a() {
        this.f17039c.mo12112c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5655q) {
            C5655q qVar = (C5655q) obj;
            if (this.f17037a != qVar.f17037a || !C5632s.m14619l(this.f17038b, qVar.f17038b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17037a * 31;
        Bitmap.Config config = this.f17038b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C5657s.m14695b(this.f17037a, this.f17038b);
    }
}
