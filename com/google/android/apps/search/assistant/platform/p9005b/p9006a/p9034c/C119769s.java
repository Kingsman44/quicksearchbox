package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.c.s */
/* compiled from: PG */
final class C119769s {

    /* renamed from: a */
    public final long f333623a;

    /* renamed from: b */
    public final C51809dy f333624b;

    /* renamed from: c */
    public final C119908e f333625c;

    /* renamed from: d */
    public C60870cx f333626d;

    /* renamed from: e */
    final /* synthetic */ C119770t f333627e;

    public C119769s(C119770t tVar, long j, C51809dy dyVar, C119908e eVar) {
        this.f333627e = tVar;
        this.f333623a = j;
        this.f333624b = dyVar;
        this.f333625c = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo104512a() {
        synchronized (this) {
            C60870cx cxVar = this.f333626d;
            if (cxVar != null) {
                cxVar.cancel(false);
            } else {
                this.f333625c.mo104300b();
            }
        }
    }
}
