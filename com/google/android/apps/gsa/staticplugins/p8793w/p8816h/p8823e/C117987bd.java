package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.bd */
/* compiled from: PG */
public final class C117987bd extends C68247h {

    /* renamed from: a */
    private final C68283d f327480a;

    /* renamed from: c */
    private final C68283d f327481c;

    /* renamed from: d */
    private final C68283d f327482d;

    /* renamed from: e */
    private final C68283d f327483e;

    public C117987bd(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C117987bd.class), aVar);
        this.f327480a = C68236af.m98549d(dVar);
        this.f327481c = C68236af.m98549d(dVar2);
        this.f327482d = C68236af.m98549d(dVar3);
        this.f327483e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C117967ak akVar = (C117967ak) list.get(0);
        C118826c cVar = (C118826c) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        Query query = (Query) list.get(3);
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C87421i.f236079a);
        }
        akVar.mo103488d(C88244um.ASSISTANT_REQUEST_ID);
        SettableFuture settableFuture = new SettableFuture();
        return C60856cj.m92893b(akVar.f327408a.mo77889c(query, (C90606n) axVar.mo56107c(), new C117965ai(akVar, settableFuture)), settableFuture).mo57335b(new C117963ag(settableFuture), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327480a.mo60297gq(), this.f327481c.mo60297gq(), this.f327482d.mo60297gq(), this.f327483e.mo60297gq());
    }
}
