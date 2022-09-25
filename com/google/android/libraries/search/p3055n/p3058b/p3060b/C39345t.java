package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.base.C58838bb;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.b.b.t */
/* compiled from: PG */
public final /* synthetic */ class C39345t implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C39280aa f103624a;

    public /* synthetic */ C39345t(C39280aa aaVar) {
        this.f103624a = aaVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C58838bb.m90884s(!((Optional) this.f103624a.f103487r.getAndSet(Optional.m71637of(cVar))).isPresent(), "non-IDLE completer was present!");
        return "SodaAsrController non-idle completer set";
    }
}
