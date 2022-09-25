package com.google.android.apps.gsa.nga.engine.warmactions.p6259k;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.k.d */
/* compiled from: PG */
public class C79721d implements C22868d {

    /* renamed from: a */
    private static final C58974d f218619a = C58974d.m91136j();

    /* renamed from: b */
    private final String f218620b;

    public C79721d(String str) {
        this.f218620b = str;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C58970a) ((C58970a) ((C58970a) f218619a.mo56225c()).mo56382g(th)).mo56372aa(5784)).mo56389s("#MWW %s failed", this.f218620b);
        }
    }

    /* renamed from: gm */
    public void mo17702gm(Object obj) {
    }
}
