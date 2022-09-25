package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.mdi.download.h.l */
/* compiled from: PG */
public final class C29615l {

    /* renamed from: a */
    public C58485gu f80203a;

    /* renamed from: b */
    public C58485gu f80204b;

    /* renamed from: c */
    public C42813k f80205c;

    /* renamed from: d */
    public String f80206d;

    /* renamed from: e */
    public C58881cr f80207e;

    /* renamed from: f */
    public boolean f80208f;

    /* renamed from: a */
    public final C29616m mo34779a() {
        boolean z = true;
        C58838bb.m90884s(this.f80205c != null, "Must call setFileStorage() before build().");
        C58838bb.m90884s(this.f80206d != null, "Must call setAllSlicesFileGroupName() before build().");
        if (this.f80207e == null) {
            z = false;
        }
        C58838bb.m90884s(z, "Must call setAccountSupplier() before build().");
        if (this.f80203a == null) {
            this.f80203a = C58485gu.m89845m();
        }
        if (this.f80204b == null) {
            this.f80204b = C58485gu.m89845m();
        }
        return new C29616m(this);
    }
}
