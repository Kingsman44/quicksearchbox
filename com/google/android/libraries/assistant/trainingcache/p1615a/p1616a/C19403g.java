package com.google.android.libraries.assistant.trainingcache.p1615a.p1616a;

import com.google.protobuf.C63088z;
import java.io.File;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.trainingcache.a.a.g */
/* compiled from: PG */
public final class C19403g extends C19421y {

    /* renamed from: a */
    public File f54292a;

    /* renamed from: b */
    public File f54293b;

    /* renamed from: c */
    private boolean f54294c;

    /* renamed from: d */
    private boolean f54295d;

    /* renamed from: e */
    private boolean f54296e;

    /* renamed from: f */
    private boolean f54297f;

    /* renamed from: g */
    private Optional f54298g = Optional.empty();

    /* renamed from: h */
    private Optional f54299h = Optional.empty();

    /* renamed from: i */
    private Optional f54300i = Optional.empty();

    /* renamed from: j */
    private C63088z f54301j;

    /* renamed from: k */
    private byte f54302k;

    /* renamed from: a */
    public final C19422z mo24575a() {
        File file;
        File file2;
        C63088z zVar;
        if (this.f54302k == 15 && (file = this.f54292a) != null && (file2 = this.f54293b) != null && (zVar = this.f54301j) != null) {
            return new C19404h(this.f54294c, this.f54295d, this.f54296e, this.f54297f, this.f54298g, this.f54299h, this.f54300i, file, file2, zVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f54302k & 1) == 0) {
            sb.append(" trainingOptinEnabled");
        }
        if ((this.f54302k & 2) == 0) {
            sb.append(" asrFineTuningFlagEnabled");
        }
        if ((this.f54302k & 4) == 0) {
            sb.append(" lmFineTuningFlagEnabled");
        }
        if ((this.f54302k & 8) == 0) {
            sb.append(" sheldonDebugEnabled");
        }
        if (this.f54292a == null) {
            sb.append(" asrBrellaOutputDir");
        }
        if (this.f54293b == null) {
            sb.append(" lmBrellaOutputDir");
        }
        if (this.f54301j == null) {
            sb.append(" trainingContext");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo24576b(boolean z) {
        this.f54295d = z;
        this.f54302k = (byte) (this.f54302k | 2);
    }

    /* renamed from: c */
    public final void mo24577c(Optional optional) {
        if (optional != null) {
            this.f54299h = optional;
            return;
        }
        throw new NullPointerException("Null asrLcPlanFile");
    }

    /* renamed from: d */
    public final void mo24578d(boolean z) {
        this.f54296e = z;
        this.f54302k = (byte) (this.f54302k | 4);
    }

    /* renamed from: e */
    public final void mo24579e(Optional optional) {
        if (optional != null) {
            this.f54300i = optional;
            return;
        }
        throw new NullPointerException("Null lmLcPlanFile");
    }

    /* renamed from: f */
    public final void mo24580f(boolean z) {
        this.f54297f = z;
        this.f54302k = (byte) (this.f54302k | 8);
    }

    /* renamed from: g */
    public final void mo24581g(Optional optional) {
        if (optional != null) {
            this.f54298g = optional;
            return;
        }
        throw new NullPointerException("Null sodaLpResourcesDir");
    }

    /* renamed from: h */
    public final void mo24582h(C63088z zVar) {
        if (zVar != null) {
            this.f54301j = zVar;
            return;
        }
        throw new NullPointerException("Null trainingContext");
    }

    /* renamed from: i */
    public final void mo24583i(boolean z) {
        this.f54294c = z;
        this.f54302k = (byte) (this.f54302k | 1);
    }
}
