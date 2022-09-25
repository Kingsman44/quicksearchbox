package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6519al.p6648ch.C85107a;
import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.o */
/* compiled from: PG */
public final /* synthetic */ class C100618o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C85107a f281370a;

    /* renamed from: b */
    public final /* synthetic */ C89356b f281371b;

    /* renamed from: c */
    public final /* synthetic */ Query f281372c;

    /* renamed from: d */
    public final /* synthetic */ C89061q f281373d;

    /* renamed from: e */
    public final /* synthetic */ C119066v f281374e;

    /* renamed from: f */
    public final /* synthetic */ C58833ax f281375f;

    public /* synthetic */ C100618o(C85107a aVar, C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        this.f281370a = aVar;
        this.f281371b = bVar;
        this.f281372c = query;
        this.f281373d = qVar;
        this.f281374e = vVar;
        this.f281375f = axVar;
    }

    public final C60870cx apply(Object obj) {
        C85107a aVar = this.f281370a;
        C89356b bVar = this.f281371b;
        Query query = this.f281372c;
        C89061q qVar = this.f281373d;
        C119066v vVar = this.f281374e;
        C58833ax axVar = this.f281375f;
        C58833ax axVar2 = (C58833ax) obj;
        if (!axVar2.mo56113h()) {
            return aVar.mo78721i(bVar, query, qVar, vVar, axVar);
        }
        return C60856cj.m92900i((C86569o) axVar2.mo56107c());
    }
}
