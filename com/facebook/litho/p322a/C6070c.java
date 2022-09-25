package com.facebook.litho.p322a;

import com.facebook.litho.C6185de;
import com.facebook.litho.C6248ev;

/* renamed from: com.facebook.litho.a.c */
/* compiled from: PG */
final class C6070c implements C6076i {
    /* renamed from: a */
    public final float mo12760a(Object obj) {
        return C6075h.m15767b(obj, this).getRotation();
    }

    /* renamed from: b */
    public final String mo12761b() {
        return "rotation";
    }

    /* renamed from: c */
    public final void mo12762c(Object obj) {
        C6075h.m15767b(obj, this).setRotation(0.0f);
    }

    /* renamed from: d */
    public final void mo12763d(Object obj, float f) {
        C6075h.m15767b(obj, this).setRotation(f);
    }

    /* renamed from: e */
    public final float mo12764e(C6185de deVar) {
        C6248ev evVar = deVar.f18253c;
        if (evVar == null || !evVar.mo13070al()) {
            return 0.0f;
        }
        return evVar.mo13086c();
    }
}
