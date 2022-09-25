package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.p590as.p593b.p596b.C10812ap;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58670nq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.n.g.a.h */
/* compiled from: PG */
public final /* synthetic */ class C39737h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39751v f104554a;

    /* renamed from: b */
    public final /* synthetic */ Locale f104555b;

    public /* synthetic */ C39737h(C39751v vVar, Locale locale) {
        this.f104554a = vVar;
        this.f104555b = locale;
    }

    public final C60870cx apply(Object obj) {
        int i;
        C39751v vVar = this.f104554a;
        Locale locale = this.f104555b;
        C58528ij ijVar = (C58528ij) obj;
        if (ijVar.isEmpty()) {
            i = 0;
        } else {
            i = ((C10882h) Collection.EL.stream(ijVar).collect(C58670nq.f156403c)).mo19282a();
        }
        return ((C10812ap) vVar.f104572b.get()).mo19304f(locale.toLanguageTag(), i);
    }
}
