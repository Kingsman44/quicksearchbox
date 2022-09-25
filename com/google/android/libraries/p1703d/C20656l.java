package com.google.android.libraries.p1703d;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.google.android.libraries.d.l */
/* compiled from: PG */
public final class C20656l extends C20644ah {

    /* renamed from: a */
    public Uri f57917a;

    /* renamed from: b */
    public List f57918b;

    /* renamed from: c */
    public Bundle f57919c;

    /* renamed from: d */
    private boolean f57920d;

    /* renamed from: e */
    private boolean f57921e;

    /* renamed from: f */
    private byte f57922f;

    /* renamed from: a */
    public final C20645ai mo25594a() {
        Bundle bundle;
        if (this.f57922f == 3 && (bundle = this.f57919c) != null) {
            return new C20657m(this.f57917a, this.f57918b, bundle, this.f57920d, this.f57921e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f57919c == null) {
            sb.append(" extras");
        }
        if ((this.f57922f & 1) == 0) {
            sb.append(" ignoreFragmentInPrerenderUrl");
        }
        if ((this.f57922f & 2) == 0) {
            sb.append(" prerenderOnCellular");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo25595b(boolean z) {
        this.f57920d = z;
        this.f57922f = (byte) (this.f57922f | 1);
    }

    /* renamed from: c */
    public final void mo25596c(boolean z) {
        this.f57921e = z;
        this.f57922f = (byte) (this.f57922f | 2);
    }
}
