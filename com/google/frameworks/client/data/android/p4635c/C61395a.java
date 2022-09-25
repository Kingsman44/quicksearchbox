package com.google.frameworks.client.data.android.p4635c;

import com.google.common.base.C58836b;
import com.google.frameworks.client.data.C61633i;
import java.util.concurrent.Callable;

/* renamed from: com.google.frameworks.client.data.android.c.a */
/* compiled from: PG */
public final /* synthetic */ class C61395a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C61398d f166023a;

    public /* synthetic */ C61395a(C61398d dVar) {
        this.f166023a = dVar;
    }

    public final Object call() {
        C61398d dVar = this.f166023a;
        C61633i iVar = C61633i.DEFAULT_CACHE_OK_IF_VALID;
        int ordinal = dVar.f166036i.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return C58836b.f156633a;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new IllegalStateException("Unrecognized directive");
                    }
                }
            }
            dVar.f166035h.mo58102d();
            return dVar.f166032e.mo58001a();
        }
        dVar.f166035h.mo58102d();
        return dVar.f166032e.mo58002b();
    }
}
