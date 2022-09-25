package com.google.android.libraries.gsa.conversation.p1852f;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.gsa.conversation.f.d */
/* compiled from: PG */
public final class C22577d extends C22590q {

    /* renamed from: a */
    public C58833ax f62214a;

    /* renamed from: b */
    public C58833ax f62215b;

    /* renamed from: c */
    public int f62216c;

    /* renamed from: d */
    public int f62217d;

    /* renamed from: e */
    private boolean f62218e;

    /* renamed from: f */
    private byte f62219f;

    public C22577d() {
        C58836b bVar = C58836b.f156633a;
        this.f62214a = bVar;
        this.f62215b = bVar;
    }

    /* renamed from: a */
    public final C22591r mo27676a() {
        int i;
        int i2;
        if (this.f62219f == 1 && (i = this.f62216c) != 0 && (i2 = this.f62217d) != 0) {
            return new C22578e(this.f62218e, i, this.f62214a, this.f62215b, i2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f62219f == 0) {
            sb.append(" isFromServer");
        }
        if (this.f62216c == 0) {
            sb.append(" recognizerMode");
        }
        if (this.f62217d == 0) {
            sb.append(" openMicMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo27677b(boolean z) {
        this.f62218e = z;
        this.f62219f = 1;
    }
}
