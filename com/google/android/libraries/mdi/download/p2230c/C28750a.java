package com.google.android.libraries.mdi.download.p2230c;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.mdi.download.c.a */
/* compiled from: PG */
public final class C28750a extends C28774i {

    /* renamed from: a */
    public C58833ax f78164a = C58836b.f156633a;

    /* renamed from: b */
    private String f78165b;

    /* renamed from: a */
    public final C28775j mo34363a() {
        String str = this.f78165b;
        if (str != null) {
            return new C28753b(str, this.f78164a);
        }
        throw new IllegalStateException("Missing required properties: url");
    }

    /* renamed from: b */
    public final void mo34364b(String str) {
        if (str != null) {
            this.f78165b = str;
            return;
        }
        throw new NullPointerException("Null url");
    }
}
