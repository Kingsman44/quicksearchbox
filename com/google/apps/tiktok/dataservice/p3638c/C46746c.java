package com.google.apps.tiktok.dataservice.p3638c;

import android.support.p033v7.widget.C0640fb;
import com.google.common.base.C58815af;
import java.util.List;

/* renamed from: com.google.apps.tiktok.dataservice.c.c */
/* compiled from: PG */
public final class C46746c implements C46745b {
    /* renamed from: a */
    public final void mo50766a(List list, List list2, C58815af afVar, C0640fb fbVar) {
        int size = list.size();
        int size2 = list2.size();
        int min = Math.min(size, size2);
        int i = 0;
        while (i < min) {
            if (!afVar.mo56077d(list.get(i), list2.get(i))) {
                int i2 = i + 1;
                while (i2 < min && !afVar.mo56077d(list.get(i2), list2.get(i2))) {
                    i2++;
                }
                int i3 = i2 - i;
                fbVar.mObservable.mo2883e(i, i3);
                fbVar.mObservable.mo2882d(i, i3);
                i = i2;
            }
            i++;
        }
        if (size > min) {
            fbVar.mObservable.mo2883e(min, size - min);
        }
        if (size2 > min) {
            fbVar.mObservable.mo2882d(min, size2 - min);
        }
    }
}
