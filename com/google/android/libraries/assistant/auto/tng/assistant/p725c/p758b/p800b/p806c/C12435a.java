package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13068n;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a */
/* compiled from: PG */
public final class C12435a extends C12478d {

    /* renamed from: a */
    public C12093d f39298a;

    /* renamed from: b */
    public C12991i f39299b;

    /* renamed from: c */
    public C60870cx f39300c;

    /* renamed from: d */
    private C13068n f39301d;

    public C12435a() {
    }

    public C12435a(C12479e eVar) {
        C12476b bVar = (C12476b) eVar;
        this.f39298a = bVar.f39371a;
        this.f39299b = bVar.f39372b;
        this.f39301d = bVar.f39373c;
        this.f39300c = bVar.f39374d;
    }

    /* renamed from: a */
    public final C12479e mo20608a() {
        C12991i iVar;
        C13068n nVar;
        C60870cx cxVar;
        C12093d dVar = this.f39298a;
        if (dVar != null && (iVar = this.f39299b) != null && (nVar = this.f39301d) != null && (cxVar = this.f39300c) != null) {
            return new C12476b(dVar, iVar, nVar, cxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f39298a == null) {
            sb.append(" audioClient");
        }
        if (this.f39299b == null) {
            sb.append(" assistantRequestConfig");
        }
        if (this.f39301d == null) {
            sb.append(" messageInputParams");
        }
        if (this.f39300c == null) {
            sb.append(" lastInteractionState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo20609b(C13068n nVar) {
        if (nVar != null) {
            this.f39301d = nVar;
            return;
        }
        throw new NullPointerException("Null messageInputParams");
    }
}
