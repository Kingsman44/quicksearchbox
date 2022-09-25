package com.google.android.libraries.search.p2904c.p2967t;

import com.google.android.libraries.search.p2904c.C37460ci;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.search.c.t.r */
/* compiled from: PG */
final class C38109r implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ int f100977a;

    /* renamed from: b */
    final /* synthetic */ C38110s f100978b;

    public C38109r(C38110s sVar, int i) {
        this.f100978b = sVar;
        this.f100977a = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            this.f100978b.mo41270a(this.f100977a, C37565ef.ERROR_IN_GETTING_AUDIO_ROUTE_DISCONNECT_STATUS);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f100978b.mo41270a(this.f100977a, C37846as.m66805k((C37460ci) obj));
    }
}
