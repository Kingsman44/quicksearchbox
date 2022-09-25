package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a */
/* compiled from: PG */
public final class C12626a extends C12691d {

    /* renamed from: a */
    public C12093d f39607a;

    /* renamed from: b */
    public C58833ax f39608b;

    /* renamed from: c */
    public C58833ax f39609c;

    /* renamed from: d */
    public C58833ax f39610d;

    /* renamed from: e */
    public C60870cx f39611e;

    /* renamed from: f */
    private C12991i f39612f;

    public C12626a() {
        C58836b bVar = C58836b.f156633a;
        this.f39608b = bVar;
        this.f39609c = bVar;
        this.f39610d = bVar;
    }

    /* renamed from: a */
    public final C12692e mo20706a() {
        C12991i iVar;
        C60870cx cxVar;
        C12093d dVar = this.f39607a;
        if (dVar != null && (iVar = this.f39612f) != null && (cxVar = this.f39611e) != null) {
            return new C12689b(dVar, this.f39608b, this.f39609c, iVar, this.f39610d, cxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f39607a == null) {
            sb.append(" audioClient");
        }
        if (this.f39612f == null) {
            sb.append(" assistantRequestConfig");
        }
        if (this.f39611e == null) {
            sb.append(" lastInteractionState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo20707b(C12991i iVar) {
        if (iVar != null) {
            this.f39612f = iVar;
            return;
        }
        throw new NullPointerException("Null assistantRequestConfig");
    }
}
