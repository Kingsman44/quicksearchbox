package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139279a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.e */
/* compiled from: PG */
public final /* synthetic */ class C133298e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133255c f363230a;

    /* renamed from: b */
    public final /* synthetic */ C30306o f363231b;

    /* renamed from: c */
    public final /* synthetic */ C139272a f363232c;

    /* renamed from: d */
    public final /* synthetic */ Fragment f363233d;

    public /* synthetic */ C133298e(C133255c cVar, C30306o oVar, C139272a aVar, Fragment fragment) {
        this.f363230a = cVar;
        this.f363231b = oVar;
        this.f363232c = aVar;
        this.f363233d = fragment;
    }

    public final void onClick(View view) {
        C133255c cVar = this.f363230a;
        C30306o oVar = this.f363231b;
        C139272a aVar = this.f363232c;
        Fragment fragment = this.f363233d;
        cVar.mo111050a(149790);
        C46108a aVar2 = (C46108a) C30281j.m56319c(oVar.f81934a.f81883d);
        aVar2.getClass();
        AccountId a = aVar2.mo50209a();
        C139279a aVar3 = (C139279a) C139280b.f378830g.createBuilder();
        aVar3.copyOnWrite();
        C139280b bVar = (C139280b) aVar3.instance;
        bVar.f378832a |= 1;
        bVar.f378833b = "https://search.google.com/search-console/insights?utm_source=aga&utm_medium=mavatar&utm_campaign=mavatar&source=xga";
        aVar3.copyOnWrite();
        C139280b bVar2 = (C139280b) aVar3.instance;
        bVar2.f378832a |= 2;
        bVar2.f378834c = true;
        aVar3.copyOnWrite();
        C139280b bVar3 = (C139280b) aVar3.instance;
        bVar3.f378832a |= 16;
        bVar3.f378837f = true;
        C47709i.m84861a(fragment, aVar.mo114864a((C139280b) aVar3.build(), a));
    }
}
