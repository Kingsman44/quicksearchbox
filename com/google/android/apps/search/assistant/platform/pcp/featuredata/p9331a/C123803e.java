package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9331a;

import android.content.ContentValues;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3897e.p3921j.abe;
import com.google.assistant.p3994s.p3995a.C53306j;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.a.e */
/* compiled from: PG */
public final /* synthetic */ class C123803e implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ ContentValues f342001a;

    /* renamed from: b */
    public final /* synthetic */ abe f342002b;

    /* renamed from: c */
    public final /* synthetic */ String f342003c;

    /* renamed from: d */
    public final /* synthetic */ long f342004d;

    public /* synthetic */ C123803e(ContentValues contentValues, abe abe, String str, long j) {
        this.f342001a = contentValues;
        this.f342002b = abe;
        this.f342003c = str;
        this.f342004d = j;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        ContentValues contentValues = this.f342001a;
        abe abe = this.f342002b;
        String str = this.f342003c;
        long j = this.f342004d;
        bfVar.mo45931c("SharedProactiveData", contentValues, 5);
        if (abe.equals(abe.UPDATE)) {
            C124124j.m203548b(C53306j.BLUECHIP_SMARTSPACE_TNG, str, 100010, (C48952az) null, true, j, bfVar);
        } else {
            C124124j.m203548b(C53306j.BLUECHIP_SMARTSPACE_TNG, str, 100010, (C48952az) null, false, j, bfVar);
        }
    }
}
