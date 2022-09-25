package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.z */
/* compiled from: PG */
public final /* synthetic */ class C96872z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96810ac f270849a;

    /* renamed from: b */
    public final /* synthetic */ String f270850b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f270851c;

    public /* synthetic */ C96872z(C96810ac acVar, String str, Throwable th) {
        this.f270849a = acVar;
        this.f270850b = str;
        this.f270851c = th;
    }

    public final Object apply(Object obj) {
        C96810ac acVar = this.f270849a;
        String str = this.f270850b;
        Throwable th = this.f270851c;
        C96811ad adVar = new C96811ad();
        adVar.f270740a = new Date();
        adVar.mo90353b(str);
        adVar.mo90354c((C58495hd) obj);
        adVar.f270741b = th;
        C96809ab a = adVar.mo90352a();
        synchronized (acVar.f270738b) {
            acVar.f270738b.add(a);
        }
        return null;
    }
}
