package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import androidx.work.C4631l;
import androidx.work.C4632m;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36267f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cw */
/* compiled from: PG */
public final /* synthetic */ class C114458cw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317360a;

    /* renamed from: b */
    public final /* synthetic */ C36267f f317361b;

    /* renamed from: c */
    public final /* synthetic */ long f317362c;

    public /* synthetic */ C114458cw(C114464db dbVar, C36267f fVar, long j) {
        this.f317360a = dbVar;
        this.f317361b = fVar;
        this.f317362c = j;
    }

    public final C60870cx apply(Object obj) {
        C114464db dbVar = this.f317360a;
        C36267f fVar = this.f317361b;
        long j = this.f317362c;
        AccountId accountId = (AccountId) obj;
        C46578l lVar = dbVar.f317378D;
        byte[] byteArray = fVar.toByteArray();
        C46582p j2 = C46586t.m83063j(C114398at.class);
        HashMap hashMap = new HashMap();
        C4631l.m13032c("dismiss_params", byteArray, hashMap);
        C4632m a = C4631l.m13030a(hashMap);
        C46570d dVar = (C46570d) j2;
        dVar.f121755d = a;
        dVar.f121754c = new C46573g(j, TimeUnit.MILLISECONDS);
        return lVar.mo50546b(j2.mo50561a());
    }
}
