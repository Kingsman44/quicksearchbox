package com.google.android.apps.gsa.nga.shared.p6339f.p6341b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.b.a */
/* compiled from: PG */
final class C81028a extends C81039l {

    /* renamed from: a */
    public C58833ax f222087a;

    /* renamed from: b */
    public C58833ax f222088b;

    /* renamed from: c */
    private boolean f222089c;

    /* renamed from: d */
    private byte f222090d;

    public C81028a() {
        C58836b bVar = C58836b.f156633a;
        this.f222087a = bVar;
        this.f222088b = bVar;
    }

    /* renamed from: a */
    public final C81040m mo74815a() {
        if (this.f222090d == 1) {
            return new C81029b(this.f222089c, this.f222087a, this.f222088b);
        }
        throw new IllegalStateException("Missing required properties: storeClientIsActive");
    }

    /* renamed from: b */
    public final void mo74816b(boolean z) {
        this.f222089c = z;
        this.f222090d = 1;
    }
}
