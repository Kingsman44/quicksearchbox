package com.google.android.apps.search.podcasts.player;

import android.net.Uri;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2509m;
import androidx.media3.p132b.C2510n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.j */
/* compiled from: PG */
public final class C140848j implements C2495an {

    /* renamed from: a */
    final /* synthetic */ C2495an f382475a;

    /* renamed from: b */
    final /* synthetic */ C140849k f382476b;

    public C140848j(C2495an anVar, C140849k kVar) {
        this.f382475a = anVar;
        this.f382476b = kVar;
    }

    /* renamed from: e */
    private final C2510n m228732e(C2510n nVar) {
        C140849k kVar = this.f382476b;
        Uri uri = kVar.f382478a;
        return (!nVar.f6891a.equals(kVar.f382479b) || uri == null) ? nVar : C2509m.m6615a(uri, nVar.f6892b, nVar.f6895e, nVar.f6896f, nVar.f6897g, nVar.f6898h, nVar.f6899i);
    }

    /* renamed from: a */
    public final void mo5923a(C2505i iVar, C2510n nVar, boolean z, int i) {
        C69664n.m101061g(nVar, "dataSpec");
        this.f382475a.mo5923a(this.f382476b, m228732e(nVar), z, i);
    }

    /* renamed from: b */
    public final void mo5924b(C2505i iVar, C2510n nVar, boolean z) {
        C69664n.m101061g(iVar, "source");
        C69664n.m101061g(nVar, "dataSpec");
        this.f382475a.mo5924b(this.f382476b, m228732e(nVar), z);
    }

    /* renamed from: c */
    public final void mo5925c(C2505i iVar, C2510n nVar, boolean z) {
        C69664n.m101061g(nVar, "dataSpec");
        this.f382475a.mo5925c(this.f382476b, m228732e(nVar), z);
    }

    /* renamed from: d */
    public final void mo5926d(C2505i iVar, C2510n nVar, boolean z) {
        C69664n.m101061g(nVar, "dataSpec");
        this.f382475a.mo5926d(this.f382476b, m228732e(nVar), z);
    }
}
