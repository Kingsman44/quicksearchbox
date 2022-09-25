package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.ab */
/* compiled from: PG */
final class C88757ab implements Comparator {

    /* renamed from: a */
    final /* synthetic */ C88758ac f240105a;

    /* renamed from: b */
    private final boolean f240106b;

    public C88757ab(C88758ac acVar, boolean z) {
        this.f240105a = acVar;
        this.f240106b = z;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        if (this.f240106b) {
            if (this.f240105a.f240112f.f240144x.get(num.intValue(), -2) != -2 && this.f240105a.f240112f.f240144x.get(num2.intValue(), -2) != -2) {
                return this.f240105a.f240112f.f240144x.get(num.intValue()) - this.f240105a.f240112f.f240144x.get(num2.intValue());
            }
            if (this.f240105a.f240112f.f240144x.get(num.intValue(), -2) != -2) {
                return -1;
            }
            if (this.f240105a.f240112f.f240144x.get(num2.intValue(), -2) != -2) {
                return 1;
            }
        }
        return num.intValue() - num2.intValue();
    }
}
