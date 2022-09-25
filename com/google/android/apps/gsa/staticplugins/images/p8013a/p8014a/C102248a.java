package com.google.android.apps.gsa.staticplugins.images.p8013a.p8014a;

import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.staticplugins.images.p8013a.C102254d;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.a.a.a */
/* compiled from: PG */
public final class C102248a extends C86731k {

    /* renamed from: c */
    private final String f285304c;

    /* renamed from: d */
    private final int f285305d;

    /* renamed from: e */
    private final List f285306e;

    public C102248a(String str, int i, List list) {
        super("images", "images::fetchAsyncMetadata", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f285304c = str;
        this.f285305d = i;
        this.f285306e = list;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C102254d) obj).mo93041c(this.f285304c, this.f285305d, this.f285306e);
    }
}
