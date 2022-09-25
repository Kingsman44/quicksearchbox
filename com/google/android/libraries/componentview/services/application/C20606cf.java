package com.google.android.libraries.componentview.services.application;

import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import com.google.protobuf.MessageLite;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.services.application.cf */
/* compiled from: PG */
public abstract class C20606cf {

    /* renamed from: a */
    public static final C20577bd f57809a = C20577bd.m38612b("X-Protobuffer-Request-Payload");

    /* renamed from: b */
    public final C20579bf f57810b;

    /* renamed from: c */
    public final C60887da f57811c;

    /* renamed from: d */
    protected final MessageLite f57812d;

    public C20606cf(C20579bf bfVar, ExecutorService executorService, MessageLite messageLite) {
        this.f57810b = bfVar;
        this.f57811c = C60895di.m92995a(executorService);
        this.f57812d = messageLite;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo25493a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo25494b();
}
