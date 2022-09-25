package com.google.android.libraries.geller.portable;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.geller.portable.a */
/* compiled from: PG */
public final class C21880a extends C21949c {

    /* renamed from: a */
    public C58833ax f60401a = C58836b.f156633a;

    /* renamed from: b */
    private String f60402b;

    /* renamed from: a */
    public final C21952d mo27212a() {
        String str = this.f60402b;
        if (str != null) {
            return new C21948b(str, this.f60401a);
        }
        throw new IllegalStateException("Missing required properties: key");
    }

    /* renamed from: b */
    public final void mo27213b(String str) {
        if (str != null) {
            this.f60402b = str;
            return;
        }
        throw new NullPointerException("Null key");
    }
}
