package com.facebook.litho.p322a;

import android.view.View;
import com.facebook.litho.C6185de;
import com.facebook.litho.C6248ev;

/* renamed from: com.facebook.litho.a.d */
/* compiled from: PG */
final class C6071d implements C6076i {
    /* renamed from: a */
    public final float mo12760a(Object obj) {
        View b = C6075h.m15767b(obj, this);
        float scaleX = b.getScaleX();
        if (scaleX == b.getScaleY()) {
            return scaleX;
        }
        throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
    }

    /* renamed from: b */
    public final String mo12761b() {
        return "scale";
    }

    /* renamed from: c */
    public final void mo12762c(Object obj) {
        View b = C6075h.m15767b(obj, this);
        b.setScaleX(1.0f);
        b.setScaleY(1.0f);
    }

    /* renamed from: d */
    public final void mo12763d(Object obj, float f) {
        View b = C6075h.m15767b(obj, this);
        b.setScaleX(f);
        b.setScaleY(f);
    }

    /* renamed from: e */
    public final float mo12764e(C6185de deVar) {
        C6248ev evVar = deVar.f18253c;
        if (evVar == null || !evVar.mo13073ao()) {
            return 1.0f;
        }
        return evVar.mo13089f();
    }
}
