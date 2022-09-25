package com.google.android.libraries.mdi.download.p2230c.p2234c.p2235a;

import android.content.Context;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.p2230c.p2234c.C28766f;
import com.google.android.libraries.mdi.download.p2230c.p2234c.C28768h;
import com.google.android.libraries.p10983ae.p10984a.C147457b;
import com.google.android.libraries.p10983ae.p10984a.C147473r;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.base.C58881cr;
import dagger.C68214a;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* renamed from: com.google.android.libraries.mdi.download.c.c.a.a */
/* compiled from: PG */
final class C28760a implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ Executor f78179a;

    /* renamed from: b */
    final /* synthetic */ C28787cb f78180b;

    /* renamed from: c */
    final /* synthetic */ C68214a f78181c;

    /* renamed from: d */
    final /* synthetic */ Context f78182d;

    /* renamed from: e */
    final /* synthetic */ C58833ax f78183e;

    /* renamed from: f */
    final /* synthetic */ C42813k f78184f;

    public C28760a(Executor executor, C28787cb cbVar, C68214a aVar, Context context, C58833ax axVar, C42813k kVar) {
        this.f78179a = executor;
        this.f78180b = cbVar;
        this.f78181c = aVar;
        this.f78182d = context;
        this.f78183e = axVar;
        this.f78184f = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6453a() {
        C28768h hVar = new C28768h(this.f78179a, this.f78180b.mo34426f());
        C147457b bVar = new C147457b((CronetEngine) this.f78181c.mo27525b());
        C147476u uVar = new C147476u(bVar, this.f78182d, hVar);
        uVar.mo124219g((C147473r) ((C58847bk) this.f78183e).f156646a);
        return new C28766f(this.f78182d, uVar, bVar, this.f78184f, hVar);
    }
}
