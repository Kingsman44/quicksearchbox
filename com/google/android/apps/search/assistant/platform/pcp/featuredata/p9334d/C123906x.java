package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123750bq;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.android.gms.reminders.model.Task;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.x */
/* compiled from: PG */
public final class C123906x {

    /* renamed from: a */
    public static final long f342251a = TimeUnit.HOURS.toMillis(24);

    /* renamed from: b */
    public final C21370a f342252b;

    public C123906x(C21370a aVar) {
        this.f342252b = aVar;
    }

    /* renamed from: a */
    public static C123751br m203206a(Task task) {
        C123750bq bqVar = (C123750bq) C123751br.f341826e.createBuilder();
        String G = task.mo122067G();
        bqVar.copyOnWrite();
        C123751br brVar = (C123751br) bqVar.instance;
        G.getClass();
        brVar.f341828a |= 2;
        brVar.f341830c = G;
        long longValue = task.mo122063C().longValue();
        bqVar.copyOnWrite();
        C123751br brVar2 = (C123751br) bqVar.instance;
        brVar2.f341828a |= 1;
        brVar2.f341829b = longValue;
        String h = task.mo122077n().mo122058h();
        bqVar.copyOnWrite();
        C123751br brVar3 = (C123751br) bqVar.instance;
        h.getClass();
        brVar3.f341828a |= 8;
        brVar3.f341831d = h;
        return (C123751br) bqVar.build();
    }
}
