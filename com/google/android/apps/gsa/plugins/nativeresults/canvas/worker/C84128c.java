package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import com.google.android.libraries.componentview.services.application.LogData;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.c */
/* compiled from: PG */
public final class C84128c extends C84127b {

    /* renamed from: a */
    private LogData f229051a;

    /* renamed from: b */
    private boolean f229052b;

    /* renamed from: c */
    private byte f229053c;

    /* renamed from: a */
    public final AgsaLogData mo77556a() {
        LogData logData;
        if (this.f229053c == 1 && (logData = this.f229051a) != null) {
            return new AutoValue_AgsaLogData(logData, this.f229052b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f229051a == null) {
            sb.append(" logData");
        }
        if (this.f229053c == 0) {
            sb.append(" setSqi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77557b(LogData logData) {
        if (logData != null) {
            this.f229051a = logData;
            return;
        }
        throw new NullPointerException("Null logData");
    }

    /* renamed from: c */
    public final void mo77558c(boolean z) {
        this.f229052b = z;
        this.f229053c = 1;
    }
}
