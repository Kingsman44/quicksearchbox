package com.google.android.apps.gsa.staticplugins.p7800di.p7804d;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.di.d.r */
/* compiled from: PG */
public final class C99585r implements C68220f {

    /* renamed from: a */
    private final C69464a f278698a;

    public C99585r(C69464a aVar) {
        this.f278698a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        C88433bd bdVar = (C88433bd) ((C68221g) this.f278698a).f184583a;
        if ((bdVar.f239089a & 1) != 0) {
            return Long.valueOf(bdVar.f239090b);
        }
        throw new IllegalArgumentException("Session proto has no session id");
    }
}
