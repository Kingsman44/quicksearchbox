package com.google.android.libraries.logging.p2182b;

import com.google.android.libraries.logging.p2181a.C28259b;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.logging.b.a */
/* compiled from: PG */
public final /* synthetic */ class C28261a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f76915a;

    public /* synthetic */ C28261a(List list) {
        this.f76915a = list;
    }

    public final Object call() {
        C28259b bVar = null;
        for (C60870cx r : this.f76915a) {
            C28259b bVar2 = (C28259b) C60856cj.m92909r(r);
            if (bVar2 != null) {
                C58838bb.m90884s(bVar == null, "More than one auth provider provided result.");
                bVar = bVar2;
            }
        }
        if (bVar != null) {
            return bVar;
        }
        throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
    }
}
