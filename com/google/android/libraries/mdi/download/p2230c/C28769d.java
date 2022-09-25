package com.google.android.libraries.mdi.download.p2230c;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.libraries.mdi.download.c.d */
/* compiled from: PG */
final class C28769d extends C28777l {

    /* renamed from: a */
    public C58528ij f78209a;

    /* renamed from: b */
    private boolean f78210b;

    /* renamed from: c */
    private byte f78211c;

    /* renamed from: a */
    public final C28779n mo34381a() {
        if (this.f78209a == null) {
            this.f78209a = C58733pz.f156496a;
        }
        if (this.f78211c == 1) {
            return new C28770e(this.f78210b, this.f78209a);
        }
        throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
    }

    /* renamed from: b */
    public final void mo34382b(boolean z) {
        this.f78210b = z;
        this.f78211c = 1;
    }
}
