package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1730f.C21370a;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.aw */
/* compiled from: PG */
public final class C91318aw implements C90991b {

    /* renamed from: a */
    public int f254859a;

    /* renamed from: b */
    public int f254860b;

    /* renamed from: c */
    private final long f254861c;

    public C91318aw(C21370a aVar) {
        this.f254861c = aVar.mo26870b();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("timestamp").mo85276a(C90752i.m148232f(new Date(this.f254861c)));
        fVar.mo85279c("groupCount").mo85276a(C90752i.m148230d(Integer.valueOf(this.f254859a)));
        fVar.mo85279c("invalidCount").mo85276a(C90752i.m148230d(Integer.valueOf(this.f254860b)));
    }
}
