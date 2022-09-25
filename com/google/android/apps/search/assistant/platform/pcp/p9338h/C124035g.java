package com.google.android.apps.search.assistant.platform.pcp.p9338h;

import android.content.ContentValues;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.h.g */
/* compiled from: PG */
public final /* synthetic */ class C124035g implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ ContentValues f342592a;

    /* renamed from: b */
    public final /* synthetic */ C124038j f342593b;

    public /* synthetic */ C124035g(ContentValues contentValues, C124038j jVar) {
        this.f342592a = contentValues;
        this.f342593b = jVar;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        ContentValues contentValues = this.f342592a;
        C124038j jVar = this.f342593b;
        bfVar.mo45936j("ClientProactiveData", contentValues, "data_type =? AND data_id =? AND client_type =?", String.valueOf(jVar.mo106235a()), jVar.mo106237c(), String.valueOf(jVar.mo106236b().f139793X));
    }
}
