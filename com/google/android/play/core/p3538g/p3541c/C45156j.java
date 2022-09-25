package com.google.android.play.core.p3538g.p3541c;

import android.app.PendingIntent;
import com.google.android.play.core.p3538g.C45113a;
import com.google.android.play.core.p3538g.C45122ah;
import com.google.android.play.core.p3538g.C45137aw;
import com.google.android.play.core.p3538g.C45179n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.play.core.g.c.j */
/* compiled from: PG */
public final /* synthetic */ class C45156j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C45137aw f117875a;

    /* renamed from: b */
    public final /* synthetic */ C45122ah f117876b;

    public /* synthetic */ C45156j(C45137aw awVar, C45122ah ahVar) {
        this.f117875a = awVar;
        this.f117876b = ahVar;
    }

    public final Object call() {
        C45137aw awVar = this.f117875a;
        C45122ah ahVar = this.f117876b;
        long j = C45160n.f117884a;
        if (awVar == null || awVar.mo48973m()) {
            return new C45113a(awVar == null ? 1 : 1 + awVar.mo48946b(), 1, 0, 0, 0, ahVar.f117807a, new ArrayList(), (PendingIntent) null, (List) null);
        }
        throw new C45179n(-1);
    }
}
