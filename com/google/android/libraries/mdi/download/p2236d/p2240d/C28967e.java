package com.google.android.libraries.mdi.download.p2236d.p2240d;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.mdi.download.d.d.e */
/* compiled from: PG */
public final /* synthetic */ class C28967e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28983u f78671a;

    /* renamed from: b */
    public final /* synthetic */ long f78672b;

    public /* synthetic */ C28967e(C28983u uVar, long j) {
        this.f78671a = uVar;
        this.f78672b = j;
    }

    public final C60870cx apply(Object obj) {
        C28983u uVar = this.f78671a;
        Long valueOf = Long.valueOf(this.f78672b);
        Object obj2 = (Set) ((Map) obj).get(valueOf);
        if (obj2 == null) {
            obj2 = C58733pz.f156496a;
        }
        return uVar.mo34526d(C58495hd.m89900n(valueOf, obj2));
    }
}
