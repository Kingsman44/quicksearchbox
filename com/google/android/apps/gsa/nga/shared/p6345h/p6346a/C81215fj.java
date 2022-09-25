package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import android.os.Build;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.protos.p4985f.p4988b.p4992c.C64754b;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.fj */
/* compiled from: PG */
public final class C81215fj {

    /* renamed from: a */
    private final C91142g f222357a;

    public C81215fj(C91142g gVar) {
        this.f222357a = gVar;
    }

    /* renamed from: a */
    public final C64754b mo74971a() {
        if (this.f222357a.mo85405j(C90126fx.f251542kl)) {
            return C64754b.POCKET_ENABLED;
        }
        if (C90772bp.m148274A(C89988b.m146551d(this.f222357a.mo85403h(C90126fx.f251692nc)), Build.MODEL)) {
            return C64754b.POCKET_ENABLED;
        }
        return C64754b.POCKET_DISABLED_DEVICE_MODEL;
    }
}
