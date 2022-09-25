package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p427am.p428a.p429a.p430a.p431a.C8605a;
import com.google.p427am.p428a.p429a.p430a.p431a.C8606b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.h */
/* compiled from: PG */
public final /* synthetic */ class C109111h implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C109100ar f303857a;

    /* renamed from: b */
    public final /* synthetic */ Uri f303858b;

    public /* synthetic */ C109111h(C109100ar arVar, Uri uri) {
        this.f303857a = arVar;
        this.f303858b = uri;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C109100ar arVar = this.f303857a;
        Uri uri = this.f303858b;
        try {
            String x = arVar.f303791x.mo79758x(C90037cp.f248519bu);
            String g = ((C86054o) arVar.f303742G.mo27525b()).mo79673g();
            C8605a aVar = (C8605a) C8606b.f29835e.createBuilder();
            aVar.copyOnWrite();
            C8606b bVar = (C8606b) aVar.instance;
            x.getClass();
            bVar.f29837a |= 2;
            bVar.f29840d = x;
            g.getClass();
            aVar.copyOnWrite();
            C8606b bVar2 = (C8606b) aVar.instance;
            bVar2.f29838b = 2;
            bVar2.f29839c = g;
            Optional e = arVar.mo97589e((C8606b) aVar.build());
            Uri.Builder buildUpon = uri.buildUpon();
            if (!TextUtils.isEmpty(x)) {
                buildUpon.appendQueryParameter("utm_campaign", x);
            }
            if (e.isPresent()) {
                buildUpon.appendQueryParameter("eet", (String) e.get());
            }
            return Optional.m71637of(buildUpon.build());
        } catch (RuntimeException e2) {
            C59104x c = C109100ar.f303734a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TbybGreetingContainer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(24510)).mo56386p("Error to encrypt nest promo uri");
            return Optional.empty();
        }
    }
}
