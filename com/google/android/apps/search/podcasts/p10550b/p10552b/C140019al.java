package com.google.android.apps.search.podcasts.p10550b.p10552b;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97915e;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.protos.p4757ac.p4758a.C63111j;

/* renamed from: com.google.android.apps.search.podcasts.b.b.al */
/* compiled from: PG */
final class C140019al implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C63111j f380552a;

    /* renamed from: b */
    final /* synthetic */ C97918h f380553b;

    /* renamed from: c */
    final /* synthetic */ C140022ao f380554c;

    public C140019al(C140022ao aoVar, C63111j jVar, C97918h hVar) {
        this.f380554c = aoVar;
        this.f380552a = jVar;
        this.f380553b = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C140022ao.f380558a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(41523)).mo56386p("Failed to connect to the media url for retry.");
        this.f380554c.mo115401i(this.f380553b, true);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar;
        String g = C140022ao.m227690g((C61366ah) obj, this.f380552a.f170353d);
        Uri parse = Uri.parse(g);
        String scheme = parse.getScheme();
        if (scheme == null || !C58890d.m90990e("http", scheme)) {
            C59104x d = C140022ao.f380558a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
            ((C59052c) ((C59052c) d).mo56372aa(41525)).mo56389s("The retry logic doesn't apply to media urls in non-HTTP scheme: %s.", g);
            axVar = C58836b.f156633a;
        } else {
            String builder = parse.buildUpon().scheme("https").toString();
            C58976aa aaVar = C58975e.f156826a;
            axVar = C58833ax.m90834k(builder);
        }
        if (axVar.mo56113h()) {
            C97915e eVar = (C97915e) this.f380553b.toBuilder();
            String str = (String) axVar.mo56107c();
            eVar.copyOnWrite();
            C97918h hVar = (C97918h) eVar.instance;
            str.getClass();
            hVar.f273414a |= 1024;
            hVar.f273425l = str;
            C97918h hVar2 = (C97918h) eVar.build();
            C140022ao aoVar = this.f380554c;
            C97920j jVar = this.f380553b.f273423j;
            if (jVar == null) {
                jVar = C97920j.f273426e;
            }
            aoVar.mo115403k(jVar, new C140018ak(this, this.f380553b, hVar2));
            return;
        }
        this.f380554c.mo115401i(this.f380553b, true);
    }
}
