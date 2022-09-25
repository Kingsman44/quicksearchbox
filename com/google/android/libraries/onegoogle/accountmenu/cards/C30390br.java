package com.google.android.libraries.onegoogle.accountmenu.cards;

import com.google.android.apps.search.googleapp.accounts.p10126ui.features.C133301h;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.br */
/* compiled from: PG */
public final class C30390br implements C30353ah {

    /* renamed from: a */
    private final C58833ax f82144a;

    /* renamed from: b */
    private C30389bq f82145b;

    /* renamed from: c */
    private final C133301h f82146c;

    public C30390br(C133301h hVar, C58833ax axVar) {
        this.f82146c = hVar;
        this.f82144a = axVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C30365at mo35811a(Object obj) {
        C30350ae aeVar;
        if (obj == null) {
            return null;
        }
        if (this.f82145b == null) {
            C46108a aVar = (C46108a) obj;
            C30453u uVar = (C30453u) this.f82146c.f363240a;
            if (uVar == null) {
                aeVar = null;
            } else {
                aeVar = new C30350ae(uVar.mo36043a());
            }
            if (this.f82144a.mo56113h()) {
                C30388bp bpVar = (C30388bp) ((C133301h) this.f82144a.mo56107c()).f363240a;
                if (!(uVar == null || bpVar == null)) {
                    this.f82145b = new C30389bq(uVar);
                    throw null;
                }
            }
            return aeVar;
        }
        throw null;
    }
}
