package com.google.android.apps.gsa.staticplugins.customtabs.intent.p7713a;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7061g.C89917a;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135457c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135458d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139788a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.a.b */
/* compiled from: PG */
public final /* synthetic */ class C98669b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98670c f275625a;

    /* renamed from: b */
    public final /* synthetic */ Intent f275626b;

    public /* synthetic */ C98669b(C98670c cVar, Intent intent) {
        this.f275625a = cVar;
        this.f275626b = intent;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        long j;
        C135462h hVar;
        Uri data;
        String stringExtra;
        C58833ax axVar;
        C98670c cVar = this.f275625a;
        Intent intent = this.f275626b;
        AccountId accountId = (AccountId) obj;
        C135459e eVar = (C135459e) C135462h.f369059n.createBuilder();
        eVar.copyOnWrite();
        C135462h hVar2 = (C135462h) eVar.instance;
        hVar2.f369061a |= 32;
        boolean z = true;
        hVar2.f369067g = true;
        C58833ax a = C89917a.m146440a(intent);
        if (a.mo56113h()) {
            j = ((Long) a.mo56107c()).longValue();
        } else {
            Uri data2 = intent.getData();
            if (data2 == null) {
                axVar = C58836b.f156633a;
            } else {
                axVar = C89917a.m146441b(data2);
            }
            Objects.requireNonNull(cVar.f275631e);
            j = ((Long) axVar.mo56108d(new C98668a())).longValue();
        }
        C139788a aVar = (C139788a) C139789b.f379928d.createBuilder();
        aVar.copyOnWrite();
        C139789b bVar = (C139789b) aVar.instance;
        bVar.f379930a |= 1;
        bVar.f379931b = j;
        aVar.copyOnWrite();
        C139789b bVar2 = (C139789b) aVar.instance;
        bVar2.f379930a |= 2;
        bVar2.f379932c = true;
        C139789b bVar3 = (C139789b) aVar.build();
        eVar.copyOnWrite();
        C135462h hVar3 = (C135462h) eVar.instance;
        bVar3.getClass();
        hVar3.f369066f = bVar3;
        hVar3.f369061a |= 16;
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            String uri2 = uri.toString();
            eVar.copyOnWrite();
            C135462h hVar4 = (C135462h) eVar.instance;
            uri2.getClass();
            hVar4.f369061a |= 64;
            hVar4.f369068h = uri2;
        }
        if (cVar.f275629c.mo78085aC() && (stringExtra = intent.getStringExtra("com.google.android.apps.gsa.customtabs.PREFERRED_URL")) != null) {
            intent.setData(Uri.parse(stringExtra));
            intent.removeExtra("com.google.android.apps.gsa.customtabs.PREFERRED_URL");
        }
        if (intent.hasExtra("google.app.browser.params.key")) {
            hVar = C135458d.m219648a(intent);
        } else {
            hVar = C135462h.f369059n;
        }
        C135461g a2 = C135461g.m219650a(hVar.f369064d);
        if (a2 == null) {
            a2 = C135461g.UNKNOWN;
        }
        boolean z2 = a2.equals(C135461g.NOW) || a2.equals(C135461g.AMP_NOW);
        if ((!cVar.f275629c.mo78132u() && (!z2 || !((C86124t) cVar.f275630d.mo27525b()).mo79746e(C90110fh.f250718x))) || ((data = intent.getData()) != null && cVar.f275632f.mo79502a(data) && "1".equals(data.getQueryParameter("dd")))) {
            z = false;
        }
        eVar.copyOnWrite();
        C135462h hVar5 = (C135462h) eVar.instance;
        hVar5.f369061a |= 512;
        hVar5.f369071k = z;
        return C135457c.m219645a(accountId, intent, (C135462h) eVar.build(), cVar.f275629c.mo78067L());
    }
}
