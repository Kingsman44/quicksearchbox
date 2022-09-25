package com.google.android.apps.gsa.search.core.p6519al.p6526ac.p6527a;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ac.a.m */
/* compiled from: PG */
public final class C84637m extends C86731k {

    /* renamed from: c */
    private final int f230288c;

    /* renamed from: d */
    private final Bitmap f230289d;

    /* renamed from: e */
    private final String f230290e;

    public C84637m(int i, Bitmap bitmap, String str) {
        super("customtabs", "customtabs::updateSaveActionButtonIcon", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230288c = i;
        this.f230289d = bitmap;
        this.f230290e = str;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84624a) obj).mo78395p(this.f230288c, this.f230289d, this.f230290e);
        return C118826c.f331423b;
    }
}
