package com.google.research.p5181a.p5182a;

import com.google.research.p5181a.p5188f.C66376a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.research.a.a.b */
/* compiled from: PG */
public final class C66279b {
    /* renamed from: a */
    public static List m96854a(C66278a aVar, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = aVar.f180248b;
        while (true) {
            i2--;
            if (i2 < 0) {
                return arrayList;
            }
            C66376a aVar2 = (C66376a) aVar.mo59448a(i2);
            if (aVar2.mo59463f() == i) {
                arrayList.add(aVar2);
            }
        }
    }
}
