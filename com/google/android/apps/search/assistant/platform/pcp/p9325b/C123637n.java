package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.content.ContentValues;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123732az;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124089bo;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.n */
/* compiled from: PG */
public final /* synthetic */ class C123637n implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C123610ac f341566a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f341567b;

    /* renamed from: c */
    public final /* synthetic */ Map.Entry f341568c;

    public /* synthetic */ C123637n(C123610ac acVar, C53306j jVar, Map.Entry entry) {
        this.f341566a = acVar;
        this.f341567b = jVar;
        this.f341568c = entry;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        C123610ac acVar = this.f341566a;
        C53306j jVar = this.f341567b;
        Map.Entry entry = this.f341568c;
        long b = acVar.f341530c.mo26870b();
        int intValue = C124089bo.m203513a(Integer.valueOf(((C123744bk) entry.getKey()).f341810e)).intValue();
        String str = ((C123744bk) entry.getKey()).f341812g;
        C123732az azVar = (C123732az) entry.getValue();
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_type", Integer.valueOf(jVar.f139793X));
        contentValues.put("data_type", Integer.valueOf(intValue));
        contentValues.put("data_id", str);
        contentValues.put("last_query_timestamp", Long.valueOf(b));
        contentValues.put("data_hash", azVar.toByteArray());
        C59104x b2 = C123610ac.f341528a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "PCP.Database");
        ((C59052c) ((C59052c) b2).mo56372aa(35182)).mo56389s("dataHash at insert %s", azVar);
        bfVar.mo45931c("LastClientDataQuery", contentValues, 5);
    }
}
