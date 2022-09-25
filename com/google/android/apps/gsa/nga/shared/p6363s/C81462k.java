package com.google.android.apps.gsa.nga.shared.p6363s;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: com.google.android.apps.gsa.nga.shared.s.k */
/* compiled from: PG */
public final /* synthetic */ class C81462k implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C81464m f222877a;

    /* renamed from: b */
    public final /* synthetic */ C90919bp f222878b;

    public /* synthetic */ C81462k(C81464m mVar, C90919bp bpVar) {
        this.f222877a = mVar;
        this.f222878b = bpVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C81464m mVar = this.f222877a;
        C90919bp bpVar = this.f222878b;
        for (Object next : (Set) mVar.f222881c.mo27525b()) {
            try {
                bpVar.mo17870a(next);
            } catch (Exception e) {
                ((C58970a) ((C58970a) C81464m.f222879b.mo56223a(Level.SEVERE).mo56382g(e)).mo56372aa(5913)).mo56354G("Crash calling listener %s with consumer %s", next, bpVar);
            }
        }
        return C118826c.f331422a;
    }
}
