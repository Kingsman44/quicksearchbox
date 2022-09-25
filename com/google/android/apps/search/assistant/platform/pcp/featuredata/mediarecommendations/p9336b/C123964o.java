package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9336b;

import android.content.ContentValues;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.o */
/* compiled from: PG */
final class C123964o implements C42846be {

    /* renamed from: a */
    final /* synthetic */ ContentValues f342409a;

    /* renamed from: b */
    final /* synthetic */ C123965p f342410b;

    /* renamed from: c */
    final /* synthetic */ ContentValues f342411c;

    public C123964o(ContentValues contentValues, C123965p pVar, ContentValues contentValues2) {
        this.f342409a = contentValues;
        this.f342410b = pVar;
        this.f342411c = contentValues2;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        ((C58970a) this.f342410b.f342412a.mo56224b()).mo56388r("SharedValues - Rows affected: %d", bfVar.mo45931c("SharedProactiveData", this.f342409a, 5));
        ((C58970a) this.f342410b.f342412a.mo56224b()).mo56388r("ClientValues - Rows affected: %d", bfVar.mo45931c("ClientProactiveData", this.f342411c, 5));
    }
}
