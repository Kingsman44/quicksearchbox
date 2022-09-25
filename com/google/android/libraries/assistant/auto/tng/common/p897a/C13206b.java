package com.google.android.libraries.assistant.auto.tng.common.p897a;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.a.b */
/* compiled from: PG */
public final class C13206b extends C68247h {

    /* renamed from: a */
    private final C68283d f40849a;

    public C13206b(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C13206b.class), aVar);
        this.f40849a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C68282c cVar = (C68282c) obj;
        if (C57940c.m88582i(cVar)) {
            obj2 = C58833ax.m90834k(Boolean.valueOf(!((C46108a) cVar.mo60292a()).mo50210b().f121165j.equals("google")));
        } else {
            ((C59052c) ((C59052c) ((C59052c) C13205a.f40848a.mo56226d()).mo56382g((Throwable) C57940c.m88575b(cVar).mo56111f())).mo56372aa(44696)).mo56386p("Encountered error in getting account from AccountDataService");
            obj2 = C58836b.f156633a;
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C68236af.m98546a(this.f40849a.mo60297gq());
    }
}
