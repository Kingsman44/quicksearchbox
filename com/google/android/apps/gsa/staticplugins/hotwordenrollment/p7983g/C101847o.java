package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.o */
/* compiled from: PG */
final class C101847o extends C90888av {

    /* renamed from: a */
    final /* synthetic */ int f284082a;

    /* renamed from: b */
    final /* synthetic */ C101849q f284083b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101847o(C101849q qVar, int i) {
        super("Retry server flags update check", 1, 4);
        this.f284083b = qVar;
        this.f284082a = i;
    }

    public final void run() {
        if (!(this.f284083b.f257139b.value instanceof C60873d.C60875b)) {
            this.f284083b.mo92625g(this.f284082a + 1);
        }
    }
}
