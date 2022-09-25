package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.wearable.C146531n;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.na */
/* compiled from: PG */
public final /* synthetic */ class C96421na implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C96428nh f269743a;

    /* renamed from: b */
    public final /* synthetic */ C96201ex f269744b;

    public /* synthetic */ C96421na(C96428nh nhVar, C96201ex exVar) {
        this.f269743a = nhVar;
        this.f269744b = exVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C96428nh nhVar = this.f269743a;
        C96201ex exVar = this.f269744b;
        C146531n nVar = nhVar.f269755b;
        C143782cc ccVar = C143785cf.m233680b(exVar, nVar.f389927B, "MessageListener").f389806b;
        C1974i.m5319g(ccVar, "Key must not be null");
        C146006ab w = nVar.mo119292w(ccVar, 24007);
        w.mo122499r(new C96424nd(cVar));
        w.mo122498q(new C96425ne(cVar));
        return w;
    }
}
