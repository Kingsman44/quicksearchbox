package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.libraries.storage.p3315b.C42838ax;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.p4017at.p4082j.p4083a.C54402da;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;

/* renamed from: com.google.android.apps.search.podcasts.b.a.h */
/* compiled from: PG */
public final class C139995h implements C42846be {

    /* renamed from: a */
    final /* synthetic */ C139997j f380506a;

    /* renamed from: b */
    final /* synthetic */ String f380507b;

    /* renamed from: c */
    final /* synthetic */ C54402da f380508c;

    public C139995h(C139997j jVar, String str, C54402da daVar) {
        this.f380506a = jVar;
        this.f380507b = str;
        this.f380508c = daVar;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        long b = this.f380506a.f380512b.mo26870b();
        C42838ax axVar = new C42838ax("episode_metadata");
        axVar.f112125a.append("feed_url = ?");
        axVar.f112126b.add(this.f380507b);
        bfVar.mo45929a(axVar.mo45919a());
        C139997j.m227645f(bfVar, C69505av.m100862d(new C69685i(this.f380507b, this.f380508c)), b);
        C139997j.m227646g(bfVar, C69505av.m100862d(new C69685i(this.f380507b, this.f380508c)), b);
    }
}
