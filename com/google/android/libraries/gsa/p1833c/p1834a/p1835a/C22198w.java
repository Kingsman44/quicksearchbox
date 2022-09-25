package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90745b;
import com.google.common.p4552o.C60326oj;
import com.google.common.p4552o.C60327ok;

/* renamed from: com.google.android.libraries.gsa.c.a.a.w */
/* compiled from: PG */
final class C22198w extends C22194s {
    public C22198w() {
        super(20, 10);
    }

    /* renamed from: a */
    public final /* synthetic */ long mo27397a(Object obj) {
        return ((C22197v) obj).f61277a.getTime();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo27398b(Object obj) {
        C22197v vVar = (C22197v) obj;
        C60326oj ojVar = (C60326oj) C60327ok.f163257e.createBuilder();
        long time = vVar.f61277a.getTime();
        ojVar.copyOnWrite();
        C60327ok okVar = (C60327ok) ojVar.instance;
        okVar.f163259a |= 1;
        okVar.f163260b = time;
        int i = vVar.f61278b.f61281c;
        ojVar.copyOnWrite();
        C60327ok okVar2 = (C60327ok) ojVar.instance;
        okVar2.f163259a |= 2;
        okVar2.f163261c = i;
        int i2 = vVar.f61278b.f61282d;
        ojVar.copyOnWrite();
        C60327ok okVar3 = (C60327ok) ojVar.instance;
        okVar3.f163259a |= 4;
        okVar3.f163262d = i2;
        return (C60327ok) ojVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo27399f(Object obj, C91006f fVar) {
        C22197v vVar = (C22197v) obj;
        vVar.f61278b.mo27451g(fVar.mo85279c(C90745b.m148220a(vVar.f61277a)));
    }
}
