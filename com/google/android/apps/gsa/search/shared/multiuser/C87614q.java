package com.google.android.apps.gsa.search.shared.multiuser;

import com.google.android.apps.gsa.shared.util.C91037g;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.q */
/* compiled from: PG */
final class C87614q extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C87618u f236681a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87614q(C87618u uVar) {
        super("Bind WorkDataService Timeout", 2, 0);
        this.f236681a = uVar;
    }

    public final void run() {
        C87618u uVar;
        synchronized (this.f236681a.f236686a) {
            C91037g gVar = this.f236681a.f236689d;
            if (gVar == null || gVar.f254285b.isDone() || this.f236681a.f236687b.isEmpty()) {
                uVar = this.f236681a;
            } else {
                this.f236681a.f236689d.f254285b.cancel(true);
                this.f236681a.mo81755c();
                uVar = this.f236681a;
                int i = uVar.f236690e;
                if (i < 5) {
                    uVar.f236690e = i + 1;
                    uVar.mo81756d();
                }
            }
            uVar.f236690e = 0;
        }
    }
}
