package com.google.android.apps.gsa.staticplugins.p7443bd;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.libraries.gcoreclient.p1772j.p1773a.C21565a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bd.f */
/* compiled from: PG */
final class C94539f extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C94540g f264424a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94539f(C94540g gVar) {
        super("Hallmonitor auth cleanup", 2, 0);
        this.f264424a = gVar;
    }

    public final void run() {
        synchronized (this.f264424a.f264427c) {
            C21565a aVar = this.f264424a.f264427c.f264432e;
            if (aVar != null) {
                aVar.mo27015a();
                this.f264424a.f264427c.f264432e = null;
            }
        }
    }
}
