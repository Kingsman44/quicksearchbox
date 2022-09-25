package com.google.android.apps.gsa.sidekick.shared.p7232c;

import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.c.f */
/* compiled from: PG */
public final class C91657f {

    /* renamed from: a */
    public final Object f255627a = new Object();

    /* renamed from: b */
    private final C37215b f255628b;

    /* renamed from: c */
    private int f255629c = 1;

    /* renamed from: d */
    private int f255630d = 1;

    /* renamed from: e */
    private int f255631e = 1;

    /* renamed from: f */
    private int f255632f = 1;

    public C91657f(C37215b bVar) {
        this.f255628b = bVar;
    }

    /* renamed from: a */
    public final void mo86058a(C37252a aVar, boolean z) {
        C37215b bVar = this.f255628b;
        ((C37253b) aVar).mo40795s("SessionLoggerId", true != z ? "FeedNextPageSnaSession" : "FeedNextPageMinusOneSession");
        bVar.mo19974a(aVar);
    }

    /* renamed from: b */
    public final void mo86059b(C37252a aVar, boolean z) {
        synchronized (this.f255627a) {
            if (mo86067j(z)) {
                mo86058a(aVar, z);
            }
        }
    }

    /* renamed from: c */
    public final void mo86060c(boolean z, C90456c cVar) {
        mo86061d(z);
        synchronized (this.f255627a) {
            if (mo86067j(z)) {
                mo86064g(z, 3);
                mo86058a(C37182a.f98086g.mo40803a(cVar.mo79843a(), "GSA_ERRORS"), z);
            }
        }
    }

    /* renamed from: d */
    public final void mo86061d(boolean z) {
        synchronized (this.f255627a) {
            if (mo86067j(z) && mo86066i(z, 2)) {
                mo86065h(z, 3);
                mo86058a(C37182a.f98247q.mo40779c(), z);
            }
        }
    }

    /* renamed from: e */
    public final void mo86062e(boolean z) {
        synchronized (this.f255627a) {
            if (mo86067j(z) && mo86066i(z, 2)) {
                mo86065h(z, 3);
                mo86058a(C37182a.f98246p.mo40779c(), z);
            }
        }
    }

    /* renamed from: f */
    public final void mo86063f(boolean z) {
        mo86059b(C37182a.f98242l.mo40779c(), z);
    }

    /* renamed from: g */
    public final void mo86064g(boolean z, int i) {
        if (z) {
            this.f255630d = i;
        } else {
            this.f255629c = i;
        }
    }

    /* renamed from: h */
    public final void mo86065h(boolean z, int i) {
        if (z) {
            this.f255632f = i;
        } else {
            this.f255631e = i;
        }
    }

    /* renamed from: i */
    public final boolean mo86066i(boolean z, int i) {
        return z ? this.f255632f == i : this.f255631e == i;
    }

    /* renamed from: j */
    public final boolean mo86067j(boolean z) {
        return z ? this.f255630d == 2 : this.f255629c == 2;
    }
}
