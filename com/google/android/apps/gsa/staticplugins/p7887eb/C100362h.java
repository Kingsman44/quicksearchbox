package com.google.android.apps.gsa.staticplugins.p7887eb;

import com.google.android.play.core.p3525a.C45025a;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.h */
/* compiled from: PG */
public final /* synthetic */ class C100362h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f280654a;

    public /* synthetic */ C100362h(int i) {
        this.f280654a = i;
    }

    public final Object apply(Object obj) {
        Integer num;
        int i = this.f280654a;
        C45025a aVar = (C45025a) obj;
        boolean z = false;
        if (!(aVar == null || (num = aVar.f117645b) == null || num.intValue() < i)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
