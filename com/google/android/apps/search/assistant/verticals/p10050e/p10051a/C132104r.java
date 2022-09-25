package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import android.content.ContentValues;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.r */
/* compiled from: PG */
public final /* synthetic */ class C132104r implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ int f360494a;

    public /* synthetic */ C132104r(int i) {
        this.f360494a = i;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        int i = this.f360494a;
        bfVar.mo45935i("CREATE INDEX IF NOT EXISTS _query_index ON deeplinks (query)");
        ContentValues contentValues = new ContentValues();
        contentValues.put("version", Integer.valueOf(i));
        bfVar.mo45931c("version", contentValues, 4);
    }
}
