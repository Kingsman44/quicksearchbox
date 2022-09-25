package com.google.android.libraries.gsa.conversation.clientop;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.b */
/* compiled from: PG */
public final class C22401b {

    /* renamed from: a */
    public C58833ax f61886a;

    /* renamed from: b */
    public C58833ax f61887b;

    /* renamed from: c */
    public C58833ax f61888c;

    /* renamed from: d */
    private boolean f61889d;

    /* renamed from: e */
    private byte[] f61890e;

    /* renamed from: f */
    private final C58833ax f61891f;

    /* renamed from: g */
    private byte f61892g;

    public C22401b() {
        C58836b bVar = C58836b.f156633a;
        this.f61886a = bVar;
        this.f61891f = bVar;
        this.f61887b = bVar;
        this.f61888c = bVar;
    }

    /* renamed from: a */
    public final C22434e mo27588a() {
        byte[] bArr;
        if (this.f61892g == 1 && (bArr = this.f61890e) != null) {
            return new C22407c(this.f61889d, bArr, this.f61886a, this.f61891f, this.f61887b, this.f61888c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f61892g == 0) {
            sb.append(" isFromServer");
        }
        if (this.f61890e == null) {
            sb.append(" deviceSpecificRendering");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo27589b(byte[] bArr) {
        if (bArr != null) {
            this.f61890e = bArr;
            return;
        }
        throw new NullPointerException("Null deviceSpecificRendering");
    }

    /* renamed from: c */
    public final void mo27590c(boolean z) {
        this.f61889d = z;
        this.f61892g = 1;
    }
}
