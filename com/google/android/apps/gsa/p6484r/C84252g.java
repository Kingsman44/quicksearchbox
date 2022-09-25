package com.google.android.apps.gsa.p6484r;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.binaries.satin.app.adh;
import com.google.android.apps.gsa.binaries.satin.app.adj;
import com.google.android.apps.gsa.search.core.C85637av;
import com.google.android.apps.gsa.search.core.google.C86080v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86318i;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.speech.audio.C92196g;
import com.google.android.apps.gsa.staticplugins.p7648ce.C97565ax;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.nowdev.C45005a;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.r.g */
/* compiled from: PG */
public class C84252g extends C84246a {

    /* renamed from: a */
    public adh f229274a;

    /* renamed from: b */
    private C45005a f229275b;

    public final IBinder onBind(Intent intent) {
        if (this.f229275b == null) {
            adh adh = this.f229274a;
            adh.f195508b = this;
            C68225k.m98529a(adh.f195508b, Service.class);
            adj adj = new adj(adh.f195507a, adh.f195508b);
            C86080v vVar = (C86080v) adj.f195510b.a.f202910fw.mo17428b();
            C68214a a = C68219e.m98518a(adj.f195510b.d.f201797fr);
            C68214a a2 = C68219e.m98518a(adj.f195510b.a.f202749cu);
            C68214a a3 = C68219e.m98518a(adj.f195510b.a.f202732cd);
            C68214a a4 = C68219e.m98518a(adj.f195510b.hv);
            C68214a a5 = C68219e.m98518a(adj.f195510b.a.f202671bV);
            C68214a a6 = C68219e.m98518a(adj.f195510b.a.f202324I);
            C68214a a7 = C68219e.m98518a(adj.f195510b.a.f202740cl);
            C68214a a8 = C68219e.m98518a(adj.f195510b.a.f202793dl);
            C68214a a9 = C68219e.m98518a(adj.f195510b.a.f202703cA);
            C68214a a10 = C68219e.m98518a(adj.f195510b.a.f202112E);
            C68214a a11 = C68219e.m98518a(adj.f195510b.a.f202651bB);
            C68214a a12 = C68219e.m98518a(adj.f195510b.b.f200296gs);
            C68214a a13 = C68219e.m98518a(adj.f195511c);
            C68214a a14 = C68219e.m98518a(adj.f195510b.a.f202875fN);
            C68214a a15 = C68219e.m98518a(adj.f195512d);
            C68214a a16 = C68219e.m98518a(adj.f195510b.a.f202865fD);
            C68214a a17 = C68219e.m98518a(adj.f195510b.a.f202377J);
            C68214a a18 = C68219e.m98518a(adj.f195510b.b.f200200fB);
            C69464a aVar = adj.f195513e;
            C68214a a19 = C68219e.m98518a(adj.f195514f);
            C68214a a20 = C68219e.m98518a(adj.f195510b.a.f202735cg);
            C68214a a21 = C68219e.m98518a(adj.f195515g);
            C90476a aVar2 = (C90476a) adj.f195510b.r.mo17428b();
            this.f229275b = new C97565ax(adj.f195509a, (Context) adj.f195510b.g.mo17428b(), (C86127w) adj.f195510b.a.f203497r.mo17428b(), (C86318i) adj.f195510b.b.f200343hm.mo17428b(), (C86124t) adj.f195510b.a.f202006C.mo17428b(), (C90929bz) adj.f195510b.a.f203444q.mo17428b(), (C21370a) adj.f195510b.i.mo17428b(), (C85637av) adj.f195510b.a.f202796do.mo17428b(), (C91022f) adj.f195510b.a.f202649b.mo17428b(), a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, aVar, a19, a20, a21, (C90479a) adj.f195510b.t.mo17428b(), (C22871g) adj.f195510b.aT.mo17428b(), (C22871g) adj.f195510b.aW.mo17428b(), (C22871g) adj.f195510b.aU.mo17428b(), (C22871g) adj.f195510b.aV.mo17428b(), C68219e.m98518a(adj.f195510b.b.f200213fO), C68219e.m98518a(adj.f195510b.a.f203762w), (C92196g) adj.f195510b.a.f203017hx.mo17428b(), C68219e.m98518a(adj.f195510b.a.f202795dn), C68219e.m98518a(adj.f195516h), C68219e.m98518a(adj.f195517i), C68219e.m98518a(adj.f195518j), C68219e.m98518a(adj.f195519k), C68219e.m98518a(adj.f195510b.b.f200046cG), C68219e.m98518a(adj.f195510b.a.f203079jF), (C42876ab) adj.f195510b.gD.mo17428b(), C68219e.m98518a(adj.f195510b.a.f202775dT), C68219e.m98518a(adj.f195510b.a.f203921z), C68219e.m98518a(adj.f195510b.a.f202870fI), C68219e.m98518a(adj.f195510b.b.f200388ie), adj.f195510b.a.mo68670y(), C68219e.m98518a(adj.f195510b.a.f202854et), C68219e.m98518a(adj.f195520l));
        }
        return this.f229275b;
    }
}
