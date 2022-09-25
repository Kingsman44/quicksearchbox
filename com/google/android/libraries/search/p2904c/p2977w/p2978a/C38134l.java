package com.google.android.libraries.search.p2904c.p2977w.p2978a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.C37459ch;
import com.google.android.libraries.search.p2904c.C37460ci;
import com.google.android.libraries.search.p2904c.C37466co;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37474cw;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.android.libraries.search.p2904c.C37504dk;
import com.google.android.libraries.search.p2904c.p2942m.C37877c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2977w.C38154f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.w.a.l */
/* compiled from: PG */
public final class C38134l implements C38154f {

    /* renamed from: b */
    private static final C37467cp f101037b;

    /* renamed from: a */
    public C2164c f101038a;

    /* renamed from: c */
    private final C60870cx f101039c = C2169h.m6027a(new C38133k(this));

    /* renamed from: d */
    private final C58833ax f101040d;

    static {
        C37466co coVar = (C37466co) C37467cp.f99458c.createBuilder();
        C37474cw cwVar = C37474cw.f99469a;
        coVar.copyOnWrite();
        C37467cp cpVar = (C37467cp) coVar.instance;
        cwVar.getClass();
        cpVar.f99461b = cwVar;
        cpVar.f99460a = 2;
        f101037b = (C37467cp) coVar.build();
    }

    public C38134l(C58833ax axVar) {
        this.f101040d = axVar;
    }

    /* renamed from: d */
    public final C37877c mo41068d() {
        return C37877c.m66848b(this.f101039c, f101037b, this.f101040d);
    }

    /* renamed from: e */
    public final C60870cx mo41069e() {
        if (((C2168g) this.f101039c).f6144b.isDone()) {
            return C60856cj.m92900i(C37846as.m66800f(C37504dk.FAILED_ROUTING_DUE_TO_DISCONNECT_ALREADY_CALLED));
        }
        return C60856cj.m92900i(C37846as.m66800f(C37504dk.UPDATED));
    }

    /* renamed from: f */
    public final synchronized C60870cx mo41070f(C37476cy cyVar) {
        if (((C2168g) this.f101039c).f6144b.isDone()) {
            return this.f101039c;
        }
        C37459ch chVar = (C37459ch) C37460ci.f99438c.createBuilder();
        chVar.copyOnWrite();
        C37460ci ciVar = (C37460ci) chVar.instance;
        ciVar.f99441b = cyVar.f99492t;
        ciVar.f99440a |= 1;
        this.f101038a.mo5437b((C37460ci) chVar.build());
        return this.f101039c;
    }
}
