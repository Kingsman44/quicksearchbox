package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import android.content.ContentValues;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.p4283bv.p4345d.C57025d;
import com.google.p4283bv.p4345d.C57033l;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.g */
/* compiled from: PG */
final class C136729g implements C42846be {

    /* renamed from: a */
    final /* synthetic */ byte[] f372181a;

    /* renamed from: b */
    final /* synthetic */ C57033l f372182b;

    public C136729g(byte[] bArr, C57033l lVar) {
        this.f372181a = bArr;
        this.f372182b = lVar;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        ContentValues contentValues = new ContentValues();
        byte[] bArr = this.f372181a;
        C57033l lVar = this.f372182b;
        contentValues.put("action_bytes", bArr);
        C57025d dVar = lVar.f152265c;
        if (dVar == null) {
            dVar = C57025d.f152240e;
        }
        contentValues.put("timestamp_seconds", Long.valueOf(dVar.f152245d));
        bfVar.mo45931c("actions", contentValues, 5);
    }
}
