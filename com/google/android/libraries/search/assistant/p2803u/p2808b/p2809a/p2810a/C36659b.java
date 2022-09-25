package com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2810a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a.C63144b;
import com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a.C63145c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.u.b.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C36659b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f95526a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f95527b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f95528c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f95529d;

    /* renamed from: e */
    public final /* synthetic */ int f95530e;

    public /* synthetic */ C36659b(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, int i) {
        this.f95526a = cxVar;
        this.f95527b = cxVar2;
        this.f95528c = cxVar3;
        this.f95529d = cxVar4;
        this.f95530e = i;
    }

    public final Object call() {
        C60870cx cxVar = this.f95526a;
        C60870cx cxVar2 = this.f95527b;
        C60870cx cxVar3 = this.f95528c;
        C60870cx cxVar4 = this.f95529d;
        int i = this.f95530e;
        ArrayList arrayList = new ArrayList();
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        if (booleanValue) {
            arrayList.add("OobeAccountFragment");
        }
        if (!booleanValue && ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
            arrayList.add("OobeOmniconsentFragment");
        }
        if (!booleanValue && ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue()) {
            arrayList.add("OobeVoiceMatchFragment");
        }
        if (!booleanValue && ((Boolean) C60856cj.m92909r(cxVar4)).booleanValue()) {
            arrayList.add("OnboardingGetMoreFragment");
        }
        C63144b bVar = (C63144b) C63145c.f170514c.createBuilder();
        bVar.copyOnWrite();
        C63145c cVar = (C63145c) bVar.instance;
        if (i != 1) {
            cVar.f170516a = i - 2;
            bVar.copyOnWrite();
            C63145c cVar2 = (C63145c) bVar.instance;
            C62971cq cqVar = cVar2.f170517b;
            if (!cqVar.mo58948c()) {
                cVar2.f170517b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) cVar2.f170517b);
            return (C63145c) bVar.build();
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
