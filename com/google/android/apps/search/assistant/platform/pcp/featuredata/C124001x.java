package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import android.content.ContentValues;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3897e.p3921j.abe;
import com.google.assistant.p3994s.p3995a.C53306j;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.x */
/* compiled from: PG */
public final /* synthetic */ class C124001x implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ ContentValues f342490a;

    /* renamed from: b */
    public final /* synthetic */ abe f342491b;

    /* renamed from: c */
    public final /* synthetic */ String f342492c;

    /* renamed from: d */
    public final /* synthetic */ long f342493d;

    public /* synthetic */ C124001x(ContentValues contentValues, abe abe, String str, long j) {
        this.f342490a = contentValues;
        this.f342491b = abe;
        this.f342492c = str;
        this.f342493d = j;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        ContentValues contentValues = this.f342490a;
        abe abe = this.f342491b;
        String str = this.f342492c;
        long j = this.f342493d;
        bfVar.mo45931c("SharedProactiveData", contentValues, 5);
        if (abe.equals(abe.UPDATE)) {
            C124124j.m203548b(C53306j.BLUECHIP_SMARTSPACE_TNG, str, 100012, (C48952az) null, true, j, bfVar);
        } else {
            C124124j.m203548b(C53306j.BLUECHIP_SMARTSPACE_TNG, str, 100012, (C48952az) null, false, j, bfVar);
        }
    }
}
