package com.google.android.apps.gsa.search.core.p6820r.p6834f;

import com.google.android.apps.gsa.search.core.p6816p.C86211au;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.nio.ByteBuffer;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.f.k */
/* compiled from: PG */
public final class C86441k extends C68247h {

    /* renamed from: a */
    private final C68283d f233609a;

    /* renamed from: c */
    private final C68283d f233610c;

    /* renamed from: d */
    private final C68283d f233611d;

    /* renamed from: e */
    private final C68283d f233612e;

    public C86441k(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C86441k.class), aVar);
        this.f233609a = C68236af.m98549d(dVar);
        this.f233610c = C68236af.m98549d(dVar2);
        this.f233611d = C68236af.m98549d(dVar3);
        this.f233612e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C89020ar arVar = (C89020ar) list.get(0);
        UriRequest uriRequest = (UriRequest) list.get(1);
        C86211au auVar = (C86211au) list.get(2);
        C89052h hVar = (C89052h) list.get(3);
        synchronized (auVar.f232962c) {
            auVar.f232964e = uriRequest;
        }
        C89068x xVar = C89009ag.f241207b;
        if (uriRequest.mo81503c()) {
            xVar = C89009ag.m144715a(ByteBuffer.wrap(uriRequest.f236334d), hVar);
        }
        return C60856cj.m92900i(new C89018ap(arVar, xVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233609a.mo60297gq(), this.f233610c.mo60297gq(), this.f233611d.mo60297gq(), this.f233612e.mo60297gq());
    }
}
