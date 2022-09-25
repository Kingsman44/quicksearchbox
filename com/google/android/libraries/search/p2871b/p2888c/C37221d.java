package com.google.android.libraries.search.p2871b.p2888c;

import com.google.common.base.C58833ax;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.search.b.c.d */
/* compiled from: PG */
final class C37221d extends C37219b {

    /* renamed from: a */
    private final int f98889a;

    /* renamed from: b */
    private final ExecutorService f98890b;

    /* renamed from: c */
    private final C58833ax f98891c;

    public C37221d(int i, ExecutorService executorService, C58833ax axVar) {
        this.f98889a = i;
        this.f98890b = executorService;
        this.f98891c = axVar;
    }

    /* renamed from: a */
    public final int mo40700a() {
        return this.f98889a;
    }

    /* renamed from: c */
    public final C58833ax mo40701c() {
        return this.f98891c;
    }

    /* renamed from: d */
    public final ExecutorService mo40702d() {
        return this.f98890b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37219b) {
            C37219b bVar = (C37219b) obj;
            return this.f98889a == bVar.mo40700a() && this.f98890b.equals(bVar.mo40702d()) && this.f98891c.equals(bVar.mo40701c());
        }
    }

    public final int hashCode() {
        return ((((this.f98889a ^ 1000003) * 1000003) ^ this.f98890b.hashCode()) * 1000003) ^ this.f98891c.hashCode();
    }

    public final String toString() {
        int i = this.f98889a;
        String obj = this.f98890b.toString();
        String valueOf = String.valueOf(this.f98891c);
        return "AppFlowLoggerConfiguration{maxEventsInMemory=" + i + ", loggingExecutorService=" + obj + ", backgroundExecutorService=" + valueOf + "}";
    }
}
