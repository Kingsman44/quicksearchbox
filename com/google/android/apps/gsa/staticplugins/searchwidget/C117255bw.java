package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.search.googleapp.searchwidget.C139033k;
import com.google.android.apps.search.googleapp.searchwidget.C139131v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bw */
/* compiled from: PG */
public final class C117255bw {

    /* renamed from: a */
    public final Context f325501a;

    /* renamed from: b */
    public final C86034c f325502b;

    /* renamed from: c */
    public final C60887da f325503c;

    /* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bw$a */
    /* compiled from: PG */
    public interface C117256a {
        /* renamed from: cQ */
        C139033k mo103219cQ();

        /* renamed from: cS */
        C139131v mo103220cS();
    }

    public C117255bw(Context context, C86034c cVar, C60887da daVar) {
        this.f325501a = context;
        this.f325502b = cVar;
        this.f325503c = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo103218a() {
        C60870cx b = this.f325502b.mo79697b();
        C117254bv bvVar = new C117254bv(this);
        return C60922j.m93044g(b, C47810es.m84963c(bvVar), this.f325503c);
    }
}
