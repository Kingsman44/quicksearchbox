package com.google.android.apps.gsa.opaonboarding;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.opaonboarding.o */
/* compiled from: PG */
final class C83948o extends C83902bh {

    /* renamed from: a */
    public C58833ax f228682a = C58836b.f156633a;

    /* renamed from: b */
    private int f228683b;

    /* renamed from: c */
    private int f228684c;

    /* renamed from: d */
    private byte f228685d;

    /* renamed from: a */
    public final C83903bi mo77304a() {
        if (this.f228685d == 3) {
            return new C83949p(this.f228683b, this.f228682a, this.f228684c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f228685d & 1) == 0) {
            sb.append(" resultCode");
        }
        if ((this.f228685d & 2) == 0) {
            sb.append(" exitAnimationResId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77305b(int i) {
        this.f228684c = i;
        this.f228685d = (byte) (this.f228685d | 2);
    }

    /* renamed from: c */
    public final void mo77306c(int i) {
        this.f228683b = i;
        this.f228685d = (byte) (this.f228685d | 1);
    }
}
