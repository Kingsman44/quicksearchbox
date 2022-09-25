package com.google.android.libraries.logging.p2185ve.p2188c.p2190b;

import android.util.Log;
import com.google.android.libraries.logging.p2182b.C28278i;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28314a;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;
import com.google.android.libraries.logging.p2185ve.p2192d.C28352e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.logging.ve.c.b.p */
/* compiled from: PG */
public final class C28333p extends C28443m {

    /* renamed from: a */
    private final C28278i f77044a;

    /* renamed from: b */
    private final C21370a f77045b;

    public C28333p(C28278i iVar, C21370a aVar) {
        this.f77044a = iVar;
        this.f77045b = aVar;
    }

    /* renamed from: e */
    private static void m53002e(C28439i iVar) {
        boolean z = false;
        C58838bb.m90884s(iVar != null, "View is not instrumented.");
        C28317d dVar = iVar.f77219e;
        if (!dVar.f77002a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Interaction: ".concat(String.valueOf(String.valueOf(iVar))));
            }
            for (C28314a c : dVar.f77002a) {
                c.mo33814c(iVar);
            }
        }
        C58838bb.m90890y(iVar.mo33889f(), "VE is not impressed: %s {attached=%s}", iVar, Boolean.valueOf(iVar.f77220f.mo33829m()));
        if (iVar.mo33891h() == 1) {
            z = true;
        }
        C58838bb.m90887v(z, "VE is not visible: %s", iVar);
    }

    /* renamed from: a */
    public final C60214n mo33851a(C28439i iVar) {
        m53002e(iVar);
        C60214n nVar = iVar.mo33884a().f77290c;
        return nVar == null ? C60214n.f162914g : nVar;
    }

    /* renamed from: b */
    public final C60870cx mo33852b(C28442l lVar, C28439i iVar) {
        SettableFuture settableFuture = new SettableFuture();
        this.f77044a.mo33777c(new C28331n(this, lVar, iVar, settableFuture));
        return settableFuture;
    }

    /* renamed from: c */
    public final void mo33853c(C28442l lVar, C28439i iVar) {
        this.f77044a.mo33777c(new C28332o(this, lVar, iVar));
    }

    /* renamed from: d */
    public final C28352e mo33854d(C28442l lVar, C28439i iVar, C60218r rVar) {
        m53002e(iVar);
        ArrayList arrayList = new ArrayList();
        C28318a.m52973a(iVar, arrayList);
        return new C28352e(rVar, arrayList, lVar, this.f77045b.mo26870b(), false);
    }
}
