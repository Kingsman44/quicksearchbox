package com.google.android.libraries.search.p2871b.p2888c;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.search.b.c.c */
/* compiled from: PG */
public final class C37220c extends C37218a {

    /* renamed from: a */
    public int f98885a;

    /* renamed from: b */
    public ExecutorService f98886b;

    /* renamed from: c */
    public C58833ax f98887c = C58836b.f156633a;

    /* renamed from: d */
    public byte f98888d;

    /* renamed from: a */
    public final C37219b mo40699a() {
        ExecutorService executorService;
        if (this.f98888d == 1 && (executorService = this.f98886b) != null) {
            return new C37221d(this.f98885a, executorService, this.f98887c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f98888d == 0) {
            sb.append(" maxEventsInMemory");
        }
        if (this.f98886b == null) {
            sb.append(" loggingExecutorService");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
