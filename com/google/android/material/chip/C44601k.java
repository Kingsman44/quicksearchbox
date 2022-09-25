package com.google.android.material.chip;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.material.internal.C44701a;
import com.google.android.material.internal.C44728b;

/* renamed from: com.google.android.material.chip.k */
/* compiled from: PG */
final class C44601k implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    public ViewGroup.OnHierarchyChangeListener f116184a;

    /* renamed from: b */
    final /* synthetic */ ChipGroup f116185b;

    public C44601k(ChipGroup chipGroup) {
        this.f116185b = chipGroup;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (view == this.f116185b && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(C2043bi.m5574c());
            }
            C44728b bVar = this.f116185b.f116114c;
            Chip chip = (Chip) view2;
            bVar.f116584a.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                bVar.mo48039d(chip);
            }
            chip.mo47670J(new C44701a(bVar));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f116184a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f116185b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            C44728b bVar = chipGroup.f116114c;
            Chip chip = (Chip) view2;
            chip.mo47670J((C44701a) null);
            bVar.f116584a.remove(Integer.valueOf(chip.getId()));
            bVar.f116585b.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f116184a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
