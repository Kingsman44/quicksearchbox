package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110318ad;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110336av;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110340az;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110370cb;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.u */
/* compiled from: PG */
final class C110223u extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f307129a;

    /* renamed from: b */
    final /* synthetic */ C110224v f307130b;

    public C110223u(C110224v vVar, RecyclerView recyclerView) {
        this.f307130b = vVar;
        this.f307129a = recyclerView;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        if (i2 > 0 && (linearLayoutManager = (LinearLayoutManager) this.f307129a.mLayout) != null) {
            if (linearLayoutManager.getChildCount() + linearLayoutManager.findFirstVisibleItemPosition() >= linearLayoutManager.getItemCount() - 3) {
                C110224v vVar = this.f307130b;
                C110370cb cbVar = vVar.f307138h;
                if (cbVar.f307612d != null || cbVar.f307613e != null) {
                    C110340az azVar = vVar.f307135e;
                    C60870cx a = ((C110318ad) azVar.f307547f.mo27525b()).mo98568a(C58833ax.m90833j(cbVar.f307612d), C58833ax.m90833j(cbVar.f307613e));
                    cbVar.f307612d = null;
                    cbVar.f307613e = null;
                    azVar.f307550i.mo28211k(a, "print albums", new C110336av(cbVar));
                }
            }
        }
    }
}
