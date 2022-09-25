package com.google.android.libraries.assistant.contexttrigger.p1457c;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.f */
/* compiled from: PG */
public final class C17642f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C17653q f50763a;

    public C17642f(C17653q qVar) {
        this.f50763a = qVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59052c cVar = (C59052c) ((C59052c) C17643g.f50764a.mo56226d()).mo56372aa(46937);
        int b = C17652p.m34945b(this.f50763a.f50780a);
        String a = C17652p.m34944a(b);
        if (b != 0) {
            cVar.mo56389s("failed to forward event: %s", a);
            return;
        }
        throw null;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C17657u uVar = (C17657u) obj;
        C59052c cVar = (C59052c) ((C59052c) C17643g.f50764a.mo56224b()).mo56372aa(46938);
        int b = C17652p.m34945b(this.f50763a.f50780a);
        String a = C17652p.m34944a(b);
        if (b != 0) {
            cVar.mo56389s("Event forwarded successfully: %s", a);
            return;
        }
        throw null;
    }
}
