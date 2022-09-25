package com.google.android.libraries.search.p2904c.p2977w.p2978a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.C37459ch;
import com.google.android.libraries.search.p2904c.C37460ci;
import com.google.android.libraries.search.p2904c.C37466co;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.android.libraries.search.p2904c.C37494da;
import com.google.android.libraries.search.p2904c.C37504dk;
import com.google.android.libraries.search.p2904c.p2942m.C37877c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2977w.C38154f;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.w.a.n */
/* compiled from: PG */
public final class C38136n implements C38154f {

    /* renamed from: a */
    public C2164c f101042a;

    /* renamed from: b */
    private final C37467cp f101043b;

    /* renamed from: c */
    private final C60870cx f101044c = C2169h.m6027a(new C38135m(this));

    public C38136n(C37494da daVar) {
        C37466co coVar = (C37466co) C37467cp.f99458c.createBuilder();
        coVar.copyOnWrite();
        C37467cp cpVar = (C37467cp) coVar.instance;
        daVar.getClass();
        cpVar.f99461b = daVar;
        cpVar.f99460a = 3;
        this.f101043b = (C37467cp) coVar.build();
    }

    /* renamed from: d */
    public final C37877c mo41068d() {
        return C37877c.m66848b(this.f101044c, this.f101043b, C58836b.f156633a);
    }

    /* renamed from: e */
    public final C60870cx mo41069e() {
        if (((C2168g) this.f101044c).f6144b.isDone()) {
            return C60856cj.m92900i(C37846as.m66800f(C37504dk.FAILED_ROUTING_DUE_TO_DISCONNECT_ALREADY_CALLED));
        }
        return C60856cj.m92900i(C37846as.m66800f(C37504dk.UPDATED));
    }

    /* renamed from: f */
    public final synchronized C60870cx mo41070f(C37476cy cyVar) {
        if (((C2168g) this.f101044c).f6144b.isDone()) {
            return this.f101044c;
        }
        C37459ch chVar = (C37459ch) C37460ci.f99438c.createBuilder();
        chVar.copyOnWrite();
        C37460ci ciVar = (C37460ci) chVar.instance;
        ciVar.f99441b = cyVar.f99492t;
        ciVar.f99440a |= 1;
        this.f101042a.mo5437b((C37460ci) chVar.build());
        return this.f101044c;
    }
}
