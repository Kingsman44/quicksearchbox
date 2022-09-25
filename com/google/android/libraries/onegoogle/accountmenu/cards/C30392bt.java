package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.C133301h;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.cards.p2355db.CardsDatabase;
import com.google.android.libraries.onegoogle.common.C30931r;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58836b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.bt */
/* compiled from: PG */
public final class C30392bt extends C30360ao {

    /* renamed from: b */
    public final CardsDatabase f82148b;

    /* renamed from: c */
    public final Map f82149c = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private C30388bp f82150d;

    /* renamed from: g */
    private final C133301h f82151g;

    public C30392bt(C133301h hVar, Context context, C30158c cVar, Executor executor) {
        super(cVar, executor);
        this.f82151g = hVar;
        this.f82148b = CardsDatabase.m56643A(context, executor);
        executor.execute(new C30391bs(this));
    }

    /* renamed from: a */
    public final void mo35627a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35628b(Object obj) {
        C46108a aVar = (C46108a) obj;
        C30388bp bpVar = (C30388bp) this.f82151g.f363240a;
        this.f82150d = bpVar;
        if (bpVar == null) {
            C30931r.m57728a(this.f81607a, C58836b.f156633a);
            return;
        }
        throw null;
    }
}
