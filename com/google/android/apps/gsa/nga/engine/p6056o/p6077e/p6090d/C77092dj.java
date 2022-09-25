package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.libraries.assistant.p1484g.p1502d.C18175l;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.dj */
/* compiled from: PG */
public final /* synthetic */ class C77092dj implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C77092dj f212759a = new C77092dj();

    private /* synthetic */ C77092dj() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Throwable th = (Throwable) obj;
        C58974d dVar = C77123en.f212843a;
        if (th instanceof C18175l) {
            int i = ((C18175l) th).f51669a;
            if (i == 0) {
                throw null;
            } else if (i == 6) {
                ((C58970a) ((C58970a) C77123en.f212843a.mo56224b()).mo56372aa(3830)).mo56389s("SendDirectAction failed - %s", th.getMessage());
                return Optional.empty();
            }
        }
        ((C58970a) ((C58970a) ((C58970a) C77123en.f212843a.mo56226d()).mo56382g(th)).mo56372aa(3829)).mo56386p("SendDirectAction failed");
        return Optional.empty();
    }
}
