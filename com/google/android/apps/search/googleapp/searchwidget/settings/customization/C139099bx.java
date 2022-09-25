package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.searchwidget.C139032j;
import com.google.android.apps.search.googleapp.searchwidget.C139135z;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139045c;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.bx */
/* compiled from: PG */
public final class C139099bx {

    /* renamed from: a */
    public static final C59071e f378303a = C59071e.m91332i("com.google.android.apps.search.googleapp.searchwidget.settings.customization.bx");

    /* renamed from: b */
    public final C139095bt f378304b;

    /* renamed from: c */
    public final Context f378305c;

    /* renamed from: d */
    public final C28306ab f378306d;

    /* renamed from: e */
    public final C46801dp f378307e;

    /* renamed from: f */
    public final C139045c f378308f;

    /* renamed from: g */
    public final AccountId f378309g;

    /* renamed from: h */
    public final C47770dh f378310h;

    /* renamed from: i */
    public final C139135z f378311i;

    /* renamed from: j */
    public C136247a f378312j;

    /* renamed from: k */
    public C139080be f378313k = C139135z.m226018d();

    /* renamed from: l */
    public final C139032j f378314l;

    public C139099bx(C139095bt btVar, C28306ab abVar, C46801dp dpVar, C139045c cVar, AccountId accountId, C47770dh dhVar, C139135z zVar, C69464a aVar, C69464a aVar2, C139032j jVar) {
        this.f378304b = btVar;
        this.f378305c = btVar.getContext();
        this.f378306d = abVar;
        this.f378307e = dpVar;
        this.f378308f = cVar;
        this.f378309g = accountId;
        this.f378310h = dhVar;
        this.f378311i = zVar;
        this.f378314l = jVar;
        if (btVar.getActivity() != null) {
            this.f378312j = (C136247a) aVar.mo17428b();
            ((IncognitoLifecycleObserver) aVar2.mo17428b()).mo112948g();
        }
    }

    /* renamed from: b */
    public static final void m225951b(View view) {
        C2043bi.m5526T(view, new C139098bw());
    }

    /* renamed from: a */
    public final void mo114721a() {
        C0167am activity = this.f378304b.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
