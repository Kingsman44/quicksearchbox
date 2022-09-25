package com.google.android.gms.usagereporting.p10876a;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.usagereporting.a.j */
/* compiled from: PG */
final class C146084j extends C146083i {
    /* renamed from: c */
    public final void mo122594c(Status status) {
        if (!status.mo119097c()) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(String.valueOf(String.valueOf(status))));
        }
    }
}
