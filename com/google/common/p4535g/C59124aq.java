package com.google.common.p4535g;

import com.google.common.base.C58817ah;
import com.google.common.p4575r.C60763t;
import java.util.List;

/* renamed from: com.google.common.g.aq */
/* compiled from: PG */
public final /* synthetic */ class C59124aq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f157128a;

    public /* synthetic */ C59124aq(List list) {
        this.f157128a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f157128a;
        C59226t tVar = (C59226t) obj;
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int a = C60763t.m92764a(((C59125ar) list.get(i2)).mo56438a(), tVar.f157334b);
            if (a > 0) {
                i2--;
            } else if (a < 0) {
                i = i2 + 1;
            } else if (i == i2) {
                return Integer.valueOf(i2);
            }
            size = i2;
        }
        return Integer.valueOf(i);
    }
}
