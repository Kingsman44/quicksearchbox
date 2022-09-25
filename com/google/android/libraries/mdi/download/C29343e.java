package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.mdi.download.e */
/* compiled from: PG */
public final class C29343e extends C28692a {

    /* renamed from: a */
    public C28708an f79532a;

    /* renamed from: b */
    public C58833ax f79533b;

    /* renamed from: c */
    public C58833ax f79534c;

    public C29343e() {
        C58836b bVar = C58836b.f156633a;
        this.f79533b = bVar;
        this.f79534c = bVar;
    }

    /* renamed from: a */
    public final C28721b mo34325a() {
        C28708an anVar = this.f79532a;
        if (anVar != null) {
            return new C29403f(anVar, this.f79533b, this.f79534c);
        }
        throw new IllegalStateException("Missing required properties: dataFileGroup");
    }

    /* renamed from: b */
    public final void mo34326b(C28708an anVar) {
        if (anVar != null) {
            this.f79532a = anVar;
            return;
        }
        throw new NullPointerException("Null dataFileGroup");
    }
}
