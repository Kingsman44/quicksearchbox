package com.google.android.libraries.lens.common.text.selection.p2009ui;

import java.util.Comparator;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.f */
/* compiled from: PG */
final class C24165f implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C24167h hVar = (C24167h) obj;
        C24167h hVar2 = (C24167h) obj2;
        int compare = Float.compare(hVar.mo29606c(), hVar2.mo29606c());
        return compare == 0 ? Float.compare(hVar2.f66038b, hVar.f66038b) : compare;
    }
}
