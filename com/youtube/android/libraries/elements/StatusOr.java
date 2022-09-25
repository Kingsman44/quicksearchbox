package com.youtube.android.libraries.elements;

import androidx.p054b.p055a.p058c.C0895a;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* compiled from: PG */
public class StatusOr {
    public final boolean hasValue;
    public final Status status;
    public final Object value;

    private StatusOr(Status status2, Object obj, boolean z) {
        this.status = status2;
        this.value = obj;
        this.hasValue = z;
    }

    public static StatusOr fromStatus(Status status2) {
        if (!status2.mo61679g()) {
            return new StatusOr(status2, (Object) null, false);
        }
        throw new IllegalArgumentException("StatusOr with status OK must have a value. Please use fromValue(T value) instead.");
    }

    public static StatusOr fromValue(Object obj) {
        return new StatusOr(Status.f186902OK, obj, true);
    }

    /* renamed from: a */
    public final Object mo60269a(C0895a aVar) {
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        throw ((RuntimeException) aVar.mo523a(new C70761fa(this.status, (C70334de) null, true)));
    }
}
