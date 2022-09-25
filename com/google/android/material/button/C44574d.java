package com.google.android.material.button;

import java.util.Comparator;

/* renamed from: com.google.android.material.button.d */
/* compiled from: PG */
final class C44574d implements Comparator {

    /* renamed from: a */
    final /* synthetic */ MaterialButtonToggleGroup f116013a;

    public C44574d(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f116013a = materialButtonToggleGroup;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        MaterialButton materialButton = (MaterialButton) obj;
        MaterialButton materialButton2 = (MaterialButton) obj2;
        int compareTo = Boolean.valueOf(materialButton.f115973f).compareTo(Boolean.valueOf(materialButton2.f115973f));
        if (compareTo == 0 && (compareTo = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()))) == 0) {
            return Integer.valueOf(this.f116013a.indexOfChild(materialButton)).compareTo(Integer.valueOf(this.f116013a.indexOfChild(materialButton2)));
        }
        return compareTo;
    }
}
