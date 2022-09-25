package com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1267b.p1269b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16077ac;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16128c;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.assistant.p3994s.p3995a.C53446oe;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.l.b.b.k */
/* compiled from: PG */
final class C16406k {

    /* renamed from: a */
    public static final /* synthetic */ int f48272a = 0;

    /* renamed from: b */
    private static final C16077ac f48273b;

    static {
        C16128c cVar = new C16128c();
        cVar.f47607a = BuildConfig.FLAVOR;
        cVar.mo22690c(0);
        cVar.mo22696i(0);
        cVar.mo22693f(0);
        cVar.mo22695h(0);
        cVar.mo22692e(0);
        cVar.mo22691d(0);
        cVar.mo22694g(0);
        f48273b = cVar.mo22688a();
    }

    /* renamed from: a */
    static Float m33374a(C16170n nVar, C16407l lVar) {
        float f;
        C16397b bVar = (C16397b) lVar;
        C16077ac acVar = (C16077ac) bVar.f48261e.getOrDefault(nVar.mo22752f(), f48273b);
        C53446oe oeVar = nVar.mo22747b().f48087l;
        if (oeVar == null) {
            oeVar = C53446oe.f140277b;
        }
        float orElse = ((float) Collection.EL.stream(oeVar.f140279a).filter(C16404i.f48270a).mapToInt(C16405j.f48271a).max().orElse(0)) * 0.1f;
        float f2 = bVar.f48257a;
        if (acVar.mo22703g() == 0) {
            f = 1.0f;
        } else {
            f = ((float) acVar.mo22697a()) / ((float) acVar.mo22703g());
        }
        float f3 = orElse + (f2 * f);
        float f4 = bVar.f48258b;
        long j = bVar.f48260d;
        long f5 = acVar.mo22702f();
        float f6 = 0.0f;
        if (f5 != 0 && f5 <= j) {
            f6 = 1.0f - Math.min(1.0f, ((float) (j - f5)) / bVar.f48259c);
        }
        C58976aa aaVar = C58975e.f156826a;
        nVar.mo22750e();
        return Float.valueOf(f3 + (f4 * f6));
    }
}
