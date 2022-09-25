package com.google.android.apps.search.soundsearch.p10660g.p10661a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62960cg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.soundsearch.g.a.h */
/* compiled from: PG */
public final /* synthetic */ class C141678h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141679i f384533a;

    /* renamed from: b */
    public final /* synthetic */ float[] f384534b;

    public /* synthetic */ C141678h(C141679i iVar, float[] fArr) {
        this.f384533a = iVar;
        this.f384534b = fArr;
    }

    public final void run() {
        C141679i iVar = this.f384533a;
        float[] fArr = this.f384534b;
        C141680j jVar = iVar.f384535a;
        C141684n nVar = jVar.f384542g;
        int b = C141683m.m229903b(nVar.f384549b);
        if (b != 0 && b == 2) {
            C141681k kVar = (C141681k) nVar.toBuilder();
            kVar.copyOnWrite();
            ((C141684n) kVar.instance).f384550c = C141684n.emptyFloatList();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 15; i++) {
                arrayList.add(Float.valueOf(fArr[i]));
            }
            kVar.copyOnWrite();
            C141684n nVar2 = (C141684n) kVar.instance;
            C62960cg cgVar = nVar2.f384550c;
            if (!cgVar.mo58948c()) {
                nVar2.f384550c = C62942bv.mutableCopy(cgVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) nVar2.f384550c);
            jVar.mo116650a((C141684n) kVar.build());
        }
    }
}
