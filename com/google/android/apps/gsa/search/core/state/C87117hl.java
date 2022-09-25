package com.google.android.apps.gsa.search.core.state;

import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.state.hl */
/* compiled from: PG */
public final class C87117hl {

    /* renamed from: a */
    private final String[] f235370a = new String[250];

    public C87117hl(C58485gu guVar) {
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C87141ii a = ((C87143ik) guVar.get(i)).mo80512a();
            this.f235370a[a.f235452J] = a.getClass().getSimpleName();
        }
    }

    /* renamed from: a */
    public final List mo80745a(BitSet bitSet) {
        ArrayList arrayList = new ArrayList(250);
        int i = 0;
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i);
            if (nextSetBit < 0) {
                return arrayList;
            }
            String str = this.f235370a[nextSetBit];
            if (str != null) {
                arrayList.add(str);
            } else {
                arrayList.add(Integer.toString(nextSetBit));
            }
            i = nextSetBit + 1;
        }
    }
}
