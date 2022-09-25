package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C27834q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f75902a;

    public /* synthetic */ C27834q(C58495hd hdVar) {
        this.f75902a = hdVar;
    }

    public final Object call() {
        C58495hd hdVar = this.f75902a;
        C58490gz gzVar = new C58490gz(4);
        C58800sl lA = hdVar.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            try {
                C58833ax axVar = (C58833ax) C60856cj.m92909r((Future) entry.getValue());
                if (axVar.mo56113h()) {
                    gzVar.mo55429h((String) entry.getKey(), (C27830m) axVar.mo56107c());
                }
            } catch (ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        return gzVar.mo55427f(false);
    }
}
