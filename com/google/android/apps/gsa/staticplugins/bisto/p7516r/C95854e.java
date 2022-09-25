package com.google.android.apps.gsa.staticplugins.bisto.p7516r;

import com.google.android.apps.gsa.shared.bisto.C89619aq;
import com.google.android.apps.gsa.shared.bisto.C89683v;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.r.e */
/* compiled from: PG */
final class C95854e implements C90991b {

    /* renamed from: a */
    public final C89683v f268413a;

    /* renamed from: b */
    private final String f268414b;

    public C95854e(String str, C89683v vVar) {
        this.f268414b = str;
        this.f268413a = vVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        StringWriter stringWriter = new StringWriter();
        C89619aq aqVar = new C89619aq(new PrintWriter(stringWriter));
        try {
            C95855f.m158927c(this.f268413a, aqVar, true);
        } catch (Throwable unused) {
        }
        aqVar.f242690a.flush();
        fVar.mo85291r("Bisto: ".concat(this.f268414b));
        fVar.mo85292s(C90752i.m148229c(stringWriter.toString()));
    }
}
