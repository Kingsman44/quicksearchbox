package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.android.libraries.search.assistant.invocation.p2587a.p2588a.C33486d;
import com.google.common.base.C58810aa;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.r */
/* compiled from: PG */
class C121866r extends C58810aa {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17535b(Object obj) {
        C33486d dVar = (C33486d) obj;
        C121830am amVar = C121830am.UNKNOWN;
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            return C121830am.UNKNOWN;
        }
        if (ordinal == 1) {
            return C121830am.VIS_NOT_IN_PROGRESS;
        }
        if (ordinal == 2) {
            return C121830am.ANDROID_SECURITY_EXCEPTION;
        }
        if (ordinal == 3) {
            return C121830am.INVALID_INVOCATION_TOKEN;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(dVar.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Object mo17536c(Object obj) {
        C121830am amVar = (C121830am) obj;
        C33486d dVar = C33486d.UNKNOWN;
        int ordinal = amVar.ordinal();
        if (ordinal == 0) {
            return C33486d.UNKNOWN;
        }
        if (ordinal == 1) {
            return C33486d.VIS_NOT_IN_PROGRESS;
        }
        if (ordinal == 2) {
            return C33486d.ANDROID_SECURITY_EXCEPTION;
        }
        if (ordinal == 3) {
            return C33486d.INVALID_INVOCATION_TOKEN;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(amVar.getNumber())));
    }
}
