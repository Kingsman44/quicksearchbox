package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6085f;

import android.util.Pair;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.f.h */
/* compiled from: PG */
public final /* synthetic */ class C76885h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ String f212318a;

    public /* synthetic */ C76885h(String str) {
        this.f212318a = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str = this.f212318a;
        C58485gu guVar = (C58485gu) obj;
        C58528ij ijVar = C76889l.f212327a;
        int size = guVar.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) guVar.get(i);
            String str2 = (String) pair.second;
            if (!str2.isEmpty()) {
                str = str.replace(((df) pair.first).b(), str2);
                z = true;
            }
        }
        if (!z) {
            return Optional.empty();
        }
        return Optional.m71637of(str);
    }
}
