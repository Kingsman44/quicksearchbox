package com.google.android.libraries.storage.protostore;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.storage.protostore.o */
/* compiled from: PG */
public final /* synthetic */ class C43012o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C43018u f112472a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f112473b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f112474c;

    /* renamed from: d */
    public final /* synthetic */ Integer f112475d;

    public /* synthetic */ C43012o(C43018u uVar, C60870cx cxVar, C60870cx cxVar2, Integer num) {
        this.f112472a = uVar;
        this.f112473b = cxVar;
        this.f112474c = cxVar2;
        this.f112475d = num;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C43018u uVar = this.f112472a;
        C60870cx cxVar = this.f112473b;
        C60870cx cxVar2 = this.f112474c;
        Integer num = this.f112475d;
        Uri uri = (Uri) C60856cj.m92909r(cxVar);
        Set<String> set = (Set) C60856cj.m92909r(cxVar2);
        C43017t tVar = new C43017t(set);
        for (String str : set) {
            Intent intent = new Intent();
            intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
            intent.setData(uri);
            intent.setPackage(str);
            intent.setFlags(268435456);
            uVar.f112496b.sendOrderedBroadcast(intent, (String) null, tVar, uVar.f112498d, -1, (String) null, (Bundle) null);
        }
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Class<TimeoutException> cls = TimeoutException.class;
        C60870cx g = C60846c.m92878g((C60838bs) C60856cj.m92908q(C60838bs.m92859i(tVar.f112492a), (long) num.intValue(), uVar.f112499e, (ScheduledExecutorService) null), cls, new C43011n(atomicBoolean), C60826bg.f164896a);
        C60856cj.m92911t(g, new C43014q(uVar, atomicBoolean, set, d, tVar, num), C60826bg.f164896a);
        return g;
    }
}
