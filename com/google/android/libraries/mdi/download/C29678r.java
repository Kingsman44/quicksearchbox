package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.mdi.download.r */
/* compiled from: PG */
public final class C29678r extends C29651hv {

    /* renamed from: a */
    public String f80363a;

    /* renamed from: b */
    public C58833ax f80364b;

    /* renamed from: c */
    public C58833ax f80365c;

    /* renamed from: d */
    private boolean f80366d;

    /* renamed from: e */
    private byte f80367e;

    public C29678r() {
        C58836b bVar = C58836b.f156633a;
        this.f80364b = bVar;
        this.f80365c = bVar;
    }

    /* renamed from: a */
    public final C29652hw mo34789a() {
        String str;
        if (this.f80367e == 1 && (str = this.f80363a) != null) {
            return new C29679s(str, this.f80364b, this.f80365c, this.f80366d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f80363a == null) {
            sb.append(" groupName");
        }
        if (this.f80367e == 0) {
            sb.append(" pendingOnly");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo34790b(String str) {
        if (str != null) {
            this.f80363a = str;
            return;
        }
        throw new NullPointerException("Null groupName");
    }

    /* renamed from: c */
    public final void mo34791c(boolean z) {
        this.f80366d = z;
        this.f80367e = 1;
    }
}
