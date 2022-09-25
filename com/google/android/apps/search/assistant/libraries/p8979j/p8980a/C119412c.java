package com.google.android.apps.search.assistant.libraries.p8979j.p8980a;

import com.google.android.apps.gsa.p8867w.p8868a.C118730b;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.libraries.j.a.c */
/* compiled from: PG */
public final class C119412c {

    /* renamed from: a */
    public final boolean f332910a;

    /* renamed from: b */
    private final C121011a f332911b;

    /* renamed from: c */
    private final C118730b f332912c;

    public C119412c(C121011a aVar, C118730b bVar, boolean z) {
        this.f332911b = aVar;
        this.f332912c = bVar;
        this.f332910a = z;
    }

    /* renamed from: a */
    public final C60870cx mo104333a(C18460aw awVar) {
        if (!this.f332910a || !awVar.f52383b || !awVar.f52384c) {
            return C60856cj.m92900i(C119410a.m198134a(false, false));
        }
        C60870cx a = this.f332912c.mo103939a();
        C60870cx b = this.f332911b.mo104232b();
        C60870cx a2 = this.f332911b.mo104231a();
        return C47638k.m84753d(a, b, a2).mo51520a(new C119411b(this, a, b, a2, awVar), C60826bg.f164896a);
    }
}
