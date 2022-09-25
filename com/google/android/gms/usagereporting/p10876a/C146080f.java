package com.google.android.gms.usagereporting.p10876a;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: com.google.android.gms.usagereporting.a.f */
/* compiled from: PG */
public final class C146080f implements C143711ad {

    /* renamed from: a */
    public final Status f394803a;

    /* renamed from: b */
    private final UsageReportingOptInOptions f394804b;

    public C146080f(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        this.f394803a = status;
        this.f394804b = usageReportingOptInOptions;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394803a;
    }

    /* renamed from: b */
    public final boolean mo122604b() {
        C143919bh.m233958a(this.f394804b);
        return this.f394804b.f394797a == 1;
    }

    public final String toString() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.f394804b.f394797a != 1) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        return String.format("OptInOptionsResultImpl[%s]", objArr);
    }
}
