package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.j */
/* compiled from: PG */
public final /* synthetic */ class C98219j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C98224o f274242a;

    /* renamed from: b */
    public final /* synthetic */ String f274243b;

    /* renamed from: c */
    public final /* synthetic */ AtomicLong f274244c;

    /* renamed from: d */
    public final /* synthetic */ int f274245d;

    public /* synthetic */ C98219j(C98224o oVar, String str, AtomicLong atomicLong, int i) {
        this.f274242a = oVar;
        this.f274243b = str;
        this.f274244c = atomicLong;
        this.f274245d = i;
    }

    public final Object apply(Object obj) {
        C98224o oVar = this.f274242a;
        String str = this.f274243b;
        AtomicLong atomicLong = this.f274244c;
        int i = this.f274245d;
        C98215f fVar = (C98215f) obj;
        C62995dn dnVar = fVar.f274238a;
        long j = 0;
        long longValue = dnVar.containsKey(str) ? ((Long) dnVar.get(str)).longValue() : 0;
        if (longValue == 0) {
            ((C118831d) oVar.f274253c.mo6453a()).mo104025g(1);
        } else {
            j = longValue;
        }
        atomicLong.set(j);
        C98214e eVar = (C98214e) fVar.toBuilder();
        long j2 = j + ((long) i);
        eVar.copyOnWrite();
        C98215f fVar2 = (C98215f) eVar.instance;
        C62995dn dnVar2 = fVar2.f274238a;
        if (!dnVar2.f170058b) {
            fVar2.f274238a = dnVar2.mo58980a();
        }
        fVar2.f274238a.put(str, Long.valueOf(j2));
        return (C98215f) eVar.build();
    }
}
