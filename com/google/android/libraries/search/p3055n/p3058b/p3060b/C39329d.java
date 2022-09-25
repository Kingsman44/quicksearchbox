package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.search.p3055n.C39365bn;
import com.google.android.libraries.search.p3055n.p3075e.p3077b.C39689e;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.b.b.d */
/* compiled from: PG */
public final /* synthetic */ class C39329d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39280aa f103590a;

    /* renamed from: b */
    public final /* synthetic */ C39365bn f103591b;

    public /* synthetic */ C39329d(C39280aa aaVar, C39365bn bnVar) {
        this.f103590a = aaVar;
        this.f103591b = bnVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39280aa aaVar = this.f103590a;
        C39365bn bnVar = this.f103591b;
        Optional ofNullable = Optional.ofNullable(aaVar.f103476g);
        if (ofNullable.isEmpty()) {
            if (aaVar.f103472c.isPresent()) {
                ofNullable = ((C39689e) aaVar.f103472c.get()).mo41994b();
            } else {
                ofNullable = Optional.empty();
            }
        }
        if (ofNullable.isEmpty()) {
            ((C59052c) ((C59052c) C39280aa.f103467a.mo56226d()).mo56372aa(53420)).mo56386p("#processUnaryQueryFulfillment no soda instance preloaded, skipping audio logging");
            return C60856cj.m92899h(new IllegalStateException("No Soda instance preloaded, skipping audio logging."));
        }
        ((Soda) ofNullable.get()).mo24341m(C39280aa.m68697g(bnVar));
        return C60866ct.f164955a;
    }
}
