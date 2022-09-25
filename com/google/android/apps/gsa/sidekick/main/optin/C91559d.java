package com.google.android.apps.gsa.sidekick.main.optin;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import java.util.List;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.d */
/* compiled from: PG */
public final /* synthetic */ class C91559d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ OptInActivity f255399a;

    public /* synthetic */ C91559d(OptInActivity optInActivity) {
        this.f255399a = optInActivity;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        return (List) DesugarArrays.stream((T[]) this.f255399a.f255392x.mo79684r()).filter(new C91560e((C58495hd) obj)).collect(C58370cn.f155946a);
    }
}
