package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8916f;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90529u;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.z.e.a.f.m */
/* compiled from: PG */
public final /* synthetic */ class C119037m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C85422c f332076a;

    /* renamed from: b */
    public final /* synthetic */ Query f332077b;

    /* renamed from: c */
    public final /* synthetic */ C119053i f332078c;

    /* renamed from: d */
    public final /* synthetic */ C92214y f332079d;

    public /* synthetic */ C119037m(C85422c cVar, Query query, C92214y yVar, C119053i iVar) {
        this.f332076a = cVar;
        this.f332077b = query;
        this.f332079d = yVar;
        this.f332078c = iVar;
    }

    public final void run() {
        C85422c cVar = this.f332076a;
        Query query = this.f332077b;
        C92214y yVar = this.f332079d;
        C119053i iVar = this.f332078c;
        cVar.mo78945k(query);
        if (query.mo84326bK()) {
            C90529u uVar = new C90529u((byte[]) null);
            yVar.mo86892c(query.f252749G);
            cVar.mo78943i(query, new VoiceSearchError(query, uVar, (String) null));
            iVar.f332140a.mo104093e(uVar);
        }
    }
}
