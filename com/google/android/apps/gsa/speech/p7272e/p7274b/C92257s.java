package com.google.android.apps.gsa.speech.p7272e.p7274b;

import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.speech.e.b.s */
/* compiled from: PG */
public final class C92257s implements Comparator {

    /* renamed from: a */
    final /* synthetic */ C8513w f257232a;

    public C92257s(C8513w wVar) {
        this.f257232a = wVar;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String e = C92654a.m152608e(this.f257232a, ((C8476as) obj).f29417b);
        String e2 = C92654a.m152608e(this.f257232a, ((C8476as) obj2).f29417b);
        if ((e == null) ^ (e2 == null)) {
            return e != null ? 1 : -1;
        }
        if (e == null) {
            return 0;
        }
        return e.compareTo(e2);
    }
}
