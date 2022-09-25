package com.google.android.apps.gsa.shared.monet;

import com.google.android.libraries.gsa.monet.p1886a.C22936a;
import com.google.android.libraries.gsa.monet.p1886a.C22948m;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.monet.c */
/* compiled from: PG */
public final class C90302c implements C22948m {

    /* renamed from: a */
    private final List f252223a;

    public C90302c(List list) {
        this.f252223a = list;
    }

    /* renamed from: a */
    public final C22936a mo28319a(String str) {
        for (C68214a b : this.f252223a) {
            C22936a a = ((C22948m) b.mo27525b()).mo28319a(str);
            if (a != null) {
                return a;
            }
        }
        return null;
    }
}
