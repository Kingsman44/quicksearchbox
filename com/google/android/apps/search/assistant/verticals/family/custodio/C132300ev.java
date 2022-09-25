package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.widget.Checkable;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ev */
/* compiled from: PG */
public final class C132300ev {

    /* renamed from: a */
    public final ArrayList f361090a = new ArrayList();

    /* renamed from: a */
    public final void mo110599a(Checkable checkable) {
        ArrayList arrayList = this.f361090a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Checkable checkable2 = (Checkable) arrayList.get(i);
            if (!checkable.equals(checkable2)) {
                checkable2.setChecked(false);
            }
        }
    }
}
