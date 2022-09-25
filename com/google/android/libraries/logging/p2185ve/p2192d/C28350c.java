package com.google.android.libraries.logging.p2185ve.p2192d;

import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.common.base.C58838bb;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.logging.ve.d.c */
/* compiled from: PG */
public final class C28350c implements C28349b {

    /* renamed from: a */
    public final List f77066a;

    /* renamed from: b */
    public final int f77067b;

    /* renamed from: c */
    private final int f77068c;

    public C28350c(int i, List list, int i2) {
        this.f77067b = i;
        this.f77066a = Collections.unmodifiableList(list);
        this.f77068c = i2;
        boolean z = true;
        if (i == 3) {
            C58838bb.m90868c(i2 != -1 ? false : z);
        } else {
            C58838bb.m90868c(i2 == -1 ? false : z);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C28481u mo33862a() {
        return C28348a.m53028a(this);
    }

    /* renamed from: b */
    public final List mo33863b() {
        return this.f77066a;
    }

    /* renamed from: c */
    public final int mo33864c() {
        int i = this.f77067b;
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        C58838bb.m90883r(z);
        return this.f77068c;
    }
}
