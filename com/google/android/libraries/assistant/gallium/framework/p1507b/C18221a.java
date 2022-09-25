package com.google.android.libraries.assistant.gallium.framework.p1507b;

import com.google.android.libraries.assistant.gallium.framework.C18207ak;
import com.google.android.libraries.assistant.gallium.framework.C18240h;
import com.google.android.libraries.assistant.gallium.framework.C18307j;
import com.google.android.libraries.assistant.gallium.framework.C18308k;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.b.a */
/* compiled from: PG */
public final class C18221a extends C18227e {

    /* renamed from: a */
    public C18308k f51756a;

    /* renamed from: b */
    public C18240h f51757b;

    /* renamed from: c */
    public C18225c f51758c;

    /* renamed from: d */
    public C18307j f51759d;

    /* renamed from: e */
    public boolean f51760e;

    /* renamed from: f */
    public C58485gu f51761f;

    /* renamed from: g */
    public String f51762g;

    /* renamed from: h */
    public Optional f51763h = Optional.empty();

    /* renamed from: i */
    public byte f51764i;

    /* renamed from: j */
    private C18207ak f51765j;

    /* renamed from: k */
    private boolean f51766k;

    /* renamed from: l */
    private Executor f51767l;

    /* renamed from: a */
    public final C18228f mo23706a() {
        C18207ak akVar;
        C18308k kVar;
        C18240h hVar;
        C18225c cVar;
        C18307j jVar;
        Executor executor;
        C58485gu guVar;
        String str;
        if (this.f51764i == 3 && (akVar = this.f51765j) != null && (kVar = this.f51756a) != null && (hVar = this.f51757b) != null && (cVar = this.f51758c) != null && (jVar = this.f51759d) != null && (executor = this.f51767l) != null && (guVar = this.f51761f) != null && (str = this.f51762g) != null) {
            return new C18224b(akVar, kVar, hVar, cVar, jVar, executor, this.f51760e, this.f51766k, guVar, str, this.f51763h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f51765j == null) {
            sb.append(" interfaceRegistry");
        }
        if (this.f51756a == null) {
            sb.append(" cppTracerProvider");
        }
        if (this.f51757b == null) {
            sb.append(" cppInterfaceRegistryProvider");
        }
        if (this.f51758c == null) {
            sb.append(" cppDeploymentConfigProvider");
        }
        if (this.f51759d == null) {
            sb.append(" cppResourceLoader");
        }
        if ((this.f51764i & 1) == 0) {
            sb.append(" enableLifetimeControl");
        }
        if ((this.f51764i & 2) == 0) {
            sb.append(" enableBoundedNativeThreadPool");
        }
        if (this.f51767l == null) {
            sb.append(" executor");
        }
        if (this.f51761f == null) {
            sb.append(" requestProcessors");
        }
        if (this.f51762g == null) {
            sb.append(" appVersionName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo23707b(String str) {
        if (str != null) {
            this.f51762g = str;
            return;
        }
        throw new NullPointerException("Null appVersionName");
    }

    /* renamed from: c */
    public final void mo23708c(boolean z) {
        this.f51766k = z;
        this.f51764i = (byte) (this.f51764i | 2);
    }

    /* renamed from: d */
    public final void mo23709d(Executor executor) {
        if (executor != null) {
            this.f51767l = executor;
            return;
        }
        throw new NullPointerException("Null executor");
    }

    /* renamed from: e */
    public final void mo23710e(C18207ak akVar) {
        if (akVar != null) {
            this.f51765j = akVar;
            return;
        }
        throw new NullPointerException("Null interfaceRegistry");
    }
}
