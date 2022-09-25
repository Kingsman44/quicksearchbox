package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.ac */
/* compiled from: PG */
public final /* synthetic */ class C116501ac implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116502ad f323006a;

    /* renamed from: b */
    public final /* synthetic */ long f323007b;

    /* renamed from: c */
    public final /* synthetic */ Uri f323008c;

    /* renamed from: d */
    public final /* synthetic */ Uri f323009d;

    public /* synthetic */ C116501ac(C116502ad adVar, long j, Uri uri, Uri uri2) {
        this.f323006a = adVar;
        this.f323007b = j;
        this.f323008c = uri;
        this.f323009d = uri2;
    }

    public final void run() {
        C116502ad adVar = this.f323006a;
        long j = this.f323007b;
        Uri uri = this.f323008c;
        Uri uri2 = this.f323009d;
        Query query = adVar.f323019j.f324189y;
        if (query.f252749G == j) {
            Query o = ((C85929cw) adVar.f323017h.mo27525b()).mo79574o(query, uri.toString());
            o.getClass();
            adVar.mo102741a(query, o, uri2);
        }
    }
}
