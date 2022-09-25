package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.common.base.C58817ah;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.af */
/* compiled from: PG */
public final /* synthetic */ class C123833af implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f342092a;

    /* renamed from: b */
    public final /* synthetic */ Instant f342093b;

    public /* synthetic */ C123833af(Instant instant, Instant instant2) {
        this.f342092a = instant;
        this.f342093b = instant2;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f342092a;
        Instant instant2 = this.f342093b;
        ArrayList arrayList = new ArrayList();
        for (C123787p pVar : (List) obj) {
            Instant ofEpochSecond = Instant.ofEpochSecond(pVar.f341954e);
            Instant ofEpochSecond2 = Instant.ofEpochSecond(pVar.f341955f);
            if (ofEpochSecond.isBefore(instant) && ofEpochSecond2.isAfter(instant2)) {
                arrayList.add(pVar);
            }
        }
        return arrayList;
    }
}
