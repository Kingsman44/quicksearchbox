package com.google.android.apps.gsa.staticplugins.p7404aq.p7405a;

import com.google.android.apps.gsa.shared.util.C90759bc;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.aq.a.e */
/* compiled from: PG */
public final class C94047e extends C94048f {

    /* renamed from: a */
    public final ArrayList f262697a = new ArrayList();

    /* renamed from: a */
    public final Collection mo88313a() {
        int length;
        if (!this.f262697a.isEmpty()) {
            int i = ((C94049g) this.f262697a.get(0)).f262701c;
            ArrayList arrayList = this.f262697a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                C94049g gVar = (C94049g) arrayList.get(i2);
                int i3 = gVar.f262701c;
                double pow = Math.pow(0.5d, Math.min((double) gVar.f262702d, 1.5552E10d) / 8.64E8d);
                double d = (double) i3;
                Double.isNaN(d);
                double d2 = (double) i;
                Double.isNaN(d2);
                gVar.f262703e = (pow + ((d + 1.0d) / (d2 + 1.0d))) * 0.5d;
                i2++;
                arrayList = arrayList;
            }
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = this.f262697a;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C94049g gVar2 = (C94049g) arrayList2.get(i4);
            C90759bc c = C90759bc.m148249c(C94048f.m155250b(C94048f.m155250b(gVar2.f262700b)));
            ArrayList arrayList3 = new ArrayList();
            C58570jy.m90163o(arrayList3, c);
            String[] strArr = (String[]) C58557jl.m90142w(arrayList3, String.class);
            if (strArr != null && (length = strArr.length) != 0) {
                gVar2.mo88314a(strArr[0], gVar2.f262703e, hashMap);
                if (length > 1) {
                    gVar2.mo88314a(strArr[length - 1], gVar2.f262703e, hashMap);
                    gVar2.mo88314a(C94049g.f262699a.mo56097d(Arrays.asList(strArr)), gVar2.f262703e, hashMap);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(hashMap.values());
        Collections.sort(arrayList4, new C94046d());
        if (!arrayList4.isEmpty()) {
            int size3 = arrayList4.size();
            double d3 = C59203do.f157270a;
            for (int i5 = 0; i5 < size3; i5++) {
                double d4 = ((C94052j) arrayList4.get(i5)).f262715d;
                if (d4 > d3) {
                    d3 = d4;
                }
            }
            int size4 = arrayList4.size();
            for (int i6 = 0; i6 < size4; i6++) {
                C94052j jVar = (C94052j) arrayList4.get(i6);
                jVar.f262715d = Math.ceil(((jVar.f262715d / d3) - 4092432.744448d) / 0.25d) * 0.25d;
            }
        }
        return arrayList4;
    }
}
