package com.google.android.libraries.social.populous.p3289c.p3293d;

import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.p3289c.p3290a.C42210b;

/* renamed from: com.google.android.libraries.social.populous.c.d.a */
/* compiled from: PG */
public final class C42221a extends C42242j {

    /* renamed from: a */
    public C42352m f110552a;

    /* renamed from: b */
    public ClientConfigInternal f110553b;

    /* renamed from: c */
    public C42210b f110554c;

    /* renamed from: d */
    private ClientVersion f110555d;

    /* renamed from: a */
    public final C42243k mo44912a() {
        ClientVersion clientVersion;
        ClientConfigInternal clientConfigInternal;
        C42352m mVar = this.f110552a;
        if (mVar != null && (clientVersion = this.f110555d) != null && (clientConfigInternal = this.f110553b) != null) {
            return new C42234b(this.f110554c, mVar, clientVersion, clientConfigInternal);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f110552a == null) {
            sb.append(" accountData");
        }
        if (this.f110555d == null) {
            sb.append(" clientVersion");
        }
        if (this.f110553b == null) {
            sb.append(" clientConfig");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo44913b(C42352m mVar) {
        if (mVar != null) {
            this.f110552a = mVar;
            return;
        }
        throw new NullPointerException("Null accountData");
    }

    /* renamed from: c */
    public final void mo44914c(ClientVersion clientVersion) {
        if (clientVersion != null) {
            this.f110555d = clientVersion;
            return;
        }
        throw new NullPointerException("Null clientVersion");
    }
}
