package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1186a.p1187a;

import android.accounts.Account;
import com.google.android.gms.awareness.C142929d;
import com.google.android.gms.contextmanager.C144030d;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15840a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15854o f47079a;

    /* renamed from: b */
    public final /* synthetic */ C144030d f47080b;

    /* renamed from: c */
    public final /* synthetic */ ContextDataFilterImpl f47081c;

    public /* synthetic */ C15840a(C15854o oVar, ContextDataFilterImpl contextDataFilterImpl, C144030d dVar) {
        this.f47079a = oVar;
        this.f47081c = contextDataFilterImpl;
        this.f47080b = dVar;
    }

    public final C60870cx apply(Object obj) {
        C15854o oVar = this.f47079a;
        ContextDataFilterImpl contextDataFilterImpl = this.f47081c;
        C144030d dVar = this.f47080b;
        C58833ax axVar = (C58833ax) obj;
        C58976aa aaVar = C58975e.f156826a;
        axVar.mo56113h();
        return ((C15850k) oVar.f47105j.orElseGet(new C15841b(oVar, C142929d.m231886a(oVar.f47099d.getPackageName(), (Account) axVar.mo56111f())))).mo22589a(contextDataFilterImpl, dVar, oVar.f47098c);
    }
}
