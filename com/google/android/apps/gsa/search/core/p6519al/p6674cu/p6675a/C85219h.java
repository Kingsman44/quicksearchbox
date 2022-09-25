package com.google.android.apps.gsa.search.core.p6519al.p6674cu.p6675a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6674cu.C85211a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cu.a.h */
/* compiled from: PG */
public final class C85219h extends C86731k {

    /* renamed from: c */
    private final int f230979c;

    /* renamed from: d */
    private final String f230980d;

    /* renamed from: e */
    private final String f230981e;

    public C85219h(int i, String str, String str2) {
        super("searchplate", "searchplate::updateSearchPlateUiFlags", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_TEXT);
        this.f230979c = i;
        this.f230980d = str;
        this.f230981e = str2;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85211a) obj).mo78797h(this.f230979c, this.f230980d, this.f230981e);
        return C118826c.f331423b;
    }
}
