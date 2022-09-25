package com.google.android.libraries.mdi.download.p2236d.p2238b;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C29408fc;
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

/* renamed from: com.google.android.libraries.mdi.download.d.b.ah */
/* compiled from: PG */
public final class C28853ah implements C68220f {

    /* renamed from: a */
    private final C28851af f78368a;

    /* renamed from: b */
    private final C69464a f78369b;

    /* renamed from: c */
    private final C69464a f78370c;

    /* renamed from: d */
    private final C69464a f78371d;

    /* renamed from: e */
    private final C69464a f78372e;

    /* renamed from: f */
    private final C69464a f78373f;

    /* renamed from: g */
    private final C69464a f78374g;

    public C28853ah(C28851af afVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6) {
        this.f78368a = afVar;
        this.f78369b = aVar;
        this.f78370c = aVar2;
        this.f78371d = aVar3;
        this.f78372e = aVar4;
        this.f78373f = aVar5;
        this.f78374g = aVar6;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo17428b() {
        C28851af afVar = this.f78368a;
        Context context = ((C28861b) this.f78369b).f78400a.f78353a;
        C68225k.m98532d(context);
        C42813k kVar = (C42813k) this.f78371d.mo17428b();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e((Uri) this.f78370c.mo17428b());
        i.mo45967d(C29408fc.f79727b);
        i.mo45969f(false);
        i.mo45965b().mo55395g(C29107u.m54029b(context, afVar.f78359a, (C29037d) this.f78372e.mo17428b(), ((C29238jr) this.f78373f).mo17428b(), (C58833ax) this.f78374g.mo17428b()));
        return afVar.f78360b.mo45979a(i.mo45964a());
    }
}
