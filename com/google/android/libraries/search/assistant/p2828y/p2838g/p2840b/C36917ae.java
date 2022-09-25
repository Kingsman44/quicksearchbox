package com.google.android.libraries.search.assistant.p2828y.p2838g.p2840b;

import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36908b;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36909c;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2844d.C36949b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58322at;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.assistant.y.g.b.ae */
/* compiled from: PG */
public final /* synthetic */ class C36917ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36918af f96118a;

    /* renamed from: b */
    public final /* synthetic */ C36910d f96119b;

    public /* synthetic */ C36917ae(C36918af afVar, C36910d dVar) {
        this.f96118a = afVar;
        this.f96119b = dVar;
    }

    public final Object apply(Object obj) {
        C36918af afVar = this.f96118a;
        C36910d dVar = this.f96119b;
        if (((C36949b) obj) != C36949b.APPROVED) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (afVar.f96123a) {
            for (C36908b bVar : ((C58322at) afVar.f96124b).mo54986h(dVar)) {
                if (afVar.f96125c.containsKey(bVar)) {
                    arrayList.add((C36909c) afVar.f96125c.get(bVar));
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            afVar.f96126d.execute(C47810es.m84977q(new C36916ad((C36909c) arrayList.get(i), dVar)));
        }
        return null;
    }
}
