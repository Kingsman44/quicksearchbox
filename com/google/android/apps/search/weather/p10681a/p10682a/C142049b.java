package com.google.android.apps.search.weather.p10681a.p10682a;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.weather.p10689h.C142097c;
import com.google.android.apps.search.weather.p10689h.C142098d;
import com.google.android.apps.search.weather.p10689h.C142099e;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.weather.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C142049b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C142055h f385408a;

    /* renamed from: b */
    public final /* synthetic */ C30306o f385409b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f385410c;

    public /* synthetic */ C142049b(C142055h hVar, C30306o oVar, Fragment fragment) {
        this.f385408a = hVar;
        this.f385409b = oVar;
        this.f385410c = fragment;
    }

    public final void onClick(View view) {
        C142055h hVar = this.f385408a;
        C30306o oVar = this.f385409b;
        Fragment fragment = this.f385410c;
        C46108a aVar = (C46108a) C30281j.m56319c(oVar.f81934a.f81883d);
        if (aVar != null) {
            AccountId a = aVar.mo50209a();
            boolean z = hVar.f385430n;
            C142098d dVar = (C142098d) C142099e.f385514c.createBuilder();
            dVar.copyOnWrite();
            C142099e eVar = (C142099e) dVar.instance;
            eVar.f385516a |= 1;
            eVar.f385517b = z;
            C142097c cVar = new C142097c();
            C68324h.m98669f(cVar);
            C47247a.m84047b(cVar, a);
            C47243l.m84039a(cVar, (C142099e) dVar.build());
            cVar.showNow(fragment.getChildFragmentManager(), "UNIT_DIALOG_FRAGMENT");
        }
    }
}
