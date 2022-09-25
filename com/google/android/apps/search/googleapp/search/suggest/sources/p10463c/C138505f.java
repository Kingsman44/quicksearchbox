package com.google.android.apps.search.googleapp.search.suggest.sources.p10463c;

import android.database.Cursor;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.ArrayList;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.c.f */
/* compiled from: PG */
final class C138505f implements C60804al {

    /* renamed from: a */
    final /* synthetic */ C69626l f376741a;

    public C138505f(C69626l lVar) {
        this.f376741a = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        C69664n.m101061g(atVar, "closer");
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {
                    arrayList.add(this.f376741a.mo5761a(cursor));
                } while (cursor.moveToNext());
            }
            return arrayList;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
