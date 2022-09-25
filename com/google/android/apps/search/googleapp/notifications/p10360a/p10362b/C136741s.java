package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import android.content.ContentValues;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.s */
/* compiled from: PG */
final class C136741s implements C42846be {

    /* renamed from: a */
    final /* synthetic */ C136747y f372216a;

    /* renamed from: b */
    final /* synthetic */ String f372217b;

    /* renamed from: c */
    final /* synthetic */ long f372218c;

    public C136741s(C136747y yVar, String str, long j) {
        this.f372216a = yVar;
        this.f372217b = str;
        this.f372218c = j;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        ContentValues contentValues = new ContentValues();
        C136747y yVar = this.f372216a;
        String str = this.f372217b;
        long j = this.f372218c;
        contentValues.put(yVar.f372237b, str);
        contentValues.put(yVar.f372238c, Long.valueOf(j));
        bfVar.mo45931c(this.f372216a.f372236a, contentValues, 5);
    }
}
