package com.google.android.apps.search.googleapp.search.srp;

import android.content.Intent;
import android.net.Uri;
import android.support.p031v4.app.C0167am;
import com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139279a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.aj */
/* compiled from: PG */
public final /* synthetic */ class C137707aj implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ C137711an f374541a;

    public /* synthetic */ C137707aj(C137711an anVar) {
        this.f374541a = anVar;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        C137711an anVar = this.f374541a;
        Uri parse = Uri.parse(lVar.f113296b);
        C139272a aVar = anVar.f374603v;
        C139279a aVar2 = (C139279a) C139280b.f378830g.createBuilder();
        String uri = parse.toString();
        aVar2.copyOnWrite();
        C139280b bVar = (C139280b) aVar2.instance;
        uri.getClass();
        bVar.f378832a |= 1;
        bVar.f378833b = uri;
        Intent a = aVar.mo114864a((C139280b) aVar2.build(), anVar.f374583b);
        C137699ab abVar = anVar.f374601t;
        abVar.getClass();
        C0167am activity = abVar.getActivity();
        if (activity != null) {
            C47810es.m84979s(activity, a);
        }
    }
}
