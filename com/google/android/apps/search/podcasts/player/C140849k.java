package com.google.android.apps.search.podcasts.player;

import android.net.Uri;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2509m;
import androidx.media3.p132b.C2510n;
import androidx.media3.p132b.C2518v;
import com.google.android.apps.search.podcasts.p10601r.C140958b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.k */
/* compiled from: PG */
public final class C140849k implements C2505i {

    /* renamed from: c */
    private static final C59071e f382477c = C59071e.m91331h();

    /* renamed from: a */
    public Uri f382478a;

    /* renamed from: b */
    public Uri f382479b;

    /* renamed from: d */
    private final C2518v f382480d;

    /* renamed from: e */
    private final C140958b f382481e;

    public C140849k(C2518v vVar, C140958b bVar) {
        this.f382480d = vVar;
        this.f382481e = bVar;
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        C69664n.m101061g(bArr, "target");
        return this.f382480d.mo5879a(bArr, i, i2);
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        Uri uri;
        C69664n.m101061g(nVar, "dataSpec");
        Uri uri2 = this.f382479b;
        if (nVar.f6891a.equals(this.f382478a) && uri2 != null) {
            return this.f382480d.mo5880b(C2509m.m6615a(uri2, nVar.f6892b, nVar.f6895e, nVar.f6896f, nVar.f6897g, nVar.f6898h, nVar.f6899i));
        }
        C2518v vVar = this.f382480d;
        long j = nVar.f6892b;
        Map map = nVar.f6895e;
        long j2 = nVar.f6896f;
        long j3 = nVar.f6897g;
        String str = nVar.f6898h;
        int i = nVar.f6899i;
        C140958b bVar = this.f382481e;
        String uri3 = nVar.f6891a.toString();
        C69664n.m101060f(uri3, "dataSpec.uri.toString()");
        long b = vVar.mo5880b(C2509m.m6615a(Uri.parse(bVar.mo116043a(uri3)), j, map, j2, j3, str, i));
        this.f382478a = nVar.f6891a;
        Uri c = this.f382480d.mo5881c();
        if (c != null) {
            C140958b bVar2 = this.f382481e;
            String uri4 = c.toString();
            C69664n.m101060f(uri4, "it.toString()");
            uri = Uri.parse(bVar2.mo116043a(uri4));
        } else {
            uri = null;
        }
        this.f382479b = uri;
        C59052c cVar = (C59052c) f382477c.mo56224b();
        Uri uri5 = this.f382478a;
        Uri uri6 = this.f382479b;
        cVar.mo56379ah(new C59094n(41623));
        cVar.mo56354G("Caching redirected urls [original=%s,final=%s]", uri5, uri6);
        return b;
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f382480d.mo5881c();
    }

    /* renamed from: d */
    public final void mo5882d() {
        this.f382480d.mo5882d();
    }

    /* renamed from: e */
    public final Map mo5883e() {
        return this.f382480d.mo5883e();
    }

    /* renamed from: f */
    public final void mo5884f(C2495an anVar) {
        C69664n.m101061g(anVar, "transferListener");
        this.f382480d.mo5884f(new C140848j(anVar, this));
    }
}
