package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.o */
/* compiled from: PG */
public final /* synthetic */ class C111625o implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111626p f310383a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310384b;

    public /* synthetic */ C111625o(C111626p pVar, C113405ep epVar) {
        this.f310383a = pVar;
        this.f310384b = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111626p pVar = this.f310383a;
        C113405ep epVar = this.f310384b;
        Void voidR = (Void) obj;
        if (epVar.mo100033p().isEmpty()) {
            return pVar.mo99194a();
        }
        return pVar.mo99195b(epVar.mo100033p().toLowerCase(Locale.getDefault()));
    }
}
