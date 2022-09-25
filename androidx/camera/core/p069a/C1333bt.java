package androidx.camera.core.p069a;

import androidx.camera.camera2.p063b.C1094aq;
import androidx.camera.core.C1568r;
import androidx.core.p097i.C1974i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.a.bt */
/* compiled from: PG */
public final class C1333bt implements C1568r {

    /* renamed from: b */
    public final int f3815b;

    public C1333bt(int i) {
        this.f3815b = i;
    }

    /* renamed from: a */
    public final /* synthetic */ C1322bi mo4208a() {
        return C1568r.f4295a;
    }

    /* renamed from: b */
    public final List mo4209b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1094aq aqVar = (C1094aq) it.next();
            C1974i.m5314b(aqVar instanceof C1094aq, "The camera info doesn't contain internal implementation.");
            Integer a = aqVar.mo3844a();
            if (a != null && a.intValue() == this.f3815b) {
                arrayList.add(aqVar);
            }
        }
        return arrayList;
    }
}
