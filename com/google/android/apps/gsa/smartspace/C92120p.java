package com.google.android.apps.gsa.smartspace;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.util.C91123v;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.smartspace.p */
/* compiled from: PG */
public final class C92120p {

    /* renamed from: a */
    private final C69464a f256840a;

    /* renamed from: b */
    private final C69464a f256841b;

    /* renamed from: c */
    private final C69464a f256842c;

    public C92120p(C69464a aVar, C69464a aVar2, C69464a aVar3) {
        aVar.getClass();
        this.f256840a = aVar;
        aVar2.getClass();
        this.f256841b = aVar2;
        aVar3.getClass();
        this.f256842c = aVar3;
    }

    /* renamed from: a */
    public final C92119o mo86767a(C92118n nVar) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f256840a.mo17428b();
        sharedPreferences.getClass();
        Context context = (Context) this.f256841b.mo17428b();
        context.getClass();
        C91123v vVar = (C91123v) this.f256842c.mo17428b();
        vVar.getClass();
        nVar.getClass();
        return new C92119o(sharedPreferences, context, vVar, nVar);
    }
}
