package com.facebook.litho;

import android.content.Context;
import com.facebook.p313c.C6062u;
import com.facebook.p313c.C6063v;

/* renamed from: com.facebook.litho.du */
/* compiled from: PG */
public final class C6201du extends C6063v {

    /* renamed from: a */
    public final C6185de f18345a;

    /* renamed from: a */
    public final Object mo12656a(Context context) {
        return this.f18345a.f18255e.mo12797P(context);
    }

    /* renamed from: b */
    public final Object mo12657b() {
        return this.f18345a.f18255e.getClass();
    }

    public C6201du(C6185de deVar) {
        if (deVar != null) {
            C6062u[] uVarArr = {new C6062u(this, C6200dt.f18344a)};
            for (int i = 0; i <= 0; i++) {
                mo12659e(uVarArr[i]);
            }
            mo12658d(new C6062u(this, C6199ds.f18343a));
            this.f18345a = deVar;
            return;
        }
        throw new IllegalArgumentException("Null output used for LithoRenderUnit.");
    }
}
