package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p964a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13533i;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.a.b */
/* compiled from: PG */
public final class C13440b implements C13533i {

    /* renamed from: a */
    public final C15481g f41273a;

    /* renamed from: b */
    private final C13533i f41274b;

    /* renamed from: c */
    private final C13533i f41275c;

    /* renamed from: d */
    private final Executor f41276d;

    public C13440b(C13533i iVar, C13533i iVar2, Executor executor, C15481g gVar) {
        this.f41274b = iVar;
        this.f41275c = iVar2;
        this.f41276d = executor;
        this.f41273a = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo21092a(C13543s sVar) {
        C60870cx a = this.f41274b.mo21092a(sVar);
        C60870cx a2 = this.f41275c.mo21092a(sVar);
        return C47638k.m84751b(a, a2).mo51520a(new C13439a(this, sVar, a, a2), this.f41276d);
    }
}
