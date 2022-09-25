package com.google.android.libraries.p3339v;

import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146024d;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.v.a */
/* compiled from: PG */
public final class C43201a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C146010af f112924a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f112925b;

    /* renamed from: c */
    final /* synthetic */ C146024d f112926c;

    public C43201a(C146010af afVar, C60870cx cxVar, C146024d dVar) {
        this.f112924a = afVar;
        this.f112925b = cxVar;
        this.f112926c = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (((C60873d) this.f112925b).value instanceof C60873d.C60875b) {
            this.f112926c.f394725a.f394724a.mo122510x((Object) null);
        } else if (th instanceof Exception) {
            this.f112924a.f394698a.mo122507u((Exception) th);
        } else {
            C146010af afVar = this.f112924a;
            afVar.f394698a.mo122507u(new ExecutionException(th));
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f112924a.f394698a.mo122508v(obj);
    }
}
