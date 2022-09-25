package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97910bi;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.podcasts.b.f.n */
/* compiled from: PG */
public final /* synthetic */ class C140111n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380748a;

    public /* synthetic */ C140111n(C140097al alVar) {
        this.f380748a = alVar;
    }

    public final C60870cx apply(Object obj) {
        C97910bi biVar = (C97910bi) obj;
        C140088ac acVar = (C140088ac) C60856cj.m92909r(this.f380748a.f380724d.mo50395b());
        if (biVar == null) {
            return C60856cj.m92899h(new IOException("Received null data"));
        }
        if (biVar.f273375d) {
            acVar.mo115449g();
            return C60856cj.m92900i(new C140096ak(true, false));
        } else if (acVar.mo115455m(biVar.f273373b, biVar.f273374c)) {
            return C60856cj.m92900i(new C140096ak(false, true));
        } else {
            return C60856cj.m92899h(new IllegalArgumentException("Server state inconsistent with what client was expecting."));
        }
    }
}
