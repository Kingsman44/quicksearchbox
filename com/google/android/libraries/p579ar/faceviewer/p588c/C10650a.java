package com.google.android.libraries.p579ar.faceviewer.p588c;

import com.google.android.libraries.p579ar.faceviewer.C10649c;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* renamed from: com.google.android.libraries.ar.faceviewer.c.a */
/* compiled from: PG */
public final class C10650a extends C10653d {

    /* renamed from: a */
    public final C10656g f35545a;

    /* renamed from: b */
    public final Executor f35546b;

    /* renamed from: c */
    public final Executor f35547c;

    /* renamed from: d */
    public final CronetEngine f35548d;

    /* renamed from: e */
    public final C10649c f35549e;

    /* renamed from: f */
    private final Executor f35550f;

    public C10650a(C10649c cVar, C10656g gVar, Executor executor, Executor executor2, Executor executor3, CronetEngine cronetEngine) {
        if (cVar != null) {
            this.f35549e = cVar;
            this.f35545a = gVar;
            if (executor != null) {
                this.f35550f = executor;
                if (executor2 != null) {
                    this.f35546b = executor2;
                    if (executor3 != null) {
                        this.f35547c = executor3;
                        if (cronetEngine != null) {
                            this.f35548d = cronetEngine;
                            return;
                        }
                        throw new NullPointerException("Null cronetEngine");
                    }
                    throw new NullPointerException("Null lightweightExecutor");
                }
                throw new NullPointerException("Null backgroundExecutor");
            }
            throw new NullPointerException("Null mainExecutor");
        }
        throw new NullPointerException("Null API");
    }

    /* renamed from: a */
    public final C10656g mo18680a() {
        return this.f35545a;
    }

    /* renamed from: b */
    public final Executor mo18681b() {
        return this.f35546b;
    }

    /* renamed from: c */
    public final Executor mo18682c() {
        return this.f35547c;
    }

    /* renamed from: d */
    public final Executor mo18683d() {
        return this.f35550f;
    }

    /* renamed from: e */
    public final CronetEngine mo18684e() {
        return this.f35548d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10653d) {
            C10653d dVar = (C10653d) obj;
            return this.f35549e.equals(dVar.mo18686f()) && this.f35545a.equals(dVar.mo18680a()) && this.f35550f.equals(dVar.mo18683d()) && this.f35546b.equals(dVar.mo18681b()) && this.f35547c.equals(dVar.mo18682c()) && this.f35548d.equals(dVar.mo18684e());
        }
    }

    /* renamed from: f */
    public final C10649c mo18686f() {
        return this.f35549e;
    }

    public final int hashCode() {
        return ((((((((((this.f35549e.hashCode() ^ 1000003) * 1000003) ^ this.f35545a.hashCode()) * 1000003) ^ this.f35550f.hashCode()) * 1000003) ^ this.f35546b.hashCode()) * 1000003) ^ this.f35547c.hashCode()) * 1000003) ^ this.f35548d.hashCode();
    }

    public final String toString() {
        String obj = this.f35549e.toString();
        String obj2 = this.f35545a.toString();
        String obj3 = this.f35550f.toString();
        String obj4 = this.f35546b.toString();
        String obj5 = this.f35547c.toString();
        String obj6 = this.f35548d.toString();
        return "FaceViewerContext{API=" + obj + ", model=" + obj2 + ", mainExecutor=" + obj3 + ", backgroundExecutor=" + obj4 + ", lightweightExecutor=" + obj5 + ", cronetEngine=" + obj6 + "}";
    }
}
