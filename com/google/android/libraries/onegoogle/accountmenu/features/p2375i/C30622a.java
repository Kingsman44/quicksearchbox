package com.google.android.libraries.onegoogle.accountmenu.features.p2375i;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.i.a */
/* compiled from: PG */
public final class C30622a extends C30625d {

    /* renamed from: a */
    public C58833ax f82720a = C58836b.f156633a;

    /* renamed from: b */
    private boolean f82721b;

    /* renamed from: c */
    private byte f82722c;

    /* renamed from: a */
    public final C30626e mo36343a() {
        if (this.f82722c == 1) {
            return new C30623b(this.f82721b, this.f82720a);
        }
        throw new IllegalStateException("Missing required properties: showForUnicorn");
    }

    /* renamed from: b */
    public final void mo36344b(boolean z) {
        this.f82721b = z;
        this.f82722c = 1;
    }
}
