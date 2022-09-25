package com.google.android.libraries.onegoogle.owners.p2386a;

import com.google.android.libraries.onegoogle.owners.C30976k;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.h */
/* compiled from: PG */
public final /* synthetic */ class C30949h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f83387a;

    public /* synthetic */ C30949h(String str) {
        this.f83387a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f83387a;
        C58485gu guVar = (C58485gu) obj;
        int i = C30950i.f83388b;
        int size = guVar.size();
        int i2 = 0;
        while (i2 < size) {
            C30976k kVar = (C30976k) guVar.get(i2);
            i2++;
            if (str.equals(kVar.mo36650a())) {
                return kVar;
            }
        }
        return null;
    }
}
