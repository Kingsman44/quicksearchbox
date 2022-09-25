package com.google.apps.tiktok.account.p3606d;

import com.google.apps.tiktok.p3648i.p3649a.C47151b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import java.io.File;

/* renamed from: com.google.apps.tiktok.account.d.h */
/* compiled from: PG */
public final class C46090h {

    /* renamed from: a */
    public final C46107y f120963a;

    /* renamed from: b */
    private final C47151b f120964b;

    public C46090h(C47151b bVar, C46107y yVar) {
        this.f120964b = bVar;
        this.f120963a = yVar;
    }

    /* renamed from: a */
    public final C58485gu mo50199a(C58528ij ijVar, C58528ij ijVar2) {
        boolean z = true;
        if ((ijVar != null || ijVar2 == null) && (ijVar == null || ijVar2 != null)) {
            z = false;
        }
        C58838bb.m90868c(z);
        C58480gp e = C58485gu.m89837e();
        C58800sl lA = this.f120964b.mo51049a().iterator();
        while (lA.hasNext()) {
            File[] listFiles = new File((File) lA.next(), C46092j.m82309d()).listFiles(new C46088f(ijVar2, ijVar));
            if (listFiles != null) {
                e.mo55371a(listFiles, listFiles.length);
            }
        }
        return e.mo55394f();
    }
}
