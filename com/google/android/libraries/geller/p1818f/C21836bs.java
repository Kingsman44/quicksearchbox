package com.google.android.libraries.geller.p1818f;

import android.accounts.Account;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4520a.C58204ak;
import com.google.common.p4520a.C58234bn;
import com.google.common.p4520a.C58254i;
import com.google.common.p4520a.C58255j;
import com.google.common.p4520a.C58259n;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60916ec;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.geller.f.bs */
/* compiled from: PG */
public final class C21836bs {

    /* renamed from: a */
    private final C58259n f60263a;

    public C21836bs(C21835br brVar) {
        this.f60263a = new C58254i().mo54818b(new C58255j(new C21831bn(brVar)));
    }

    /* renamed from: a */
    public final C60870cx mo27140a(String str, String str2, C58528ij ijVar, C65813cq cqVar) {
        try {
            C58259n nVar = this.f60263a;
            C58836b bVar = C58836b.f156633a;
            C58234bn bnVar = ((C58204ak) nVar).f155647a;
            return ((C21837bt) bnVar.mo54791e(bVar, bnVar.f155752u)).mo27142a((String) null, str, str2, ijVar, cqVar, 3, true);
        } catch (C60916ec | ExecutionException e) {
            return C60856cj.m92899h(new C21827bj("Failed to load GellerSyncSchedulerWithoutReconImpl", e));
        }
    }

    /* renamed from: b */
    public final C60870cx mo27141b(Account account, String str, String str2, C58528ij ijVar, C65813cq cqVar, int i, boolean z) {
        try {
            C58259n nVar = this.f60263a;
            C58833ax j = C58833ax.m90833j(account);
            C58234bn bnVar = ((C58204ak) nVar).f155647a;
            return ((C21837bt) bnVar.mo54791e(j, bnVar.f155752u)).mo27142a(str, (String) null, str2, ijVar, cqVar, i, z);
        } catch (C60916ec | ExecutionException e) {
            return C60856cj.m92899h(new C21827bj("Failed to load GellerSyncSchedulerWithoutReconImpl", e));
        }
    }
}
