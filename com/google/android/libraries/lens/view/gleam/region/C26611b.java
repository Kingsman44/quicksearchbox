package com.google.android.libraries.lens.view.gleam.region;

import android.graphics.RectF;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.gleam.region.b */
/* compiled from: PG */
public final class C26611b extends C26613d {

    /* renamed from: a */
    public RectF f72568a;

    /* renamed from: b */
    public C58833ax f72569b = C58836b.f156633a;

    /* renamed from: c */
    public int f72570c;

    /* renamed from: d */
    private boolean f72571d;

    /* renamed from: e */
    private boolean f72572e;

    /* renamed from: f */
    private byte f72573f;

    /* renamed from: a */
    public final C26614e mo31892a() {
        if (this.f72573f == 3 && this.f72568a != null && this.f72570c != 0) {
            return new C26612c(this.f72568a, this.f72570c, this.f72571d, this.f72569b, this.f72572e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f72568a == null) {
            sb.append(" rect");
        }
        if (this.f72570c == 0) {
            sb.append(" type");
        }
        if ((this.f72573f & 1) == 0) {
            sb.append(" withAnimation");
        }
        if ((this.f72573f & 2) == 0) {
            sb.append(" isAutoSelectedRegion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo31893b(boolean z) {
        this.f72572e = z;
        this.f72573f = (byte) (this.f72573f | 2);
    }

    /* renamed from: c */
    public final void mo31894c(boolean z) {
        this.f72571d = z;
        this.f72573f = (byte) (this.f72573f | 1);
    }
}
