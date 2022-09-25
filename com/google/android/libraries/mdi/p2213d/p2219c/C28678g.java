package com.google.android.libraries.mdi.p2213d.p2219c;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.C143875g;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28617e;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.C28634af;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.libraries.storage.protostore.C43015r;
import com.google.android.libraries.storage.protostore.C43018u;
import com.google.common.base.C58833ax;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.d.c.g */
/* compiled from: PG */
public final class C28678g {
    /* renamed from: a */
    public static C28682k m53563a(Context context, Executor executor, C42813k kVar, C42880af afVar, C58833ax axVar, C58833ax axVar2) {
        C43015r rVar = new C43015r();
        rVar.f112484a = context.getApplicationContext();
        rVar.f112486c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
        rVar.f112485b = C28676e.f77942a;
        rVar.f112487d = (Handler) axVar.mo56108d(C28674d.f77941a);
        C43018u uVar = new C43018u(rVar);
        C143875g gVar = C143875g.f389987a;
        return new C28634af(context, executor, "AGSA", kVar, afVar, new C28617e(context), new C28677f(), (C21370a) axVar2.mo56109e(new C21375e()), uVar);
    }
}
