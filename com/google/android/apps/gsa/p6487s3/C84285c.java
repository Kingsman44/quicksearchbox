package com.google.android.apps.gsa.p6487s3;

import android.content.ContentValues;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.android.apps.gsa.s3.c */
/* compiled from: PG */
final class C84285c extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C84286d f229363a;

    public C84285c(C84286d dVar) {
        this.f229363a = dVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C66607ce ceVar = (C66607ce) obj;
        if (ceVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            ContentValues contentValues = new ContentValues();
            contentValues.put("S3Request", ceVar.toByteArray());
            C84286d dVar = this.f229363a;
            dVar.f229367d.insert(dVar.f229368e, contentValues);
        }
    }
}
