package com.google.android.libraries.search.integrations.p3022f.p3023a;

import androidx.work.C4632m;
import androidx.work.C4643x;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4572r.C60466b;
import com.google.common.p4552o.p4572r.C60468d;

/* renamed from: com.google.android.libraries.search.integrations.f.a.c */
/* compiled from: PG */
public final /* synthetic */ class C38515c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C38517e f101875a;

    /* renamed from: b */
    public final /* synthetic */ C60466b f101876b;

    public /* synthetic */ C38515c(C38517e eVar, C60466b bVar) {
        this.f101875a = eVar;
        this.f101876b = bVar;
    }

    public final Object apply(Object obj) {
        C38517e eVar = this.f101875a;
        C60466b bVar = this.f101876b;
        Throwable th = (Throwable) obj;
        C59052c cVar = (C59052c) ((C59052c) C38517e.f101878a.mo56225c()).mo56372aa(53116);
        int b = C60468d.m92593b(bVar.f163640b);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        String a = C60468d.m92592a(b);
        int b2 = C38514b.m67763b(bVar.f163641c);
        if (b2 != 0) {
            i = b2;
        }
        cVar.mo56354G("WorkManager failed operation: %s, worker tag: %s", a, C38514b.m67762a(i));
        eVar.mo41451c(bVar);
        return new C4643x(C4632m.f14549a);
    }
}
