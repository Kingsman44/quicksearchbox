package com.google.android.apps.p8928i.p8932c.p8933a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.i.c.a.a */
/* compiled from: PG */
public final class C119150a extends C119154e {

    /* renamed from: a */
    public C58833ax f332317a = C58836b.f156633a;

    /* renamed from: b */
    private C119158i f332318b;

    /* renamed from: c */
    private boolean f332319c;

    /* renamed from: d */
    private byte f332320d;

    /* renamed from: a */
    public final C119155f mo104208a() {
        C119158i iVar;
        if (this.f332320d == 1 && (iVar = this.f332318b) != null) {
            return new C119151b(iVar, this.f332319c, this.f332317a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f332318b == null) {
            sb.append(" calleeId");
        }
        if (this.f332320d == 0) {
            sb.append(" isAudioOnly");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo104209b(C119158i iVar) {
        if (iVar != null) {
            this.f332318b = iVar;
            return;
        }
        throw new NullPointerException("Null calleeId");
    }

    /* renamed from: c */
    public final void mo104210c(boolean z) {
        this.f332319c = z;
        this.f332320d = 1;
    }
}
