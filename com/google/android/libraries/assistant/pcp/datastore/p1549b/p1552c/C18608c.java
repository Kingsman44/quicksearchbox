package com.google.android.libraries.assistant.pcp.datastore.p1549b.p1552c;

import com.google.android.libraries.assistant.pcp.p1575l.p1577b.C18956e;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.b.c.c */
/* compiled from: PG */
public final class C18608c {

    /* renamed from: a */
    public final C42876ab f52632a;

    /* renamed from: b */
    public final C18956e f52633b;

    public C18608c(C42876ab abVar, C18956e eVar) {
        this.f52632a = abVar;
        this.f52633b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo24077a(Set set, C63042fg fgVar) {
        if (set.isEmpty()) {
            return C60866ct.f164955a;
        }
        return this.f52632a.mo46039a(new C18606a(this, set, fgVar), C60826bg.f164896a);
    }
}
