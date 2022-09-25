package com.google.ads.interactivemedia.p367v3.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ab */
/* compiled from: PG */
public final class C6781ab implements C7433y {

    /* renamed from: a */
    private final int[] f20170a = new int[2];

    /* renamed from: a */
    public final JSONObject mo14301a(View view) {
        if (view == null) {
            return C6789ah.m18700b(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f20170a);
        int[] iArr = this.f20170a;
        return C6789ah.m18700b(iArr[0], iArr[1], width, height);
    }

    /* renamed from: b */
    public final void mo14302b(View view, JSONObject jSONObject, C7406x xVar, boolean z) {
        int i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                HashMap hashMap = new HashMap();
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i3));
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (true) {
                        i = i3 + 1;
                        if (i4 >= size2) {
                            break;
                        }
                        xVar.mo15162a((View) arrayList3.get(i4), this, jSONObject);
                        i4++;
                    }
                    i3 = i;
                }
                return;
            }
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                xVar.mo15162a(viewGroup.getChildAt(i5), this, jSONObject);
            }
        }
    }
}
