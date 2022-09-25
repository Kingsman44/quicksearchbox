package com.google.android.libraries.mdi.download.p2236d.p2238b;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C29388el;
import com.google.android.libraries.mdi.download.p2236d.C29238jr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29107u;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.common.base.C58833ax;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.mdi.download.d.b.ag */
/* compiled from: PG */
public final class C28852ag implements C68220f {

    /* renamed from: a */
    private final C28851af f78361a;

    /* renamed from: b */
    private final C69464a f78362b;

    /* renamed from: c */
    private final C69464a f78363c;

    /* renamed from: d */
    private final C69464a f78364d;

    /* renamed from: e */
    private final C69464a f78365e;

    /* renamed from: f */
    private final C69464a f78366f;

    /* renamed from: g */
    private final C69464a f78367g;

    public C28852ag(C28851af afVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6) {
        this.f78361a = afVar;
        this.f78362b = aVar;
        this.f78363c = aVar2;
        this.f78364d = aVar3;
        this.f78365e = aVar4;
        this.f78366f = aVar5;
        this.f78367g = aVar6;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo17428b() {
        C28851af afVar = this.f78361a;
        Context context = ((C28861b) this.f78362b).f78400a.f78353a;
        C68225k.m98532d(context);
        C42813k kVar = (C42813k) this.f78364d.mo17428b();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e((Uri) this.f78363c.mo17428b());
        i.mo45967d(C29388el.f79664d);
        i.mo45969f(false);
        i.mo45965b().mo55395g(C29107u.m54028a(context, afVar.f78359a, (C29037d) this.f78365e.mo17428b(), ((C29238jr) this.f78366f).mo17428b(), (C58833ax) this.f78367g.mo17428b()));
        return afVar.f78360b.mo45979a(i.mo45964a());
    }
}
