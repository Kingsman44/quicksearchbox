package com.facebook.litho.p322a;

import android.view.View;
import com.facebook.litho.C6185de;
import com.facebook.litho.C6248ev;

/* renamed from: com.facebook.litho.a.a */
/* compiled from: PG */
final class C6068a implements C6076i {
    /* renamed from: a */
    public final float mo12760a(Object obj) {
        if (obj instanceof View) {
            return ((View) obj).getAlpha();
        }
        throw new UnsupportedOperationException("Tried to get alpha of unsupported mount content: ".concat(obj.toString()));
    }

    /* renamed from: b */
    public final String mo12761b() {
        return "alpha";
    }

    /* renamed from: c */
    public final void mo12762c(Object obj) {
        mo12763d(obj, 1.0f);
    }

    /* renamed from: d */
    public final void mo12763d(Object obj, float f) {
        if (obj instanceof View) {
            ((View) obj).setAlpha(f);
            return;
        }
        throw new UnsupportedOperationException("Setting alpha on unsupported mount content: ".concat(String.valueOf(String.valueOf(obj))));
    }

    /* renamed from: e */
    public final float mo12764e(C6185de deVar) {
        C6248ev evVar = deVar.f18253c;
        if (evVar == null || !evVar.mo13068aj()) {
            return 1.0f;
        }
        return evVar.mo13085b();
    }
}
