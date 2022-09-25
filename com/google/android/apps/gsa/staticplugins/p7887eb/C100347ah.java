package com.google.android.apps.gsa.staticplugins.p7887eb;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import p5451f.p5452a.p5453a.p5454a.C69413bh;
import p5451f.p5452a.p5453a.p5454a.C69420bo;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.ah */
/* compiled from: PG */
public final /* synthetic */ class C100347ah implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C69420bo f280608a;

    public /* synthetic */ C100347ah(C69420bo boVar) {
        this.f280608a = boVar;
    }

    public final Object apply(Object obj) {
        C69420bo boVar = this.f280608a;
        Integer num = (Integer) obj;
        boolean z = false;
        int i = -1;
        if (num.intValue() != -1) {
            int intValue = num.intValue();
            C62995dn dnVar = boVar.f185740c;
            if (dnVar.containsKey("feedLowEngagingThreshold")) {
                C69413bh bhVar = (C69413bh) dnVar.get("feedLowEngagingThreshold");
                if (bhVar.f185726a == 1) {
                    i = ((Integer) bhVar.f185727b).intValue();
                }
                if (intValue <= i) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return Boolean.valueOf(z);
    }
}
