package com.google.android.apps.gsa.search.core.p6884y;

import com.google.android.libraries.gsa.monet.service.C23050a;
import com.google.android.libraries.gsa.monet.service.C23055f;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.y.a */
/* compiled from: PG */
public final class C87283a implements C23055f {

    /* renamed from: a */
    private final C58485gu f235746a;

    public C87283a(C58485gu guVar) {
        this.f235746a = guVar;
    }

    /* renamed from: a */
    public final C23050a mo28492a(String str) {
        C58485gu guVar = this.f235746a;
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            C23050a a = ((C23055f) ((C68214a) guVar.get(i)).mo27525b()).mo28492a(str);
            i++;
            if (a != null) {
                return a;
            }
        }
        return null;
    }
}
