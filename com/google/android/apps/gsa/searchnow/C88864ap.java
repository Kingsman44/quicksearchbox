package com.google.android.apps.gsa.searchnow;

import com.google.android.apps.gsa.search.shared.overlay.C87661j;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;

/* renamed from: com.google.android.apps.gsa.searchnow.ap */
/* compiled from: PG */
public final class C88864ap implements C90991b {

    /* renamed from: a */
    private final C87661j f240629a;

    /* renamed from: b */
    private final int f240630b;

    /* renamed from: c */
    private boolean f240631c;

    /* renamed from: d */
    private int f240632d;

    public C88864ap(C87661j jVar, int i) {
        this.f240629a = jVar;
        this.f240630b = i;
    }

    /* renamed from: a */
    public final void mo82655a(int i, boolean z) {
        int i2 = z ? i | this.f240632d : (i ^ -1) & this.f240632d;
        this.f240632d = i2;
        int i3 = this.f240630b;
        boolean z2 = (i2 & i3) == i3;
        if (this.f240631c != z2) {
            this.f240631c = z2;
            this.f240629a.mo81819o(z2);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("HotwordEnabler");
        fVar.mo85279c("should enable hotword").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f240631c)));
        fVar.mo85279c("current state").mo85276a(C90752i.m148230d(Integer.valueOf(this.f240632d)));
    }
}
