package com.google.android.libraries.search.logging.appflows.startup.logger;

import android.content.Context;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.logging.appflows.startup.C38807b;
import com.google.android.libraries.search.p2871b.C37172a;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* compiled from: PG */
public final class ActivityScopeStartupFlowLogger implements C38824e, C45987ay, C2376g {

    /* renamed from: a */
    final C38821c f102431a;

    public ActivityScopeStartupFlowLogger(C38828b bVar, C2384o oVar, C45989b bVar2, C38823d dVar) {
        C38807b bVar3 = (C38807b) dVar.f102440a.mo17428b();
        bVar3.getClass();
        C38780c cVar = (C38780c) dVar.f102441b.mo17428b();
        cVar.getClass();
        Context context = (Context) dVar.f102442c.mo17428b();
        context.getClass();
        this.f102431a = new C38821c(bVar, bVar3, cVar, context);
        bVar2.mo50082e(this);
        oVar.mo5790b(this);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C38821c cVar = this.f102431a;
        cVar.f102435a = C58833ax.m90834k(awVar.f120815a.f120816a);
        cVar.mo41660a();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f102431a.f102435a = C58836b.f156633a;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }

    /* renamed from: g */
    public final void mo41659g(C37172a aVar) {
        this.f102431a.mo41659g(aVar);
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        this.f102431a.mo41660a();
    }
}
