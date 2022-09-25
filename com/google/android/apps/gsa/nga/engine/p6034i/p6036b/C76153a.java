package com.google.android.apps.gsa.nga.engine.p6034i.p6036b;

import com.google.android.apps.gsa.nga.engine.p6034i.C76150a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.nga.engine.i.b.a */
/* compiled from: PG */
public final /* synthetic */ class C76153a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C76154b f211129a;

    public /* synthetic */ C76153a(C76154b bVar) {
        this.f211129a = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C76154b bVar = this.f211129a;
        C79850ah b = bVar.f211132c.mo74251b(38);
        try {
            for (C76150a a : (Set) bVar.f211131b.mo27525b()) {
                a.mo72092a();
            }
            if (b != null) {
                b.mo74255b();
            }
            return C118826c.f331422a;
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.mo74255b();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }
}
