package com.google.android.apps.gsa.now.shared.p6421ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.i */
/* compiled from: PG */
public final class C83420i {

    /* renamed from: a */
    public final SparseArray f227391a = new SparseArray();

    /* renamed from: b */
    public final SparseIntArray f227392b = new SparseIntArray();

    /* renamed from: c */
    public static final C83419h m132813c(View view) {
        return (C83419h) view.getTag(R.id.recyclerviewpool_viewholder);
    }

    /* renamed from: d */
    private final ArrayList m132814d(int i) {
        ArrayList arrayList = (ArrayList) this.f227391a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f227391a.put(i, arrayList);
            if (this.f227392b.indexOfKey(i) < 0) {
                this.f227392b.put(i, 5);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C83419h mo76754a(int i) {
        ArrayList d = m132814d(i);
        if (d.isEmpty()) {
            return null;
        }
        int size = d.size() - 1;
        C83419h hVar = (C83419h) d.get(size);
        d.remove(size);
        return hVar;
    }

    /* renamed from: b */
    public final void mo76755b(C83419h hVar) {
        if (hVar.f227389a.getParent() == null) {
            int i = hVar.f227390b;
            ArrayList d = m132814d(i);
            if (this.f227392b.get(i) > d.size()) {
                d.add(hVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Attached views may not be recycled.");
    }
}
