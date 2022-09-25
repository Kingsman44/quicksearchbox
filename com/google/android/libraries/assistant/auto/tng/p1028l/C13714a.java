package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.a */
/* compiled from: PG */
public final class C13714a extends C13752be {

    /* renamed from: a */
    public C60870cx f41825a;

    /* renamed from: b */
    public C60870cx f41826b;

    /* renamed from: c */
    public C58817ah f41827c;

    /* renamed from: d */
    public Optional f41828d = Optional.empty();

    /* renamed from: a */
    public final C13753bf mo21229a() {
        C60870cx cxVar;
        C58817ah ahVar;
        C60870cx cxVar2 = this.f41825a;
        if (cxVar2 != null && (cxVar = this.f41826b) != null && (ahVar = this.f41827c) != null) {
            return new C13743b(cxVar2, cxVar, ahVar, this.f41828d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f41825a == null) {
            sb.append(" response");
        }
        if (this.f41826b == null) {
            sb.append(" executionComplete");
        }
        if (this.f41827c == null) {
            sb.append(" cancelFunction");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
