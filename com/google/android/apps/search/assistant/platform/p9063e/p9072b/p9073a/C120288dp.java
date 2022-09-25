package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.gsa.binaries.satin.app.aoa;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9066a.C120163l;
import com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9066a.C120164m;
import com.google.android.libraries.search.assistant.p2513e.p2514a.C32566c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.dp */
/* compiled from: PG */
public final class C120288dp extends C68247h {

    /* renamed from: a */
    private final C68283d f334680a;

    /* renamed from: c */
    private final C68283d f334681c;

    /* renamed from: d */
    private final C68283d f334682d;

    public C120288dp(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C120288dp.class), aVar);
        this.f334680a = C68236af.m98549d(dVar);
        this.f334681c = C68236af.m98549d(dVar2);
        this.f334682d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C120164m mVar = (C120164m) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        C60870cx gq = this.f334682d.mo60297gq();
        Executor executor = (Executor) mVar.f334431a.mo17428b();
        executor.getClass();
        aoa aoa = (aoa) mVar.f334432b.mo17428b();
        aoa.getClass();
        C32566c cVar = (C32566c) mVar.f334433c.mo17428b();
        cVar.getClass();
        C119893l lVar = (C119893l) mVar.f334434d.mo17428b();
        lVar.getClass();
        gq.getClass();
        return C60856cj.m92900i(new C120163l(executor, aoa, cVar, lVar, booleanValue, gq));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f334680a.mo60297gq(), this.f334681c.mo60297gq());
    }
}
