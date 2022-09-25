package com.google.android.libraries.mdi.download.p2236d;

import android.util.Pair;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29333dq;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29035b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.mdi.download.d.bn */
/* compiled from: PG */
public final /* synthetic */ class C28899bn implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78491a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f78492b;

    /* renamed from: c */
    public final /* synthetic */ C29035b f78493c;

    public /* synthetic */ C28899bn(C29117fe feVar, C58485gu guVar, C29035b bVar) {
        this.f78491a = feVar;
        this.f78492b = guVar;
        this.f78493c = bVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78491a;
        C58485gu guVar = this.f78492b;
        C29035b bVar = this.f78493c;
        C29334dr drVar = (C29334dr) ((Pair) obj).second;
        C29333dq dqVar = (C29333dq) drVar.toBuilder();
        dqVar.copyOnWrite();
        ((C29334dr) dqVar.instance).f79512n = C29334dr.emptyProtobufList();
        HashMap hashMap = new HashMap();
        for (C29328dl dlVar : drVar.f79512n) {
            hashMap.put(dlVar.f79473b, dlVar);
        }
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C29328dl dlVar2 = (C29328dl) guVar.get(i);
            hashMap.put(dlVar2.f79473b, dlVar2);
        }
        dqVar.mo34654a(hashMap.values());
        C29334dr drVar2 = (C29334dr) dqVar.build();
        bVar.mo34556c(drVar2);
        C60870cx l = feVar.mo34589l(drVar2);
        C29084ey eyVar = new C29084ey(drVar2);
        return C60922j.m93045h(l, C47810es.m84966f(eyVar), feVar.f78980i);
    }
}
