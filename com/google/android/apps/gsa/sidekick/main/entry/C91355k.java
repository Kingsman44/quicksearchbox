package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7642eo;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.k */
/* compiled from: PG */
public final /* synthetic */ class C91355k implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ Callable f254916a;

    public /* synthetic */ C91355k(Callable callable) {
        this.f254916a = callable;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Callable callable = this.f254916a;
        C7642eo eoVar = (C7642eo) obj;
        if (eoVar == null) {
            return (C60870cx) callable.call();
        }
        return C60856cj.m92900i(eoVar);
    }
}
