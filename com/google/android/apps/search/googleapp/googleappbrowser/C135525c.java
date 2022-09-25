package com.google.android.apps.search.googleapp.googleappbrowser;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.C135607c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135458d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.p10117aa.p10120c.C133116a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.c */
/* compiled from: PG */
final class C135525c implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C135503b f369194a;

    public C135525c(C135503b bVar) {
        this.f369194a = bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C135607c cVar = (C135607c) bVar;
        C135503b bVar2 = this.f369194a;
        C136109q e = bVar2.mo112369e();
        e.getClass();
        C135459e eVar = (C135459e) e.f370686d.toBuilder();
        String a = C133116a.m216079a();
        eVar.copyOnWrite();
        C135462h hVar = (C135462h) eVar.instance;
        hVar.f369061a |= 8;
        hVar.f369065e = a;
        C135462h hVar2 = (C135462h) eVar.build();
        String a2 = cVar.mo112396a();
        Intent intent = bVar2.f369133a.getIntent();
        intent.setData(Uri.parse(a2));
        C135458d.m219649b(hVar2, intent);
        bVar2.mo112370f(e.f370684b, Uri.parse(cVar.mo112396a()), hVar2);
        return C47392e.f123115a;
    }
}
