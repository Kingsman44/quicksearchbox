package com.google.android.libraries.mdi.download.p2243e.p2244a;

import android.content.Context;
import com.google.android.libraries.mdi.download.p2230c.p2234c.C28766f;
import com.google.android.libraries.mdi.download.p2230c.p2234c.C28768h;
import com.google.android.libraries.mdi.download.p2243e.C29357g;
import com.google.android.libraries.p10983ae.p10984a.C147457b;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58881cr;
import dagger.C68214a;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* renamed from: com.google.android.libraries.mdi.download.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C29345a implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Executor f79546a;

    /* renamed from: b */
    public final /* synthetic */ C68214a f79547b;

    /* renamed from: c */
    public final /* synthetic */ Context f79548c;

    /* renamed from: d */
    public final /* synthetic */ C29357g f79549d;

    /* renamed from: e */
    public final /* synthetic */ C42813k f79550e;

    public /* synthetic */ C29345a(Executor executor, C68214a aVar, Context context, C29357g gVar, C42813k kVar) {
        this.f79546a = executor;
        this.f79547b = aVar;
        this.f79548c = context;
        this.f79549d = gVar;
        this.f79550e = kVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Executor executor = this.f79546a;
        C68214a aVar = this.f79547b;
        Context context = this.f79548c;
        C29357g gVar = this.f79549d;
        C42813k kVar = this.f79550e;
        C28768h hVar = new C28768h(executor, 2);
        C147457b bVar = new C147457b((CronetEngine) aVar.mo27525b());
        C147476u uVar = new C147476u(bVar, context, hVar);
        uVar.mo124219g(gVar);
        return new C28766f(context, uVar, bVar, kVar, hVar);
    }
}
