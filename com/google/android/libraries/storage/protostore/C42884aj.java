package com.google.android.libraries.storage.protostore;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4877b.p4878a.C63710u;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.storage.protostore.aj */
/* compiled from: PG */
public final /* synthetic */ class C42884aj implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42905ba f112194a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f112195b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f112196c;

    /* renamed from: d */
    public final /* synthetic */ AtomicBoolean f112197d;

    /* renamed from: e */
    public final /* synthetic */ AtomicLong f112198e;

    public /* synthetic */ C42884aj(C42905ba baVar, C60870cx cxVar, C60870cx cxVar2, AtomicBoolean atomicBoolean, AtomicLong atomicLong) {
        this.f112194a = baVar;
        this.f112195b = cxVar;
        this.f112196c = cxVar2;
        this.f112197d = atomicBoolean;
        this.f112198e = atomicLong;
    }

    public final C60870cx apply(Object obj) {
        C42905ba baVar = this.f112194a;
        C60870cx cxVar = this.f112195b;
        C60870cx cxVar2 = this.f112196c;
        AtomicBoolean atomicBoolean = this.f112197d;
        AtomicLong atomicLong = this.f112198e;
        List list = (List) obj;
        MessageLite messageLite = (MessageLite) C60856cj.m92909r(cxVar);
        C63710u uVar = (C63710u) C60856cj.m92909r(cxVar2);
        if (atomicBoolean.get()) {
            return C60866ct.f164955a;
        }
        return baVar.f112246a.mo45991g(C47810es.m84966f(new C42885ak(baVar, messageLite, uVar, atomicLong)), C60826bg.f164896a, C42966db.f112377o);
    }
}
