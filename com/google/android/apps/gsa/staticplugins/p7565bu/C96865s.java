package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.s */
/* compiled from: PG */
public final /* synthetic */ class C96865s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96810ac f270841a;

    /* renamed from: b */
    public final /* synthetic */ String f270842b;

    public /* synthetic */ C96865s(C96810ac acVar, String str) {
        this.f270841a = acVar;
        this.f270842b = str;
    }

    public final Object apply(Object obj) {
        C96810ac acVar = this.f270841a;
        String str = this.f270842b;
        C96811ad adVar = new C96811ad();
        adVar.f270740a = new Date();
        adVar.mo90354c((C58495hd) obj);
        adVar.mo90353b(str);
        synchronized (acVar.f270738b) {
            acVar.f270738b.add(adVar.mo90352a());
        }
        return null;
    }
}
