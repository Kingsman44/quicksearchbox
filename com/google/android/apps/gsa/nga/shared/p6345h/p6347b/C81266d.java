package com.google.android.apps.gsa.nga.shared.p6345h.p6347b;

import com.google.android.apps.gsa.nga.shared.p6345h.C81239ad;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.b.d */
/* compiled from: PG */
public final /* synthetic */ class C81266d implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C42876ab f222461a;

    public /* synthetic */ C81266d(C42876ab abVar) {
        this.f222461a = abVar;
    }

    public final Object get() {
        try {
            C60870cx d = this.f222461a.mo46042d();
            C90476a aVar = C91018d.f254254a;
            return (C81239ad) d.get();
        } catch (InterruptedException | ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) C81267e.f222462a.mo56225c()).mo56382g(e)).mo56372aa(5850)).mo56386p("Interrupted preference load");
            return C81239ad.f222408a;
        }
    }
}
