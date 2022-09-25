package com.google.android.libraries.lens.view.textoverlay;

import android.util.SparseArray;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24146d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.y */
/* compiled from: PG */
public final class C28092y {

    /* renamed from: a */
    public final /* synthetic */ C28093z f76447a;

    public C28092y(C28093z zVar) {
        this.f76447a = zVar;
    }

    /* renamed from: a */
    public final SparseArray mo33549a() {
        SparseArray sparseArray = new SparseArray(this.f76447a.f76460m.size());
        for (int i = 0; i < this.f76447a.f76460m.size(); i++) {
            sparseArray.put(this.f76447a.f76460m.keyAt(i), (C24146d) this.f76447a.f76460m.valueAt(i));
        }
        return sparseArray;
    }

    /* renamed from: b */
    public final C58485gu mo33550b(int i, int i2) {
        C58480gp e = C58485gu.m89837e();
        while (i <= i2) {
            C24146d dVar = (C24146d) this.f76447a.f76460m.get(i);
            if (dVar != null) {
                e.mo55395g(dVar);
            }
            i++;
        }
        return e.mo55394f();
    }
}
