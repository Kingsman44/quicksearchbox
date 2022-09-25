package com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b;

import android.content.ContentValues;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.b.j */
/* compiled from: PG */
final class C133962j implements C42844bc {

    /* renamed from: a */
    final /* synthetic */ List f364883a;

    public C133962j(List list) {
        this.f364883a = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45922a(C42847bf bfVar) {
        List<C57246ba> list = this.f364883a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C57246ba byteArray : list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("feed_action", byteArray.toByteArray());
            contentValues.put("upload_attempt_count", 0);
            arrayList.add(Integer.valueOf((int) bfVar.mo45931c("action_table", contentValues, 5)));
        }
        return arrayList;
    }
}
