package com.google.android.apps.gsa.staticplugins.p7756cx;

import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.C145779h;
import com.google.android.gms.reminders.C145855n;
import com.google.android.gms.reminders.model.Task;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.cx.b */
/* compiled from: PG */
public final /* synthetic */ class C99223b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C99233l f277585a;

    /* renamed from: b */
    public final /* synthetic */ C143851w f277586b;

    public /* synthetic */ C99223b(C99233l lVar, C143851w wVar) {
        this.f277585a = lVar;
        this.f277586b = wVar;
    }

    public final Object apply(Object obj) {
        C99233l lVar = this.f277585a;
        C143851w wVar = this.f277586b;
        Task task = (Task) obj;
        C145779h hVar = lVar.f277609g;
        String k = task.mo122076m().mo122042k();
        C145855n nVar = new C145855n();
        nVar.mo122234b(0);
        nVar.f394399a = false;
        return (Status) hVar.mo121950c(wVar, k, task, nVar.mo122233a()).mo117316a();
    }
}
