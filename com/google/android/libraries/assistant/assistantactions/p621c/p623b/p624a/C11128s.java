package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import android.content.Context;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.s */
/* compiled from: PG */
public final /* synthetic */ class C11128s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11129t f36464a;

    /* renamed from: b */
    public final /* synthetic */ C52091ex f36465b;

    /* renamed from: c */
    public final /* synthetic */ C51406gn f36466c;

    /* renamed from: d */
    public final /* synthetic */ C11054a f36467d;

    /* renamed from: e */
    public final /* synthetic */ Context f36468e;

    public /* synthetic */ C11128s(C11129t tVar, C52091ex exVar, C51406gn gnVar, C11054a aVar, Context context) {
        this.f36464a = tVar;
        this.f36465b = exVar;
        this.f36466c = gnVar;
        this.f36467d = aVar;
        this.f36468e = context;
    }

    public final Object apply(Object obj) {
        C11129t tVar = this.f36464a;
        C52091ex exVar = this.f36465b;
        C51406gn gnVar = this.f36466c;
        C11054a aVar = this.f36467d;
        Context context = this.f36468e;
        C58833ax axVar = (C58833ax) obj;
        tVar.mo19611c("aum_resolved", Boolean.valueOf(axVar.mo56113h()));
        if (axVar.mo56113h()) {
            return tVar.mo19610b(exVar, gnVar, aVar, context, axVar);
        }
        C59104x b = C11129t.f36469a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ContactLookupFeatureImpl");
        ((C59052c) ((C59052c) b).mo56372aa(42881)).mo56386p("Failed to disambiguate contact by AUM");
        tVar.mo19611c("fulfillment_result", "fallback to server");
        return C58836b.f156633a;
    }
}
