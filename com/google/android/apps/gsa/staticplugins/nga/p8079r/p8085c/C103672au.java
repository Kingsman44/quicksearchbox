package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.social.populous.C42706t;
import com.google.android.libraries.social.populous.C42707u;
import com.google.android.libraries.social.populous.C42710x;
import com.google.android.libraries.social.populous.core.C42262ao;
import com.google.android.libraries.social.populous.core.C42269av;
import com.google.android.libraries.social.populous.core.C42337di;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientId;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.common.p4522b.C58759qy;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57877c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.au */
/* compiled from: PG */
public final /* synthetic */ class C103672au implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C103679ba f288766a;

    /* renamed from: b */
    public final /* synthetic */ Account[] f288767b;

    public /* synthetic */ C103672au(C103679ba baVar, Account[] accountArr) {
        this.f288766a = baVar;
        this.f288767b = accountArr;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C103679ba baVar = this.f288766a;
        Account[] accountArr = this.f288767b;
        C42707u a = C42706t.m75427a(baVar.f288779b);
        Account account = accountArr[0];
        C42710x xVar = (C42710x) a;
        xVar.mo45807c(account.name, account.type);
        C42269av c = ClientConfigInternal.m74302c();
        c.mo45229e();
        c.f110871c = new C58759qy(C42262ao.EMAIL);
        c.f110881m = 2;
        ClientId clientId = ClientId.f110758r;
        clientId.getClass();
        c.f110869a = clientId;
        c.f110879k = 89;
        c.f110880l = 782;
        C57877c cVar = C57877c.NGA_SUGGESTION_RESOLUTION_AFFINITY;
        cVar.getClass();
        c.f110870b = cVar;
        c.f110874f = C42337di.m74561a(556, 554, 558, 555, 553, 557);
        c.f110871c = new C58759qy(C42262ao.EMAIL);
        c.f110883o = 20;
        c.f110875g = false;
        a.mo45806b(c.mo45225a());
        xVar.f111935a = baVar.f288780c;
        C42211b bVar = baVar.f288781d;
        bVar.getClass();
        xVar.f111937c = bVar;
        xVar.f111936b = true;
        return a.mo45805a();
    }
}
