package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.mdi.download.p */
/* compiled from: PG */
public final class C29676p extends C29649ht {

    /* renamed from: a */
    public C58833ax f80357a;

    /* renamed from: b */
    private String f80358b;

    /* renamed from: c */
    private final C58833ax f80359c;

    public C29676p() {
        C58836b bVar = C58836b.f156633a;
        this.f80357a = bVar;
        this.f80359c = bVar;
    }

    /* renamed from: a */
    public final C29650hu mo34784a() {
        String str = this.f80358b;
        if (str != null) {
            return new C29677q(str, this.f80357a, this.f80359c);
        }
        throw new IllegalStateException("Missing required properties: groupName");
    }

    /* renamed from: b */
    public final void mo34785b(String str) {
        if (str != null) {
            this.f80358b = str;
            return;
        }
        throw new NullPointerException("Null groupName");
    }
}
