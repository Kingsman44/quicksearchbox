package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.util.p7159c.C90909bf;
import com.google.android.apps.gsa.shared.util.p7159c.C90940f;
import com.google.common.base.C58817ah;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.a */
/* compiled from: PG */
public final class C90781a implements C58817ah {

    /* renamed from: a */
    private final C68214a[] f253875a;

    public C90781a(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f253875a = new C68214a[]{aVar3, aVar4, aVar, aVar2};
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C90909bf bfVar = (C90909bf) obj;
        C68214a[] aVarArr = this.f253875a;
        int hi = bfVar.mo84769hi();
        C90940f.m148554d(hi);
        int hh = bfVar.mo84768hh();
        C90940f.m148555e(hh);
        char c = 1;
        if (hh == 0) {
            c = hi != 1 ? (char) 0 : 2;
        } else {
            if (hh == 8) {
            }
            c = 3;
        }
        return (C90783ab) aVarArr[c].mo27525b();
    }
}
