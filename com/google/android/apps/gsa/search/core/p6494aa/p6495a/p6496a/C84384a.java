package com.google.android.apps.gsa.search.core.p6494aa.p6495a.p6496a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7055e.C89905b;
import com.google.android.apps.gsa.shared.logger.p7055e.C89910d;
import com.google.android.apps.gsa.shared.logger.p7055e.p7058b.C89906a;
import com.google.android.apps.gsa.shared.logger.p7055e.p7058b.C89908b;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4552o.C59792ft;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.search.core.aa.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C84384a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C84385b f229643a;

    public /* synthetic */ C84384a(C84385b bVar) {
        this.f229643a = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C89908b bVar = this.f229643a.f229644a;
        C90748e.m148224b();
        C89910d dVar = bVar.f246335a;
        if (dVar != null) {
            C89905b a = dVar.mo83748a();
            Iterator it = a.f246331b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C59792ft) it.next()).f161566d != 0) {
                        bVar.f246337c.d(new C89906a(a));
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return C118826c.f331422a;
    }
}
