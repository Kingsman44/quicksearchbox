package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.bj */
/* compiled from: PG */
final class C98209bj implements C90991b {

    /* renamed from: a */
    private final long f274210a;

    /* renamed from: b */
    private final int f274211b;

    /* renamed from: c */
    private final int f274212c;

    /* renamed from: d */
    private final int f274213d;

    public C98209bj(long j, int i, int i2, int i3) {
        this.f274210a = j;
        this.f274211b = i;
        this.f274212c = i2;
        this.f274213d = i3;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        int i;
        fVar.mo85291r("FlushEvent");
        fVar.mo85279c("timestamp").mo85276a(C90752i.m148229c(C89407a.m145419b(TimeUnit.SECONDS.toMillis(this.f274210a))));
        fVar.mo85279c("flushedBytes").mo85276a(C90752i.m148230d(Integer.valueOf(this.f274211b)));
        fVar.mo85279c("flushedActions").mo85276a(C90752i.m148230d(Integer.valueOf(this.f274212c)));
        C91005e c = fVar.mo85279c("averageFlushedActionSize");
        int i2 = this.f274212c;
        if (i2 == 0) {
            i = 0;
        } else {
            i = this.f274211b / i2;
        }
        c.mo85276a(C90752i.m148230d(Integer.valueOf(i)));
        fVar.mo85279c("unflushedActions").mo85276a(C90752i.m148230d(Integer.valueOf(this.f274213d)));
    }
}
