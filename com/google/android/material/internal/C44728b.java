package com.google.android.material.internal;

import android.view.View;
import com.google.android.material.chip.C44597g;
import com.google.android.material.chip.C44600j;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.material.internal.b */
/* compiled from: PG */
public final class C44728b {

    /* renamed from: a */
    public final Map f116584a = new HashMap();

    /* renamed from: b */
    public final Set f116585b = new HashSet();

    /* renamed from: c */
    public boolean f116586c;

    /* renamed from: d */
    public boolean f116587d;

    /* renamed from: e */
    public C44597g f116588e;

    /* renamed from: a */
    public final int mo48036a() {
        if (!this.f116586c || this.f116585b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f116585b.iterator().next()).intValue();
    }

    /* renamed from: b */
    public final Set mo48037b() {
        return new HashSet(this.f116585b);
    }

    /* renamed from: c */
    public final void mo48038c() {
        C44597g gVar = this.f116588e;
        if (gVar != null) {
            mo48037b();
            ChipGroup chipGroup = gVar.f116181a;
            C44600j jVar = chipGroup.f116113b;
            if (jVar != null) {
                Set b = chipGroup.f116114c.mo48037b();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < chipGroup.getChildCount(); i++) {
                    View childAt = chipGroup.getChildAt(i);
                    if ((childAt instanceof C44757q) && b.contains(Integer.valueOf(childAt.getId()))) {
                        arrayList.add(Integer.valueOf(childAt.getId()));
                    }
                }
                jVar.mo47791a(chipGroup, arrayList);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo48039d(C44757q qVar) {
        int id = qVar.getId();
        Set set = this.f116585b;
        Integer valueOf = Integer.valueOf(id);
        if (set.contains(valueOf)) {
            return false;
        }
        C44757q qVar2 = (C44757q) this.f116584a.get(Integer.valueOf(mo48036a()));
        if (qVar2 != null) {
            mo48040e(qVar2, false);
        }
        boolean add = this.f116585b.add(valueOf);
        if (!qVar.isChecked()) {
            qVar.setChecked(true);
        }
        return add;
    }

    /* renamed from: e */
    public final boolean mo48040e(C44757q qVar, boolean z) {
        int id = qVar.getId();
        Set set = this.f116585b;
        Integer valueOf = Integer.valueOf(id);
        if (!set.contains(valueOf)) {
            return false;
        }
        if (!z || this.f116585b.size() != 1 || !this.f116585b.contains(valueOf)) {
            boolean remove = this.f116585b.remove(valueOf);
            if (qVar.isChecked()) {
                qVar.setChecked(false);
            }
            return remove;
        }
        qVar.setChecked(true);
        return false;
    }
}
