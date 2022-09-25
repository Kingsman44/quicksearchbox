package com.google.android.libraries.onegoogle.owners;

import android.content.Context;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.people.C145686o;
import com.google.android.gms.people.C145687p;
import com.google.android.gms.people.C145699q;
import com.google.android.libraries.onegoogle.owners.p2386a.C30950i;
import com.google.android.libraries.onegoogle.owners.p2387b.C30962a;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.common.base.C58881cr;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.owners.q */
/* compiled from: PG */
public final /* synthetic */ class C31015q implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C31016r f83517a;

    /* renamed from: b */
    public final /* synthetic */ C30847m f83518b;

    public /* synthetic */ C31015q(C31016r rVar, C30847m mVar) {
        this.f83517a = rVar;
        this.f83518b = mVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C31016r rVar = this.f83517a;
        C30847m mVar = this.f83518b;
        Context applicationContext = rVar.f83519a.getApplicationContext();
        ExecutorService executorService = rVar.f83520b;
        applicationContext.getClass();
        executorService.getClass();
        C145686o oVar = new C145686o();
        oVar.f393927a = 641;
        C145687p a = oVar.mo121730a();
        return new C30962a(new C30950i(applicationContext, C145699q.m236911a(applicationContext, a), C145699q.m236913c(applicationContext, a), C145699q.m236912b(applicationContext, a), new C30973h(applicationContext, executorService), executorService, C143875g.f389987a), 2, mVar, applicationContext.getPackageName());
    }
}
