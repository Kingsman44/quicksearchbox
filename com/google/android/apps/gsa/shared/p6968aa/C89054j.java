package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.shared.aa.j */
/* compiled from: PG */
final class C89054j implements C60845bz {

    /* renamed from: a */
    private final SettableFuture f241357a;

    /* renamed from: b */
    private final C89022at f241358b;

    /* renamed from: c */
    private final C89068x f241359c;

    /* renamed from: d */
    private final ArrayDeque f241360d = new ArrayDeque();

    public C89054j(SettableFuture settableFuture, C89022at atVar, C89068x xVar) {
        this.f241357a = settableFuture;
        this.f241358b = atVar;
        this.f241359c = xVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Iterator it = this.f241360d.iterator();
        while (it.hasNext()) {
            ((C89051g) it.next()).mo83024e();
        }
        this.f241357a.mo57357o(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C89051g gVar = (C89051g) obj;
        while (true) {
            int i = gVar.f241330b;
            if (i == 1) {
                this.f241360d.add(gVar);
                C60870cx b = this.f241359c.mo27472b();
                C89051g gVar2 = (C89051g) C90877ak.m148475i(b, (Object) null);
                if (gVar2 != null) {
                    gVar = gVar2;
                } else {
                    C60856cj.m92911t(b, this, C60826bg.f164896a);
                    return;
                }
            } else if (i == 2 || i == 3) {
                C89053i iVar = new C89053i(this.f241360d, gVar);
                if (!this.f241357a.mo57356n(new C89057m(this.f241358b, (C89068x) iVar))) {
                    iVar.mo27475d();
                    return;
                }
                return;
            } else {
                throw new AssertionError("Unexpected chunk type: " + i);
            }
        }
    }
}
