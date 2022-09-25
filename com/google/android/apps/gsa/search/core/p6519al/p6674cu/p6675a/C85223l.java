package com.google.android.apps.gsa.search.core.p6519al.p6674cu.p6675a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6674cu.C85211a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.al.cu.a.l */
/* compiled from: PG */
public final class C85223l extends C86731k {

    /* renamed from: c */
    private final List f230988c;

    /* renamed from: d */
    private final String f230989d;

    /* renamed from: e */
    private final int f230990e;

    /* renamed from: f */
    private final LinkedHashMap f230991f;

    public C85223l(List list, String str, int i, LinkedHashMap linkedHashMap) {
        super("searchplate", "searchplate::updateSearchPlateVoiceSearchLanguagePicker", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_VOICE);
        this.f230988c = list;
        this.f230989d = str;
        this.f230990e = i;
        this.f230991f = linkedHashMap;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85211a) obj).mo78801l(this.f230988c, this.f230989d, this.f230990e, this.f230991f);
        return C118826c.f331423b;
    }
}
