package com.google.android.libraries.privatetelemetry.tqcobalt.p2452e;

import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32012f;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.e.a */
/* compiled from: PG */
public final class C32014a extends C32020c {

    /* renamed from: a */
    public C32012f f86027a;

    /* renamed from: b */
    public int f86028b;

    /* renamed from: c */
    private String f86029c;

    /* renamed from: d */
    private boolean f86030d;

    /* renamed from: e */
    private Duration f86031e;

    /* renamed from: f */
    private byte f86032f;

    /* renamed from: a */
    public final C32021d mo37783a() {
        C32012f fVar;
        int i;
        String str;
        Duration duration;
        if (this.f86032f == 1 && (fVar = this.f86027a) != null && (i = this.f86028b) != 0 && (str = this.f86029c) != null && (duration = this.f86031e) != null) {
            return new C32019b(fVar, i, str, this.f86030d, duration);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f86027a == null) {
            sb.append(" projectConfig");
        }
        if (this.f86028b == 0) {
            sb.append(" pipelineType");
        }
        if (this.f86029c == null) {
            sb.append(" internalHexApiKey");
        }
        if (this.f86032f == 0) {
            sb.append(" cobaltLoggerEnabled");
        }
        if (this.f86031e == null) {
            sb.append(" internalUploadingInterval");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo37784b(boolean z) {
        this.f86030d = z;
        this.f86032f = 1;
    }

    /* renamed from: c */
    public final void mo37785c() {
        this.f86029c = "ac2ec9ea034c103c";
    }

    /* renamed from: d */
    public final void mo37786d(Duration duration) {
        if (duration != null) {
            this.f86031e = duration;
            return;
        }
        throw new NullPointerException("Null internalUploadingInterval");
    }
}
