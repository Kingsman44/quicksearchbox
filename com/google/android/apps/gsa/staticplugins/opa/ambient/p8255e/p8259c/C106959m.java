package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.p6437d.p6439b.C83606a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a.C106434a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131077g;
import com.google.android.libraries.assistant.pcp.p1573k.C18927g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.m */
/* compiled from: PG */
public final class C106959m {

    /* renamed from: a */
    public final C90021c f297920a;

    /* renamed from: b */
    public final C106434a f297921b;

    /* renamed from: c */
    public final C131077g f297922c;

    /* renamed from: d */
    public final C83606a f297923d;

    /* renamed from: e */
    public final C18927g f297924e;

    /* renamed from: f */
    public final C58974d f297925f;

    /* renamed from: g */
    public final C130895ag f297926g;

    /* renamed from: h */
    public final boolean f297927h;

    /* renamed from: i */
    public final C60888db f297928i;

    /* renamed from: j */
    public final PackageManager f297929j;

    public C106959m(C90021c cVar, C106434a aVar, C131077g gVar, C83606a aVar2, C18927g gVar2, C83564a aVar3, C130895ag agVar, boolean z, C60888db dbVar, Context context) {
        this.f297920a = cVar;
        this.f297921b = aVar;
        this.f297922c = gVar;
        this.f297923d = aVar2;
        this.f297924e = gVar2;
        this.f297925f = aVar3.mo76900a("AppSuggestionModel");
        this.f297926g = agVar;
        this.f297927h = z;
        this.f297928i = dbVar;
        this.f297929j = context.getPackageManager();
    }

    /* renamed from: d */
    public static boolean m177674d(C58485gu guVar, C58485gu guVar2) {
        return (guVar.isEmpty() ^ true) && (guVar2.isEmpty() ^ true) && ((C130701b) guVar.get(0)).mo109797h().equals(((C130701b) guVar2.get(0)).mo109797h());
    }

    /* renamed from: a */
    public final C58485gu mo95719a(C58485gu guVar) {
        return (C58485gu) Collection.EL.stream(guVar).filter(new C106951e(this.f297920a.mo79745c(C90069du.f249747y))).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final C58485gu mo95720b(C58485gu guVar) {
        return (C58485gu) Collection.EL.stream(guVar).filter(new C106919c(this)).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public final C60870cx mo95721c(C60870cx cxVar, Object obj, String str) {
        return C47633f.m84733g(cxVar).mo51513e(ExecutionException.class, new C106952f(this, str, obj), this.f297928i);
    }
}
