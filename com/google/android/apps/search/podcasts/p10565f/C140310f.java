package com.google.android.apps.search.podcasts.p10565f;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97917g;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140007a;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140031i;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.f */
/* compiled from: PG */
public final class C140310f implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C140285af f381165a;

    /* renamed from: b */
    final /* synthetic */ View f381166b;

    public C140310f(C140285af afVar, View view) {
        this.f381165a = afVar;
        this.f381166b = view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C60870cx cxVar;
        C140279a aVar = (C140279a) bVar;
        C140285af afVar = this.f381165a;
        C46778cv cvVar = afVar.f381121e;
        C140022ao aoVar = afVar.f381125i;
        C97918h a = C140007a.m227660a(aVar.f381102a, aVar.f381103b, false);
        C97917g gVar = C97917g.DOWNLOAD;
        C97917g a2 = C97917g.m162192a(a.f273415b);
        if (a2 == null) {
            a2 = C97917g.DOWNLOAD;
        }
        int ordinal = a2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                aoVar.mo115401i(a, false);
            } else if (ordinal == 2) {
                C97920j jVar = a.f273423j;
                if (jVar == null) {
                    jVar = C97920j.f273426e;
                }
                aoVar.mo115403k(jVar, (Runnable) null);
            } else if (ordinal == 3) {
                C97920j jVar2 = a.f273423j;
                if (jVar2 == null) {
                    jVar2 = C97920j.f273426e;
                }
                aoVar.mo115403k(jVar2, new C140031i(aoVar, a));
            } else if (ordinal == 4) {
                C97920j jVar3 = a.f273423j;
                if (jVar3 == null) {
                    jVar3 = C97920j.f273426e;
                }
                if (aoVar.f380560c.mo115394f(jVar3)) {
                    aoVar.mo115402j(jVar3);
                }
            }
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = aoVar.mo115396b(a);
        }
        cvVar.mo50787a(cxVar, C140192a.f380885a);
        C60870cx c = this.f381165a.f381127k.mo115678c();
        C69664n.m101060f(c, "preferencesManager.preference");
        C46459k.m82829b(C140989k.m228945c(c, new C140309e(this.f381166b, this.f381165a)), "Failed to get preference from preferenceManager", new Object[0]);
        return C47392e.f123115a;
    }
}
