package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import android.database.Cursor;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60856cj;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.v */
/* compiled from: PG */
final class C11621v implements C60804al {

    /* renamed from: a */
    final /* synthetic */ C11622w f37566a;

    public C11621v(C11622w wVar) {
        this.f37566a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        C69664n.m101061g(atVar, "<anonymous parameter 0>");
        if (cursor != null) {
            cursor.getCount();
            int columnIndex = cursor.getColumnIndex("CarConnectionState");
            if (columnIndex < 0) {
                C59052c cVar = (C59052c) C11622w.f37568b.mo56226d();
                cVar.mo56379ah(new C59094n(43379));
                cVar.mo56386p("Missing connection type");
            }
            if (!cursor.moveToNext()) {
                C59052c cVar2 = (C59052c) C11622w.f37568b.mo56226d();
                cVar2.mo56379ah(new C59094n(43378));
                cVar2.mo56386p("Empty connection response");
            }
            int i = cursor.getInt(columnIndex);
            C11622w wVar = this.f37566a;
            C11620u uVar = new C11620u(wVar, i);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(uVar), wVar.f37573e), "failed to update connection state", new Object[0]);
        }
        return C69788q.f186170a;
    }
}
